package com.example.demo.repository;

import com.example.demo.model.ProvinceEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProvinceRepository extends Neo4jRepository<ProvinceEntity,Long> {

    @Query("MATCH (province:Province)\n" +
            "WHERE toLower(province.ProvinceName) CONTAINS :#{#ProvinceName}\n" +
            "RETURN  province")
    List<ProvinceEntity> findByProvinceName(@Param("ProvinceName") String ProvinceName);

    @Query("MATCH (province:Province)\n" +
            "RETURN province")
    List<ProvinceEntity> findAllProvince();
}
