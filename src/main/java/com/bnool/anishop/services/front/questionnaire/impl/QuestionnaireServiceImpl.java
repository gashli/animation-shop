package com.bnool.anishop.services.front.questionnaire.impl;import com.bnool.anishop.core.ServersManager;import com.bnool.anishop.services.front.questionnaire.QuestionnaireService;import com.bnool.anishop.services.front.questionnaire.bean.Questionnaire;import com.bnool.anishop.services.front.questionnaire.dao.QuestionnaireDao;public class QuestionnaireServiceImpl extends ServersManager<Questionnaire>		implements QuestionnaireService {	private QuestionnaireDao questionnaireDao;	public void setQuestionnaireDao(QuestionnaireDao questionnaireDao) {		this.questionnaireDao = questionnaireDao;	}		/**	 * 新增问卷	 */	@Override	public int insert(Questionnaire e) {		if(e==null){			throw new NullPointerException("e is null");		}						return super.insert(e);	}	/**	 * 修改问卷	 */	@Override	public int update(Questionnaire e) {				return super.update(e);	}}