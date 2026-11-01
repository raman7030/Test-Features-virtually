package p067l;

import com.umeng.analytics.pro.C0655am;
import com.umeng.analytics.pro.C0684bo;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Vector;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.Base32Encoder;
import org.bouncycastle.util.encoders.UTF8;

/* JADX INFO: renamed from: l.᩵ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes4.dex */
public final class C20764 {

    /* JADX INFO: renamed from: ֫ */
    public static final byte[] f65271;

    /* JADX INFO: renamed from: ۧ */
    public static String[] f65272;

    /* JADX INFO: renamed from: ܽ */
    public static final byte[] f65273;

    /* JADX INFO: renamed from: ֫ */
    public static int m46878(byte b) {
        if (((byte) (b & GCMSIVBlockCipher.MASK)) == 0) {
            return 1;
        }
        if (((byte) (b & C0684bo.f2506k)) == -64) {
            return 2;
        }
        return ((byte) (b & 240)) == -32 ? 3 : 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte m46889(byte b) {
        if (b == 61) {
            return (byte) 0;
        }
        int i = 0;
        while (true) {
            byte[] bArr = f65271;
            if (i >= bArr.length) {
                return (byte) 0;
            }
            if (b == bArr[i]) {
                return (byte) i;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m46892(int i, int i2, byte[] bArr) throws C14392 {
        try {
            byte[] bArr2 = new byte[i2];
            int i3 = 0;
            for (int i4 = i; i4 < i + i2; i4 += 4) {
                int i5 = i4 + 1;
                bArr2[i3] = (byte) ((m46889(bArr[i4]) << 2) | ((m46889(bArr[i5]) & UTF8.S_P3A) >>> 4));
                int i6 = i4 + 2;
                if (bArr[i6] == 61) {
                    i3++;
                    break;
                }
                bArr2[i3 + 1] = (byte) (((m46889(bArr[i5]) & 15) << 4) | ((m46889(bArr[i6]) & 60) >>> 2));
                int i7 = i4 + 3;
                if (bArr[i7] == 61) {
                    i3 += 2;
                    break;
                }
                bArr2[i3 + 2] = (byte) (((m46889(bArr[i6]) & 3) << 6) | (m46889(bArr[i7]) & 63));
                i3 += 3;
            }
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr2, 0, bArr3, 0, i3);
            return bArr3;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C14392("fromBase64: invalid base64 data", e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x007d A[PHI: r11
      0x007d: PHI (r11v12 int) = (r11v11 int), (r11v17 int) binds: [B:14:0x00ad, B:9:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ֫ */
    public static byte[] m46887(byte[] bArr, int i, boolean z) {
        byte[] bArr2;
        int i2;
        byte[] bArr3 = new byte[i * 2];
        int i3 = (i / 3) * 3;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            bArr2 = f65271;
            if (i4 >= i3) {
                break;
            }
            bArr3[i5] = bArr2[(bArr[i4] >>> 2) & 63];
            int i6 = i4 + 1;
            bArr3[i5 + 1] = bArr2[((bArr[i4] & 3) << 4) | ((bArr[i6] >>> 4) & 15)];
            int i7 = i4 + 2;
            int i8 = ((bArr[i6] & 15) << 2) | ((bArr[i7] >>> 6) & 3);
            int i9 = i5 + 3;
            bArr3[i5 + 2] = bArr2[i8];
            i5 += 4;
            bArr3[i9] = bArr2[bArr[i7] & 63];
            i4 += 3;
        }
        int i10 = i - i3;
        if (i10 == 1) {
            bArr3[i5] = bArr2[(bArr[i4] >>> 2) & 63];
            i2 = i5 + 2;
            bArr3[i5 + 1] = bArr2[((bArr[i4] & 3) << 4) & 63];
            if (z) {
                int i11 = i5 + 3;
                bArr3[i2] = Base32Encoder.DEFAULT_PADDING;
                i5 += 4;
                bArr3[i11] = Base32Encoder.DEFAULT_PADDING;
            } else {
                i5 = i2;
            }
        } else if (i10 == 2) {
            bArr3[i5] = bArr2[(bArr[i4] >>> 2) & 63];
            int i12 = (bArr[i4] & 3) << 4;
            int i13 = i4 + 1;
            bArr3[i5 + 1] = bArr2[i12 | ((bArr[i13] >>> 4) & 15)];
            i2 = i5 + 3;
            bArr3[i5 + 2] = bArr2[((bArr[i13] & 15) << 2) & 63];
            if (z) {
                i5 += 4;
                bArr3[i2] = Base32Encoder.DEFAULT_PADDING;
            } else {
                i5 = i2;
            }
        }
        byte[] bArr4 = new byte[i5];
        System.arraycopy(bArr3, 0, bArr4, 0, i5);
        return bArr4;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m46896(byte[] bArr, byte[] bArr2) {
        if (bArr2.length > 0 && bArr2[0] == 46) {
            if (bArr.length <= 0 || bArr[0] != 46) {
                return false;
            }
            if (bArr.length == 2 && bArr[1] == 42) {
                return true;
            }
            return m46884(1, 1, bArr, bArr2);
        }
        return m46884(0, 0, bArr, bArr2);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46884(int i, int i2, byte[] bArr, byte[] bArr2) {
        byte b;
        int iM46878;
        int length = bArr.length;
        if (length == 0) {
            return false;
        }
        int length2 = bArr2.length;
        while (i < length && i2 < length2) {
            byte b2 = bArr[i];
            if (b2 == 92) {
                int i3 = i + 1;
                if (i3 == length || (b = bArr[i3]) != bArr2[i2]) {
                    return false;
                }
                i = i3 + m46878(b);
                iM46878 = m46878(bArr2[i2]);
            } else {
                if (b2 == 42) {
                    while (i < length && bArr[i] == 42) {
                        i++;
                    }
                    if (length == i) {
                        return true;
                    }
                    byte b3 = bArr[i];
                    if (b3 == 63) {
                        while (i2 < length2) {
                            if (m46884(i, i2, bArr, bArr2)) {
                                return true;
                            }
                            i2 += m46878(bArr2[i2]);
                        }
                        return false;
                    }
                    if (b3 != 92) {
                        while (i2 < length2) {
                            if (b3 == bArr2[i2] && m46884(i, i2, bArr, bArr2)) {
                                return true;
                            }
                            i2 += m46878(bArr2[i2]);
                        }
                        return false;
                    }
                    int i4 = i + 1;
                    if (i4 == length) {
                        return false;
                    }
                    byte b4 = bArr[i4];
                    while (i2 < length2) {
                        if (b4 == bArr2[i2] && m46884(m46878(b4) + i4, m46878(bArr2[i2]) + i2, bArr, bArr2)) {
                            return true;
                        }
                        i2 += m46878(bArr2[i2]);
                    }
                    return false;
                }
                if (b2 == 63) {
                    i++;
                    iM46878 = m46878(bArr2[i2]);
                } else {
                    if (b2 != bArr2[i2]) {
                        return false;
                    }
                    i += m46878(b2);
                    i2 += m46878(bArr2[i2]);
                    if (i2 < length2) {
                        continue;
                    } else {
                        if (i >= length) {
                            return true;
                        }
                        if (bArr[i] == 42) {
                            break;
                        }
                    }
                }
            }
            i2 += iM46878;
        }
        if (i == length && i2 == length2) {
            return true;
        }
        if (i2 < length2 || bArr[i] != 42) {
            return false;
        }
        while (i < length) {
            int i5 = i + 1;
            if (bArr[i] != 42) {
                return false;
            }
            i = i5;
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static byte[] m46897(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (bArr[i] == 92) {
                int i2 = i + 1;
                if (i2 == length) {
                    break;
                }
                System.arraycopy(bArr, i2, bArr, i, bArr.length - i2);
                length--;
                i = i2;
            } else {
                i++;
            }
        }
        if (length == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46881(InterfaceC5005 interfaceC5005, byte[] bArr) {
        try {
            interfaceC5005.init();
            interfaceC5005.mo3552(bArr.length, bArr);
            byte[] bArrMo3553 = interfaceC5005.mo3553();
            StringBuilder sb = new StringBuilder();
            sb.append(interfaceC5005.name());
            sb.append(":");
            int i = 0;
            if (interfaceC5005.name().equals("MD5")) {
                while (i < bArrMo3553.length) {
                    byte b = bArrMo3553[i];
                    String[] strArr = f65272;
                    sb.append(strArr[((b & 255) >>> 4) & 15]);
                    sb.append(strArr[b & 15]);
                    i++;
                    if (i < bArrMo3553.length) {
                        sb.append(":");
                    }
                }
            } else {
                byte[] bArrM46887 = m46887(bArrMo3553, bArrMo3553.length, false);
                sb.append(m46879(0, bArrM46887.length, bArrM46887));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "???";
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m46885(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Socket m46883(int i, int i2, String str) throws C14392 {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(str, i), i2);
            return socket;
        } catch (Exception e) {
            try {
                socket.close();
            } catch (Exception unused) {
            }
            throw new C14392(e instanceof SocketTimeoutException ? "timeout: socket is not established" : e.toString(), e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m46886(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return str.getBytes(charset);
    }

    static {
        Charset charset = StandardCharsets.UTF_8;
        f65271 = m46886("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=", charset);
        f65272 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", C0655am.f2320av, "b", C0655am.f2278aF, "d", "e", "f"};
        f65273 = m46886("", charset);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String[] m46888(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            int iIndexOf = str.indexOf(",", i);
            if (iIndexOf < 0) {
                break;
            }
            vector.addElement(m46879(i, iIndexOf - i, bytes));
            i = iIndexOf + 1;
        }
        vector.addElement(m46879(i, bytes.length - i, bytes));
        int size = vector.size();
        String[] strArr = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr[i2] = (String) vector.elementAt(i2);
        }
        return strArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static byte[] m46893(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m46894(String str) {
        Charset charset = StandardCharsets.UTF_8;
        byte[] bArrM46886 = m46886(str, charset);
        byte[] bArrM46897 = m46897(bArrM46886);
        return bArrM46886.length == bArrM46897.length ? str : new String(bArrM46897, 0, bArrM46897.length, charset);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46882(byte[] bArr) {
        return new String(bArr, 0, bArr.length, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46879(int i, int i2, byte[] bArr) {
        return new String(bArr, i, i2, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m46895(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < bArr.length) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            StringBuilder sb2 = new StringBuilder("0x");
            sb2.append(hexString.length() == 1 ? "0" : "");
            sb2.append(hexString);
            sb.append(sb2.toString());
            i++;
            if (i < bArr.length) {
                sb.append(":");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m46890(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m46880(String str, String[] strArr) {
        String[] strArrM46888 = m46888(str);
        String string = null;
        for (int i = 0; i < strArrM46888.length; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= strArr.length) {
                    if (string != null) {
                        StringBuilder sbM21133 = C9179.m21133(string, ",");
                        sbM21133.append(strArrM46888[i]);
                        string = sbM21133.toString();
                        break;
                    }
                    string = strArrM46888[i];
                    break;
                }
                if (strArrM46888[i].equals(strArr[i2])) {
                    break;
                }
                i2++;
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m46891(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }
}
