package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢ۫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: F5KS */
/* JADX INFO: loaded from: classes3.dex */
public final class C11481 extends AbstractC22626 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f32053;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ Iterable f32054;

    public C11481(Iterable iterable, int i) {
        this.f32054 = iterable;
        this.f32053 = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f32054.iterator();
        it.getClass();
        int i = this.f32053;
        C6194.m14029("limit is negative", i >= 0);
        return new C20869(i, it);
    }
}
