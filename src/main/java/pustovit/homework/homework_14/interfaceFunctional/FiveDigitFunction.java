package pustovit.homework.homework_14.interfaceFunctional;
@FunctionalInterface
public interface FiveDigitFunction <T, I, U, V, R>{
    R summarize (T t, I i, U u, V v);
}
