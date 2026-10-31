package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ۬ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5PI */
/* JADX INFO: loaded from: classes5.dex */
public final class C16661 implements InterfaceC14544 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f51158 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18073 f51159;

    public C16661(C18073 c18073) {
        this.f51159 = c18073;
    }

    @Override // l.InterfaceC14544
    /* JADX INFO: renamed from: ۧ */
    public final void mo13743(int i) {
        C18073 c18073 = this.f51159;
        if (i == -1) {
            c18073.f56297.m51038(R.string.MT_Protector);
            return;
        }
        if (this.f51158) {
            c18073.f56297.m51038(R.string.MT_Protector);
            this.f51158 = false;
        }
        c18073.f56297.m51045(i);
    }

    @Override // l.InterfaceC17066
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo1526() {
        return this.f51159.f56297.m51053();
    }
}
