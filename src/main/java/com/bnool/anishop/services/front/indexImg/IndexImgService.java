/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.bnool.anishop.services.front.indexImg;

import com.bnool.anishop.core.Services;
import com.bnool.anishop.services.front.indexImg.bean.IndexImg;

import java.util.List;


/**
 * @author huangf
 */
public interface IndexImgService extends Services<IndexImg> {

	/**
	 * 加载图片显示到门户
	 * @param i
	 */
	List<IndexImg> getImgsShowToIndex(int i);

}
