package com.demo.nutch.mynutch;

import org.apache.nutch.crawl.InjectorJob;

public class Fetch {

	public static void main(String[] args) throws Exception {
//		String urldir = "/cygdrive/E/MyProjs/mynutch/src/main/resources/urls";
		String urldir = "E:\\MyProjs/mynutch/src/main/resources/urls";
		args = new String[]{urldir};
//		System.out.println(Files.toString(new File(urldir + "/seed.txt"), Charsets.UTF_8));
		InjectorJob.main(args);//不成功，。。。以后再试
	}

}
