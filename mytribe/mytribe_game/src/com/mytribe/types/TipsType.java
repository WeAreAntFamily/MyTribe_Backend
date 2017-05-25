package com.mytribe.types;

public enum TipsType {
	/** 角色已经存在 */
	ROLE_HAVE_EXISTS(0, "角色已经存在"),
	/** 角色不存在 */
	ROLE_NOT_EXISTS(1, "角色不存在"),
	/** 消息请求太快 */
	TOO_FAST(2, "消息请求太快"),
	/** 禁止访问*/
	FORBID(3, "禁止访问"),
	/** 禁止访问*/
	SERVER_STOP(4, "服务器异常"),
	/** 禁止访问*/
	SERVER_NOSTARTED(5, "未启动"),
	/** 禁止访问*/
	OK(6, "ok"), 
	/** 服务器异常*/
	SERVER_ERR(7,""),
	/** 密码错误*/
	PASSWD_ERR(8,"passwd err"),
	/** 密码错误*/
	CREATE_OK(9,"创建成功"),
	;
	private int type;
	private String desc;

	TipsType(int type, String desc) {
		this.type = type;
		this.desc = desc;
	}

	public int getType() {
		return type;
	}

	public String getDesc() {
		return desc;
	}

}
