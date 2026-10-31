package l;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.۠۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8200 {
    public static Comparator $default$thenComparing(Comparator comparator, Comparator comparator2) {
        C11003.requireNonNull(comparator2);
        return new C11647(comparator, comparator2, 0);
    }

    public static Comparator $default$thenComparing(Comparator comparator, Function function) {
        return C15254.thenComparing(comparator, comparing(function));
    }

    public static Comparator $default$thenComparingLong(Comparator comparator, ToLongFunction toLongFunction) {
        return C15254.thenComparing(comparator, comparingLong(toLongFunction));
    }

    public static Comparator reverseOrder() {
        return Collections.reverseOrder();
    }

    public static Comparator comparing(Function function, Comparator comparator) {
        C11003.requireNonNull(function);
        C11003.requireNonNull(comparator);
        return new C11647(comparator, function, 1);
    }

    public static Comparator comparing(Function function) {
        C11003.requireNonNull(function);
        return new C13823(2, function);
    }

    public static Comparator comparingInt(ToIntFunction toIntFunction) {
        C11003.requireNonNull(toIntFunction);
        return new C13823(0, toIntFunction);
    }

    public static Comparator comparingLong(ToLongFunction toLongFunction) {
        C11003.requireNonNull(toLongFunction);
        return new C13823(3, toLongFunction);
    }

    public static Comparator $default$thenComparingDouble(Comparator comparator, ToDoubleFunction toDoubleFunction) {
        C11003.requireNonNull(toDoubleFunction);
        return C15254.thenComparing(comparator, new C13823(1, toDoubleFunction));
    }
}
