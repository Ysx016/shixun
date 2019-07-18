package 三层架构;
import 三层架构.UserDAO;
public class UserBO {
	public int validateUser(UserVO vo)
	{
		UserDAO dao=new UserDAO();
		UserVO uvo=dao.CheckExist(vo);
		if(uvo!=null)
		{
			if(vo.getPassword().equals(uvo.getPassword()))
			{
				return Message.SUCCEED_CODE;
			}
			else
			{
				return Message.PASSWORD_ERROR_CODE;
			}	
			
		}
		return Message.USER_NOT_EXIST_CODE;
	}
	
	public void updateUser(UserVO vo)
	{
     	UserDAO ud=new UserDAO();
     	ud.UpdateUser(vo);
     	
	}
	
	

}
