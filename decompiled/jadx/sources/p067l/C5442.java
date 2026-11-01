package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.umeng.analytics.pro.C0655am;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.ۗ۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6OC */
/* JADX INFO: loaded from: classes2.dex */
public final class C5442 {

    /* JADX INFO: renamed from: ۜ */
    public static final Set f12976;

    /* JADX INFO: renamed from: ۧ */
    public static final Set f12977;

    /* JADX INFO: renamed from: ܳ */
    public static final Set f12978;

    /* JADX INFO: renamed from: ܽ */
    public static final Set f12979;

    /* JADX INFO: renamed from: ܿ */
    public static final Set f12980;

    /* JADX INFO: renamed from: ᩳ */
    public static final Set f12981;

    /* JADX INFO: renamed from: ᩷ */
    public static final Set f12982;

    /* JADX INFO: renamed from: ᩻ */
    public static final Set f12983;

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f12984 = new ArrayList();

    static {
        String[] strArr = {"area", "base", "br", "col", "embed", "hr", "img", "input", "link", "meta", "param", "source", "track", "wbr"};
        HashSet hashSet = new HashSet(14);
        for (int i = 0; i < 14; i++) {
            String str = strArr[i];
            C12826.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f12982 = C21562.unmodifiableSet(hashSet);
        Object[] objArr = {"pre", "textarea", "title", "xmp", "iframe", "noembed", "noframes", "noscript", "plaintext"};
        HashSet hashSet2 = new HashSet(9);
        for (int i2 = 0; i2 < 9; i2++) {
            Object obj = objArr[i2];
            C12826.requireNonNull(obj);
            if (!hashSet2.add(obj)) {
                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
            }
        }
        f12981 = C21562.unmodifiableSet(hashSet2);
        String[] strArr2 = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", C0655am.f2275aC, "img", "li", "listing", "menu", "meta", "nobr", "ol", C0655am.f2322ax, "pre", "ruby", C0655am.f2274aB, "small", "span", "strong", "strike", "sub", "sup", "table", "tt", C0655am.f2280aH, "ul", "var"};
        HashSet hashSet3 = new HashSet(44);
        for (int i3 = 0; i3 < 44; i3++) {
            String str2 = strArr2[i3];
            C12826.requireNonNull(str2);
            if (!hashSet3.add(str2)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str2));
            }
        }
        f12977 = C21562.unmodifiableSet(hashSet3);
        String[] strArr3 = {"address", "article", "aside", "blockquote", "center", ErrorBundle.DETAIL_ENTRY, "dialog", "dir", "div", "dl", "dt", "dd", "fieldset", "figcaption", "figure", "footer", C0172c.f707c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "listing", "main", "menu", "nav", "ol", C0655am.f2322ax, "plaintext", "pre", "search", "section", ErrorBundle.SUMMARY_ENTRY, "table", "ul", "xmp"};
        HashSet hashSet4 = new HashSet(41);
        for (int i4 = 0; i4 < 41; i4++) {
            String str3 = strArr3[i4];
            C12826.requireNonNull(str3);
            if (!hashSet4.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        f12980 = C21562.unmodifiableSet(hashSet4);
        Object[] objArr2 = {"applet", "caption", "html", "table", "td", "th", "marquee", "object", "template"};
        HashSet hashSet5 = new HashSet(9);
        for (int i5 = 0; i5 < 9; i5++) {
            Object obj2 = objArr2[i5];
            C12826.requireNonNull(obj2);
            if (!hashSet5.add(obj2)) {
                throw new IllegalArgumentException(C7470.m17246(obj2, "duplicate element: "));
            }
        }
        f12978 = C21562.unmodifiableSet(hashSet5);
        String[] strArr4 = {"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", "body", "br", "button", "caption", "center", "col", "colgroup", "dd", ErrorBundle.DETAIL_ENTRY, "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer", C0172c.f707c, "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed", "noframes", "noscript", "object", "ol", C0655am.f2322ax, "param", "plaintext", "pre", "script", "search", "section", "select", "source", "style", ErrorBundle.SUMMARY_ENTRY, "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul", "wbr", "xmp"};
        HashSet hashSet6 = new HashSet(83);
        for (int i6 = 0; i6 < 83; i6++) {
            String str4 = strArr4[i6];
            C12826.requireNonNull(str4);
            if (!hashSet6.add(str4)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str4));
            }
        }
        f12976 = C21562.unmodifiableSet(hashSet6);
        Object[] objArr3 = {"td", "th"};
        HashSet hashSet7 = new HashSet(2);
        for (int i7 = 0; i7 < 2; i7++) {
            Object obj3 = objArr3[i7];
            C12826.requireNonNull(obj3);
            if (!hashSet7.add(obj3)) {
                throw new IllegalArgumentException(C7470.m17246(obj3, "duplicate element: "));
            }
        }
        f12979 = C21562.unmodifiableSet(hashSet7);
        Object[] objArr4 = {"thead", "tbody", "tfoot"};
        HashSet hashSet8 = new HashSet(3);
        for (int i8 = 0; i8 < 3; i8++) {
            Object obj4 = objArr4[i8];
            C12826.requireNonNull(obj4);
            if (!hashSet8.add(obj4)) {
                throw new IllegalArgumentException(C7470.m17246(obj4, "duplicate element: "));
            }
        }
        f12983 = C21562.unmodifiableSet(hashSet8);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C6783 m11957() {
        ArrayList arrayList = this.f12984;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (C6783) C20013.m45383(arrayList, 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m11960() {
        return this.f12984.size();
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0214  */
    /* JADX WARN: Code duplicated, block: B:144:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:150:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:153:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:156:0x02c1 A[LOOP:2: B:142:0x029d->B:156:0x02c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:159:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:207:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x02c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x02c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d2  */
    /* JADX INFO: renamed from: ֫ */
    public final C6783 m11959(String str, Map map, boolean z, Object obj) {
        int i;
        char c;
        int i2;
        boolean z2;
        char c2;
        char c3;
        char c4;
        boolean z3;
        char c5;
        String str2;
        boolean z4;
        char c6;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        int iDigit;
        C6783 c6783M11957 = m11957();
        if (c6783M11957 == null || (i = c6783M11957.f17563) == 0 || c6783M11957.f17560 || ((c6783M11957.f17562 && !str.equals("mglyph") && !str.equals("malignmark")) || (i == 2 && c6783M11957.f17564.equals("annotation-xml") && str.equals("svg")))) {
            i = 0;
        }
        if (i != 0 && (f12977.contains(str) || (str.equals("font") && (map.containsKey(ColorResourcesTableCreator.RESOURCE_TYPE_NAME_COLOR) || map.containsKey("face") || map.containsKey("size"))))) {
            m11956();
            i = 0;
        }
        if (i != 0) {
            c = 0;
            i2 = i;
        } else {
            if (f12980.contains(str)) {
                Object[] objArr = {C0655am.f2322ax};
                HashSet hashSet = new HashSet(1);
                Object obj2 = objArr[0];
                C12826.requireNonNull(obj2);
                if (!hashSet.add(obj2)) {
                    throw new IllegalArgumentException(C7470.m17246(obj2, "duplicate element: "));
                }
                m11955(0, C21562.unmodifiableSet(hashSet));
            }
            if (str.equals("li")) {
                HashSet hashSet2 = new HashSet(1);
                Object obj3 = new Object[]{"li"}[0];
                C12826.requireNonNull(obj3);
                if (!hashSet2.add(obj3)) {
                    throw new IllegalArgumentException(C7470.m17246(obj3, "duplicate element: "));
                }
                m11955(1, C21562.unmodifiableSet(hashSet2));
            } else if (str.equals("dt") || str.equals("dd")) {
                Object[] objArr2 = {"dt", "dd"};
                HashSet hashSet3 = new HashSet(2);
                for (int i6 = 0; i6 < 2; i6++) {
                    Object obj4 = objArr2[i6];
                    C12826.requireNonNull(obj4);
                    if (!hashSet3.add(obj4)) {
                        throw new IllegalArgumentException(C7470.m17246(obj4, "duplicate element: "));
                    }
                }
                m11955(1, C21562.unmodifiableSet(hashSet3));
            } else if (str.equals("tr")) {
                HashSet hashSet4 = new HashSet(1);
                Object obj5 = new Object[]{"tr"}[0];
                C12826.requireNonNull(obj5);
                if (!hashSet4.add(obj5)) {
                    throw new IllegalArgumentException(C7470.m17246(obj5, "duplicate element: "));
                }
                m11955(2, C21562.unmodifiableSet(hashSet4));
            } else {
                Set set = f12979;
                if (set.contains(str)) {
                    m11955(3, set);
                } else {
                    Set set2 = f12983;
                    if (set2.contains(str)) {
                        m11955(2, set2);
                    } else if (str.equals("option") || str.equals("optgroup")) {
                        HashSet hashSet5 = new HashSet(1);
                        Object obj6 = new Object[]{"option"}[0];
                        C12826.requireNonNull(obj6);
                        if (!hashSet5.add(obj6)) {
                            throw new IllegalArgumentException(C7470.m17246(obj6, "duplicate element: "));
                        }
                        m11955(4, C21562.unmodifiableSet(hashSet5));
                        if (str.equals("optgroup")) {
                            HashSet hashSet6 = new HashSet(1);
                            Object obj7 = new Object[]{"optgroup"}[0];
                            C12826.requireNonNull(obj7);
                            if (!hashSet6.add(obj7)) {
                                throw new IllegalArgumentException(C7470.m17246(obj7, "duplicate element: "));
                            }
                            m11955(4, C21562.unmodifiableSet(hashSet6));
                        }
                    }
                }
            }
            if (str.equals("svg")) {
                c = 0;
                i2 = 1;
            } else if (str.equals("math")) {
                c = 0;
                i2 = 2;
            } else {
                c = 0;
                i2 = i;
            }
        }
        C6783 c6783M11958 = m11957();
        if (i2 == 1) {
            Object[] objArr3 = new Object[3];
            objArr3[c] = "foreignobject";
            objArr3[1] = "desc";
            objArr3[2] = "title";
            HashSet hashSet7 = new HashSet(3);
            for (int i7 = 0; i7 < 3; i7++) {
                Object obj8 = objArr3[i7];
                C12826.requireNonNull(obj8);
                if (!hashSet7.add(obj8)) {
                    throw new IllegalArgumentException(C7470.m17246(obj8, "duplicate element: "));
                }
            }
            if (C21562.unmodifiableSet(hashSet7).contains(str)) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        char c7 = '&';
        if (i2 == 2 && str.equals("annotation-xml")) {
            String strM32637 = "";
            String str3 = (String) C15525.getOrDefault(map, "encoding", "");
            StringBuilder sb = new StringBuilder(str3.length());
            int i8 = 0;
            while (true) {
                if (i8 < str3.length()) {
                    if ((i8 & 1023) == 0) {
                        C22149.m49958();
                    }
                    char cCharAt2 = str3.charAt(i8);
                    if (cCharAt2 != c7) {
                        sb.append(cCharAt2);
                    } else if (str3.startsWith("&sol;", i8)) {
                        sb.append('/');
                        i8 += 4;
                    } else if (str3.startsWith("&plus;", i8)) {
                        sb.append('+');
                        i8 += 5;
                    } else {
                        if (str3.startsWith("&#", i8)) {
                            int i9 = i8 + 2;
                            if (i9 < str3.length()) {
                                c6 = 3;
                                if (str3.charAt(i9) == 'x' || str3.charAt(i9) == 'X') {
                                    i9 = i8 + 3;
                                    i3 = 16;
                                }
                                i4 = 0;
                                i5 = i9;
                                while (true) {
                                    if (i5 >= str3.length()) {
                                        if ((i5 & 1023) == 0) {
                                            C22149.m49958();
                                        }
                                        cCharAt = str3.charAt(i5);
                                        if (cCharAt <= 127) {
                                            iDigit = Character.digit(cCharAt, i3);
                                        } else {
                                            iDigit = -1;
                                        }
                                        if (iDigit < 0) {
                                            i4 = (i4 * i3) + iDigit;
                                            if (i4 > 127) {
                                                i5++;
                                            }
                                        }
                                        c3 = c6;
                                        c5 = 0;
                                    }
                                    if (i5 == i9) {
                                        c3 = c6;
                                        c5 = 0;
                                    } else {
                                        sb.append((char) i4);
                                        if (i5 < str3.length() && str3.charAt(i5) == ';') {
                                            i5++;
                                        }
                                        i8 = i5 - 1;
                                    }
                                }
                            } else {
                                c6 = 3;
                            }
                            i3 = 10;
                            i4 = 0;
                            i5 = i9;
                            while (true) {
                                if (i5 >= str3.length()) {
                                    if ((i5 & 1023) == 0) {
                                        C22149.m49958();
                                    }
                                    cCharAt = str3.charAt(i5);
                                    if (cCharAt <= 127) {
                                        iDigit = Character.digit(cCharAt, i3);
                                    } else {
                                        iDigit = -1;
                                    }
                                    if (iDigit < 0) {
                                        i4 = (i4 * i3) + iDigit;
                                        if (i4 > 127) {
                                            i5++;
                                        }
                                    }
                                    c3 = c6;
                                    c5 = 0;
                                }
                                if (i5 == i9) {
                                    c3 = c6;
                                    c5 = 0;
                                } else {
                                    sb.append((char) i4);
                                    if (i5 < str3.length()) {
                                        i5++;
                                    }
                                    i8 = i5 - 1;
                                }
                            }
                        } else {
                            c5 = 0;
                            c3 = 3;
                        }
                        c4 = 1;
                    }
                    i8++;
                    c7 = '&';
                } else {
                    c5 = 0;
                    c4 = 1;
                    strM32637 = AbstractC14159.m32637(sb.toString());
                    c3 = 3;
                }
                z3 = strM32637.equals("text/html") || strM32637.equals("application/xhtml+xml");
                c2 = 4;
            }
        } else {
            c2 = 4;
            c3 = 3;
            c4 = 1;
            z3 = z2;
            c5 = 0;
        }
        boolean z5 = (c6783M11958 != null && c6783M11958.f17565) || i2 != 0 || f12981.contains(str) || "preserve".equals(map.get("xml:space")) || ((str2 = (String) map.get("style")) != null && (str2.indexOf(92) >= 0 || str2.indexOf(38) >= 0 || AbstractC14159.m32637(str2).contains("white-space")));
        if (i2 == 2) {
            Object[] objArr4 = new Object[5];
            objArr4[c5] = "mi";
            objArr4[c4] = "mo";
            objArr4[2] = "mn";
            objArr4[c3] = "ms";
            objArr4[c2] = "mtext";
            HashSet hashSet8 = new HashSet(5);
            for (int i10 = 0; i10 < 5; i10++) {
                Object obj9 = objArr4[i10];
                C12826.requireNonNull(obj9);
                if (!hashSet8.add(obj9)) {
                    throw new IllegalArgumentException(C7470.m17246(obj9, "duplicate element: "));
                }
            }
            if (C21562.unmodifiableSet(hashSet8).contains(str)) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        ArrayList arrayList = this.f12984;
        C6783 c6783 = new C6783(str, i2, z3, z4, z5, c6783M11958, arrayList.size(), obj);
        if (i2 != 0 ? z : f12982.contains(str)) {
            return c6783;
        }
        if (arrayList.size() >= 512) {
            throw new IllegalArgumentException("Source nesting exceeds formatter limit");
        }
        arrayList.add(c6783);
        return c6783;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX INFO: renamed from: ֫ */
    public final C6783 m11958(String str) {
        boolean z;
        char c;
        char c2;
        C6783 c6783M11957 = m11957();
        ArrayList arrayList = this.f12984;
        char c3 = 1;
        if (c6783M11957 != null && c6783M11957.f17563 != 0) {
            if (str.equals(C0655am.f2322ax) || str.equals("br")) {
                m11956();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C6783 c6783 = (C6783) arrayList.get(size);
                    if (c6783.f17563 == 0) {
                        break;
                    }
                    if (c6783.f17564.equals(str)) {
                        return m11954(size);
                    }
                }
            }
        }
        char c4 = 0;
        boolean z2 = str.equals("table") || str.equals("tr") || f12979.contains(str) || f12983.contains(str);
        int i = 3;
        if (z2 || f12980.contains(str)) {
            z = true;
        } else {
            Object[] objArr = {"button", "applet", "object", "marquee", "template"};
            HashSet hashSet = new HashSet(5);
            for (int i2 = 0; i2 < 5; i2++) {
                Object obj = objArr[i2];
                C12826.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
                }
            }
            if (C21562.unmodifiableSet(hashSet).contains(str)) {
                z = true;
            } else {
                z = false;
            }
        }
        int size2 = arrayList.size() - 1;
        while (size2 >= 0) {
            C6783 c6784 = (C6783) arrayList.get(size2);
            int i3 = c6784.f17563;
            String str2 = c6784.f17564;
            if (i3 == 0 && str2.equals(str)) {
                return m11954(size2);
            }
            if (c6784.f17563 != 0) {
                if (c6784.f17560 || c6784.f17562) {
                    return null;
                }
            } else if (z) {
                if (z2) {
                    Object[] objArr2 = new Object[i];
                    objArr2[c4] = "html";
                    objArr2[c3] = "table";
                    objArr2[2] = "template";
                    HashSet hashSet2 = new HashSet(i);
                    int i4 = 0;
                    c = 1;
                    while (true) {
                        c2 = 0;
                        if (i4 >= i) {
                            if (!C21562.unmodifiableSet(hashSet2).contains(str2)) {
                                break;
                            }
                            return null;
                        }
                        Object obj2 = objArr2[i4];
                        C12826.requireNonNull(obj2);
                        if (!hashSet2.add(obj2)) {
                            throw new IllegalArgumentException(C7470.m17246(obj2, "duplicate element: "));
                        }
                        i4++;
                        i = 3;
                    }
                } else {
                    c = 1;
                    c2 = 0;
                    if (f12978.contains(str2)) {
                        return null;
                    }
                }
                if (str.equals("li")) {
                    Object[] objArr3 = new Object[2];
                    objArr3[c2] = "ul";
                    objArr3[c] = "ol";
                    HashSet hashSet3 = new HashSet(2);
                    for (int i5 = 0; i5 < 2; i5++) {
                        Object obj3 = objArr3[i5];
                        C12826.requireNonNull(obj3);
                        if (!hashSet3.add(obj3)) {
                            throw new IllegalArgumentException(C7470.m17246(obj3, "duplicate element: "));
                        }
                    }
                    if (C21562.unmodifiableSet(hashSet3).contains(str2)) {
                        return null;
                    }
                } else {
                    continue;
                }
            } else if (f12976.contains(str2)) {
                return null;
            }
            size2--;
            c3 = 1;
            c4 = 0;
            i = 3;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX INFO: renamed from: ֫ */
    private void m11955(int i, Set set) {
        ArrayList arrayList = this.f12984;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C6783 c6783 = (C6783) arrayList.get(size);
            if (c6783.f17563 != 0) {
                return;
            }
            String str = c6783.f17564;
            if (set.contains(str)) {
                m11954(size);
                return;
            }
            boolean zContains = false;
            zContains = false;
            zContains = false;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        Object[] objArr = {"html", "table", "template"};
                        HashSet hashSet = new HashSet(3);
                        for (int i2 = 0; i2 < 3; i2++) {
                            Object obj = objArr[i2];
                            C12826.requireNonNull(obj);
                            if (!hashSet.add(obj)) {
                                throw new IllegalArgumentException(C7470.m17246(obj, "duplicate element: "));
                            }
                        }
                        zContains = C21562.unmodifiableSet(hashSet).contains(str);
                    } else if (i != 3) {
                        Object[] objArr2 = {"html", "select", "datalist", "template", "optgroup"};
                        HashSet hashSet2 = new HashSet(5);
                        for (int i3 = 0; i3 < 5; i3++) {
                            Object obj2 = objArr2[i3];
                            C12826.requireNonNull(obj2);
                            if (!hashSet2.add(obj2)) {
                                throw new IllegalArgumentException(C7470.m17246(obj2, "duplicate element: "));
                            }
                        }
                        zContains = C21562.unmodifiableSet(hashSet2).contains(str);
                    } else {
                        Object[] objArr3 = {"html", "table", "template", "tr"};
                        HashSet hashSet3 = new HashSet(4);
                        for (int i4 = 0; i4 < 4; i4++) {
                            Object obj3 = objArr3[i4];
                            C12826.requireNonNull(obj3);
                            if (!hashSet3.add(obj3)) {
                                throw new IllegalArgumentException(C7470.m17246(obj3, "duplicate element: "));
                            }
                        }
                        zContains = C21562.unmodifiableSet(hashSet3).contains(str);
                    }
                } else if (f12976.contains(str)) {
                    Object[] objArr4 = {"address", "div", C0655am.f2322ax};
                    HashSet hashSet4 = new HashSet(3);
                    for (int i5 = 0; i5 < 3; i5++) {
                        Object obj4 = objArr4[i5];
                        C12826.requireNonNull(obj4);
                        if (!hashSet4.add(obj4)) {
                            throw new IllegalArgumentException(C7470.m17246(obj4, "duplicate element: "));
                        }
                    }
                    if (!C21562.unmodifiableSet(hashSet4).contains(str)) {
                        zContains = true;
                    }
                }
            } else if (f12978.contains(str) || str.equals("button")) {
                zContains = true;
            }
            if (zContains) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C6783 m11954(int i) {
        ArrayList arrayList = this.f12984;
        C6783 c6783 = (C6783) arrayList.get(i);
        arrayList.subList(i, arrayList.size()).clear();
        return c6783;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m11956() {
        while (m11957() != null) {
            C6783 c6783M11957 = m11957();
            if (c6783M11957.f17563 == 0 || c6783M11957.f17560 || c6783M11957.f17562) {
                return;
            } else {
                C19925.m45229(this.f12984, 1);
            }
        }
    }
}
