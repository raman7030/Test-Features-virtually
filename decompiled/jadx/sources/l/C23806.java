package l;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A1V */
/* JADX INFO: loaded from: classes.dex */
public final class C23806 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final HashMap f77026;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f77028;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f77029;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f77030;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public String f77031;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public HashMap f77032 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f77027 = null;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C2640 f77033 = null;

    static {
        HashMap map = new HashMap();
        f77026 = map;
        map.put("srvsvc", "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0");
        map.put("lsarpc", "12345778-1234-abcd-ef00-0123456789ab:0.0");
        map.put("samr", "12345778-1234-abcd-ef00-0123456789ac:1.0");
        map.put("netdfs", "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0");
        map.put("netlogon", "12345678-1234-abcd-ef00-01234567cffb:1.0");
        map.put("wkssvc", "6BFFD098-A112-3610-9833-46C3F87E345A:1.0");
        map.put("samr", "12345778-1234-ABCD-EF00-0123456789AC:1.0");
    }

    public C23806(String str, String str2) {
        this.f77031 = str;
        this.f77029 = str2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m52487() {
        return this.f77029;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52482() {
        return this.f77027;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C2640 m52486() {
        return this.f77033;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52484() {
        return this.f77028;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52485() {
        return this.f77030;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52483(String str, String str2) throws C9696 {
        if (str.equals("endpoint")) {
            String string = str2.toString();
            this.f77027 = string;
            String lowerCase = string.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith("\\pipe\\")) {
                String str3 = (String) f77026.get(lowerCase.substring(6));
                if (str3 != null) {
                    int iIndexOf = str3.indexOf(58);
                    int i = iIndexOf + 1;
                    int iIndexOf2 = str3.indexOf(46, i);
                    this.f77033 = new C2640(str3.substring(0, iIndexOf));
                    this.f77028 = Integer.parseInt(str3.substring(i, iIndexOf2));
                    this.f77030 = Integer.parseInt(str3.substring(iIndexOf2 + 1));
                    return;
                }
            }
            throw new C9696("Bad endpoint: " + this.f77027);
        }
        if (this.f77032 == null) {
            this.f77032 = new HashMap();
        }
        this.f77032.put(str, str2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object m52481(String str) {
        if (str.equals("endpoint")) {
            return this.f77027;
        }
        HashMap map = this.f77032;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final String toString() {
        String string = this.f77031 + ":" + this.f77029 + "[" + this.f77027;
        HashMap map = this.f77032;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder sbM19190 = C7166.m19190(string, ",");
                sbM19190.append((String) entry.getKey());
                sbM19190.append("=");
                sbM19190.append(entry.getValue());
                string = sbM19190.toString();
            }
        }
        return C16014.m37867(string, "]");
    }
}
