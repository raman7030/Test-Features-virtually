package p067l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܽۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: BWD */
/* JADX INFO: loaded from: classes4.dex */
public final class C18151 implements InterfaceC4070, Serializable, InterfaceC22903 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC4070 f54183;

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C9179.m21134(this, comparator);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public /* synthetic */ Comparator thenComparing(Function function) {
        return C10162.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return C16866.thenComparing(this, C10162.comparing(function, comparator));
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return C10162.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return C16866.thenComparing(this, C10162.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return C10162.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return mo8153(((Character) obj).charValue(), ((Character) obj2).charValue());
    }

    @Override // p067l.InterfaceC4070
    /* JADX INFO: renamed from: ܽ */
    public final C15213 mo8154(InterfaceC4070 interfaceC4070) {
        return new C15213(this, interfaceC4070);
    }

    public C18151(InterfaceC4070 interfaceC4070) {
        this.f54183 = interfaceC4070;
    }

    @Override // p067l.InterfaceC4070
    /* JADX INFO: renamed from: ֫ */
    public final int mo8153(char c, char c2) {
        return this.f54183.mo8153(c2, c);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final Comparator reversed() {
        return this.f54183;
    }
}
