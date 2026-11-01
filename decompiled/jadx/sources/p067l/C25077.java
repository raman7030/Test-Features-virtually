package p067l;

/* JADX INFO: renamed from: l.᩻᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: J8YO */
/* JADX INFO: loaded from: classes.dex */
public final class C25077 extends AbstractC17188 {
    @Override // p067l.InterfaceC5790
    /* JADX INFO: renamed from: ֫ */
    public final C22396 mo4844(C21055 c21055, InterfaceC19872 interfaceC19872) {
        char cCharAt;
        int iMo46447 = c21055.mo46447();
        if (!C8984.m20756((InterfaceC20543) c21055, iMo46447)) {
            return null;
        }
        int iMo46445 = c21055.mo46445() + c21055.mo46444();
        int i = iMo46445 + 1;
        CharSequence charSequenceM40550 = c21055.getLine().m40550();
        int i2 = iMo46447 + 1;
        if (i2 < charSequenceM40550.length() && ((cCharAt = charSequenceM40550.charAt(i2)) == '\t' || cCharAt == ' ')) {
            i = iMo46445 + 2;
        }
        C22396 c22396 = new C22396(new C8984());
        c22396.m50301(i);
        return c22396;
    }
}
