package seu.domain;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private int studentId;
    private String studentName;
    private int classId;
    private int dormitoryId;
    private int balance;

    public int getStuentId() { return studentId; }

    public void setStuentId(int stuentId) { this.studentId = stuentId; }

    public String getStudentName() { return studentName; }

    public void setStudentName(String studentName) { this.studentName = studentName; }

    public int getClassId() { return classId; }

    public void setClassId(int classId) { this.classId = classId; }

    public int getDormitoryId() { return dormitoryId; }

    public void setDormitoryId(int dormitoryId) { this.dormitoryId = dormitoryId; }

    public int getBalance() { return balance; }

    public void setBalance(int balance) { this.balance = balance; }
}
