package connection04;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Properties;
import java.util.logging.Logger;

public class StrongDriver implements Driver {
	
	
	//클래스 내에는 멤버변수(멤버필드), 생성자, 메쏘드(getter, setter 포함), inner 클래스가 들어갈 수 있음
	//인자를 가지고 있지 않는 생성자 --> 기본(디폴트) 생성자
	
	private StrongDriver() {
		System.out.println("StrongDriver 기본 생성자");
	}
	
	static {
		/*
		 * 클래스가 로딩되면 최초로 실행되는 블록
		 * 객체 생성과 관련 없는 정적 블록
		 */
		try {
			
			System.out.println("로딩만 하면 --> ");
			System.out.println("Driver 인터페이스를 구현하는 StrongDriver 클래스의 정적블록에 의해서");
			System.out.println("1.StrongDriver 객체 생성");
			Driver driver=new StrongDriver();
			System.out.println("2. StrongDriver 등록");
			DriverManager.deregisterDriver(driver);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean acceptsURL(String url) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMajorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMinorVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean jdbcCompliant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		// TODO Auto-generated method stub
		return null;
	}

}
