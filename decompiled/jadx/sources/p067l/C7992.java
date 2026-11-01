package p067l;

import android.util.Base64DataException;
import android.util.Base64InputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1RelativeOID;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.math.p080ec.custom.sec.SecP160R1Field;

/* JADX INFO: renamed from: l.ۛ۟ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7992 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m18512(char c) {
        return c == ' ' || c == '\t' || c == '\n' || c == 11 || c == '\f' || c == '\r';
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5310 m18509(final C8838 c8838, final C14697 c14697, CharSequence charSequence, int i, final C10004 c10004) throws C25008 {
        C12826.requireNonNull(c8838, "editView");
        int i2 = c14697.f41920;
        C12826.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(new InterfaceC18588() { // from class: l.֨۟ܿ
            @Override // p067l.InterfaceC18588
            /* JADX INFO: renamed from: ᩻ */
            public final boolean mo3924() {
                return c10004.f27687.m50899() || !c14697.m33624(c8838);
            }
        });
        m18515(interfaceC18588M40721);
        C19644 c19644 = c14697.f41917;
        C18302 c18302M44658 = c19644.m44658();
        try {
            if (c18302M44658.m41677() != c14697.f41918) {
                throw new C25008();
            }
            try {
                C17631 c17631M41680 = c18302M44658.m41680(interfaceC18588M40721);
                try {
                    C12939 c12939M44640 = c19644.m44640(c17631M41680);
                    try {
                        C12016 c12016 = new C12016(c12939M44640, i2, c14697.f41919, interfaceC18588M40721);
                        int iM18508 = m18508(charSequence, i, interfaceC18588M40721, c12016);
                        if (iM18508 < 0) {
                            C5310 c5310M11486 = C5310.m11486();
                            c12939M44640.close();
                            c17631M41680.close();
                            c18302M44658.close();
                            return c5310M11486;
                        }
                        c12016.m27508();
                        long j = ((long) i2) + ((long) iM18508);
                        int i3 = (int) j;
                        if (j != i3) {
                            throw new ArithmeticException();
                        }
                        c12939M44640.m29663(i3, i3);
                        if (!c12939M44640.m29662(interfaceC18588M40721)) {
                            throw new C25008();
                        }
                        C5310 c5310M11487 = C5310.m11487(iM18508, c19644.m44646());
                        c12939M44640.close();
                        c17631M41680.close();
                        c18302M44658.close();
                        return c5310M11487;
                    } catch (Throwable th) {
                        try {
                            c12939M44640.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        c17631M41680.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (IllegalStateException e) {
                if (interfaceC18588M40721.mo3924()) {
                    throw new C25008();
                }
                throw e;
            }
        } catch (Throwable th5) {
            c18302M44658.close();
            throw th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX INFO: renamed from: ֫ */
    public static int m18508(CharSequence charSequence, int i, InterfaceC18588 interfaceC18588, C12016 c12016) throws IOException {
        boolean zM18513;
        boolean zM18514;
        int i2;
        C12826.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(interfaceC18588);
        C21404 c21404 = new C21404(c12016, interfaceC18588M40721);
        int i3 = 0;
        ?? r2 = 1;
        if (i == 0) {
            int length = charSequence.length();
            int i4 = 0;
            int i5 = -1;
            while (true) {
                if (i4 >= length) {
                    m18515(interfaceC18588M40721);
                    if (i5 >= 0) {
                        break;
                    }
                    i3 = 1;
                    break;
                }
                m18514(i4, interfaceC18588M40721);
                char cCharAt = charSequence.charAt(i4);
                if (!m18512(cCharAt)) {
                    int iDigit = Character.digit(cCharAt, 16);
                    if (iDigit < 0) {
                        break;
                    }
                    if (i5 < 0) {
                        i5 = iDigit;
                    } else {
                        c21404.m48479((i5 << 4) | iDigit);
                        i5 = -1;
                    }
                }
                i4++;
            }
            r2 = i3;
        } else if (i == 1) {
            zM18513 = m18513(charSequence, 10, interfaceC18588M40721, c21404);
        } else if (i == 2) {
            zM18514 = m18513(charSequence, 2, interfaceC18588M40721, c21404);
        } else if (i == 3) {
            int length2 = charSequence.length();
            while (i3 < length2) {
                m18514(i3, interfaceC18588M40721);
                char cCharAt2 = charSequence.charAt(i3);
                if (cCharAt2 <= 127) {
                    c21404.m48479(cCharAt2);
                } else {
                    c21404.m48479(63);
                    if (Character.isHighSurrogate(cCharAt2) && (i2 = i3 + 1) < length2 && Character.isLowSurrogate(charSequence.charAt(i2))) {
                        i3 = i2;
                    }
                }
                i3++;
            }
            m18515(interfaceC18588M40721);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(C20778.m46922(i, "which = "));
            }
            byte[] bArr = new byte[1048576];
            try {
                Base64InputStream base64InputStream = new Base64InputStream(new C6651(charSequence, interfaceC18588M40721), 0);
                while (true) {
                    try {
                        int i6 = base64InputStream.read(bArr);
                        if (i6 == -1) {
                            break;
                        }
                        c21404.m48480(i6, bArr);
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
                m18515(interfaceC18588M40721);
                base64InputStream.close();
                i3 = 1;
                break;
            } catch (Base64DataException unused) {
            }
            r2 = i3;
        }
        if (r2 != 0) {
            r2 = zM18513;
            r2 = zM18514;
            return c21404.m48478();
        }
        r2 = zM18513;
        r2 = zM18514;
        return -1;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m18513(CharSequence charSequence, int i, InterfaceC18588 interfaceC18588, C21404 c21404) throws C25008 {
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
                m18514(i2, interfaceC18588);
                if (i2 != length && !m18512(charSequence.charAt(i2))) {
                    z = false;
                }
                if (!z && i4 < 0) {
                    i4 = i2;
                } else if (z && i4 >= 0) {
                    c21404.m48479(m18507(charSequence, i4, i2, i, interfaceC18588));
                    i3++;
                    i4 = -1;
                }
                i2++;
            } catch (NumberFormatException unused) {
            }
        }
        m18515(interfaceC18588);
        return i3 != 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m18507(CharSequence charSequence, int i, int i2, int i3, InterfaceC18588 interfaceC18588) throws C25008 {
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
            m18514(i, interfaceC18588);
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

    /* JADX INFO: renamed from: ۧ */
    public static void m18514(int i, InterfaceC18588 interfaceC18588) throws C25008 {
        if ((i & ASN1RelativeOID.MAX_IDENTIFIER_LENGTH) == 0) {
            m18515(interfaceC18588);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m18515(InterfaceC18588 interfaceC18588) throws C25008 {
        if (interfaceC18588 != null && interfaceC18588.mo3924()) {
            throw new C25008();
        }
    }
}
