package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩷ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H7D7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22185 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ۙ */
    public C17450 f70188;

    /* JADX INFO: renamed from: ᩶ */
    public C17450 f70189;

    /* JADX INFO: renamed from: ᩸ */
    public int f70190;

    /* JADX INFO: renamed from: ᩹ */
    public C17450 f70191;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 8;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C17450 c17450 = this.f70189;
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f70191.f23817);
        C17450 c17451 = this.f70188;
        if (c17451.mo20303()) {
            c8121.m18818(c17451.f23817);
        } else {
            c8121.m18818(0);
        }
        if (c17450.mo20303()) {
            c8121.m18818(c17450.f23817);
        } else {
            c8121.m18818(0);
        }
        c8121.m18818(this.f70190);
    }
}
