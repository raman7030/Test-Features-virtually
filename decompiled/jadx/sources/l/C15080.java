package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A7FF */
/* JADX INFO: loaded from: classes5.dex */
public final class C15080 extends AbstractC13669 {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f46071;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 2;
    }

    public C15080(EnumC17734 enumC17734, int i) {
        super(enumC17734);
        this.f46071 = i;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        ((C6053) interfaceC0408).m16889(this.f46071);
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ܽ */
    public final String mo9438() {
        return String.format("{ exception_table_index: %d; }", Integer.valueOf(this.f46071));
    }

    @Override // l.AbstractC13669
    /* JADX INFO: renamed from: ֫ */
    public final String mo9436() {
        return String.valueOf(this.f46071);
    }
}
