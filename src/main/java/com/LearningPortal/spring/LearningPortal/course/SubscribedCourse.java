package com.LearningPortal.spring.LearningPortal.course;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.*;

@Entity
@Table(name="user_subscriptions")
public class SubscribedCourse {
	
	@Id
	@Column(name="SubscriptionId")
	@JsonProperty("id")
	private long subscriptionId;
	

	@Column(name="UserId")
	private long userId;
	
	@Column(name="CourseId", insertable = true, updatable = true)
	private long courseId;
	
	@Column(name="CompletionPercentage")
	@JsonProperty("completionPercentage")
	private int completionPercentage;
	
	@Column(name="CurrentGrade")
	@JsonProperty("currentGrade")
	private char currentGrade;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CourseId", insertable = false, updatable = false)
	@JsonProperty("course")
	private Course course;

	public SubscribedCourse() {}

	public SubscribedCourse(long subscriptionId, int completionPercentage,
			char currentGrade) {
		super();
		this.subscriptionId = subscriptionId;
		this.completionPercentage = completionPercentage;
		this.currentGrade = currentGrade;
	}

	public SubscribedCourse(long subscriptionId, long userId, long courseId, int completionPercentage,
			char currentGrade) {
		super();
		this.subscriptionId = subscriptionId;
		this.userId = userId;
		this.courseId = courseId;
		this.completionPercentage = completionPercentage;
		this.currentGrade = currentGrade;
	}

	public long getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(long subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public int getCompletionPercentage() {
		return completionPercentage;
	}

	public void setCompletionPercentage(int completionPercentage) {
		this.completionPercentage = completionPercentage;
	}

	public char getCurrentGrade() {
		return currentGrade;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public void setCurrentGrade(char currentGrade) {
		this.currentGrade = currentGrade;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
