package l;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.֫ܽۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: S76S */
/* JADX INFO: loaded from: classes2.dex */
public final class C1944 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6404(AbstractC15440 abstractC15440) {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("cache").m36526("resource_arsc").m36526("resources.arsc.bin");
        if (abstractC15440M36526.mo23120()) {
            abstractC15440M36526.mo23552();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6405(AbstractC15440 abstractC15440, byte[] bArr, byte[] bArr2) {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("cache").m36526("resource_arsc").m36526("resources.arsc.bin");
        abstractC15440M36526.mo35195();
        AbstractC15440 abstractC15440M36520 = abstractC15440M36526.m36520(".resource_arsc");
        try {
            OutputStream outputStreamMo23555 = abstractC15440M36520.mo23555(false);
            try {
                C10130 c10130 = new C10130(64);
                c10130.writeInt(1297236291);
                c10130.writeInt(1);
                c10130.writeInt(1);
                c10130.write(bArr);
                c10130.writeInt(bArr2.length);
                c10130.m25421(outputStreamMo23555);
                outputStreamMo23555.write(bArr2);
                c10130.m25440();
                CRC32 crc32 = new CRC32();
                crc32.update(bArr2);
                c10130.writeInt((int) crc32.getValue());
                c10130.m25421(outputStreamMo23555);
                outputStreamMo23555.close();
                abstractC15440M36520.m36501(abstractC15440M36526, false, true, null);
                if (abstractC15440M36520.mo23120()) {
                    abstractC15440M36520.mo23552();
                }
            } catch (Throwable th) {
                if (outputStreamMo23555 != null) {
                    try {
                        outputStreamMo23555.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (abstractC15440M36520.mo23120()) {
                abstractC15440M36520.mo23552();
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m6406(AbstractC15440 abstractC15440, byte[] bArr) {
        AbstractC15440 abstractC15440M36526 = abstractC15440.m36526("cache").m36526("resource_arsc").m36526("resources.arsc.bin");
        if (!abstractC15440M36526.mo23119()) {
            return null;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(abstractC15440M36526.mo27926());
            try {
                long jMo23127 = abstractC15440M36526.mo23127();
                byte[] bArr2 = new byte[48];
                dataInputStream.readFully(bArr2);
                C12951 c12951 = new C12951(bArr2);
                if (c12951.readInt() != 1297236291 || c12951.readInt() != 1 || c12951.readInt() != 1) {
                    throw new IOException("Unsupported resource ARSC cache format");
                }
                byte[] bArr3 = new byte[32];
                c12951.m31489(32, bArr3);
                if (!Arrays.equals(bArr3, bArr)) {
                    throw new IOException("Resource ARSC cache input hash mismatch");
                }
                int i = c12951.readInt();
                if (i < 0 || i != (jMo23127 - ((long) 48)) - 4) {
                    throw new IOException("Invalid resource ARSC cache payload length");
                }
                byte[] bArr4 = new byte[i];
                dataInputStream.readFully(bArr4);
                byte[] bArr5 = new byte[4];
                dataInputStream.readFully(bArr5);
                int i2 = new C12951(bArr5).readInt();
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
            if (!abstractC15440M36526.mo23120()) {
                return null;
            }
            abstractC15440M36526.mo23552();
            return null;
        }
    }
}
