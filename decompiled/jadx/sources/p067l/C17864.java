package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.umeng.analytics.pro.C0655am;
import java.util.HashMap;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.ܽ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBJ7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17864 implements Cloneable {

    /* JADX INFO: renamed from: ֫֫ */
    public static final String[] f53317;

    /* JADX INFO: renamed from: ۟ */
    public static final String[] f53318;

    /* JADX INFO: renamed from: ۧ֫ */
    public static final String[] f53319;

    /* JADX INFO: renamed from: ۨ */
    public static final String[] f53320;

    /* JADX INFO: renamed from: ܰ */
    public static final String[] f53321;

    /* JADX INFO: renamed from: ܽ֫ */
    public static final HashMap f53322 = new HashMap();

    /* JADX INFO: renamed from: ᩺ */
    public static final String[] f53323;

    /* JADX INFO: renamed from: ۛ */
    public String f53326;

    /* JADX INFO: renamed from: ۬ */
    public String f53329;

    /* JADX INFO: renamed from: ۗ */
    public boolean f53324 = true;

    /* JADX INFO: renamed from: ۙ */
    public boolean f53325 = true;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f53331 = false;

    /* JADX INFO: renamed from: ۤ */
    public boolean f53327 = false;

    /* JADX INFO: renamed from: ۫ */
    public boolean f53328 = false;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f53332 = false;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f53330 = false;

    static {
        String[] strArr = {"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", C0655am.f2322ax, "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", C0172c.f707c, "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", ErrorBundle.DETAIL_ENTRY, "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"};
        f53317 = new String[]{"object", "base", "font", "tt", C0655am.f2275aC, "b", C0655am.f2280aH, "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", C0655am.f2320av, "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", AnnotatedPrivateKey.LABEL, "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", ErrorBundle.SUMMARY_ENTRY, "command", AbstractC0213e.f992p, "area", "basefont", "bgsound", "menuitem", "param", "source", "track", AbstractC0213e.f989m, "bdi", C0655am.f2274aB, "strike", "nobr"};
        f53320 = new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", AbstractC0213e.f992p, "area", "basefont", "bgsound", "menuitem", "param", "source", "track"};
        f53318 = new String[]{"title", C0655am.f2320av, C0655am.f2322ax, "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", C0655am.f2274aB};
        f53319 = new String[]{"pre", "plaintext", "title", "textarea"};
        f53323 = new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"};
        f53321 = new String[]{"input", "keygen", "object", "select", "textarea"};
        for (int i = 0; i < 69; i++) {
            C17864 c17864 = new C17864(strArr[i]);
            f53322.put(c17864.f53326, c17864);
        }
        for (String str : f53317) {
            C17864 c17865 = new C17864(str);
            c17865.f53324 = false;
            c17865.f53325 = false;
            f53322.put(c17865.f53326, c17865);
        }
        for (String str2 : f53320) {
            C17864 c17866 = (C17864) f53322.get(str2);
            C18515.m42065(c17866);
            c17866.f53331 = true;
        }
        for (String str3 : f53318) {
            C17864 c17867 = (C17864) f53322.get(str3);
            C18515.m42065(c17867);
            c17867.f53325 = false;
        }
        for (String str4 : f53319) {
            C17864 c17868 = (C17864) f53322.get(str4);
            C18515.m42065(c17868);
            c17868.f53328 = true;
        }
        for (String str5 : f53323) {
            C17864 c17869 = (C17864) f53322.get(str5);
            C18515.m42065(c17869);
            c17869.f53332 = true;
        }
        for (String str6 : f53321) {
            C17864 c178610 = (C17864) f53322.get(str6);
            C18515.m42065(c178610);
            c178610.f53330 = true;
        }
    }

    public C17864(String str) {
        this.f53326 = str;
        this.f53329 = C24550.m54147(str);
    }

    public final String getName() {
        return this.f53326;
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m40577() {
        return this.f53329;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C17864 m40572(String str, C3783 c3783) {
        C18515.m42065((Object) str);
        HashMap map = f53322;
        C17864 c17864 = (C17864) map.get(str);
        if (c17864 != null) {
            return c17864;
        }
        String strM7398 = c3783.m7398(str);
        C18515.m42066(strM7398);
        String strM54147 = C24550.m54147(strM7398);
        C17864 c17865 = (C17864) map.get(strM54147);
        if (c17865 == null) {
            C17864 c17866 = new C17864(strM7398);
            c17866.f53324 = false;
            return c17866;
        }
        if (!c3783.m7399() || strM7398.equals(strM54147)) {
            return c17865;
        }
        try {
            C17864 c17867 = (C17864) super.clone();
            c17867.f53326 = strM7398;
            return c17867;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m40580() {
        return this.f53324;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m40574() {
        return this.f53325;
    }

    /* JADX INFO: renamed from: ܳ */
    public final boolean m40578() {
        return !this.f53324;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m40582() {
        return this.f53331;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m40583() {
        return this.f53331 || this.f53327;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m40575() {
        return f53322.containsKey(this.f53326);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m40573(String str) {
        return f53322.containsKey(str);
    }

    /* JADX INFO: renamed from: ۡ */
    public final boolean m40576() {
        return this.f53328;
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m40581() {
        return this.f53332;
    }

    /* JADX INFO: renamed from: ܺ */
    public final void m40579() {
        this.f53327 = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17864)) {
            return false;
        }
        C17864 c17864 = (C17864) obj;
        return this.f53326.equals(c17864.f53326) && this.f53331 == c17864.f53331 && this.f53325 == c17864.f53325 && this.f53324 == c17864.f53324 && this.f53328 == c17864.f53328 && this.f53327 == c17864.f53327 && this.f53332 == c17864.f53332 && this.f53330 == c17864.f53330;
    }

    public final int hashCode() {
        return (((((((((((((this.f53326.hashCode() * 31) + (this.f53324 ? 1 : 0)) * 31) + (this.f53325 ? 1 : 0)) * 31) + (this.f53331 ? 1 : 0)) * 31) + (this.f53327 ? 1 : 0)) * 31) + (this.f53328 ? 1 : 0)) * 31) + (this.f53332 ? 1 : 0)) * 31) + (this.f53330 ? 1 : 0);
    }

    public final String toString() {
        return this.f53326;
    }

    public final Object clone() {
        try {
            return (C17864) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
