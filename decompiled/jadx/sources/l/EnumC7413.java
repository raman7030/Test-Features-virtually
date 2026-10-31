package l;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۟ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC7413 implements Comparator, InterfaceC21606 {
    public static final EnumC7413 INSTANCE;
    public static final /* synthetic */ EnumC7413[] a;

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C8200.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparing(Function function) {
        return C8200.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return C15254.thenComparing(this, C8200.comparing(function, comparator));
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return C8200.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return C15254.thenComparing(this, C8200.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return C8200.$default$thenComparingLong(this, toLongFunction);
    }

    public static EnumC7413 valueOf(String str) {
        return (EnumC7413) Enum.valueOf(EnumC7413.class, str);
    }

    public static EnumC7413[] values() {
        return (EnumC7413[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        EnumC7413 enumC7413 = new EnumC7413("INSTANCE", 0);
        INSTANCE = enumC7413;
        a = new EnumC7413[]{enumC7413};
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final Comparator reversed() {
        return C8200.reverseOrder();
    }
}
