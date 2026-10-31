package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܰ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: RC7A */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13515 implements InterfaceC1790, Serializable, InterfaceC21606 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1790 f40328;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1790 f40329;

    public /* synthetic */ C13515(InterfaceC1790 interfaceC1790, InterfaceC1790 interfaceC1791) {
        this.f40328 = interfaceC1790;
        this.f40329 = interfaceC1791;
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C7166.m19191(this, comparator);
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
        return mo5958(((Character) obj).charValue(), ((Character) obj2).charValue());
    }

    @Override // l.InterfaceC1790
    /* JADX INFO: renamed from: ܽ */
    public final C13515 mo5959(InterfaceC1790 interfaceC1790) {
        return new C13515(this, interfaceC1790);
    }

    @Override // l.InterfaceC1790
    /* JADX INFO: renamed from: ֫ */
    public final int mo5958(char c, char c2) {
        int iMo5958 = this.f40328.mo5958(c, c2);
        return iMo5958 == 0 ? this.f40329.mo5958(c, c2) : iMo5958;
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final Comparator reversed() {
        return new C16606(this);
    }
}
