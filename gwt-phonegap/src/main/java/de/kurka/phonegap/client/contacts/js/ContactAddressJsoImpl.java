/*
 * Copyright 2010 Daniel Kurka
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.kurka.phonegap.client.contacts.js;

import com.google.gwt.core.client.JavaScriptObject;

import de.kurka.phonegap.client.contacts.ContactAddress;

public final class ContactAddressJsoImpl extends JavaScriptObject implements ContactAddress {

	protected ContactAddressJsoImpl() {

	}

	@Override
	public native void setFormatted(String formatted) /*-{
		this.formatted = formatted;
	}-*/;

	@Override
	public native String getFormatted() /*-{
		return this.formatted;
	}-*/;

	@Override
	public native void setStreetAddress(String address) /*-{
		this.streetAddress = address;
	}-*/;

	@Override
	public native String getStreetAddress() /*-{
		return this.streetAddress;
	}-*/;

	@Override
	public native void setLocality(String locality) /*-{
		this.locality = locality;
	}-*/;

	@Override
	public native String getLocality() /*-{
		return this.locality;
	}-*/;

	@Override
	public native void setRegion(String region) /*-{
		this.region = region;
	}-*/;

	@Override
	public native String getRegion() /*-{
		return this.region;
	}-*/;

	@Override
	public native void setPostalCode(String code) /*-{
		this.postalCode = code;
	}-*/;

	@Override
	public native String getPostalCode() /*-{
		return this.postalCode;
	}-*/;

	@Override
	public native void setCountry(String country) /*-{
		this.country = country;
	}-*/;

	@Override
	public native String getCountry() /*-{
		return this.country;
	}-*/;

}
