package com.itwill.guest;

import java.util.ArrayList;

public class GuestService {
	//guest service는 guest dao를 가지고 있어야 함
	private GuestDao guestDao;
	
	public GuestService() {
		
	}
	/*
	 * Create
	 */
	public int insertGuest(Guest guest) throws Exception{
		return 0;
	}
	/*
	 * Read
	 */
	public Guest selectByNo(int no) throws Exception{
		return null;
	}
	public ArrayList<Guest> selectAll() throws Exception{
		return guestDao.selectAll();
	}
	/*
	 * Update
	 */
	public int updateGuest(Guest guest) throws Exception{
		return 0;
	}
	/*
	 * Delete
	 */
	public int deleteGuest(int no) throws Exception{
		return 0;
	}

}
