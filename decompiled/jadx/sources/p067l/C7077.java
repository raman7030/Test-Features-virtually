package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes3.dex */
public final class C7077 implements InterfaceC13980 {

    /* JADX INFO: renamed from: ᩸ */
    public C18179 f18448;

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811((int) EnumC9462.AE_ANNOTATION.m21974());
        this.f18448.mo5157(c8121);
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return this.f18448.getLength() + 1;
    }

    @Override // p067l.InterfaceC13980
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4079 mo16297(C5263 c5263) {
        this.f18448 = (C18179) C14650.m33519(this.f18448, c5263);
        return this;
    }
}
