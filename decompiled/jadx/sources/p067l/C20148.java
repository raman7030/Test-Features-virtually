package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I4F9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20148 extends AbstractRunnableC16711 {

    /* JADX INFO: renamed from: ᩹ */
    public final /* synthetic */ C23500 f62371;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20148(C23500 c23500) {
        super("OkHttp %s ping", c23500.f74873);
        this.f62371 = c23500;
    }

    @Override // p067l.AbstractRunnableC16711
    /* JADX INFO: renamed from: ֫ */
    public final void mo5904() {
        boolean z;
        synchronized (this.f62371) {
            if (this.f62371.f74875 < this.f62371.f74868) {
                z = true;
            } else {
                C23500.m52246(this.f62371);
                z = false;
            }
        }
        if (z) {
            C23500 c23500 = this.f62371;
            try {
                EnumC15197 enumC15197 = EnumC15197.PROTOCOL_ERROR;
                c23500.m52261(enumC15197, enumC15197);
                return;
            } catch (IOException unused) {
                return;
            }
        }
        this.f62371.m52253(1, 0, false);
    }
}
