package com.itwill.guest;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
		GuestDao guestDao=new GuestDaoImpl();
		//System.out.println("1.insert: "+
				//guestDao.insertGuest(new Guest(-9090, "김미영", null, "ppp@naver.com","http://","방명록 사용법","그냥 쓰면 됩니다.")));
		
		//Guest guest=guestDao.selectByNo(4);
		//guest.setGuest_name("김변경");
		//System.out.println("2.update: "+
				//guestDao.updateGuest(guest));
		
		//System.out.println(guestDao.selectAll());
		
		//System.out.println("3.delete: : "+guestDao.deleteGuest(5));
		
		System.out.println("4.findGuest: "+guestDao.selectByNo(2));
		
		System.out.println("5.findGuestList: "+guestDao.selectAll());
		
	
		
	}

}
