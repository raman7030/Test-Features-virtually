package l;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩸۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC21606 {
    Comparator reversed();

    Comparator thenComparing(Comparator comparator);

    Comparator thenComparing(Function function);

    Comparator thenComparing(Function function, Comparator comparator);

    Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction);

    Comparator thenComparingInt(ToIntFunction toIntFunction);

    Comparator thenComparingLong(ToLongFunction toLongFunction);
}
