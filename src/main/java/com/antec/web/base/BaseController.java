/**
 * 
 */
package com.antec.web.base;

import org.springframework.ui.Model;

import com.antec.model.bean.RibbonDataBean;

/**
 * @author shenzhaohong
 *
 */
public class BaseController {
	
	private final static String MENU_NAME="menuName";
	
	protected void setNaviMenuTreeName(Model model,RibbonDataBean ribbonDataBean) {
		model.addAttribute(MENU_NAME, ribbonDataBean);
	}

}
