package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.CharsetEncoder;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۬֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: FBIL */
/* JADX INFO: loaded from: classes3.dex */
public final class C14492 {

    /* JADX INFO: renamed from: ֫ */
    public static final char[] f41379 = {',', ';'};

    /* JADX INFO: renamed from: ۧ */
    public static final HashMap f41380 = new HashMap();

    static {
        new C2421();
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m33147(String str) {
        return EnumC5105.extended.m10882(str) != -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m33146(String str) {
        return EnumC5105.base.m10882(str) != -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m33142(String str, int[] iArr) {
        String str2 = (String) f41380.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int iM10882 = EnumC5105.extended.m10882(str);
        if (iM10882 == -1) {
            return 0;
        }
        iArr[0] = iM10882;
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00eb  */
    /* JADX INFO: renamed from: ֫ */
    public static void m33143(Appendable appendable, String str, C2421 c2421, boolean z, boolean z2, boolean z3, boolean z4) {
        String str2;
        char c;
        EnumC5105 enumC5105M3376 = c2421.m3376();
        CharsetEncoder charsetEncoderM3370 = c2421.m3370();
        EnumC6446 enumC6446 = c2421.f3715;
        int length = str.length();
        int iCharCount = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            boolean zCanEncode = true;
            if (z2) {
                if (!C21869.m49326(iCodePointAt)) {
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
                        if (charsetEncoderM3370.canEncode(str2)) {
                            appendable.append(str2);
                        } else {
                            m33144(appendable, enumC5105M3376, iCodePointAt);
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
                                    m33144(appendable, enumC5105M3376, iCodePointAt);
                                } else {
                                    int iOrdinal = enumC6446.ordinal();
                                    if (iOrdinal != 0) {
                                        if (iOrdinal != 1) {
                                            zCanEncode = charsetEncoderM3370.canEncode(c);
                                        }
                                    } else if (c >= 128) {
                                        zCanEncode = false;
                                    }
                                    if (!zCanEncode) {
                                        m33144(appendable, enumC5105M3376, iCodePointAt);
                                    } else {
                                        appendable.append(c);
                                    }
                                }
                            } else if (enumC5105M3376 != EnumC5105.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (!z) {
                            appendable.append("&gt;");
                        } else {
                            appendable.append(c);
                        }
                    } else if (!z || enumC5105M3376 == EnumC5105.xhtml || c2421.m3379() == EnumC20528.xml) {
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
                if (charsetEncoderM3370.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    m33144(appendable, enumC5105M3376, iCodePointAt);
                }
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33144(Appendable appendable, EnumC5105 enumC5105, int i) throws IOException {
        String strM10883 = enumC5105.m10883(i);
        if (!"".equals(strM10883)) {
            appendable.append('&').append(strM10883).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m33145(EnumC5105 enumC5105, String str, int i) {
        int i2;
        enumC5105.f11980 = new String[i];
        enumC5105.f11982 = new int[i];
        enumC5105.f11981 = new int[i];
        enumC5105.f11979 = new String[i];
        C19325 c19325 = new C19325(new StringReader(str), str.length());
        int i3 = 0;
        while (!c19325.m44031()) {
            try {
                String strM44025 = c19325.m44025(C0184a.f880h);
                c19325.m44028();
                int i4 = Integer.parseInt(c19325.m44027(f41379), 36);
                char cM44045 = c19325.m44045();
                c19325.m44028();
                if (cM44045 == ',') {
                    i2 = Integer.parseInt(c19325.m44025(';'), 36);
                    c19325.m44028();
                } else {
                    i2 = -1;
                }
                int i5 = Integer.parseInt(c19325.m44025('&'), 36);
                c19325.m44028();
                enumC5105.f11980[i3] = strM44025;
                enumC5105.f11982[i3] = i4;
                enumC5105.f11981[i5] = i4;
                enumC5105.f11979[i5] = strM44025;
                if (i2 != -1) {
                    f41380.put(strM44025, new String(new int[]{i4, i2}, 0, 2));
                }
                i3++;
            } catch (Throwable th) {
                c19325.m44039();
                throw th;
            }
        }
        if (!(i3 == i)) {
            throw new C15832("Unexpected count of entities loaded");
        }
        c19325.m44039();
    }
}
