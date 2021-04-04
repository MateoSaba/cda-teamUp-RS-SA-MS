package com.cda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cda.model.Lieu;

public interface ILieuRepository extends JpaRepository<Lieu, Integer> {

}
