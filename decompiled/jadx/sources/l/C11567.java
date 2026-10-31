package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: l.ۨ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L764 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11567 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f34508;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f34509;

    public C11567(int i, int i2) {
        this.f34509 = i;
        this.f34508 = i2;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static C11567 m28457(String str) throws C3059 {
        int i;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    if (randomAccessFile.length() < 20) {
                        throw m28455();
                    }
                    byte[] bArrM28454 = m28454(randomAccessFile);
                    int i2 = bArrM28454[4] & 255;
                    if (i2 == 1) {
                        i = 32;
                    } else {
                        if (i2 != 2) {
                            throw m28455();
                        }
                        i = 64;
                    }
                    if ((bArrM28454[5] & 255) != 1) {
                        throw m28455();
                    }
                    randomAccessFile.seek(18L);
                    int unsignedByte = randomAccessFile.readUnsignedByte() | (randomAccessFile.readUnsignedByte() << 8);
                    if (unsignedByte != 40 && unsignedByte != 183 && unsignedByte != 3 && unsignedByte != 62) {
                        throw C3059.m9368("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    if (((unsignedByte != 40 && unsignedByte != 3) || i != 32) && ((unsignedByte != 183 && unsignedByte != 62) || i != 64)) {
                        throw C3059.m9368("NATIVE_UNSUPPORTED_ELF", "ELF machine/class pair is not supported by native analysis.");
                    }
                    C11567 c11567 = new C11567(unsignedByte, i);
                    randomAccessFile.close();
                    return c11567;
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | RuntimeException unused) {
                throw m28455();
            }
        } catch (C3059 e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m28456(String str) throws C3059 {
        char c;
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(str), "r");
                try {
                    byte[] bArrM28454 = m28454(randomAccessFile);
                    int i = bArrM28454[4] & 255;
                    if (i == 1) {
                        c = ' ';
                    } else {
                        if (i != 2) {
                            throw m28455();
                        }
                        c = '@';
                    }
                    int i2 = bArrM28454[5] & 255;
                    if ((i2 != 1 && i2 != 2) || (bArrM28454[6] & 255) != 1) {
                        throw m28455();
                    }
                    int i3 = c == ' ' ? 52 : 64;
                    int i4 = c == ' ' ? 40 : 52;
                    if (randomAccessFile.length() < i3) {
                        throw m28455();
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
                        throw m28455();
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
                throw m28455();
            }
        } catch (C3059 e) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m28454(RandomAccessFile randomAccessFile) throws C3059, IOException {
        if (randomAccessFile.length() < 16) {
            throw m28455();
        }
        byte[] bArr = new byte[16];
        randomAccessFile.readFully(bArr);
        if (bArr[0] == 127 && bArr[1] == 69 && bArr[2] == 76 && bArr[3] == 70) {
            return bArr;
        }
        throw m28455();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m28459() {
        int i = this.f34509;
        return (i == 3 || i == 62) ? "x86" : "arm";
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m28458(String str) {
        int i = this.f34509;
        if (i == 40) {
            return "thumb".equals(str) ? 16 : 32;
        }
        if (i == 183 || i == 62) {
            return 64;
        }
        if (i == 3) {
            return 32;
        }
        return this.f34508;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m28460(String str) {
        int i = this.f34509;
        if (i == 40) {
            return "thumb".equals(str) ? "thumb" : "arm";
        }
        if (i == 183) {
            return "aarch64";
        }
        return i == 62 ? "x86_64" : "x86";
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m28461(String str) {
        int i = this.f34509;
        if (i == 40) {
            return "thumb".equals(str) ? "mixed16_32" : "fixed32";
        }
        return i == 183 ? "fixed32" : "variable";
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C3059 m28455() {
        return C3059.m9368("NATIVE_ENTRY_NOT_ELF", "ZIP entry is not an Android little-endian ELF file.");
    }
}
