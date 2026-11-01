package p067l;

/* JADX INFO: renamed from: l.ۜ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YO */
/* JADX INFO: loaded from: classes3.dex */
public final class C8984 extends AbstractC10484 {

    /* JADX INFO: renamed from: ֫ */
    public final C23875 f24337 = new C23875();

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC13147 mo9302() {
        return this.f24337;
    }

    @Override // p067l.InterfaceC4449
    /* JADX INFO: renamed from: ֫ */
    public final C16359 mo9295(InterfaceC20543 interfaceC20543) {
        char cCharAt;
        int iMo46447 = interfaceC20543.mo46447();
        if (!m20756(interfaceC20543, iMo46447)) {
            return null;
        }
        int iMo46445 = interfaceC20543.mo46445() + interfaceC20543.mo46444();
        int i = iMo46445 + 1;
        CharSequence charSequenceM40550 = interfaceC20543.getLine().m40550();
        int i2 = iMo46447 + 1;
        if (i2 < charSequenceM40550.length() && ((cCharAt = charSequenceM40550.charAt(i2)) == '\t' || cCharAt == ' ')) {
            i = iMo46445 + 2;
        }
        return new C16359(-1, i, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m20756(InterfaceC20543 interfaceC20543, int i) {
        CharSequence charSequenceM40550 = interfaceC20543.getLine().m40550();
        return interfaceC20543.mo46445() < 4 && i < charSequenceM40550.length() && charSequenceM40550.charAt(i) == '>';
    }
}
