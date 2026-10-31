package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.۬ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CFT */
/* JADX INFO: loaded from: classes4.dex */
public final class C13037 implements InterfaceC4571, Serializable, InterfaceC21606 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC4571 f39040;

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C20094.m46317(this, comparator);
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
        return mo9675(((Integer) obj).intValue(), ((Integer) obj2).intValue());
    }

    @Override // l.InterfaceC4571
    /* JADX INFO: renamed from: ֫ */
    public final C22210 mo9674(InterfaceC4571 interfaceC4571) {
        return new C22210(this, interfaceC4571);
    }

    public C13037(InterfaceC4571 interfaceC4571) {
        this.f39040 = interfaceC4571;
    }

    @Override // l.InterfaceC4571
    /* JADX INFO: renamed from: ۧ */
    public final int mo9675(int i, int i2) {
        return this.f39040.mo9675(i2, i);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final Comparator reversed() {
        return this.f39040;
    }
}
