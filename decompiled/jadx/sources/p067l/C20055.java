package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L7ER */
/* JADX INFO: loaded from: classes5.dex */
public final class C20055 implements InterfaceC4079 {

    /* JADX INFO: renamed from: ᩸ */
    public C8773 f60932;

    /* JADX INFO: renamed from: ᩹ */
    public EnumC15515 f60933;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 3;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C20055(EnumC15515 enumC15515, C8773 c8773) {
        this.f60933 = enumC15515;
        this.f60932 = c8773;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811(this.f60933.m35311().intValue());
        c8121.m18818(this.f60932.f23817);
    }
}
