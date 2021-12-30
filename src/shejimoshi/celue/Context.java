package shejimoshi.celue;

/**
 * @Author: Zxw
 * @Description:
 * @Date: Created in 11:05 2021/3/11
 * @Modifued By:
 */
public class Context {

    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }

    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());

        context.ContextInterface();

        context = new Context(new ConcreteStrategyB());

        context.ContextInterface();

    }

}