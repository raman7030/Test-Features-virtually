package p067l;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.۠۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10162 {
    public static Comparator $default$thenComparing(Comparator comparator, Comparator comparator2) {
        C12826.requireNonNull(comparator2);
        return new C13438(comparator, comparator2, 0);
    }

    public static Comparator $default$thenComparing(Comparator comparator, Function function) {
        return C16866.thenComparing(comparator, comparing(function));
    }

    public static Comparator $default$thenComparingLong(Comparator comparator, ToLongFunction toLongFunction) {
        return C16866.thenComparing(comparator, comparingLong(toLongFunction));
    }

    public static Comparator reverseOrder() {
        return Collections.reverseOrder();
    }

    public static Comparator comparing(Function function, Comparator comparator) {
        C12826.requireNonNull(function);
        C12826.requireNonNull(comparator);
        return new C13438(comparator, function, 1);
    }

    public static Comparator comparing(Function function) {
        C12826.requireNonNull(function);
        return new C15506(2, function);
    }

    public static Comparator comparingInt(ToIntFunction toIntFunction) {
        C12826.requireNonNull(toIntFunction);
        return new C15506(0, toIntFunction);
    }

    public static Comparator comparingLong(ToLongFunction toLongFunction) {
        C12826.requireNonNull(toLongFunction);
        return new C15506(3, toLongFunction);
    }

    public static Comparator $default$thenComparingDouble(Comparator comparator, ToDoubleFunction toDoubleFunction) {
        C12826.requireNonNull(toDoubleFunction);
        return C16866.thenComparing(comparator, new C15506(1, toDoubleFunction));
    }
}
