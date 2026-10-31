package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6713 extends AbstractRunnableC15091 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ long f20830;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f20831;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22235 f20832;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6713(C22235 c22235, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f20832 = c22235;
        this.f20831 = i;
        this.f20830 = j;
    }

    @Override // l.AbstractRunnableC15091
    /* JADX INFO: renamed from: ֫ */
    public final void mo3633() {
        C22235 c22235 = this.f20832;
        try {
            c22235.f72147.m16814(this.f20831, this.f20830);
        } catch (IOException unused) {
            C22235.m49911(c22235);
        }
    }
}
