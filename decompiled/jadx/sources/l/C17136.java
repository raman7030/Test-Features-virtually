package l;

import com.alipay.sdk.m.n.c;
import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.cb;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ܿۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BI9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17136 extends AbstractC0489 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f52505;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f52506;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f52507;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public ArrayList f52508;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C19814 f52509;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC22780 f52510;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f52511;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f52512;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C19814 f52513;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C20540 f52514;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C12052 f52515;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String[] f52516 = {null};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC22780 f52517;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f52518;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final String[] f52498 = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final String[] f52499 = {"ol", "ul"};

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final String[] f52502 = {"button"};

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final String[] f52504 = {"html", "table"};

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final String[] f52497 = {"optgroup", "option"};

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final String[] f52501 = {"dd", "dt", "li", "optgroup", "option", am.ax, "rb", "rp", "rt", "rtc"};

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String[] f52503 = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", am.ax, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final String[] f52500 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", ErrorBundle.DETAIL_ENTRY, "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", c.c, "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", am.ax, "param", "plaintext", "pre", "script", "section", "select", "style", ErrorBundle.SUMMARY_ENTRY, "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    @Override // l.AbstractC0489
    /* JADX INFO: renamed from: ۧ */
    public final C1489 mo2160() {
        return C1489.f5328;
    }

    @Override // l.AbstractC0489
    /* JADX INFO: renamed from: ֫ */
    public final void mo2154(StringReader stringReader, String str, C10662 c10662) {
        super.mo2154(stringReader, str, c10662);
        this.f52510 = EnumC22780.f73542;
        this.f52517 = null;
        this.f52507 = false;
        this.f52513 = null;
        this.f52515 = null;
        this.f52509 = null;
        this.f52505 = new ArrayList();
        this.f52508 = new ArrayList();
        this.f52518 = new ArrayList();
        this.f52514 = new C20540();
        this.f52512 = true;
        this.f52511 = false;
        this.f52506 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    @Override // l.AbstractC0489
    /* JADX INFO: renamed from: ֫ */
    public final List mo2151(String str, C19814 c19814, String str2, C10662 c10662) {
        List listM28096;
        this.f52510 = EnumC22780.f73542;
        mo2154(new StringReader(str), str2, c10662);
        this.f52509 = c19814;
        byte b = 1;
        this.f52506 = true;
        if (c19814.m28090() != null) {
            this.f2109.m2908(c19814.m28090().m2914());
        }
        String strM45588 = c19814.m45588();
        strM45588.getClass();
        switch (strM45588.hashCode()) {
            case -1321546630:
                if (!strM45588.equals("template")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1191214428:
                if (!strM45588.equals("iframe")) {
                    b = -1;
                }
                break;
            case -1003243718:
                if (!strM45588.equals("textarea")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -907685685:
                if (!strM45588.equals("script")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 118807:
                if (!strM45588.equals(DocumentReader.RESERVED)) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 109780401:
                if (!strM45588.equals("style")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 110371416:
                if (!strM45588.equals("title")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1192721831:
                if (!strM45588.equals("noframes")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1551550924:
                if (!strM45588.equals("noscript")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1973234167:
                if (!strM45588.equals("plaintext")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 2115613112:
                if (!strM45588.equals("noembed")) {
                    b = -1;
                } else {
                    b = 10;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                this.f2104.m44177(EnumC19541.f63120);
                m40203(EnumC22780.f73543);
                break;
            case 1:
            case 4:
            case 5:
            case 7:
            case 10:
                this.f2104.m44177(EnumC19541.f63151);
                break;
            case 2:
            case 6:
                this.f2104.m44177(EnumC19541.f63162);
                break;
            case 3:
                this.f2104.m44177(EnumC19541.f63125);
                break;
            case 8:
                this.f2104.m44177(EnumC19541.f63120);
                break;
            case 9:
                this.f2104.m44177(EnumC19541.f63129);
                break;
            default:
                this.f2104.m44177(EnumC19541.f63120);
                break;
        }
        C19814 c19815 = new C19814(m2152(strM45588, this.f2103), str2, null);
        this.f2109.m45584(c19815);
        this.f2112.add(c19815);
        m40225();
        while (c19814 != null) {
            if (c19814 instanceof C12052) {
                this.f52515 = (C12052) c19814;
                m2162();
                listM28096 = c19815.m28096();
                if (!listM28096.isEmpty()) {
                    c19815.m45562(-1, listM28096);
                }
                return c19815.m28097();
            }
            c19814 = c19814.mo28099();
        }
        m2162();
        listM28096 = c19815.m28096();
        if (!listM28096.isEmpty()) {
            c19815.m45562(-1, listM28096);
        }
        return c19815.m28097();
    }

    @Override // l.AbstractC0489
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo2158(AbstractC2195 abstractC2195) {
        this.f2106 = abstractC2195;
        return this.f52510.mo1361(abstractC2195, this);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40175(AbstractC2195 abstractC2195, EnumC22780 enumC22780) {
        this.f2106 = abstractC2195;
        enumC22780.mo1361(abstractC2195, this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m40212(EnumC22780 enumC22780) {
        this.f52510 = enumC22780;
    }

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC22780 m40221() {
        return this.f52510;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m40219() {
        this.f52517 = this.f52510;
    }

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC22780 m40171() {
        return this.f52517;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40183(boolean z) {
        this.f52512 = z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40223() {
        return this.f52512;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m40216(C19814 c19814) {
        if (this.f52507) {
            return;
        }
        String strMo25043 = c19814.mo25043("href");
        if (strMo25043.length() != 0) {
            this.f2102 = strMo25043;
            this.f52507 = true;
            this.f2109.m28098(strMo25043);
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m40188() {
        return this.f52506;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40182(EnumC22780 enumC22780) {
        if (this.f2110.m26759().m19424()) {
            this.f2110.m26759().add(new C13607(this.f2107, "Unexpected %s token [%s] when in state [%s]", this.f2106.getClass().getSimpleName(), this.f2106, enumC22780));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19814 m40173(C9251 c9251) {
        if (c9251.m22252() && !c9251.f26118.isEmpty() && c9251.f26118.m36724(this.f2103) > 0) {
            Object[] objArr = {c9251.f26122};
            C7258 c7258M26759 = this.f2110.m26759();
            if (c7258M26759.m19424()) {
                c7258M26759.add(new C13607(this.f2107, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (c9251.f26116) {
            C19814 c19814M40201 = m40201(c9251);
            this.f2112.add(c19814M40201);
            this.f2104.m44177(EnumC19541.f63120);
            C19129 c19129 = this.f2104;
            C20540 c20540 = this.f52514;
            c20540.mo7259();
            c20540.m22257(c19814M40201.m45591());
            c19129.m44166(c20540);
            return c19814M40201;
        }
        C16305 c16305M2152 = m2152(c9251.m22251(), this.f2103);
        C1489 c1489 = this.f2103;
        C15578 c15578 = c9251.f26118;
        c1489.m5154(c15578);
        C19814 c19814 = new C19814(c16305M2152, null, c15578);
        m40169(c19814, c9251);
        this.f2112.add(c19814);
        return c19814;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m40211(C19814 c19814) {
        m40169(c19814, null);
        this.f2112.add(c19814);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19814 m40201(C9251 c9251) {
        C16305 c16305M2152 = m2152(c9251.m22251(), this.f2103);
        C1489 c1489 = this.f2103;
        C15578 c15578 = c9251.f26118;
        c1489.m5154(c15578);
        C19814 c19814 = new C19814(c16305M2152, null, c15578);
        m40169(c19814, c9251);
        if (c9251.f26116) {
            if (c16305M2152.m38360()) {
                if (!c16305M2152.m38367()) {
                    this.f2104.m44164("Tag [%s] cannot be self closing; not a void tag", c16305M2152.m38362());
                    return c19814;
                }
            } else {
                c16305M2152.m38364();
            }
        }
        return c19814;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40176(C9251 c9251, boolean z, boolean z2) {
        C16305 c16305M2152 = m2152(c9251.m22251(), this.f2103);
        C1489 c1489 = this.f2103;
        C15578 c15578 = c9251.f26118;
        c1489.m5154(c15578);
        C12052 c12052 = new C12052(c16305M2152, c15578);
        if (!z2 || !m40186("template")) {
            this.f52515 = c12052;
        }
        m40169(c12052, c9251);
        if (z) {
            this.f2112.add(c12052);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40178(C14188 c14188) {
        m40169(new C3585(c14188.m33849()), c14188);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40179(C17011 c17011) {
        AbstractC11347 c10787;
        C19814 c19814M2153 = m2153();
        String strM45588 = c19814M2153.m45588();
        String strM39895 = c17011.m39895();
        if (c17011 instanceof C17717) {
            c10787 = new C2174(strM39895);
        } else if (mo2161(strM45588)) {
            c10787 = new C18402(strM39895);
        } else {
            c10787 = new C10787(strM39895);
        }
        c19814M2153.m45584(c10787);
        m2155(c10787, c17011);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40169(AbstractC11347 abstractC11347, AbstractC2195 abstractC2195) {
        C12052 c12052;
        if (this.f2112.isEmpty()) {
            this.f2109.m45584(abstractC11347);
        } else if (this.f52511 && C20519.m47005(m2153().m45588(), C11492.f34316)) {
            m40177(abstractC11347);
        } else {
            m2153().m45584(abstractC11347);
        }
        if (abstractC11347 instanceof C19814) {
            C19814 c19814 = (C19814) abstractC11347;
            if (c19814.m45571().m38366() && (c12052 = this.f52515) != null) {
                c12052.m29426(c19814);
            }
        }
        m2155(abstractC11347, abstractC2195);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m40190() {
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m40207(C19814 c19814) {
        return m40167(this.f2112, c19814);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m40186(String str) {
        return m40228(str) != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m40167(ArrayList arrayList, C19814 c19814) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((C19814) arrayList.get(i)) == c19814) {
                return true;
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C19814 m40228(String str) {
        int size = this.f2112.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            C19814 c19814 = (C19814) this.f2112.get(i);
            if (c19814.m45588().equals(str)) {
                return c19814;
            }
            i--;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m40199(C19814 c19814) {
        int size = this.f2112.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((C19814) this.f2112.get(size)) != c19814);
        this.f2112.remove(size);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m40187(String str) {
        C19814 c19814;
        int size = this.f2112.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            c19814 = (C19814) this.f2112.get(size);
            this.f2112.remove(size);
        } while (!c19814.m45588().equals(str));
        AbstractC2195 abstractC2195 = this.f2106;
        if (abstractC2195 instanceof C20540) {
            m2156(c19814, abstractC2195);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m40206() {
        m40170("table", "template");
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m40214() {
        m40170("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m40229() {
        m40170("tr", "template");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m40170(String... strArr) {
        int size = this.f2112.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C19814 c19814 = (C19814) this.f2112.get(size);
            String strM45588 = c19814.m45588();
            int i = C20519.f66111;
            for (String str : strArr) {
                if (str.equals(strM45588)) {
                    return;
                }
            }
            if (c19814.m45588().equals("html")) {
                return;
            } else {
                this.f2112.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19814 m40174(C19814 c19814) {
        int size = this.f2112.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((C19814) this.f2112.get(size)) != c19814);
        return (C19814) this.f2112.get(size - 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x0139  */
    /* JADX WARN: Code duplicated, block: B:104:0x0142  */
    /* JADX WARN: Code duplicated, block: B:107:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0158 A[LOOP:0: B:10:0x0020->B:113:0x0158, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x0160 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:0x0161 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:119:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x010e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0111 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x012b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x014e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0115  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0126 A[DONT_INVERT] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m40225() {
        EnumC22780 enumC22780;
        int size = this.f2112.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        EnumC22780 enumC22781 = this.f52510;
        if (this.f2112.size() == 0) {
            this.f52510 = EnumC22780.f73546;
        }
        boolean z = false;
        while (i >= i2) {
            C19814 c19814 = (C19814) this.f2112.get(i);
            if (i == i2) {
                if (this.f52506) {
                    c19814 = this.f52509;
                }
                z = true;
            }
            String strM45588 = c19814 != null ? c19814.m45588() : "";
            strM45588.getClass();
            byte b = -1;
            switch (strM45588) {
                case "frameset":
                    b = 0;
                case "template":
                    b = 1;
                case "select":
                    b = 2;
                case "colgroup":
                    b = 3;
                case "td":
                    b = 4;
                case "th":
                    b = 5;
                case "tr":
                    b = 6;
                case "body":
                    b = 7;
                case "head":
                    b = 8;
                case "html":
                    b = 9;
                case "table":
                    b = 10;
                case "tbody":
                    b = 11;
                case "tfoot":
                    b = 12;
                case "thead":
                    b = cb.k;
                case "caption":
                    b = cb.f77931l;
                default:
                    switch (b) {
                        case 0:
                            enumC22780 = EnumC22780.f73535;
                            this.f52510 = enumC22780;
                            break;
                        case 1:
                            if (this.f52508.size() > 0) {
                                enumC22780 = (EnumC22780) C18566.m43105(this.f52508, 1);
                            } else {
                                enumC22780 = null;
                            }
                            if (enumC22780 == null) {
                                throw new C14167("Bug: no template insertion mode on stack!");
                            }
                            this.f52510 = enumC22780;
                            break;
                        case 2:
                            enumC22780 = EnumC22780.f73553;
                            this.f52510 = enumC22780;
                            break;
                        case 3:
                            enumC22780 = EnumC22780.f73541;
                            this.f52510 = enumC22780;
                            break;
                        case 4:
                        case 5:
                            if (z) {
                                enumC22780 = EnumC22780.f73549;
                            } else if (z) {
                                i--;
                            } else {
                                enumC22780 = EnumC22780.f73546;
                            }
                            this.f52510 = enumC22780;
                            break;
                        case 6:
                            enumC22780 = EnumC22780.f73554;
                            this.f52510 = enumC22780;
                            break;
                        case 7:
                            enumC22780 = EnumC22780.f73546;
                            this.f52510 = enumC22780;
                            break;
                        case 8:
                            if (z) {
                                enumC22780 = EnumC22780.f73545;
                            } else if (z) {
                                i--;
                            } else {
                                enumC22780 = EnumC22780.f73546;
                            }
                            this.f52510 = enumC22780;
                            break;
                        case 9:
                            if (this.f52513 == null) {
                                enumC22780 = EnumC22780.f73547;
                            } else {
                                enumC22780 = EnumC22780.f73548;
                            }
                            this.f52510 = enumC22780;
                            break;
                        case 10:
                            enumC22780 = EnumC22780.f73560;
                            this.f52510 = enumC22780;
                            break;
                        case 11:
                        case 12:
                        case 13:
                            enumC22780 = EnumC22780.f73540;
                            this.f52510 = enumC22780;
                            break;
                        case 14:
                            enumC22780 = EnumC22780.f73559;
                            this.f52510 = enumC22780;
                            break;
                        default:
                            if (z) {
                                i--;
                            } else {
                                enumC22780 = EnumC22780.f73546;
                                this.f52510 = enumC22780;
                            }
                            break;
                    }
            }
            if (this.f52510 != enumC22781) {
                return true;
            }
            return false;
        }
        if (this.f52510 != enumC22781) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m40208() {
        if (!m40186("body")) {
            this.f2112.add(this.f2109.m2917());
        }
        this.f52510 = EnumC22780.f73546;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m40193(String str) {
        String[] strArr = this.f52516;
        strArr[0] = str;
        return m40168(strArr, f52498, f52502);
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final boolean m40200(String str) {
        String[] strArr = this.f52516;
        strArr[0] = str;
        return m40168(strArr, f52498, (String[]) null);
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m40210(String str) {
        String[] strArr = this.f52516;
        strArr[0] = str;
        return m40168(strArr, f52504, (String[]) null);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m40224(String str) {
        String[] strArr = this.f52516;
        strArr[0] = str;
        return m40168(strArr, f52498, f52499);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40168(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f2112.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            String strM45588 = ((C19814) this.f2112.get(i)).m45588();
            if (!C20519.m47005(strM45588, strArr)) {
                if (C20519.m47005(strM45588, strArr2) || (strArr3 != null && C20519.m47005(strM45588, strArr3))) {
                    break;
                }
                i--;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m40184(String[] strArr) {
        return m40168(strArr, f52498, (String[]) null);
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean m40197(String str) {
        for (int size = this.f2112.size() - 1; size >= 0; size--) {
            String strM45588 = ((C19814) this.f2112.get(size)).m45588();
            if (strM45588.equals(str)) {
                return true;
            }
            if (!C20519.m47005(strM45588, f52497)) {
                return false;
            }
        }
        throw new C14167("Should not be reachable");
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m40196(C19814 c19814) {
        this.f52513 = c19814;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C19814 m40195() {
        return this.f52513;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m40213(boolean z) {
        this.f52511 = z;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C12052 m40198() {
        return this.f52515;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m40226() {
        this.f52515 = null;
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final void m40220() {
        this.f52518 = new ArrayList();
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final List m40209() {
        return this.f52518;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m40215(String str) {
        while (C20519.m47005(m2153().m45588(), f52501)) {
            if (str != null && m2157(str)) {
                return;
            } else {
                m40190();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40204(boolean z) {
        String[] strArr = z ? f52503 : f52501;
        while (C20519.m47005(m2153().m45588(), strArr)) {
            m40190();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m40191() {
        m40215(am.ax);
        if (!am.ax.equals(m2153().m45588())) {
            m40182(this.f52510);
        }
        m40187(am.ax);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m40227(C19814 c19814) {
        for (int i = 0; i < this.f52505.size(); i++) {
            if (c19814 == this.f52505.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m40192(C19814 c19814) {
        m40202(c19814);
        this.f52505.add(c19814);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40180(C19814 c19814, int i) {
        m40202(c19814);
        try {
            this.f52505.add(i, c19814);
        } catch (IndexOutOfBoundsException unused) {
            this.f52505.add(c19814);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40202(C19814 c19814) {
        int size = this.f52505.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            C19814 c19815 = (C19814) this.f52505.get(i3);
            if (c19815 == null) {
                return;
            }
            if (c19814.m45588().equals(c19815.m45588()) && c19814.mo25045().equals(c19815.mo25045())) {
                i2++;
            }
            if (i2 == 3) {
                this.f52505.remove(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final void m40194() {
        C17136 c17136;
        if (this.f2112.size() > 256) {
            return;
        }
        boolean z = true;
        C19814 c19814 = this.f52505.size() > 0 ? (C19814) C18566.m43105(this.f52505, 1) : null;
        if (c19814 == null || m40167(this.f2112, c19814)) {
            return;
        }
        int size = this.f52505.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (true) {
            if (i3 == i) {
                c17136 = this;
                break;
            }
            i3--;
            c19814 = (C19814) this.f52505.get(i3);
            if (c19814 == null || m40167(this.f2112, c19814)) {
                c17136 = this;
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i3++;
                c19814 = (C19814) c17136.f52505.get(i3);
            }
            C16990.m39822(c19814);
            C19814 c19815 = new C19814(c17136.m2152(c19814.m45588(), c17136.f2103), null, c19814.mo25045().clone());
            c17136.m40211(c19815);
            c17136.f52505.set(i3, c19815);
            if (i3 == i2) {
                return;
            }
            i2 = i2;
            c17136 = c17136;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m40217() {
        while (!this.f52505.isEmpty()) {
            int size = this.f52505.size();
            if ((size > 0 ? (C19814) this.f52505.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m40222(C19814 c19814) {
        int size = this.f52505.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((C19814) this.f52505.get(size)) != c19814);
        this.f52505.remove(size);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m40218(C19814 c19814) {
        return m40167(this.f52505, c19814);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19814 m40205(String str) {
        C19814 c19814;
        int size = this.f52505.size();
        do {
            size--;
            if (size < 0 || (c19814 = (C19814) this.f52505.get(size)) == null) {
                return null;
            }
        } while (!c19814.m45588().equals(str));
        return c19814;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40181(C19814 c19814, C19814 c19815) {
        ArrayList arrayList = this.f52505;
        int iLastIndexOf = arrayList.lastIndexOf(c19814);
        C16990.m39825(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c19815);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m40185() {
        this.f52505.add(null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m40177(AbstractC11347 abstractC11347) {
        C19814 c19814M40174;
        C19814 c19814M40228 = m40228("table");
        boolean z = false;
        if (c19814M40228 != null) {
            if (c19814M40228.mo28099() != null) {
                c19814M40174 = c19814M40228.mo28099();
                z = true;
            } else {
                c19814M40174 = m40174(c19814M40228);
            }
        } else {
            c19814M40174 = (C19814) this.f2112.get(0);
        }
        if (z) {
            C16990.m39822(c19814M40228);
            c19814M40228.m45587(abstractC11347);
        } else {
            c19814M40174.m45584(abstractC11347);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40203(EnumC22780 enumC22780) {
        this.f52508.add(enumC22780);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m40172() {
        if (this.f52508.size() > 0) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40189() {
        return this.f52508.size();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f2106);
        String strValueOf2 = String.valueOf(this.f52510);
        return C9045.m23341(C3435.m10501("TreeBuilder{currentToken=", strValueOf, ", state=", strValueOf2, ", currentElement="), String.valueOf(m2153()), l.d);
    }

    @Override // l.AbstractC0489
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo2161(String str) {
        return str.equals("script") || str.equals("style");
    }
}
