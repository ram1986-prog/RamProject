package in.co.sunrays.proj4.bean;

import java.util.Date;

/**
 * Timetable JavaBean encapsulates Timetable attributes
 * 
 * @author Proxy
 * @version 1.0
 * Copyright (c) Proxy
 * 
 */

public class TimetableBean extends BaseBean {

	/**
	 * Default Serial Version ID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Semester of Timetable
	 */
	private String semester;
	/**
	 * Description of Timetable
	 */
	private String description;
	/**
	 * Exam Date of Timetable
	 */
	private Date examDate;
	/**
	 * Exam Time of Timetable;
	 */
	private String examTime;
	/**
	 * CourseId of Timetable
	 */
	private long courseId;
	/**
	 * CourseName of Timetable
	 */
	private String courseName;
	/**
	 * SubjectId of Timetable
	 */
	private long subjectId;
	/**
	 * Subject Name of Timetable
	 */
	private String subjectName;

	/**
	 * accessor
	 */
	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getExamDate() {
		return examDate;
	}

	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}

	public String getExamTime() {
		return examTime;
	}

	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getKey() {
		// TODO Auto-generated method stub
		return id + "";
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return subjectName;
	}
}
