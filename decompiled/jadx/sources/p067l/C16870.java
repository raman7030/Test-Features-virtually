package p067l;

import java.io.Writer;

/* JADX INFO: renamed from: l.ܶܰ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q4IO */
/* JADX INFO: loaded from: classes5.dex */
public final class C16870 extends AbstractC17522 {

    /* JADX INFO: renamed from: ᩸ */
    public final C14645 f49955;

    /* JADX INFO: renamed from: ᩹ */
    public final int f49956;

    public C16870(C14645 c14645, int i) {
        this.f49955 = c14645;
        this.f49956 = i;
    }

    @Override // p067l.InterfaceC20309
    /* JADX INFO: renamed from: ܳ */
    public final String mo10231() {
        C14645 c14645 = this.f49955;
        return c14645.m33487(c14645.m33504().m13856(c14645.m33490(this.f49956)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38431(Writer writer) {
        C14645 c14645 = this.f49955;
        c14645.m33472(writer, c14645.m33504().m13856(c14645.m33490(this.f49956)));
    }

    @Override // p067l.InterfaceC20309
    public final String getName() {
        C14645 c14645 = this.f49955;
        return c14645.m33508(c14645.m33504().mo13855(c14645.m33490(this.f49956) + 4));
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38432(Writer writer) {
        C14645 c14645 = this.f49955;
        c14645.m33492(c14645.m33504().mo13855(c14645.m33490(this.f49956) + 4), writer, false);
    }

    @Override // p067l.InterfaceC20309
    public final String getType() {
        C14645 c14645 = this.f49955;
        return c14645.m33487(c14645.m33504().m13856(c14645.m33490(this.f49956) + 2));
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38433(Writer writer) {
        C14645 c14645 = this.f49955;
        c14645.m33472(writer, c14645.m33504().m13856(c14645.m33490(this.f49956) + 2));
    }

    @Override // p067l.AbstractC20877, p067l.InterfaceC10250
    /* JADX INFO: renamed from: ܿ */
    public final void mo12051() throws C3544 {
        int i = this.f49956;
        if (i < 0 || i >= this.f49955.m33509()) {
            throw new C3544("field@" + i);
        }
    }
}
