package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C14453 implements InterfaceC13980 {

    /* JADX INFO: renamed from: ᩸ */
    public C17450 f41293;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 3;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C14453(C17450 c17450) {
        this.f41293 = c17450;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811((int) EnumC9462.AE_CLASS.m21974());
        this.f41293.mo5157((InterfaceC2756) c8121);
    }

    @Override // p067l.InterfaceC13980
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4079 mo16297(C5263 c5263) {
        C17450 c17450 = this.f41293;
        C14650.m33520(c17450, c5263);
        this.f41293 = c17450;
        return this;
    }
}
