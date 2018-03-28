package decorator;

/**
 * Created by Jin on 2018/3/28.
 * Description 抽象装饰者
 */
abstract class Decorator extends Component {
	
	private Component mComponent;
	
	public Decorator(Component component) {
		this.mComponent = component;
	}
	
	@Override
	void make() {
		mComponent.make();
		add();
	}
	
	abstract void add();
}
