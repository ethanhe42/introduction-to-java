package Weather;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Weather {
	private String city;
	
	public Weather(String city) {
		super();
		this.city = city;
	}
	
	public String search(){ // 查询
	String weather = null;
	try {
		Class.forName("org.sqlite.JDBC");
		Connection con=
				DriverManager.getConnection(
						"jdbc:sqlite://c://Users//Rex//Documents//GitHub//hello//src//123.db3"
						);
		PreparedStatement ps=
				con.prepareStatement(
"SELECT * FROM tianqi WHERE city=\""+city+"\""); // 
		ResultSet rs=ps.executeQuery();
		if(rs.next()){
			weather = rs.getString(2);

		}else{
			weather = "no this city";
		}
		
		ps.close();
		con.close();
	} catch (Exception e) {
		weather = "no this city";
	}
	return weather;
}
	
}
