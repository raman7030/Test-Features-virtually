package p067l;

/* JADX INFO: renamed from: l.᩸ܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56MU */
/* JADX INFO: loaded from: classes.dex */
public final class C23017 implements InterfaceC20543 {

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC4449 f72393;

    /* JADX INFO: renamed from: ۧ */
    public int f72394;

    /* JADX INFO: renamed from: ܽ */
    public int f72395;

    /* JADX INFO: renamed from: ᩳ */
    public final C17859 f72396;

    public C23017(String str, InterfaceC4449 interfaceC4449) {
        this.f72396 = C17859.m40549(str, (C21332) null);
        this.f72393 = interfaceC4449;
    }

    @Override // p067l.InterfaceC20543
    public final C17859 getLine() {
        return this.f72396;
    }

    @Override // p067l.InterfaceC20543
    public final int getIndex() {
        return this.f72395;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ۧ */
    public final int mo46444() {
        return this.f72394;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ܿ */
    public final InterfaceC4449 mo46446() {
        return this.f72393;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ᩳ */
    public final int mo46447() {
        int i = this.f72395;
        CharSequence charSequenceM40550 = this.f72396.m40550();
        while (i < charSequenceM40550.length() && (charSequenceM40550.charAt(i) == ' ' || charSequenceM40550.charAt(i) == '\t')) {
            i++;
        }
        return i;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ܽ */
    public final int mo46445() {
        int iMo46447 = mo46447();
        int i = this.f72394;
        for (int i2 = this.f72395; i2 < iMo46447; i2++) {
            i += this.f72396.m40550().charAt(i2) == '\t' ? 4 - (i % 4) : 1;
        }
        return i - this.f72394;
    }

    @Override // p067l.InterfaceC20543
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo46443() {
        return mo46447() == this.f72396.m40550().length();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51401(C16359 c16359) {
        int iM37171 = c16359.m37171();
        int iM37170 = c16359.m37170();
        while (true) {
            int i = this.f72395;
            C17859 c17859 = this.f72396;
            if (i >= c17859.m40550().length()) {
                return;
            }
            if (iM37171 >= 0) {
                if (this.f72395 >= iM37171) {
                    return;
                }
            } else if (this.f72394 >= iM37170) {
                return;
            }
            int i2 = c17859.m40550().charAt(this.f72395) == '\t' ? 4 - (this.f72394 % 4) : 1;
            if (iM37171 < 0 && this.f72394 + i2 > iM37170) {
                this.f72394 = iM37170;
                return;
            } else {
                this.f72394 += i2;
                this.f72395++;
            }
        }
    }
}
