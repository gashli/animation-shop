package com.bnool.anishop.services.front.comment.dao;import com.bnool.anishop.core.DaoManager;import com.bnool.anishop.services.front.comment.bean.Comment;public interface CommentDao extends DaoManager<Comment> {	int selectCount(String orderid);}