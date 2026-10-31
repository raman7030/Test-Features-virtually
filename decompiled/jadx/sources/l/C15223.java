package l;

import com.alipay.sdk.m.p.a;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.o;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: JBJ2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15223 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f46710 = {8364, 129, 8218, 402, 8222, 8230, 8224, 8225, 710, 8240, 352, 8249, 338, 141, 381, 143, 144, 8216, 8217, 8220, 8221, 8226, o.a.B, o.a.C, 732, 8482, 353, 8250, 339, 157, 382, 376};

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final char[] f46711;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC5347 f46712;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C6758 f46715;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC8169 f46716;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C9581 f46718;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public String f46721;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public EnumC15038 f46726 = EnumC15038.f45846;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f46717 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f46722 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public StringBuilder f46719 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public StringBuilder f46720 = new StringBuilder(1024);

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C0407 f46725 = new C0407();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C19459 f46727 = new C19459();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C15929 f46713 = new C15929();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C3936 f46728 = new C3936();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C2525 f46723 = new C2525();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f46724 = new int[1];

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int[] f46714 = new int[2];

    static {
        char[] cArr = {'\t', '\n', '\r', '\f', ' ', '<', '&'};
        f46711 = cArr;
        Arrays.sort(cArr);
    }

    public C15223(C6758 c6758, C9581 c9581) {
        this.f46715 = c6758;
        this.f46718 = c9581;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC8169 m36031() {
        while (!this.f46717) {
            this.f46726.mo1475(this, this.f46715);
        }
        StringBuilder sb = this.f46719;
        int length = sb.length();
        C15929 c15929 = this.f46713;
        if (length > 0) {
            String string = sb.toString();
            sb.delete(0, sb.length());
            this.f46722 = null;
            c15929.m37707(string);
            return c15929;
        }
        String str = this.f46722;
        if (str != null) {
            c15929.m37707(str);
            this.f46722 = null;
            return c15929;
        }
        this.f46717 = false;
        return this.f46716;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36020(AbstractC8169 abstractC8169) {
        if (this.f46717) {
            throw new IllegalArgumentException("There is an unread token pending!");
        }
        this.f46716 = abstractC8169;
        this.f46717 = true;
        EnumC1113 enumC1113 = abstractC8169.f25169;
        if (enumC1113 == EnumC1113.StartTag) {
            this.f46721 = ((C0407) abstractC8169).f16665;
            return;
        }
        if (enumC1113 != EnumC1113.EndTag || ((C19459) abstractC8169).f16666 == null) {
            return;
        }
        C9581 c9581 = this.f46718;
        if (c9581.m24459()) {
            c9581.add(new C20870(this.f46715.m18403()));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36019(String str) {
        if (this.f46722 == null) {
            this.f46722 = str;
            return;
        }
        StringBuilder sb = this.f46719;
        if (sb.length() == 0) {
            sb.append(this.f46722);
        }
        sb.append(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36018(char c) {
        m36019(String.valueOf(c));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36030(EnumC15038 enumC15038) {
        this.f46726 = enumC15038;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36021(EnumC15038 enumC15038) {
        this.f46715.m18384();
        this.f46726 = enumC15038;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m36022(Character ch, boolean z) {
        int iIntValue;
        C6758 c6758 = this.f46715;
        if (!c6758.m18389() && ((ch == null || ch.charValue() != c6758.m18390()) && !c6758.m18402(f46711))) {
            c6758.m18396();
            boolean zM18385 = c6758.m18385("#");
            int[] iArr = this.f46724;
            if (zM18385) {
                boolean zM18394 = c6758.m18394("X");
                String strM18400 = zM18394 ? c6758.m18400() : c6758.m18401();
                if (strM18400.length() == 0) {
                    m36015("numeric reference with no numerals");
                    c6758.m18404();
                    return null;
                }
                if (!c6758.m18385(l.b)) {
                    m36015("missing semicolon");
                }
                try {
                    iIntValue = Integer.valueOf(strM18400, zM18394 ? 16 : 10).intValue();
                } catch (NumberFormatException unused) {
                    iIntValue = -1;
                }
                if (iIntValue == -1 || ((iIntValue >= 55296 && iIntValue <= 57343) || iIntValue > 1114111)) {
                    m36015("character outside of valid range");
                    iArr[0] = 65533;
                    return iArr;
                }
                if (iIntValue >= 128 && iIntValue < 160) {
                    m36015("character is not a valid unicode code point");
                    iIntValue = f46710[iIntValue + a.g];
                }
                iArr[0] = iIntValue;
                return iArr;
            }
            String strM18406 = c6758.m18406();
            boolean zM18393 = c6758.m18393(';');
            if (AbstractC23691.m52237(strM18406) && zM18393) {
                if (z && (c6758.m18387() || c6758.m18386() || c6758.m18399(a.h, '-', '_'))) {
                    c6758.m18404();
                    return null;
                }
                if (!c6758.m18385(l.b)) {
                    m36015("missing semicolon");
                }
                int[] iArr2 = this.f46714;
                int iM52236 = AbstractC23691.m52236(strM18406, iArr2);
                if (iM52236 == 1) {
                    iArr[0] = iArr2[0];
                    return iArr;
                }
                if (iM52236 == 2) {
                    return iArr2;
                }
                throw new IllegalArgumentException("Unexpected characters returned for ".concat(strM18406));
            }
            c6758.m18404();
            if (zM18393) {
                m36015(C4860.m14172("invalid named referenece '", strM18406, "'"));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC5347 m36017(boolean z) {
        AbstractC5347 abstractC5347;
        if (z) {
            abstractC5347 = this.f46725;
            abstractC5347.mo1924();
        } else {
            abstractC5347 = this.f46727;
            abstractC5347.mo1924();
        }
        this.f46712 = abstractC5347;
        return abstractC5347;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m36028() {
        this.f46712.m15306();
        m36020(this.f46712);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36026() {
        m36020(this.f46723);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m36029() {
        m36020(this.f46728);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36023() {
        AbstractC8169.m21645(this.f46720);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m36025() {
        return this.f46721 != null && this.f46712.m15309().equalsIgnoreCase(this.f46721);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m36016() {
        return this.f46721;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m36027(EnumC15038 enumC15038) {
        C9581 c9581 = this.f46718;
        if (c9581.m24459()) {
            C6758 c6758 = this.f46715;
            c9581.add(new C20870(c6758.m18403(), "Unexpected character '%s' in input state [%s]", Character.valueOf(c6758.m18390()), enumC15038));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36024(EnumC15038 enumC15038) {
        C9581 c9581 = this.f46718;
        if (c9581.m24459()) {
            c9581.add(new C20870(this.f46715.m18403(), "Unexpectedly reached end of file (EOF) in input state [%s]", enumC15038));
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m36015(String str) {
        C9581 c9581 = this.f46718;
        if (c9581.m24459()) {
            c9581.add(new C20870(this.f46715.m18403(), "Invalid character reference: %s", str));
        }
    }
}
