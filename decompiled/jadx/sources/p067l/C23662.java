package p067l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7AI */
/* JADX INFO: loaded from: classes.dex */
public final class C23662 {

    /* JADX INFO: renamed from: ֫ */
    public final C17666 f75295;

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f75296;

    /* JADX INFO: renamed from: ܽ */
    public final C20310 f75297;

    public C23662(C20310 c20310) {
        HashMap map = new HashMap();
        this.f75296 = map;
        this.f75297 = c20310;
        C16232 c16232 = c20310.f62739;
        this.f75295 = C15654.m35558(c16232);
        Iterator it = c16232.m36997().mo23906().iterator();
        while (it.hasNext()) {
            int iMo14722 = ((InterfaceC6434) it.next()).mo14722();
            if (iMo14722 == 1) {
                map.put("android", Integer.valueOf(iMo14722));
            } else if (iMo14722 != 127) {
                map.put(String.format(Locale.ROOT, "app%02x", Integer.valueOf(iMo14722)), Integer.valueOf(iMo14722));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C17666 m52621() {
        return this.f75295;
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC11799 m52618() {
        return this.f75297.f62739.m36997();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C19015 m52619() {
        return this.f75297.f62739.m36999();
    }

    /* JADX INFO: renamed from: ۧ */
    public final C21651 m52620(int i, String str) {
        InterfaceC22528 interfaceC22528Mo4717;
        InterfaceC9116 interfaceC9116M25266 = C10962.m25266(m52618(), i, str);
        if (interfaceC9116M25266 == null) {
            return null;
        }
        int i2 = 65535 & i;
        if (!interfaceC9116M25266.mo4718(i2) || (interfaceC22528Mo4717 = interfaceC9116M25266.mo4717(i2)) == null) {
            return null;
        }
        C20310 c20310 = this.f75297;
        InterfaceC9116 interfaceC9116M25267 = C10962.m25266(c20310.f62738, i, str);
        return new C21651(i, str, interfaceC9116M25266, interfaceC9116M25267 != null ? interfaceC9116M25267.mo4717(i2) : null, C10962.m25268(c20310, interfaceC9116M25266, interfaceC22528Mo4717));
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m52617(int i) {
        return m52614(i, m52618());
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52616(String str) {
        int iIntValue = ((Integer) C15525.getOrDefault(this.f75296, str, -1)).intValue();
        if (iIntValue == -1 && "android".equals(str)) {
            return 1;
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m52615(int i, String str) {
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
            if (str2 == null || str2.isEmpty() || (i = m52616(str2)) != -1) {
                int iM52613 = m52613(m52618(), i, strSubstring, strSubstring2);
                return (iM52613 == -1 && i == 1) ? m52613(C12981.m29762(), i, strSubstring, strSubstring2) : iM52613;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m52614(int i, InterfaceC11799 interfaceC11799) {
        int i2 = (i >>> 24) & 255;
        int i3 = (i >>> 16) & 255;
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (interfaceC6434.mo14722() == i2) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.mo5199() == i3) {
                        return C4927.m10471(interfaceC3080.getTypeName());
                    }
                }
            }
        }
        if (i2 != 1 || C14281.m32833(interfaceC11799)) {
            return null;
        }
        return m52614(i, C12981.m29762());
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m52613(InterfaceC11799 interfaceC11799, int i, String str, String str2) {
        for (InterfaceC6434 interfaceC6434 : interfaceC11799.mo23906()) {
            if (i == -1 || interfaceC6434.mo14722() == i) {
                for (InterfaceC3080 interfaceC3080 : interfaceC6434.mo14714()) {
                    if (interfaceC3080.getTypeName().equals(str)) {
                        int iMo5196 = interfaceC3080.mo5196(new C8072(4, str2));
                        if (iMo5196 == -1) {
                            break;
                        }
                        return (interfaceC6434.mo14722() << 24) | (interfaceC3080.mo5199() << 16) | iMo5196;
                    }
                }
            }
        }
        return -1;
    }
}
