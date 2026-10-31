package l;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAOD */
/* JADX INFO: loaded from: classes3.dex */
public final class C9713 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m24685(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c < 'a' || c > 'f') {
            return -1;
        }
        return c - 'W';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m24687(String str) throws C1580, IOException {
        C2657 c2657 = new C2657();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c2657.setOutput(byteArrayOutputStream, "utf-8");
        c2657.startDocument("utf-8", Boolean.TRUE);
        int i = C5108.f16016;
        C7184 c7184 = new C7184();
        c7184.m19219(new StringReader(str));
        Iterator<E> it = C5108.m14654(c7184, true).iterator();
        while (it.hasNext()) {
            m24686(c2657, (C19220) it.next());
        }
        c2657.endDocument();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:160:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m24686(C2657 c2657, AbstractC8636 abstractC8636) throws C1580, IOException {
        String strSubstring;
        String strSubstring2;
        int i;
        int i2;
        if (!abstractC8636.mo3218()) {
            if (abstractC8636.mo3218()) {
                throw new UnsupportedOperationException();
            }
            c2657.text(((C0874) abstractC8636).m3219());
            return;
        }
        C19220 c19220M22400 = abstractC8636.m22400();
        c2657.startTag(null, c19220M22400.m44350());
        Iterator it = c19220M22400.m44351().iterator();
        while (it.hasNext()) {
            C18514 c18514 = (C18514) it.next();
            String strM43025 = c18514.m43025();
            int iLastIndexOf = strM43025.lastIndexOf(45);
            if (iLastIndexOf > 0) {
                strSubstring = strM43025.substring(0, iLastIndexOf);
                strSubstring2 = strM43025.substring(iLastIndexOf + 1);
            } else {
                strSubstring = strM43025;
                strSubstring2 = "";
            }
            strSubstring2.getClass();
            Iterator it2 = it;
            switch (strSubstring2) {
                case "base64":
                case "double":
                case "hex":
                case "int":
                case "str":
                case "bool":
                case "long":
                case "null":
                case "float":
                case "interned":
                    break;
                default:
                    strSubstring = strM43025;
                    strSubstring2 = "";
                    break;
            }
            C19220 c19220 = c19220M22400;
            switch (strSubstring2.hashCode()) {
                case -1396204209:
                    if (strSubstring2.equals("base64")) {
                        try {
                            c2657.m8342(strSubstring, Base64.decode(c18514.m43026(), 2));
                        } catch (Exception e) {
                            C1580 c1580 = new C1580(e.getMessage(), c18514);
                            c1580.initCause((Throwable) e);
                            throw c1580;
                        }
                    } else {
                        c2657.attribute(null, strSubstring, c18514.m43026());
                    }
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                case -1325958191:
                    if (strSubstring2.equals(ClassTransform.DOUBLE)) {
                        try {
                            c2657.m8338(strSubstring, Double.parseDouble(c18514.m43026()));
                        } catch (Exception e2) {
                            C1580 c1581 = new C1580(e2.getMessage(), c18514);
                            c1581.initCause((Throwable) e2);
                            throw c1581;
                        }
                    } else {
                        c2657.attribute(null, strSubstring, c18514.m43026());
                    }
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                case 103195:
                    if (strSubstring2.equals("hex")) {
                        String strM43026 = c18514.m43026();
                        int length = strM43026.length();
                        if (length % 2 != 0) {
                            throw new C1580("Invalid length for hex text", c18514);
                        }
                        byte[] bArr = new byte[length / 2];
                        for (int i3 = 0; i3 < length; i3 += 2) {
                            int iM24685 = m24685(strM43026.charAt(i3));
                            int iM24686 = m24685(strM43026.charAt(i3 + 1));
                            if (iM24685 == -1 || iM24686 == -1) {
                                throw new C1580("Invalid characters for hex text", c18514);
                            }
                            bArr[i3 / 2] = (byte) ((iM24685 * 16) + iM24686);
                        }
                        c2657.m8345(strSubstring, bArr);
                    } else {
                        c2657.attribute(null, strSubstring, c18514.m43026());
                    }
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                case 104431:
                    if (strSubstring2.equals(ClassTransform.INTEGER)) {
                        String lowerCase = c18514.m43026().toLowerCase();
                        if (lowerCase.startsWith("0x") || lowerCase.startsWith("-0x")) {
                            String strM43027 = c18514.m43026();
                            try {
                                if (strM43027.startsWith("-")) {
                                    strM43027 = strM43027.substring(1);
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                c2657.m8343(Integer.parseInt(strM43027.substring(2), 16) * i, strSubstring);
                            } catch (Exception e3) {
                                C1580 c1582 = new C1580(e3.getMessage(), c18514);
                                c1582.initCause((Throwable) e3);
                                throw c1582;
                            }
                        } else {
                            try {
                                c2657.m8336(Integer.parseInt(c18514.m43026()), strSubstring);
                            } catch (Exception e4) {
                                C1580 c1583 = new C1580(e4.getMessage(), c18514);
                                c1583.initCause((Throwable) e4);
                                throw c1583;
                            }
                        }
                    } else {
                        c2657.attribute(null, strSubstring, c18514.m43026());
                    }
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                case 114225:
                    strSubstring2.equals("str");
                    c2657.attribute(null, strSubstring, c18514.m43026());
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                case 3029738:
                    if (strSubstring2.equals("bool")) {
                        try {
                            c2657.m8341(strSubstring, Boolean.parseBoolean(c18514.m43026()));
                        } catch (Exception e5) {
                            C1580 c1584 = new C1580(e5.getMessage(), c18514);
                            c1584.initCause((Throwable) e5);
                            throw c1584;
                        }
                    } else {
                        c2657.attribute(null, strSubstring, c18514.m43026());
                    }
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                case 3327612:
                    if (strSubstring2.equals(ClassTransform.LONG)) {
                        String lowerCase2 = c18514.m43026().toLowerCase();
                        if (lowerCase2.startsWith("0x") || lowerCase2.startsWith("-0x")) {
                            String strM43028 = c18514.m43026();
                            try {
                                if (strM43028.startsWith("-")) {
                                    strM43028 = strM43028.substring(1);
                                    i2 = -1;
                                } else {
                                    i2 = 1;
                                }
                                c2657.m8344(Long.parseLong(strM43028.substring(2), 16) * ((long) i2), strSubstring);
                            } catch (Exception e6) {
                                C1580 c1585 = new C1580(e6.getMessage(), c18514);
                                c1585.initCause((Throwable) e6);
                                throw c1585;
                            }
                        } else {
                            try {
                                c2657.m8337(Long.parseLong(c18514.m43026()), strSubstring);
                            } catch (Exception e7) {
                                C1580 c1586 = new C1580(e7.getMessage(), c18514);
                                c1586.initCause((Throwable) e7);
                                throw c1586;
                            }
                        }
                    } else {
                        c2657.attribute(null, strSubstring, c18514.m43026());
                    }
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                case 3392903:
                    if (strSubstring2.equals("null")) {
                        c2657.attribute(null, strSubstring, null);
                    } else {
                        c2657.attribute(null, strSubstring, c18514.m43026());
                    }
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                case 97526364:
                    if (strSubstring2.equals(ClassTransform.FLOAT)) {
                        try {
                            c2657.m8339(strSubstring, Float.parseFloat(c18514.m43026()));
                        } catch (Exception e8) {
                            C1580 c1587 = new C1580(e8.getMessage(), c18514);
                            c1587.initCause((Throwable) e8);
                            throw c1587;
                        }
                    } else {
                        c2657.attribute(null, strSubstring, c18514.m43026());
                    }
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                case 570410801:
                    if (strSubstring2.equals("interned")) {
                        c2657.m8340(strSubstring, c18514.m43026());
                    } else {
                        c2657.attribute(null, strSubstring, c18514.m43026());
                    }
                    it = it2;
                    c19220M22400 = c19220;
                    break;
                default:
                    c2657.attribute(null, strSubstring, c18514.m43026());
                    it = it2;
                    c19220M22400 = c19220;
                    break;
            }
        }
        C19220 c19221 = c19220M22400;
        Iterator it3 = c19221.m44345().iterator();
        while (it3.hasNext()) {
            m24686(c2657, (AbstractC8636) it3.next());
        }
        c2657.endTag(null, c19221.m44350());
    }
}
