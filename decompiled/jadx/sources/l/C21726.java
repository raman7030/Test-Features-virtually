package l;

/* JADX INFO: renamed from: l.᩸ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes.dex */
public final class C21726 implements InterfaceC19124 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC2190 f69688;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f69689;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f69690;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C16300 f69691;

    public C21726(String str, InterfaceC2190 interfaceC2190) {
        this.f69691 = C16300.m38334(str, (C19954) null);
        this.f69688 = interfaceC2190;
    }

    @Override // l.InterfaceC19124
    public final C16300 getLine() {
        return this.f69691;
    }

    @Override // l.InterfaceC19124
    public final int getIndex() {
        return this.f69690;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ۧ */
    public final int mo44150() {
        return this.f69689;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC2190 mo44152() {
        return this.f69688;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ᩳ */
    public final int mo44153() {
        int i = this.f69690;
        CharSequence charSequenceM38335 = this.f69691.m38335();
        while (i < charSequenceM38335.length() && (charSequenceM38335.charAt(i) == ' ' || charSequenceM38335.charAt(i) == '\t')) {
            i++;
        }
        return i;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ܽ */
    public final int mo44151() {
        int iMo44153 = mo44153();
        int i = this.f69689;
        for (int i2 = this.f69690; i2 < iMo44153; i2++) {
            i += this.f69691.m38335().charAt(i2) == '\t' ? 4 - (i % 4) : 1;
        }
        return i - this.f69689;
    }

    @Override // l.InterfaceC19124
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo44149() {
        return mo44153() == this.f69691.m38335().length();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49052(C14721 c14721) {
        int iM35024 = c14721.m35024();
        int iM35023 = c14721.m35023();
        while (true) {
            int i = this.f69690;
            C16300 c16300 = this.f69691;
            if (i >= c16300.m38335().length()) {
                return;
            }
            if (iM35024 >= 0) {
                if (this.f69690 >= iM35024) {
                    return;
                }
            } else if (this.f69689 >= iM35023) {
                return;
            }
            int i2 = c16300.m38335().charAt(this.f69690) == '\t' ? 4 - (this.f69689 % 4) : 1;
            if (iM35024 < 0 && this.f69689 + i2 > iM35023) {
                this.f69689 = iM35023;
                return;
            } else {
                this.f69689 += i2;
                this.f69690++;
            }
        }
    }
}
