package p067l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.ۨ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L764 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13362 {

    /* JADX INFO: renamed from: ֫ */
    public final int f37507;

    /* JADX INFO: renamed from: ۧ */
    public final int f37508;

    public C13362(int i, int i2) {
        this.f37508 = i;
        this.f37507 = i2;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static C13362 m30503(String str) throws C5276 {
        int i;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    if (randomAccessFile.length() < 20) {
                        throw m30501();
                    }
                    byte[] bArrM30500 = m30500(randomAccessFile);
                    int i2 = bArrM30500[4] & 255;
                    if (i2 == 1) {
                        i = 32;
                    } else {
                        if (i2 != 2) {
                            throw m30501();
                        }
                        i = 64;
                    }
                    if ((bArrM30500[5] & 255) != 1) {
                        throw m30501();
                    }
                    randomAccessFile.seek(18L);
                    int unsignedByte = randomAccessFile.readUnsignedByte() | (randomAccessFile.readUnsignedByte() << 8);
                    if (unsignedByte != 40 && unsignedByte != 183 && unsignedByte != 3 && unsignedByte != 62) {
                        throw C5276.m11410("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    if (((unsignedByte != 40 && unsignedByte != 3) || i != 32) && ((unsignedByte != 183 && unsignedByte != 62) || i != 64)) {
                        throw C5276.m11410("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    C13362 c13362 = new C13362(unsignedByte, i);
                    randomAccessFile.close();
                    return c13362;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused) {
                throw m30501();
            }
        } catch (C5276 e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m30502(String str) throws C5276 {
        char c;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    byte[] bArrM30500 = m30500(randomAccessFile);
                    int i = bArrM30500[4] & 255;
                    if (i == 1) {
                        c = ' ';
                    } else {
                        if (i != 2) {
                            throw m30501();
                        }
                        c = '@';
                    }
                    int i2 = bArrM30500[5] & 255;
                    if ((i2 != 1 && i2 != 2) || (bArrM30500[6] & 255) != 1) {
                        throw m30501();
                    }
                    int i3 = c == ' ' ? 52 : 64;
                    int i4 = c == ' ' ? 40 : 52;
                    if (randomAccessFile.length() < i3) {
                        throw m30501();
                    }
                    randomAccessFile.seek(i4);
                    int unsignedByte = randomAccessFile.readUnsignedByte();
                    int unsignedByte2 = randomAccessFile.readUnsignedByte();
                    if (i2 == 2) {
                        unsignedByte <<= 8;
                    } else {
                        unsignedByte2 <<= 8;
                    }
                    if ((unsignedByte | unsignedByte2) != i3) {
                        throw m30501();
                    }
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused) {
                throw m30501();
            }
        } catch (C5276 e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m30500(RandomAccessFile randomAccessFile) throws C5276, IOException {
        if (randomAccessFile.length() < 16) {
            throw m30501();
        }
        byte[] bArr = new byte[16];
        randomAccessFile.readFully(bArr);
        if (bArr[0] == 127 && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
            return bArr;
        }
        throw m30501();
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m30505() {
        int i = this.f37508;
        return (i == 3 || i == 62) ? "x86" : "arm";
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m30504(String str) {
        int i = this.f37508;
        if (i == 40) {
            return "thumb".equals(str) ? 16 : 32;
        }
        if (i == 183 || i == 62) {
            return 64;
        }
        if (i == 3) {
            return 32;
        }
        return this.f37507;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m30506(String str) {
        int i = this.f37508;
        if (i == 40) {
            return "thumb".equals(str) ? "thumb" : "arm";
        }
        if (i == 183) {
            return "aarch64";
        }
        return i == 62 ? "x86_64" : "x86";
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m30507(String str) {
        int i = this.f37508;
        if (i == 40) {
            return "thumb".equals(str) ? "mixed16_32" : "fixed32";
        }
        return i == 183 ? "fixed32" : "variable";
    }

    /* JADX INFO: renamed from: ۧ */
    public static C5276 m30501() {
        return C5276.m11410("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an Android little-endian ELF file.");
    }
}
