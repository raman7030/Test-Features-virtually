package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.umeng.analytics.pro.C0719o;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16836 {

    /* JADX INFO: renamed from: ֨ */
    public static final int[] f49834 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, C0719o.a.f2890B, C0719o.a.f2891C, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: ۚ */
    public static final char[] f49835;

    /* JADX INFO: renamed from: ֡ */
    public AbstractC7450 f49836;

    /* JADX INFO: renamed from: ۘ */
    public final C8791 f49839;

    /* JADX INFO: renamed from: ۜ */
    public AbstractC10132 f49840;

    /* JADX INFO: renamed from: ۢ */
    public final C11474 f49842;

    /* JADX INFO: renamed from: ܺ */
    public String f49845;

    /* JADX INFO: renamed from: ᩵ */
    public EnumC16660 f49850 = EnumC16660.f48962;

    /* JADX INFO: renamed from: ۡ */
    public boolean f49841 = false;

    /* JADX INFO: renamed from: ܽ */
    public String f49846 = null;

    /* JADX INFO: renamed from: ۧ */
    public StringBuilder f49843 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ܳ */
    public StringBuilder f49844 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ᩴ */
    public C2755 f49849 = new C2755();

    /* JADX INFO: renamed from: ᩷ */
    public C20862 f49851 = new C20862();

    /* JADX INFO: renamed from: ֫ */
    public C17507 f49837 = new C17507();

    /* JADX INFO: renamed from: ᩻ */
    public C6109 f49852 = new C6109();

    /* JADX INFO: renamed from: ܿ */
    public C4768 f49847 = new C4768();

    /* JADX INFO: renamed from: ᩳ */
    public final int[] f49848 = new int[1];

    /* JADX INFO: renamed from: ۖ */
    public final int[] f49838 = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f49835 = cArr;
        Arrays.sort(cArr);
    }

    public C16836(C8791 c8791, C11474 c11474) {
        this.f49839 = c8791;
        this.f49842 = c11474;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC10132 m38192() {
        while (!this.f49841) {
            this.f49850.mo3888(this, this.f49839);
        }
        StringBuilder sb = this.f49843;
        int length = sb.length();
        C17507 c17507 = this.f49837;
        if (length > 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.f49846 = null;
            c17507.m39882(string);
            return c17507;
        }
        String str = this.f49846;
        if (str != null) {
            c17507.m39882(str);
            this.f49846 = null;
            return c17507;
        }
        this.f49841 = false;
        return this.f49840;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38181(AbstractC10132 abstractC10132) {
        if (this.f49841) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.f49840 = abstractC10132;
        this.f49841 = true;
        EnumC3426 enumC3426 = abstractC10132.f28080;
        if (enumC3426 == EnumC3426.StartTag) {
            this.f49845 = ((C2755) abstractC10132).f19504;
            return;
        }
        if (enumC3426 != EnumC3426.EndTag || ((C20862) abstractC10132).f19505 == null) {
            return;
        }
        C11474 c11474 = this.f49842;
        if (c11474.m26471()) {
            c11474.add(new C22203(this.f49839.m20351()));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38180(String str) {
        if (this.f49846 == null) {
            this.f49846 = str;
            return;
        }
        StringBuilder sb = this.f49843;
        if (sb.length() == 0) {
            sb.append(this.f49846);
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38179(char c) {
        m38180(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m38191(EnumC16660 enumC16660) {
        this.f49850 = enumC16660;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38182(EnumC16660 enumC16660) {
        this.f49839.m20332();
        this.f49850 = enumC16660;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m38183(Character ch, boolean z) {
        int iIntValue;
        C8791 c8791 = this.f49839;
        if (!c8791.m20337() && ((ch == null || ch.charValue() != c8791.m20338()) && !c8791.m20350(f49835))) {
            c8791.m20344();
            boolean zM20333 = c8791.m20333("#");
            int[] iArr = this.f49848;
            if (zM20333) {
                boolean zM20342 = c8791.m20342("X");
                String strM20348 = zM20342 ? c8791.m20348() : c8791.m20349();
                if (strM20348.length() == 0) {
                    m38176("numeric reference with no numerals");
                    c8791.m20352();
                    return null;
                }
                if (!c8791.m20333(C0249l.f1196b)) {
                    m38176("missing semicolon");
                }
                try {
                    iIntValue = Integer.valueOf(strM20348, zM20342 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    m38176("character outside of valid range");
                    iArr[0] = 65533;
                    return iArr;
                }
                if (iIntValue >= 128 && iIntValue < 160) {
                    m38176("character is not a valid unicode code point");
                    iIntValue = f49834[iIntValue + C0184a.f879g];
                }
                iArr[0] = iIntValue;
                return iArr;
            }
            String strM20354 = c8791.m20354();
            boolean zM20341 = c8791.m20341(';');
            if (AbstractC24884.m54640(strM20354) && zM20341) {
                if (z && (c8791.m20335() || c8791.m20334() || c8791.m20347(C0184a.f880h, '-', '_'))) {
                    c8791.m20352();
                    return null;
                }
                if (!c8791.m20333(C0249l.f1196b)) {
                    m38176("missing semicolon");
                }
                int[] iArr2 = this.f49838;
                int iM54639 = AbstractC24884.m54639(strM20354, iArr2);
                if (iM54639 == 1) {
                    iArr[0] = iArr2[0];
                    return iArr;
                }
                if (iM54639 == 2) {
                    return iArr2;
                }
                throw new IllegalArgumentException("Unexpected characters returned for ".concat(strM20354));
            }
            c8791.m20352();
            if (zM20341) {
                m38176(C6988.m16053("invalid named referenece '", strM20354, "'"));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7450 m38178(boolean z) {
        AbstractC7450 abstractC7450;
        if (z) {
            abstractC7450 = this.f49849;
            abstractC7450.mo4316();
        } else {
            abstractC7450 = this.f49851;
            abstractC7450.mo4316();
        }
        this.f49836 = abstractC7450;
        return abstractC7450;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m38189() {
        this.f49836.m17214();
        m38181(this.f49836);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38187() {
        m38181(this.f49847);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m38190() {
        m38181(this.f49852);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38184() {
        AbstractC10132.m23614(this.f49844);
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m38186() {
        return this.f49845 != null && this.f49836.m17217().equalsIgnoreCase(this.f49845);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m38177() {
        return this.f49845;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m38188(EnumC16660 enumC16660) {
        C11474 c11474 = this.f49842;
        if (c11474.m26471()) {
            C8791 c8791 = this.f49839;
            c11474.add(new C22203(c8791.m20351(), "Unexpected character '%s' in input state [%s]", Character.valueOf(c8791.m20338()), enumC16660));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38185(EnumC16660 enumC16660) {
        C11474 c11474 = this.f49842;
        if (c11474.m26471()) {
            c11474.add(new C22203(this.f49839.m20351(), "Unexpectedly reached end of file (EOF) in input state [%s]", enumC16660));
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m38176(String str) {
        C11474 c11474 = this.f49842;
        if (c11474.m26471()) {
            c11474.add(new C22203(this.f49839.m20351(), "Invalid character reference: %s", str));
        }
    }
}
