package com.zac.api;

public class Combination {
	public boolean judge(boolean mailMagazine, int useCount) {
		if (mailMagazine == false) {
			return false;
		}
		if (useCount < 1) {
			return false;
		}
		return true;
	}

}