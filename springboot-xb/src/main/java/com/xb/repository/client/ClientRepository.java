package com.xb.repository.client;

import com.xb.entity.Clientele;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientRepository extends JpaRepository<Clientele, Long> {


    Page<Clientele> findByUsernameOrProductNameOrYewuyuan(String username, String productName, String yewuyuan, Pageable pageable);

    Clientele findByUserid(long userid);

    Page<Clientele> findByStatus(String status, Pageable pageable);


    Page<Clientele> findByUsernameAndStatus(String make, String status, Pageable pageable);

    Page<Clientele> findByUsernameOrProductNameOrYewuyuanAndStatus(String make, String make1, String make2, String status, Pageable pageable);


}