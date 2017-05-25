package com.mytribe.common;

public class UserKeyUtil {
	public static String encrypt(String accountName, Integer platformType, String serverId) {
		return DESUtil.encrypt(accountName + " " + platformType + " " + serverId);
	}

	public static String decrypt(String encryptStr) {
		return DESUtil.decrypt(encryptStr);
	}

	public static String getKey(String accountName, Integer platformType) {
		return accountName + " " + platformType;
	}
}
