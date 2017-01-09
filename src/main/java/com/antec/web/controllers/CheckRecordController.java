/**
 * 
 */
package com.antec.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.antec.model.bean.RibbonDataBean;
import com.antec.web.base.BaseController;
import com.antec.web.formBean.UncheckDetailFormBean;

/**
 * @author shenzhaohong
 *
 */
@Controller
public class CheckRecordController extends BaseController {

	@GetMapping("/uncheck/detail/")
	public String showUncheckDetail(Model model) {
		
		RibbonDataBean ribbonDataBean=new RibbonDataBean();
		ribbonDataBean.setLayer1("hello");
		ribbonDataBean.setLayer2("world");
		ribbonDataBean.setLayer3(" ----!");
		super.setNaviMenuTreeName(model, ribbonDataBean);
		
		UncheckDetailFormBean uncheckDetailFormBean=new UncheckDetailFormBean();
		model.addAttribute("checkFormData", uncheckDetailFormBean);
		return "uncheckDetail";
	}
}
