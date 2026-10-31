package l;

/* JADX INFO: renamed from: l.ۜ֡֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 48Z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6402 extends AbstractC15594 {
    @Override // l.InterfaceC3601
    /* JADX INFO: renamed from: ֫ */
    public final C21073 mo2488(C19662 c19662, InterfaceC18418 interfaceC18418) {
        if (c19662.mo44151() >= 4) {
            return null;
        }
        CharSequence charSequenceM38335 = c19662.getLine().m38335();
        int length = charSequenceM38335.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int iMo44153 = c19662.mo44153(); iMo44153 < length; iMo44153++) {
            char cCharAt = charSequenceM38335.charAt(iMo44153);
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
        String.valueOf(charSequenceM38335.subSequence(c19662.getIndex(), charSequenceM38335.length()));
        C21073 c21073 = new C21073(new C20514());
        c21073.m47974(charSequenceM38335.length());
        return c21073;
    }
}
