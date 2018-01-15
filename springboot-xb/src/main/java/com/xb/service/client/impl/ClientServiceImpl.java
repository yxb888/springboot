package com.xb.service.client.impl;

import com.xb.entity.Clientele;
import com.xb.repository.client.ClientRepository;
import com.xb.service.client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/3.
 */
@Service

public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;
    @Cacheable(value="clientele-findALLkey")
    public Map<String,Object> findALL(String make, int page, int rows) {
        Sort sort = new Sort(Sort.Direction.DESC, "userid");
        Pageable pageable = new PageRequest(page-1, rows,sort);
//        Page<Clientele> userList =  clientRepository.findAll(pageable);
        String status="1";
        Page<Clientele> userList =  clientRepository.findByStatus(status,pageable);
        if(make!=null&&!make.equals("")){
            userList=   clientRepository.findByUsernameOrProductNameOrYewuyuanAndStatus(make,make,make,status,pageable);

        }
        Map<String, Object> map = new HashMap<>();
        map.put("total",userList.getTotalElements());
        map.put("rows",userList.getContent());
        System.out.println("不走缓存");
        return map;

    }

    public Clientele editClient(long userid) {

        return  clientRepository.findByUserid(userid);
    }


    @CacheEvict(cacheNames= "clientele-findALLkey",allEntries =true)
    public void saveClient(Clientele clientele) {
        clientRepository.saveAndFlush(clientele);
    }

    @CacheEvict(cacheNames= "clientele-findALLkey",allEntries =true)
    public void saveinsertClient(Clientele clientele) {
        clientRepository.save(clientele);
    }

    @Cacheable(value="clientele-findblackALLkey")
    public Map<String, Object> clientheifindAll(String make, int page, int rows) {
        Sort sort = new Sort(Sort.Direction.DESC, "userid");
        Pageable pageable = new PageRequest(page-1, rows,sort);
        String status="2";
        Page<Clientele> userList =  clientRepository.findByStatus(status,pageable);
        if(make!=null&&!make.equals("")){
            userList=   clientRepository.findByUsernameAndStatus(make,status,pageable);

        }
        Map<String, Object> map = new HashMap<>();
        map.put("total",userList.getTotalElements());
        map.put("rows",userList.getContent());
        System.out.println("不走缓存");
        return map;

    }


}
