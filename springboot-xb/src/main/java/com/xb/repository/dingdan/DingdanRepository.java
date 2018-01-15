package com.xb.repository.dingdan;

import com.xb.entity.Clientele;
import com.xb.entity.Dingdan;
import com.xb.entity.Fengkongs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DingdanRepository extends JpaRepository<Dingdan, Long> {

//    @Query("select dingdan FROM  Dingdan dingdan  JOIN  dingdan.clientele clientele JOIN dingdan.product product JOIN dingdan.qudao qudao   where dingdan.status =:status  ")
//    List<Dingdan> findBydingStatus(@Param("status") String status );
//    @Query("select count(dingdan) FROM  Dingdan dingdan  JOIN  dingdan.clientele clientele JOIN dingdan.product product JOIN dingdan.qudao qudao   where dingdan.status =:status")
//    long queryTotal(@Param("status") String status);

    @Query("select dingdan FROM  Dingdan dingdan left  JOIN  dingdan.clientele clientele left JOIN dingdan.product product left JOIN dingdan.qudao qudao   where dingdan.status =:status  ")
    Page<Dingdan> findList(@Param("status") String status, Pageable pageable);
    @Query("select dingdan FROM  Dingdan dingdan left  JOIN  dingdan.clientele clientele left JOIN dingdan.product product left JOIN dingdan.qudao qudao   where dingdan.status =:status and dingdan.dingdancount like %:make or clientele.username like %:make or qudao.qudaocode like %:make or product.productname like %:make ")
    Page<Dingdan> findLists(@Param("status")String status, @Param("make")String make, Pageable pageable);
    @Query("select dingdan FROM  Dingdan dingdan left  JOIN  dingdan.clientele clientele left JOIN dingdan.product product left JOIN dingdan.qudao qudao left JOIN dingdan.fengkongs fengkongs   where dingdan.dingdanid =:dingdanid  ")
    List<Dingdan> findbuda(@Param("dingdanid")long dingdanid);
}