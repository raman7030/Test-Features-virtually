package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩺۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes.dex */
public final class C22842 extends AbstractC13669 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f73724;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 1;
    }

    public C22842(EnumC17734 enumC17734, int i) {
        super(enumC17734);
        this.f73724 = i;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        ((C6053) interfaceC0408).m16882(this.f73724);
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ܽ */
    public final String mo9438() {
        return String.format("{ type_parameter_index: %d; }", Integer.valueOf(this.f73724));
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ֫ */
    public final String mo9436() {
        return String.valueOf(this.f73724);
    }
}
