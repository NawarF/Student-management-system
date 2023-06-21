
package main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class University {
    
  List<Student> list = new ArrayList<Student>();
     
  
    public Boolean Add(Scanner r){
        
        Student std = new Student();
        System.out.println("Enter Student Information ...");
        System.out.print("Enter Student Number : ");
        try{
        int number=r.nextInt();
        
        if(this.isExsit(number)){
             std.setStd_number(number);
        }else{
          
             System.out.println("Student has been Exist !");
               System.out.println("------------------------------------------------");
            return false;
        }
        
        System.out.print("Enter Student Name : ");
        std.setFirstName(r.next());
        
        System.out.print("Enter Student Nike Name : ");
        std.setNikeName(r.next());
        
        list.add(std);
        
        System.out.println("The information has been added seccessfully .");
      //  System.out.println("------------------------------------------------");
       // return true;
        }
        
        catch(InputMismatchException e){
            System.out.println("Please enter a correct value ...");
        }
        
        System.out.println("------------------------------------------------");
        return true;
    }

    
       public boolean isExsit(int number){
            for(Student std:list){
            if(std.getStd_number()== number)
                return false;
        }
        return true;
    }
    public void Display(){
        
        if(!list.isEmpty()){
            System.out.println("--------------------Student Information--------------------\n");
      System.out.println("Student Number" +"              "+"First Name"+"              "+ "Nike Name" ); 
            for(Student obj : list){
            System.out.println(obj);
            }   
            
    }else{
        System.out.println("There is no data to display !");
}    System.out.println("-----------------------------");
    }
    
    
    public void Search(Scanner r){
        try{
        if(!list.isEmpty()){
         System.out.print("Enter Student Number : ");
        int number=r.nextInt();
      Student student = this.getStudentByNum(number);
      if(student ==null){
          System.out.println("Student not found !!");
      }else{
           System.out.println("--------------------Student Information--------------------\n");
          System.out.println("Student Number" +"          "+"First Name"+"          "+ "Nike Name" ); 
          System.out.println(student);
      }}else{
            System.out.println("There is no data  !"); }
        }
        catch(InputMismatchException e){
                System.out.println("Please enter a correct value..");
                }
   System.out.println("--------------------------------------");
     
    }
  
    public Student getStudentByNum(int number){
       for(Student std:list){
           if(std.getStd_number()== number){
               return std;
           }
       }
       return null;
    }
    
    
    
    
    public void Edit(Scanner r){
        try{
             if(!list.isEmpty()){
          System.out.print("Enter Student's Number : ");
                 int number = r.nextInt();
                  Student found_std  = this.getStudentByNum(number);
                if(found_std == null){
                     System.out.println("Student is not found!\n");
                     }    else{
                       System.out.println("Enter New Information :"+"\n");
                       System.out.print("Enter New Student Name :");
                       String new_name =r.next();
                       System.out.print("Enter New Student Nike Name :");
                       String new_nikename =r.next();
                       found_std.setFirstName(new_name);
                       found_std.setNikeName(new_nikename);
                       System.out.println("The information has been updated successfully .");
                        // System.out.println("-----------------------------");
                                        }
                         }
                      else{
                      System.out.println("There is no data");} }
        
           catch(InputMismatchException e){
                System.out.println("Please enter a correct value..");
                }
        
               System.out.println("-----------------------------");
    }
    
    public void Delete(Scanner r){
        try{
        if(!list.isEmpty()){
          System.out.print("Enter Student Number : ");
        int number=r.nextInt();
        Student std  = this.getStudentByNum(number);
        if(std == null){
            System.out.println("Student not found !!");
        }else{
             list.remove(std);
            System.out.println("The student has been successfully deleted.");
        }
    }   else{
                      System.out.println("There is no data");} }
        
           catch(InputMismatchException e){
                System.out.println("Please enter a correct value..");
                }
    
     System.out.println("-----------------------------");
    }
    
    
    
    
    
    
    
    
}
