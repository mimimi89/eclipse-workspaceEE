package com.itwill.address;

import java.util.ArrayList;

public interface AddressDao {

	int create(Address insertAddress) throws Exception;

	int delete(int no) throws Exception;

	int update(Address updateAddress) throws Exception;

	Address selectByNo(int fno) throws Exception;

	ArrayList<Address> selectAll() throws Exception;

}