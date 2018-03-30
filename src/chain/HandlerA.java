package chain;

/**
 * Created by Jin on 2018/3/30.
 * Description 处理者A
 */
class HandlerA implements Handler {
	
	DispatchHandler mDispatchHandler;
	
	public HandlerA(DispatchHandler mDispatchHandler) {
		this.mDispatchHandler = mDispatchHandler;
	}
	
	@Override
	public String handleRequest(int requestNum) {
		if (requestNum > 3) {
			return mDispatchHandler.dispatchHandler(requestNum);
		} else {
			return getClass().getSimpleName();
		}
	}
}
