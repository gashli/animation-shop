package com.bnool.anishop.services.front.questionnaireItem;import com.bnool.anishop.core.Services;import com.bnool.anishop.services.front.questionnaireItem.bean.QuestionnaireItem;import java.util.List;public interface QuestionnaireItemService extends Services<QuestionnaireItem> {	void insertList(List<QuestionnaireItem> itemList);}