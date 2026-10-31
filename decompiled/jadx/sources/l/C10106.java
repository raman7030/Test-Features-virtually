package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10106 extends C18032 implements InterfaceC20855, InterfaceC0528 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f30428 = -1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC16620 f30429;

    @Override // l.C18032, l.InterfaceC5872
    public final void onTransitionCancel(AbstractC16620 abstractC16620) {
    }

    public C10106(AbstractC16620 abstractC16620) {
        this.f30429 = abstractC16620;
        Arrays.fill(new long[20], Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m25390() {
        AbstractC16620 abstractC16620 = this.f30429;
        long j = abstractC16620.getTotalDurationMillis() == 0 ? 1L : 0L;
        abstractC16620.setCurrentPlayTimeMillis(j, this.f30428);
        this.f30428 = j;
    }

    @Override // l.InterfaceC0528
    /* JADX INFO: renamed from: ֫ */
    public final void mo2246(float f) {
        AbstractC16620 abstractC16620 = this.f30429;
        long jMax = Math.max(-1L, Math.min(abstractC16620.getTotalDurationMillis() + 1, Math.round(f)));
        abstractC16620.setCurrentPlayTimeMillis(jMax, this.f30428);
        this.f30428 = jMax;
    }
}
