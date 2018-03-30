package chain;

/**
 * Created by Jin on 2018/3/30.
 * Description 责任链模式测试
 */
class ChainTest {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			int requestNum = (int) (Math.random() * 10);
			String result = DispatchHandler.getDispatcher().dispatchHandler(requestNum);
			
			if (!DispatchHandler.NO_HANDLER.equals(result))
				System.out.println(result + "  处理了请求，请求内容是 " + requestNum);
			else
				System.out.println(result);
		}
	}
}
