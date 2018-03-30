package chain;

/**
 * Created by Jin on 2018/3/30.
 * Description 处理者B
 */
class HandlerB implements Handler {
	
	RequestDispatcher mRequestDispatcher;
	
	public HandlerB(RequestDispatcher mRequestDispatcher) {
		this.mRequestDispatcher = mRequestDispatcher;
	}
	
	@Override
	public String handleRequest(int requestNum) {
		if (requestNum > 6) {
			return mRequestDispatcher.dispatch(requestNum);
		} else {
			return getClass().getSimpleName();
		}
	}
}
