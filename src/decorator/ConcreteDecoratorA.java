package decorator;

/**
 * Created by Jin on 2018/3/28.
 * Description 具体装饰者A
 */
class ConcreteDecoratorA extends Decorator {
	
	public ConcreteDecoratorA(Component component) {
		super(component);
	}
	
	@Override
	void add() {
		System.out.println("加糖。");
	}
}
