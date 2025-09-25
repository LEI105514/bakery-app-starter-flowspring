package com.vaadin.starter.bakery.backend.data.entity;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Entity representing a customer in the application.
 * <p>
 * A customer has a full name, a phone number, and optional additional details.
 * Validation constraints are applied to ensure the data integrity of the fields.
 * </p>
 *
 * <ul>
 *   <li>{@code fullName} - cannot be blank, maximum 255 characters.</li>
 *   <li>{@code phoneNumber} - cannot be blank, maximum 20 characters,
 *       must follow a simple phone number pattern with optional international prefix
 *       and digits separated by spaces or dashes.</li>
 *   <li>{@code details} - optional additional information, maximum 255 characters.</li>
 * </ul>
 *
 * <p>
 * This class extends {@link AbstractEntity}, which provides a base for JPA entities
 * (such as an identifier and common utility methods).
 * </p>
 */
@Entity
public class Customer extends AbstractEntity {

	/**
	 * The customer's full name.
	 * Cannot be blank and must not exceed 255 characters.
	 */
	@NotBlank
	@Size(max = 255)
	private String fullName;

	/**
	 * The customer's phone number.
	 * <p>
	 * Must not be blank and must not exceed 20 characters.
	 * Valid format is an optional international prefix (e.g. +358),
	 * followed by 4–14 digits, optionally separated by spaces or dashes.
	 * </p>
	 * Example valid values:
	 * <ul>
	 *   <li>{@code +358 50 1234567}</li>
	 *   <li>{@code 050-123-4567}</li>
	 *   <li>{@code 0501234567}</li>
	 * </ul>
	 */
	@NotBlank
	@Size(max = 20, message = "{bakery.phone.number.invalid}")
	@Pattern(regexp = "^(\\+\\d+)?([ -]?\\d+){4,14}$", message = "{bakery.phone.number.invalid}")
	private String phoneNumber;

	/**
	 * Optional additional information about the customer.
	 * Maximum length is 255 characters.
	 */
	@Size(max = 255)
	private String details;

	/**
	 * Gets the customer's full name.
	 *
	 * @return the full name of the customer
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * Sets the customer's full name.
	 *
	 * @param fullName the full name to set, must not be blank
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * Gets the customer's phone number.
	 *
	 * @return the phone number of the customer
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the customer's phone number.
	 *
	 * @param phoneNumber the phone number to set, must match the defined pattern
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * Gets optional additional information about the customer.
	 *
	 * @return the details of the customer, or {@code null} if none provided
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * Sets optional additional information about the customer.
	 *
	 * @param details the details to set, may be {@code null}
	 */
	public void setDetails(String details) {
		this.details = details;
	}
}
