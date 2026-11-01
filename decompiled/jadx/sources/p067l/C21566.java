package p067l;

import java.io.Writer;
import java.util.List;

/* JADX INFO: renamed from: l.᩶ܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: R4MX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21566 extends AbstractC6124 {

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f68005;

    /* JADX INFO: renamed from: ᩹ */
    public final int f68006;

    public C21566(C14645 c14645, int i) {
        this.f68005 = c14645;
        this.f68006 = i;
    }

    @Override // p067l.InterfaceC2873
    /* JADX INFO: renamed from: ۘ */
    public final List mo4624() {
        C14645 c14645 = this.f68005;
        int iMo13855 = c14645.m33504().mo13855(c14645.m33485(this.f68006) + 8);
        if (iMo13855 > 0) {
            return new C23577(this, iMo13855 + 4, c14645.m33504().mo13855(iMo13855));
        }
        return AbstractC16192.m36872of();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m48755(Writer writer) {
        C14645 c14645 = this.f68005;
        int iMo13855 = c14645.m33504().mo13855(c14645.m33485(this.f68006) + 8);
        if (iMo13855 > 0) {
            int iMo13856 = c14645.m33504().mo13855(iMo13855);
            int i = iMo13855 + 4;
            for (int i2 = 0; i2 < iMo13856; i2++) {
                c14645.m33472(writer, c14645.m33504().m13856((i2 * 2) + i));
            }
        }
    }

    @Override // p067l.InterfaceC2873
    /* JADX INFO: renamed from: ᩳ */
    public final String mo4625() {
        C14645 c14645 = this.f68005;
        return c14645.m33487(c14645.m33504().mo13855(c14645.m33485(this.f68006) + 4));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m48756(Writer writer) {
        C14645 c14645 = this.f68005;
        c14645.m33472(writer, c14645.m33504().mo13855(c14645.m33485(this.f68006) + 4));
    }

    @Override // p067l.AbstractC20877, p067l.InterfaceC10250
    /* JADX INFO: renamed from: ܿ */
    public final void mo12051() throws C3544 {
        int i = this.f68006;
        if (i < 0 || i >= this.f68005.m33486()) {
            throw new C3544("proto@" + i);
        }
    }
}
