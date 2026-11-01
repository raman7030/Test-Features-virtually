package p067l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܺۛ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: M605 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17327 implements Iterable {

    /* JADX INFO: renamed from: ۗ */
    public final /* synthetic */ boolean f51704;

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int f51705;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ Iterator f51706;

    /* JADX INFO: renamed from: ᩸ */
    public final /* synthetic */ C9952 f51707;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ AbstractC12674 f51708;

    public C17327(C9952 c9952, AbstractC12674 abstractC12674, int i, Iterator it, boolean z) {
        this.f51707 = c9952;
        this.f51708 = abstractC12674;
        this.f51705 = i;
        this.f51706 = it;
        this.f51704 = z;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        AbstractC12674 abstractC12674 = this.f51708;
        return new C10623(this, this.f51707.f27561, this.f51705, abstractC12674.mo7903(), abstractC12674.mo7904());
    }
}
