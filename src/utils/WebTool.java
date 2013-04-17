package utils;



import pojo.User;



public class WebTool {

	public static void doMd5(User user)
	{
		String nm=user.getLogid();
		String pass = user.getLogpass();
		String s = nm+ pass;
		s = MD5.getMD5(s.getBytes());
		user.setLogpass(s);
	}
	

}
