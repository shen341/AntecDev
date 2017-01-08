/**
 * 
 */
package com.antec.web.controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.antec.config.SelfConfig;
import com.antec.dao.UncheckRecordDto;
import com.antec.service.CollectDataService;
import com.antec.service.CsvToDatabaseService;
import com.antec.web.base.BaseController;

/**
 * @author shenzhaohong
 *
 */
@Controller
public class DataAnalysisController extends BaseController{
	@Autowired
	private CollectDataService collectDataService;
	
	@Autowired
	private CsvToDatabaseService csvToDatabaseService;
	
	@Autowired
	private SelfConfig selfConfig;
	
	/**
	 * 
	 * show want prepare data 
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping(value="/uncheck/")
	public String initDataTablePage(Model model) {
		
		List<UncheckRecordDto> uncheckRecordDtos=collectDataService.getAllUncheckRecord();
		if (uncheckRecordDtos != null && uncheckRecordDtos.size() >0) {
			model.addAttribute("uncheckRecordList", uncheckRecordDtos);
		}else {
			model.addAttribute("uncheckRecordList", new ArrayList<>());
		}
		
//		System.out.println("#############Ak---------:" + selfConfig.getAk());
//		
//		csvToDatabase();
		return "datatables";
	}
	
	@GetMapping(value="/uncheck/{id}/")
	public String showUncheckDetai(Model model,@PathVariable("id") String id) {
		
		return StringUtils.EMPTY;
	}
	
	/**
	 * @deprecated
	 */
	private void csvToDatabase() {
		String csvFile="/Users/shenzhaohong/Desktop/China_Regions.csv";
		File file=new File(csvFile);
		if (!file.exists()) {
			return;
		}
		csvToDatabaseService.csvFileToDatabase(file);
		
	}

}
