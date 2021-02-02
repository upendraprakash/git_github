package com.Test;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Main {
	    public static void main(String[] args) {
	        Instant now = Instant.now();
	       ZonedDateTime.ofInstant(Instant.now(),
	                ZoneId.ofOffset("UTC", ZoneOffset.UTC)).toInstant().toEpochMilli();
	       
	       
	    }
}
