package com.capgemini.tehnicalforum.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.tehnicalforum.beans.QueryMaster;

public interface TechnicalForumdao extends JpaRepository<QueryMaster, Integer>{

}
