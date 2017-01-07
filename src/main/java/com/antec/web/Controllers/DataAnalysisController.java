/**
 * 
 */
package com.antec.web.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.antec.dao.UncheckRecordDto;
import com.antec.service.CollectDataService;

/**
 * @author shenzhaohong
 *
 */
@Controller
public class DataAnalysisController {
	@Autowired
	private CollectDataService collectDataService;
	
	@GetMapping(value="/uncheck/")
	public String initDataTablePage(Model model) {
		
		List<UncheckRecordDto> uncheckRecordDtos=collectDataService.getAllUncheckRecord();
		if (uncheckRecordDtos != null && uncheckRecordDtos.size() >0) {
			model.addAttribute("uncheckRecordList", uncheckRecordDtos);
		}else {
			model.addAttribute("uncheckRecordList", new ArrayList<>());
		}
		
		return "datatables";
	}

}
