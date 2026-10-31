package l;

/* JADX INFO: renamed from: l.ۚ᩵֡, reason: contains not printable characters */
/* JADX INFO: compiled from: F925 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5550 extends AbstractC8540 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C14308 f17161;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final char f17162;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f17163;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public StringBuilder f17164;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f17165;

    public C5550(char c, int i, int i2) {
        C14308 c14308 = new C14308();
        this.f17161 = c14308;
        this.f17164 = new StringBuilder();
        this.f17162 = c;
        this.f17165 = i;
        String.valueOf(c);
        c14308.m34143(Integer.valueOf(i));
        c14308.m34138(i2);
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ܿ */
    public final AbstractC11342 mo7223() {
        return this.f17161;
    }

    @Override // l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final C14721 mo7216(InterfaceC19124 interfaceC19124) {
        int iMo44153 = interfaceC19124.mo44153();
        int index = interfaceC19124.getIndex();
        CharSequence charSequenceM38335 = interfaceC19124.getLine().m38335();
        int iMo44151 = interfaceC19124.mo44151();
        C14308 c14308 = this.f17161;
        if (iMo44151 < 4 && iMo44153 < charSequenceM38335.length()) {
            int length = charSequenceM38335.length();
            for (int i = iMo44153; i < length; i++) {
                if (charSequenceM38335.charAt(i) != this.f17162) {
                    length = i;
                    break;
                }
            }
            int i2 = length - iMo44153;
            if (i2 >= this.f17165 && C8751.m22636(iMo44153 + i2, charSequenceM38335.length(), charSequenceM38335) == charSequenceM38335.length()) {
                c14308.m34139(Integer.valueOf(i2));
                return new C14721(-1, -1, true);
            }
        }
        int length2 = charSequenceM38335.length();
        for (int iM34146 = c14308.m34146(); iM34146 > 0 && index < length2 && charSequenceM38335.charAt(index) == ' '; iM34146--) {
            index++;
        }
        return C14721.m35022(index);
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ֫ */
    public final void mo7218(C16300 c16300) {
        if (this.f17163 == null) {
            this.f17163 = c16300.m38335().toString();
            return;
        }
        CharSequence charSequenceM38335 = c16300.m38335();
        StringBuilder sb = this.f17164;
        sb.append(charSequenceM38335);
        sb.append('\n');
    }

    @Override // l.AbstractC8540, l.InterfaceC2190
    /* JADX INFO: renamed from: ۜ */
    public final void mo7221() {
        String strM29420 = C12047.m29420(this.f17163.trim());
        C14308 c14308 = this.f17161;
        c14308.m34140(strM29420);
        c14308.m34144(this.f17164.toString());
    }
}
