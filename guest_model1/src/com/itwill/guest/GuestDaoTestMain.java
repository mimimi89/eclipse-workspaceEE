package com.itwill.guest;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
		GuestDao guestDao=new GuestDaoImpl();
		System.out.println("1.insert: "+
				guestDao.insertGuest(new Guest(11,"김미영","2020/08/26","ppp@naver.com","http://","방명록 사용법","그냥 쓰면 됩니다.")));
		
		//System.out.println(guestDao.selectAll());
		
		
		/*

		
		//User updateUser=new User("guard1", "1111", "공경호", "guard@gmail.com");
		//System.out.println("2.update: "+userDao.update(updateUser));
		
		//System.out.println("3.delete: : "+userDao.remove("guard3"));
		//System.out.println("4.findUser: "+userDao.findUser("guard1"));
		//System.out.println("5.findUserList: "+userDao.findUserList());
		//System.out.println("6.existedUser: "+userDao.existedUser("guard1"));
		 */
		
	}

}
