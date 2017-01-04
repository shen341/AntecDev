/**
 * 
 */
package com.antec.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author shenzhaohong
 *
 */
@Controller
public class DataAnalysisController {
	
	@GetMapping(value="/")
	public String initDataTablePage(Model model) {
		return "datatables";
	}

}
