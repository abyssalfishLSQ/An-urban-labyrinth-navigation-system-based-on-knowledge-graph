package com.example.demo.repository;

import com.example.demo.model.TimeEntity;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TimeRepository extends Neo4jRepository<TimeEntity, Long> {
    /**
     * 根据时间ID查找时间
     * @param timeId
     * @return 天气
     */
    @Query("MATCH (n) WHERE n.timeId = :#{#timeId} return n")
    TimeEntity findByTimeEntityId(Integer timeId);

    /**
     * 根据时间名称查找时间
     * @param TimeName
     * @return 天气
     */
    @Query("MATCH (time:Time)\n" +
            "WHERE toLower(time.TimeName) CONTAINS :#{#TimeName}\n" +
            "RETURN time")
    List<TimeEntity> findByTimeName(@Param("TimeName") String TimeName);
    @Query("MATCH (time:Time)\n" +
            "RETURN time")
    List<TimeEntity> findAllTime();
}
