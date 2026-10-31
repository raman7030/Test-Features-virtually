package l;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.ܳᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4CK5 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14695 implements InterfaceC6935, Serializable, InterfaceC21606 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6935 f44889;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC6935 f44890;

    public /* synthetic */ C14695(InterfaceC6935 interfaceC6935, InterfaceC6935 interfaceC6936) {
        this.f44889 = interfaceC6935;
        this.f44890 = interfaceC6936;
    }

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

    @Override // l.InterfaceC6935
    /* JADX INFO: renamed from: ֫ */
    public final int mo18747(float f, float f2) {
        int iMo18747 = this.f44889.mo18747(f, f2);
        return iMo18747 == 0 ? this.f44890.mo18747(f, f2) : iMo18747;
    }

    @Override // java.util.Comparator, l.InterfaceC21606
    public final Comparator reversed() {
        return new C9758(this);
    }
}
