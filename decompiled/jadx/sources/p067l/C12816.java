package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧ۫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7DV */
/* JADX INFO: loaded from: classes4.dex */
public final class C12816 implements InterfaceC13980 {

    /* JADX INFO: renamed from: ᩸ */
    public C17450 f36046;

    /* JADX INFO: renamed from: ᩹ */
    public InterfaceC4079 f36047;

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C12816(C17450 c17450, InterfaceC13980 interfaceC13980) {
        this.f36046 = c17450;
        this.f36047 = interfaceC13980;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        this.f36046.mo5157(interfaceC2756);
        this.f36047.mo5157(interfaceC2756);
    }

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return this.f36047.getLength() + 2;
    }

    @Override // p067l.InterfaceC13980
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4079 mo16297(C5263 c5263) {
        C17450 c17450 = this.f36046;
        C14650.m33520(c17450, c5263);
        this.f36046 = c17450;
        this.f36047 = C14650.m33519(this.f36047, c5263);
        return this;
    }
}
