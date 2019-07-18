package 三层架构;

import java.util.ArrayList;

public class UserDAO {
private static ArrayList<UserVO> userlist;
	
	public UserDAO()
	{
	    userlist=new ArrayList<>();
	    userlist.add(new UserVO("熊继媛是","张三","猪猪"));
	    userlist.add(new UserVO("a2","李四","2222"));	    
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
