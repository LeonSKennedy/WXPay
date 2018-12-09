package com.demodashi;

/**
 * 
 * @author xgchen
 *
 */
public interface UserService {
	
	String weixinPay(String userId, String productId) throws Exception;
}
