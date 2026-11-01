package p067l;

import java.io.Writer;
import java.util.List;

/* JADX INFO: renamed from: l.ۗܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: C4OQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C5472 extends AbstractC20206 {

    /* JADX INFO: renamed from: ۙ */
    public String f13056 = null;

    /* JADX INFO: renamed from: ᩶ */
    public int f13057;

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f13058;

    /* JADX INFO: renamed from: ᩹ */
    public final int f13059;

    public C5472(C14645 c14645, int i) {
        this.f13058 = c14645;
        this.f13059 = i;
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ܳ */
    public final String mo5853() {
        C14645 c14645 = this.f13058;
        return c14645.m33487(c14645.m33504().m13856(c14645.m33501(this.f13059)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12048(Writer writer) {
        C14645 c14645 = this.f13058;
        c14645.m33472(writer, c14645.m33504().m13856(c14645.m33501(this.f13059)));
    }

    @Override // p067l.InterfaceC7568
    public final String getName() {
        C14645 c14645 = this.f13058;
        return c14645.m33508(c14645.m33504().mo13855(c14645.m33501(this.f13059) + 4));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12049(Writer writer) {
        C14645 c14645 = this.f13058;
        c14645.m33492(c14645.m33504().mo13855(c14645.m33501(this.f13059) + 4), writer, false);
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ۘ */
    public final List mo5852() {
        int iM12047 = m12047();
        C14645 c14645 = this.f13058;
        int iMo13855 = c14645.m33504().mo13855(iM12047 + 8);
        if (iMo13855 > 0) {
            return new C6813(this, iMo13855 + 4, c14645.m33504().mo13855(iMo13855));
        }
        return AbstractC16192.m36872of();
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12050(Writer writer) {
        int iM12047 = m12047();
        C14645 c14645 = this.f13058;
        int iMo13855 = c14645.m33504().mo13855(iM12047 + 8);
        if (iMo13855 > 0) {
            int iMo13856 = c14645.m33504().mo13855(iMo13855);
            int i = iMo13855 + 4;
            for (int i2 = 0; i2 < iMo13856; i2++) {
                c14645.m33472(writer, c14645.m33504().m13856((i2 * 2) + i));
            }
        }
    }

    @Override // p067l.InterfaceC7568
    /* JADX INFO: renamed from: ᩳ */
    public final String mo5855() {
        int iM12047 = m12047();
        C14645 c14645 = this.f13058;
        return c14645.m33487(c14645.m33504().mo13855(iM12047 + 4));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12052(Writer writer) {
        int iM12047 = m12047();
        C14645 c14645 = this.f13058;
        c14645.m33472(writer, c14645.m33504().mo13855(iM12047 + 4));
    }

    /* JADX INFO: renamed from: ֡ */
    private int m12047() {
        if (this.f13057 == 0) {
            C14645 c14645 = this.f13058;
            this.f13057 = c14645.m33485(c14645.m33504().m13856(c14645.m33501(this.f13059) + 2));
        }
        return this.f13057;
    }

    @Override // p067l.AbstractC20206
    public final String toString() {
        if (this.f13056 == null) {
            this.f13056 = C16010.m36382((InterfaceC7568) this, false);
        }
        return this.f13056;
    }

    @Override // p067l.AbstractC20877, p067l.InterfaceC10250
    /* JADX INFO: renamed from: ܿ */
    public final void mo12051() throws C3544 {
        int i = this.f13059;
        if (i < 0 || i >= this.f13058.m33507()) {
            throw new C3544("method@" + i);
        }
    }
}
