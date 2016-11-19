import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.Rectangle;

public class Hello
    extends JFrame {
  JLabel jLabel1 = new JLabel("请输入所要查询的县市：");
  JScrollPane jScrollPane1 = new JScrollPane();
  JTextArea jTextArea1 = new JTextArea();
  JButton jButton1 = new JButton("查询");
  JButton jButton2 = new JButton("清除");
  JLabel jLabel2 = new JLabel("查询状态：");
  JScrollPane jScrollPane2 = new JScrollPane();
  JTextArea jTextArea2 = new JTextArea();
  JLabel jLabel3 = new JLabel("查询结果：");
  JScrollPane jScrollPane3 = new JScrollPane();
  DefaultTableModel jTableModel1 = new DefaultTableModel(); //构造表格模板组件
  JTable jTable1 = new JTable(jTableModel1); //构造表格组件
  public Hello() {
    getContentPane().setLayout(null);
    jLabel1.setBounds(new Rectangle(19, 25, 150, 38));
    jScrollPane1.setBounds(new Rectangle(160, 30, 70, 35));
    jButton1.setBounds(new Rectangle(240, 30, 72, 33));
    jButton1.addActionListener(new weafore_jButton1_actionAdapter());
    jButton2.setBounds(new Rectangle(330, 30, 72, 33));
    jButton2.addActionListener(new weafore_jButton2_actionAdapter());
    jLabel2.setBounds(new Rectangle(22, 120, 67, 28));
    jScrollPane2.setBounds(new Rectangle(89, 123, 324, 41));
    jScrollPane1.getViewport().add(jTextArea1);
    jScrollPane2.getViewport().add(jTextArea2);
    jLabel3.setBounds(new Rectangle(23, 167, 80, 21));
    jScrollPane3.setBounds(new Rectangle(22, 198, 600, 100));
    jScrollPane3.getViewport().add(jTable1);
    getContentPane().add(jLabel1);
    getContentPane().add(jScrollPane1);
    getContentPane().add(jButton1);
    getContentPane().add(jButton2);
    getContentPane().add(jLabel2);
    getContentPane().add(jScrollPane2);
    getContentPane().add(jLabel3);
    getContentPane().add(jScrollPane3);

    addWindowListener(new weafore_this_windowAdapter());
    setTitle("陕西省县市天气预报查询系统");
    setLocation(200, 200);
    setSize(640, 340);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Hello();
  }

  class weafore_jButton1_actionAdapter
      implements ActionListener { //"递交"按钮事件失配器
    public void actionPerformed(ActionEvent e) {
      try {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //JDBC-ODBC桥驱动该程序
        Connection con = DriverManager.getConnection("jdbc:odbc:tqyb"); //使用JDBC URL建立连接
		Statement stmt = con.createStatement(); 
		String str=jTextArea1.getText();
		str='\''+str+'\'';
        ResultSet rs = stmt.executeQuery("select*from weatherforecast where [县市]="+str); //执行SQL查询语句得到结果集
        ResultSetMetaData rsmd = rs.getMetaData(); //取得结果集的元数据
        jTableModel1.setRowCount(0); //清除表格组件的原有行
        jTableModel1.setColumnCount(0); //清除表格组件的原有列
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
          jTableModel1.addColumn(rsmd.getColumnLabel(i)); //添加表格组件的列标题
        }
        String data[] = new String[rsmd.getColumnCount()];
        while (rs.next()) {
          for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            data[i - 1] = rs.getString(i); //取得数据库表的一条记录
          }
          jTableModel1.addRow(data); //添加表格组件的一行数据
        }
        stmt.close(); //关闭语句对象
        con.close(); //关闭连接对象
        jTextArea2.setText(""); //显示状态信息
      }
      catch (Exception ex) {
        jTextArea2.setText(ex.getMessage());
      }
    }
  }

  class weafore_jButton2_actionAdapter
      implements ActionListener { //"清除"按钮事件失配器
    public void actionPerformed(ActionEvent e) {
      jTextArea1.setText("");
      jTextArea2.setText("");
	  jTableModel1.setRowCount(0); //清除表格组件的原有行
      jTableModel1.setColumnCount(0); //清除表格组件的原有列
    }
  }

  class weafore_this_windowAdapter
      extends WindowAdapter { //窗口按钮事件失配器
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
  }
}
