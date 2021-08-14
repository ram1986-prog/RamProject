package in.co.sunrays.proj4.bean;

/**
 * Course JavaBean encapsulates Course attributes
 * 
 * @author Proxy
 * @version 1.0
 * Copyright (c) Proxy
 * 
 */
public class CourseBean extends BaseBean {

	/**
	 * Default serial version Id
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Name of Course
	 */
	private String name;
	/**
	 * Duration of Course
	 */
	private String duration;
	/**
	 * Description of project
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
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
