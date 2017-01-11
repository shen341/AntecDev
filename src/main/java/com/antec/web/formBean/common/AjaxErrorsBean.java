/**
 * 
 */
package com.antec.web.formBean.common;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;

/**
 * @author shenzhaohong
 *
 */
@Data
public class AjaxErrorsBean {
	
	private boolean hasError=true;
	private String forwardUrl=StringUtils.EMPTY;
	private List<FiledErrorBean> filedErrorBeans;

}
