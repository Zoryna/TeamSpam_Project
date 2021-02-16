package com.spam.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Event {

	private int eventId;
	private int userId; // created the event
	
	private String location;
	private String eventTime;
	private String eventDate;
	private String eventTitle;
	
	// optional fields
	private String foodType;
	private String description;
	private String organization;
	
	private List<User> attending;
	
	public Event () {
		
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEventTime() {
		return eventTime;
	}

	public void setEventTime(String eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}
	
	public List<User> getAttending() {
		if (attending == null)
			attending = new ArrayList<User>();
		
		return attending;
	}

	public void setAttending(List<User> attending) {
		this.attending = attending;
	}
	
	public void appendAttendee(User user) {
		attending.add(user);
	}
	
	public void remAttendee(User user) {
		attending.remove(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		
		if(!(obj instanceof Event))
			return false;
		
		Event tmp = (Event)obj;
		return tmp.getEventId() == eventId &&
				tmp.getUserId() == userId &&
				tmp.getLocation().equals(location) &&
				tmp.getEventTime().equals(eventTime) &&
				tmp.getEventDate().equals(eventDate) &&
				tmp.getEventTitle().equals(eventTitle) &&
				(tmp.getFoodType() == null || tmp.getFoodType().equals(foodType)) &&
				(tmp.getDescription() == null || tmp.getDescription().equals(description)) &&
				(tmp.getOrganization() == null || tmp.getOrganization().equals(organization));
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(eventId, userId, attending, location, eventTime, eventDate, eventTitle, foodType, description, organization);
    }
}