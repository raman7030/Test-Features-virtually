package p067l;

import java.util.List;

/* JADX INFO: renamed from: l.ܽ۫֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S515 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18174 extends AbstractC11489 {

    /* JADX INFO: renamed from: ֫ */
    public final C18845 f54252;

    /* JADX INFO: renamed from: ۧ */
    public final AbstractC15510 f54253;

    /* JADX INFO: renamed from: ܽ */
    public final C18845 f54254;

    public C18174(C18845 c18845, C18845 c18846, AbstractC15510 abstractC15510) {
        this.f54254 = c18845;
        this.f54252 = c18846;
        this.f54253 = abstractC15510;
    }

    public C18174(C18845 c18845, C18845 c18846, C18845 c18847) {
        this.f54254 = c18845;
        this.f54252 = c18846;
        this.f54253 = new C24228(c18847);
    }

    public C18174(C18845 c18845, C18845 c18846, InterfaceC22991 interfaceC22991, C18845 c18847) {
        AbstractC15510 c13500;
        this.f54254 = c18845;
        this.f54252 = c18846;
        if (interfaceC22991 != null) {
            c13500 = new C13500(c18847, interfaceC22991);
        } else {
            c13500 = new C24228(c18847);
        }
        this.f54253 = c13500;
    }

    @Override // p067l.InterfaceC7156
    /* JADX INFO: renamed from: ֫ */
    public final int mo16459() {
        return this.f54254.m42918().f52332;
    }

    @Override // p067l.InterfaceC7156
    /* JADX INFO: renamed from: ܽ */
    public final int mo16461() {
        return this.f54252.m42918().f52332 - this.f54254.m42918().f52332;
    }

    @Override // p067l.InterfaceC7156
    /* JADX INFO: renamed from: ۧ */
    public final List mo16460() {
        return AbstractC16192.m36873of((Object) this.f54253);
    }
}
