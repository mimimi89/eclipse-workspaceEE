package com.itwill.guest;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class GuestDaoImpl implements GuestDao{
	
	public GuestDaoImpl() throws Exception{
		
	}
	
	@Override
	public int insertGuest(Guest guest) throws Exception {
		
		return 0;
	}

	@Override
	public Guest selectByNo(int no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Guest> selectAll() throws Exception {
		ArrayList<Guest> guestList=new ArrayList<Guest>();
		
		Connection con=
				ConnectionFactory.getConnection();
		PreparedStatement pstmt=
				con.prepareStatement(GuestSQL.GUEST_SELECT_ALL);
		ResultSet rs=
				pstmt.executeQuery();
		while(rs.next()) {
			guestList.add(new Guest(rs.getInt("guest_no"),
									rs.getString("guest_name"),
									rs.getString("guest_date"),
									rs.getString("guest_email"),
									rs.getString("guest_homepage"),
									rs.getString("guest_title"),
									rs.getString("guest_content")));
		}
		return guestList;
	}

	@Override
	public int updateGuest(Guest guest) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteGuest(int no) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
