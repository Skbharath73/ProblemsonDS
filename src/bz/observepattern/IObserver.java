package bz.observepattern;

public interface IObserver {
	void onUpdate(News news);
	public News.NewsType getNewsType();

}
