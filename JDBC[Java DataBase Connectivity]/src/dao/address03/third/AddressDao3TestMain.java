package dao.address03.third;

import java.util.ArrayList;

import dao.address03.Address;

public class AddressDao3TestMain {

	public static void main(String[] args) throws Exception {
		AddressDao3 addressDao3=new AddressDao3();
		System.out.println("1. create ");
		int insertRowCount=
				addressDao3.create(
						new Address("xxx", "김수미","234-9090", "CANADA"));
		System.out.println("create: "+insertRowCount);
		
		
		System.out.println("2. update ");
		Address updateAddress=new Address(2, "uuu", "변경이름", "900-0000", "주소변경");
		int updateRowCount=
				addressDao3.update(updateAddress);
		System.out.println("update:"+updateRowCount);
		
		
		System.out.println("3. delete ");
		System.out.println("delete:"+addressDao3.delete(33));
		
		
		System.out.println("------------4.selectByNo---------------");
		Address findAddress=addressDao3.selectByNo(4);
		System.out.println(findAddress);
		
		System.out.println("-------------5.selectAll---------------");
		ArrayList<Address> findAddressList=addressDao3.selectAll();
		System.out.println(findAddressList);
		
		

	}

}
