package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩹ۗ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: B784 */
/* JADX INFO: loaded from: classes.dex */
public final class C23303 {
    /* JADX INFO: renamed from: ֫ */
    public static C22633 m51896(String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        C8150.sort(arrayList, C10162.comparing(new C9891(0)));
        C8150.sort(arrayList2, new C16596());
        C11996 c11996 = new C11996(256);
        c11996.writeInt(1095784516);
        c11996.writeInt(1);
        c11996.writeInt(2);
        c11996.m27459(str);
        c11996.m27459(str2);
        c11996.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4613 c4613 = (C4613) it.next();
            c11996.m27459(c4613.f10341);
            c11996.m27459(c4613.f10343);
        }
        c11996.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            c11996.m27459((String) it2.next());
        }
        return new C22633(str, c11996.m27446(C16111.m36668()));
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m51899(AbstractC17043 abstractC17043, C22633 c22633) {
        String str = c22633.f71406;
        MessageDigest messageDigestM36668 = C16111.m36668();
        Charset charset = StandardCharsets.UTF_8;
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(C16111.m36665(messageDigestM36668.digest(str.getBytes(charset))).concat(".bin"));
        if (!abstractC17043M38684.mo25093()) {
            return null;
        }
        int length = str.getBytes(charset).length + 45;
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC17043M38684.mo29987());
            try {
                long jMo25101 = abstractC17043M38684.mo25101();
                byte[] bArr = new byte[length];
                dataInputStream.readFully(bArr);
                C14677 c14677 = new C14677(bArr);
                if (c14677.readInt() == 1095784516 && c14677.readInt() == 1) {
                    String strM33593 = c14677.m33593();
                    byte[] bArr2 = new byte[32];
                    c14677.m33576(32, bArr2);
                    int i = c14677.readInt();
                    if (str.equals(strM33593) && Arrays.equals(c22633.f71407, bArr2) && i >= 0 && i == (jMo25101 - ((long) length)) - 4) {
                        byte[] bArr3 = new byte[i];
                        dataInputStream.readFully(bArr3);
                        byte[] bArr4 = new byte[4];
                        dataInputStream.readFully(bArr4);
                        int i2 = new C14677(bArr4).readInt();
                        if (dataInputStream.read() == -1) {
                            CRC32 crc32 = new CRC32();
                            crc32.update(bArr3);
                            if (((int) crc32.getValue()) == i2) {
                                dataInputStream.close();
                                return bArr3;
                            }
                        }
                    }
                }
                dataInputStream.close();
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
        }
        if (!abstractC17043M38684.mo25094()) {
            return null;
        }
        abstractC17043M38684.mo25503();
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51898(AbstractC17043 abstractC17043, C22633 c22633, byte[] bArr) {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684(C16111.m36665(C16111.m36668().digest(c22633.f71406.getBytes(StandardCharsets.UTF_8))).concat(".bin"));
        abstractC17043M38684.mo37342();
        AbstractC17043 abstractC17043M38678 = abstractC17043M38684.m38678(".dex_build");
        try {
            OutputStream outputStreamMo25506 = abstractC17043M38678.mo25506(false);
            try {
                m51897(outputStreamMo25506, c22633, bArr);
                outputStreamMo25506.close();
                abstractC17043M38678.m38659(abstractC17043M38684, false, true, null);
                if (abstractC17043M38678.mo25094()) {
                    abstractC17043M38678.mo25503();
                }
            } catch (Throwable th) {
                if (outputStreamMo25506 != null) {
                    try {
                        outputStreamMo25506.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC17043M38678.mo25094()) {
                abstractC17043M38678.mo25503();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51897(OutputStream outputStream, C22633 c22633, byte[] bArr) throws IOException {
        C11996 c11996 = new C11996(96);
        c11996.writeInt(1095784516);
        c11996.writeInt(1);
        c11996.m27459(c22633.f71406);
        c11996.write(c22633.f71407);
        c11996.writeInt(bArr.length);
        c11996.m27441(outputStream);
        outputStream.write(bArr);
        c11996.m27460();
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        c11996.writeInt((int) crc32.getValue());
        c11996.m27441(outputStream);
    }
}
