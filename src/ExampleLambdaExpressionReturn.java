interface Executable {
    int execute(int x, int y);
}
class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 15);
        System.out.println(a);
    }
}
///***********************************************************///

public class ExampleLambdaExpressionReturn {
    public static void main(String[] args) {
        Runner runner = new Runner();
        // реализации метода интерфейса Executable с возвращаемым значением:
        // 1) с помощью анонимного класса
        runner.run(new Executable() {
            @Override
            public int execute(int  x, int y) {
                return x+y;
            }
        });
        // 2) с помощью лямбда выражения
        runner.run((x,y) -> x+y);
    }
}
