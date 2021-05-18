package com.hqyj.entity;

public class Score {
    private String studentNumber;

    private String studyYear;

    private String studentName;

    private Integer courseId;

    private String courseName;

    private Double scoreNum;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber == null ? null : studentNumber.trim();
    }

    public String getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(String studyYear) {
        this.studyYear = studyYear == null ? null : studyYear.trim();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName == null ? null : studentName.trim();
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Double getScoreNum() {
        return scoreNum;
    }

    public void setScoreNum(Double scoreNum) {
        this.scoreNum = scoreNum;
    }
}