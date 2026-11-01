package p067l;

import com.alipay.sdk.p010m.p037n.C0172c;
import com.umeng.analytics.pro.C0655am;
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
public final class C14174 extends AbstractC5457 {

    /* JADX INFO: renamed from: ۜ */
    public static final Set f40418 = C21562.unmodifiableSet(new HashSet(Arrays.asList(C0655am.f2320av, "abbr", "acronym", "b", "bdo", "big", "br", "button", "cite", "code", "dfn", "em", C0655am.f2275aC, "img", "input", "kbd", AnnotatedPrivateKey.LABEL, "map", "object", "q", "samp", "script", "select", "small", "span", "strong", "sub", "sup", "textarea", "time", "tt", "var")));

    /* JADX INFO: renamed from: ᩷ */
    public static final Set f40419 = C21562.unmodifiableSet(new HashSet(Arrays.asList("area", "base", "br", "col", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr")));

    /* JADX INFO: renamed from: ᩻ */
    public static final Set f40420 = C21562.unmodifiableSet(new HashSet(Arrays.asList("address", "article", "aside", "blockquote", "canvas", "dd", "div", "dl", "dt", "fieldset", "figcaption", "figure", "footer", C0172c.f707c, "h1", "h2", "h3", "h4", "h5", "h6", "header", "hgroup", "hr", "li", "main", "nav", "noscript", "ol", "output", C0655am.f2322ax, "pre", "section", "table", "tfoot", "ul", "video")));

    /* JADX INFO: renamed from: ۧ */
    public final C20210 f40422;

    /* JADX INFO: renamed from: ܳ */
    public final C4097 f40423;

    /* JADX INFO: renamed from: ܿ */
    public boolean f40425;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f40426;

    /* JADX INFO: renamed from: ܽ */
    public final ArrayList f40424 = new ArrayList(0);

    /* JADX INFO: renamed from: ֫ */
    public C22892 f40421 = new C22892("", 0, Collections.EMPTY_MAP, null);

    public C14174(C20210 c20210, C4097 c4097) {
        this.f40422 = c20210;
        this.f40423 = c4097;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32653(C19304 c19304, String str) {
        C23562 c23562;
        int length;
        C16836 c16836 = new C16836(new C8791(str), new C11474(0));
        while (true) {
            AbstractC10132 abstractC10132M38192 = c16836.m38192();
            EnumC3426 enumC3426 = abstractC10132M38192.f28080;
            if (EnumC3426.EOF == enumC3426) {
                return;
            }
            int i = C14844.f42327[enumC3426.ordinal()];
            C20210 c20210 = this.f40422;
            Set set = f40420;
            ArrayList arrayList = this.f40424;
            Set set2 = f40418;
            boolean z = true;
            if (i == 1) {
                C2755 c2755 = (C2755) abstractC10132M38192;
                boolean zContains = set2.contains(c2755.f19508);
                Set set3 = f40419;
                if (zContains) {
                    String str2 = c2755.f19508;
                    C23562 c23563 = new C23562(m32650(c2755), c19304.length(), str2);
                    if (this.f40425) {
                        int length2 = c19304.length();
                        if (length2 > 0 && '\n' != c19304.charAt(length2 - 1)) {
                            AbstractC22222.m50051(c19304, '\n');
                        }
                        this.f40425 = false;
                    }
                    if (set3.contains(str2) || c2755.f19510) {
                        c20210.getClass();
                        String strM45702 = C20210.m45702(c23563);
                        if (strM45702 != null && strM45702.length() > 0) {
                            try {
                                c19304.append((CharSequence) strM45702);
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        int length3 = c19304.length();
                        if (!c23563.isClosed()) {
                            c23563.f67968 = length3;
                        }
                    }
                    arrayList.add(c23563);
                } else {
                    String str3 = c2755.f19508;
                    if (C0655am.f2322ax.equals(this.f40421.f67969)) {
                        this.f40421.m51121(c19304.length());
                        AbstractC22222.m50051(c19304, '\n');
                        this.f40421 = this.f40421.f72048;
                    } else if ("li".equals(str3) && "li".equals(this.f40421.f67969)) {
                        this.f40421.m51121(c19304.length());
                        this.f40421 = this.f40421.f72048;
                    }
                    if (set.contains(str3)) {
                        this.f40426 = "pre".equals(str3);
                        int length4 = c19304.length();
                        if (length4 > 0 && '\n' != c19304.charAt(length4 - 1)) {
                            AbstractC22222.m50051(c19304, '\n');
                        }
                    } else if (this.f40425) {
                        int length5 = c19304.length();
                        if (length5 > 0 && '\n' != c19304.charAt(length5 - 1)) {
                            AbstractC22222.m50051(c19304, '\n');
                        }
                        this.f40425 = false;
                    }
                    int length6 = c19304.length();
                    Map mapM32650 = m32650(c2755);
                    C22892 c22892 = this.f40421;
                    C22892 c22893 = new C22892(str3, length6, mapM32650, c22892);
                    if (!set3.contains(str3) && !c2755.f19510) {
                        z = false;
                    }
                    if (z) {
                        c20210.getClass();
                        String strM45703 = C20210.m45702(c22893);
                        if (strM45703 != null && strM45703.length() > 0) {
                            try {
                                c19304.append((CharSequence) strM45703);
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                        c22893.m51121(c19304.length());
                    }
                    ArrayList arrayList2 = c22892.f72049;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(2);
                        c22892.f72049 = arrayList2;
                    }
                    arrayList2.add(c22893);
                    if (!z) {
                        this.f40421 = c22893;
                    }
                }
            } else if (i == 2) {
                C20862 c20862 = (C20862) abstractC10132M38192;
                if (set2.contains(c20862.f19508)) {
                    String str4 = c20862.f19508;
                    int size = arrayList.size() - 1;
                    while (true) {
                        if (size <= -1) {
                            c23562 = null;
                            break;
                        }
                        c23562 = (C23562) arrayList.get(size);
                        if (str4.equals(c23562.f67969) && c23562.f67968 < 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    if (c23562 == null) {
                        continue;
                    } else {
                        if (c23562.f67970 == c19304.length()) {
                            c20210.getClass();
                            CharSequence charSequenceM45702 = C20210.m45702(c23562);
                            if (charSequenceM45702 != null) {
                                try {
                                    c19304.append(charSequenceM45702);
                                } catch (IOException e3) {
                                    throw new RuntimeException(e3);
                                }
                            }
                        }
                        int length7 = c19304.length();
                        if (!c23562.isClosed()) {
                            c23562.f67968 = length7;
                        }
                    }
                } else {
                    String str5 = c20862.f19508;
                    C22892 c22894 = this.f40421;
                    while (c22894 != null && !str5.equals(c22894.f67969) && !c22894.isClosed()) {
                        c22894 = c22894.f72048;
                    }
                    if (c22894 != null) {
                        int i2 = c22894.f67970;
                        if ("pre".equals(str5)) {
                            this.f40426 = false;
                        }
                        if (i2 == c19304.length()) {
                            c20210.getClass();
                            CharSequence charSequenceM45703 = C20210.m45702(c22894);
                            if (charSequenceM45703 != null) {
                                try {
                                    c19304.append(charSequenceM45703);
                                } catch (IOException e4) {
                                    throw new RuntimeException(e4);
                                }
                            }
                        }
                        c22894.m51121(c19304.length());
                        if (i2 != c22894.f67968) {
                            this.f40425 = set.contains(c22894.f67969);
                        }
                        if (C0655am.f2322ax.equals(str5)) {
                            AbstractC22222.m50051(c19304, '\n');
                        }
                        this.f40421 = c22894.f72048;
                    } else {
                        continue;
                    }
                }
            } else if (i != 3) {
                continue;
            } else {
                C17507 c17507 = (C17507) abstractC10132M38192;
                if (this.f40426) {
                    try {
                        c19304.append(c17507.m39883());
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                } else {
                    if (this.f40425) {
                        int length8 = c19304.length();
                        if (length8 > 0 && '\n' != c19304.charAt(length8 - 1)) {
                            AbstractC22222.m50051(c19304, '\n');
                        }
                        this.f40425 = false;
                    }
                    String strM39883 = c17507.m39883();
                    this.f40423.getClass();
                    int length9 = c19304.length();
                    int length10 = strM39883.length();
                    boolean z2 = false;
                    for (int i3 = 0; i3 < length10; i3++) {
                        char cCharAt = strM39883.charAt(i3);
                        if (Character.isWhitespace(cCharAt)) {
                            z2 = true;
                        } else {
                            if (z2 && (length = c19304.length()) > 0 && !Character.isWhitespace(c19304.charAt(length - 1))) {
                                AbstractC22222.m50051(c19304, ' ');
                            }
                            AbstractC22222.m50051(c19304, cCharAt);
                            z2 = false;
                        }
                    }
                    if (z2 && length9 < c19304.length()) {
                        AbstractC22222.m50051(c19304, ' ');
                    }
                }
            }
            abstractC10132M38192.mo4316();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m32654(InterfaceC6798 interfaceC6798) {
        ArrayList arrayList = this.f40424;
        if (arrayList.size() > 0) {
            ((C12163) interfaceC6798).m28085(C21562.unmodifiableList(arrayList));
            arrayList.clear();
        } else {
            ((C12163) interfaceC6798).m28085(Collections.EMPTY_LIST);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32652(InterfaceC6798 interfaceC6798) {
        C22892 c22892 = this.f40421;
        while (true) {
            C22892 c22893 = c22892.f72048;
            if (c22893 == null) {
                break;
            } else {
                c22892 = c22893;
            }
        }
        List listMo6113 = c22892.mo6113();
        if (listMo6113.size() > 0) {
            ((C8139) interfaceC6798).m18856(listMo6113);
        } else {
            ((C8139) interfaceC6798).m18856(Collections.EMPTY_LIST);
        }
        this.f40421 = new C22892("", 0, Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m32651() {
        this.f40424.clear();
        this.f40421 = new C22892("", 0, Collections.EMPTY_MAP, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Map m32650(C2755 c2755) {
        C16166<C19520> c16166 = c2755.f19505;
        int size = c16166.size();
        if (size > 0) {
            HashMap map = new HashMap(size);
            for (C19520 c19520 : c16166) {
                map.put(c19520.getKey().toLowerCase(Locale.US), c19520.getValue());
            }
            return C21562.unmodifiableMap(map);
        }
        return Collections.EMPTY_MAP;
    }
}
