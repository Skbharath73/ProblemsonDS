package bz.observepattern;

public class BusinessAajtak implements IObserver {

	@Override
	public void onUpdate(News news) {
		System.out.println(news.news);
	}

	@Override
	public News.NewsType getNewsType() {
		return News.NewsType.BUSINESS_NEWS;
	}
}
