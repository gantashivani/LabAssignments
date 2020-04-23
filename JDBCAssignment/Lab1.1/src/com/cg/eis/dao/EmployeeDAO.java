package com.cg.eis.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import com.cg.eis.bean.EmployeeBean;

public class EmployeeDAO implements EmployeeDaol {
	
	public int addEmployee(EmployeeBean employeeBean) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = EmployeeDB.getConnection1();
			String ins_str = "insert into employee values(?,?,?,?,?)";
			pstmt = con.prepareStatement(ins_str);
			pstmt.setInt(1, employeeBean.getEmpId());
			pstmt.setString(2, employeeBean.getEmpName());
			pstmt.setString(3, employeeBean.getEmpDesg());
			pstmt.setString(4, employeeBean.getScheme());
			pstmt.setFloat(5, employeeBean.getEmpSal());
			int updateCount = pstmt.executeUpdate();
			assertNotNull(updateCount);
			con.close();
			return updateCount;
		} catch (Exception ex) {
			System.out.println(ex);
			return 0;
		}
	}

	public ArrayList getEmployeeDetailsById(int empId) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		con = EmployeeDB.getConnection1();

		String sel_str = "Select empName,empSal,empDesg from book where empId=?";

		pstmt = con.prepareStatement(sel_str);
		pstmt.setInt(1, empId);
		rs = pstmt.executeQuery();

		ArrayList result = new ArrayList();
		if (rs.next()) {
			result.add(rs.getString(1));
			result.add(rs.getString(2));
			result.add(rs.getString(3));

		} else {
			result.add("Invalid Id");
		}
		return result;

	}

	public ResultSet searchEmployee(int empId) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		con = EmployeeDB.getConnection1();
		String ins_str = "select * from employee where empId=?";
		pstmt = con.prepareStatement(ins_str);
		pstmt.setInt(1, empId);
		ResultSet empinfo = pstmt.executeQuery();
		return empinfo;

	}
@Test
	public int updateEmployee(int empId) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		con = EmployeeDB.getConnection1();
		System.out.println("enter employee name");
		Scanner sc = new Scanner(System.in);
		String empName = sc.next();
		String ins_str = "update employee set empName=? where empId=?";
		pstmt = con.prepareStatement(ins_str);
		pstmt.setString(1, empName);
		pstmt.setInt(2, empId);
		int update = pstmt.executeUpdate();
		int update1 = 0;
		assertSame(update, update1);
		return update;

	}

	public ResultSet showEmployee() throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		con = EmployeeDB.getConnection1();
		String ins_str = "select * from employee";
		pstmt = con.prepareStatement(ins_str);
		ResultSet show = pstmt.executeQuery();
		return show;
	}

	public int deleteEmployee(int empId) throws Exception {
		Connection con = null;
		PreparedStatement pstmt = null;
		con = EmployeeDB.getConnection1();
		String ins_str = "delete from employee where empId=?";
		pstmt = con.prepareStatement(ins_str);
		pstmt.setInt(1, empId);
		int delete = pstmt.executeUpdate();
		con.close();
		return delete;
		
	}
}
