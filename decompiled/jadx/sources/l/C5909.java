package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۛ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5909 extends AbstractC13669 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f18136;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f18137;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 3;
    }

    public C5909(EnumC17734 enumC17734, int i, int i2) {
        super(enumC17734);
        this.f18137 = i;
        this.f18136 = i2;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(this.f18137);
        c6053.m16882(this.f18136);
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ֫ */
    public final String mo9436() {
        return this.f18137 + " " + this.f18136;
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ܽ */
    public final String mo9438() {
        return String.format("{ offset: %d; type_argument_index: %d; }", Integer.valueOf(this.f18137), Integer.valueOf(this.f18136));
    }
}
