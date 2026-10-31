package java.util.function;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public interface Function<T, R> {
    /* JADX INFO: renamed from: andThen */
    <V> Function<T, V> mo22274andThen(Function<? super R, ? extends V> function);

    R apply(T t);

    <V> Function<V, R> compose(Function<? super V, ? extends T> function);
}
