package com.ry.aop05;

public class someServiceImpl implements ISomeService {

	
	//注意throw  和  try  catch 的区别
	@Override
	public boolean login(String username, String password) {
		if(!username.equals("beijing")){
			try {
				throw new UsernameException("用户名错误");
			} catch (UsernameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(!password.equals("111")){
			try {
				throw new PasswordException("密码错误");
			} catch (PasswordException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

	

	
	
}
