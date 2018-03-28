package decorator;

/**
 * Created by Jin on 2018/3/28.
 * Description 具体装饰者B
 */
class ConcreteDecoratorB extends Decorator {
	
	public ConcreteDecoratorB(Component component) {
		super(component);
	}
	
	@Override
	void add() {
		System.out.println("加冰。");
	}
}
