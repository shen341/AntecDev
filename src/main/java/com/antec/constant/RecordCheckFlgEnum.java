/**
 * 
 */
package com.antec.constant;

import lombok.Getter;

/**
 * @author shenzhaohong
 *
 */
public enum RecordCheckFlgEnum {
	UNCHECK_FLG("0"),
	CHECKED_FLG("1");
	
	@Getter
	private String flg;

	private RecordCheckFlgEnum(String flg) {
		this.flg = flg;
	}
	
	
	
}
