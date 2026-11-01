package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۜۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8748 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ long f23704;

    /* JADX INFO: renamed from: ᩶ */
    public final /* synthetic */ int f23705;

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23500 f23706;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8748(C23500 c23500, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.f23706 = c23500;
        this.f23705 = i;
        this.f23704 = j;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        C23500 c23500 = this.f23706;
        try {
            c23500.f74872.m18741(this.f23705, this.f23704);
        } catch (IOException unused) {
            C23500.m52239(c23500);
        }
    }
}
