package com.mithilesh.example.repository;

import com.mithilesh.example.entity.ThemeParkRide;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThemeParkRideRepo extends CrudRepository<ThemeParkRide, Long> {
    List<ThemeParkRide> findByName(String name);
}
