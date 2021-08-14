package in.co.sunrays.proj4.bean;

/**
 * Subject JavaBean encapsulates Subject attributes
 * 
 * @author Proxy
 * @version 1.0
 * Copyright (c) Proxy
 * 
 */

public class SubjectBean extends BaseBean {
	/**
	 * Default serial version Id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Name of Subject
	 */
	private String name;
	/**
	 * Course id of Subject
	 */
	private long courseId;
	/**
	 * Course name of Subject
	 */
	private String courseName;
	/**
	 * Description of Subject
	 */
	private String description;

	/**
	 * accessor
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKey() {
		// TODO Auto-generated method stub
		return id + "";
	}

	public String getValue() {
		// TODO Auto-generated method stub
		return name;
	}

}
