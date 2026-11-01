package p067l;

import java.io.File;
import java.text.ParseException;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17228 extends AbstractC17899 {
    public C17228(C5531 c5531) {
        super("(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+((\\S+\\s*)+)?");
        mo6295(c5531);
    }

    @Override // p067l.AbstractC17899
    /* JADX INFO: renamed from: ֫ */
    public final C5531 mo13109() {
        return new C5531("OS/400", "yy/MM/dd HH:mm:ss", null);
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m38998(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    @Override // p067l.InterfaceC8213
    /* JADX INFO: renamed from: ֫ */
    public final C12237 mo13110(String str) {
        String str2;
        boolean z;
        int iLastIndexOf;
        C12237 c12237 = new C12237();
        c12237.m28227(str);
        if (!m40709(str)) {
            return null;
        }
        String strM40708 = m40708(1);
        String strM40709 = m40708(2);
        int i = 3;
        if (m38998(m40708(3)) && m38998(m40708(4))) {
            str2 = "";
        } else {
            str2 = m40708(3) + " " + m40708(4);
        }
        String strM407010 = m40708(5);
        String strM407011 = m40708(6);
        try {
            c12237.m28214(m40710(str2));
        } catch (ParseException unused) {
        }
        try {
            if (strM407010.equalsIgnoreCase("*STMF")) {
                if (m38998(strM40709) || m38998(strM407011)) {
                    return null;
                }
                i = 0;
            } else {
                if (!strM407010.equalsIgnoreCase("*DIR")) {
                    if (!strM407010.equalsIgnoreCase("*FILE")) {
                        if (strM407010.equalsIgnoreCase("*MEM")) {
                            if (m38998(strM407011) || !m38998(strM40709) || !m38998(str2)) {
                                return null;
                            }
                            strM407011 = strM407011.replace('/', File.separatorChar);
                        }
                        c12237.m28210(i);
                        c12237.m28225(strM40708);
                        c12237.m28212(Long.parseLong(strM40709));
                        if (strM407011.endsWith("/")) {
                            strM407011 = C17073.m38720(1, 0, strM407011);
                        }
                        if (z && (iLastIndexOf = strM407011.lastIndexOf(47)) > -1) {
                            strM407011 = strM407011.substring(iLastIndexOf + 1);
                        }
                        c12237.m28223(strM407011);
                        return c12237;
                    }
                    if (strM407011 == null || !strM407011.toUpperCase(Locale.ROOT).endsWith(".SAVF")) {
                        return null;
                    }
                    i = 0;
                    z = false;
                    c12237.m28210(i);
                    c12237.m28225(strM40708);
                    c12237.m28212(Long.parseLong(strM40709));
                    if (strM407011.endsWith("/")) {
                        strM407011 = C17073.m38720(1, 0, strM407011);
                    }
                    if (z) {
                        strM407011 = strM407011.substring(iLastIndexOf + 1);
                    }
                    c12237.m28223(strM407011);
                    return c12237;
                }
                if (m38998(strM40709) || m38998(strM407011)) {
                    return null;
                }
                i = 1;
            }
            c12237.m28212(Long.parseLong(strM40709));
        } catch (NumberFormatException unused2) {
        }
        z = true;
        c12237.m28210(i);
        c12237.m28225(strM40708);
        if (strM407011.endsWith("/")) {
            strM407011 = C17073.m38720(1, 0, strM407011);
        }
        if (z) {
            strM407011 = strM407011.substring(iLastIndexOf + 1);
        }
        c12237.m28223(strM407011);
        return c12237;
    }
}
