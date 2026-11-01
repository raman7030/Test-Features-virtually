package p067l;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۧۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: ECIN */
/* JADX INFO: loaded from: classes4.dex */
public final class C12591 implements InterfaceC3873, InterfaceC22903 {

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ Comparator f35374;

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

    @Override // p067l.InterfaceC3873
    /* JADX INFO: renamed from: ܽ */
    public final C15233 mo7657(InterfaceC3873 interfaceC3873) {
        return new C15233(this, interfaceC3873);
    }

    @Override // java.util.Comparator, p067l.InterfaceC22903
    public final Comparator reversed() {
        return new C17954(this);
    }

    public C12591(Comparator comparator) {
        this.f35374 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f35374.compare((Long) obj, (Long) obj2);
    }

    @Override // p067l.InterfaceC3873
    /* JADX INFO: renamed from: ֫ */
    public final int mo7656(long j, long j2) {
        return this.f35374.compare(Long.valueOf(j), Long.valueOf(j2));
    }
}
