package l;

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
public final class C6297 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f19463 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC23230 f19464 = AbstractC14057.m33659(Charset.defaultCharset());

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m17330(String str, byte[] bArr, int i, int i2, InterfaceC23230 interfaceC23230) {
        byte[] bArrMo29130 = interfaceC23230.mo29130(str);
        while (bArrMo29130.length > i2) {
            str = C15472.m36561(1, 0, str);
            bArrMo29130 = interfaceC23230.mo29130(str);
        }
        System.arraycopy(bArrMo29130, 0, bArr, i, bArrMo29130.length);
        for (int length = bArrMo29130.length; length < i2; length++) {
            bArr[i + length] = 0;
        }
        return i + i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m17336(long j, byte[] bArr, int i, int i2) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static List m17335(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length % 2 == 1) {
            throw new IOException("Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header");
        }
        for (int i = 0; i < strArrSplit.length; i += 2) {
            long jM52086 = C23605.m52086(strArrSplit[i]);
            if (jM52086 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct offset contains negative value");
            }
            long jM52087 = C23605.m52086(strArrSplit[i + 1]);
            if (jM52087 < 0) {
                throw new IOException("Corrupted TAR archive. Sparse struct numbytes contains negative value");
            }
            arrayList.add(new C4886(jM52086, jM52087));
        }
        return C20195.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m17332(byte[] bArr, int i, int i2, InterfaceC23230 interfaceC23230) {
        int i3 = 0;
        for (int i4 = i; i3 < i2 && bArr[i4] != 0; i4++) {
            i3++;
        }
        return i3 > 0 ? interfaceC23230.mo29129(i, i3, bArr) : "";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m17331(int i, int i2, byte[] bArr) {
        int i3 = i + i2;
        if (i2 < 2) {
            throw new IllegalArgumentException(C18307.m42645(i2, "Length ", " must be at least 2"));
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
                StringBuilder sbM32308 = C13325.m32308(b2, "Invalid byte ", " at offset ");
                sbM32308.append(i4 - i);
                sbM32308.append(" in '");
                sbM32308.append(strReplace);
                sbM32308.append("' len=");
                sbM32308.append(i2);
                throw new IllegalArgumentException(sbM32308.toString());
            }
            j = (j << 3) + ((long) (b2 - 48));
            i4++;
        }
        return j;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static long m17338(int i, int i2, byte[] bArr) {
        byte b = bArr[i];
        if ((b & GCMSIVBlockCipher.MASK) == 0) {
            return m17331(i, i2, bArr);
        }
        boolean z = b == -1;
        if (i2 < 9) {
            if (i2 >= 9) {
                throw new IllegalArgumentException(C19373.m44634("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
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
            throw new IllegalArgumentException(C19373.m44634("At offset ", i, ", ", " byte binary number exceeds maximum signed long value", i2));
        }
        long jLongValue = bigInteger.longValue();
        return z ? -jLongValue : jLongValue;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m17333(InputStream inputStream, int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        long[] jArrM17337 = m17337(inputStream);
        long j = jArrM17337[0];
        if (j < 0) {
            throw new IOException("Corrupted TAR archive. Negative value in sparse headers block");
        }
        long j2 = jArrM17337[1];
        while (true) {
            long j3 = j - 1;
            if (j > 0) {
                long[] jArrM17338 = m17337(inputStream);
                long j4 = jArrM17338[0];
                if (j4 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block offset contains negative value");
                }
                long j5 = j2 + jArrM17338[1];
                long[] jArrM17339 = m17337(inputStream);
                long j6 = jArrM17339[0];
                if (j6 < 0) {
                    throw new IOException("Corrupted TAR archive. Sparse header block numbytes contains negative value");
                }
                j2 = j5 + jArrM17339[1];
                arrayList.add(new C4886(j4, j6));
                j = j3;
            } else {
                long j7 = i;
                C22194.m49845((j7 - (j2 % j7)) % j7, inputStream);
                return arrayList;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static HashMap m17334(InputStream inputStream, ArrayList arrayList, HashMap map, long j) throws IOException {
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
                        C11590 c11590 = new C11590();
                        while (true) {
                            i3 = inputStream.read();
                            if (i3 != i7) {
                                i5++;
                                i4++;
                                if (i4 >= 0 && (j < j3 || i4 < j)) {
                                    if (i3 == 61) {
                                        Charset charset = StandardCharsets.UTF_8;
                                        String str = new String(c11590.mo16671(), charset);
                                        int i8 = i6 - i5;
                                        if (i8 > 1) {
                                            if (j >= j3 && i8 > j - ((long) i4)) {
                                                throw new IOException(C18307.m42645(i8, "Paxheader value size ", " exceeds size of header record"));
                                            }
                                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                            C22194.m49851(inputStream, byteArrayOutputStream, i8);
                                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                                            int length = byteArray.length;
                                            if (length != i8) {
                                                throw new IOException(C18307.m42646("Failed to read Paxheader. Expected ", i8, length, " bytes, read "));
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
                                                    arrayList.add(new C4886(lValueOf.longValue(), 0L));
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
                                            long jM52086 = C23605.m52086(str2);
                                            if (jM52086 < 0) {
                                                throw new IOException("Failed to read Paxheader.GNU.sparse.numbytes contains negative value");
                                            }
                                            arrayList.add(new C4886(lValueOf.longValue(), jM52086));
                                            lValueOf = null;
                                            break;
                                        }
                                        map2.remove(str);
                                    } else {
                                        c11590.write((byte) i3);
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
            arrayList.add(new C4886(lValueOf.longValue(), 0L));
        }
        return map2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long[] m17337(InputStream inputStream) throws IOException {
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

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static List m17339(int i, int i2, byte[] bArr) throws IOException {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = (i3 * 24) + i;
            try {
                C4886 c4886 = new C4886(m17338(i4, 12, bArr), m17338(i4 + 12, 12, bArr));
                if (c4886.m14237() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative offset");
                }
                if (c4886.m14236() < 0) {
                    throw new IOException("Corrupted TAR archive, sparse entry with negative numbytes");
                }
                arrayList.add(c4886);
            } catch (IllegalArgumentException e) {
                throw new IOException("Corrupted TAR archive, sparse entry is invalid", e);
            }
        }
        return C20195.unmodifiableList(arrayList);
    }
}
