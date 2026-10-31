package l;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.ۛۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 54EF */
/* JADX INFO: loaded from: classes2.dex */
public final class C6007 implements Closeable {

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Logger f18448 = Logger.getLogger(C18002.class.getName());

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10405 f18449;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f18450;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C10947 f18451;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f18452;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C12521 f18453;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f18452 = true;
        this.f18449.close();
    }

    public final synchronized void flush() {
        if (this.f18452) {
            throw new IOException("closed");
        }
        this.f18449.flush();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16813(int i, int i2, boolean z) {
        if (this.f18452) {
            throw new IOException("closed");
        }
        m16812(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.f18449.writeInt(i);
        this.f18449.writeInt(i2);
        this.f18449.flush();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16814(int i, long j) {
        if (this.f18452) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            C18002.m42039("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        }
        m16812(i, 4, (byte) 8, (byte) 0);
        this.f18449.writeInt((int) j);
        this.f18449.flush();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16815(int i, EnumC13499 enumC13499) {
        if (this.f18452) {
            throw new IOException("closed");
        }
        if (enumC13499.f40308 == -1) {
            throw new IllegalArgumentException();
        }
        m16812(i, 4, (byte) 3, (byte) 0);
        this.f18449.writeInt(enumC13499.f40308);
        this.f18449.flush();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16816(int i, EnumC13499 enumC13499, byte[] bArr) {
        if (this.f18452) {
            throw new IOException("closed");
        }
        if (enumC13499.f40308 == -1) {
            C18002.m42039("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
        m16812(0, bArr.length + 8, (byte) 7, (byte) 0);
        this.f18449.writeInt(i);
        this.f18449.writeInt(enumC13499.f40308);
        if (bArr.length > 0) {
            this.f18449.write(bArr);
        }
        this.f18449.flush();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16818(C1938 c1938) {
        if (this.f18452) {
            throw new IOException("closed");
        }
        this.f18450 = c1938.m6394(this.f18450);
        if (c1938.m6389() != -1) {
            this.f18451.m27267(c1938.m6389());
        }
        m16812(0, 0, (byte) 4, (byte) 1);
        this.f18449.flush();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16819(boolean z, int i, C12521 c12521, int i2) {
        if (this.f18452) {
            throw new IOException("closed");
        }
        m16812(i, i2, (byte) 0, z ? (byte) 1 : (byte) 0);
        if (i2 > 0) {
            this.f18449.mo8911(c12521, i2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16820(ArrayList arrayList, int i, boolean z) {
        if (this.f18452) {
            throw new IOException("closed");
        }
        m16817(arrayList, i, z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m16821(C1938 c1938) {
        int i;
        if (this.f18452) {
            throw new IOException("closed");
        }
        int i2 = 0;
        m16812(0, c1938.m6397() * 6, (byte) 4, (byte) 0);
        while (i2 < 10) {
            if (c1938.m6396(i2)) {
                if (i2 == 4) {
                    i = 3;
                } else {
                    i = i2 == 7 ? 4 : i2;
                }
                this.f18449.writeShort(i);
                this.f18449.writeInt(c1938.m6390(i2));
            }
            i2++;
        }
        this.f18449.flush();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m16811() {
        if (this.f18452) {
            throw new IOException("closed");
        }
        Logger logger = f18448;
        if (logger.isLoggable(Level.FINE)) {
            String strMo2332 = C18002.f56150.mo2332();
            byte[] bArr = C20032.f64884;
            Locale locale = Locale.US;
            logger.fine(">> CONNECTION " + strMo2332);
        }
        this.f18449.write(C18002.f56150.mo2333());
        this.f18449.flush();
    }

    public C6007(InterfaceC10405 interfaceC10405) {
        this.f18449 = interfaceC10405;
        C12521 c12521 = new C12521();
        this.f18453 = c12521;
        this.f18451 = new C10947(c12521);
        this.f18450 = 16384;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m16822() {
        return this.f18450;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16812(int i, int i2, byte b, byte b2) {
        Level level = Level.FINE;
        Logger logger = f18448;
        if (logger.isLoggable(level)) {
            logger.fine(C18002.m42038(false, i, i2, b, b2));
        }
        int i3 = this.f18450;
        if (i2 > i3) {
            C18002.m42039("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            C18002.m42039("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
        InterfaceC10405 interfaceC10405 = this.f18449;
        interfaceC10405.writeByte((i2 >>> 16) & 255);
        interfaceC10405.writeByte((i2 >>> 8) & 255);
        interfaceC10405.writeByte(i2 & 255);
        interfaceC10405.writeByte(b & 255);
        interfaceC10405.writeByte(b2 & 255);
        interfaceC10405.writeInt(i & Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m16817(ArrayList arrayList, int i, boolean z) throws IOException {
        if (this.f18452) {
            throw new IOException("closed");
        }
        this.f18451.m27269(arrayList);
        C12521 c12521 = this.f18453;
        long size = c12521.size();
        int iMin = (int) Math.min(this.f18450, size);
        long j = iMin;
        byte b = size == j ? (byte) 4 : (byte) 0;
        if (z) {
            b = (byte) (b | 1);
        }
        m16812(i, iMin, (byte) 1, b);
        InterfaceC10405 interfaceC10405 = this.f18449;
        interfaceC10405.mo8911(c12521, j);
        if (size > j) {
            long j2 = size - j;
            while (j2 > 0) {
                int iMin2 = (int) Math.min(this.f18450, j2);
                long j3 = iMin2;
                j2 -= j3;
                m16812(i, iMin2, (byte) 9, j2 == 0 ? (byte) 4 : (byte) 0);
                interfaceC10405.mo8911(c12521, j3);
            }
        }
    }
}
