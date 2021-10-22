package bz.observepattern;

public class DelhiAajtak implements IObserver {

	@Override
	public void onUpdate(News news) {
		System.out.println(news.news);
	}

	@Override
	public News.NewsType getNewsType() {
		return News.NewsType.DELHI_NEWS;
	}
}