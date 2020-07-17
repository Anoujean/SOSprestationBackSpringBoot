package com.mdiSoft.sosPrestation.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdiSoft.sosPrestation.entities.*;

@Repository
public interface ArtisanRepository extends JpaRepository<Artisan, Integer>{

}
