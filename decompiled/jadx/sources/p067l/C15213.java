package p067l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܰ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: RC7A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15213 implements InterfaceC4070, Serializable, InterfaceC22903 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC4070 f43398;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC4070 f43399;

    public /* synthetic */ C15213(InterfaceC4070 interfaceC4070, InterfaceC4070 interfaceC4071) {
        this.f43398 = interfaceC4070;
        this.f43399 = interfaceC4071;
    }

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

    @Override // p067l.InterfaceC4070
    /* JADX INFO: renamed from: ֫ */
    public final int mo8153(char c, char c2) {
        int iMo8153 = this.f43398.mo8153(c, c2);
        return iMo8153 == 0 ? this.f43399.mo8153(c, c2) : iMo8153;
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final Comparator reversed() {
        return new C18151(this);
    }
}
