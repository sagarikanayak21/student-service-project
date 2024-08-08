package com.sn.util;

public class StudentUtil {
	public static String generateStudentId(long studentCount) {
		if(studentCount<=8) {
			return "USBM" + "00" + (studentCount + 1);
		} else if (studentCount<=98) {
			return "USBM" + "0" + (studentCount + 1);
		} else {
			return "USBM" + (studentCount + 1);
		}
	}
}
