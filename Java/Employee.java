/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author student
 */
public class Employee {
    private String empNAME;
    private int empID;
    private int empAGE;
    private int empSALARY;
    
    Employee() {
        empNAME = "New Employee";
        empID = 10000;
        empAGE = 17;
        empSALARY = 10000;
    }
    
    Employee(String str, int num1, int num2, int num3) {
        empNAME = str;
        empID = num1;
        empAGE = num2;
        empSALARY = num3;
    }
    
    public String getName() {
        return empNAME;
    }
    
    public void setName(String empNAME) {
        this.empNAME = empNAME;
    } 
    
    public int getId() {
        return empID;
    }
    
    public void setId(int empID) {
        this.empID = empID;
    } 
    public int getAge() {
        return empAGE;
    }
    
    public void setAge(int empAGE) {
        this.empAGE = empAGE;
    } 
    public int getSalary() {
        return empSALARY;
    }
    
    public void setSalary(int empSALARY) {
        this.empSALARY = empSALARY;
    } 
    
    public static void main(String[] args) {
        
        Employee rune = new Employee();
        System.out.println("Employee Name is: " + rune.getName());
        System.out.println("Employee ID is: " + rune.getId());
        System.out.println("Employee Age is: " + rune.getAge());
        System.out.println("Employee Salary is: " + rune.getSalary());
        
        Employee rune1 = new Employee("Gerson de Ocampo", 201880491, 17, 50000);
        System.out.println("Employee Name is: " + rune1.getName());
        System.out.println("Employee ID is: " + rune1.getId());
        System.out.println("Employee Age is: " + rune1.getAge());
        System.out.println("Employee Salary is: " + rune1.getSalary());
    }
}
