package p067l;

import com.alipay.sdk.p010m.p055w.C0233a;
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
public final class C21407 {

    /* JADX INFO: renamed from: ֡ */
    public static final Pattern f67525;

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f67526;

    /* JADX INFO: renamed from: ۖ */
    public static final Charset f67527;

    /* JADX INFO: renamed from: ۘ */
    public static final C13598 f67528;

    /* JADX INFO: renamed from: ۚ */
    public static final Method f67529;

    /* JADX INFO: renamed from: ۜ */
    public static final C13598 f67530;

    /* JADX INFO: renamed from: ۡ */
    public static final Charset f67531;

    /* JADX INFO: renamed from: ۢ */
    public static final C13598 f67532;

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC4643 f67533;

    /* JADX INFO: renamed from: ܳ */
    public static final TimeZone f67534;

    /* JADX INFO: renamed from: ܺ */
    public static final C13598 f67535;

    /* JADX INFO: renamed from: ܽ */
    public static final AbstractC2630 f67536;

    /* JADX INFO: renamed from: ܿ */
    public static final Comparator f67537;

    /* JADX INFO: renamed from: ᩳ */
    public static final String[] f67538 = new String[0];

    /* JADX INFO: renamed from: ᩴ */
    public static final Charset f67539;

    /* JADX INFO: renamed from: ᩵ */
    public static final C13598 f67540;

    /* JADX INFO: renamed from: ᩷ */
    public static final Charset f67541;

    /* JADX INFO: renamed from: ᩻ */
    public static final Charset f67542;

