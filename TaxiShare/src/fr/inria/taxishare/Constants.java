package fr.inria.taxishare;

import fr.inria.arles.yarta.resources.Group;

public class Constants {

	private static final int GroupId = 26229;

	public static final String getGroupId() {
		return Group.typeURI + "_" + GroupId;
	}
}
