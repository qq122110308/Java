package com.ry.aop05;

public class someServiceImpl implements ISomeService {

	
	//ע��throw  ��  try  catch ������
	@Override
	public boolean login(String username, String password) {
		if(!username.equals("beijing")){
			try {
				throw new UsernameException("�û�������");
			} catch (UsernameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(!password.equals("111")){
			try {
				throw new PasswordException("�������");
			} catch (PasswordException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}

	

	
	
}
