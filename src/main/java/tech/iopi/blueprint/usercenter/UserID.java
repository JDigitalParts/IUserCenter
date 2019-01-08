package tech.iopi.blueprint.usercenter;

import java.io.Serializable;


/**
 * 
 * 用户ID对象
 * 
 * 用于表示一种用户ID，如手机号，邮箱等，同一类型的一个用户ID只能绑定一个用户。
 * 
 * @author Neal
 * @since 0.1
 *
 */
public class UserID implements Serializable {

	private static final long serialVersionUID = 1L;
	
	/**
	 * 用户ID的类型
	 * 
	 * 如UserName，EMail，QQ等
	 */
	private String type;
	
	/**
	 * 用户ID
	 */
	private String id;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
