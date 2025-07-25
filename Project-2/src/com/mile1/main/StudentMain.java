package com.mile1.main;
	import com.mile1.bean.Student;
	import com.mile1.exception.*;
	import com.mile1.service.*;

	public class StudentMain {
	    static Student[] data = new Student[4];

	    static {
	        data[0] = new Student("Sekar", new int[]{85, 75, 95});
	        data[1] = new Student(null, new int[]{11, 22, 33});
	        data[2] = null;
	        data[3] = new Student("Manoj", null);
	    }

	    public static void main(String[] args) {
	        StudentReport sr = new StudentReport();
	        StudentService ss = new StudentService();

	        for (Student s : data) {
	            try {
	                String result = sr.validate(s);
	                if (result.equals("VALID")) {
	                    System.out.println("Grade = " + sr.findGrades(s));
	                }
	            } catch (NullNameException | NullMarksArrayException | NullStudentObjectException e) {
	                e.printStackTrace();
	            }
	        }

	        System.out.println("Number of Null Marks array: " + ss.findNumberOfNullMarksArray(data));
	        System.out.println("Number of Null Names: " + ss.findNumberOfNullName(data));
	        System.out.println("Number of Null Objects: " + ss.findNumberOfNullObjects(data));
	    }
	}


