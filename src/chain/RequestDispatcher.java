package chain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jin on 2018/3/30.
 * Description 分发处理管理类
 */
class RequestDispatcher {
	
	List<Handler> handlerList = null;
	
	private boolean hasInit = false;
	private int index = 0;
	private Handler mNextHandler = null;
	
	public final static String NO_HANDLER = "没有处理者能处理请求!";
	
	/**
	 * 分发给处理者
	 * @param requestNum 请求数字
	 */
	public String dispatch(int requestNum) {
		if (!hasInit) {
			return init(requestNum);
		}
		
		if (handlerList == null || handlerList.size() == 0) {
			throw new IllegalArgumentException("必须要有处理者!");
		}
		
		if (index >= handlerList.size()) {
			return NO_HANDLER;
		}
		
		mNextHandler = handlerList.get(index++);
		checkHandlerNull(mNextHandler);
		
		String result = mNextHandler.handleRequest(requestNum);
		
		return result;
	}
	
	/**
	 * 初始化责任链
	 */
	private String init(int requestNum) {
		hasInit = true;
		
		handlerList = new ArrayList<Handler>(3);
		
		handlerList.add(new HandlerA(this));
		handlerList.add(new HandlerB(this));
		handlerList.add(new HandlerC(this));
		
		return dispatch(requestNum);
	}
	
	private void checkHandlerNull(Handler handler) {
		if (handler == null)
			throw new NullPointerException("处理者异常!");
	}
	
	public static RequestDispatcher getDispatcher() {
		return new RequestDispatcher();
	}
}
