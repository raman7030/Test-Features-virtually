package l;

import com.alipay.sdk.m.w.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.᩶۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C20032 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Pattern f64883;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final byte[] f64884;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Charset f64885;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C11816 f64886;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Method f64887;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C11816 f64888;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Charset f64889;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final C11816 f64890;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC2393 f64891;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final TimeZone f64892;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C11816 f64893;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final AbstractC0275 f64894;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Comparator f64895;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final String[] f64896 = new String[0];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Charset f64897;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final C11816 f64898;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Charset f64899;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Charset f64900;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46166(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46184(InterfaceC1274 interfaceC1274, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jMo20331 = interfaceC1274.mo4333().mo20333() ? interfaceC1274.mo4333().mo20331() - jNanoTime : Long.MAX_VALUE;
        interfaceC1274.mo4333().mo20326(Math.min(jMo20331, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C12521 c12521 = new C12521();
            while (interfaceC1274.mo4334(c12521, 8192L) != -1) {
                c12521.m30706();
            }
            if (jMo20331 == C13132.FOREVER_NS) {
                interfaceC1274.mo4333().mo20325();
                return true;
            }
            interfaceC1274.mo4333().mo20326(jNanoTime + jMo20331);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo20331 == C13132.FOREVER_NS) {
                interfaceC1274.mo4333().mo20325();
                return false;
            }
            interfaceC1274.mo4333().mo20326(jNanoTime + jMo20331);
            return false;
        } catch (Throwable th) {
            if (jMo20331 == C13132.FOREVER_NS) {
                interfaceC1274.mo4333().mo20325();
            } else {
                interfaceC1274.mo4333().mo20326(jNanoTime + jMo20331);
            }
            throw th;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f64884 = bArr;
        C12521 c12521 = new C12521();
        c12521.write(bArr, 0, 0);
        Method declaredMethod = null;
        f64894 = AbstractC0275.m1609(null, 0, c12521);
        f64891 = AbstractC2393.m7755((C13864) null, bArr);
        f64898 = C11816.m28898("efbbbf");
        f64888 = C11816.m28898("feff");
        f64890 = C11816.m28898("fffe");
        f64893 = C11816.m28898("0000ffff");
        f64886 = C11816.m28898("ffff0000");
        f64897 = Charset.forName(a.D);
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        f64900 = Charset.forName("UTF-16BE");
        f64899 = Charset.forName("UTF-16LE");
        f64889 = Charset.forName("UTF-32BE");
        f64885 = Charset.forName("UTF-32LE");
        f64892 = C3261.getTimeZone("GMT");
        f64895 = new C21443();
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f64887 = declaredMethod;
        f64883 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46180(Throwable th, IOException iOException) {
        Method method = f64887;
        if (method != null) {
            try {
                method.invoke(th, iOException);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46183(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46179(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m46181(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m46182(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (!"bio == null".equals(e2.getMessage())) {
                    throw e2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m46175(List list) {
        return C20195.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m46176(Object... objArr) {
        return C20195.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ThreadFactory m46177(String str, boolean z) {
        return new ThreadFactoryC22148(str, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String[] m46185(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m46188(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46172(C11749 c11749, boolean z) {
        String strM28773;
        if (c11749.m28773().contains(":")) {
            strM28773 = "[" + c11749.m28773() + "]";
        } else {
            strM28773 = c11749.m28773();
        }
        if (!z && c11749.m28771() == C11749.m28762(c11749.m28767())) {
            return strM28773;
        }
        StringBuilder sbM19190 = C7166.m19190(strM28773, ":");
        sbM19190.append(c11749.m28771());
        return sbM19190.toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m46182(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m46186(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static int m46189(int i, int i2, String str) {
        while (true) {
            i2--;
            if (i2 < i) {
                return i;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46169(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46168(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m46171(String str) {
        int i = -1;
        int i2 = 0;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i2 < lowerCase.length()) {
                    char cCharAt = lowerCase.charAt(i2);
                    if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                        return null;
                    }
                    i2++;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM46173 = (str.startsWith("[") && str.endsWith("]")) ? m46173(1, str.length() - 1, str) : m46173(0, str.length(), str);
        if (inetAddressM46173 == null) {
            return null;
        }
        byte[] address = inetAddressM46173.getAddress();
        if (address.length != 16) {
            throw new AssertionError(C4860.m14172("Invalid IPv6 address: '", str, "'"));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < address.length) {
            int i5 = i3;
            while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C12521 c12521 = new C12521();
        while (i2 < address.length) {
            if (i2 == i) {
                c12521.m30720writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    c12521.m30720writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c12521.m30720writeByte(58);
                }
                c12521.m30712(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c12521.m30714();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m46187(String str) {
        return f64883.matcher(str).matches();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Charset m46174(InterfaceC6171 interfaceC6171, Charset charset) {
        C11816 c11816 = f64898;
        if (interfaceC6171.mo12311(c11816)) {
            interfaceC6171.skip(c11816.mo2336());
            return f64897;
        }
        C11816 c11817 = f64888;
        if (interfaceC6171.mo12311(c11817)) {
            interfaceC6171.skip(c11817.mo2336());
            return f64900;
        }
        C11816 c11818 = f64890;
        if (interfaceC6171.mo12311(c11818)) {
            interfaceC6171.skip(c11818.mo2336());
            return f64899;
        }
        C11816 c11819 = f64893;
        if (interfaceC6171.mo12311(c11819)) {
            interfaceC6171.skip(c11819.mo2336());
            return f64889;
        }
        C11816 c118110 = f64886;
        if (!interfaceC6171.mo12311(c118110)) {
            return charset;
        }
        interfaceC6171.skip(c118110.mo2336());
        return f64885;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m46167(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.");
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AssertionError m46170(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[LOOP:1: B:55:0x0095->B:59:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a8 A[EDGE_INSN: B:85:0x00a8->B:60:0x00a8 BREAK  A[LOOP:1: B:55:0x0095->B:59:0x00a2], SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InetAddress m46173(int i, int i2, String str) {
        int i3;
        int i4;
        int iM46166;
        byte[] bArr = new byte[16];
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i < i2) {
            if (i5 == 16) {
                return null;
            }
            int i8 = i + 2;
            if (i8 <= i2 && str.regionMatches(i, "::", 0, 2)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                i = i7;
                i3 = 0;
                while (i < i2) {
                    iM46166 = m46166(str.charAt(i));
                    if (iM46166 == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM46166;
                    i++;
                }
                i4 = i - i7;
                return i4 == 0 ? null : null;
            }
            if (i5 != 0) {
                if (!str.regionMatches(i, ":", 0, 1)) {
                    if (!str.regionMatches(i, ".", 0, 1)) {
                        return null;
                    }
                    int i9 = i5 - 2;
                    int i10 = i9;
                    while (i7 < i2) {
                        if (i10 == 16) {
                            return null;
                        }
                        if (i10 != i9) {
                            if (str.charAt(i7) != '.') {
                                return null;
                            }
                            i7++;
                        }
                        int i11 = i7;
                        int i12 = 0;
                        while (i11 < i2) {
                            char cCharAt = str.charAt(i11);
                            if (cCharAt < '0' || cCharAt > '9') {
                                break;
                            }
                            if ((i12 == 0 && i7 != i11) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i11++;
                        }
                        if (i11 - i7 == 0) {
                            return null;
                        }
                        bArr[i10] = (byte) i12;
                        i10++;
                        i7 = i11;
                    }
                    if (i10 == i5 + 2) {
                        i5 += 2;
                        break;
                    }
                    return null;
                }
                i++;
            }
            i7 = i;
            i = i7;
            i3 = 0;
            while (i < i2) {
                iM46166 = m46166(str.charAt(i));
                if (iM46166 == -1) {
                    break;
                }
                i3 = (i3 << 4) + iM46166;
                i++;
            }
            i4 = i - i7;
            if (i4 == 0 && i4 <= 4) {
                int i13 = i5 + 1;
                bArr[i5] = (byte) (255 & (i3 >>> 8));
                i5 += 2;
                bArr[i13] = (byte) (i3 & 255);
            }
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i14 = i5 - i6;
            System.arraycopy(bArr, i6, bArr, 16 - i14, i14);
            Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10338 m46178(ArrayList arrayList) {
        C12454 c12454 = new C12454();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C7150 c7150 = (C7150) it.next();
            AbstractC8037.f24775.mo21353(c12454, c7150.f21948.mo2335(), c7150.f21949.mo2335());
        }
        return c12454.m30612();
    }
}
