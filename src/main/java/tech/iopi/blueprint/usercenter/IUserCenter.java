package tech.iopi.blueprint.usercenter;

/**
 * 
 * 用户中心蓝图
 * 
 * 用户中心设计用于记录用户账号ID与密码信息，并为每个用户分配一个系统UID，
 * 系统UID设计为内部使用，不应对系统外暴露。新用户将获得一个新的UID。
 * 
 * @author Neal
 * @since 0.1
 *
 */
public interface IUserCenter {
	
	/**
	 * 添加一个新用户
	 * 
	 * @param userId 用户ID
	 * @param password 密码,可为null,即不设置密码
	 * @return 用户UID，如果用户已存在则返回null
	 */
	public String addNewUser(UserID userId,String password);
	
	/**
	 * 
	 * 登录验证
	 * 
	 * @param userId 用户ID
	 * @param password 用户密码，必须填写
	 * @return 内部UID，如果用户ID不存在，或者与密码不匹配，则返回null
	 */
	public String login(UserID userId,String password);
	
	/**
	 * 用户登录
	 * 
	 * 用于将登录用UserID转换为内部UID
	 * 
	 * @param userId 用户ID
	 * @return 内部UID，如果用户ID不存在，则返回null
	 */
	public String login(UserID userId);
	
}
