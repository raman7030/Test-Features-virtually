package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ۘۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5929 implements Iterable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ int f14637;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ Iterator f14638;

    /* JADX INFO: renamed from: ۬ */
    public final /* synthetic */ boolean f14639;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C9952 f14640;

    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC15529 f14641;

    /* JADX INFO: renamed from: ᩹ */
    public final InterfaceC15529 f14642;

    public C5929(C9952 c9952, AbstractC12674 abstractC12674, int i, Iterator it, boolean z) {
        this.f14640 = c9952;
        this.f14637 = i;
        this.f14638 = it;
        this.f14639 = z;
        this.f14641 = abstractC12674.mo7903();
        this.f14642 = abstractC12674.mo7904();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4588(this, this.f14640.f27561, this.f14637);
    }
}
