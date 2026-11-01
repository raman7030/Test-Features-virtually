package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤۛۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G5Y2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11973 extends C19506 implements InterfaceC22189, InterfaceC2870 {

    /* JADX INFO: renamed from: ֫ */
    public long f33387 = -1;

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ AbstractC18164 f33388;

    @Override // p067l.C19506, p067l.InterfaceC7949
    public final void onTransitionCancel(AbstractC18164 abstractC18164) {
    }

    public C11973(AbstractC18164 abstractC18164) {
        this.f33388 = abstractC18164;
        Arrays.fill(new long[20], Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m27409() {
        AbstractC18164 abstractC18164 = this.f33388;
        long j = abstractC18164.getTotalDurationMillis() == 0 ? 1L : 0L;
        abstractC18164.setCurrentPlayTimeMillis(j, this.f33387);
        this.f33387 = j;
    }

    @Override // p067l.InterfaceC2870
    /* JADX INFO: renamed from: ֫ */
    public final void mo4613(float f) {
        AbstractC18164 abstractC18164 = this.f33388;
        long jMax = Math.max(-1L, Math.min(abstractC18164.getTotalDurationMillis() + 1, Math.round(f)));
        abstractC18164.setCurrentPlayTimeMillis(jMax, this.f33387);
        this.f33387 = jMax;
    }
}
