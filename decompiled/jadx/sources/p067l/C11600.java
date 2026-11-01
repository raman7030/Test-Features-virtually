package p067l;

import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۢܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAOD */
/* JADX INFO: loaded from: classes3.dex */
public final class C11600 {
    /* JADX INFO: renamed from: ֫ */
    public static int m26699(char c) {
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m26701(String str) throws C3870, IOException {
        C4894 c4894 = new C4894();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        c4894.setOutput(byteArrayOutputStream, "utf-8");
        c4894.startDocument("utf-8", Boolean.TRUE);
        int i = C7223.f18850;
        C9196 c9196 = new C9196();
        c9196.m21166(new StringReader(str));
        Iterator<E> it = C7223.m16562(c9196, true).iterator();
        while (it.hasNext()) {
            m26700(c4894, (C20635) it.next());
        }
        c4894.endDocument();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:160:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX INFO: renamed from: ֫ */
    public static void m26700(C4894 c4894, AbstractC10576 abstractC10576) throws C3870, IOException {
        String strSubstring;
        String strSubstring2;
        int i;
        int i2;
        if (!abstractC10576.mo5532()) {
            if (abstractC10576.mo5532()) {
                throw new UnsupportedOperationException();
            }
            c4894.text(((C3199) abstractC10576).m5533());
            return;
        }
        C20635 c20635M24369 = abstractC10576.m24369();
        c4894.startTag(null, c20635M24369.m46644());
        Iterator it = c20635M24369.m46645().iterator();
        while (it.hasNext()) {
            C19964 c19964 = (C19964) it.next();
            String strM45303 = c19964.m45303();
            int iLastIndexOf = strM45303.lastIndexOf(45);
            if (iLastIndexOf > 0) {
                strSubstring = strM45303.substring(0, iLastIndexOf);
                strSubstring2 = strM45303.substring(iLastIndexOf + 1);
            } else {
                strSubstring = strM45303;
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
                    strSubstring = strM45303;
                    strSubstring2 = "";
                    break;
            }
            C20635 c20635 = c20635M24369;
            switch (strSubstring2.hashCode()) {
                case -1396204209:
                    if (strSubstring2.equals("base64")) {
                        try {
                            c4894.m10386(strSubstring, Base64.decode(c19964.m45304(), 2));
                        } catch (Exception e) {
                            C3870 c3870 = new C3870(e.getMessage(), c19964);
                            c3870.initCause((Throwable) e);
                            throw c3870;
                        }
                    } else {
                        c4894.attribute(null, strSubstring, c19964.m45304());
                    }
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                case -1325958191:
                    if (strSubstring2.equals(ClassTransform.DOUBLE)) {
                        try {
                            c4894.m10382(strSubstring, Double.parseDouble(c19964.m45304()));
                        } catch (Exception e2) {
                            C3870 c3871 = new C3870(e2.getMessage(), c19964);
                            c3871.initCause((Throwable) e2);
                            throw c3871;
                        }
                    } else {
                        c4894.attribute(null, strSubstring, c19964.m45304());
                    }
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                case 103195:
                    if (strSubstring2.equals("hex")) {
                        String strM45304 = c19964.m45304();
                        int length = strM45304.length();
                        if (length % 2 != 0) {
                            throw new C3870("Invalid length for hex text", c19964);
                        }
                        byte[] bArr = new byte[length / 2];
                        for (int i3 = 0; i3 < length; i3 += 2) {
                            int iM26699 = m26699(strM45304.charAt(i3));
                            int iM266910 = m26699(strM45304.charAt(i3 + 1));
                            if (iM26699 == -1 || iM266910 == -1) {
                                throw new C3870("Invalid characters for hex text", c19964);
                            }
                            bArr[i3 / 2] = (byte) ((iM26699 * 16) + iM266910);
                        }
                        c4894.m10389(strSubstring, bArr);
                    } else {
                        c4894.attribute(null, strSubstring, c19964.m45304());
                    }
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                case 104431:
                    if (strSubstring2.equals(ClassTransform.INTEGER)) {
                        String lowerCase = c19964.m45304().toLowerCase();
                        if (lowerCase.startsWith("0x") || lowerCase.startsWith("-0x")) {
                            String strM45305 = c19964.m45304();
                            try {
                                if (strM45305.startsWith("-")) {
                                    strM45305 = strM45305.substring(1);
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                c4894.m10387(Integer.parseInt(strM45305.substring(2), 16) * i, strSubstring);
                            } catch (Exception e3) {
                                C3870 c3872 = new C3870(e3.getMessage(), c19964);
                                c3872.initCause((Throwable) e3);
                                throw c3872;
                            }
                        } else {
                            try {
                                c4894.m10380(Integer.parseInt(c19964.m45304()), strSubstring);
                            } catch (Exception e4) {
                                C3870 c3873 = new C3870(e4.getMessage(), c19964);
                                c3873.initCause((Throwable) e4);
                                throw c3873;
                            }
                        }
                    } else {
                        c4894.attribute(null, strSubstring, c19964.m45304());
                    }
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                case 114225:
                    strSubstring2.equals("str");
                    c4894.attribute(null, strSubstring, c19964.m45304());
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                case 3029738:
                    if (strSubstring2.equals("bool")) {
                        try {
                            c4894.m10385(strSubstring, Boolean.parseBoolean(c19964.m45304()));
                        } catch (Exception e5) {
                            C3870 c3874 = new C3870(e5.getMessage(), c19964);
                            c3874.initCause((Throwable) e5);
                            throw c3874;
                        }
                    } else {
                        c4894.attribute(null, strSubstring, c19964.m45304());
                    }
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                case 3327612:
                    if (strSubstring2.equals(ClassTransform.LONG)) {
                        String lowerCase2 = c19964.m45304().toLowerCase();
                        if (lowerCase2.startsWith("0x") || lowerCase2.startsWith("-0x")) {
                            String strM45306 = c19964.m45304();
                            try {
                                if (strM45306.startsWith("-")) {
                                    strM45306 = strM45306.substring(1);
                                    i2 = -1;
                                } else {
                                    i2 = 1;
                                }
                                c4894.m10388(Long.parseLong(strM45306.substring(2), 16) * ((long) i2), strSubstring);
                            } catch (Exception e6) {
                                C3870 c3875 = new C3870(e6.getMessage(), c19964);
                                c3875.initCause((Throwable) e6);
                                throw c3875;
                            }
                        } else {
                            try {
                                c4894.m10381(Long.parseLong(c19964.m45304()), strSubstring);
                            } catch (Exception e7) {
                                C3870 c3876 = new C3870(e7.getMessage(), c19964);
                                c3876.initCause((Throwable) e7);
                                throw c3876;
                            }
                        }
                    } else {
                        c4894.attribute(null, strSubstring, c19964.m45304());
                    }
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                case 3392903:
                    if (strSubstring2.equals("null")) {
                        c4894.attribute(null, strSubstring, null);
                    } else {
                        c4894.attribute(null, strSubstring, c19964.m45304());
                    }
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                case 97526364:
                    if (strSubstring2.equals(ClassTransform.FLOAT)) {
                        try {
                            c4894.m10383(strSubstring, Float.parseFloat(c19964.m45304()));
                        } catch (Exception e8) {
                            C3870 c3877 = new C3870(e8.getMessage(), c19964);
                            c3877.initCause((Throwable) e8);
                            throw c3877;
                        }
                    } else {
                        c4894.attribute(null, strSubstring, c19964.m45304());
                    }
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                case 570410801:
                    if (strSubstring2.equals("interned")) {
                        c4894.m10384(strSubstring, c19964.m45304());
                    } else {
                        c4894.attribute(null, strSubstring, c19964.m45304());
                    }
                    it = it2;
                    c20635M24369 = c20635;
                    break;
                default:
                    c4894.attribute(null, strSubstring, c19964.m45304());
                    it = it2;
                    c20635M24369 = c20635;
                    break;
            }
        }
        C20635 c20636 = c20635M24369;
        Iterator it3 = c20636.m46639().iterator();
        while (it3.hasNext()) {
            m26700(c4894, (AbstractC10576) it3.next());
        }
        c4894.endTag(null, c20636.m46644());
    }
}
