package com.cydeo.repository;

import com.cydeo.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    //Display all regions in Canada

    List<Region> findByCountry(String country);

    List<Region> findDistinctFirstByCountry(String country);

    List<Region> findByCountryContaining(String country);

    List<Region> findByCountryContainingOrderByCountry(String country);

    List<Region> findTop2ByCountry(String country);

}
