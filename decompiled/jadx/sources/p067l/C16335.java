package p067l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܳᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CK5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16335 implements InterfaceC8960, Serializable, InterfaceC22903 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC8960 f48003;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC8960 f48004;

    public /* synthetic */ C16335(InterfaceC8960 interfaceC8960, InterfaceC8960 interfaceC8961) {
        this.f48003 = interfaceC8960;
        this.f48004 = interfaceC8961;
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C25053.m54990(this, comparator);
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
        return mo20697(((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }

    @Override // p067l.InterfaceC8960
    /* JADX INFO: renamed from: ֫ */
    public final C16335 mo20698(InterfaceC8960 interfaceC8960) {
        return new C16335(this, interfaceC8960);
    }

    @Override // p067l.InterfaceC8960
    /* JADX INFO: renamed from: ֫ */
    public final int mo20697(float f, float f2) {
        int iMo20697 = this.f48003.mo20697(f, f2);
        return iMo20697 == 0 ? this.f48004.mo20697(f, f2) : iMo20697;
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final Comparator reversed() {
        return new C11643(this);
    }
}
