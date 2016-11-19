## 6
### 1.有哪些常用数据库管理软件？
MYSQL, Access, Foxpro, Oracle , DB2 , Informix, Sybase, SQL Server, JDataStore, HSQL, H2SQL
### 2.请简单描述SQL语言的语法。
```sql
CREATE DATABASE database_name --建立数据库
DROP DATABASE database_name -- 删除数据库
CREATE TABLE table_name(-- 表的建立
	column_name1 data_type1,
	column_name1 data_type1
	)
ALTER TABLE table_name ADD column_name datatype -- 添加字段
ALTER TABLE table_name DROP COLUMN column_name -- 删除字段
DROP TALBE -- 删除表
CREATE VIEW view1 AS subquery --建立视图
DROP VIEW view1 -- 删除视图
SELECT select_list INTO new_table FROM table_source WHERE search___condition1 GROUP BY expression HAVING search_option2 ORDER BY order_expression ASC -- 查询字段
INSERT INTO table_name VALUES value1, value2 -- 对表添加一行数据
INSERT INTO table_name column1, column2 VALUES value1, value2 -- 对指定字段添加数据
UPDATE table_name SET column_name = new_value WHERE column_name = some_value -- 修改数据
DELETE FROM table_name WHERE column_name = some_value -- 删除数据
GRANT system_priv TO user -- 授予权限
REVOKE system_priv FROM user -- 回收权限
```
### 3.请简单描述JApplet类的设计方法和标准函数。
Applet小程序运行之前先产生对象，蚺后进入生命周期，这期间主要设计applet类或Japplet子类的init，start，stop，destory。start一般运行多次。当所在的浏览器转入其他页面，立刻执行stop。重新激活时，又调用start。浏览器关闭时，调用destory。

Applet 即是组件，又是容器，默认为flowlayout，可以完成图像，声音，动画等功能。JApplet的内容窗格使用BorderLayout。

JApplet标准函数：
- Applet() // 创建对象
- init（） //初始化
- start //applet 处于激活状态时首先应该执行的任务
- stop // applet 处于非激活状态时首先应该执行的任务
- destory // 销毁
- getAppletContext（） // 允性环境
- getAudioClip（url） // 返回音频剪辑指定对象
- getAudioClip（url,name） // 返回音频剪辑指定对象
- play（url） //播放
- play（url, name） //播放
- getCodebase（）//返回url
- getDocumentBase()
- getImage（url）//图片
- getImage（url, name）//图片
- getParameter(name) // return params value
- isActive() //
- newAudioClip(url) // 从url获取audioclip对象
- resize（）//调整大小
- showStatus（）//现实msg信息
- protected  void	addImpl(Component comp, Object constraints, int index) //添加指定的子 Component。
- protected  JRootPane	createRootPane() 
          //构造方法调用此方法创建默认 rootPane。
- AccessibleContext	getAccessibleContext() 
         // 获取与此 JApplet 关联的 AccessibleContext。
- Container	getContentPane() 
         // 返回此 applet 的 contentPane 对象。
- Component	getGlassPane() 
        //  返回此 applet 的 glassPane 对象。
- Graphics	getGraphics() 
         // 为组件创建一个图形上下文。
- JMenuBar	getJMenuBar() 
        //  返回此 applet 上的菜单栏设置。
- JLayeredPane	getLayeredPane() 
         // 返回此 applet 的 layeredPane 对象。
- JRootPane	getRootPane() 
         // 返回此 applet 的 rootPane 对象。
- TransferHandler	getTransferHandler() 
          //获取 transferHandler 属性。
- protected  boolean	isRootPaneCheckingEnabled() 
          //返回是否将对 add 和 setLayout 的调用转发给 contentPane。
- protected  String	paramString() 
          //返回此 JApplet 的字符串表示形式。
- void	remove(Component comp) 
          //从容器中移除指定的组件。
- void	repaint(long time, int x, int y, int width, int height) 
          //在 time 毫秒内重绘此组件的指定矩形区域。
- void	setContentPane(Container contentPane) 
          //设置 contentPane 属性。
- void	setGlassPane(Component glassPane) 
          //设置 glassPane 属性。
- void	setJMenuBar(JMenuBar menuBar) 
          //设置此 applet 的菜单栏。
- void	setLayeredPane(JLayeredPane layeredPane) 
          //设置 layeredPane 属性。
- void	setLayout(LayoutManager manager) 
          //设置 LayoutManager。
- protected  void	setRootPane(JRootPane root) 
          //设置 rootPane 属性。
- protected  void	setRootPaneCheckingEnabled(boolean enabled) 
          //设置是否将对 add 和 setLayout 的调用转发给 contentPane。
- void	setTransferHandler(TransferHandler newHandler) 
          //设置 transferHandler 属性，该属性是支持将数据传输到此组件的机制。
- void	update(Graphics g) 
          //调用 paint(g)。
