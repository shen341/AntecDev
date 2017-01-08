/**
 * 
 */
package com.antec.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

/**
 * @author shenzhaohong
 *
 */
@Component
@PropertySource("config/selfConfig.properties")
public class SelfConfig {
	@Getter
	@Setter
	@Value("${baidu.ak.key}")
	private String ak;

	
}
