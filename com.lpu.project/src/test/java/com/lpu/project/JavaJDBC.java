package com.lpu.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 1)Start RDBMS MySql
 * 2)Add dependency - MySql Driver  -> https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.32
 * 3)Update Project
 * 
 * To interact DBMS using Java 
 * 1)Register Driver
 * 2)Create Connection
 * 3)Create SQL statement
 * 4)Execute SQL statement
 * 5)Closing Connection
 * 
 */
public class JavaJDBC {
	private final String USER="root";
	private final String PASSWD="";
	private final String DBURL="jdbc:mysql://localhost:3306/empbulleseye?autoReconnect=true&useSSL=false";

	void createDB(String dbName) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1)Register Driver
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			String url="jdbc:mysql://localhost:3306?autoReconnect=true&useSSL=false";
			Connection con=DriverManager.getConnection(url,USER,PASSWD);//2)Create Connection
			String query="create database "+dbName;
			Statement stm=con.createStatement();//3)Create SQL statement
			stm.execute(query);//4)Execute SQL statement
			System.out.println(dbName+" Database Created Sucessfully ....");
			stm.close();//5)Closing Connection
			con.close();//5)Closing Connection
		}
		catch(SQLException e) {e.printStackTrace();}
	}
	
	void createTbl(String tblName) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1)Register Driver
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection(DBURL,USER,PASSWD);){
			String query="create table "+tblName+"(id int(3),name varchar(255))";
			Statement stm=con.createStatement();
			stm.executeUpdate(query);
			System.out.println(tblName+" created sucessfully in DB...");
		}catch(SQLException e) {e.printStackTrace();}
	}
	
	void insertTbl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1)Register Driver
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection(DBURL,USER,PASSWD);){
			String query="insert into emp values(1,'Anirudha'),(2,'Amisha'),(3,'Prashant'),(4,'Ankit'),(5,'Amyra')";
			Statement stm=con.createStatement();
			stm.executeUpdate(query);
			System.out.println(" Data inserted into table sucessfully...");
		}catch(SQLException e) {e.printStackTrace();}
	}
	
	void fetchTbl() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1)Register Driver
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(Connection con=DriverManager.getConnection(DBURL,USER,PASSWD);){
			String query="select * from emp";
			Statement stm=con.createStatement();
			ResultSet rs=stm.executeQuery(query);
			while(rs.next()) {
				System.out.println("Employee Id : "+rs.getInt("id"));
				System.out.println("Employee Name : "+rs.getString("name"));
			}
		}catch(SQLException e) {e.printStackTrace();}
		
	}
	public static void main(String[] args) {
	JavaJDBC obj=new JavaJDBC();
	//obj.createDB("empbulleseye");
	//obj.createTbl("emp");
	//obj.insertTbl();
	//obj.fetchTbl();
	obj.insert_PreparedStatement();
	}//main

	void insert_PreparedStatement() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1)Register Driver
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection(DBURL,USER,PASSWD);){
			String query1="select * from emp";
			String query2="insert into emp values(?,?)";
			PreparedStatement pstm=con.prepareStatement(query2);
			pstm.setInt(1, 6);
			pstm.setString(2,"Isha");
			int rowCount=pstm.executeUpdate();
			System.out.println("Inserted "+rowCount+" row in table");
			ResultSet rs=pstm.executeQuery(query1);
			while(rs.next()) {
				System.out.println("Employee Id : "+rs.getInt("id"));
				System.out.println("Employee Name : "+rs.getString("name"));
			}
		}catch(SQLException e) {e.printStackTrace();}
		
	}
}//JavaJDBC
