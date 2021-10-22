package bz.observepattern;
import java.util.ArrayList;
import java.util.List;

//observable class

public class Aajtak {
	List<IObserver> observerList = new ArrayList<IObserver>();
	
	public void register(IObserver observer) {
		observerList.add(observer);
	}
	
	public void update(News news) {
		observerList.stream().filter(iObserver->iObserver != null && iObserver.getNewsType() == news.newstype).forEach(iObserver -> iObserver.onUpdate(news));
	}
	
	public void unRegister(IObserver observer) {
		observerList.remove(observer);
	}
}
