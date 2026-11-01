package p067l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩻᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56SO */
/* JADX INFO: loaded from: classes.dex */
public final class C25112 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final InputStream f80358;

    /* JADX INFO: renamed from: ۙ */
    public long f80359;

    /* JADX INFO: renamed from: ᩶ */
    public final byte[] f80360;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f80361;

    /* JADX INFO: renamed from: ᩹ */
    public final C14677 f80362;

    public C25112(long j, InputStream inputStream) {
        byte[] bArr = new byte[8];
        this.f80360 = bArr;
        this.f80362 = new C14677(bArr);
        if (j < 0) {
            throw new IllegalArgumentException("Invalid legacy record length");
        }
        this.f80358 = inputStream;
        this.f80359 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C25112 m55102(long j, InputStream inputStream) {
        try {
            return new C25112(j, inputStream);
        } catch (Error | RuntimeException e) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m55113() {
        return this.f80359;
    }

    public final int readInt() throws IOException {
        m55103(4, this.f80360);
        C14677 c14677 = this.f80362;
        c14677.seek(0L);
        return c14677.readInt();
    }

    public final long readLong() throws IOException {
        m55103(8, this.f80360);
        C14677 c14677 = this.f80362;
        c14677.seek(0L);
        return c14677.readLong();
    }

    public final int readByte() throws IOException {
        byte[] bArr = this.f80360;
        m55103(1, bArr);
        return bArr[0] & 255;
    }

    /* JADX INFO: renamed from: ۛۧ */
    public final int m55110() throws IOException {
        m55103(2, this.f80360);
        C14677 c14677 = this.f80362;
        c14677.seek(0L);
        return c14677.m33581();
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m55109() {
        return readByte() != 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m55115() throws IOException {
        m55105();
        if (this.f80359 != 0) {
            throw new IOException("Trailing bytes in legacy record");
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m55112() throws IOException {
        m55105();
        int iMin = (int) Math.min(8192L, this.f80359);
        byte[] bArr = new byte[iMin];
        while (true) {
            long j = this.f80359;
            if (j == 0) {
                return;
            } else {
                read(bArr, 0, (int) Math.min(j, iMin));
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m55114(int i) {
        return m55107(readInt(), i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m55107(int i, int i2) throws IOException {
        m55104(i);
        if (i2 < 0 || i > i2) {
            throw new IOException("Legacy app string exceeds limit");
        }
        byte[] bArr = new byte[i];
        m55103(i, bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m55106(int i) throws IOException {
        int i2 = readInt();
        long j = ((long) i2) * 2;
        if (i2 < 0 || i < 0 || j > i || j > this.f80359) {
            throw new IOException("Invalid raw UTF-16 app string length");
        }
        char[] cArr = new char[i2];
        int iMin = (int) Math.min(8192L, j);
        byte[] bArr = new byte[iMin];
        int i3 = 0;
        while (i3 < i2) {
            int iMin2 = Math.min(iMin / 2, i2 - i3);
            m55103(iMin2 * 2, bArr);
            for (int i4 = 0; i4 < iMin2; i4++) {
                int i5 = i4 * 2;
                cArr[i3 + i4] = (char) (((bArr[i5 + 1] & 255) << 8) | (bArr[i5] & 255));
            }
            i3 += iMin2;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m55111(int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException("Invalid legacy string limit");
        }
        C11996 c11996 = new C11996(Math.min(128, i));
        while (true) {
            int i2 = readByte();
            if (i2 == 0) {
                return new String(c11996.m27458(), 0, c11996.size(), StandardCharsets.UTF_8);
            }
            if (c11996.size() == i) {
                throw new IOException("Legacy app string exceeds limit");
            }
            c11996.writeByte(i2);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13773 m55108(C22902 c22902, C6395 c6395, Integer num) throws IOException {
        int i = readInt();
        if (i != -131647720) {
            return m55101(i, c22902, num);
        }
        if (readByte() == 0) {
            return m55101(readInt(), c22902, num);
        }
        C3455 c3455 = c22902.f72073;
        int i2 = readInt();
        m55104(i2);
        if (i2 > 8192) {
            throw new IOException("Legacy path field exceeds limit");
        }
        C7479 c7479M6162 = c3455.m6162((((long) i2) * 3) + 128);
        try {
            byte[] bArr = new byte[i2];
            m55103(i2, bArr);
            String str = new String(bArr, StandardCharsets.UTF_8);
            c7479M6162.close();
            if (c6395 == null) {
                throw new IOException("Legacy file path resolver is required");
            }
            C17735 c17735M40294 = C17735.m40294(((C21308) c6395.f16559).m48217(str), c22902.f72073);
            try {
                if (c17735M40294.length() > Integer.MAX_VALUE) {
                    throw new IOException("Legacy file exceeds migration coordinate limit");
                }
                if (num.intValue() == c17735M40294.m40298()) {
                    C13773 c13773M49053 = C21760.m49053(c17735M40294, c22902, Integer.MAX_VALUE, null);
                    c17735M40294.close();
                    return c13773M49053;
                }
                throw new C7007("Legacy text fast hash changed since state was saved");
            } catch (Throwable th) {
                try {
                    c17735M40294.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                c7479M6162.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private C13773 m55101(int i, C22902 c22902, Integer num) throws IOException {
        m55104(i);
        C23771 c23771 = new C23771();
        C13713 c13713M31175 = C13713.m31175(new C16394(this, i), c22902.f72073);
        try {
            C13773 c13773M49053 = C21760.m49053(c13713M31175, c22902, Integer.MAX_VALUE, c23771);
            if (num.intValue() == c23771.m52835(c13773M49053.m31402())) {
                c13713M31175.close();
                return c13773M49053;
            }
            throw new C7007("Legacy text fast hash changed since state was saved");
        } catch (Throwable th) {
            try {
                c13713M31175.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m55104(int i) throws IOException {
        m55105();
        if (i < 0 || i > this.f80359) {
            throw new EOFException("Invalid or truncated legacy field length");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int read(byte[] bArr, int i, int i2) throws IOException {
        m55105();
        if (i2 == 0) {
            return 0;
        }
        long j = this.f80359;
        if (j == 0) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j);
        int i3 = this.f80358.read(bArr, i, iMin);
        if (i3 == -1) {
            throw new EOFException("Truncated legacy record");
        }
        if (i3 <= 0 || i3 > iMin) {
            throw new IOException("Legacy record read made invalid progress");
        }
        this.f80359 -= (long) i3;
        return i3;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m55103(int i, byte[] bArr) throws IOException {
        m55104(i);
        int i2 = 0;
        while (i2 < i) {
            i2 += read(bArr, i2, i - i2);
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m55105() throws IOException {
        if (this.f80361) {
            throw new IOException("Legacy record reader is closed");
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f80361) {
            return;
        }
        this.f80361 = true;
        this.f80358.close();
    }
}
