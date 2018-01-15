package com.xb.service.dingdan;

import com.xb.entity.Clientele;
import com.xb.entity.Dingdan;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/5.
 */
public interface DingdanService {


    Map<String,Object> findALL(String make,String status, int page, int rows);

    List<Dingdan>  editClient(long dingdanid);

    void updatedingdan(Dingdan dingdan);
}
