package l;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܶ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15254 {
    public static /* synthetic */ Comparator thenComparing(Comparator comparator, Comparator comparator2) {
        return comparator instanceof InterfaceC21606 ? ((InterfaceC21606) comparator).thenComparing(comparator2) : C8200.$default$thenComparing(comparator, comparator2);
    }

    public static /* synthetic */ Comparator thenComparing(Comparator comparator, Function function) {
        return comparator instanceof InterfaceC21606 ? ((InterfaceC21606) comparator).thenComparing(function) : C8200.$default$thenComparing(comparator, function);
    }

    public static /* synthetic */ Comparator thenComparingLong(Comparator comparator, ToLongFunction toLongFunction) {
        return comparator instanceof InterfaceC21606 ? ((InterfaceC21606) comparator).thenComparingLong(toLongFunction) : C8200.$default$thenComparingLong(comparator, toLongFunction);
    }

    public static Comparator reversed(Comparator comparator) {
        return comparator instanceof InterfaceC21606 ? ((InterfaceC21606) comparator).reversed() : Collections.reverseOrder(comparator);
    }
}
