package com.cda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.model.Rencontre;

public interface IRencontreRepository extends JpaRepository<Rencontre, Integer> {

}
