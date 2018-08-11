package com.capgemini.tehnicalforum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.tehnicalforum.beans.QueryMaster;
import com.capgemini.tehnicalforum.dao.TechnicalForumdao;
import com.capgemini.tehnicalforum.services.TechnicalForumservice;

@Controller
public class QueryActionController {

	@Autowired
	TechnicalForumservice service;
	
	@Autowired
	TechnicalForumdao dao;
	
	@RequestMapping(value="/searchQuery")
	public ModelAndView retrieveQuery(@RequestParam("query_id") int queryId) {
		QueryMaster queryMaster= service.retrive(queryId);
		if(queryMaster != null)
			return new ModelAndView("ViewSearchedQueryPage","queryMaster",queryMaster);
		else
			return new ModelAndView("updateFailure","queryMaster",queryMaster);
			
	}
	@RequestMapping(value="/updateAction")
	public ModelAndView updateQuery(@ModelAttribute("queryMaster") QueryMaster queryMaster) {
		dao.save(queryMaster);
		return new ModelAndView("updateSuccess", "queryMaster",queryMaster);
		}

	
}
