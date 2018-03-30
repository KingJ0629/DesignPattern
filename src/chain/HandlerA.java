package chain;

/**
 * Created by Jin on 2018/3/30.
 * Description 处理者A
 */
class HandlerA implements Handler {
	
	RequestDispatcher mRequestDispatcher;
	
	public HandlerA(RequestDispatcher mRequestDispatcher) {
		this.mRequestDispatcher = mRequestDispatcher;
	}
	
	@Override
	public String handleRequest(int requestNum) {
		if (requestNum > 3) {
			return mRequestDispatcher.dispatch(requestNum);
		} else {
			return getClass().getSimpleName();
		}
	}
}
