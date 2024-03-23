package com.greyHat.notificationsystem.domain;

import java.util.UUID;

import com.greyHat.notificationsystem.domain.enums.NotificationPreference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_user")
public class User {
	
	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false, unique=true)
	private String email;
	
	@Column(nullable=false, unique=true)
	private String phoneNumber;
	
	@Enumerated(EnumType.STRING)
	private NotificationPreference notificationPreference;
	
	public User() {
	}

	public User( String name, String email, String phoneNumber, NotificationPreference notificationPreference) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.notificationPreference = notificationPreference;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public NotificationPreference getNotificationPreference() {
		return notificationPreference;
	}

	public void setNotificationPreference(NotificationPreference notificationPreference) {
		this.notificationPreference = notificationPreference;
	}
	
	
}
