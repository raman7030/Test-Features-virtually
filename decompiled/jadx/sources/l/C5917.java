package l;

import android.util.Base64DataException;
import android.util.Base64InputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.math.ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ۛ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5917 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16586(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == 11 || c == '\f' || c == '\r';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3095 m16583(final C6807 c6807, final C12972 c12972, CharSequence charSequence, int i, final C8034 c8034) throws C23821 {
        C11003.requireNonNull(c6807, "editView");
        int i2 = c12972.f38876;
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        InterfaceC17066 interfaceC17066M38504 = C16360.m38504(new InterfaceC17066() { // from class: l.֨۟ܿ
            @Override // l.InterfaceC17066
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo1526() {
                return c8034.f24774.m48562() || !c12972.m31539(c6807);
            }
        });
        m16589(interfaceC17066M38504);
        C18177 c18177 = c12972.f38873;
        C16765 c16765M42397 = c18177.m42397();
        try {
            if (c16765M42397.m39441() != c12972.f38874) {
                throw new C23821();
            }
            try {
                C16059 c16059M39444 = c16765M42397.m39444(interfaceC17066M38504);
                try {
                    C11122 c11122M42379 = c18177.m42379(c16059M39444);
                    try {
                        C10151 c10151 = new C10151(c11122M42379, i2, c12972.f38875, interfaceC17066M38504);
                        int iM16582 = m16582(charSequence, i, interfaceC17066M38504, c10151);
                        if (iM16582 < 0) {
                            C3095 c3095M9443 = C3095.m9443();
                            c11122M42379.close();
                            c16059M39444.close();
                            c16765M42397.close();
                            return c3095M9443;
                        }
                        c10151.m25489();
                        long j = ((long) i2) + ((long) iM16582);
                        int i3 = (int) j;
                        if (j != i3) {
                            throw new ArithmeticException();
                        }
                        c11122M42379.m27601(i3, i3);
                        if (!c11122M42379.m27600(interfaceC17066M38504)) {
                            throw new C23821();
                        }
                        C3095 c3095M9444 = C3095.m9444(iM16582, c18177.m42385());
                        c11122M42379.close();
                        c16059M39444.close();
                        c16765M42397.close();
                        return c3095M9444;
                    } catch (Throwable th) {
                        try {
                            c11122M42379.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c16059M39444.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IllegalStateException e) {
                if (interfaceC17066M38504.mo1526()) {
                    throw new C23821();
                }
                throw e;
            }
        } catch (Throwable th5) {
            c16765M42397.close();
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16582(CharSequence charSequence, int i, InterfaceC17066 interfaceC17066, C10151 c10151) throws IOException {
        boolean zM16587;
        boolean zM16588;
        int i2;
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        InterfaceC17066 interfaceC17066M38504 = C16360.m38504(interfaceC17066);
        C20029 c20029 = new C20029(c10151, interfaceC17066M38504);
        int i3 = 0;
        ?? r2 = 1;
        if (i == 0) {
            int length = charSequence.length();
            int i4 = 0;
            int i5 = -1;
            while (true) {
                if (i4 >= length) {
                    m16589(interfaceC17066M38504);
                    if (i5 >= 0) {
                        break;
                    }
                    i3 = 1;
                    break;
                }
                m16588(i4, interfaceC17066M38504);
                char cCharAt = charSequence.charAt(i4);
                if (!m16586(cCharAt)) {
                    int iDigit = Character.digit(cCharAt, 16);
                    if (iDigit < 0) {
                        break;
                    }
                    if (i5 < 0) {
                        i5 = iDigit;
                    } else {
                        c20029.m46163((i5 << 4) | iDigit);
                        i5 = -1;
                    }
                }
                i4++;
            }
            r2 = i3;
        } else if (i == 1) {
            zM16587 = m16587(charSequence, 10, interfaceC17066M38504, c20029);
        } else if (i == 2) {
            zM16588 = m16587(charSequence, 2, interfaceC17066M38504, c20029);
        } else if (i == 3) {
            int length2 = charSequence.length();
            while (i3 < length2) {
                m16588(i3, interfaceC17066M38504);
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 <= 127) {
                    c20029.m46163(cCharAt2);
                } else {
                    c20029.m46163(63);
                    if (Character.isHighSurrogate(cCharAt2) && (i2 = i3 + 1) < length2 && Character.isLowSurrogate(charSequence.charAt(i2))) {
                        i3 = i2;
                    }
                }
                i3++;
            }
            m16589(interfaceC17066M38504);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(C19370.m44628(i, "which = "));
            }
            byte[] bArr = new byte[1048576];
            try {
                Base64InputStream base64InputStream = new Base64InputStream(new C4506(charSequence, interfaceC17066M38504), 0);
                while (true) {
                    try {
                        int i6 = base64InputStream.read(bArr);
                        if (i6 == -1) {
                            break;
                        }
                        c20029.m46164(i6, bArr);
                        r2 = i3;
                    } catch (Throwable th) {
                        try {
                            base64InputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                m16589(interfaceC17066M38504);
                base64InputStream.close();
                i3 = 1;
                break;
            } catch (Base64DataException unused) {
            }
            r2 = i3;
        }
        if (r2 != 0) {
            r2 = zM16587;
            r2 = zM16588;
            return c20029.m46162();
        }
        r2 = zM16587;
        r2 = zM16588;
        return -1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m16587(CharSequence charSequence, int i, InterfaceC17066 interfaceC17066, C20029 c20029) throws C23821 {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        while (true) {
            boolean z = true;
            if (i2 > length) {
                break;
            }
            try {
                m16588(i2, interfaceC17066);
                if (i2 != length && !m16586(charSequence.charAt(i2))) {
                    z = false;
                }
                if (!z && i4 < 0) {
                    i4 = i2;
                } else if (z && i4 >= 0) {
                    c20029.m46163(m16581(charSequence, i4, i2, i, interfaceC17066));
                    i3++;
                    i4 = -1;
                }
                i2++;
            } catch (NumberFormatException unused) {
            }
        }
        m16589(interfaceC17066);
        return i3 != 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m16581(CharSequence charSequence, int i, int i2, int i3, InterfaceC17066 interfaceC17066) throws C23821 {
        boolean z;
        if (i >= i2) {
            throw new NumberFormatException();
        }
        char cCharAt = charSequence.charAt(i);
        int i4 = 0;
        if (cCharAt == '-' || cCharAt == '+') {
            z = cCharAt == '-';
            i++;
            if (i == i2) {
                throw new NumberFormatException();
            }
        } else {
            z = false;
        }
        int i5 = z ? Integer.MIN_VALUE : SecP160R1Field.PInv;
        int i6 = i5 / i3;
        while (i < i2) {
            m16588(i, interfaceC17066);
            int i7 = i + 1;
            int iDigit = Character.digit(charSequence.charAt(i), i3);
            if (iDigit < 0 || i4 < i6) {
                throw new NumberFormatException();
            }
            int i8 = i4 * i3;
            if (i8 < i5 + iDigit) {
                throw new NumberFormatException();
            }
            i4 = i8 - iDigit;
            i = i7;
        }
        return z ? i4 : -i4;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16588(int i, InterfaceC17066 interfaceC17066) throws C23821 {
        if ((i & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) == 0) {
            m16589(interfaceC17066);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m16589(InterfaceC17066 interfaceC17066) throws C23821 {
        if (interfaceC17066 != null && interfaceC17066.mo1526()) {
            throw new C23821();
        }
    }
}
