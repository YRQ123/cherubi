package sqlBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbConnection {
	public static Connection con = null;
	public static Connection getConn() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//1.����mysql���������򣬽�ѹconnector�����com�ļ���
		} catch (Exception e) {
			System.out.println("�������򲻴��ڣ�");
		}
		try {
			//2.�����������ݿ�Ĳ���
			String user = "root";
			String password = "mysql";//û����������Ϊ��
			String url = "jdbc:mysql://localhost:3306/zy?useUnicode=true&characterEncoding=utf-8";//kh_dbΪ��Ҫ���ӵ����ݿ������
			//3.��������
			con = DriverManager.getConnection(url, user, password);//��������˳��Ϊ�����ӵĵ�ַ���û���������
		} catch (Exception e) {
			System.out.println("���ݿ�����ʧ��");
		}
		return con;
	
	}
//	public ResultSet Search(String sql, String str[]) {
//		getConn();
//		ResultSet rs = null;
//		try {
//			PreparedStatement pst = con.prepareStatement(sql);
//			if (str != null) {
//				for (int i = 0; i < str.length - 1; i++) {
//					pst.setString(i + 1, str[i]);
//				}
//				pst.setInt(str.length, Integer.parseInt(str[str.length - 1]));
//			}
//			rs = pst.executeQuery();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return rs;
//	}
}
