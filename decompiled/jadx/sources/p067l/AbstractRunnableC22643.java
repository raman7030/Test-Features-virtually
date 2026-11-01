package p067l;

import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۘۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 94WG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractRunnableC22643 implements Runnable {

    /* JADX INFO: renamed from: ᩹ */
    public static C23944[] f71445 = {new C23944("SYST", RunnableC20631.class), new C23944("USER", RunnableC7219.class), new C23944("PASS", RunnableC12584.class), new C23944("TYPE", RunnableC2524.class), new C23944("CWD", RunnableC22604.class), new C23944("PWD", RunnableC18618.class), new C23944("LIST", RunnableC5169.class), new C23944("PASV", RunnableC17947.class), new C23944("RETR", RunnableC21972.class), new C23944("NLST", RunnableC15226.class), new C23944("NOOP", RunnableC9192.class), new C23944("STOR", RunnableC19960.class), new C23944("DELE", RunnableC23274.class), new C23944("RNFR", RunnableC10572.class), new C23944("RNTO", RunnableC17276.class), new C23944("RMD", RunnableC11243.class), new C23944("MKD", RunnableC11875.class), new C23944("OPTS", RunnableC3866.class), new C23944("PORT", RunnableC19289.class), new C23944("QUIT", RunnableC15935.class), new C23944("FEAT", RunnableC21263.class), new C23944("SIZE", C5878.class), new C23944("CDUP", RunnableC16567.class), new C23944("APPE", RunnableC7180.class), new C23944("XCUP", RunnableC16567.class), new C23944("XPWD", RunnableC18618.class), new C23944("XMKD", RunnableC11875.class), new C23944("XRMD", RunnableC11243.class), new C23944("MDTM", RunnableC14556.class), new C23944("MFMT", RunnableC13886.class), new C23944("REST", RunnableC8560.class), new C23944("SITE", RunnableC4537.class), new C23944("MLST", RunnableC13216.class), new C23944("MLSD", RunnableC7851.class), new C23944("HASH", RunnableC6510.class), new C23944("RANG", RunnableC24653.class)};

    /* JADX INFO: renamed from: ᩸ */
    public C21302 f71446;

    public AbstractRunnableC22643(C21302 c21302) {
        this.f71446 = c21302;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50696(C21302 c21302, String str) {
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length < 1) {
            c21302.m48173("502 Command not recognized\r\n");
            return;
        }
        String str2 = strArrSplit[0];
        if (str2.length() < 1) {
            c21302.m48173("502 Command not recognized\r\n");
            return;
        }
        String upperCase = str2.trim().toUpperCase();
        AbstractRunnableC22643 abstractRunnableC22643 = null;
        for (int i = 0; i < 36; i++) {
            C23944 c23944 = f71445[i];
            if (c23944.f76068.equals(upperCase)) {
                try {
                    try {
                        abstractRunnableC22643 = (AbstractRunnableC22643) c23944.f76067.getConstructor(C21302.class, String.class).newInstance(c21302, str);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        if (abstractRunnableC22643 == null) {
            c21302.m48173("502 Command not recognized\r\n");
            return;
        }
        if (c21302.m48161()) {
            abstractRunnableC22643.run();
            return;
        }
        if (c21302.m48164()) {
            abstractRunnableC22643.run();
        } else if (abstractRunnableC22643.getClass().equals(RunnableC7219.class) || abstractRunnableC22643.getClass().equals(RunnableC12584.class) || abstractRunnableC22643.getClass().equals(RunnableC15935.class)) {
            abstractRunnableC22643.run();
        } else {
            c21302.m48173("530 Login first with USER and PASS, or QUIT\r\n");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50693(String str) {
        int iIndexOf;
        return (str == null || (iIndexOf = str.indexOf(32)) == -1) ? "" : str.substring(iIndexOf + 1).replaceAll("\\s+$", "");
    }

    /* JADX INFO: renamed from: ۧ */
    public static AbstractC17043 m50699(C21302 c21302, String str) {
        String strM50695;
        AbstractC17043 abstractC17043M48178 = c21302.m48178();
        AbstractC17043 abstractC17043M48165 = c21302.m48165();
        if (str == null) {
            str = "";
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        if (str.startsWith("/") || ((strM50695 = m50695(abstractC17043M48178, abstractC17043M48165)) != null && m50697(arrayDeque, strM50695))) {
            if (m50697(arrayDeque, str)) {
                return arrayDeque.isEmpty() ? abstractC17043M48178 : abstractC17043M48178.m38684(m50694(arrayDeque));
            }
            AbstractC17043 abstractC17043M38694 = abstractC17043M48178.m38694();
            return abstractC17043M38694 != null ? abstractC17043M38694 : abstractC17043M48178;
        }
        AbstractC17043 abstractC17043M38695 = abstractC17043M48178.m38694();
        return abstractC17043M38695 != null ? abstractC17043M38695 : abstractC17043M48178;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m50701(AbstractC17043 abstractC17043) {
        return !(m50695(this.f71446.m48178(), abstractC17043) != null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m50697(ArrayDeque arrayDeque, String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m50695(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) {
        String strM50698 = m50698(abstractC17043.mo25495());
        String strM50699 = m50698(abstractC17044.mo25495());
        if (strM50698.equalsIgnoreCase(strM50699)) {
            return "";
        }
        if (!strM50698.endsWith("/")) {
            strM50698 = strM50698.concat("/");
        }
        if (strM50699.regionMatches(true, 0, strM50698, 0, strM50698.length())) {
            return strM50699.substring(strM50698.length());
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static String m50698(String str) {
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
        String strM50694 = m50694(arrayDeque);
        if (zStartsWith) {
            return strM50694.isEmpty() ? "/" : "/".concat(strM50694);
        }
        return strM50694;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m50700(AbstractC17043 abstractC17043, AbstractC17043 abstractC17044) {
        return m50698(abstractC17043.mo25495()).equalsIgnoreCase(m50698(abstractC17044.mo25495()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m50694(ArrayDeque arrayDeque) {
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
