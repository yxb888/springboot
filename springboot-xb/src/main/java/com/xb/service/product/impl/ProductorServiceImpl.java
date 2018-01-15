package com.xb.service.product.impl;

import com.xb.repository.product.ProdctorRepository;
import com.xb.service.product.ProductorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/1/11.
 */
@Service
public class ProductorServiceImpl implements ProductorService {
    @Autowired
    private ProdctorRepository prodctorRepository;

}
