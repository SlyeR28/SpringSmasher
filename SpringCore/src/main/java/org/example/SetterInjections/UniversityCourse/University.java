package org.example.SetterInjections.UniversityCourse;

import java.util.List;
import java.util.Map;

public class University {
    private String name;
    private List<Course> courseList;
    private   Map<String , String> contactDetails;
    private Dean dean;

    public Map<String, String> getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Map<String, String> contactDetails) {
        this.contactDetails = contactDetails;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Dean getDean() {
        return dean;
    }

    public void setDean(Dean dean) {
        this.dean = dean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("University Name: " + name);

        if (dean != null) {
            System.out.println("Dean: " + dean.getName() + " (" + dean.getExperience() + " years experience)");
        }

        System.out.println("\nContact Details:");
        if (contactDetails != null) {
            for (Map.Entry<String, String> entry : contactDetails.entrySet()) {
                System.out.println(" - " + entry.getKey() + ": " + entry.getValue());
            }
        }

        System.out.println("\nCourses Offered:");
        if (courseList != null) {
            for (Course course : courseList) {
                System.out.println(" → " + course.getTitle() + " [" + course.getDuration() + " months]");
                System.out.println("    Instructors:");
                if (course.getInstructors() != null) {
                    for (Instructor instructor : course.getInstructors()) {
                        System.out.println("     - " + instructor.getName() + " (" + instructor.getSubject() + ")");
                    }
                }
            }
        }
    }

}
