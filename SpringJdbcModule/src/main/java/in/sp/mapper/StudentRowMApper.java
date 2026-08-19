package in.sp.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.sp.beans.Student;

public class StudentRowMApper implements RowMapper<Student>{
	
	public Student mapRow(ResultSet rs,int rownum) throws SQLException{
		Student std=new Student();
		std.setRollno(rs.getInt("rollno"));
		std.setName(rs.getString("stdName"));
		std.setMarks(rs.getFloat("stdMarks"));
		return std;
		
	}

}
