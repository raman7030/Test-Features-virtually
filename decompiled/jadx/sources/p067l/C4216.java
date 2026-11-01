package p067l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֫ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S76S */
/* JADX INFO: loaded from: classes2.dex */
public final class C4216 {
    /* JADX INFO: renamed from: ֫ */
    public static void m8561(AbstractC17043 abstractC17043) {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("cache").m38684("resource_arsc").m38684("resources.arsc.bin");
        if (abstractC17043M38684.mo25094()) {
            abstractC17043M38684.mo25503();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8562(AbstractC17043 abstractC17043, byte[] bArr, byte[] bArr2) {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("cache").m38684("resource_arsc").m38684("resources.arsc.bin");
        abstractC17043M38684.mo37342();
        AbstractC17043 abstractC17043M38678 = abstractC17043M38684.m38678(".resource_arsc");
        try {
            OutputStream outputStreamMo25506 = abstractC17043M38678.mo25506(false);
            try {
                C11996 c11996 = new C11996(64);
                c11996.writeInt(1297236291);
                c11996.writeInt(1);
                c11996.writeInt(1);
                c11996.write(bArr);
                c11996.writeInt(bArr2.length);
                c11996.m27441(outputStreamMo25506);
                outputStreamMo25506.write(bArr2);
                c11996.m27460();
                CRC32 crc32 = new CRC32();
                crc32.update(bArr2);
                c11996.writeInt((int) crc32.getValue());
                c11996.m27441(outputStreamMo25506);
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
    public static byte[] m8563(AbstractC17043 abstractC17043, byte[] bArr) {
        AbstractC17043 abstractC17043M38684 = abstractC17043.m38684("cache").m38684("resource_arsc").m38684("resources.arsc.bin");
        if (!abstractC17043M38684.mo25093()) {
            return null;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC17043M38684.mo29987());
            try {
                long jMo25101 = abstractC17043M38684.mo25101();
                byte[] bArr2 = new byte[48];
                dataInputStream.readFully(bArr2);
                C14677 c14677 = new C14677(bArr2);
                if (c14677.readInt() != 1297236291 || c14677.readInt() != 1 || c14677.readInt() != 1) {
                    throw new IOException("Unsupported resource ARSC cache format");
                }
                byte[] bArr3 = new byte[32];
                c14677.m33576(32, bArr3);
                if (!Arrays.equals(bArr3, bArr)) {
                    throw new IOException("Resource ARSC cache input hash mismatch");
                }
                int i = c14677.readInt();
                if (i < 0 || i != (jMo25101 - ((long) 48)) - 4) {
                    throw new IOException("Invalid resource ARSC cache payload length");
                }
                byte[] bArr4 = new byte[i];
                dataInputStream.readFully(bArr4);
                byte[] bArr5 = new byte[4];
                dataInputStream.readFully(bArr5);
                int i2 = new C14677(bArr5).readInt();
                if (dataInputStream.read() == -1) {
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr4);
                    if (((int) crc32.getValue()) == i2) {
                        dataInputStream.close();
                        return bArr4;
                    }
                }
                throw new IOException("Resource ARSC cache CRC mismatch");
            } catch (Throwable th) {
                try {
                    dataInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception unused) {
            if (!abstractC17043M38684.mo25094()) {
                return null;
            }
            abstractC17043M38684.mo25503();
            return null;
        }
    }
}
