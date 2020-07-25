package system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

/**
 * ���ݿ����
 * 
 * @author DQX
 *
 */
public class Jdbc
{
	static String JDriver;// SQL���ݿ�����
	static String URl;
	static String userName;
	static String userPwd;
	// ��̬����� �������ʱ����
	static
	{
		ResourceBundle rb = ResourceBundle.getBundle("info");
		JDriver = rb.getString("JDriver");
		URl = rb.getString("URl");
		userName = rb.getString("userName");
		userPwd = rb.getString("userPwd");
		try
		{
			Class.forName(JDriver);
		} catch (Exception e)
		{
		}
	}

	/******** �������ݲ��� **********/
	public static void insert(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = null;
		System.out.println("stmt : " + stmt);
		stmt = con.createStatement();
		int num = stmt.executeUpdate(sql);
		// 5.��������� ��ʾ���
		if (num >= 1)
		{
			System.out.print("ִ��executeUpdate�ɹ�");
		} else
		{
			System.out.print("ִ��executeUpdateʧ��");
		}
		close(con, stmt, null);
	}

	/******* �޸����ݲ��� **********/
	public static void update(String sql) throws ClassNotFoundException, SQLException
	{

		Connection con = getconnection();
		Statement stmt = con.createStatement();
		int num = stmt.executeUpdate(sql);
		if (num >= 1)
		{
			System.out.print("ִ��executeUpdate�ɹ�");
		} else
		{
			System.out.print("ִ��executeUpdateʧ��");
		}
		close(con, stmt, null);
	}

	/******** ��ѯ���ݲ��� **********/
	public static void select(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);
			}
		}
		close(con, stmt, null);
	}
	public static void mark1(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		String s[] = new String[6];
		String str = "���� �༶ ѧ�ŷֱ���:";
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);
				s[i] = v;
				str=str + s[i] + ' ';
			}
		}
		JOptionPane.showMessageDialog(null,str,"���������ͷ�",JOptionPane.INFORMATION_MESSAGE);
		close(con, stmt, null);
	}
	public static void mark2(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		String s[] = new String[6];
		String str = "���� �༶ ѧ�ŷֱ���:";
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);
				s[i] = v;
				str=str + s[i] + ' ';
			}
		}
		JOptionPane.showMessageDialog(null,str,"��ѧ�����ͷ�",JOptionPane.INFORMATION_MESSAGE);
		close(con, stmt, null);
	}
	public static void mark3(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		String s[] = new String[6];
		String str = "���� �༶ ѧ�ŷֱ���:";
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);
				s[i] = v;
				str=str + s[i] + ' ';
			}
		}
		JOptionPane.showMessageDialog(null,str,"Ӣ�������ͷ�",JOptionPane.INFORMATION_MESSAGE);
		close(con, stmt, null);
	}
	public static void select1(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);	
				JOptionPane.showMessageDialog(null,v,"����������", JOptionPane.INFORMATION_MESSAGE);
			}
		}
		close(con, stmt, null);
	}
	public static void select2(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);
				JOptionPane.showMessageDialog(null,v,"���Ĳ�������", JOptionPane.INFORMATION_MESSAGE);		
			}
		}
		close(con, stmt, null);
	}
	public static void select3(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);
				JOptionPane.showMessageDialog(null,v,"��ѧ������", JOptionPane.INFORMATION_MESSAGE);		
			}
		}
		close(con, stmt, null);
	}
	public static void select4(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);
				JOptionPane.showMessageDialog(null,v,"��ѧ��������", JOptionPane.INFORMATION_MESSAGE);		
			}
		}
		close(con, stmt, null);
	}
	public static void select5(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);
				JOptionPane.showMessageDialog(null,v,"Ӣ��������", JOptionPane.INFORMATION_MESSAGE);		
			}
		}
		close(con, stmt, null);
	}
	public static void select6(String sql) throws ClassNotFoundException, SQLException
	{
		Connection con = getconnection();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next())
		{
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i <= columnCount; i++)
			{
				String v = rs.getString(i);
				JOptionPane.showMessageDialog(null,v,"Ӣ�ﲻ������", JOptionPane.INFORMATION_MESSAGE);		
			}
		}
		close(con, stmt, null);
	}
	/******* ��ȡ���ݿ�����con ********/
	public static Connection getconnection()
	{
		Connection con = null;
		try
		{
			Class.forName(JDriver); // ���ݿ�
			con = DriverManager.getConnection(URl, userName, userPwd);
		} catch (Exception e)
		{
		}
		return con;
	}

	/* �ر����ݿ� con,stmt rs ���� */
	public static void close(Connection con, Statement stmt, ResultSet rs)
	{
		try
		{
			if (rs != null)
			{
				try
				{
					rs.close();
				} catch (Exception ee)
				{

				}
			}
			if (stmt != null)
			{
				stmt.close();
			}
			if (con != null)
			{
				con.close();
			}
		} catch (Exception e)
		{
		}
	}

}