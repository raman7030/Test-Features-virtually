package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۨ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes4.dex */
public final class C11554 extends AbstractC13669 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34479;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f34480;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 2;
    }

    public C11554(EnumC17734 enumC17734, int i, int i2) {
        super(enumC17734);
        this.f34479 = i;
        this.f34480 = i2;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16882(this.f34479);
        c6053.m16882(this.f34480);
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ֫ */
    public final String mo9436() {
        return this.f34479 + " " + this.f34480;
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ܽ */
    public final String mo9438() {
        return String.format("{ type_parameter_index: %d; bound_index: %d; }", Integer.valueOf(this.f34479), Integer.valueOf(this.f34480));
    }
}
