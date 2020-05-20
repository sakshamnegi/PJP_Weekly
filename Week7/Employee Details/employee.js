var employees = [];
var m = {name : "Anna" , id : "1239AB", department :"Design"};
var empNameField = document.getElementById("emp_name");
var empIdField = document.getElementById("emp_id");
var empDepField = document.getElementById("emp_department");
var successAlert = document.getElementById("success_alert");
var table = document.getElementById("table");
var tableBody = document.getElementById("table_body");
var emptyAlert = document.getElementById("empty_alert");
var searchEmpField = document.getElementById("employee_to_search");
var showSpecific = document.getElementById("show_specific_details");

var submitDetails = document.getElementById("submit_employee");
submitDetails.addEventListener("click",function(){
    var empName = empNameField.value;
    var empId = empIdField.value;
    var empDep = empDepField.value;
    if(validateAllFields()==true){
        employees.push(createEmployeeJsonObject(empName,empId,empDep));
        successAlert.style.display = 'block';
        setTimeout(function(){successAlert.style.display= 'none';},2000);
        table.style.display = 'none';
        empNameField.value = "";
        empIdField.value = "";
        empDepField.value = "";

    }
    
})

function validateAllFields(){
    if(empNameField.value =="" || empIdField.value =="" || empDepField.value ==""){
        alert("Please enter all details");
        return false;
    }
    else{
        return true;
    }

}

function createEmployeeJsonObject(empName, empId, empDep){
    var newEmp = {name: empName, id: empId, department: empDep};
    return newEmp;
}



var showAll = document.getElementById("show_all_details");
showAll.addEventListener("click", function(){
    tableBody.innerHTML = "";
    if(employees.length==0){
        emptyAlert.style.display = 'block';
        setTimeout(function(){emptyAlert.style.display= 'none';},2000);
    }
    else{
        table.style.display = 'table';
        var innerHTML="";
        for(var i=0; i<employees.length; i++){
            innerHTML = innerHTML + "<tr> <th scope=\"row\">" + (i+1)+ "</th><td>"+ employees[i].name
            +"</td> <td>" + employees[i].id + "</td> <td>"+ employees[i].department + " </td> </tr>";

        }
        tableBody.innerHTML = innerHTML;
    }

});

showSpecific.addEventListener("click", function(){
    var html="";
    table.style.display = 'none';
    var empToSearch = searchEmpField.value;
    tableBody.innerHTML = "";
    var flag = false;
    var j=1;
    for(var i=0; i<employees.length; i++){
        if(employees[i].name==empToSearch){
            flag = true;
            html = html + "<tr> <th scope=\"row\">" + (j++)+ "</th><td>"+ employees[i].name
        +"</td> <td>" + employees[i].id + "</td> <td>"+ employees[i].department + " </td> </tr>";
           

        }
        
    }
    if(flag == false){
        emptyAlert.style.display = 'block';
        setTimeout(function(){emptyAlert.style.display= 'none';},2000);
    }
    else{
        tableBody.innerHTML = html;
        table.style.display = 'table';
    }
    searchEmpField.value = "";

});
