package l;

import android.content.res.AssetManager;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.umeng.analytics.pro.am;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.i18n.ErrorBundle;

/* JADX INFO: renamed from: l.ۧܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6LD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11059 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final List f33234;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.۫ܿܳ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.۬ܿܳ] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27445(C13963 c13963, String str, boolean z, AssetManager assetManager, BufferedWriter bufferedWriter, String str2) throws IOException {
        String str3;
        HashMap map;
        C19814 c19814M12729;
        String str4;
        int iM27443;
        String strM33414 = c13963.m33414();
        List<InterfaceC2707> list = f33234;
        if (strM33414.length() > 1000000) {
            throw new C1886();
        }
        try {
            final C4792 c4792 = new C4792(strM33414.length());
            C13602 c13602 = new C13602();
            c13602.m32711(list);
            c13602.m32716(new C15374(strM33414));
            c13602.m32715(c4792);
            c13602.m32714((C13258) new InterfaceC22775() { // from class: l.۬ܿܳ
                @Override // l.InterfaceC22775
                /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
                public final InterfaceC11487 mo32166(C4844 c4844) {
                    c4792.m13978(c4844);
                    return new C11848(c4844);
                }
            });
            c13602.m32713(EnumC5842.BLOCKS_AND_INLINES);
            AbstractC0197 abstractC0197M5145 = c13602.m32710().m5145(strM33414);
            int i = 0;
            AbstractC0197 abstractC0197M1341 = abstractC0197M5145;
            while (abstractC0197M1341 != null) {
                i++;
                if (i > 100000) {
                    throw new C1886();
                }
                if (abstractC0197M1341.m1341() != null) {
                    abstractC0197M1341 = abstractC0197M1341.m1341();
                } else {
                    while (abstractC0197M1341 != abstractC0197M5145 && abstractC0197M1341.m1352() == null) {
                        abstractC0197M1341 = abstractC0197M1341.mo1355();
                    }
                    abstractC0197M1341 = abstractC0197M1341 == abstractC0197M5145 ? null : abstractC0197M1341.m1352();
                }
            }
            final String str5 = "data-mt-" + UUID.randomUUID();
            final String strM37867 = C16014.m37867(str5, "-kind");
            final HashMap map2 = new HashMap();
            final StringBuilder sb = new StringBuilder();
            final TreeMap treeMap = new TreeMap();
            C12773 c12773 = new C12773();
            for (InterfaceC2707 interfaceC2707 : list) {
                if (interfaceC2707 instanceof InterfaceC12068) {
                    ((InterfaceC12068) interfaceC2707).mo6576(c12773);
                }
            }
            c12773.m31085();
            c12773.m31084((C12553) new InterfaceC7834() { // from class: l.۫ܿܳ
                /* JADX WARN: Type inference failed for: r0v0, types: [l.ۛܿܳ] */
                @Override // l.InterfaceC7834
                public final C6203 create() {
                    final String str6 = strM37867;
                    final String str7 = str5;
                    final HashMap map3 = map2;
                    return new InterfaceC0778() { // from class: l.ۛܿܳ
                        @Override // l.InterfaceC0778
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo2959(AbstractC0197 abstractC0197, String str8, LinkedHashMap linkedHashMap) {
                            if (abstractC0197 instanceof C14308) {
                                C14308 c14308 = (C14308) abstractC0197;
                                if ("pre".equals(str8)) {
                                    String str9 = c14308.m34142().trim().split("\\s+", 2)[0];
                                    if (str9.equals("math") || str9.equals("mermaid")) {
                                        linkedHashMap.put(str6, str9);
                                    }
                                }
                            }
                            if ((!(abstractC0197 instanceof AbstractC11342) && !(abstractC0197 instanceof AbstractC10782)) || (abstractC0197 instanceof C20315) || abstractC0197.m1351().isEmpty()) {
                                return;
                            }
                            List listM1351 = abstractC0197.m1351();
                            int iM46028 = ((C19954) listM1351.get(0)).m46028();
                            int iM46029 = ((C19954) C7166.m19188(1, listM1351)).m46028();
                            linkedHashMap.put(str7, iM46028 + ":" + iM46029);
                            if ("pre".equals(str8)) {
                                boolean z2 = abstractC0197 instanceof C14308;
                                if (z2 || (abstractC0197 instanceof C15719)) {
                                    map3.put(iM46028 + ":" + iM46029, Integer.toString(iM46028 + (z2 ? 1 : 0)));
                                }
                            }
                        }
                    };
                }
            });
            c12773.m31083(new InterfaceC4307() { // from class: l.ۤܿܳ
                @Override // l.InterfaceC4307
                /* JADX INFO: renamed from: ֫ */
                public final InterfaceC5012 mo8836(InterfaceC19830 interfaceC19830) {
                    return new C23136(strM37867, interfaceC19830, treeMap, sb);
                }
            });
            c12773.m31082().m16156(abstractC0197M5145, sb);
            C0762 c0762M2906 = C0762.m2906("https://markdown.invalid/");
            C10662 c10662 = new C10662(new C17136());
            c10662.m26765();
            c0762M2906.m2917().m45562(0, c10662.m26757(sb.toString(), c0762M2906.m2917(), c0762M2906.mo25050()));
            for (C19814 c19814 : C11779.m28821(new C11263(), c0762M2906)) {
                if (!c19814.mo25052(str5) && (iM27443 = m27443(treeMap, c19814.m28100().m5480().m19131())) >= 0) {
                    int iM27444 = m27443(treeMap, c19814.m45578().m5477().m19131() - 1);
                    if (iM27444 < iM27443) {
                        iM27444 = m27443(treeMap, c19814.m28100().m5477().m19131() - 1);
                    }
                    c19814.mo20901(str5, iM27443 + ":" + Math.max(iM27443, iM27444));
                }
            }
            C12484 c12484 = new C12484();
            c12484.m30644(am.av, "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", am.aC, "img", "li", "ol", am.ax, "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", am.aH, "ul");
            c12484.m30643(am.av, "href", "title");
            c12484.m30643("blockquote", "cite");
            c12484.m30643("col", "span", "width");
            c12484.m30643("colgroup", "span", "width");
            c12484.m30643("img", "align", "alt", "height", "src", "title", "width");
            c12484.m30643("ol", "start", "type");
            c12484.m30643("q", "cite");
            c12484.m30643("table", ErrorBundle.SUMMARY_ENTRY, "width");
            String str6 = "span";
            HashMap map3 = map2;
            c12484.m30643("td", "abbr", "axis", "colspan", "rowspan", "width");
            c12484.m30643("th", "abbr", "axis", "colspan", "rowspan", "scope", "width");
            c12484.m30643("ul", "type");
            c12484.m30642(am.av, "href", "ftp", a.s, b.a, "mailto");
            c12484.m30642("blockquote", "cite", a.s, b.a);
            c12484.m30642("cite", "cite", a.s, b.a);
            c12484.m30642("img", "src", a.s, b.a);
            c12484.m30642("q", "cite", a.s, b.a);
            c12484.m30644("div", "span", "del", am.aB, "hr", ErrorBundle.DETAIL_ENTRY, ErrorBundle.SUMMARY_ENTRY, "input");
            c12484.m30643(":all", str5, strM37867);
            c12484.m30643(ErrorBundle.DETAIL_ENTRY, "open");
            c12484.m30643("th", "align");
            c12484.m30643("td", "align");
            c12484.m30643("input", "checked");
            c12484.m30641("type", "checkbox");
            c12484.m30641("disabled", "disabled");
            c12484.m30642(am.av, "href", "#");
            c12484.m30640();
            C0762 c0762M48916 = new C21657(c12484).m48916(c0762M2906);
            c0762M48916.m2907().m978();
            for (C19814 c19815 : c0762M48916.m45575("th[align],td[align]")) {
                String lowerCase = c19815.mo25048("align").toLowerCase(Locale.ROOT);
                if (lowerCase.equals("left") || lowerCase.equals("center") || lowerCase.equals("right")) {
                    c19815.mo20901("align", lowerCase);
                } else {
                    c19815.m45590("align");
                }
            }
            C16990.m39823(strM37867);
            for (C19814 c19816 : C11779.m28821(new C16906(strM37867.trim()), c0762M48916)) {
                String strMo25048 = c19816.mo25048(strM37867);
                c19816.m45590(strM37867);
                c19816.mo20901("data-mt-render", strMo25048);
                String strM45568 = c19816.m45568();
                c19816.m45581();
                c19816.mo2916(strM45568);
                c19816.m45573(strMo25048.equals("inline-math") ? str6 : "div");
                c19816.m45582("mt-".concat(strMo25048));
            }
            C16990.m39823(str5);
            for (C19814 c19817 : C11779.m28821(new C16906(str5.trim()), c0762M48916)) {
                String strMo25049 = c19817.mo25048(str5);
                int iIndexOf = strMo25049.indexOf(58);
                c19817.m45590(str5);
                c19817.mo20901("data-source-start", strMo25049.substring(0, iIndexOf));
                c19817.mo20901("data-source-end", strMo25049.substring(iIndexOf + 1));
                if (c19817.m45588().equals("pre")) {
                    map = map3;
                    if (map.containsKey(strMo25049) && (c19814M12729 = C4228.m12729("code", c19817)) != null) {
                        String strM45569 = c19814M12729.m45568();
                        c19814M12729.m45581();
                        int i2 = Integer.parseInt((String) map.get(strMo25049));
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 <= strM45569.length()) {
                            if (i3 >= strM45569.length() || strM45569.charAt(i3) == '\n') {
                                if (i3 > i4 || i3 < strM45569.length()) {
                                    str4 = str6;
                                    C19814 c19814M45592 = c19814M12729.m45592(str4);
                                    c19814M45592.mo20901("data-source-start", Integer.toString(i2));
                                    c19814M45592.mo20901("data-source-end", Integer.toString(i2));
                                    c19814M45592.mo2916(strM45569.substring(i4, i3));
                                } else {
                                    str4 = str6;
                                }
                                if (i3 < strM45569.length()) {
                                    c19814M12729.m45584(new C10787("\n"));
                                }
                                i4 = i3 + 1;
                                i2++;
                            } else {
                                str4 = str6;
                            }
                            i3++;
                            str6 = str4;
                        }
                    }
                    str3 = str6;
                } else {
                    str3 = str6;
                    map = map3;
                }
                map3 = map;
                str6 = str3;
            }
            HashSet hashSet = new HashSet();
            for (C19814 c19818 : c0762M48916.m45575("input")) {
                C19814 c19814Mo28099 = c19818.mo28099();
                if (c19814Mo28099 != null && c19814Mo28099.m45588().equals(am.ax)) {
                    c19814Mo28099 = c19814Mo28099.mo28099();
                }
                if (c19814Mo28099 != null && c19814Mo28099.m45588().equals("li")) {
                    c19814Mo28099.m45582("task-list-item");
                    c19818.m45582("task-list-item-checkbox");
                }
            }
            for (C19814 c19819 : c0762M48916.m45575("h1,h2,h3,h4,h5,h6")) {
                String lowerCase2 = c19819.m45576().toLowerCase(Locale.ROOT);
                StringBuilder sb2 = new StringBuilder();
                int iCharCount = 0;
                while (iCharCount < lowerCase2.length()) {
                    int iCodePointAt = lowerCase2.codePointAt(iCharCount);
                    iCharCount += Character.charCount(iCodePointAt);
                    if (Character.isLetterOrDigit(iCodePointAt) || iCodePointAt == 95 || iCodePointAt == 45) {
                        sb2.appendCodePoint(iCodePointAt);
                    } else if (Character.isWhitespace(iCodePointAt)) {
                        sb2.append('-');
                    }
                }
                String string = sb2.length() == 0 ? "section" : sb2.toString();
                int i5 = 1;
                String str7 = string;
                while (!hashSet.add(str7)) {
                    str7 = string + "-" + i5;
                    i5++;
                }
                C16990.m39822((Object) str7);
                c19819.mo20901("id", str7);
            }
            boolean zIsEmpty = c0762M48916.m45575("[data-mt-render]").isEmpty();
            String string2 = UUID.randomUUID().toString();
            StringBuilder sb3 = new StringBuilder("<!doctype html><html data-theme=\"");
            sb3.append(z ? "dark" : "light");
            sb3.append("\"><head><meta charset=\"utf-8\"><title>");
            C19814 c198110 = new C19814("title");
            c198110.mo2916(str);
            sb3.append(c198110.m45580());
            ASN1BMPString$$ExternalSyntheticOutline0.m(sb3, "</title><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none'; img-src https: http: data:; font-src https://cdn.bootcdn.net/ajax/libs/KaTeX/0.16.47/fonts/; style-src 'self' 'unsafe-inline'; script-src 'unsafe-inline' 'nonce-", string2, "'; base-uri 'none'; form-action 'none'\"><style nonce=\"", string2);
            sb3.append("\">");
            bufferedWriter.write(sb3.toString());
            String[] strArr = {"light", "dark"};
            for (int i6 = 0; i6 < 2; i6++) {
                String str8 = strArr[i6];
                bufferedWriter.write(m27444(assetManager, C4860.m14172("github-markdown-", str8, ".css")).replace(".markdown-body", "html[data-theme=\"" + str8 + "\"] .markdown-body"));
            }
            bufferedWriter.write(m27444(assetManager, "preview.css"));
            C19814 c198111 = new C19814("article");
            c198111.m45582("markdown-body");
            c198111.mo20901("data-render-error", str2);
            bufferedWriter.write("</style></head><body><article" + c198111.mo25045().m36737() + ">");
            c0762M48916.m2917().m45563(bufferedWriter);
            bufferedWriter.write("</article><script nonce=\"" + string2 + "\">");
            bufferedWriter.write(m27444(assetManager, "preview.js"));
            bufferedWriter.write("</script>");
            if (!zIsEmpty) {
                bufferedWriter.write("<script nonce=\"" + string2 + "\">");
                bufferedWriter.write(m27444(assetManager, "enhance.js"));
                bufferedWriter.write("</script>");
            }
            bufferedWriter.write("</body></html>");
        } catch (C7614 unused) {
            throw new C1886();
        }
    }

    static {
        int iM23073 = 0;
        Object[] objArr = {new C3412(), new C19641(), new C2022()};
        ArrayList arrayList = new ArrayList(3);
        while (iM23073 < 3) {
            Object obj = objArr[iM23073];
            iM23073 = C8954.m23073(obj, arrayList, obj, iM23073, 1);
        }
        f33234 = C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m27444(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open("markdown-preview/" + str);
        try {
            String strM49848 = C22194.m49848(inputStreamOpen, StandardCharsets.UTF_8);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return strM49848;
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m27443(TreeMap treeMap, int i) {
        Map.Entry entryFloorEntry = treeMap.floorEntry(Integer.valueOf(i));
        if (entryFloorEntry == null) {
            return -1;
        }
        return ((Integer) entryFloorEntry.getValue()).intValue();
    }
}
