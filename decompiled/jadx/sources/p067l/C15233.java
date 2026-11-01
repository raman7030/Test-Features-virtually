package p067l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܰۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BVX */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15233 implements InterfaceC3873, Serializable, InterfaceC22903 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ InterfaceC3873 f43464;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ InterfaceC3873 f43465;

    public /* synthetic */ C15233(InterfaceC3873 interfaceC3873, InterfaceC3873 interfaceC3874) {
        this.f43464 = interfaceC3873;
        this.f43465 = interfaceC3874;
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C9199.m21199(this, comparator);
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
        return mo7656(((Long) obj).longValue(), ((Long) obj2).longValue());
    }

    @Override // p067l.InterfaceC3873
    /* JADX INFO: renamed from: ܽ */
    public final C15233 mo7657(InterfaceC3873 interfaceC3873) {
        return new C15233(this, interfaceC3873);
    }

    @Override // p067l.InterfaceC3873
    /* JADX INFO: renamed from: ֫ */
    public final int mo7656(long j, long j2) {
        int iMo7656 = this.f43464.mo7656(j, j2);
        return iMo7656 == 0 ? this.f43465.mo7656(j, j2) : iMo7656;
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final Comparator reversed() {
        return new C17954(this);
    }
}
