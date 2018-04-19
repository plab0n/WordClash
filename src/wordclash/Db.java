/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordclash;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Db {
     public boolean ache;
     public String url = "jdbc:mysql://127.0.0.1:3306/wordclash_db";
     public String usr = "root";
     public String pass = "";
     public Connection conn;
     public static String name;
     public Statement stt;
     public ResultSet res;
     public PreparedStatement pst;
    public boolean check(String word) throws ClassNotFoundException {
       
                                try {
                                    Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection(url,usr,pass);
				stt = conn.createStatement();
				res = stt.executeQuery("select * from word_tb");
				  
				while(res.next())
				{
					String k = (String)res.getString("word");
                                        if(k.equals(word))
					{
						JOptionPane.showMessageDialog(null,"SUCCESS");
						return true;
					}
                                    
				}
                             
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
                                
                                return false;
    }
    public void log_in(String name1)
    {
        name = name1;
        try {
                                    Class.forName("com.mysql.jdbc.Driver");
				 conn = DriverManager.getConnection(url,usr,pass);
				 stt = conn.createStatement();
                                  res = stt.executeQuery("select * from user");
				 
                                 
				while(res.next())
				{
					String k = (String)res.getString("user_name");
                                        if(k.equals(name) || k.equals(name.toLowerCase()))
					{
                                                ache = true;
					}
                                    
				}
                                if(!ache)
                                {
                                    String sc = "0";
                                 String lev ="0";
                                String query1 = "INSERT INTO user(user_name,score) VALUES ('"+name+"','"+sc+"')";
                                stt.executeUpdate(query1);
                                 stt.close();
                                    conn.close();
                                     new GameDemo();
                                }
                                else{
                                     new GameDemo();
                      }
                                 
              }catch(Exception e)
              {
                  e.printStackTrace();
              }
    }
    public void update_score(String score) throws SQLException
    {
         try {
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection(url,usr,pass);
				 stt = conn.createStatement();
                                  String sql = "UPDATE user " +
                   "SET score = '"+score+"' WHERE user_name='" +name+"'";
                     stt.executeUpdate(sql);
                     String Q = "SELECT * FROM user where user_name='" + name +"'ORDER BY score DESC";
                   
                     stt.execute(Q);
                    
                     new GameOver(name,score);
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(Db.class.getName()).log(Level.SEVERE, null, ex);
         }
				
    }
}


