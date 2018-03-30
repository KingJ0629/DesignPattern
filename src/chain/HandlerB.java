package chain;

/**
 * Created by Jin on 2018/3/30.
 * Description 处理者B
 */
class HandlerB implements Handler {
	
	DispatchHandler mDispatchHandler;
	
	public HandlerB(DispatchHandler mDispatchHandler) {
		this.mDispatchHandler = mDispatchHandler;
	}
	
	@Override
	public String handleRequest(int requestNum) {
		if (requestNum > 6) {
			return mDispatchHandler.dispatchHandler(requestNum);
		} else {
			return getClass().getSimpleName();
		}
	}
}
