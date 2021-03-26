package com.datastax.events.model;

import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

public class Event {
	
	private UUID id; 
	private String aggregateType; 
	private String host; 
	private String loglevel; 	
	private String data; 
	private Date time; 
	private String eventtype;
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getAggregateType() {
		return aggregateType;
	}
	public void setAggregateType(String aggregateType) {
		this.aggregateType = aggregateType;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date localTime) {
		this.time = localTime;
	}
	public String getEventtype() {
		return eventtype;
	}
	public void setEventtype(String eventtype) {
		this.eventtype = eventtype;
	}
	public String getLoglevel() {
		return loglevel;
	}
	public void setLoglevel(String loglevel) {
		this.loglevel = loglevel;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	@Override
	public String toString() {
		return "Event [id=" + id + ", aggregateType=" + aggregateType + ", host=" + host + ", loglevel=" + loglevel
				+ ", data=" + data + ", time=" + time + ", eventtype=" + eventtype + "]";
	}
	
}
