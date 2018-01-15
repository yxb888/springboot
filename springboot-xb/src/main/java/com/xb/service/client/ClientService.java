package com.xb.service.client;

import com.xb.entity.Clientele;

import java.util.Map;

/**
 * Created by Administrator on 2018/1/3.
 */
public interface ClientService {


    Map<String,Object> findALL(String make, int page, int rows);

    Clientele editClient(long userid);

    void saveClient(Clientele clientele);

    void saveinsertClient(Clientele clientele);

    Map<String,Object> clientheifindAll(String make, int page, int rows);
}
