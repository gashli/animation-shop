<%@page import="com.bnool.anishop.services.front.email.bean.Email"%>
<%@page import="com.bnool.anishop.core.util.TokenUtil"%>
<%@page import="com.bnool.anishop.services.front.catalog.bean.Catalog"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@page import="com.opensymphony.xwork2.ActionContext"%>
<%@page import="org.apache.commons.lang.StringUtils"%>
<%@page import="java.util.*"%>
<%@page import="com.bnool.anishop.services.front.news.bean.News"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="/resource/common_html_meat.jsp"%>
<%@ include file="/resource/common_css.jsp"%>
</head>

<body>
	<%@ include file="/indexMenu.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-xs-3">
				<%@ include file="userLeft.jsp"%>
			</div>
			
			<div class="col-xs-9">
				<div class="row">
					<div class="col-xs-12">
						<ol class="breadcrumb">
						  <li>个人资料</li>
						  <li class="active">修改邮箱</li>
						</ol>
					</div>
				</div>
				
				<div class="row">
					<div class="col-xs-12" style="font-size: 14px;font-weight: normal;">
						<span class="label label-default" style="font-size:100%;">
							1.填写账户信息
						</span>
						&nbsp;<span class="glyphicon glyphicon-circle-arrow-right"></span>
						<span class="label label-default" style="font-size:100%;">
							2.身份验证
						</span>
						&nbsp;<span class="glyphicon glyphicon-circle-arrow-right"></span>
						<span class="label label-success" style="font-size:100%;">
							3.完成
						</span>
					</div>
				</div>
				<hr>
				
				<div class="row">
					<div class="col-xs-12" style="font-size: 14px;font-weight: normal;">
						<div class="panel panel-default">
				              <div class="panel-body" style="font-size: 16px;font-weight: normal;text-align: center;">
				              	  <div class="panel-body" style="font-size: 16px;font-weight: normal;">
									<s:if test="#request.reset_password_email_timeout.status.equals(\"n\")">
										<span class="glyphicon glyphicon-ok"></span>
										<span class="text-success"><s:property value="#request.reset_password_email_timeout.pageMsg"/></span>
									</s:if>
									<s:else>
										<span class="glyphicon glyphicon-warning-sign"></span>
										<span class="text-success"><s:property value="#request.reset_password_email_timeout.pageMsg"/></span>
									</s:else>
					              </div>
				              </div>
						</div>
						<hr>
					</div>
				</div>
			</div>
		</div>
	</div>
	
<%@ include file="/foot.jsp"%>
<%@ include file="/resource/common_html_validator.jsp"%>
<script type="text/javascript">
$(function() {
});
</script>
</body>
</html>
