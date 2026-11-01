package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8N8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16959 implements InterfaceC20314 {

    /* JADX INFO: renamed from: ֫ */
    public boolean f50176;

    /* JADX INFO: renamed from: ۧ */
    public int f50177;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C23666 f50178;

    public C16959(C23666 c23666) {
        this.f50178 = c23666;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38546() {
        if (this.f50177 == 2) {
            this.f50177 = 1;
        }
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8569() {
        return this.f50178.f75348;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final void mo8568() throws IOException {
        C23666 c23666 = this.f50178;
        if (c23666.f75343) {
            return;
        }
        c23666.f75350.m25037(Integer.MIN_VALUE);
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final int mo8567(C5221 c5221, C23128 c23128, int i) {
        m38545();
        C23666 c23666 = this.f50178;
        boolean z = c23666.f75348;
        if (z && c23666.f75346 == null) {
            this.f50177 = 2;
        }
        int i2 = this.f50177;
        if (i2 == 2) {
            c23128.m14567(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            c5221.f12253 = c23666.f75344;
            this.f50177 = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        c23666.f75346.getClass();
        c23128.m14567(1);
        c23128.f72706 = 0L;
        if ((i & 4) == 0) {
            c23128.m51579(c23666.f75349);
            c23128.f72704.put(c23666.f75346, 0, c23666.f75349);
        }
        if ((i & 1) == 0) {
            this.f50177 = 2;
        }
        return -4;
    }

    @Override // p067l.InterfaceC20314
    /* JADX INFO: renamed from: ֫ */
    public final int mo8566(long j) {
        m38545();
        if (j <= 0 || this.f50177 == 2) {
            return 0;
        }
        this.f50177 = 2;
        return 1;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m38545() {
        if (this.f50176) {
            return;
        }
        C23666 c23666 = this.f50178;
        C10099 c10099 = c23666.f75345;
        c10099.m23563(new C14496(c10099, new C8758(1, C11669.m26822(c23666.f75344.f28528), c23666.f75344, 0, null, C5792.m13013(0L), -9223372036854775807L)));
        this.f50176 = true;
    }
}
