package com.example.employeelist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {
    @Autowired
    EmpModel empmodelobj;
    @Autowired
    EmpRepositroy empRepositroy;
    @RequestMapping(value="/main")
    public String mainPage(){
        return "YOU ARE IN MAIN";
    }

    @RequestMapping("/add")
    public String addNewEmployee(@RequestParam(value = "name") String name, @RequestParam(value = "id") String id, @RequestParam(value = "companyname") String companyname)
    {
        empRepositroy.insertNewEmployeeToDatabase(name,id,companyname);
        return "details addedd";
    }





    @PostMapping("/details")
    public Employee employeedetails(@RequestBody Employee Employee){
        System.out.println("details "+ Employee);
        empRepositroy.insertNewEmployeeToDatabase(Employee.getName(), Employee.getId(), Employee.getCompanyname());
        return Employee;

    }
}
