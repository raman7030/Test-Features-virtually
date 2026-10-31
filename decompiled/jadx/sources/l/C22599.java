package l;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Locale;

/* JADX INFO: renamed from: l.᩹᩺ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: O2H0 */
/* JADX INFO: loaded from: classes.dex */
public final class C22599 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC11581 f73046 = AbstractC11581.m28472('.');

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC11581 f73047 = AbstractC11581.m28472(':');

    static {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InetAddress m50577(String str) {
        C21894 c21894 = new C21894();
        byte[] bArrM50578 = m50578(c21894, str);
        if (bArrM50578 == null) {
            Locale locale = Locale.ROOT;
            throw new IllegalArgumentException(C4860.m14172("'", str, "' is not an IP string literal."));
        }
        String str2 = c21894.f70090;
        try {
            InetAddress byAddress = InetAddress.getByAddress(bArrM50578);
            if (str2 == null) {
                return byAddress;
            }
            C4025.m12109("Unexpected state, scope should only appear for ipv6", byAddress instanceof Inet6Address);
            Inet6Address inet6Address = (Inet6Address) byAddress;
            int length = str2.length();
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (i <= 214748364) {
                    int i3 = i * 10;
                    int iDigit = Character.digit(str2.charAt(i2), 10);
                    if (iDigit >= 0) {
                        i = i3 + iDigit;
                    }
                }
                i = -1;
            }
            if (i != -1) {
                return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), i);
            }
            try {
                NetworkInterface byName = NetworkInterface.getByName(str2);
                if (byName != null) {
                    return Inet6Address.getByAddress(inet6Address.getHostAddress(), inet6Address.getAddress(), byName);
                }
                Locale locale2 = Locale.ROOT;
                throw new IllegalArgumentException("No such interface: '" + str2 + "'");
            } catch (SocketException | UnknownHostException e) {
                throw new IllegalArgumentException("No such interface: " + str2, e);
            }
        } catch (UnknownHostException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m50579(String str) {
        return m50578(null, str) != null;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0148 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0088 A[PHI: r14
      0x0088: PHI (r14v1 java.lang.String) = (r14v0 java.lang.String), (r14v11 java.lang.String) binds: [B:22:0x0039, B:27:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:73:0x0108  */
    /* JADX WARN: Code duplicated, block: B:74:0x0109  */
    /* JADX WARN: Code duplicated, block: B:77:0x0110 A[Catch: NumberFormatException -> 0x015d, TryCatch #0 {NumberFormatException -> 0x015d, blocks: (B:71:0x0102, B:75:0x010a, B:77:0x0110, B:79:0x0116, B:80:0x011a, B:84:0x0123, B:93:0x0145, B:85:0x0129, B:91:0x0133, B:92:0x0141, B:94:0x0148, B:95:0x014d), top: B:105:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0116 A[Catch: NumberFormatException -> 0x015d, TryCatch #0 {NumberFormatException -> 0x015d, blocks: (B:71:0x0102, B:75:0x010a, B:77:0x0110, B:79:0x0116, B:80:0x011a, B:84:0x0123, B:93:0x0145, B:85:0x0129, B:91:0x0133, B:92:0x0141, B:94:0x0148, B:95:0x014d), top: B:105:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0120  */
    /* JADX WARN: Code duplicated, block: B:84:0x0123 A[Catch: NumberFormatException -> 0x015d, LOOP:3: B:83:0x0121->B:84:0x0123, LOOP_END, TryCatch #0 {NumberFormatException -> 0x015d, blocks: (B:71:0x0102, B:75:0x010a, B:77:0x0110, B:79:0x0116, B:80:0x011a, B:84:0x0123, B:93:0x0145, B:85:0x0129, B:91:0x0133, B:92:0x0141, B:94:0x0148, B:95:0x014d), top: B:105:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0129 A[Catch: NumberFormatException -> 0x015d, TryCatch #0 {NumberFormatException -> 0x015d, blocks: (B:71:0x0102, B:75:0x010a, B:77:0x0110, B:79:0x0116, B:80:0x011a, B:84:0x0123, B:93:0x0145, B:85:0x0129, B:91:0x0133, B:92:0x0141, B:94:0x0148, B:95:0x014d), top: B:105:0x0102 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x012d  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m50578(C21894 c21894, String str) {
        int i;
        int iMo25529;
        int i2;
        int i3;
        ByteBuffer byteBufferAllocate;
        int iIndexOf;
        int i4;
        int i5;
        int i6 = 0;
        boolean z = false;
        boolean z2 = false;
        while (true) {
            i = 1;
            if (i6 >= str.length()) {
                i6 = -1;
                break;
            }
            char cCharAt = str.charAt(i6);
            if (cCharAt == '.') {
                z = true;
            } else {
                if (cCharAt != ':') {
                    if (cCharAt == '%') {
                        break;
                    }
                    if (Character.digit(cCharAt, 16) == -1) {
                    }
                    return null;
                }
                if (z) {
                    return null;
                }
                z2 = true;
            }
            i6++;
        }
        if (z2) {
            if (z) {
                int iLastIndexOf = str.lastIndexOf(58) + 1;
                String strSubstring = str.substring(0, iLastIndexOf);
                byte[] bArrM50580 = m50580(str.substring(iLastIndexOf));
                str = bArrM50580 == null ? null : strSubstring + Integer.toHexString(((bArrM50580[0] & 255) << 8) | (bArrM50580[1] & 255)) + ":" + Integer.toHexString((bArrM50580[3] & 255) | ((bArrM50580[2] & 255) << 8));
                if (str != null) {
                    if (i6 != -1) {
                        if (c21894 != null) {
                            c21894.f70090 = str.substring(i6 + 1);
                        }
                        str = str.substring(0, i6);
                    }
                    iMo25529 = f73047.mo25529(str);
                    if (iMo25529 >= 2 && iMo25529 <= 8) {
                        int i7 = iMo25529 + 1;
                        i2 = 8 - i7;
                        boolean z3 = false;
                        for (i3 = 0; i3 < str.length() - 1; i3++) {
                            if (str.charAt(i3) != ':' && str.charAt(i3 + 1) == ':') {
                                if (!z3) {
                                    int i8 = i2 + 1;
                                    if (i3 == 0) {
                                        i8 = i2 + 2;
                                    }
                                    if (i3 == str.length() - 2) {
                                        i8++;
                                    }
                                    i2 = i8;
                                    z3 = true;
                                }
                            }
                        }
                        if ((str.charAt(0) == ':' || str.charAt(1) == ':') && ((C7416.m19937(1, str) != ':' || C7416.m19937(2, str) == ':') && ((!z3 || i2 > 0) && (z3 || i7 == 8)))) {
                            byteBufferAllocate = ByteBuffer.allocate(16);
                            try {
                                if (str.charAt(0) != ':') {
                                    i = 0;
                                }
                                while (i < str.length()) {
                                    iIndexOf = str.indexOf(58, i);
                                    if (iIndexOf == -1) {
                                        iIndexOf = str.length();
                                    }
                                    if (str.charAt(i) == ':') {
                                        for (i5 = 0; i5 < i2; i5++) {
                                            byteBufferAllocate.putShort((short) 0);
                                        }
                                    } else {
                                        i4 = iIndexOf - i;
                                        if (i4 > 0 || i4 > 4) {
                                            throw new NumberFormatException();
                                        }
                                        int iDigit = 0;
                                        while (i < iIndexOf) {
                                            iDigit = (iDigit << 4) | Character.digit(str.charAt(i), 16);
                                            i++;
                                        }
                                        byteBufferAllocate.putShort((short) iDigit);
                                    }
                                    i = iIndexOf + 1;
                                }
                                return byteBufferAllocate.array();
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
            } else {
                if (i6 != -1) {
                    if (c21894 != null) {
                        c21894.f70090 = str.substring(i6 + 1);
                    }
                    str = str.substring(0, i6);
                }
                iMo25529 = f73047.mo25529(str);
                if (iMo25529 >= 2) {
                    int i9 = iMo25529 + 1;
                    i2 = 8 - i9;
                    boolean z4 = false;
                    while (i3 < str.length() - 1) {
                        if (str.charAt(i3) != ':') {
                        }
                    }
                    if (str.charAt(0) == ':') {
                        byteBufferAllocate = ByteBuffer.allocate(16);
                        if (str.charAt(0) != ':') {
                            i = 0;
                        }
                        while (i < str.length()) {
                            iIndexOf = str.indexOf(58, i);
                            if (iIndexOf == -1) {
                                iIndexOf = str.length();
                            }
                            if (str.charAt(i) == ':') {
                                i4 = iIndexOf - i;
                                if (i4 > 0) {
                                }
                                throw new NumberFormatException();
                            }
                            while (i5 < i2) {
                                byteBufferAllocate.putShort((short) 0);
                            }
                            i = iIndexOf + 1;
                        }
                        return byteBufferAllocate.array();
                    }
                    byteBufferAllocate = ByteBuffer.allocate(16);
                    if (str.charAt(0) != ':') {
                        i = 0;
                    }
                    while (i < str.length()) {
                        iIndexOf = str.indexOf(58, i);
                        if (iIndexOf == -1) {
                            iIndexOf = str.length();
                        }
                        if (str.charAt(i) == ':') {
                            i4 = iIndexOf - i;
                            if (i4 > 0) {
                            }
                            throw new NumberFormatException();
                        }
                        while (i5 < i2) {
                            byteBufferAllocate.putShort((short) 0);
                        }
                        i = iIndexOf + 1;
                    }
                    return byteBufferAllocate.array();
                }
            }
        } else if (z && i6 == -1) {
            return m50580(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static byte[] m50580(String str) {
        if (f73046.mo25529(str) + 1 != 4) {
            return null;
        }
        byte[] bArr = new byte[4];
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int iIndexOf = str.indexOf(46, i);
            if (iIndexOf == -1) {
                iIndexOf = str.length();
            }
            try {
                bArr[i2] = m50576(i, iIndexOf, str);
                i = iIndexOf + 1;
            } catch (NumberFormatException unused) {
                return null;
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte m50576(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 <= 0 || i3 > 3) {
            throw new NumberFormatException();
        }
        if (i3 > 1 && str.charAt(i) == '0') {
            throw new NumberFormatException();
        }
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 * 10;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new NumberFormatException();
            }
            i4 = i5 + iDigit;
            i++;
        }
        if (i4 <= 255) {
            return (byte) i4;
        }
        throw new NumberFormatException();
    }
}
