package p067l;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۛۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 54EF */
/* JADX INFO: loaded from: classes2.dex */
public final class C8077 implements Closeable {

    /* JADX INFO: renamed from: ۬ */
    public static final Logger f21303 = Logger.getLogger(C19477.class.getName());

    /* JADX INFO: renamed from: ۗ */
    public final InterfaceC12257 f21304;

    /* JADX INFO: renamed from: ۙ */
    public int f21305;

    /* JADX INFO: renamed from: ᩶ */
    public final C12772 f21306;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f21307;

    /* JADX INFO: renamed from: ᩹ */
    public final C14268 f21308;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f21307 = true;
        this.f21304.close();
    }

    public final synchronized void flush() {
        if (this.f21307) {
            throw new IOException("closed");
        }
        this.f21304.flush();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18740(int i, int i2, boolean z) {
        if (this.f21307) {
            throw new IOException("closed");
        }
        m18739(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f21304.writeInt(i);
        this.f21304.writeInt(i2);
        this.f21304.flush();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18741(int i, long j) {
        if (this.f21307) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            C19477.m44289("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        m18739(i, 4, (byte) 8, (byte) 0);
        this.f21304.writeInt((int) j);
        this.f21304.flush();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18742(int i, EnumC15197 enumC15197) {
        if (this.f21307) {
            throw new IOException("closed");
        }
        if (enumC15197.f43378 == -1) {
            throw new IllegalArgumentException();
        }
        m18739(i, 4, (byte) 3, (byte) 0);
        this.f21304.writeInt(enumC15197.f43378);
        this.f21304.flush();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18743(int i, EnumC15197 enumC15197, byte[] bArr) {
        if (this.f21307) {
            throw new IOException("closed");
        }
        if (enumC15197.f43378 == -1) {
            C19477.m44289("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        m18739(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f21304.writeInt(i);
        this.f21304.writeInt(enumC15197.f43378);
        if (bArr.length > 0) {
            this.f21304.write(bArr);
        }
        this.f21304.flush();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18745(C4210 c4210) {
        if (this.f21307) {
            throw new IOException("closed");
        }
        this.f21305 = c4210.m8551(this.f21305);
        if (c4210.m8546() != -1) {
            this.f21306.m29327(c4210.m8546());
        }
        m18739(0, 0, (byte) 4, (byte) 1);
        this.f21304.flush();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18746(boolean z, int i, C14268 c14268, int i2) {
        if (this.f21307) {
            throw new IOException("closed");
        }
        m18739(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.f21304.mo10979(c14268, i2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m18747(ArrayList arrayList, int i, boolean z) {
        if (this.f21307) {
            throw new IOException("closed");
        }
        m18744(arrayList, i, z);
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized void m18748(C4210 c4210) {
        int i;
        if (this.f21307) {
            throw new IOException("closed");
        }
        int i2 = 0;
        m18739(0, c4210.m8554() * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (c4210.m8553(i2)) {
                if (i2 == 4) {
                    i = 3;
                } else {
                    i = i2 == 7 ? 4 : i2;
                }
                this.f21304.writeShort(i);
                this.f21304.writeInt(c4210.m8547(i2));
            }
            i2++;
        }
        this.f21304.flush();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m18738() {
        if (this.f21307) {
            throw new IOException("closed");
        }
        Logger logger = f21303;
        if (logger.isLoggable(Level.FINE)) {
            String strMo4703 = C19477.f59347.mo4703();
            byte[] bArr = C21407.f67526;
            Locale locale = Locale.US;
            logger.fine(">> CONNECTION " + strMo4703);
        }
        this.f21304.write(C19477.f59347.mo4704());
        this.f21304.flush();
    }

    public C8077(InterfaceC12257 interfaceC12257) {
        this.f21304 = interfaceC12257;
        C14268 c14268 = new C14268();
        this.f21308 = c14268;
        this.f21306 = new C12772(c14268);
        this.f21305 = 16384;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m18749() {
        return this.f21305;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18739(int i, int i2, byte b, byte b2) {
        Level level = Level.FINE;
        Logger logger = f21303;
        if (logger.isLoggable(level)) {
            logger.fine(C19477.m44288(false, i, i2, b, b2));
        }
        int i3 = this.f21305;
        if (i2 > i3) {
            C19477.m44289("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C19477.m44289("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        InterfaceC12257 interfaceC12257 = this.f21304;
        interfaceC12257.writeByte((i2 >>> 16) & 255);
        interfaceC12257.writeByte((i2 >>> 8) & 255);
        interfaceC12257.writeByte(i2 & 255);
        interfaceC12257.writeByte(b & 255);
        interfaceC12257.writeByte(b2 & 255);
        interfaceC12257.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18744(ArrayList arrayList, int i, boolean z) throws IOException {
        if (this.f21307) {
            throw new IOException("closed");
        }
        this.f21306.m29329(arrayList);
        C14268 c14268 = this.f21308;
        long size = c14268.size();
        int iMin = (int) Math.min(this.f21305, size);
        long j = iMin;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m18739(i, iMin, (byte) 1, b);
        InterfaceC12257 interfaceC12257 = this.f21304;
        interfaceC12257.mo10979(c14268, j);
        if (size > j) {
            long j2 = size - j;
            while (j2 > 0) {
                int iMin2 = (int) Math.min(this.f21305, j2);
                long j3 = iMin2;
                j2 -= j3;
                m18739(i, iMin2, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
                interfaceC12257.mo10979(c14268, j3);
            }
        }
    }
}
