/**
 * 
 */
package com.antec.constant;

import lombok.Getter;

/**
 * @author shenzhaohong
 *
 */
public enum CollectKbnEnum {

	BUILD_KBN("1","跳楼");
	
	@Getter
	private String kbn;
	@Getter
	private String kbnName;
	private CollectKbnEnum(String kbn, String kbnName) {
		this.kbn = kbn;
		this.kbnName = kbnName;
	}
	
	
	
}
