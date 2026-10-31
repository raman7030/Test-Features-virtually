package l;

import java.io.File;
import java.text.ParseException;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܺۖ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B5PU */
/* JADX INFO: loaded from: classes5.dex */
public final class C15636 extends AbstractC16342 {
    public C15636(C3328 c3328) {
        super("(\\S+)\\s+(?:(\\d+)\\s+)?(?:(\\S+)\\s+(\\S+)\\s+)?(\\*STMF|\\*DIR|\\*FILE|\\*MEM)\\s+((\\S+\\s*)+)?");
        mo4051(c3328);
    }

    @Override // l.AbstractC16342
    /* JADX INFO: renamed from: ֫ */
    public final C3328 mo11133() {
        return new C3328("OS/400", "yy/MM/dd HH:mm:ss", null);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m36832(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    @Override // l.InterfaceC6150
    /* JADX INFO: renamed from: ֫ */
    public final C10384 mo11134(String str) {
        String str2;
        boolean z;
        int iLastIndexOf;
        C10384 c10384 = new C10384();
        c10384.m26198(str);
        if (!m38493(str)) {
            return null;
        }
        String strM38492 = m38492(1);
        String strM38493 = m38492(2);
        int i = 3;
        if (m36832(m38492(3)) && m36832(m38492(4))) {
            str2 = "";
        } else {
            str2 = m38492(3) + " " + m38492(4);
        }
        String strM38494 = m38492(5);
        String strM38495 = m38492(6);
        try {
            c10384.m26185(m38494(str2));
        } catch (ParseException unused) {
        }
        try {
            if (strM38494.equalsIgnoreCase("*STMF")) {
                if (m36832(strM38493) || m36832(strM38495)) {
                    return null;
                }
                i = 0;
            } else {
                if (!strM38494.equalsIgnoreCase("*DIR")) {
                    if (!strM38494.equalsIgnoreCase("*FILE")) {
                        if (strM38494.equalsIgnoreCase("*MEM")) {
                            if (m36832(strM38495) || !m36832(strM38493) || !m36832(str2)) {
                                return null;
                            }
                            strM38495 = strM38495.replace('/', File.separatorChar);
                        }
                        c10384.m26181(i);
                        c10384.m26196(strM38492);
                        c10384.m26183(Long.parseLong(strM38493));
                        if (strM38495.endsWith("/")) {
                            strM38495 = C15472.m36561(1, 0, strM38495);
                        }
                        if (z && (iLastIndexOf = strM38495.lastIndexOf(47)) > -1) {
                            strM38495 = strM38495.substring(iLastIndexOf + 1);
                        }
                        c10384.m26194(strM38495);
                        return c10384;
                    }
                    if (strM38495 == null || !strM38495.toUpperCase(Locale.ROOT).endsWith(".SAVF")) {
                        return null;
                    }
                    i = 0;
                    z = false;
                    c10384.m26181(i);
                    c10384.m26196(strM38492);
                    c10384.m26183(Long.parseLong(strM38493));
                    if (strM38495.endsWith("/")) {
                        strM38495 = C15472.m36561(1, 0, strM38495);
                    }
                    if (z) {
                        strM38495 = strM38495.substring(iLastIndexOf + 1);
                    }
                    c10384.m26194(strM38495);
                    return c10384;
                }
                if (m36832(strM38493) || m36832(strM38495)) {
                    return null;
                }
                i = 1;
            }
            c10384.m26183(Long.parseLong(strM38493));
        } catch (NumberFormatException unused2) {
        }
        z = true;
        c10384.m26181(i);
        c10384.m26196(strM38492);
        if (strM38495.endsWith("/")) {
            strM38495 = C15472.m36561(1, 0, strM38495);
        }
        if (z) {
            strM38495 = strM38495.substring(iLastIndexOf + 1);
        }
        c10384.m26194(strM38495);
        return c10384;
    }
}
