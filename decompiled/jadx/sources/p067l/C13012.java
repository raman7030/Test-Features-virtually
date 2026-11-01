package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13012 extends AbstractC25081 {

    /* JADX INFO: renamed from: ܳ */
    public C10309 f36614;

    /* JADX INFO: renamed from: ᩻ */
    public C12992 f36615;

    /* JADX INFO: renamed from: ֫ */
    public final void m29829(C12992 c12992) {
        this.f36615 = c12992;
    }

    @Override // p067l.AbstractC25081
    /* JADX INFO: renamed from: ۧ */
    public final void mo8717() {
        double[] dArrM40211 = this.f36614.m40211(0);
        double[] dArrM40212 = this.f36614.m40211(1);
        C12992 c12992 = this.f36615;
        if (c12992 != null) {
            for (int i = 0; i < 8; i++) {
                try {
                    c12992.m29780(dArrM40211[i]);
                    c12992.m29780(dArrM40212[i]);
                } catch (IOException unused) {
                    return;
                }
            }
        }
    }
}
