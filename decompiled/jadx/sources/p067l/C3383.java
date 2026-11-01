package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.֨ۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3383 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ C12101 f6687;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C22830 f6688;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3383(C22830 c22830, Object[] objArr, C12101 c12101) {
        super("OkHttp %s stream %d", objArr);
        this.f6688 = c22830;
        this.f6687 = c12101;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        C12101 c12101 = this.f6687;
        C23500 c23500 = this.f6688.f71910;
        try {
            c23500.f74878.mo4201(c12101);
        } catch (IOException e) {
            C20304.m45846().mo45848(4, "Http2Connection.Listener failure for " + c23500.f74873, e);
            try {
                c12101.m27959(EnumC15197.PROTOCOL_ERROR);
            } catch (IOException unused) {
            }
        }
    }
}
