package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes4.dex */
public final class C10143 extends AbstractC13669 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f30521;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 2;
    }

    public C10143(EnumC17734 enumC17734, int i) {
        super(enumC17734);
        this.f30521 = i;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        ((C6053) interfaceC0408).m16889(this.f30521);
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ܽ */
    public final String mo9438() {
        return String.format("{ throws_type_index: %d; }", Integer.valueOf(this.f30521));
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ֫ */
    public final String mo9436() {
        return String.valueOf(this.f30521);
    }
}
