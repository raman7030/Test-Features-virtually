package p067l;

/* JADX INFO: renamed from: l.֡᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F925 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2948 extends AbstractC17188 {
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    @Override // p067l.InterfaceC5790
    /* JADX INFO: renamed from: ֫ */
    public final C22396 mo4844(C21055 c21055, InterfaceC19872 interfaceC19872) {
        C7643 c7643;
        int iMo46445 = c21055.mo46445();
        if (iMo46445 >= 4) {
            return null;
        }
        int iMo46447 = c21055.mo46447();
        CharSequence charSequenceM40550 = c21055.getLine().m40550();
        int length = charSequenceM40550.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = iMo46447; i3 < length; i3++) {
            char cCharAt = charSequenceM40550.charAt(i3);
            if (cCharAt == '`') {
                i++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i2++;
            }
        }
        if (i < 3 || i2 != 0) {
            if (i2 < 3 || i != 0) {
                c7643 = null;
            } else {
                c7643 = new C7643('~', i2, iMo46445);
            }
        } else if (C10685.m24605('`', charSequenceM40550, iMo46447 + i) != -1) {
            c7643 = null;
        } else {
            c7643 = new C7643('`', i, iMo46445);
        }
        if (c7643 == null) {
            return null;
        }
        C22396 c22396 = new C22396(c7643);
        c22396.m50304(c7643.f20002.m36278().intValue() + iMo46447);
        return c22396;
    }
}
