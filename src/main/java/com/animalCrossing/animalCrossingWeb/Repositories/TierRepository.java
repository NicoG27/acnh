package com.animalCrossing.animalCrossingWeb.Repositories;

import com.animalCrossing.animalCrossingWeb.Entity.TiereEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TierRepository extends JpaRepository<TiereEntity, Integer> {


    @Query("SELECT t FROM TiereEntity t WHERE :monat <= t.monatbis AND :monat >= t.monatvon")
    List<TiereEntity> findByMonatAndTime(@Param("monat") int monat);
}
