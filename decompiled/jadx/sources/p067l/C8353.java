package p067l;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.crypto.modes.GCMSIVBlockCipher;
import org.bouncycastle.util.encoders.UTF8;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: renamed from: l.ۛ᩷֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AHH */
/* JADX INFO: loaded from: classes2.dex */
public final class C8353 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f22334 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC24446 f22335 = AbstractC15728.m35784(Charset.defaultCharset());

    /* JADX INFO: renamed from: ֫ */
    public static int m19270(String str, byte[] bArr, int i, int i2, InterfaceC24446 interfaceC24446) {
        byte[] bArrMo31184 = interfaceC24446.mo31184(str);
        while (bArrMo31184.length > i2) {
            str = C17073.m38720(1, 0, str);
            bArrMo31184 = interfaceC24446.mo31184(str);
        }
        System.arraycopy(bArrMo31184, 0, bArr, i, bArrMo31184.length);
        for (int length = bArrMo31184.length; length < i2; length++) {
            bArr[i + length] = 0;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m19276(long j, byte[] bArr, int i, int i2) {
        int i3;
        int i4 = i2 - 1;
        if (j == 0) {
            i3 = i2 - 2;
            bArr[i4 + i] = UTF8.S_P3A;
        } else {
            long j2 = j;
            while (i4 >= 0 && j2 != 0) {
                bArr[i + i4] = (byte) (((byte) (7 & j2)) + UTF8.S_P3A);
                j2 >>>= 3;
                i4--;
            }
            if (j2 != 0) {
                throw new IllegalArgumentException(j + "=" + Long.toOctalString(j) + " will not fit in octal number buffer of length " + i2);
            }
            i3 = i4;
        }
        while (i3 >= 0) {
            bArr[i + i3] = UTF8.S_P3A;
            i3--;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static List m19275(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length % 2 == 1) {
            throw new IOException("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
        }
        for (int i = 0; i < strArrSplit.length; i += 2) {
            long jM54489 = C24802.m54489(strArrSplit[i]);
            if (jM54489 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct offset contains negative value");
            }
            long jM544810 = C24802.m54489(strArrSplit[i + 1]);
            if (jM544810 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains negative value");
            }
            arrayList.add(new C7012(jM54489, jM544810));
        }
        return C21562.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m19272(byte[] bArr, int i, int i2, InterfaceC24446 interfaceC24446) {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        return i3 > 0 ? interfaceC24446.mo31183(i, i3, bArr) : "";
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m19271(int i, int i2, byte[] bArr) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException(C19768.m44906(i2, "Length ", " must be at least 2"));
        }
        long j = 0;
        if (bArr[i] == 0) {
            return 0L;
        }
        int i4 = i;
        while (i4 < i3 && bArr[i4] == 32) {
            i4++;
        }
        byte b = bArr[i3 - 1];
        while (i4 < i3 && (b == 0 || b == 32)) {
            b = bArr[i3 - 2];
            i3--;
        }
        while (i4 < i3) {
            byte b2 = bArr[i4];
            if (b2 < 48 || b2 > 55) {
                String strReplace = new String(bArr, i, i2, Charset.defaultCharset()).replace(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, "{NUL}");
                StringBuilder sbM34408 = C15033.m34408(b2, "Invalid byte ", " at offset ");
                sbM34408.append(i4 - i);
                sbM34408.append(" in '");
                sbM34408.append(strReplace);
                sbM34408.append("' len=");
                sbM34408.append(i2);
                throw new IllegalArgumentException(sbM34408.toString());
            }
            j = (j << 3) + ((long) (b2 - 48));
            i4++;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۧ */
    public static long m19278(int i, int i2, byte[] bArr) {
        byte b = bArr[i];
        if ((b & GCMSIVBlockCipher.MASK) == 0) {
            return m19271(i, i2, bArr);
        }
        boolean z = b == -1;
        if (i2 < 9) {
            if (i2 >= 9) {
                throw new IllegalArgumentException(C20780.m46928("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
            }
            long jPow = 0;
            for (int i3 = 1; i3 < i2; i3++) {
                jPow = (jPow << 8) + ((long) (bArr[i + i3] & 255));
            }
            if (z) {
                jPow = (jPow - 1) ^ (((long) Math.pow(2.0d, ((double) (i2 - 1)) * 8.0d)) - 1);
            }
            return z ? -jPow : jPow;
        }
        int i4 = i2 - 1;
        byte[] bArr2 = new byte[i4];
        System.arraycopy(bArr, i + 1, bArr2, 0, i4);
        BigInteger bigInteger = new BigInteger(bArr2);
        if (z) {
            bigInteger = bigInteger.add(BigInteger.valueOf(-1L)).not();
        }
        if (bigInteger.bitLength() > 63) {
            throw new IllegalArgumentException(C20780.m46928("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
        }
        long jLongValue = bigInteger.longValue();
        return z ? -jLongValue : jLongValue;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m19273(InputStream inputStream, int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        long[] jArrM19277 = m19277(inputStream);
        long j = jArrM19277[0];
        if (j < 0) {
            throw new IOException("Corrupted TAR archive. Negative value in sparse headers block");
        }
        long j2 = jArrM19277[1];
        while (true) {
            long j3 = j - 1;
            if (j > 0) {
                long[] jArrM19278 = m19277(inputStream);
                long j4 = jArrM19278[0];
                if (j4 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block offset contains negative value");
                }
                long j5 = j2 + jArrM19278[1];
                long[] jArrM19279 = m19277(inputStream);
                long j6 = jArrM19279[0];
                if (j6 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block numbytes contains negative value");
                }
                j2 = j5 + jArrM19279[1];
                arrayList.add(new C7012(j4, j6));
                j = j3;
            } else {
                long j7 = i;
                C23461.m52172((j7 - (j2 % j7)) % j7, inputStream);
                return arrayList;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static HashMap m19274(InputStream inputStream, ArrayList arrayList, HashMap map, long j) throws IOException {
        int i;
        int i2;
        int i3;
        long j2;
        HashMap map2 = new HashMap(map);
        int i4 = 0;
        Long lValueOf = null;
        do {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = inputStream.read();
                int i7 = -1;
                long j3 = 0;
                if (i != -1) {
                    i5++;
                    i4++;
                    if (i == 10) {
                        i2 = -1;
                        break;
                    }
                    if (i == 32) {
                        C13383 c13383 = new C13383();
                        while (true) {
                            i3 = inputStream.read();
                            if (i3 != i7) {
                                i5++;
                                i4++;
                                if (i4 >= 0 && (j < j3 || i4 < j)) {
                                    if (i3 == 61) {
                                        Charset charset = StandardCharsets.UTF_8;
                                        String str = new String(c13383.mo18597(), charset);
                                        int i8 = i6 - i5;
                                        if (i8 > 1) {
                                            if (j >= j3 && i8 > j - ((long) i4)) {
                                                throw new IOException(C19768.m44906(i8, "Paxheader value size ", " exceeds size of header record"));
                                            }
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            C23461.m52178(inputStream, byteArrayOutputStream, i8);
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            int length = byteArray.length;
                                            if (length != i8) {
                                                throw new IOException(C19768.m44907("Failed to read Paxheader. Expected ", i8, length, " bytes, read "));
                                            }
                                            i4 += i8;
                                            int i9 = i8 - 1;
                                            if (byteArray[i9] != 10) {
                                                throw new IOException("Failed to read Paxheader.Value should end with a newline");
                                            }
                                            String str2 = new String(byteArray, 0, i9, charset);
                                            map2.put(str, str2);
                                            if (str.equals("GNU.sparse.offset")) {
                                                if (lValueOf != null) {
                                                    j2 = 0;
                                                    arrayList.add(new C7012(lValueOf.longValue(), 0L));
                                                } else {
                                                    j2 = 0;
                                                }
                                                try {
                                                    lValueOf = Long.valueOf(str2);
                                                    if (lValueOf.longValue() < j2) {
                                                        throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains negative value");
                                                    }
                                                } catch (NumberFormatException unused) {
                                                    throw new IOException("Failed to read Paxheader.GNU.sparse.offset contains a non-numeric value");
                                                }
                                            }
                                            if (!str.equals("GNU.sparse.numbytes")) {
                                                break;
                                            }
                                            if (lValueOf == null) {
                                                throw new IOException("Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows up.");
                                            }
                                            long jM54489 = C24802.m54489(str2);
                                            if (jM54489 < 0) {
                                                throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains negative value");
                                            }
                                            arrayList.add(new C7012(lValueOf.longValue(), jM54489));
                                            lValueOf = null;
                                            break;
                                        }
                                        map2.remove(str);
                                    } else {
                                        c13383.write((byte) i3);
                                        i7 = -1;
                                        j3 = 0;
                                    }
                                }
                            }
                            break;
                        }
                        i = i3;
                    } else {
                        if (i < 48 || i > 57) {
                            throw new IOException("Failed to read Paxheader. Encountered a non-number while reading length");
                        }
                        i6 = (i6 * 10) + (i - 48);
                    }
                }
                i2 = -1;
                break;
            }
        } while (i != i2);
        if (lValueOf != null) {
            arrayList.add(new C7012(lValueOf.longValue(), 0L));
        }
        return map2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long[] m19277(InputStream inputStream) throws IOException {
        long j = 0;
        long j2 = 0;
        while (true) {
            int i = inputStream.read();
            if (i == 10) {
                return new long[]{j2, j + 1};
            }
            j++;
            if (i == -1) {
                throw new IOException("Unexpected EOF when reading parse information of 1.X PAX format");
            }
            if (i < 48 || i > 57) {
                throw new IOException("Corrupted TAR archive. Non-numeric value in sparse headers block");
            }
            j2 = (j2 * 10) + ((long) (i - 48));
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static List m19279(int i, int i2, byte[] bArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (i3 * 24) + i;
            try {
                C7012 c7012 = new C7012(m19278(i4, 12, bArr), m19278(i4 + 12, 12, bArr));
                if (c7012.m16134() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative offset");
                }
                if (c7012.m16133() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative numbytes");
                }
                arrayList.add(c7012);
            } catch (IllegalArgumentException e) {
                throw new IOException("Corrupted TAR archive, sparse entry is invalid", e);
            }
        }
        return C21562.unmodifiableList(arrayList);
    }
}
