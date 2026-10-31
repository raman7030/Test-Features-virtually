package l;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94WG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC21333 implements Runnable {

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static C22702[] f68751 = {new C22702("SYST", RunnableC19216.class), new C22702("USER", RunnableC5104.class), new C22702("PASS", RunnableC10749.class), new C22702("TYPE", RunnableC0164.class), new C22702("CWD", RunnableC21292.class), new C22702("PWD", RunnableC17098.class), new C22702("LIST", RunnableC2947.class), new C22702("PASV", RunnableC16392.class), new C22702("RETR", RunnableC20627.class), new C22702("NLST", RunnableC13529.class), new C22702("NOOP", RunnableC7180.class), new C22702("STOR", RunnableC18510.class), new C22702("DELE", RunnableC21997.class), new C22702("RNFR", RunnableC8632.class), new C22702("RNTO", RunnableC15686.class), new C22702("RMD", RunnableC9338.class), new C22702("MKD", RunnableC10003.class), new C22702("OPTS", RunnableC1576.class), new C22702("PORT", RunnableC17804.class), new C22702("QUIT", RunnableC14275.class), new C22702("FEAT", RunnableC19881.class), new C22702("SIZE", C3693.class), new C22702("CDUP", RunnableC14940.class), new C22702("APPE", RunnableC5063.class), new C22702("XCUP", RunnableC14940.class), new C22702("XPWD", RunnableC17098.class), new C22702("XMKD", RunnableC10003.class), new C22702("XRMD", RunnableC9338.class), new C22702("MDTM", RunnableC12824.class), new C22702("MFMT", RunnableC12119.class), new C22702("REST", RunnableC6515.class), new C22702("SITE", RunnableC2282.class), new C22702("MLST", RunnableC11414.class), new C22702("MLSD", RunnableC5769.class), new C22702("HASH", RunnableC4358.class), new C22702("RANG", RunnableC23448.class)};

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19922 f68752;

    public AbstractRunnableC21333(C19922 c19922) {
        this.f68752 = c19922;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48361(C19922 c19922, String str) {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length < 1) {
            c19922.m45860("502 Command not recognized\r\n");
            return;
        }
        String str2 = strArrSplit[0];
        if (str2.length() < 1) {
            c19922.m45860("502 Command not recognized\r\n");
            return;
        }
        String upperCase = str2.trim().toUpperCase();
        AbstractRunnableC21333 abstractRunnableC21333 = null;
        for (int i = 0; i < 36; i++) {
            C22702 c22702 = f68751[i];
            if (c22702.f73343.equals(upperCase)) {
                try {
                    try {
                        abstractRunnableC21333 = (AbstractRunnableC21333) c22702.f73342.getConstructor(C19922.class, String.class).newInstance(c19922, str);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        if (abstractRunnableC21333 == null) {
            c19922.m45860("502 Command not recognized\r\n");
            return;
        }
        if (c19922.m45848()) {
            abstractRunnableC21333.run();
            return;
        }
        if (c19922.m45851()) {
            abstractRunnableC21333.run();
        } else if (abstractRunnableC21333.getClass().equals(RunnableC5104.class) || abstractRunnableC21333.getClass().equals(RunnableC10749.class) || abstractRunnableC21333.getClass().equals(RunnableC14275.class)) {
            abstractRunnableC21333.run();
        } else {
            c19922.m45860("530 Login first with USER and PASS, or QUIT\r\n");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48358(String str) {
        int iIndexOf;
        return (str == null || (iIndexOf = str.indexOf(32)) == -1) ? "" : str.substring(iIndexOf + 1).replaceAll("\\s+$", "");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static AbstractC15440 m48364(C19922 c19922, String str) {
        String strM48360;
        AbstractC15440 abstractC15440M45865 = c19922.m45865();
        AbstractC15440 abstractC15440M45852 = c19922.m45852();
        if (str == null) {
            str = "";
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        if (str.startsWith("/") || ((strM48360 = m48360(abstractC15440M45865, abstractC15440M45852)) != null && m48362(arrayDeque, strM48360))) {
            if (m48362(arrayDeque, str)) {
                return arrayDeque.isEmpty() ? abstractC15440M45865 : abstractC15440M45865.m36526(m48359(arrayDeque));
            }
            AbstractC15440 abstractC15440M36536 = abstractC15440M45865.m36536();
            return abstractC15440M36536 != null ? abstractC15440M36536 : abstractC15440M45865;
        }
        AbstractC15440 abstractC15440M36537 = abstractC15440M45865.m36536();
        return abstractC15440M36537 != null ? abstractC15440M36537 : abstractC15440M45865;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48366(AbstractC15440 abstractC15440) {
        return !(m48360(this.f68752.m45865(), abstractC15440) != null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m48362(ArrayDeque arrayDeque, String str) {
        if (str.isEmpty()) {
            return true;
        }
        for (String str2 : str.split("/")) {
            if (!str2.isEmpty() && !str2.equals(".")) {
                if (str2.equals("..")) {
                    if (arrayDeque.isEmpty()) {
                        return false;
                    }
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.addLast(str2);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48360(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) {
        String strM48363 = m48363(abstractC15440.mo23544());
        String strM48364 = m48363(abstractC15441.mo23544());
        if (strM48363.equalsIgnoreCase(strM48364)) {
            return "";
        }
        if (!strM48363.endsWith("/")) {
            strM48363 = strM48363.concat("/");
        }
        if (strM48364.regionMatches(true, 0, strM48363, 0, strM48363.length())) {
            return strM48364.substring(strM48363.length());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m48363(String str) {
        boolean zStartsWith = str.startsWith("/");
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str2 : str.split("/")) {
            if (!str2.isEmpty() && !str2.equals(".")) {
                if (str2.equals("..")) {
                    if (!arrayDeque.isEmpty()) {
                        arrayDeque.removeLast();
                    } else if (!zStartsWith) {
                        arrayDeque.addLast(str2);
                    }
                } else {
                    arrayDeque.addLast(str2);
                }
            }
        }
        String strM48359 = m48359(arrayDeque);
        if (zStartsWith) {
            return strM48359.isEmpty() ? "/" : "/".concat(strM48359);
        }
        return strM48359;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m48365(AbstractC15440 abstractC15440, AbstractC15440 abstractC15441) {
        return m48363(abstractC15440.mo23544()).equalsIgnoreCase(m48363(abstractC15441.mo23544()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m48359(ArrayDeque arrayDeque) {
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            if (sb.length() > 0) {
                sb.append('/');
            }
            sb.append((String) it.next());
        }
        return sb.toString();
    }
}
