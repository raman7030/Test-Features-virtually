package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.umeng.analytics.pro.C0719o;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20548 {

    /* JADX INFO: renamed from: ܶ */
    public static final char[] f63510;

    /* JADX INFO: renamed from: ᩸ */
    public static final int[] f63511 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, C0719o.a.f2890B, C0719o.a.f2891C, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: ֡ */
    public final C19325 f63512;

    /* JADX INFO: renamed from: ֫ */
    public C18535 f63514;

    /* JADX INFO: renamed from: ۖ */
    public String f63515;

    /* JADX INFO: renamed from: ۘ */
    public String f63516;

    /* JADX INFO: renamed from: ۚ */
    public C11160 f63517;

    /* JADX INFO: renamed from: ۜ */
    public C24570 f63518;

    /* JADX INFO: renamed from: ۠ */
    public AbstractC10489 f63519;

    /* JADX INFO: renamed from: ۡ */
    public final C9266 f63520;

    /* JADX INFO: renamed from: ۢ */
    public C21889 f63521;

    /* JADX INFO: renamed from: ۧ */
    public int f63522;

    /* JADX INFO: renamed from: ܳ */
    public C15852 f63523;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f63526;

    /* JADX INFO: renamed from: ᩴ */
    public int f63528;

    /* JADX INFO: renamed from: ᩵ */
    public final int[] f63529;

    /* JADX INFO: renamed from: ֨ */
    public EnumC20940 f63513 = EnumC20940.f65740;

    /* JADX INFO: renamed from: ᩷ */
    public AbstractC4454 f63530 = null;

    /* JADX INFO: renamed from: ܺ */
    public boolean f63524 = false;

    /* JADX INFO: renamed from: ᩳ */
    public String f63527 = null;

    /* JADX INFO: renamed from: ܽ */
    public final StringBuilder f63525 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ᩻ */
    public StringBuilder f63531 = new StringBuilder(1024);

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f63510 = cArr;
        Arrays.sort(cArr);
    }

    public C20548(C19325 c19325, C9266 c9266) {
        C11160 c11160 = new C11160();
        this.f63517 = c11160;
        this.f63521 = new C21889();
        this.f63519 = c11160;
        this.f63514 = new C18535();
        this.f63518 = new C24570();
        this.f63523 = new C15852();
        this.f63522 = -1;
        this.f63526 = new int[1];
        this.f63529 = new int[2];
        this.f63512 = c19325;
        this.f63520 = c9266;
    }

    /* JADX INFO: renamed from: ۜ */
    public final AbstractC4454 m46463() {
        while (!this.f63524) {
            this.f63513.mo3428(this, this.f63512);
        }
        StringBuilder sb = this.f63525;
        int length = sb.length();
        C18535 c18535 = this.f63514;
        if (length != 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            c18535.m42137(string);
            this.f63527 = null;
            return c18535;
        }
        String str = this.f63527;
        if (str != null) {
            c18535.m42137(str);
            this.f63527 = null;
            return c18535;
        }
        this.f63524 = false;
        return this.f63530;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46460(AbstractC4454 abstractC4454) {
        if (!this.f63524) {
            this.f63530 = abstractC4454;
            this.f63524 = true;
            abstractC4454.m9332(this.f63528);
            abstractC4454.m9330(this.f63512.m44023());
            this.f63522 = -1;
            EnumC17193 enumC17193 = abstractC4454.f9999;
            if (enumC17193 == EnumC17193.StartTag) {
                this.f63516 = ((C11160) abstractC4454).f29032;
                this.f63515 = null;
                return;
            } else {
                if (enumC17193 == EnumC17193.EndTag) {
                    C21889 c21889 = (C21889) abstractC4454;
                    if (c21889.m24220()) {
                        m46458("Attributes incorrectly present on end tag [/%s]", c21889.f29037);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        throw new C15832("Must be false");
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46457(String str) {
        if (this.f63527 == null) {
            this.f63527 = str;
        } else {
            StringBuilder sb = this.f63525;
            if (sb.length() == 0) {
                sb.append(this.f63527);
            }
            sb.append(str);
        }
        int i = this.f63522;
        C18535 c18535 = this.f63514;
        c18535.m9332(i);
        c18535.m9330(this.f63512.m44023());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46459(StringBuilder sb) {
        if (this.f63527 == null) {
            this.f63527 = sb.toString();
        } else {
            StringBuilder sb2 = this.f63525;
            if (sb2.length() == 0) {
                sb2.append(this.f63527);
            }
            sb2.append((CharSequence) sb);
        }
        int i = this.f63522;
        C18535 c18535 = this.f63514;
        c18535.m9332(i);
        c18535.m9330(this.f63512.m44023());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46456(char c) {
        if (this.f63527 == null) {
            this.f63527 = String.valueOf(c);
        } else {
            StringBuilder sb = this.f63525;
            if (sb.length() == 0) {
                sb.append(this.f63527);
            }
            sb.append(c);
        }
        int i = this.f63522;
        C18535 c18535 = this.f63514;
        c18535.m9332(i);
        c18535.m9330(this.f63512.m44023());
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46471(EnumC20940 enumC20940) {
        int i = C19877.f60390[enumC20940.ordinal()];
        C19325 c19325 = this.f63512;
        if (i == 1) {
            this.f63528 = c19325.m44023();
        } else if (i == 2 && this.f63522 == -1) {
            this.f63522 = c19325.m44023();
        }
        this.f63513 = enumC20940;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46461(EnumC20940 enumC20940) {
        m46471(enumC20940);
        this.f63512.m44028();
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m46462(Character ch, boolean z) {
        int iIntValue;
        C19325 c19325 = this.f63512;
        if (!c19325.m44031() && ((ch == null || ch.charValue() != c19325.m44045()) && !c19325.m44052(f63510))) {
            c19325.m44053();
            boolean zM44042 = c19325.m44042("#");
            int[] iArr = this.f63526;
            if (zM44042) {
                boolean zM44047 = c19325.m44047("X");
                String strM44043 = zM44047 ? c19325.m44043() : c19325.m44049();
                if (strM44043.length() == 0) {
                    m46453("numeric reference with no numerals", new Object[0]);
                    c19325.m44034();
                    return null;
                }
                c19325.m44056();
                if (!c19325.m44042(C0249l.f1196b)) {
                    m46453("missing semicolon on [&#%s]", strM44043);
                }
                try {
                    iIntValue = Integer.valueOf(strM44043, zM44047 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    m46453("character [%s] outside of valid range", Integer.valueOf(iIntValue));
                    iArr[0] = 65533;
                } else {
                    if (iIntValue >= 128 && iIntValue < 160) {
                        m46453("character [%s] is not a valid unicode code point", Integer.valueOf(iIntValue));
                        iIntValue = f63511[iIntValue + C0184a.f879g];
                    }
                    iArr[0] = iIntValue;
                }
                return iArr;
            }
            String strM44033 = c19325.m44033();
            boolean zM44041 = c19325.m44041(';');
            if (!C14492.m33146(strM44033) && (!C14492.m33147(strM44033) || !zM44041)) {
                c19325.m44034();
                if (zM44041) {
                    m46453("invalid named reference [%s]", strM44033);
                }
            } else {
                if (z && (c19325.m44032() || c19325.m44022() || c19325.m44048(C0184a.f880h, '-', '_'))) {
                    c19325.m44034();
                    return null;
                }
                c19325.m44056();
                if (!c19325.m44042(C0249l.f1196b)) {
                    m46453("missing semicolon on [&%s]", strM44033);
                }
                int[] iArr2 = this.f63529;
                int iM33142 = C14492.m33142(strM44033, iArr2);
                if (iM33142 == 1) {
                    iArr[0] = iArr2[0];
                    return iArr;
                }
                if (iM33142 == 2) {
                    return iArr2;
                }
                throw new C15832("Unexpected characters returned for ".concat(strM44033));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC10489 m46455(boolean z) {
        AbstractC10489 abstractC10489;
        if (z) {
            abstractC10489 = this.f63517;
            abstractC10489.mo9338();
        } else {
            abstractC10489 = this.f63521;
            abstractC10489.mo9338();
        }
        this.f63519 = abstractC10489;
        return abstractC10489;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m46466() {
        this.f63519.m24226();
        m46460(this.f63519);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m46470() {
        m46460(this.f63523);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m46469() {
        m46460(this.f63518);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46467() {
        AbstractC4454.m9328(this.f63531);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m46472() {
        return this.f63516 != null && this.f63519.m24219().equalsIgnoreCase(this.f63516);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m46454() {
        return this.f63516;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m46464() {
        if (this.f63515 == null) {
            this.f63515 = C21466.m48631("</", this.f63516);
        }
        return this.f63515;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m46468(EnumC20940 enumC20940) {
        C9266 c9266 = this.f63520;
        if (c9266.m21390()) {
            C19325 c19325 = this.f63512;
            c9266.add(new C15300(c19325, "Unexpected character '%s' in input state [%s]", Character.valueOf(c19325.m44045()), enumC20940));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m46465(EnumC20940 enumC20940) {
        C9266 c9266 = this.f63520;
        if (c9266.m21390()) {
            c9266.add(new C15300(this.f63512, "Unexpectedly reached end of file (EOF) in input state [%s]", enumC20940));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m46453(String str, Object... objArr) {
        C9266 c9266 = this.f63520;
        if (c9266.m21390()) {
            c9266.add(new C15300(this.f63512, String.format("Invalid character reference: ".concat(str), objArr)));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m46458(String str, Object... objArr) {
        C9266 c9266 = this.f63520;
        if (c9266.m21390()) {
            c9266.add(new C15300(this.f63512, str, objArr));
        }
    }
}
