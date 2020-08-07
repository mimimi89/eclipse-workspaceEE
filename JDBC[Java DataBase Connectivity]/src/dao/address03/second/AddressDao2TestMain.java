package dao.address03.second;

public class AddressDao2TestMain {

	public static void main(String[] args) throws Exception {
		AddressDao2 addressDao2=new AddressDao2();
		System.out.println("1. create ");
		addressDao2.create("guard", "경호", "569-5968", "경기 양평");
		addressDao2.create("bbbb", "경우", "345-8909", "경기 가평");
		addressDao2.create("cccc", "흑우", "333-8909", "경기 수평");
		
		System.out.println("2. update ");
		addressDao2.update(2,"yyy","이름변경","000-0000","주소변경");
		//	2	xxx	김경미	888-8888	서울시 강남구
		
		
		System.out.println("3. delete ");
		addressDao2.delete(17);
		//17	guard	김경호	123-4568	경기도 성남시
		
		System.out.println("4. selectByNo ");
		addressDao2.selectByNo(2);
		
		System.out.println("5. selectAll ");
		addressDao2.selectAll();
		

	}

}
