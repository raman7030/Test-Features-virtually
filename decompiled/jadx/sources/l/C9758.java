package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ۢᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2E9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9758 implements InterfaceC6935, Serializable, InterfaceC21606 {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC6935 f29533;

    @Override // java.util.Comparator, l.InterfaceC21606
    public final /* synthetic */ Comparator thenComparing(Comparator comparator) {
        return C23868.m52581(this, comparator);
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
        return mo18747(((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }

    @Override // l.InterfaceC6935
    /* JADX INFO: renamed from: ֫ */
    public final C14695 mo18748(InterfaceC6935 interfaceC6935) {
        return new C14695(this, interfaceC6935);
    }

    public C9758(InterfaceC6935 interfaceC6935) {
        this.f29533 = interfaceC6935;
    }

    @Override // l.InterfaceC6935
    /* JADX INFO: renamed from: ֫ */
    public final int mo18747(float f, float f2) {
        return this.f29533.mo18747(f2, f);
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final Comparator reversed() {
        return this.f29533;
    }
}
