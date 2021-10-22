package bz.observepattern;

import bz.observepattern.News.NewsType;

public class Main {

	public static void main(String[] args) {
		
		MumbaiAajtak mumbaiAajtak = new MumbaiAajtak();
		DelhiAajtak delhiAajtak = new DelhiAajtak();
		BusinessAajtak businessAajtak = new BusinessAajtak();
		Aajtak subject = new Aajtak();
		
		News businessnews = new News();
		businessnews.news = "stocks are high";
		businessnews.newstype = NewsType.BUSINESS_NEWS;
		
		News mumbainews = new News();
		mumbainews.news ="It is raining";
		mumbainews.newstype = NewsType.MUMBAI_NEWS;
		
		
		subject.register(mumbaiAajtak);
		subject.register(delhiAajtak);
		subject.register(businessAajtak);
		subject.update(mumbainews);
		
//		subject.unRegister(delhiAajtak);
//		subject.update(news);
		
	}

}
