package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0698cb;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.i18n.ErrorBundle;
import org.simpleframework.xml.stream.DocumentReader;

/* JADX INFO: renamed from: l.ܿۚۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 9BI9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18654 extends AbstractC2833 {

    /* JADX INFO: renamed from: ֡ */
    public ArrayList f55688;

    /* JADX INFO: renamed from: ֨ */
    public boolean f55689;

    /* JADX INFO: renamed from: ۖ */
    public boolean f55690;

    /* JADX INFO: renamed from: ۗ */
    public ArrayList f55691;

    /* JADX INFO: renamed from: ۘ */
    public C21199 f55692;

    /* JADX INFO: renamed from: ۙ */
    public EnumC24018 f55693;

    /* JADX INFO: renamed from: ۚ */
    public boolean f55694;

    /* JADX INFO: renamed from: ۠ */
    public boolean f55695;

    /* JADX INFO: renamed from: ܶ */
    public C21199 f55696;

    /* JADX INFO: renamed from: ᩴ */
    public C21889 f55697;

    /* JADX INFO: renamed from: ᩵ */
    public C13822 f55698;

    /* JADX INFO: renamed from: ᩶ */
    public String[] f55699 = {null};

    /* JADX INFO: renamed from: ᩸ */
    public EnumC24018 f55700;

    /* JADX INFO: renamed from: ᩹ */
    public ArrayList f55701;

    /* JADX INFO: renamed from: ۟ */
    public static final String[] f55681 = {"applet", "caption", "html", "marquee", "object", "table", "td", "th"};

    /* JADX INFO: renamed from: ۤ */
    public static final String[] f55682 = {"ol", "ul"};

    /* JADX INFO: renamed from: ۬ */
    public static final String[] f55685 = {"button"};

    /* JADX INFO: renamed from: ᩺ */
    public static final String[] f55687 = {"html", "table"};

    /* JADX INFO: renamed from: ۛ */
    public static final String[] f55680 = {"optgroup", "option"};

    /* JADX INFO: renamed from: ۫ */
    public static final String[] f55684 = {"dd", "dt", "li", "optgroup", "option", C0655am.f2322ax, "rb", "rp", "rt", "rtc"};

    /* JADX INFO: renamed from: ܰ */
    public static final String[] f55686 = {"caption", "colgroup", "dd", "dt", "li", "optgroup", "option", C0655am.f2322ax, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    /* JADX INFO: renamed from: ۨ */
    public static final String[] f55683 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "command", "dd", ErrorBundle.DETAIL_ENTRY, "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", C0172c.f707c, "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "isindex", "li", "link", "listing", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", C0655am.f2322ax, "param", "plaintext", "pre", "script", "section", "select", "style", ErrorBundle.SUMMARY_ENTRY, "table", "tbody", "td", "textarea", "tfoot", "th", "thead", "title", "tr", "ul", "wbr", "xmp"};

    @Override // p067l.AbstractC2833
    /* JADX INFO: renamed from: ۧ */
    public final C3783 mo4527() {
        return C3783.f8101;
    }

    @Override // p067l.AbstractC2833
    /* JADX INFO: renamed from: ֫ */
    public final void mo4521(StringReader stringReader, String str, C12501 c12501) {
        super.mo4521(stringReader, str, c12501);
        this.f55693 = EnumC24018.f76272;
        this.f55700 = null;
        this.f55690 = false;
        this.f55696 = null;
        this.f55698 = null;
        this.f55692 = null;
        this.f55688 = new ArrayList();
        this.f55691 = new ArrayList();
        this.f55701 = new ArrayList();
        this.f55697 = new C21889();
        this.f55695 = true;
        this.f55694 = false;
        this.f55689 = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:51:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x012b  */
    @Override // p067l.AbstractC2833
    /* JADX INFO: renamed from: ֫ */
    public final List mo4518(String str, C21199 c21199, String str2, C12501 c12501) {
        List listM30140;
        this.f55693 = EnumC24018.f76272;
        mo4521(new StringReader(str), str2, c12501);
        this.f55692 = c21199;
        byte b = 1;
        this.f55689 = true;
        if (c21199.m30134() != null) {
            this.f4881.m5237(c21199.m30134().m5243());
        }
        String strM47899 = c21199.m47899();
        strM47899.getClass();
        switch (strM47899.hashCode()) {
            case -1321546630:
                if (!strM47899.equals("template")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1191214428:
                if (!strM47899.equals("iframe")) {
                    b = -1;
                }
                break;
            case -1003243718:
                if (!strM47899.equals("textarea")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -907685685:
                if (!strM47899.equals("script")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 118807:
                if (!strM47899.equals(DocumentReader.RESERVED)) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 109780401:
                if (!strM47899.equals("style")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 110371416:
                if (!strM47899.equals("title")) {
                    b = -1;
                } else {
                    b = 6;
                }
                break;
            case 1192721831:
                if (!strM47899.equals("noframes")) {
                    b = -1;
                } else {
                    b = 7;
                }
                break;
            case 1551550924:
                if (!strM47899.equals("noscript")) {
                    b = -1;
                } else {
                    b = 8;
                }
                break;
            case 1973234167:
                if (!strM47899.equals("plaintext")) {
                    b = -1;
                } else {
                    b = 9;
                }
                break;
            case 2115613112:
                if (!strM47899.equals("noembed")) {
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
                this.f4876.m46471(EnumC20940.f65740);
                m42448(EnumC24018.f76273);
                break;
            case 1:
            case 4:
            case 5:
            case 7:
            case 10:
                this.f4876.m46471(EnumC20940.f65771);
                break;
            case 2:
            case 6:
                this.f4876.m46471(EnumC20940.f65782);
                break;
            case 3:
                this.f4876.m46471(EnumC20940.f65745);
                break;
            case 8:
                this.f4876.m46471(EnumC20940.f65740);
                break;
            case 9:
                this.f4876.m46471(EnumC20940.f65749);
                break;
            default:
                this.f4876.m46471(EnumC20940.f65740);
                break;
        }
        C21199 c211910 = new C21199(m4519(strM47899, this.f4875), str2, null);
        this.f4881.m47895(c211910);
        this.f4884.add(c211910);
        m42470();
        while (c21199 != null) {
            if (c21199 instanceof C13822) {
                this.f55698 = (C13822) c21199;
                m4529();
                listM30140 = c211910.m30140();
                if (!listM30140.isEmpty()) {
                    c211910.m47873(-1, listM30140);
                }
                return c211910.m30141();
            }
            c21199 = c21199.mo30143();
        }
        m4529();
        listM30140 = c211910.m30140();
        if (!listM30140.isEmpty()) {
            c211910.m47873(-1, listM30140);
        }
        return c211910.m30141();
    }

    @Override // p067l.AbstractC2833
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4525(AbstractC4454 abstractC4454) {
        this.f4878 = abstractC4454;
        return this.f55693.mo3774(abstractC4454, this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42420(AbstractC4454 abstractC4454, EnumC24018 enumC24018) {
        this.f4878 = abstractC4454;
        enumC24018.mo3774(abstractC4454, this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m42457(EnumC24018 enumC24018) {
        this.f55693 = enumC24018;
    }

    /* JADX INFO: renamed from: ᩶ */
    public final EnumC24018 m42466() {
        return this.f55693;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m42464() {
        this.f55700 = this.f55693;
    }

    /* JADX INFO: renamed from: ֡ */
    public final EnumC24018 m42416() {
        return this.f55700;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42428(boolean z) {
        this.f55695 = z;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m42468() {
        return this.f55695;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m42461(C21199 c21199) {
        if (this.f55690) {
            return;
        }
        String strMo27060 = c21199.mo27060("href");
        if (strMo27060.length() != 0) {
            this.f4874 = strMo27060;
            this.f55690 = true;
            this.f4881.m30142(strMo27060);
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final boolean m42433() {
        return this.f55689;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42427(EnumC24018 enumC24018) {
        if (this.f4882.m28798().m21390()) {
            this.f4882.m28798().add(new C15300(this.f4879, "Unexpected %s token [%s] when in state [%s]", this.f4878.getClass().getSimpleName(), this.f4878, enumC24018));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21199 m42418(C11160 c11160) {
        if (c11160.m24220() && !c11160.f29033.isEmpty() && c11160.f29033.m38885(this.f4875) > 0) {
            Object[] objArr = {c11160.f29037};
            C9266 c9266M28798 = this.f4882.m28798();
            if (c9266M28798.m21390()) {
                c9266M28798.add(new C15300(this.f4879, "Dropped duplicate attribute(s) in tag [%s]", objArr));
            }
        }
        if (c11160.f29031) {
            C21199 c21199M42446 = m42446(c11160);
            this.f4884.add(c21199M42446);
            this.f4876.m46471(EnumC20940.f65740);
            C20548 c20548 = this.f4876;
            C21889 c21889 = this.f55697;
            c21889.mo9338();
            c21889.m24225(c21199M42446.m47902());
            c20548.m46460(c21889);
            return c21199M42446;
        }
        C17864 c17864M4519 = m4519(c11160.m24219(), this.f4875);
        C3783 c3783 = this.f4875;
        C17173 c17173 = c11160.f29033;
        c3783.m7396(c17173);
        C21199 c21199 = new C21199(c17864M4519, null, c17173);
        m42414(c21199, c11160);
        this.f4884.add(c21199);
        return c21199;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m42456(C21199 c21199) {
        m42414(c21199, null);
        this.f4884.add(c21199);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21199 m42446(C11160 c11160) {
        C17864 c17864M4519 = m4519(c11160.m24219(), this.f4875);
        C3783 c3783 = this.f4875;
        C17173 c17173 = c11160.f29033;
        c3783.m7396(c17173);
        C21199 c21199 = new C21199(c17864M4519, null, c17173);
        m42414(c21199, c11160);
        if (c11160.f29031) {
            if (c17864M4519.m40575()) {
                if (!c17864M4519.m40582()) {
                    this.f4876.m46458("Tag [%s] cannot be self closing; not a void tag", c17864M4519.m40577());
                    return c21199;
                }
            } else {
                c17864M4519.m40579();
            }
        }
        return c21199;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42421(C11160 c11160, boolean z, boolean z2) {
        C17864 c17864M4519 = m4519(c11160.m24219(), this.f4875);
        C3783 c3783 = this.f4875;
        C17173 c17173 = c11160.f29033;
        c3783.m7396(c17173);
        C13822 c13822 = new C13822(c17864M4519, c17173);
        if (!z2 || !m42431("template")) {
            this.f55698 = c13822;
        }
        m42414(c13822, c11160);
        if (z) {
            this.f4884.add(c13822);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42423(C15852 c15852) {
        m42414(new C5775(c15852.m35981()), c15852);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42424(C18535 c18535) {
        AbstractC13152 c12620;
        C21199 c21199M4520 = m4520();
        String strM47899 = c21199M4520.m47899();
        String strM42138 = c18535.m42138();
        if (c18535 instanceof C19206) {
            c12620 = new C4434(strM42138);
        } else if (mo4528(strM47899)) {
            c12620 = new C19857(strM42138);
        } else {
            c12620 = new C12620(strM42138);
        }
        c21199M4520.m47895(c12620);
        m4522(c12620, c18535);
    }

    /* JADX INFO: renamed from: ۧ */
    private void m42414(AbstractC13152 abstractC13152, AbstractC4454 abstractC4454) {
        C13822 c13822;
        if (this.f4884.isEmpty()) {
            this.f4881.m47895(abstractC13152);
        } else if (this.f55694 && C21869.m49328(m4520().m47899(), C13290.f37313)) {
            m42422(abstractC13152);
        } else {
            m4520().m47895(abstractC13152);
        }
        if (abstractC13152 instanceof C21199) {
            C21199 c21199 = (C21199) abstractC13152;
            if (c21199.m47882().m40581() && (c13822 = this.f55698) != null) {
                c13822.m31488(c21199);
            }
        }
        m4522(abstractC13152, abstractC4454);
    }

    /* JADX INFO: renamed from: ۚ */
    public final void m42435() {
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m42452(C21199 c21199) {
        return m42412(this.f4884, c21199);
    }

    /* JADX INFO: renamed from: ۖ */
    public final boolean m42431(String str) {
        return m42473(str) != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m42412(ArrayList arrayList, C21199 c21199) {
        int size = arrayList.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            if (((C21199) arrayList.get(i)) == c21199) {
                return true;
            }
            i--;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C21199 m42473(String str) {
        int size = this.f4884.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        while (i >= i2) {
            C21199 c21199 = (C21199) this.f4884.get(i);
            if (c21199.m47899().equals(str)) {
                return c21199;
            }
            i--;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m42444(C21199 c21199) {
        int size = this.f4884.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((C21199) this.f4884.get(size)) != c21199);
        this.f4884.remove(size);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m42432(String str) {
        C21199 c21199;
        int size = this.f4884.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
            c21199 = (C21199) this.f4884.get(size);
            this.f4884.remove(size);
        } while (!c21199.m47899().equals(str));
        AbstractC4454 abstractC4454 = this.f4878;
        if (abstractC4454 instanceof C21889) {
            m4523(c21199, abstractC4454);
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m42451() {
        m42415("table", "template");
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m42459() {
        m42415("tbody", "tfoot", "thead", "template");
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m42474() {
        m42415("tr", "template");
    }

    /* JADX INFO: renamed from: ۧ */
    private void m42415(String... strArr) {
        int size = this.f4884.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C21199 c21199 = (C21199) this.f4884.get(size);
            String strM47899 = c21199.m47899();
            int i = C21869.f68789;
            for (String str : strArr) {
                if (str.equals(strM47899)) {
                    return;
                }
            }
            if (c21199.m47899().equals("html")) {
                return;
            } else {
                this.f4884.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21199 m42419(C21199 c21199) {
        int size = this.f4884.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((C21199) this.f4884.get(size)) != c21199);
        return (C21199) this.f4884.get(size - 1);
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
    /* JADX INFO: renamed from: ᩸ */
    public final boolean m42470() {
        EnumC24018 enumC24018;
        int size = this.f4884.size();
        int i = size - 1;
        int i2 = i >= 256 ? size - 257 : 0;
        EnumC24018 enumC24019 = this.f55693;
        if (this.f4884.size() == 0) {
            this.f55693 = EnumC24018.f76276;
        }
        boolean z = false;
        while (i >= i2) {
            C21199 c21199 = (C21199) this.f4884.get(i);
            if (i == i2) {
                if (this.f55689) {
                    c21199 = this.f55692;
                }
                z = true;
            }
            String strM47899 = c21199 != null ? c21199.m47899() : "";
            strM47899.getClass();
            byte b = -1;
            switch (strM47899) {
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
                    b = C0698cb.f2569k;
                case "caption":
                    b = C0698cb.f2570l;
                default:
                    switch (b) {
                        case 0:
                            enumC24018 = EnumC24018.f76265;
                            this.f55693 = enumC24018;
                            break;
                        case 1:
                            if (this.f55691.size() > 0) {
                                enumC24018 = (EnumC24018) C20013.m45383(this.f55691, 1);
                            } else {
                                enumC24018 = null;
                            }
                            if (enumC24018 == null) {
                                throw new C15832("Bug: no template insertion mode on stack!");
                            }
                            this.f55693 = enumC24018;
                            break;
                        case 2:
                            enumC24018 = EnumC24018.f76283;
                            this.f55693 = enumC24018;
                            break;
                        case 3:
                            enumC24018 = EnumC24018.f76271;
                            this.f55693 = enumC24018;
                            break;
                        case 4:
                        case 5:
                            if (z) {
                                enumC24018 = EnumC24018.f76279;
                            } else if (z) {
                                i--;
                            } else {
                                enumC24018 = EnumC24018.f76276;
                            }
                            this.f55693 = enumC24018;
                            break;
                        case 6:
                            enumC24018 = EnumC24018.f76284;
                            this.f55693 = enumC24018;
                            break;
                        case 7:
                            enumC24018 = EnumC24018.f76276;
                            this.f55693 = enumC24018;
                            break;
                        case 8:
                            if (z) {
                                enumC24018 = EnumC24018.f76275;
                            } else if (z) {
                                i--;
                            } else {
                                enumC24018 = EnumC24018.f76276;
                            }
                            this.f55693 = enumC24018;
                            break;
                        case 9:
                            if (this.f55696 == null) {
                                enumC24018 = EnumC24018.f76277;
                            } else {
                                enumC24018 = EnumC24018.f76278;
                            }
                            this.f55693 = enumC24018;
                            break;
                        case 10:
                            enumC24018 = EnumC24018.f76290;
                            this.f55693 = enumC24018;
                            break;
                        case 11:
                        case 12:
                        case 13:
                            enumC24018 = EnumC24018.f76270;
                            this.f55693 = enumC24018;
                            break;
                        case 14:
                            enumC24018 = EnumC24018.f76289;
                            this.f55693 = enumC24018;
                            break;
                        default:
                            if (z) {
                                i--;
                            } else {
                                enumC24018 = EnumC24018.f76276;
                                this.f55693 = enumC24018;
                            }
                            break;
                    }
            }
            if (this.f55693 != enumC24019) {
                return true;
            }
            return false;
        }
        if (this.f55693 != enumC24019) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ܶ */
    public final void m42453() {
        if (!m42431("body")) {
            this.f4884.add(this.f4881.m5246());
        }
        this.f55693 = EnumC24018.f76276;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m42438(String str) {
        String[] strArr = this.f55699;
        strArr[0] = str;
        return m42413(strArr, f55681, f55685);
    }

    /* JADX INFO: renamed from: ۢ */
    public final boolean m42445(String str) {
        String[] strArr = this.f55699;
        strArr[0] = str;
        return m42413(strArr, f55681, (String[]) null);
    }

    /* JADX INFO: renamed from: ܺ */
    public final boolean m42455(String str) {
        String[] strArr = this.f55699;
        strArr[0] = str;
        return m42413(strArr, f55687, (String[]) null);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m42469(String str) {
        String[] strArr = this.f55699;
        strArr[0] = str;
        return m42413(strArr, f55681, f55682);
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m42413(String[] strArr, String[] strArr2, String[] strArr3) {
        int size = this.f4884.size();
        int i = size - 1;
        int i2 = i > 100 ? size - 101 : 0;
        while (i >= i2) {
            String strM47899 = ((C21199) this.f4884.get(i)).m47899();
            if (!C21869.m49328(strM47899, strArr)) {
                if (C21869.m49328(strM47899, strArr2) || (strArr3 != null && C21869.m49328(strM47899, strArr3))) {
                    break;
                }
                i--;
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m42429(String[] strArr) {
        return m42413(strArr, f55681, (String[]) null);
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m42442(String str) {
        for (int size = this.f4884.size() - 1; size >= 0; size--) {
            String strM47899 = ((C21199) this.f4884.get(size)).m47899();
            if (strM47899.equals(str)) {
                return true;
            }
            if (!C21869.m49328(strM47899, f55680)) {
                return false;
            }
        }
        throw new C15832("Should not be reachable");
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m42441(C21199 c21199) {
        this.f55696 = c21199;
    }

    /* JADX INFO: renamed from: ۡ */
    public final C21199 m42440() {
        return this.f55696;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m42458(boolean z) {
        this.f55694 = z;
    }

    /* JADX INFO: renamed from: ۢ */
    public final C13822 m42443() {
        return this.f55698;
    }

    /* JADX INFO: renamed from: ᩹ */
    public final void m42471() {
        this.f55698 = null;
    }

    /* JADX INFO: renamed from: ᩵ */
    public final void m42465() {
        this.f55701 = new ArrayList();
    }

    /* JADX INFO: renamed from: ܺ */
    public final List m42454() {
        return this.f55701;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m42460(String str) {
        while (C21869.m49328(m4520().m47899(), f55684)) {
            if (str != null && m4524(str)) {
                return;
            } else {
                m42435();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42449(boolean z) {
        String[] strArr = z ? f55686 : f55684;
        while (C21869.m49328(m4520().m47899(), strArr)) {
            m42435();
        }
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m42436() {
        m42460(C0655am.f2322ax);
        if (!C0655am.f2322ax.equals(m4520().m47899())) {
            m42427(this.f55693);
        }
        m42432(C0655am.f2322ax);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m42472(C21199 c21199) {
        for (int i = 0; i < this.f55688.size(); i++) {
            if (c21199 == this.f55688.get(i)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m42437(C21199 c21199) {
        m42447(c21199);
        this.f55688.add(c21199);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42425(C21199 c21199, int i) {
        m42447(c21199);
        try {
            this.f55688.add(i, c21199);
        } catch (IndexOutOfBoundsException unused) {
            this.f55688.add(c21199);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42447(C21199 c21199) {
        int size = this.f55688.size();
        int i = size - 13;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        for (int i3 = size - 1; i3 >= i; i3--) {
            C21199 c211910 = (C21199) this.f55688.get(i3);
            if (c211910 == null) {
                return;
            }
            if (c21199.m47899().equals(c211910.m47899()) && c21199.mo27062().equals(c211910.mo27062())) {
                i2++;
            }
            if (i2 == 3) {
                this.f55688.remove(i3);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۠ */
    public final void m42439() {
        C18654 c18654;
        if (this.f4884.size() > 256) {
            return;
        }
        boolean z = true;
        C21199 c21199 = this.f55688.size() > 0 ? (C21199) C20013.m45383(this.f55688, 1) : null;
        if (c21199 == null || m42412(this.f4884, c21199)) {
            return;
        }
        int size = this.f55688.size();
        int i = size - 12;
        if (i < 0) {
            i = 0;
        }
        int i2 = size - 1;
        int i3 = i2;
        while (true) {
            if (i3 == i) {
                c18654 = this;
                break;
            }
            i3--;
            c21199 = (C21199) this.f55688.get(i3);
            if (c21199 == null || m42412(this.f4884, c21199)) {
                c18654 = this;
                z = false;
                break;
            }
        }
        while (true) {
            if (!z) {
                i3++;
                c21199 = (C21199) c18654.f55688.get(i3);
            }
            C18515.m42065(c21199);
            C21199 c211910 = new C21199(c18654.m4519(c21199.m47899(), c18654.f4875), null, c21199.mo27062().clone());
            c18654.m42456(c211910);
            c18654.f55688.set(i3, c211910);
            if (i3 == i2) {
                return;
            }
            i2 = i2;
            c18654 = c18654;
            z = false;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m42462() {
        while (!this.f55688.isEmpty()) {
            int size = this.f55688.size();
            if ((size > 0 ? (C21199) this.f55688.remove(size - 1) : null) == null) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m42467(C21199 c21199) {
        int size = this.f55688.size();
        do {
            size--;
            if (size < 0) {
                return;
            }
        } while (((C21199) this.f55688.get(size)) != c21199);
        this.f55688.remove(size);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m42463(C21199 c21199) {
        return m42412(this.f55688, c21199);
    }

    /* JADX INFO: renamed from: ܳ */
    public final C21199 m42450(String str) {
        C21199 c21199;
        int size = this.f55688.size();
        do {
            size--;
            if (size < 0 || (c21199 = (C21199) this.f55688.get(size)) == null) {
                return null;
            }
        } while (!c21199.m47899().equals(str));
        return c21199;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42426(C21199 c21199, C21199 c211910) {
        ArrayList arrayList = this.f55688;
        int iLastIndexOf = arrayList.lastIndexOf(c21199);
        C18515.m42068(iLastIndexOf != -1);
        arrayList.set(iLastIndexOf, c211910);
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m42430() {
        this.f55688.add(null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42422(AbstractC13152 abstractC13152) {
        C21199 c21199M42419;
        C21199 c21199M42473 = m42473("table");
        boolean z = false;
        if (c21199M42473 != null) {
            if (c21199M42473.mo30143() != null) {
                c21199M42419 = c21199M42473.mo30143();
                z = true;
            } else {
                c21199M42419 = m42419(c21199M42473);
            }
        } else {
            c21199M42419 = (C21199) this.f4884.get(0);
        }
        if (z) {
            C18515.m42065(c21199M42473);
            c21199M42473.m47898(abstractC13152);
        } else {
            c21199M42419.m47895(abstractC13152);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42448(EnumC24018 enumC24018) {
        this.f55691.add(enumC24018);
    }

    /* JADX INFO: renamed from: ֨ */
    public final void m42417() {
        if (this.f55691.size() > 0) {
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public final int m42434() {
        return this.f55691.size();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f4878);
        String strValueOf2 = String.valueOf(this.f55693);
        return C10965.m25286(C5633.m12525("TreeBuilder{currentToken=", strValueOf, ", state=", strValueOf2, ", currentElement="), String.valueOf(m4520()), C0249l.f1198d);
    }

    @Override // p067l.AbstractC2833
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo4528(String str) {
        return str.equals("script") || str.equals("style");
    }
}
