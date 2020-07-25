package system;

// 教师操作主界面
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class TeacherMainFrame extends JFrame implements ActionListener
{
	JLabel lbsno, lbname, lbsex, lbdept, lbmajor, lbpwd, lbGrade1, lbGrade2, lbGrade3, lbTotal;
	JTextField jtf, jtsno, jtname, jtsex, jtdept, jtmajor, jtpwd, jtGrade1, jtGrade2, jtGrade3, jtTotal;
	JPanel jp1, jp2, cardpanel, teainfojp, teainfoupjp, stuinfojp, gradejp, updatejp;
	JButton teainfobtn, teainfoupbtn, stuinfobtn, gradebtn, exitbtn, upbtn;
	JButton chbtn,matbtn,engbtn,chbtn1,matbtn1,engbtn1,cxbtn1,cxbtn2,cxbtn3,cxbtn4;
	JButton findbtn, addbtn, debtn, updatebtn, findbtn1, addbtn1, debtn1, gxbtn, gxbtn1, updatebtn1, pxbtn, pxbtn1;
	CardLayout card;
	JTable jt = null;
	JTable jt1 = null;
	JScrollPane jsp = null;
	StudentinfoModel sm;
	GradeModel sm1;
	JRadioButton chi, mat, eng;
	ButtonGroup bg1;

	// 定义操作数据库参数
	static String JDriver = "com.mysql.jdbc.Driver";// SQL数据库引擎
	static String URl = "jdbc:mysql://127.0.0.1:3306/studentinfo";
	static String userName = "root";
	static String userPwd = "123456";
	String sql;
	Connection ct = null;
	PreparedStatement ps;
	ResultSet rs;
	String number = null;
	String name, sex, dept, major, pwd, Grade1, Grade2, Grade3, TotalGrade;
	String sno;
	int row, row1;

	public static Connection getconnection()
	{
		Connection con = null;
		try
		{
			Class.forName(JDriver); // 数据库
			con = DriverManager.getConnection(URl, userName, userPwd);
		} catch (Exception e)
		{
		}
		return con;
	}

	// 查看老师个人信息界面

	public JPanel teainfojp()
	{
		try
		{
			sql = "select * from NewTeacher where ID='" + number + "' "; // 带参数的sql语句
			ct = getconnection();
			ps = ct.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next())
			{
				// jtname.setText(rs.getString("Sname"));
				// name=rs.getString("Sname");
				sex = rs.getString("Ssex");
				dept = rs.getString("Sdept");
				pwd = rs.getString("Password");
			}
		} catch (Exception c)
		{
		}
		lbsno = new JLabel("                      工  号:");
		jtsno = new JTextField(number);
		lbname = new JLabel("                      姓  名:");
		jtname = new JTextField(name);
		lbsex = new JLabel("                      性  别:");
		jtsex = new JTextField(sex);
		lbdept = new JLabel("                      学  院:");
		jtdept = new JTextField(dept);
		lbpwd = new JLabel("                    登录密码:");
		jtpwd = new JTextField(pwd);
		// 设置文本框字体颜色
		jtsno.setForeground(Color.YELLOW);
		jtsex.setForeground(Color.red);
		jtname.setForeground(Color.red);
		jtdept.setForeground(Color.red);
		jtpwd.setForeground(Color.red);
		jtsno.setBackground(Color.gray);
		// 设置文本框字体大小
		jtsno.setFont(new Font("Dialog", 1, 22));
		jtname.setFont(new Font("Dialog", 1, 22));
		jtsex.setFont(new Font("Dialog", 1, 22));
		jtdept.setFont(new Font("Dialog", 1, 22));
		jtpwd.setFont(new Font("Dialog", 1, 22));
		// 设置标签字体大小
		lbsno.setFont(new Font("Dialog", 1, 22));
		lbname.setFont(new Font("Dialog", 1, 22));
		lbsex.setFont(new Font("Dialog", 1, 22));
		lbdept.setFont(new Font("Dialog", 1, 22));
		lbpwd.setFont(new Font("Dialog", 1, 22));
		// 设置文本框不可编辑
		jtsno.setEnabled(false);
		jtname.setEnabled(false);
		jtsex.setEnabled(false);
		jtdept.setEnabled(false);
		jtpwd.setEnabled(false);
		teainfojp = new JPanel(new GridLayout(8, 10, 0, 5));
		teainfojp.add(lbsno);
		teainfojp.add(jtsno);
		teainfojp.add(lbname);
		teainfojp.add(jtname);
		teainfojp.add(lbsex);
		teainfojp.add(jtsex);
		teainfojp.add(lbdept);
		teainfojp.add(jtdept);
		teainfojp.add(lbpwd);
		teainfojp.add(jtpwd);
		return teainfojp;
	}

	// 修改老师个人信息
	public JPanel teainfoupjp()
	{
		JPanel jp1 = new JPanel(new BorderLayout());
		JPanel jp2 = new JPanel();
		teainfoupjp = new JPanel(new GridLayout(7, 10, 0, 5));
		try
		{
			sql = "select * from NewTeacher where ID='" + number + "' "; // 带参数的sql语句
			ct = Jdbc.getconnection();
			ps = ct.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next())
			{
				// jtname.setText(rs.getString("Sname"));
				// name=rs.getString("Sname");
				sex = rs.getString("Ssex");
				dept = rs.getString("Sdept");
				pwd = rs.getString("Password");
			}
		} catch (Exception c)
		{
		}
		upbtn = new JButton("修改");

		lbsno = new JLabel("                      工  号:");
		jtsno = new JTextField(number);
		lbname = new JLabel("                      姓  名:");
		jtname = new JTextField(name);
		lbsex = new JLabel("                      性  别:");
		jtsex = new JTextField(sex);
		lbdept = new JLabel("                      学  院:");
		jtdept = new JTextField(dept);
		lbpwd = new JLabel("                    登录密码:");
		jtpwd = new JTextField(pwd);
		// 设置文本框字体颜色
		jtsno.setForeground(Color.red);
		jtsex.setForeground(Color.red);
		jtname.setForeground(Color.red);
		jtdept.setForeground(Color.red);
		jtpwd.setForeground(Color.red);
		// 设置文本框字体大小
		jtname.setFont(new Font("Dialog", 0, 22));
		jtsex.setFont(new Font("Dialog", 0, 22));
		jtdept.setFont(new Font("Dialog", 0, 22));
		jtpwd.setFont(new Font("Dialog", 0, 22));
		jtsno.setFont(new Font("Dialog", 0, 22));
		// 设置标签字体大小
		lbsno.setFont(new Font("Dialog", 1, 22));
		lbname.setFont(new Font("Dialog", 1, 22));
		lbsex.setFont(new Font("Dialog", 1, 22));
		lbdept.setFont(new Font("Dialog", 1, 22));
		lbpwd.setFont(new Font("Dialog", 1, 22));
		jtsno.setEnabled(false);// 设置文本框不可编辑
		// 添加组件到面板
		jp2.add(upbtn);
		teainfoupjp.add(lbsno);
		teainfoupjp.add(jtsno);
		teainfoupjp.add(lbname);
		teainfoupjp.add(jtname);
		teainfoupjp.add(lbsex);
		teainfoupjp.add(jtsex);
		teainfoupjp.add(lbdept);
		teainfoupjp.add(jtdept);
		teainfoupjp.add(lbpwd);
		teainfoupjp.add(jtpwd);
		jp1.add(teainfoupjp, BorderLayout.CENTER);
		jp1.add(jp2, BorderLayout.SOUTH);
		jp1.setVisible(true);
		return jp1;
	}

	// 学生信息界面
	public JPanel stuinfojp()
	{

		/******* 上层界面 *******/
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jtf = new JTextField(30);
		findbtn = new JButton("查询");
//		bg1 = new ButtonGroup();
//		chi = new JRadioButton("语文");
//		mat = new JRadioButton("数学");
//		eng = new JRadioButton("英语");
//		chi.setFont(new Font("Dialog", 0, 22));
//		mat.setFont(new Font("Dialog", 0, 22));
//		eng.setFont(new Font("Dialog", 0, 22));
//		chi.setBounds(140, 200, 80, 30);
//		mat.setBounds(240, 200, 80, 30);
//		eng.setBounds(340,200,80,30);
//		bg1.add(chi);
//		bg1.add(mat);
//		bg1.add(eng);
		jp1.add(jtf);
		jp1.add(findbtn);
//		jp1.add(chi);
//		jp1.add(mat);
//		jp1.add(eng);
		/******* 下层界面 *******/
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		addbtn = new JButton("增加");
		updatebtn = new JButton("修改");
		debtn = new JButton("删除");
		gxbtn = new JButton("刷新");
		gxbtn.addActionListener(new ActionListener()
		{ // 刷新表
			public void actionPerformed(ActionEvent e)
			{
				sm = new StudentinfoModel();
				jt.setModel(sm);
			}
		});
		jp2.add(addbtn);
		jp2.add(updatebtn);
		jp2.add(debtn);
		jp2.add(gxbtn);
		sm = new StudentinfoModel(); // 实例化一个数据模型对象
		jt = new JTable(sm); // 初始化JTable
		jt.setRowHeight(25);
		jt.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				row = jt.getSelectedColumn(); // 获取选中的列号（记录）
				System.out.println(row);
			}
		});
		// jt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		// //设置JTable自动调整列表的状态，此处设置为关闭
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();// 单元格渲染器
		tcr.setHorizontalAlignment(JLabel.CENTER);// 居中显示
		jt.setDefaultRenderer(Object.class, tcr);// 设置渲染器
		jsp = new JScrollPane(jt);
		updatebtn.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				row = jt.getSelectedColumn(); // 获取选中的列号（记录）
				System.out.println(row);

			}
		});
		updatebtn.addActionListener(new ActionListener()
		{ // 修改
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (row != -1)
					{
						String sno1 = jt.getValueAt(row, 0).toString();// 读取你获取行号的（1，0）的值
						String name1 = jt.getValueAt(row, 1).toString();
						String sex1 = jt.getValueAt(row, 2).toString();
						String dept1 = jt.getValueAt(row, 3).toString();
						String major1 = jt.getValueAt(row, 4).toString();
						String pwd1 = jt.getValueAt(row, 5).toString();
						String bj = jt.getValueAt(row,6).toString();
						AddteaFrame2 frame2 = new AddteaFrame2(sno1, name1, sex1, dept1, major1, pwd1);
						frame2.setVisible(true);
						jp1.setVisible(true);
						jp2.setVisible(true);
						setVisible(true);
					} else
					{
						JOptionPane.showMessageDialog(null, "请选择一行！", "错误！", JOptionPane.ERROR_MESSAGE);
					}

				} catch (Exception x)
				{
					x.printStackTrace();
				}

			}
		});

		findbtn.addActionListener(new ActionListener()
		{ // 模糊查询 学号

			public void actionPerformed(ActionEvent e)
			{
				String num = jtf.getText().trim();
				String sql = "select * from NewStudent where binary Sno like '%" + num + "%'"; // binary
																								// 转换成字符串类型时，长度是8Byte
				// String
				// sql2="select * from NewStudent where Sname like '%"+num+"%'";
				if (num.equals(""))
				{
					JOptionPane.showMessageDialog(null, "请输入查询条件", "错误！", JOptionPane.ERROR_MESSAGE);
				} else
				{
					StudentinfoModel sm2 = new StudentinfoModel(sql);
					jt.setModel(sm2);

				}

			}
		});

		debtn.addActionListener(new ActionListener()
		{ // 删除
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (row != -1)
					{
						sno = jt.getValueAt(row, 0).toString();// 读取你获取行号的（1，1）的值
						try
						{
							String sql = "delete from NewStudent where Sno='" + sno + "'";
							Connection cn = Jdbc.getconnection();
							PreparedStatement ps = cn.prepareStatement(sql);
							ps.executeUpdate();
							System.out.println("数据删除成功");
						} catch (Exception s)
						{
							s.printStackTrace();
						}

					} else
					{
						JOptionPane.showMessageDialog(null, "请选择一行！", "错误！", JOptionPane.ERROR_MESSAGE);
					}

				} catch (Exception x)
				{
					x.printStackTrace();
				}

			}
		});
		JPanel jp3 = new JPanel(new BorderLayout());
		jp3.add(jp1, BorderLayout.NORTH);
		jp3.add(jsp, BorderLayout.CENTER);
		jp3.add(jp2, BorderLayout.SOUTH);
		return jp3;
	}

	// 学生成绩界面
	public JPanel gradejp()
	{

		// 实例化一个数据模型对象
		sm1 = new GradeModel();
		jt1 = new JTable(sm1);
		jt1.setRowHeight(25);

		/******* 上层界面 *******/
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		JTextField jtf2 = new JTextField(30);
		findbtn1 = new JButton("按学号查询");
		pxbtn = new JButton("降序排序");
		pxbtn1 = new JButton("升序排序");
		findbtn1.addActionListener(new ActionListener()
		{ // 模糊查询 学号
			public void actionPerformed(ActionEvent e)
			{
				String num = jtf2.getText().trim();
				String sql = "select * from gradestudent where binary Sno like '%" + num + "%'"; // binary
																									// 转换成字符串类型时，长度是8Byte
				// String
				// sql2="select * from gradestudent where Sname like '%"+num+"%'";
				if (num.equals(""))
				{
					JOptionPane.showMessageDialog(null, "请输入查询条件", "错误！", JOptionPane.ERROR_MESSAGE);
				} else
				{
					StudentinfoModel sm2 = new StudentinfoModel(sql);
					jt1.setModel(sm2);

				}
			}
		});
		pxbtn1.addActionListener(new ActionListener()
		{//排序 按总分升序
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select * from gradestudent ORDER BY TotalGrade";
				GradeModel cm = new GradeModel(sql);
				jt1.setModel(cm);
			}
		});
		pxbtn.addActionListener(new ActionListener()
		{ // 排序 按总分降序
			public void actionPerformed(ActionEvent e)
			{
				String sql = " select * from gradestudent ORDER BY TotalGrade DESC";
				GradeModel cm = new GradeModel(sql);
				jt1.setModel(cm);
			}
		});
		jt1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent e)
			{
				row1 = jt1.getSelectedRow(); // 获取选中的列号（记录）
			}
		});

		jp1.add(jtf2);
		jp1.add(findbtn1);
		jp1.add(pxbtn1);
		jp1.add(pxbtn);
		/******* 下层界面 *******/
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		addbtn1 = new JButton("增加");
		updatebtn1 = new JButton("修改");
		chbtn = new JButton("语文优秀率");
		chbtn1 = new JButton("语文不及格率");
		matbtn = new JButton("数学优秀率");
		matbtn1 = new JButton("数学不及格率");
		engbtn = new JButton("英语优秀率");
		engbtn1 = new JButton("英语不及格率");
		cxbtn1 = new JButton("语文最高最低分");
		cxbtn2 = new JButton("数学最高最低分");
		cxbtn3 = new JButton("英语最高最低分");
		updatebtn1.addActionListener(new ActionListener()
		{ // 修改
			public void actionPerformed(ActionEvent e)
			{
				try
				{

					if (row1 != -1)
					{
						String sno1 = jt1.getValueAt(row1, 0).toString();// 读取你获取行号的（1，0）的值
						String name1 = jt1.getValueAt(row1, 1).toString();
						String sex1 = jt1.getValueAt(row1, 2).toString();
						String dept1 = jt1.getValueAt(row1, 3).toString();
						String major1 = jt1.getValueAt(row1, 4).toString();
						String pwd1 = jt1.getValueAt(row1, 5).toString();
						String bj = jt1.getValueAt(row1, 6).toString();
						AddstuFrame2 frame2 = new AddstuFrame2(sno1, name1, sex1, dept1, major1, pwd1,bj);
						frame2.setVisible(true);
					} else
					{
						JOptionPane.showMessageDialog(null, "请选择一行！", "错误！", JOptionPane.ERROR_MESSAGE);
					}

				} catch (Exception x)
				{
					x.printStackTrace();
				}

			}
		});
		debtn1 = new JButton("删除");
		debtn1.addActionListener(new ActionListener()
		{ // 删除成绩
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					if (row1 != -1)
					{
						sno = jt1.getValueAt(row1, 0).toString();// 读取你获取行号的（1，1）的值
						try
						{
							String sql = "delete from gradestudent where Sno='" + sno + "'";
							Connection cn = Jdbc.getconnection();
							PreparedStatement ps = null;
							ps = cn.prepareStatement(sql);
							ps.executeUpdate();
							JOptionPane.showConfirmDialog(null, "删除成功", "", JOptionPane.INFORMATION_MESSAGE);
						} catch (Exception s)
						{
							s.printStackTrace();
						}

					} else
					{
						JOptionPane.showMessageDialog(null, "请选择一行！", "错误！", JOptionPane.ERROR_MESSAGE);
					}

				} catch (Exception x)
				{
					x.printStackTrace();
				}

			}
		});
		chbtn.addActionListener(new ActionListener()
		{// 语文优秀率
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select sum(case when Grade1 >= 90 then 1 else 0 end)/count(*) from gradestudent";
				try
				{
					Jdbc.select1(sql);
				} catch (ClassNotFoundException | SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		chbtn1.addActionListener(new ActionListener()
		{// 语文不及格率
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select sum(case when Grade1 <60 then 1 else 0 end)/count(*) from gradestudent";
				try
				{
					Jdbc.select2(sql);
				} catch (ClassNotFoundException | SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		matbtn.addActionListener(new ActionListener()
		{// 数学优秀率
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select sum(case when Grade1 >= 90 then 1 else 0 end)/count(*) from gradestudent";
				try
				{
					Jdbc.select3(sql);
				} catch (ClassNotFoundException | SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		matbtn1.addActionListener(new ActionListener()
		{// 数学不及格率
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select sum(case when Grade2 < 60 then 1 else 0 end)/count(*) from gradestudent";
				try
				{
					Jdbc.select4(sql);
				} catch (ClassNotFoundException | SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		engbtn.addActionListener(new ActionListener()
		{// 英语优秀率
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select sum(case when Grade3 >= 90 then 1 else 0 end)/count(*) from gradestudent";
				try
				{
					Jdbc.select5(sql);
				} catch (ClassNotFoundException | SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		engbtn1.addActionListener(new ActionListener()
		{// 英语不及格率
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select sum(case when Grade3 < 60 then 1 else 0 end)/count(*) from gradestudent";
				try
				{
					Jdbc.select6(sql);
				} catch (ClassNotFoundException | SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		gxbtn1 = new JButton("刷新");
		gxbtn1.addActionListener(new ActionListener()
		{ // 刷新数据
			public void actionPerformed(ActionEvent e)
			{
				GradeModel sm1 = new GradeModel();
				jt1.setModel(sm1);
			}
		});
		cxbtn1.addActionListener(new ActionListener()
		{//语文最高最低分
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select Sname,class,Sno,Grade1 from gradestudent where Grade1=(select max(grade1) from gradestudent) or Grade1=(select min(Grade1) from gradestudent);";
				try
				{
					Jdbc.mark1(sql);
				} catch (ClassNotFoundException | SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		cxbtn2.addActionListener(new ActionListener()
		{//数学最高最低分
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select Sname,class,Sno,Grade2 from gradestudent where Grade2=(select max(grade2) from gradestudent) or Grade1=(select min(Grade2) from gradestudent)";
				try
				{
					Jdbc.mark2(sql);
				} catch (ClassNotFoundException | SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		cxbtn3.addActionListener(new ActionListener()
		{//英语最高最低分
			public void actionPerformed(ActionEvent e)
			{
				String sql = "select Sname,class,Sno,Grade3 from gradestudent where Grade3=(select max(grade3) from gradestudent) or Grade3=(select min(Grade3) from gradestudent)";
				try
				{
					Jdbc.mark3(sql);
				} catch (ClassNotFoundException | SQLException e1)
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jp2.add(addbtn1);
		jp2.add(updatebtn1);
		jp2.add(debtn1);
		jp2.add(gxbtn1);
		jp2.add(chbtn);
		jp2.add(chbtn1);
		jp2.add(matbtn);
		jp2.add(matbtn1);
		jp2.add(engbtn);
		jp2.add(engbtn1);
		jp2.add(cxbtn1);
		jp2.add(cxbtn2);
		jp2.add(cxbtn3);
		// 初始化JTable
		DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();// 单元格渲染器
		tcr.setHorizontalAlignment(JLabel.CENTER);// 居中显示
		jt1.setDefaultRenderer(Object.class, tcr);// 设置渲染器
		jsp = new JScrollPane(jt1);

		JPanel jp3 = new JPanel(new BorderLayout());
		jp3.add(jp1, BorderLayout.NORTH);
		jp3.add(jsp, BorderLayout.CENTER);
		jp3.add(jp2, BorderLayout.SOUTH);
		return jp3;
	}

	// ***********注册事件监听器***************
	public void Listener()
	{
		teainfobtn.setActionCommand("teainfobtn");
		teainfobtn.addActionListener(this);
		stuinfobtn.setActionCommand("stuinfobtn");
		stuinfobtn.addActionListener(this);
		gradebtn.setActionCommand("gradebtn");
		gradebtn.addActionListener(this);
		teainfoupbtn.setActionCommand("teainfoupbtn");
		teainfoupbtn.addActionListener(this);
		exitbtn.setActionCommand("exitbtn");
		exitbtn.addActionListener(this);
		upbtn.setActionCommand("upbtn"); // 老师信息修改按钮
		upbtn.addActionListener(this);

		addbtn.setActionCommand("addbtn"); // 增加学生按钮
		addbtn.addActionListener(this);
		addbtn1.setActionCommand("addbtn1"); // 增加成绩按钮
		addbtn1.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getActionCommand().equals("teainfobtn"))
		{
			card.show(cardpanel, "1");
		}
		else if (e.getActionCommand().equals("teainfoupbtn"))
		{
			card.show(cardpanel, "2");
		}
		else if (e.getActionCommand().equals("stuinfobtn"))
		{
			card.show(cardpanel, "3");
		} 
		else if (e.getActionCommand().equals("gradebtn"))
		{
			card.show(cardpanel, "4");
		} 
		else if (e.getActionCommand().equals("exitbtn"))
		{// 退出
			this.setVisible(false);
			EnterMainFrame frame1 = new EnterMainFrame();
			frame1.setVisible(true);
		}
		else if (e.getActionCommand().equals("upbtn"))
		{// 修改老师信息功能
			name = jtname.getText().trim();
			sex = jtsex.getText().trim();
			dept = jtdept.getText().trim();
			pwd = jtpwd.getText().trim();
			String message = "确定修改" + name + "的信息";
			int resOne = JOptionPane.showConfirmDialog(this, message, "修改信息", JOptionPane.OK_CANCEL_OPTION);
			System.out.println(JOptionPane.OK_CANCEL_OPTION);
			if (resOne == 0)
			{
				try
				{
					sql = "update NewTeacher set Sname='" + name + "',Ssex='" + sex + "',Sdept='" + dept
							+ "',Password='" + pwd + "' where ID='" + number + "'";
					Statement stmt = ct.createStatement();
					int num = stmt.executeUpdate(sql);
					this.setVisible(true);
					if (num >= 1)
					{
						System.out.print("执行executeUpdate成功");
					} else
					{
						System.out.print("执行executeUpdate失败");
					}

				} catch (Exception x)
				{
					x.printStackTrace();
				}
			}
		}
		else if (e.getActionCommand().equals("addbtn"))
		{// 增加学生信息功能
			AddteaFrame frame = new AddteaFrame();
			frame.setVisible(true);
		} 
		else if (e.getActionCommand().equals("addbtn1"))
		{// 增加成绩功能
			AddstuFrame frame = new AddstuFrame();
			frame.setVisible(true);
		}
	}

	public TeacherMainFrame(String number, String name)
	{
		this.name = name;
		this.number = number;
		this.setTitle("您好！" + name + "老师");
		this.setSize(1366, 768);
		this.setLayout(new BorderLayout());
		jp2 = new JPanel(new GridLayout(1, 3, 2, 1));
		// 卡片布局
		card = new CardLayout();
		cardpanel = new JPanel(card);
		cardpanel.add("1", teainfojp());
		cardpanel.add("2", teainfoupjp());
		cardpanel.add("3", stuinfojp());
		cardpanel.add("4", gradejp());
		teainfobtn = new JButton("个人信息");
		stuinfobtn = new JButton("学生信息");
		teainfoupbtn = new JButton("修改个人信息");
		gradebtn = new JButton("学生成绩");
		exitbtn = new JButton("退出");
		// stuinfoupbtn=new JButton("修改学生信息");
		// gradeupbtn=new JButton("修改学生成绩");
		jp2.add(teainfobtn);
		jp2.add(teainfoupbtn);
		jp2.add(stuinfobtn);
		jp2.add(gradebtn);
		jp2.add(exitbtn);
		Listener();
		this.add(jp2, BorderLayout.NORTH);
		this.add(cardpanel, BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}