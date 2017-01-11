/**
 * 
 */
package com.antec.web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.apache.xerces.impl.xpath.regex.Match;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.antec.model.bean.MasterCodeNameBean;
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
		
		initPage(model);
		
		UncheckDetailFormBean uncheckDetailFormBean=new UncheckDetailFormBean();
		uncheckDetailFormBean.setModifyKbn("code1");
		model.addAttribute("checkFormData", uncheckDetailFormBean);
		return "uncheckDetail";
	}
	
	private void initPage(Model model) {
		//1.menu name
		RibbonDataBean ribbonDataBean=new RibbonDataBean();
		ribbonDataBean.setLayer1("hello");
		ribbonDataBean.setLayer2("world");
		ribbonDataBean.setLayer3(" ----!");
		super.setNaviMenuTreeName(model, ribbonDataBean);
		
		//2.master data
		List<MasterCodeNameBean> dataTypeList=new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			MasterCodeNameBean masterCodeNameBean= new MasterCodeNameBean();
			masterCodeNameBean.setCode("code" + i);
			masterCodeNameBean.setName("name" + i);
			dataTypeList.add(masterCodeNameBean);
			
		}
		model.addAttribute("dataTyleList", dataTypeList);
		
	}
}
