package com.xb.service.dingdan.impl;

import com.xb.entity.Clientele;
import com.xb.entity.Dingdan;
import com.xb.mapper.DingdanMapper;
import com.xb.repository.dingdan.DingdanRepository;
import com.xb.service.dingdan.DingdanService;
import com.xb.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/5.
 */
@Service
public class DingdanSeriveImpl implements DingdanService{
    @Autowired
    private DingdanRepository dingdanRepository;
    @Autowired
    private DingdanMapper dingdanMapper;

    @Override
    public Map<String, Object> findALL(String make,String status ,int page, int rows) {
        Sort sort = new Sort(Sort.Direction.DESC, "dingdanid");
        Pageable pageable = new PageRequest(page-1, rows,sort);
        Page<Dingdan> s=  dingdanRepository.findList(status,pageable);
        if(make!=null&&!make.equals("")){
            s=  dingdanRepository.findLists(status,make,pageable);

        }
        Map<String, Object> map = new HashMap<>();
        map.put("total",s.getTotalElements());
        map.put("rows",s.getContent());
        System.out.println("不走缓存");
        return map;
    }

    @Override
    public List<Dingdan> editClient(long dingdanid) {
        List<Dingdan> clientele =dingdanRepository.findbuda(dingdanid);
        return clientele;
    }

    @Override
    public void updatedingdan(Dingdan dingdan) {

        dingdanMapper.updatedingdan(dingdan);
    }
}
