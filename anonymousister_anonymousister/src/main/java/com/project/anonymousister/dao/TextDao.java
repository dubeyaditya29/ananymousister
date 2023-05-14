package com.project.anonymousister.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.anonymousister.models.TextModel;

public interface TextDao extends JpaRepository<TextModel, Integer>{

}