    /* JADX INFO: renamed from: ֫ */
    public static int m48482(char c) {
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

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48500(InterfaceC3579 interfaceC3579, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jMo22308 = interfaceC3579.mo6579().mo22310() ? interfaceC3579.mo6579().mo22308() - jNanoTime : Long.MAX_VALUE;
        interfaceC3579.mo6579().mo22303(Math.min(jMo22308, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C14268 c14268 = new C14268();
            while (interfaceC3579.mo6580(c14268, 8192L) != -1) {
                c14268.m32780();
            }
            if (jMo22308 == C14849.FOREVER_NS) {
                interfaceC3579.mo6579().mo22302();
                return true;
            }
            interfaceC3579.mo6579().mo22303(jNanoTime + jMo22308);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo22308 == C14849.FOREVER_NS) {
                interfaceC3579.mo6579().mo22302();
                return false;
            }
            interfaceC3579.mo6579().mo22303(jNanoTime + jMo22308);
            return false;
        } catch (Throwable th) {
            if (jMo22308 == C14849.FOREVER_NS) {
                interfaceC3579.mo6579().mo22302();
            } else {
                interfaceC3579.mo6579().mo22303(jNanoTime + jMo22308);
            }
            throw th;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f67526 = bArr;
        C14268 c14268 = new C14268();
        c14268.write(bArr, 0, 0);
        Method declaredMethod = null;
        f67536 = AbstractC2630.m4009(null, 0, c14268);
        f67533 = AbstractC4643.m9818((C15545) null, bArr);
        f67540 = C13598.m30947("efbbbf");
        f67530 = C13598.m30947("feff");
        f67532 = C13598.m30947("fffe");
        f67535 = C13598.m30947("0000ffff");
        f67528 = C13598.m30947("ffff0000");
        f67539 = Charset.forName(C0233a.f1077D);
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        f67542 = Charset.forName("UTF-16BE");
        f67541 = Charset.forName("UTF-16LE");
        f67531 = Charset.forName("UTF-32BE");
        f67527 = Charset.forName("UTF-32LE");
        f67534 = C5468.getTimeZone("GMT");
        f67537 = new C22748();
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f67529 = declaredMethod;
        f67525 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48496(Throwable th, IOException iOException) {
        Method method = f67529;
        if (method != null) {
            try {
                method.invoke(th, iOException);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48499(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48495(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m48497(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m48498(e)) {
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

    /* JADX INFO: renamed from: ֫ */
    public static List m48491(List list) {
        return C21562.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m48492(Object... objArr) {
        return C21562.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static ThreadFactory m48493(String str, boolean z) {
        return new ThreadFactoryC23418(str, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String[] m48501(Comparator comparator, String[] strArr, String[] strArr2) {
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

    /* JADX INFO: renamed from: ۧ */
    public static boolean m48504(Comparator comparator, String[] strArr, String[] strArr2) {
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

    /* JADX INFO: renamed from: ֫ */
    public static String m48488(C13535 c13535, boolean z) {
        String strM30820;
        if (c13535.m30820().contains(":")) {
            strM30820 = "[" + c13535.m30820() + "]";
        } else {
            strM30820 = c13535.m30820();
        }
        if (!z && c13535.m30818() == C13535.m30809(c13535.m30814())) {
            return strM30820;
        }
        StringBuilder sbM21133 = C9179.m21133(strM30820, ":");
        sbM21133.append(c13535.m30818());
        return sbM21133.toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m48498(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m48502(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ܽ */
    public static int m48505(int i, int i2, String str) {
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

    /* JADX INFO: renamed from: ֫ */
    public static int m48485(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m48484(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m48487(String str) {
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
        InetAddress inetAddressM48489 = (str.startsWith("[") && str.endsWith("]")) ? m48489(1, str.length() - 1, str) : m48489(0, str.length(), str);
        if (inetAddressM48489 == null) {
            return null;
        }
        byte[] address = inetAddressM48489.getAddress();
        if (address.length != 16) {
            throw new AssertionError(C6988.m16053("Invalid IPv6 address: '", str, "'"));
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
        C14268 c14268 = new C14268();
        while (i2 < address.length) {
            if (i2 == i) {
                c14268.m56480writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    c14268.m56480writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c14268.m56480writeByte(58);
                }
                c14268.m32786(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c14268.m32788();
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m48503(String str) {
        return f67525.matcher(str).matches();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Charset m48490(InterfaceC8233 interfaceC8233, Charset charset) {
        C13598 c13598 = f67540;
        if (interfaceC8233.mo14216(c13598)) {
            interfaceC8233.skip(c13598.mo4707());
            return f67539;
        }
        C13598 c13599 = f67530;
        if (interfaceC8233.mo14216(c13599)) {
            interfaceC8233.skip(c13599.mo4707());
            return f67542;
        }
        C13598 c135910 = f67532;
        if (interfaceC8233.mo14216(c135910)) {
            interfaceC8233.skip(c135910.mo4707());
            return f67541;
        }
        C13598 c135911 = f67535;
        if (interfaceC8233.mo14216(c135911)) {
            interfaceC8233.skip(c135911.mo4707());
            return f67531;
        }
        C13598 c135912 = f67528;
        if (!interfaceC8233.mo14216(c135912)) {
            return charset;
        }
        interfaceC8233.skip(c135912.mo4707());
        return f67527;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m48483(long j, TimeUnit timeUnit) {
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

    /* JADX INFO: renamed from: ֫ */
    public static AssertionError m48486(String str, Exception exc) {
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
    /* JADX INFO: renamed from: ֫ */
    public static InetAddress m48489(int i, int i2, String str) {
        int i3;
        int i4;
        int iM48482;
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
                    iM48482 = m48482(str.charAt(i));
                    if (iM48482 == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM48482;
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
                iM48482 = m48482(str.charAt(i));
                if (iM48482 == -1) {
                    break;
                }
                i3 = (i3 << 4) + iM48482;
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

    /* JADX INFO: renamed from: ֫ */
    public static C12194 m48494(ArrayList arrayList) {
        C14205 c14205 = new C14205();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C9163 c9163 = (C9163) it.next();
            AbstractC10007.f27689.mo23320(c14205, c9163.f24827.mo4706(), c9163.f24828.mo4706());
        }
        return c14205.m32677();
    }
}
