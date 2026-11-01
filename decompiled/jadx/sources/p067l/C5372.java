package p067l;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۗۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CFT */
/* JADX INFO: loaded from: classes2.dex */
public final class C5372 implements InterfaceC6713, InterfaceC22903 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Comparator f12752;

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

    @Override // p067l.InterfaceC6713
    /* JADX INFO: renamed from: ֫ */
    public final C23477 mo11718(InterfaceC6713 interfaceC6713) {
        return new C23477(this, interfaceC6713);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final Comparator reversed() {
        return new C14759(this);
    }

    public C5372(Comparator comparator) {
        this.f12752 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f12752.compare((Integer) obj, (Integer) obj2);
    }

    @Override // p067l.InterfaceC6713
    /* JADX INFO: renamed from: ۧ */
    public final int mo11719(int i, int i2) {
        return this.f12752.compare(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
