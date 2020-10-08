package org.zerock.persistence;


import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTests {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			log.info("드라이버로딩에러");
		}
	}
	@Test
	public void testConnection() {
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jslhrd","1234");
			log.info(conn);
		}catch(Exception e) {
			log.info("커넥션 연결실패");
			e.printStackTrace();
		}
	}
}
