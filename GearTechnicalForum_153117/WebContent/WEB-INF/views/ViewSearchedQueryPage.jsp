<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
			<form:form action="updateAction" method="post" modelAttribute="queryMaster">

				<tr>
					<td><form:label path="query_id"> Query Id</form:label></td>
					<td><form:input path="query_id" size="30" /></td>
					<td><form:errors path="query_id" cssClass="error" /></td>
				</tr>
					<tr>
					<td><form:label path="technology">Select Technology</form:label></td>
					<td><form:input path="technology" size="30" /></td>
					<td><form:errors path="technology" cssClass="error" /></td>
				</tr>
					<tr>
					<td><form:label path="query_raised_by"> Question Raised By</form:label></td>
					<td><form:input path="query_raised_by" size="30" /></td>
					<td><form:errors path="query_raised_by" cssClass="error" /></td>
				</tr>
				</tr>
					</tr>
					<tr>
					<td><form:label path="query"> Question</form:label></td>
					<td><form:input path="query" size="30" /></td>
					<td><form:errors path="query" cssClass="error" /></td>
				</tr>
				
				
						<tr>
					<td><form:label path="solutions"> Solution</form:label></td>
					<td><form:input path="solutions" size="30" /></td>
					<td><form:errors path="solutions" cssClass="error" /></td>
				</tr>
			
			
			<tr>
			<td><form:label path="solution_given_by">Answered By</form:label></td>
			<td>
			<form:select path="solution_given_by">
			<form:option value ="Please Select"></form:option>
			<form:option value ="Amith">Amith</form:option>
			<form:option value ="Shruthi">Shruthi</form:option>
			<form:option value ="Swetha">Swetha</form:option>
			</form:select>
			</td>
			</tr>

				<tr>
					<td><input type="submit" value="Update Query"></td>
				</tr>
			</form:form>
		</table>
</body>
</html>