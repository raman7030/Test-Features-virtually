package p067l;

/* JADX INFO: renamed from: l.ۜ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 48Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8452 extends AbstractC17188 {
    @Override // p067l.InterfaceC5790
    /* JADX INFO: renamed from: ֫ */
    public final C22396 mo4844(C21055 c21055, InterfaceC19872 interfaceC19872) {
        if (c21055.mo46445() >= 4) {
            return null;
        }
        CharSequence charSequenceM40550 = c21055.getLine().m40550();
        int length = charSequenceM40550.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int iMo46447 = c21055.mo46447(); iMo46447 < length; iMo46447++) {
            char cCharAt = charSequenceM40550.charAt(iMo46447);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i3++;
                } else if (cCharAt == '-') {
                    i++;
                } else {
                    if (cCharAt != '_') {
                        return null;
                    }
                    i2++;
                }
            }
        }
        if ((i < 3 || i2 != 0 || i3 != 0) && ((i2 < 3 || i != 0 || i3 != 0) && (i3 < 3 || i != 0 || i2 != 0))) {
            return null;
        }
        String.valueOf(charSequenceM40550.subSequence(c21055.getIndex(), charSequenceM40550.length()));
        C22396 c22396 = new C22396(new C21864());
        c22396.m50304(charSequenceM40550.length());
        return c22396;
    }
}
