package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۤۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DD */
/* JADX INFO: loaded from: classes3.dex */
public final class C10102 implements InterfaceC1800 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f30408;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C15869 f30409;

    @Override // l.InterfaceC1800
    public final int getLength() {
        return 2;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ boolean mo2829() {
        return true;
    }

    @Override // l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C15869 c15869 = this.f30409;
        if (this.f30408 == -1) {
            this.f30408 = c15869.f20943;
        }
        int i = this.f30408;
        if (i == -1) {
            throw new IOException(C4860.m14172("a file due to implementation issue:\n\t\t \"Can't retrieve CP Index for ", c15869 == null ? "null" : c15869.toString(), "\""));
        }
        ((C6053) interfaceC0408).m16889(i);
    }
}
