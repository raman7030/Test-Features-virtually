package p067l;

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
public final class EnumC9414 implements Comparator, InterfaceC22903 {
    public static final EnumC9414 INSTANCE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC9414[] f25703a;

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C10162.$default$thenComparing(this, comparator);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparing(Function function) {
        return C10162.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return C16866.thenComparing(this, C10162.comparing(function, comparator));
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return C10162.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return C16866.thenComparing(this, C10162.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return C10162.$default$thenComparingLong(this, toLongFunction);
    }

    public static EnumC9414 valueOf(String str) {
        return (EnumC9414) Enum.valueOf(EnumC9414.class, str);
    }

    public static EnumC9414[] values() {
        return (EnumC9414[]) f25703a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        EnumC9414 enumC9414 = new EnumC9414("INSTANCE", 0);
        INSTANCE = enumC9414;
        f25703a = new EnumC9414[]{enumC9414};
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final Comparator reversed() {
        return C10162.reverseOrder();
    }
}
