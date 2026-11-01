package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 87EI */
/* JADX INFO: loaded from: classes5.dex */
public final class C21514 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩸ */
    public long f67886;

    /* JADX INFO: renamed from: ᩹ */
    public int f67887;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 4;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C21514(int i, long j) {
        this.f67887 = i;
        this.f67886 = j;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(this.f67887);
        c8121.m18818((int) this.f67886);
    }
}
