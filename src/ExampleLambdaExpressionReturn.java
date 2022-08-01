interface Executable {
    int execute(int x);
}
class Runner {
    public void run(Executable e) {
        int a = e.execute(10);
        System.out.println(a);
    }
}
///***********************************************************///

public class ExampleLambdaExpressionReturn {
    public static void main(String[] args) {
        Runner runner = new Runner();
        // реализация метода интерфейса Executable с возвращаемым значением:
        // 1) с помощью анонимного класса
        runner.run(new Executable() {
            @Override
            public int execute(int  x) {
                return x+7;
            }
        });
        // 2) с помощью лямбда выражения
        runner.run(x -> x+7);
    }
}

