package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩻᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56SO */
/* JADX INFO: loaded from: classes.dex */
public final class C23930 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InputStream f77607;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f77608;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final byte[] f77609;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f77610;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12951 f77611;

    public C23930(long j, InputStream inputStream) {
        byte[] bArr = new byte[8];
        this.f77609 = bArr;
        this.f77611 = new C12951(bArr);
        if (j < 0) {
            throw new IllegalArgumentException("Invalid legacy record length");
        }
        this.f77607 = inputStream;
        this.f77608 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C23930 m52696(long j, InputStream inputStream) {
        try {
            return new C23930(j, inputStream);
        } catch (Error | RuntimeException e) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m52707() {
        return this.f77608;
    }

    public final int readInt() throws IOException {
        m52697(4, this.f77609);
        C12951 c12951 = this.f77611;
        c12951.seek(0L);
        return c12951.readInt();
    }

    public final long readLong() throws IOException {
        m52697(8, this.f77609);
        C12951 c12951 = this.f77611;
        c12951.seek(0L);
        return c12951.readLong();
    }

    public final int readByte() throws IOException {
        byte[] bArr = this.f77609;
        m52697(1, bArr);
        return bArr[0] & 255;
    }

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public final int m52704() throws IOException {
        m52697(2, this.f77609);
        C12951 c12951 = this.f77611;
        c12951.seek(0L);
        return c12951.m31494();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m52703() {
        return readByte() != 0;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m52709() throws IOException {
        m52699();
        if (this.f77608 != 0) {
            throw new IOException("Trailing bytes in legacy record");
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m52706() throws IOException {
        m52699();
        int iMin = (int) Math.min(8192L, this.f77608);
        byte[] bArr = new byte[iMin];
        while (true) {
            long j = this.f77608;
            if (j == 0) {
                return;
            } else {
                read(bArr, 0, (int) Math.min(j, iMin));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m52708(int i) {
        return m52701(readInt(), i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52701(int i, int i2) throws IOException {
        m52698(i);
        if (i2 < 0 || i > i2) {
            throw new IOException("Legacy app string exceeds limit");
        }
        byte[] bArr = new byte[i];
        m52697(i, bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m52700(int i) throws IOException {
        int i2 = readInt();
        long j = ((long) i2) * 2;
        if (i2 < 0 || i < 0 || j > i || j > this.f77608) {
            throw new IOException("Invalid raw UTF-16 app string length");
        }
        char[] cArr = new char[i2];
        int iMin = (int) Math.min(8192L, j);
        byte[] bArr = new byte[iMin];
        int i3 = 0;
        while (i3 < i2) {
            int iMin2 = Math.min(iMin / 2, i2 - i3);
            m52697(iMin2 * 2, bArr);
            for (int i4 = 0; i4 < iMin2; i4++) {
                int i5 = i4 * 2;
                cArr[i3 + i4] = (char) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            }
            i3 += iMin2;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m52705(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy string limit");
        }
        C10130 c10130 = new C10130(Math.min(128, i));
        while (true) {
            int i2 = readByte();
            if (i2 == 0) {
                return new String(c10130.m25438(), 0, c10130.size(), StandardCharsets.UTF_8);
            }
            if (c10130.size() == i) {
                throw new IOException("Legacy app string exceeds limit");
            }
            c10130.writeByte(i2);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11999 m52702(C21605 c21605, C4236 c4236, Integer num) throws IOException {
        int i = readInt();
        if (i != -131647720) {
            return m52695(i, c21605, num);
        }
        if (readByte() == 0) {
            return m52695(readInt(), c21605, num);
        }
        C1143 c1143 = c21605.f69370;
        int i2 = readInt();
        m52698(i2);
        if (i2 > 8192) {
            throw new IOException("Legacy path field exceeds limit");
        }
        C5377 c5377M3921 = c1143.m3921((((long) i2) * 3) + 128);
        try {
            byte[] bArr = new byte[i2];
            m52697(i2, bArr);
            String str = new String(bArr, StandardCharsets.UTF_8);
            c5377M3921.close();
            if (c4236 == null) {
                throw new IOException("Legacy file path resolver is required");
            }
            C16168 c16168M38102 = C16168.m38102(((C19928) c4236.f13746).m45904(str), c21605.f69370);
            try {
                if (c16168M38102.length() > Integer.MAX_VALUE) {
                    throw new IOException("Legacy file exceeds migration coordinate limit");
                }
                if (num.intValue() == c16168M38102.m38106()) {
                    C11999 c11999M46730 = C20403.m46730(c16168M38102, c21605, Integer.MAX_VALUE, null);
                    c16168M38102.close();
                    return c11999M46730;
                }
                throw new C4880("Legacy text fast hash changed since state was saved");
            } catch (Throwable th) {
                try {
                    c16168M38102.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c5377M3921.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11999 m52695(int i, C21605 c21605, Integer num) throws IOException {
        m52698(i);
        C22519 c22519 = new C22519();
        C11936 c11936M29122 = C11936.m29122(new C14757(this, i), c21605.f69370);
        try {
            C11999 c11999M46730 = C20403.m46730(c11936M29122, c21605, Integer.MAX_VALUE, c22519);
            if (num.intValue() == c22519.m50493(c11999M46730.m29347())) {
                c11936M29122.close();
                return c11999M46730;
            }
            throw new C4880("Legacy text fast hash changed since state was saved");
        } catch (Throwable th) {
            try {
                c11936M29122.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m52698(int i) throws IOException {
        m52699();
        if (i < 0 || i > this.f77608) {
            throw new EOFException("Invalid or truncated legacy field length");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m52699();
        if (i2 == 0) {
            return 0;
        }
        long j = this.f77608;
        if (j == 0) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j);
        int i3 = this.f77607.read(bArr, i, iMin);
        if (i3 == -1) {
            throw new EOFException("Truncated legacy record");
        }
        if (i3 <= 0 || i3 > iMin) {
            throw new IOException("Legacy record read made invalid progress");
        }
        this.f77608 -= (long) i3;
        return i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m52697(int i, byte[] bArr) throws IOException {
        m52698(i);
        int i2 = 0;
        while (i2 < i) {
            i2 += read(bArr, i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m52699() throws IOException {
        if (this.f77610) {
            throw new IOException("Legacy record reader is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f77610) {
            return;
        }
        this.f77610 = true;
        this.f77607.close();
    }
}
