package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۗܺ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: Q62F */
/* JADX INFO: loaded from: classes2.dex */
public final class C5531 {

    /* JADX INFO: renamed from: ܿ */
    public static final TreeMap f13222;

    /* JADX INFO: renamed from: ֫ */
    public String f13223;

    /* JADX INFO: renamed from: ۧ */
    public boolean f13224;

    /* JADX INFO: renamed from: ܽ */
    public String f13225;

    /* JADX INFO: renamed from: ᩳ */
    public final String f13226;

    static {
        TreeMap treeMap = new TreeMap();
        f13222 = treeMap;
        treeMap.put("en", Locale.ENGLISH);
        treeMap.put("de", Locale.GERMAN);
        treeMap.put("it", Locale.ITALIAN);
        treeMap.put("es", new Locale("es", "", ""));
        treeMap.put("pt", new Locale("pt", "", ""));
        treeMap.put("da", new Locale("da", "", ""));
        treeMap.put(C0233a.f1090v, new Locale(C0233a.f1090v, "", ""));
        treeMap.put("no", new Locale("no", "", ""));
        treeMap.put("nl", new Locale("nl", "", ""));
        treeMap.put("ro", new Locale("ro", "", ""));
        treeMap.put("sq", new Locale("sq", "", ""));
        treeMap.put("sh", new Locale("sh", "", ""));
        treeMap.put("sk", new Locale("sk", "", ""));
        treeMap.put("sl", new Locale("sl", "", ""));
        treeMap.put("fr", "jan|fév|mar|avr|mai|jun|jui|aoû|sep|oct|nov|déc");
    }

    /* JADX INFO: renamed from: ܽ */
    public static DateFormatSymbols m12215(String str) {
        Object obj = f13222.get(str);
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

    public C5531(C5531 c5531) {
        this.f13224 = true;
        this.f13226 = c5531.f13226;
        this.f13223 = c5531.f13223;
        this.f13224 = c5531.f13224;
        this.f13225 = c5531.f13225;
    }

    public C5531(String str, String str2, String str3) {
        this.f13224 = true;
        this.f13226 = str;
        this.f13223 = str2;
        this.f13225 = str3;
    }

    public C5531(String str, C5531 c5531) {
        this.f13224 = true;
        this.f13226 = str;
        this.f13223 = c5531.f13223;
        this.f13224 = c5531.f13224;
        this.f13225 = c5531.f13225;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m12216() {
        return this.f13223;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m12218() {
        return this.f13225;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m12220() {
        return this.f13226;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m12221() {
        return this.f13224;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12217(String str) {
        this.f13223 = str;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12219(String str) {
        this.f13225 = str;
    }
}
