package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes3.dex */
public final class C8418 implements InterfaceC13980 {

    /* JADX INFO: renamed from: ᩸ */
    public C17450 f22567;

    /* JADX INFO: renamed from: ᩹ */
    public C17450 f22568;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 5;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C8418(C17450 c17450, C17450 c17451) {
        this.f22568 = c17450;
        this.f22567 = c17451;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811((int) EnumC9462.AE_ENUM.m21974());
        this.f22568.mo5157((InterfaceC2756) c8121);
        this.f22567.mo5157((InterfaceC2756) c8121);
    }

    @Override // p067l.InterfaceC13980
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4079 mo16297(C5263 c5263) {
        C17450 c17450 = this.f22568;
        C14650.m33520(c17450, c5263);
        this.f22568 = c17450;
        C17450 c17451 = this.f22567;
        C14650.m33520(c17451, c5263);
        this.f22567 = c17451;
        return this;
    }
}
