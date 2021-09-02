package com.example.employeelist;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.Statement;

@Repository
public class EmpRepositroy{
    @Autowired
    JdbcTemplate jdbcTemplate;


    public void insertNewEmployeeToDatabase(String name, String id, String companyname) {
        String sql = "INSERT INTO employee(name,id,companyname) VALUES(?,?,?)";
        Object params[] = new Object[] {name,id,companyname};
        jdbcTemplate.update(sql,params);

    }
    public String EmpRepositroy(String id) throws Exception{
        String sql="select * from employee where id='"+id+"'";
        Statement stm=null;
        ResultSet resultSet = stm.executeQuery(sql);
        while (resultSet.next()){
            Employee.setName(resultSet.getString(1));
            Employee.setId(resultSet.getString(2));
            Employee.setCompanyname(resultSet.getString(3));
            return Employee.name + Employee.id + Employee.companyname ;

        }
        return sql;
    }
}
