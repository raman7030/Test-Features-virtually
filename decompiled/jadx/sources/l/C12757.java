package l;

import com.alipay.sdk.m.p.a;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBIL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12757 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final char[] f38339 = {',', ';'};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final HashMap f38340 = new HashMap();

    static {
        new C0056();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m31063(String str) {
        return EnumC2880.extended.m8815(str) != -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m31062(String str) {
        return EnumC2880.base.m8815(str) != -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31058(String str, int[] iArr) {
        String str2 = (String) f38340.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iM8815 = EnumC2880.extended.m8815(str);
        if (iM8815 == -1) {
            return 0;
        }
        iArr[0] = iM8815;
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31059(Appendable appendable, String str, C0056 c0056, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        char c;
        EnumC2880 enumC2880M981 = c0056.m981();
        CharsetEncoder charsetEncoderM975 = c0056.m975();
        EnumC4291 enumC4291 = c0056.f939;
        int length = str.length();
        int iCharCount = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            boolean zCanEncode = true;
            if (z2) {
                if (!C20519.m47003(iCodePointAt)) {
                    if (z5) {
                        appendable.append(' ');
                        z5 = false;
                    }
                    z6 = true;
                    z7 = false;
                    if (iCodePointAt < 65536) {
                        c = (char) iCodePointAt;
                        if (c != '\t') {
                            appendable.append(c);
                        } else {
                            appendable.append(c);
                        }
                    } else {
                        str2 = new String(Character.toChars(iCodePointAt));
                        if (charsetEncoderM975.canEncode(str2)) {
                            appendable.append(str2);
                        } else {
                            m31060(appendable, enumC2880M981, iCodePointAt);
                        }
                    }
                } else if ((!z3 || z6) && !z7) {
                    if (z4) {
                        z5 = true;
                    } else {
                        appendable.append(' ');
                        z7 = true;
                    }
                }
            } else if (iCodePointAt < 65536) {
                c = (char) iCodePointAt;
                if (c != '\t' || c == '\n' || c == '\r') {
                    appendable.append(c);
                } else if (c != '\"') {
                    if (c == '&') {
                        appendable.append("&amp;");
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c != 160) {
                                if (c < ' ') {
                                    m31060(appendable, enumC2880M981, iCodePointAt);
                                } else {
                                    int iOrdinal = enumC4291.ordinal();
                                    if (iOrdinal != 0) {
                                        if (iOrdinal != 1) {
                                            zCanEncode = charsetEncoderM975.canEncode(c);
                                        }
                                    } else if (c >= 128) {
                                        zCanEncode = false;
                                    }
                                    if (!zCanEncode) {
                                        m31060(appendable, enumC2880M981, iCodePointAt);
                                    } else {
                                        appendable.append(c);
                                    }
                                }
                            } else if (enumC2880M981 != EnumC2880.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (!z) {
                            appendable.append("&gt;");
                        } else {
                            appendable.append(c);
                        }
                    } else if (!z || enumC2880M981 == EnumC2880.xhtml || c0056.m984() == EnumC19108.xml) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c);
                    }
                } else if (z) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c);
                }
            } else {
                str2 = new String(Character.toChars(iCodePointAt));
                if (charsetEncoderM975.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    m31060(appendable, enumC2880M981, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31060(Appendable appendable, EnumC2880 enumC2880, int i) throws IOException {
        String strM8816 = enumC2880.m8816(i);
        if (!"".equals(strM8816)) {
            appendable.append('&').append(strM8816).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31061(EnumC2880 enumC2880, String str, int i) {
        int i2;
        enumC2880.f9182 = new String[i];
        enumC2880.f9184 = new int[i];
        enumC2880.f9183 = new int[i];
        enumC2880.f9181 = new String[i];
        C17842 c17842 = new C17842(new StringReader(str), str.length());
        int i3 = 0;
        while (!c17842.m41785()) {
            try {
                String strM41779 = c17842.m41779(a.h);
                c17842.m41782();
                int i4 = Integer.parseInt(c17842.m41781(f38339), 36);
                char cM41799 = c17842.m41799();
                c17842.m41782();
                if (cM41799 == ',') {
                    i2 = Integer.parseInt(c17842.m41779(';'), 36);
                    c17842.m41782();
                } else {
                    i2 = -1;
                }
                int i5 = Integer.parseInt(c17842.m41779('&'), 36);
                c17842.m41782();
                enumC2880.f9182[i3] = strM41779;
                enumC2880.f9184[i3] = i4;
                enumC2880.f9183[i5] = i4;
                enumC2880.f9181[i5] = strM41779;
                if (i2 != -1) {
                    f38340.put(strM41779, new String(new int[]{i4, i2}, 0, 2));
                }
                i3++;
            } catch (Throwable th) {
                c17842.m41793();
                throw th;
            }
        }
        if (!(i3 == i)) {
            throw new C14167("Unexpected count of entities loaded");
        }
        c17842.m41793();
    }
}
