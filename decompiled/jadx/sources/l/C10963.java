package l;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۧۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: BWD */
/* JADX INFO: loaded from: classes4.dex */
public final class C10963 implements InterfaceC1790, InterfaceC21606 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Comparator f33001;

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

    @Override // l.InterfaceC1790
    /* JADX INFO: renamed from: ܽ */
    public final C13515 mo5959(InterfaceC1790 interfaceC1790) {
        return new C13515(this, interfaceC1790);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final Comparator reversed() {
        return new C16606(this);
    }

    public C10963(Comparator comparator) {
        this.f33001 = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f33001.compare((Character) obj, (Character) obj2);
    }

    @Override // l.InterfaceC1790
    /* JADX INFO: renamed from: ֫ */
    public final int mo5958(char c, char c2) {
        return this.f33001.compare(Character.valueOf(c), Character.valueOf(c2));
    }
}
