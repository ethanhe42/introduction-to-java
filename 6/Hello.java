import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.Rectangle;

public class Hello
    extends JFrame {
  JLabel jLabel1 = new JLabel("��������Ҫ��ѯ�����У�");
  JScrollPane jScrollPane1 = new JScrollPane();
  JTextArea jTextArea1 = new JTextArea();
  JButton jButton1 = new JButton("��ѯ");
  JButton jButton2 = new JButton("���");
  JLabel jLabel2 = new JLabel("��ѯ״̬��");
  JScrollPane jScrollPane2 = new JScrollPane();
  JTextArea jTextArea2 = new JTextArea();
  JLabel jLabel3 = new JLabel("��ѯ�����");
  JScrollPane jScrollPane3 = new JScrollPane();
  DefaultTableModel jTableModel1 = new DefaultTableModel(); //������ģ�����
  JTable jTable1 = new JTable(jTableModel1); //���������
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
    setTitle("����ʡ��������Ԥ����ѯϵͳ");
    setLocation(200, 200);
    setSize(640, 340);
    setVisible(true);
  }

  public static void main(String[] args) {
    new Hello();
  }

  class weafore_jButton1_actionAdapter
      implements ActionListener { //"�ݽ�"��ť�¼�ʧ����
    public void actionPerformed(ActionEvent e) {
      try {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); //JDBC-ODBC�������ó���
        Connection con = DriverManager.getConnection("jdbc:odbc:tqyb"); //ʹ��JDBC URL��������
		Statement stmt = con.createStatement(); 
		String str=jTextArea1.getText();
		str='\''+str+'\'';
        ResultSet rs = stmt.executeQuery("select*from weatherforecast where [����]="+str); //ִ��SQL��ѯ���õ������
        ResultSetMetaData rsmd = rs.getMetaData(); //ȡ�ý������Ԫ����
        jTableModel1.setRowCount(0); //�����������ԭ����
        jTableModel1.setColumnCount(0); //�����������ԭ����
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
          jTableModel1.addColumn(rsmd.getColumnLabel(i)); //��ӱ��������б���
        }
        String data[] = new String[rsmd.getColumnCount()];
        while (rs.next()) {
          for (int i = 1; i <= rsmd.getColumnCount(); i++) {
            data[i - 1] = rs.getString(i); //ȡ�����ݿ���һ����¼
          }
          jTableModel1.addRow(data); //��ӱ�������һ������
        }
        stmt.close(); //�ر�������
        con.close(); //�ر����Ӷ���
        jTextArea2.setText(""); //��ʾ״̬��Ϣ
      }
      catch (Exception ex) {
        jTextArea2.setText(ex.getMessage());
      }
    }
  }

  class weafore_jButton2_actionAdapter
      implements ActionListener { //"���"��ť�¼�ʧ����
    public void actionPerformed(ActionEvent e) {
      jTextArea1.setText("");
      jTextArea2.setText("");
	  jTableModel1.setRowCount(0); //�����������ԭ����
      jTableModel1.setColumnCount(0); //�����������ԭ����
    }
  }

  class weafore_this_windowAdapter
      extends WindowAdapter { //���ڰ�ť�¼�ʧ����
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
  }
}
