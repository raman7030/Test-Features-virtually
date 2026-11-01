package p067l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۠۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57DZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9996 extends C18179 {

    /* JADX INFO: renamed from: ۗ */
    public EnumC19222 f27675;

    /* JADX INFO: renamed from: ۙ */
    public AbstractC15359 f27676;

    /* JADX INFO: renamed from: ۬ */
    public C3799 f27677;

    public C9996(C17450 c17450, boolean z) {
        super(c17450, z);
        this.f27677 = new C3799();
    }

    @Override // p067l.C18179, p067l.InterfaceC4079
    public final int getLength() {
        return this.f27677.getLength() + super.getLength() + 1 + this.f27676.getLength();
    }

    @Override // p067l.C18179, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18811(this.f27675.f57466);
        this.f27676.mo5157(c8121);
        this.f27677.mo5157(c8121);
        super.mo5157(c8121);
    }

    public final String toString() {
        return this.f27675.toString() + " " + this.f27676.toString() + " " + this.f27677.toString();
    }
}
