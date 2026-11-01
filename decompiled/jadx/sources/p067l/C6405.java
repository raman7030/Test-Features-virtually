package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX INFO: renamed from: l.ۘ᩺ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09F6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6405 extends C12795 {

    /* JADX INFO: renamed from: ܳ */
    public final C22320 f16589;

    /* JADX INFO: renamed from: ᩻ */
    public final C13978 f16590;

    public C6405(EnumC23366 enumC23366, C13978 c13978, long j, long j2, C22320 c22320, int i) {
        super(49, enumC23366, EnumC24036.SMB2_WRITE, j, j2, Math.min(i, c22320.mo25182()));
        this.f16590 = c13978;
        this.f16589 = c22320;
    }

    @Override // p067l.C18158
    /* JADX INFO: renamed from: ᩳ */
    public final void mo10795(C2460 c2460) {
        c2460.m28111(this.f54223);
        c2460.m28111(UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        c2460.m28113(m29345());
        C22320 c22320 = this.f16589;
        c2460.m28118(c22320.m26689());
        this.f16590.m31769(c2460);
        c2460.m28113(0L);
        c2460.m28113(Math.max(0, c22320.mo25182() - m29345()));
        c2460.m28111(0);
        c2460.m28111(0);
        c2460.m28113(0L);
        c22320.m26687(c2460, ((C24864) mo5341()).m54617());
    }

    @Override // p067l.AbstractC3131
    /* JADX INFO: renamed from: ܽ */
    public final int mo5342() {
        return m29345() + UMErrorCode.E_UM_BE_DEFLATE_FAILED;
    }
}
