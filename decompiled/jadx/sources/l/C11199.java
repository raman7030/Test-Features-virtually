package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ᩵ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 08E3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11199 extends AbstractC23898 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8355 f33615;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C11178 f33616;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27767(C11178 c11178) {
        this.f33616 = c11178;
    }

    @Override // l.AbstractC23898
    /* JADX INFO: renamed from: ۧ */
    public final void mo6591() {
        double[] dArrM38020 = this.f33615.m38020(0);
        double[] dArrM38021 = this.f33615.m38020(1);
        C11178 c11178 = this.f33616;
        if (c11178 != null) {
            for (int i = 0; i < 8; i++) {
                try {
                    c11178.m27718(dArrM38020[i]);
                    c11178.m27718(dArrM38021[i]);
                } catch (IOException unused) {
                    return;
                }
            }
        }
    }
}
