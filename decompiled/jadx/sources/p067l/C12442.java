package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7EF */
/* JADX INFO: loaded from: classes4.dex */
public final class C12442 implements InterfaceC13980 {

    /* JADX INFO: renamed from: ᩸ */
    public C17450 f34781;

    /* JADX INFO: renamed from: ᩹ */
    public char f34782;

    @Override // p067l.InterfaceC4079
    public final int getLength() {
        return 3;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo5158() {
        return true;
    }

    public C12442(char c, C17450 c17450) {
        this.f34782 = c;
        this.f34781 = c17450;
    }

    @Override // p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811((int) this.f34782);
        this.f34781.mo5157((InterfaceC2756) c8121);
    }

    @Override // p067l.InterfaceC13980
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4079 mo16297(C5263 c5263) {
        if (!this.f34781.mo20303()) {
            C17450 c17450 = this.f34781;
            C14650.m33520(c17450, c5263);
            this.f34781 = c17450;
            if (!EnumC9462.m21970(this.f34782)) {
                AbstractC4711 abstractC4711 = this.f34781.f52180;
                this.f34782 = abstractC4711 == null ? EnumC9462.AE_NOT_APPLICABLE.m21974() : abstractC4711.f10653.m29296();
            }
        }
        return this;
    }
}
