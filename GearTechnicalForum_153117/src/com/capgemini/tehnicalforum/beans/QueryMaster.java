package com.capgemini.tehnicalforum.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class QueryMaster {

	@Id
	private int query_id;
	private String technology;
	private String query_raised_by;
	private String query;
	private String solutions;
	private String solution_given_by;
	public int getQuery_id() {
		return query_id;
	}
	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public String getQuery_raised() {
		return query_raised_by;
	}
	public void setQuery_raised(String query_raised) {
		this.query_raised_by = query_raised;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public String getSolutions() {
		return solutions;
	}
	public void setSolutions(String solutions) {
		this.solutions = solutions;
	}
	public String getSolution_given_by() {
		return solution_given_by;
	}
	public void setSolution_given_by(String solution_given_by) {
		this.solution_given_by = solution_given_by;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + query_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QueryMaster other = (QueryMaster) obj;
		if (query_id != other.query_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "QueryMaster [query_id=" + query_id + ", technology=" + technology + ", query_raised=" + query_raised_by
				+ ", query=" + query + ", solutions=" + solutions + ", solution_given_by=" + solution_given_by + "]";
	}
	public QueryMaster(int query_id, String technology, String query_raised, String query, String solutions,
			String solution_given_by) {
		super();
		this.query_id = query_id;
		this.technology = technology;
		this.query_raised_by = query_raised;
		this.query = query;
		this.solutions = solutions;
		this.solution_given_by = solution_given_by;
	}
	public QueryMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QueryMaster(int query_id) {
		super();
		this.query_id = query_id;
	}
	
	

}
