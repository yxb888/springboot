package com.xb.repository.product;

import com.xb.entity.Dingdan;
import com.xb.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProdctorRepository extends JpaRepository<Product, Long> {

//    @Query("select dingdan FROM  Dingdan dingdan  JOIN  dingdan.clientele clientele JOIN dingdan.product product JOIN dingdan.qudao qudao   where dingdan.status =:status  ")
//    List<Dingdan> findBydingStatus(@Param("status") String status );
//    @Query("select count(dingdan) FROM  Dingdan dingdan  JOIN  dingdan.clientele clientele JOIN dingdan.product product JOIN dingdan.qudao qudao   where dingdan.status =:status")
//    long queryTotal(@Param("status") String status);
}