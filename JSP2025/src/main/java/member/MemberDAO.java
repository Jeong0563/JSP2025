package member;

import java.sql.*;
import java.util.*;
public class MemberDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	
	final String JDBC_DRIVER = "org.h2.Driver";
	final String JDBC_URL = "jdbc:h2:tcp://localhost/~/test";
	public void open() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(JDBC_URL, "sa", "");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void close() {
		try {
			pstmt.close();
			conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public List<Member> getAll() {
		List<Member> memberlist = new ArrayList<>();
		
		open();
		try {
			pstmt  = conn.prepareStatement("select * from members");
			ResultSet rs = pstmt.executeQuery();
			Member m = new Member();
			m.setId(rs.getInt("id"));
			m.setUsername(rs.getString("username"));
			m.setCompany(rs.getString("company"));
			m.setBirthday(rs.getDate("birthday"));
			m.setEmail(rs.getString("email"));
			
			memberlist.add(m);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close();
		}
		// 모든 회원들의 정보를 리턴하는 부분
		return memberlist;
		
	}
	public void insert(Member m) {
		
	}
}
