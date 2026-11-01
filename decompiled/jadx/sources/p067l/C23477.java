package p067l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩹ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BPK */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23477 implements InterfaceC6713, Serializable, InterfaceC22903 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC6713 f74808;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC6713 f74809;

    public /* synthetic */ C23477(InterfaceC6713 interfaceC6713, InterfaceC6713 interfaceC6714) {
        this.f74808 = interfaceC6713;
        this.f74809 = interfaceC6714;
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C21466.m48633(this, comparator);
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
        return mo11719(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // p067l.InterfaceC6713
    /* JADX INFO: renamed from: ֫ */
    public final C23477 mo11718(InterfaceC6713 interfaceC6713) {
        return new C23477(this, interfaceC6713);
    }

    @Override // p067l.InterfaceC6713
    /* JADX INFO: renamed from: ۧ */
    public final int mo11719(int i, int i2) {
        int iMo11719 = this.f74808.mo11719(i, i2);
        return iMo11719 == 0 ? this.f74809.mo11719(i, i2) : iMo11719;
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final Comparator reversed() {
        return new C14759(this);
    }
}
