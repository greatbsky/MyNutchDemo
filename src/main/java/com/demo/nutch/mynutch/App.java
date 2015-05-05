package com.demo.nutch.mynutch;

import java.nio.charset.Charset;

import crawlercommons.fetcher.BaseFetchException;
import crawlercommons.fetcher.FetchedResult;
import crawlercommons.fetcher.http.SimpleHttpFetcher;
import crawlercommons.fetcher.http.UserAgent;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		try {
			UserAgent userAgent = new UserAgent("spider", "(Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36", "localhost");
			SimpleHttpFetcher simpleHttpFetcher = new SimpleHttpFetcher(userAgent);
			FetchedResult f = simpleHttpFetcher.fetch("http://www.gfsoso.com");
			byte[] result = f.getContent();
			String s = new String(result, Charset.forName("utf-8"));
			System.out.println(s);
		} catch (BaseFetchException e) {
			e.printStackTrace();
		}
	}
}
