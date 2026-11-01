package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes3.dex */
public final class C8102 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩸ */
    public int f21369;

    /* JADX INFO: renamed from: ᩹ */
    public C17450 f21370;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 4;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C8102(int i, C17450 c17450) {
        this.f21369 = i;
        this.f21370 = c17450;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C17450 c17450 = this.f21370;
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(c17450 == null ? 0 : c17450.f23817);
        c8121.m18818(this.f21369);
    }
}
