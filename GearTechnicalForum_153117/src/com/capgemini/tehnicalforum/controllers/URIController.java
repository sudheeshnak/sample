package com.capgemini.tehnicalforum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.tehnicalforum.beans.QueryMaster;

@Controller
public class URIController {

	@RequestMapping(value="/")
	public String getloginPage() {
		return "indexPage";
	}
	
	@ModelAttribute("queryMaster")
	public QueryMaster getQueryForum() {
		return new QueryMaster();
	}
	
	@RequestMapping(value="/ViewSearchedQueryPage")
	public String getretrieveQueryPage() {
		return "ViewSearchedQueryPage";
	}
	
	@RequestMapping(value="/updateSuccess")
	public String getUpdateSuccessPage() {
		return "updateSuccess";
		
	}
	
	@RequestMapping(value="/updateFailure")
	public String getUpdateFailure() {
		return "updateFailure";
		
	}

}
