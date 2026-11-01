package p067l;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6A1V */
/* JADX INFO: loaded from: classes.dex */
public final class C24994 {

    /* JADX INFO: renamed from: ۜ */
    public static final HashMap f79778;

    /* JADX INFO: renamed from: ۧ */
    public int f79780;

    /* JADX INFO: renamed from: ܳ */
    public String f79781;

    /* JADX INFO: renamed from: ܽ */
    public int f79782;

    /* JADX INFO: renamed from: ܿ */
    public String f79783;

    /* JADX INFO: renamed from: ᩳ */
    public HashMap f79784 = null;

    /* JADX INFO: renamed from: ֫ */
    public String f79779 = null;

    /* JADX INFO: renamed from: ᩻ */
    public C4878 f79785 = null;

    static {
        HashMap map = new HashMap();
        f79778 = map;
        map.put("srvsvc", "4b324fc8-1670-01d3-1278-5a47bf6ee188:3.0");
        map.put("lsarpc", "12345778-1234-abcd-ef00-0123456789ab:0.0");
        map.put("samr", "12345778-1234-abcd-ef00-0123456789ac:1.0");
        map.put("netdfs", "4fc742e0-4a10-11cf-8273-00aa004ae673:3.0");
        map.put("netlogon", "12345678-1234-abcd-ef00-01234567cffb:1.0");
        map.put("wkssvc", "6BFFD098-A112-3610-9833-46C3F87E345A:1.0");
        map.put("samr", "12345778-1234-ABCD-EF00-0123456789AC:1.0");
    }

    public C24994(String str, String str2) {
        this.f79783 = str;
        this.f79781 = str2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m54896() {
        return this.f79781;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m54891() {
        return this.f79779;
    }

    /* JADX INFO: renamed from: ܿ */
    public final C4878 m54895() {
        return this.f79785;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m54893() {
        return this.f79780;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m54894() {
        return this.f79782;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54892(String str, String str2) throws C11584 {
        if (str.equals("endpoint")) {
            String string = str2.toString();
            this.f79779 = string;
            String lowerCase = string.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith("\\pipe\\")) {
                String str3 = (String) f79778.get(lowerCase.substring(6));
                if (str3 != null) {
                    int iIndexOf = str3.indexOf(58);
                    int i = iIndexOf + 1;
                    int iIndexOf2 = str3.indexOf(46, i);
                    this.f79785 = new C4878(str3.substring(0, iIndexOf));
                    this.f79780 = Integer.parseInt(str3.substring(i, iIndexOf2));
                    this.f79782 = Integer.parseInt(str3.substring(iIndexOf2 + 1));
                    return;
                }
            }
            throw new C11584("Bad endpoint: " + this.f79779);
        }
        if (this.f79784 == null) {
            this.f79784 = new HashMap();
        }
        this.f79784.put(str, str2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Object m54890(String str) {
        if (str.equals("endpoint")) {
            return this.f79779;
        }
        HashMap map = this.f79784;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final String toString() {
        String string = this.f79783 + ":" + this.f79781 + "[" + this.f79779;
        HashMap map = this.f79784;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                StringBuilder sbM21133 = C9179.m21133(string, ",");
                sbM21133.append((String) entry.getKey());
                sbM21133.append("=");
                sbM21133.append(entry.getValue());
                string = sbM21133.toString();
            }
        }
        return C17588.m40053(string, "]");
    }
}
