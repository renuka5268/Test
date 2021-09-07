const { response } = require('express');
const express = require('express');
var mysql      = require('mysql');
const app = express();
app.use(express.json())

var connection = mysql.createConnection({
    host     : 'localhost',
    user     : 'root',
    password : 'Renu@123',
    database : 'contactlistnode'
  });
   
  connection.connect();

app.post("/api/addcontact",function(req,res){
    let name=req.body.name;
    let phonenumber=req.body.phonenumber;
    let email=req.body.email;
    let contact= {
       name : name,
       phonenumber : phonenumber,
       email : email

    }
   connection.query('INSERT INTO contact SET ? ', contact, function (error, results, fields) {
    if (error) throw error;
    res.send("successfully added contact");
  });

   
});

app.get("/api/searchcontact",function(req,res){
    let email=req.body.email;
    connection.query('SELECT * FROM contact WHERE email = ?', [email], function (error, results, fields) {
        if (error) throw error
        res.send(results);

       
    });
});
app.post("/api/updatecontact",function(req,res){
    let name=req.body.name;
    let email=req.body.email;
    let phonenumber=req.body.phonenumber;
    connection.query('UPDATE contact SET name = ?, email = ? WHERE phonenumber = ?',[name,email,phonenumber], function (error, results, fields) {
        if (error) throw error;
    
        res.send(results);
       
       
    });
});
app.get("/api/deletecontact",function(req,res){
    let email=req.body.email;
    connection.query("DELETE FROM contact WHERE email = ?",email, function (error, results) {  
        if (error) throw error;
        console.log(results);
        res.send("successfully deleted");
       
    });
});
app.listen(8080,function(){

    console.log("The server is listening at port 8080");
    console.log("Link is : http://localhost:8080/")
});