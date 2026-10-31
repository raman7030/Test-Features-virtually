package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܽۘᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: ECIN */
/* JADX INFO: loaded from: classes4.dex */
public final class C16399 implements InterfaceC1583, Serializable, InterfaceC21606 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC1583 f50462;

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C7187.m19252(this, comparator);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public /* synthetic */ Comparator thenComparing(Function function) {
        return C8200.$default$thenComparing(this, function);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public /* synthetic */ Comparator thenComparing(Function function, Comparator comparator) {
        return C15254.thenComparing(this, C8200.comparing(function, comparator));
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public /* synthetic */ Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        return C8200.$default$thenComparingDouble(this, toDoubleFunction);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public /* synthetic */ Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return C15254.thenComparing(this, C8200.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public /* synthetic */ Comparator thenComparingLong(ToLongFunction toLongFunction) {
        return C8200.$default$thenComparingLong(this, toLongFunction);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return mo5427(((Long) obj).longValue(), ((Long) obj2).longValue());
    }

    @Override // l.InterfaceC1583
    /* JADX INFO: renamed from: ܽ */
    public final C13536 mo5428(InterfaceC1583 interfaceC1583) {
        return new C13536(this, interfaceC1583);
    }

    public C16399(InterfaceC1583 interfaceC1583) {
        this.f50462 = interfaceC1583;
    }

    @Override // l.InterfaceC1583
    /* JADX INFO: renamed from: ֫ */
    public final int mo5427(long j, long j2) {
        return this.f50462.mo5427(j2, j);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final Comparator reversed() {
        return this.f50462;
    }
}
