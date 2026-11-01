package p067l;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩷ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2E9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22372 implements InterfaceC8960, InterfaceC22903 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Comparator f70591;

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

    @Override // p067l.InterfaceC8960
    /* JADX INFO: renamed from: ֫ */
    public final C16335 mo20698(InterfaceC8960 interfaceC8960) {
        return new C16335(this, interfaceC8960);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final Comparator reversed() {
        return new C11643(this);
    }

    public C22372(Comparator comparator) {
        this.f70591 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f70591.compare((Float) obj, (Float) obj2);
    }

    @Override // p067l.InterfaceC8960
    /* JADX INFO: renamed from: ֫ */
    public final int mo20697(float f, float f2) {
        return this.f70591.compare(Float.valueOf(f), Float.valueOf(f2));
    }
}
