package connection04;

import java.sql.Connection;
import java.sql.DriverManager;

public class ClassLoadingInstanceCreateMain {//클래스 로딩과 객체 생성

	public static void main(String[] args) throws Exception {
		/*
		StrongDriver strongDriver=new StrongDriver();
		DriverManager.registerDriver(strongDriver);
		Connection con=DriverManager.getConnection("jdbc:strong:...", "user", "password");
		위와 같은 작업은 의존성 발생하기 때문에 아래처럼
		*/
		
		/*Class.forName("connection.StrongDriver");	
		  클래스를 string 형태로 로딩시킴
		  로딩시키자마자 클래스 생성
		 */
		
		/*
		Class driverClazz=Class.forName("connection.StrongDriver");	
		Driver driver=(Driver)driverClazz.newInstance();//기본생성자 호출, 오브젝트 반환하니까 캐스팅
		DriverManager.registerDriver(driver);
		객체 만들고 등록하는 과정 없애려면
		Connection con=DriverManager.getConnection("", "", "");
		*/
		
		Class.forName("connection.StrongDriver");	
		//Connection con=DriverManager.getConnection("", "", "");
		
		
		

	}

}
