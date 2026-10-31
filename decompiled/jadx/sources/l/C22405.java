package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes.dex */
public final class C22405 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C16096 f72569;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final HashMap f72570;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C18878 f72571;

    public C22405(C18878 c18878) {
        HashMap map = new HashMap();
        this.f72570 = map;
        this.f72571 = c18878;
        C14587 c14587 = c18878.f59510;
        this.f72569 = C13979.m33438(c14587);
        Iterator it = c14587.m34846().mo21936().iterator();
        while (it.hasNext()) {
            int iMo12858 = ((InterfaceC4277) it.next()).mo12858();
            if (iMo12858 == 1) {
                map.put("android", Integer.valueOf(iMo12858));
            } else if (iMo12858 != 127) {
                map.put(String.format(Locale.ROOT, "app%02x", Integer.valueOf(iMo12858)), Integer.valueOf(iMo12858));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16096 m50281() {
        return this.f72569;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC9922 m50278() {
        return this.f72571.f59510.m34846();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C17515 m50279() {
        return this.f72571.f59510.m34848();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20289 m50280(int i, String str) {
        InterfaceC21211 interfaceC21211Mo2346;
        InterfaceC7099 interfaceC7099M23321 = C9042.m23321(m50278(), i, str);
        if (interfaceC7099M23321 == null) {
            return null;
        }
        int i2 = 65535 & i;
        if (!interfaceC7099M23321.mo2347(i2) || (interfaceC21211Mo2346 = interfaceC7099M23321.mo2346(i2)) == null) {
            return null;
        }
        C18878 c18878 = this.f72571;
        InterfaceC7099 interfaceC7099M23322 = C9042.m23321(c18878.f59509, i, str);
        return new C20289(i, str, interfaceC7099M23321, interfaceC7099M23322 != null ? interfaceC7099M23322.mo2346(i2) : null, C9042.m23323(c18878, interfaceC7099M23321, interfaceC21211Mo2346));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m50277(int i) {
        return m50274(i, m50278());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50276(String str) {
        int iIntValue = ((Integer) C13843.getOrDefault(this.f72570, str, -1)).intValue();
        if (iIntValue == -1 && "android".equals(str)) {
            return 1;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50275(int i, String str) {
        String str2;
        String[] strArrSplit = str.split(":", 2);
        if (strArrSplit.length == 2) {
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            str2 = str3;
            str = str4;
        } else {
            str2 = null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            if (str2 == null || str2.isEmpty() || (i = m50276(str2)) != -1) {
                int iM50273 = m50273(m50278(), i, strSubstring, strSubstring2);
                return (iM50273 == -1 && i == 1) ? m50273(C11166.m27700(), i, strSubstring, strSubstring2) : iM50273;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m50274(int i, InterfaceC9922 interfaceC9922) {
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (interfaceC4277.mo12858() == i2) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.mo2870() == i3) {
                        return C2692.m8425(interfaceC0748.getTypeName());
                    }
                }
            }
        }
        if (i2 != 1 || C12534.m30761(interfaceC9922)) {
            return null;
        }
        return m50274(i, C11166.m27700());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m50273(InterfaceC9922 interfaceC9922, int i, String str, String str2) {
        for (InterfaceC4277 interfaceC4277 : interfaceC9922.mo21936()) {
            if (i == -1 || interfaceC4277.mo12858() == i) {
                for (InterfaceC0748 interfaceC0748 : interfaceC4277.mo12850()) {
                    if (interfaceC0748.getTypeName().equals(str)) {
                        int iMo2867 = interfaceC0748.mo2867(new C6001(4, str2));
                        if (iMo2867 == -1) {
                            break;
                        }
                        return (interfaceC4277.mo12858() << 24) | (interfaceC0748.mo2870() << 16) | iMo2867;
                    }
                }
            }
        }
        return -1;
    }
}
