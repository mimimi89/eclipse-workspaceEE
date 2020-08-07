package dao.address03;

public class AddressSQL {
	//sql만 들어있는 클래스, 변경금지-->final, 오픈-->public, 상수-->static
	public static final String INSERT="insert into address values(address_no_seq.nextval,?,?,?,?)";
	public static final String DELETE= "delete address where no =?";
	public static final String UPDATE="update address set id=?,name=?,phone=?,address=? where no=?";
	public static final String SELECTBYNO="select * from address where no=?";
	public static final String SELECTALL="select * from address";
	
	
}
