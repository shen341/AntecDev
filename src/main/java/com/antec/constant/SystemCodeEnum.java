/**
 * 
 */
package com.antec.constant;

import lombok.Getter;

/**
 * @author shenzhaohong
 *
 */
public enum SystemCodeEnum {
	URL_SPLASH("/"),
	PDF_TO_IMAGE_KEY("PI"),
	NUMBER_REGEX("\\d+"),
	MONEY_DIS_PARCENT("%"),
	FJ_FILES_SPLIT(","),
	USER_AGENT_HEADER("User-Agent"),
	BATCH_CREATE_ID("batch"),
	
	FILE_NAME_MIDDLE_SPLIT("_"),
	FILE_SUFFIX_SPLIT("."),
	AJAX_PATTERN_ERR("Pattern"),
	AJAX_FIELD_MESSAGE_SPACE("  "),
	AJAX_OBJECT_FIELD_SPLIT("."),
	AJAX_GOBAL_ERROR_STR("error"),
	AJAX_SUCCESS_RESULT("OK"),
	AJAX_FAIL_RESULT("NG"),
	ENABLED_FLG_FALSE("0"),
	SESSION_USER_INFO("sessionUser"),
	MONEY_SPLIT("."),
	MONEY_DISPLAY_FORMAT_NONE("###"),
	MONEY_DISPLAY_FORMAT_ONE("###.0"),
	MONEY_DISPLAY_FORMAT_TWO("###.00");
	
	@Getter
	private String code;

	private SystemCodeEnum(String code) {
		this.code = code;
	}
}
