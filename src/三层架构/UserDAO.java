package ����ܹ�;

import java.util.ArrayList;

public class UserDAO {
private static ArrayList<UserVO> userlist;
	
	public UserDAO()
	{
	    userlist=new ArrayList<>();
	    userlist.add(new UserVO("�ܼ�����","����","����"));
	    userlist.add(new UserVO("a2","����","2222"));	    
	}
	
	
	public UserVO CheckExist(UserVO vo)
	{
		for(UserVO uvo:userlist)
		{
			if(uvo.getUserId().equals(vo.getUserId()))
			{
				return uvo;
			}
		}
		return null;
	}
	
	public void UpdateUser(UserVO vo)
	{
	     for(UserVO uvo:userlist)
	     {
	    	 if(uvo.getUserId().equals(vo.getUserId()))
	    	 {
	    		 uvo.setLastLogin(vo.getLastLogin());
	    	 }
	     }
	}
}
