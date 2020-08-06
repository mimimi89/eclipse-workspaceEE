package dao.address03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class AddressDao1TestMain {

	public static void main(String[] args) throws Exception {
	
		AddressDao1 addressDao1=new AddressDao1();
		System.out.println("1. create ");
		addressDao1.create();
		
		System.out.println("2. update ");
		addressDao1.update();
		
		System.out.println("3. delete ");
		addressDao1.delete();
		
		System.out.println("4. selectByNo ");
		addressDao1.selectByNo();
		
		System.out.println("5. selectAll ");
		addressDao1.selectAll();
		
	}

}
