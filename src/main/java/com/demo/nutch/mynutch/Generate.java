package com.demo.nutch.mynutch;

import org.apache.nutch.crawl.GeneratorJob;

public class Generate {

	public static void main(String[] args) throws Exception {
		args = new String[]{"-topN", "100"};
		GeneratorJob.main(args);
	}

}
