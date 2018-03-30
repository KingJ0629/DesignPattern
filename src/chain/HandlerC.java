package chain;

/**
 * Created by Jin on 2018/3/30.
 * Description 处理者C
 */
class HandlerC implements Handler {
	
	RequestDispatcher mRequestDispatcher;
	
	public HandlerC(RequestDispatcher mRequestDispatcher) {
		this.mRequestDispatcher = mRequestDispatcher;
	}
	
	@Override
	public String handleRequest(int requestNum) {
		if (requestNum > 8) {
			return mRequestDispatcher.dispatch(requestNum);
		} else {
			return getClass().getSimpleName();
		}
	}
}
