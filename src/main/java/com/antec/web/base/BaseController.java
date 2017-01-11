/**
 * 
 */
package com.antec.web.base;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

import com.antec.constant.SystemCodeEnum;
import com.antec.model.bean.RibbonDataBean;
import com.antec.web.formBean.common.AjaxErrorsBean;
import com.antec.web.formBean.common.FiledErrorBean;

/**
 * @author shenzhaohong
 *
 */
public class BaseController {
	
	@Autowired
	private MessageSource messageSource;
	
	private final static String MENU_NAME="menuName";
	/**
	 *  set menu name
	 * 
	 * @param model
	 * @param ribbonDataBean
	 */
	protected void setNaviMenuTreeName(Model model,RibbonDataBean ribbonDataBean) {
		model.addAttribute(MENU_NAME, ribbonDataBean);
	}
	
	/**
	 *  set validate error prepare  ajax info
	 * 
	 * @param bindingResult
	 * @param ajaxErrorsBean
	 */
	protected void setAjaxErrorsInfo(BindingResult bindingResult,AjaxErrorsBean ajaxErrorsBean,Locale locale) {
		List<FiledErrorBean> filedErrorBeans=new ArrayList<>();
		
		//field errors
		List<FieldError> fieldErrors = bindingResult.getFieldErrors();
		for (FieldError fieldError : fieldErrors) {
			FiledErrorBean filedErrorBean=new FiledErrorBean();
			
			String fieldName
				=messageSource.getMessage(fieldError.getObjectName() + "." + fieldError.getField(), null,"NOT FOUND", locale);
			filedErrorBean.setFieldName(fieldName);
			
			String message = "";
			List<String> patternListStr = Arrays.asList(fieldError.getCodes());
			if (patternListStr.contains(SystemCodeEnum.AJAX_PATTERN_ERR.getCode())) {
				for (String string : patternListStr) {
					String string2 = messageSource.getMessage(string, null, new Locale("cn", ""));
					if (string2 != null) {
						message = fieldName + SystemCodeEnum.AJAX_FIELD_MESSAGE_SPACE.getCode() + string2;
						break;
					}
				}
			} else {
				message = fieldName + SystemCodeEnum.AJAX_FIELD_MESSAGE_SPACE.getCode()
						+ fieldError.getDefaultMessage();
			}

			filedErrorBean.setMessage(message);
			filedErrorBeans.add(filedErrorBean);
			
		}
		
		// gobal error
		List<ObjectError> gObjectErrors = bindingResult.getGlobalErrors();
				for (ObjectError objectError : gObjectErrors) {
					FiledErrorBean filedErrorBean = new FiledErrorBean();
					filedErrorBean.setFieldName(objectError.getObjectName());
					filedErrorBean.setMessage(objectError.getDefaultMessage());
					filedErrorBeans.add(filedErrorBean);
				}
				ajaxErrorsBean.setFiledErrorBeans(filedErrorBeans);

			}

		
	}

