package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11294 implements Iterable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ boolean f31469;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Iterator f31470;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f31471;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9952 f31472;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC12674 f31473;

    public C11294(C9952 c9952, AbstractC12674 abstractC12674, int i, Iterator it, boolean z) {
        this.f31472 = c9952;
        this.f31473 = abstractC12674;
        this.f31471 = i;
        this.f31470 = it;
        this.f31469 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C22023(this, this.f31472.f27561, this.f31471, this.f31473.mo7902());
    }
}
