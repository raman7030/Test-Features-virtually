package java.util.function;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public interface Predicate<T> {
    Predicate<T> and(Predicate<? super T> predicate);

    /* JADX INFO: renamed from: negate */
    Predicate<T> mo4928negate();

    boolean test(T t);
}
