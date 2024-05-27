package com.example.demo.repository;

import com.example.demo.model.CauseEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CauseRepository extends Neo4jRepository<CauseEntity,Long>{

    @Query("MATCH (n:Cause) WHERE n.causeId = :#{#causeId} " +
            "return n")
    CauseEntity findByCauseEntityId(Integer causeId);

//根据特定原因查找节点
    @Query("MATCH (n:Cause) WHERE n.CauseName = :#{#CauseName} return n")
    List<CauseEntity> findByCauseName(@Param("CauseName") String CauseName);

    @Query("MATCH (cause:Cause)\n" +
            "RETURN cause")
    List<CauseEntity> findAllCause();

}









