package com.binh.coverage.impl;

import com.binh.coverage.CoverageTestService;

public class CoverageTestServiceImpl implements CoverageTestService {

	public int methodOne(int i, String y, boolean s) {
		if (s) {
			return i;
		}
		if (i == 1) {
			return -1;
		}
		if ("t".equals(y)) {
			return -1;
		}
		return 0;
	}

	public int methodTwo() {
		return 0;
	}

	public int methodThree() {
		return 0;
	}

	public int methodFour() {
		return 0;
	}

}
