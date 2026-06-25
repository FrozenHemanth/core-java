package Runner;

import com.frozen.generic.generic;

public class GenericRunner {
    public static void main(String[] args) {
        generic<String> gen = new generic<>();
        gen.set("sample text");
        System.out.println(gen.get());
        gen.set("899");
        System.out.println(gen.get());

        generic<Boolean> gen2= new generic<>();
        gen2.set(true);
        System.out.println(gen2.get());
    }
}
