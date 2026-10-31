package l;

import com.alipay.sdk.m.w.a;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۗܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q62F */
/* JADX INFO: loaded from: classes2.dex */
public final class C3328 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final TreeMap f10412;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f10413;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f10414;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f10415;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f10416;

    static {
        TreeMap treeMap = new TreeMap();
        f10412 = treeMap;
        treeMap.put("en", Locale.ENGLISH);
        treeMap.put("de", Locale.GERMAN);
        treeMap.put("it", Locale.ITALIAN);
        treeMap.put("es", new Locale("es", "", ""));
        treeMap.put("pt", new Locale("pt", "", ""));
        treeMap.put("da", new Locale("da", "", ""));
        treeMap.put(a.v, new Locale(a.v, "", ""));
        treeMap.put("no", new Locale("no", "", ""));
        treeMap.put("nl", new Locale("nl", "", ""));
        treeMap.put("ro", new Locale("ro", "", ""));
        treeMap.put("sq", new Locale("sq", "", ""));
        treeMap.put("sh", new Locale("sh", "", ""));
        treeMap.put("sk", new Locale("sk", "", ""));
        treeMap.put("sl", new Locale("sl", "", ""));
        treeMap.put("fr", "jan|fév|mar|avr|mai|jun|jui|aoû|sep|oct|nov|déc");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static DateFormatSymbols m10179(String str) {
        Object obj = f10412.get(str);
        if (obj != null) {
            if (obj instanceof Locale) {
                return new DateFormatSymbols((Locale) obj);
            }
            if (obj instanceof String) {
                StringTokenizer stringTokenizer = new StringTokenizer((String) obj, "|");
                if (12 != stringTokenizer.countTokens()) {
                    throw new IllegalArgumentException("expecting a pipe-delimited string containing 12 tokens");
                }
                String[] strArr = new String[13];
                int i = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    strArr[i] = stringTokenizer.nextToken();
                    i++;
                }
                strArr[i] = "";
                DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(Locale.US);
                dateFormatSymbols.setShortMonths(strArr);
                return dateFormatSymbols;
            }
        }
        return new DateFormatSymbols(Locale.US);
    }

    public C3328(C3328 c3328) {
        this.f10414 = true;
        this.f10416 = c3328.f10416;
        this.f10413 = c3328.f10413;
        this.f10414 = c3328.f10414;
        this.f10415 = c3328.f10415;
    }

    public C3328(String str, String str2, String str3) {
        this.f10414 = true;
        this.f10416 = str;
        this.f10413 = str2;
        this.f10415 = str3;
    }

    public C3328(String str, C3328 c3328) {
        this.f10414 = true;
        this.f10416 = str;
        this.f10413 = c3328.f10413;
        this.f10414 = c3328.f10414;
        this.f10415 = c3328.f10415;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m10180() {
        return this.f10413;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m10182() {
        return this.f10415;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m10184() {
        return this.f10416;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m10185() {
        return this.f10414;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10181(String str) {
        this.f10413 = str;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10183(String str) {
        this.f10415 = str;
    }
}
