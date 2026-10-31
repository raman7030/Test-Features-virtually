package l;

import com.alipay.sdk.m.n.c;
import com.umeng.analytics.pro.am;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* JADX INFO: renamed from: l.۫۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 590I */
/* JADX INFO: loaded from: classes4.dex */
public final class C12422 extends AbstractC3250 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Set f37401 = C20195.unmodifiableSet(new HashSet(Arrays.asList(am.av, "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", am.aC, "img", "input", "kbd", AnnotatedPrivateKey.LABEL, "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Set f37402 = C20195.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Set f37403 = C20195.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", c.c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", am.ax, "pre", "section", "table", "tfoot", "ul", "video")));

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C18773 f37405;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C1819 f37406;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f37408;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f37409;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ArrayList f37407 = new ArrayList(0);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C21595 f37404 = new C21595("", 0, Collections.EMPTY_MAP, null);

    public C12422(C18773 c18773, C1819 c1819) {
        this.f37405 = c18773;
        this.f37406 = c1819;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30589(C17820 c17820, String str) {
        C22300 c22300;
        int length;
        C15223 c15223 = new C15223(new C6758(str), new C9581(0));
        while (true) {
            AbstractC8169 abstractC8169M36031 = c15223.m36031();
            EnumC1113 enumC1113 = abstractC8169M36031.f25169;
            if (EnumC1113.EOF == enumC1113) {
                return;
            }
            int i = C13127.f39272[enumC1113.ordinal()];
            C18773 c18773 = this.f37405;
            Set set = f37403;
            ArrayList arrayList = this.f37407;
            Set set2 = f37401;
            boolean z = true;
            if (i == 1) {
                C0407 c0407 = (C0407) abstractC8169M36031;
                boolean zContains = set2.contains(c0407.f16669);
                Set set3 = f37402;
                if (zContains) {
                    String str2 = c0407.f16669;
                    C22300 c22301 = new C22300(m30586(c0407), c17820.length(), str2);
                    if (this.f37408) {
                        int length2 = c17820.length();
                        if (length2 > 0 && '\n' != c17820.charAt(length2 - 1)) {
                            AbstractC20890.m47721(c17820, '\n');
                        }
                        this.f37408 = false;
                    }
                    if (set3.contains(str2) || c0407.f16671) {
                        c18773.getClass();
                        String strM43434 = C18773.m43434(c22301);
                        if (strM43434 != null && strM43434.length() > 0) {
                            try {
                                c17820.append((CharSequence) strM43434);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        int length3 = c17820.length();
                        if (!c22301.isClosed()) {
                            c22301.f65320 = length3;
                        }
                    }
                    arrayList.add(c22301);
                } else {
                    String str3 = c0407.f16669;
                    if (am.ax.equals(this.f37404.f65321)) {
                        this.f37404.m48774(c17820.length());
                        AbstractC20890.m47721(c17820, '\n');
                        this.f37404 = this.f37404.f69344;
                    } else if ("li".equals(str3) && "li".equals(this.f37404.f65321)) {
                        this.f37404.m48774(c17820.length());
                        this.f37404 = this.f37404.f69344;
                    }
                    if (set.contains(str3)) {
                        this.f37409 = "pre".equals(str3);
                        int length4 = c17820.length();
                        if (length4 > 0 && '\n' != c17820.charAt(length4 - 1)) {
                            AbstractC20890.m47721(c17820, '\n');
                        }
                    } else if (this.f37408) {
                        int length5 = c17820.length();
                        if (length5 > 0 && '\n' != c17820.charAt(length5 - 1)) {
                            AbstractC20890.m47721(c17820, '\n');
                        }
                        this.f37408 = false;
                    }
                    int length6 = c17820.length();
                    Map mapM30586 = m30586(c0407);
                    C21595 c21595 = this.f37404;
                    C21595 c21596 = new C21595(str3, length6, mapM30586, c21595);
                    if (!set3.contains(str3) && !c0407.f16671) {
                        z = false;
                    }
                    if (z) {
                        c18773.getClass();
                        String strM43435 = C18773.m43434(c21596);
                        if (strM43435 != null && strM43435.length() > 0) {
                            try {
                                c17820.append((CharSequence) strM43435);
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        c21596.m48774(c17820.length());
                    }
                    ArrayList arrayList2 = c21595.f69345;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(2);
                        c21595.f69345 = arrayList2;
                    }
                    arrayList2.add(c21596);
                    if (!z) {
                        this.f37404 = c21596;
                    }
                }
            } else if (i == 2) {
                C19459 c19459 = (C19459) abstractC8169M36031;
                if (set2.contains(c19459.f16669)) {
                    String str4 = c19459.f16669;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size <= -1) {
                            c22300 = null;
                            break;
                        }
                        c22300 = (C22300) arrayList.get(size);
                        if (str4.equals(c22300.f65321) && c22300.f65320 < 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (c22300 == null) {
                        continue;
                    } else {
                        if (c22300.f65322 == c17820.length()) {
                            c18773.getClass();
                            CharSequence charSequenceM43434 = C18773.m43434(c22300);
                            if (charSequenceM43434 != null) {
                                try {
                                    c17820.append(charSequenceM43434);
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                        int length7 = c17820.length();
                        if (!c22300.isClosed()) {
                            c22300.f65320 = length7;
                        }
                    }
                } else {
                    String str5 = c19459.f16669;
                    C21595 c21597 = this.f37404;
                    while (c21597 != null && !str5.equals(c21597.f65321) && !c21597.isClosed()) {
                        c21597 = c21597.f69344;
                    }
                    if (c21597 != null) {
                        int i2 = c21597.f65322;
                        if ("pre".equals(str5)) {
                            this.f37409 = false;
                        }
                        if (i2 == c17820.length()) {
                            c18773.getClass();
                            CharSequence charSequenceM43435 = C18773.m43434(c21597);
                            if (charSequenceM43435 != null) {
                                try {
                                    c17820.append(charSequenceM43435);
                                } catch (IOException e4) {
                                    throw new RuntimeException(e4);
                                }
                            }
                        }
                        c21597.m48774(c17820.length());
                        if (i2 != c21597.f65320) {
                            this.f37408 = set.contains(c21597.f65321);
                        }
                        if (am.ax.equals(str5)) {
                            AbstractC20890.m47721(c17820, '\n');
                        }
                        this.f37404 = c21597.f69344;
                    } else {
                        continue;
                    }
                }
            } else if (i != 3) {
                continue;
            } else {
                C15929 c15929 = (C15929) abstractC8169M36031;
                if (this.f37409) {
                    try {
                        c17820.append(c15929.m37708());
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                } else {
                    if (this.f37408) {
                        int length8 = c17820.length();
                        if (length8 > 0 && '\n' != c17820.charAt(length8 - 1)) {
                            AbstractC20890.m47721(c17820, '\n');
                        }
                        this.f37408 = false;
                    }
                    String strM37708 = c15929.m37708();
                    this.f37406.getClass();
                    int length9 = c17820.length();
                    int length10 = strM37708.length();
                    boolean z2 = false;
                    for (int i3 = 0; i3 < length10; i3++) {
                        char cCharAt = strM37708.charAt(i3);
                        if (Character.isWhitespace(cCharAt)) {
                            z2 = true;
                        } else {
                            if (z2 && (length = c17820.length()) > 0 && !Character.isWhitespace(c17820.charAt(length - 1))) {
                                AbstractC20890.m47721(c17820, ' ');
                            }
                            AbstractC20890.m47721(c17820, cCharAt);
                            z2 = false;
                        }
                    }
                    if (z2 && length9 < c17820.length()) {
                        AbstractC20890.m47721(c17820, ' ');
                    }
                }
            }
            abstractC8169M36031.mo1924();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m30590(InterfaceC4661 interfaceC4661) {
        ArrayList arrayList = this.f37407;
        if (arrayList.size() > 0) {
            ((C10306) interfaceC4661).m26061(C20195.unmodifiableList(arrayList));
            arrayList.clear();
        } else {
            ((C10306) interfaceC4661).m26061(Collections.EMPTY_LIST);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30588(InterfaceC4661 interfaceC4661) {
        C21595 c21595 = this.f37404;
        while (true) {
            C21595 c21596 = c21595.f69344;
            if (c21596 == null) {
                break;
            } else {
                c21595 = c21596;
            }
        }
        List listMo3872 = c21595.mo3872();
        if (listMo3872.size() > 0) {
            ((C6072) interfaceC4661).m16927(listMo3872);
        } else {
            ((C6072) interfaceC4661).m16927(Collections.EMPTY_LIST);
        }
        this.f37404 = new C21595("", 0, Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m30587() {
        this.f37407.clear();
        this.f37404 = new C21595("", 0, Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Map m30586(C0407 c0407) {
        C14518<C18047> c14518 = c0407.f16666;
        int size = c14518.size();
        if (size > 0) {
            HashMap map = new HashMap(size);
            for (C18047 c18047 : c14518) {
                map.put(c18047.getKey().toLowerCase(Locale.US), c18047.getValue());
            }
            return C20195.unmodifiableMap(map);
        }
        return Collections.EMPTY_MAP;
    }
}
