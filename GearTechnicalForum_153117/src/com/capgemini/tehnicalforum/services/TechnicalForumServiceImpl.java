package com.capgemini.tehnicalforum.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.capgemini.tehnicalforum.beans.QueryMaster;
import com.capgemini.tehnicalforum.dao.TechnicalForumdao;

@Component(value="service")
public class TechnicalForumServiceImpl implements TechnicalForumservice {

	@Autowired(required=true)
	private TechnicalForumdao dao;
	
	@Override
	public QueryMaster retrive(int queryNo) {
		return dao.findOne(queryNo);
	}

}
