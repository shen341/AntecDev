/**
 * 
 */
package com.antec.web.formBean;

import java.util.List;

import com.antec.model.entity.Eventkeyword;

import lombok.Data;

/**
 * @author shenzhaohong
 *
 */
@Data
public class UncheckDetailFormBean {
	
	//1.python collect info
	private Integer collectId;
	private String kbn;
	private String envetKbnName;
	private String title;
	private String url;
	
	//2.modify info
	private Integer checkedId;
	private String modifyKbn;
	private String modifyUrl;
	private String occurDate;
	private String eventSummary;
	private String pickedAddress;
	private double longitude;
	private double latitude;
	//TODO
	private Integer credibility;
	
	//3.key word
	private String addressKeyWord;
	private String occurDateKeyWord;
	private String summaryKeyWord;
	
	private List<Eventkeyword> eventkeywords;
	

}
