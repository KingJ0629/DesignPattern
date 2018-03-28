package decorator;

/**
 * Created by Jin on 2018/3/28.
 * Description 装饰者模式测试
 */
class DecoratorTest {
	
	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		
		Decorator decoratorA = new ConcreteDecoratorA(component);
		decoratorA.make();
		
		Decorator decoratorB = new ConcreteDecoratorB(component);
		decoratorB.make();
	}
}
