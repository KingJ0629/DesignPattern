package decorator;

/**
 * Created by Jin on 2018/3/28.
 * Description 具体组件--被装饰类
 */
class ConcreteComponent extends Component {
	
	@Override
	public void make() {
		System.out.print("来一杯奶茶。");
	}
}
