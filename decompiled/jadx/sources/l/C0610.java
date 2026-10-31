package l;

/* JADX INFO: renamed from: l.֡᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F925 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0610 extends AbstractC15594 {
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    @Override // l.InterfaceC3601
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        C5550 c5550;
        int iMo44151 = c19662.mo44151();
        if (iMo44151 >= 4) {
            return null;
        }
        int iMo44153 = c19662.mo44153();
        CharSequence charSequenceM38335 = c19662.getLine().m38335();
        int length = charSequenceM38335.length();
        int i = 0;
        int i2 = 0;
        for (int i3 = iMo44153; i3 < length; i3++) {
            char cCharAt = charSequenceM38335.charAt(i3);
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
                c5550 = null;
            } else {
                c5550 = new C5550('~', i2, iMo44151);
            }
        } else if (C8751.m22635('`', charSequenceM38335, iMo44153 + i) != -1) {
            c5550 = null;
        } else {
            c5550 = new C5550('`', i, iMo44151);
        }
        if (c5550 == null) {
            return null;
        }
        C21073 c21073 = new C21073(c5550);
        c21073.m47974(c5550.f17161.m34145().intValue() + iMo44153);
        return c21073;
    }
}
