<%@page import="com.bnool.anishop.core.oscache.FrontCache"%>
<%@page import="com.bnool.anishop.core.oscache.ManageCache"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="com.bnool.anishop.core.ManageContainer"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%
WebApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
//FrontCache frontCache = (FrontCache) app.getBean("frontCache");
ManageCache manageCache = (ManageCache) app.getBean("manageCache");
//frontCache.loadAllCache();
manageCache.loadAllCache();
out.println("加载数据成功！");
%>
