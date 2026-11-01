package p067l;

import android.content.res.AssetManager;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.umeng.analytics.pro.C0655am;
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
public final class C12879 {

    /* JADX INFO: renamed from: ֫ */
    public static final List f36235;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [l.۫ܿܳ] */
    /* JADX WARN: Type inference failed for: r6v1, types: [l.۬ܿܳ] */
    /* JADX INFO: renamed from: ֫ */
    public static void m29507(C15639 c15639, String str, boolean z, AssetManager assetManager, BufferedWriter bufferedWriter, String str2) throws IOException {
        String str3;
        HashMap map;
        C21199 c21199M14605;
        String str4;
        int iM29505;
        String strM35534 = c15639.m35534();
        List<InterfaceC4941> list = f36235;
        if (strM35534.length() > 1000000) {
            throw new C4161();
        }
        try {
            final C6923 c6923 = new C6923(strM35534.length());
            C15295 c15295 = new C15295();
            c15295.m34823(list);
            c15295.m34828(new C16980(strM35534));
            c15295.m34827(c6923);
            c15295.m34826((C14969) new InterfaceC24013() { // from class: l.۬ܿܳ
                @Override // p067l.InterfaceC24013
                /* JADX INFO: renamed from: ֫ */
                public final InterfaceC13285 mo34265(C6972 c6972) {
                    c6923.m15858(c6972);
                    return new C13629(c6972);
                }
            });
            c15295.m34825(EnumC7920.BLOCKS_AND_INLINES);
            AbstractC2555 abstractC2555M7387 = c15295.m34822().m7387(strM35534);
            int i = 0;
            AbstractC2555 abstractC2555M3754 = abstractC2555M7387;
            while (abstractC2555M3754 != null) {
                i++;
                if (i > 100000) {
                    throw new C4161();
                }
                if (abstractC2555M3754.m3754() != null) {
                    abstractC2555M3754 = abstractC2555M3754.m3754();
                } else {
                    while (abstractC2555M3754 != abstractC2555M7387 && abstractC2555M3754.m3765() == null) {
                        abstractC2555M3754 = abstractC2555M3754.mo3768();
                    }
                    abstractC2555M3754 = abstractC2555M3754 == abstractC2555M7387 ? null : abstractC2555M3754.m3765();
                }
            }
            final String str5 = "data-mt-" + UUID.randomUUID();
            final String strM40053 = C17588.m40053(str5, "-kind");
            final HashMap map2 = new HashMap();
            final StringBuilder sb = new StringBuilder();
            final TreeMap treeMap = new TreeMap();
            C14507 c14507 = new C14507();
            for (InterfaceC4941 interfaceC4941 : list) {
                if (interfaceC4941 instanceof InterfaceC13837) {
                    ((InterfaceC13837) interfaceC4941).mo8702(c14507);
                }
            }
            c14507.m33169();
            c14507.m33168((C14299) new InterfaceC9813() { // from class: l.۫ܿܳ
                /* JADX WARN: Type inference failed for: r0v0, types: [l.ۛܿܳ] */
                @Override // p067l.InterfaceC9813
                public final C8264 create() {
                    final String str6 = strM40053;
                    final String str7 = str5;
                    final HashMap map3 = map2;
                    return new InterfaceC3107() { // from class: l.ۛܿܳ
                        @Override // p067l.InterfaceC3107
                        /* JADX INFO: renamed from: ֫ */
                        public final void mo5288(AbstractC2555 abstractC2555, String str8, LinkedHashMap linkedHashMap) {
                            if (abstractC2555 instanceof C15966) {
                                C15966 c15966 = (C15966) abstractC2555;
                                if ("pre".equals(str8)) {
                                    String str9 = c15966.m36275().trim().split("\\s+", 2)[0];
                                    if (str9.equals("math") || str9.equals("mermaid")) {
                                        linkedHashMap.put(str6, str9);
                                    }
                                }
                            }
                            if ((!(abstractC2555 instanceof AbstractC13147) && !(abstractC2555 instanceof AbstractC12615)) || (abstractC2555 instanceof C21676) || abstractC2555.m3764().isEmpty()) {
                                return;
                            }
                            List listM3764 = abstractC2555.m3764();
                            int iM48342 = ((C21332) listM3764.get(0)).m48342();
                            int iM48343 = ((C21332) C9179.m21131(1, listM3764)).m48342();
                            linkedHashMap.put(str7, iM48342 + ":" + iM48343);
                            if ("pre".equals(str8)) {
                                boolean z2 = abstractC2555 instanceof C15966;
                                if (z2 || (abstractC2555 instanceof C17307)) {
                                    map3.put(iM48342 + ":" + iM48343, Integer.toString(iM48342 + (z2 ? 1 : 0)));
                                }
                            }
                        }
                    };
                }
            });
            c14507.m33167(new InterfaceC6461() { // from class: l.ۤܿܳ
                @Override // p067l.InterfaceC6461
                /* JADX INFO: renamed from: ֫ */
                public final InterfaceC7131 mo10903(InterfaceC21214 interfaceC21214) {
                    return new C24357(strM40053, interfaceC21214, treeMap, sb);
                }
            });
            c14507.m33166().m18075(abstractC2555M7387, sb);
            C3092 c3092M5235 = C3092.m5235("https://markdown.invalid/");
            C12501 c12501 = new C12501(new C18654());
            c12501.m28804();
            c3092M5235.m5246().m47873(0, c12501.m28796(sb.toString(), c3092M5235.m5246(), c3092M5235.mo27067()));
            for (C21199 c21199 : C13563.m30869(new C13073(), c3092M5235)) {
                if (!c21199.mo27069(str5) && (iM29505 = m29505(treeMap, c21199.m30144().m7710().m21074())) >= 0) {
                    int iM29506 = m29505(treeMap, c21199.m47889().m7707().m21074() - 1);
                    if (iM29506 < iM29505) {
                        iM29506 = m29505(treeMap, c21199.m30144().m7707().m21074() - 1);
                    }
                    c21199.mo22866(str5, iM29505 + ":" + Math.max(iM29505, iM29506));
                }
            }
            C14233 c14233 = new C14233();
            c14233.m32709(C0655am.f2320av, "b", "blockquote", "br", "caption", "cite", "code", "col", "colgroup", "dd", "div", "dl", "dt", "em", "h1", "h2", "h3", "h4", "h5", "h6", C0655am.f2275aC, "img", "li", "ol", C0655am.f2322ax, "pre", "q", "small", "span", "strike", "strong", "sub", "sup", "table", "tbody", "td", "tfoot", "th", "thead", "tr", C0655am.f2280aH, "ul");
            c14233.m32708(C0655am.f2320av, "href", "title");
            c14233.m32708("blockquote", "cite");
            c14233.m32708("col", "span", "width");
            c14233.m32708("colgroup", "span", "width");
            c14233.m32708("img", "align", "alt", "height", "src", "title", "width");
            c14233.m32708("ol", "start", "type");
            c14233.m32708("q", "cite");
            c14233.m32708("table", ErrorBundle.SUMMARY_ENTRY, "width");
            String str6 = "span";
            HashMap map3 = map2;
            c14233.m32708("td", "abbr", "axis", "colspan", "rowspan", "width");
            c14233.m32708("th", "abbr", "axis", "colspan", "rowspan", "scope", "width");
            c14233.m32708("ul", "type");
            c14233.m32707(C0655am.f2320av, "href", "ftp", C0170a.f680s, C0171b.f688a, "mailto");
            c14233.m32707("blockquote", "cite", C0170a.f680s, C0171b.f688a);
            c14233.m32707("cite", "cite", C0170a.f680s, C0171b.f688a);
            c14233.m32707("img", "src", C0170a.f680s, C0171b.f688a);
            c14233.m32707("q", "cite", C0170a.f680s, C0171b.f688a);
            c14233.m32709("div", "span", "del", C0655am.f2274aB, "hr", ErrorBundle.DETAIL_ENTRY, ErrorBundle.SUMMARY_ENTRY, "input");
            c14233.m32708(":all", str5, strM40053);
            c14233.m32708(ErrorBundle.DETAIL_ENTRY, "open");
            c14233.m32708("th", "align");
            c14233.m32708("td", "align");
            c14233.m32708("input", "checked");
            c14233.m32706("type", "checkbox");
            c14233.m32706("disabled", "disabled");
            c14233.m32707(C0655am.f2320av, "href", "#");
            c14233.m32705();
            C3092 c3092M51265 = new C22951(c14233).m51265(c3092M5235);
            c3092M51265.m5236().m3373();
            for (C21199 c211910 : c3092M51265.m47886("th[align],td[align]")) {
                String lowerCase = c211910.mo27065("align").toLowerCase(Locale.ROOT);
                if (lowerCase.equals("left") || lowerCase.equals("center") || lowerCase.equals("right")) {
                    c211910.mo22866("align", lowerCase);
                } else {
                    c211910.m47901("align");
                }
            }
            C18515.m42066(strM40053);
            for (C21199 c211911 : C13563.m30869(new C18436(strM40053.trim()), c3092M51265)) {
                String strMo27065 = c211911.mo27065(strM40053);
                c211911.m47901(strM40053);
                c211911.mo22866("data-mt-render", strMo27065);
                String strM47879 = c211911.m47879();
                c211911.m47892();
                c211911.mo5245(strM47879);
                c211911.m47884(strMo27065.equals("inline-math") ? str6 : "div");
                c211911.m47893("mt-".concat(strMo27065));
            }
            C18515.m42066(str5);
            for (C21199 c211912 : C13563.m30869(new C18436(str5.trim()), c3092M51265)) {
                String strMo27066 = c211912.mo27065(str5);
                int iIndexOf = strMo27066.indexOf(58);
                c211912.m47901(str5);
                c211912.mo22866("data-source-start", strMo27066.substring(0, iIndexOf));
                c211912.mo22866("data-source-end", strMo27066.substring(iIndexOf + 1));
                if (c211912.m47899().equals("pre")) {
                    map = map3;
                    if (map.containsKey(strMo27066) && (c21199M14605 = C6387.m14605("code", c211912)) != null) {
                        String strM478710 = c21199M14605.m47879();
                        c21199M14605.m47892();
                        int i2 = Integer.parseInt((String) map.get(strMo27066));
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 <= strM478710.length()) {
                            if (i3 >= strM478710.length() || strM478710.charAt(i3) == '\n') {
                                if (i3 > i4 || i3 < strM478710.length()) {
                                    str4 = str6;
                                    C21199 c21199M47903 = c21199M14605.m47903(str4);
                                    c21199M47903.mo22866("data-source-start", Integer.toString(i2));
                                    c21199M47903.mo22866("data-source-end", Integer.toString(i2));
                                    c21199M47903.mo5245(strM478710.substring(i4, i3));
                                } else {
                                    str4 = str6;
                                }
                                if (i3 < strM478710.length()) {
                                    c21199M14605.m47895(new C12620("\n"));
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
            for (C21199 c211913 : c3092M51265.m47886("input")) {
                C21199 c21199Mo30143 = c211913.mo30143();
                if (c21199Mo30143 != null && c21199Mo30143.m47899().equals(C0655am.f2322ax)) {
                    c21199Mo30143 = c21199Mo30143.mo30143();
                }
                if (c21199Mo30143 != null && c21199Mo30143.m47899().equals("li")) {
                    c21199Mo30143.m47893("task-list-item");
                    c211913.m47893("task-list-item-checkbox");
                }
            }
            for (C21199 c211914 : c3092M51265.m47886("h1,h2,h3,h4,h5,h6")) {
                String lowerCase2 = c211914.m47887().toLowerCase(Locale.ROOT);
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
                C18515.m42065((Object) str7);
                c211914.mo22866("id", str7);
            }
            boolean zIsEmpty = c3092M51265.m47886("[data-mt-render]").isEmpty();
            String string2 = UUID.randomUUID().toString();
            StringBuilder sb3 = new StringBuilder("<!doctype html><html data-theme=\"");
            sb3.append(z ? "dark" : "light");
            sb3.append("\"><head><meta charset=\"utf-8\"><title>");
            C21199 c211915 = new C21199("title");
            c211915.mo5245(str);
            sb3.append(c211915.m47891());
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sb3, "</title><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none'; img-src https: http: data:; font-src https://cdn.bootcdn.net/ajax/libs/KaTeX/0.16.47/fonts/; style-src 'self' 'unsafe-inline'; script-src 'unsafe-inline' 'nonce-", string2, "'; base-uri 'none'; form-action 'none'\"><style nonce=\"", string2);
            sb3.append("\">");
            bufferedWriter.write(sb3.toString());
            String[] strArr = {"light", "dark"};
            for (int i6 = 0; i6 < 2; i6++) {
                String str8 = strArr[i6];
                bufferedWriter.write(m29506(assetManager, C6988.m16053("github-markdown-", str8, ".css")).replace(".markdown-body", "html[data-theme=\"" + str8 + "\"] .markdown-body"));
            }
            bufferedWriter.write(m29506(assetManager, "preview.css"));
            C21199 c211916 = new C21199("article");
            c211916.m47893("markdown-body");
            c211916.mo22866("data-render-error", str2);
            bufferedWriter.write("</style></head><body><article" + c211916.mo27062().m38898() + ">");
            c3092M51265.m5246().m47874(bufferedWriter);
            bufferedWriter.write("</article><script nonce=\"" + string2 + "\">");
            bufferedWriter.write(m29506(assetManager, "preview.js"));
            bufferedWriter.write("</script>");
            if (!zIsEmpty) {
                bufferedWriter.write("<script nonce=\"" + string2 + "\">");
                bufferedWriter.write(m29506(assetManager, "enhance.js"));
                bufferedWriter.write("</script>");
            }
            bufferedWriter.write("</body></html>");
        } catch (C9605 unused) {
            throw new C4161();
        }
    }

    static {
        int iM25047 = 0;
        Object[] objArr = {new C5611(), new C21035(), new C4290()};
        ArrayList arrayList = new ArrayList(3);
        while (iM25047 < 3) {
            Object obj = objArr[iM25047];
            iM25047 = C10878.m25047(obj, arrayList, obj, iM25047, 1);
        }
        f36235 = C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m29506(AssetManager assetManager, String str) throws IOException {
        InputStream inputStreamOpen = assetManager.open("markdown-preview/" + str);
        try {
            String strM52175 = C23461.m52175(inputStreamOpen, StandardCharsets.UTF_8);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return strM52175;
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

    /* JADX INFO: renamed from: ֫ */
    public static int m29505(TreeMap treeMap, int i) {
        Map.Entry entryFloorEntry = treeMap.floorEntry(Integer.valueOf(i));
        if (entryFloorEntry == null) {
            return -1;
        }
        return ((Integer) entryFloorEntry.getValue()).intValue();
    }
}
