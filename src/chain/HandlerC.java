package chain;

/**
 * Created by Jin on 2018/3/30.
 * Description 处理者C
 */
class HandlerC implements Handler {
	
	DispatchHandler mDispatchHandler;
	
	public HandlerC(DispatchHandler mDispatchHandler) {
		this.mDispatchHandler = mDispatchHandler;
	}
	
	@Override
	public String handleRequest(int requestNum) {
		if (requestNum > 8) {
			return mDispatchHandler.dispatchHandler(requestNum);
		} else {
			return getClass().getSimpleName();
		}
	}
}
