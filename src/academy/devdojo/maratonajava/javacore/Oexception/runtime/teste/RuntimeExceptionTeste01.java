package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

public class RuntimeExceptionTeste01 {
    public static void main(String[] args) {
        // checked -> filhas diretas da classe Exception -> lançam um erro em tempo de compilação
        // ou seja, se não forem tratadas seu código nem compila
        // unchecked -> passam pela classe RuntimeException -> em tempo de execução

//        Object object = null;
//        System.out.println(object.toString());

        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }
}
