package l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C6980 extends OutputStream {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f21509;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public IOException f21510;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final byte[] f21511;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C17563 f21512;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f21513 = new ArrayDeque();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f21514;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f21515;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C7664 f21516;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f21517;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C20177 f21518;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C23186 f21519;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f21520;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C14013 f21521;

    public C6980(int i, int i2, C17563 c17563, C23186 c23186, C14013 c14013, C7664 c7664, C20177 c20177) {
        this.f21511 = new byte[Math.max(1, i)];
        this.f21512 = c17563;
        this.f21519 = c23186;
        this.f21521 = c14013;
        this.f21516 = c7664;
        this.f21518 = c20177;
        this.f21509 = Math.max(1, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m18866();
        int i2 = this.f21514;
        byte[] bArr = this.f21511;
        if (i2 == bArr.length) {
            m18869();
        }
        int i3 = this.f21514;
        this.f21514 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m18866();
        C11003.checkFromIndexSize(i, i2, bArr.length);
        while (i2 > 0) {
            byte[] bArr2 = this.f21511;
            int iMin = Math.min(i2, bArr2.length - this.f21514);
            System.arraycopy(bArr, i, bArr2, this.f21514, iMin);
            int i3 = this.f21514 + iMin;
            this.f21514 = i3;
            i += iMin;
            i2 -= iMin;
            if (i3 == bArr2.length) {
                m18869();
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m18866();
        m18869();
        m18867();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f21520) {
            return;
        }
        boolean z = false;
        boolean z2 = this.f21510 != null;
        if (!z2) {
            try {
                m18869();
                m18867();
            } catch (IOException e) {
                e = e;
            }
        }
        e = null;
        try {
            this.f21519.run();
        } catch (IOException e2) {
            e = C4863.m14183(e, e2);
        }
        if (!z2 && e == null && this.f21513.isEmpty()) {
            z = true;
        }
        InterfaceC9097 interfaceC9097 = z ? this.f21521 : this.f21516;
        if (!z) {
            m18863();
        }
        try {
            interfaceC9097.run();
        } catch (IOException e3) {
            e = C4863.m14183(e, e3);
        }
        this.f21520 = true;
        if (e != null) {
            throw e;
        }
    }

    public final void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m18869() throws IOException {
        int i = this.f21514;
        if (i == 0) {
            return;
        }
        try {
            byte[] bArrCopyOf = Arrays.copyOf(this.f21511, i);
            long j = this.f21515;
            ArrayDeque arrayDeque = this.f21513;
            while (arrayDeque.size() >= this.f21509) {
                m18868();
            }
            arrayDeque.addLast(m18865(j, i, bArrCopyOf));
            this.f21515 += (long) i;
            this.f21514 = 0;
        } catch (IOException e) {
            this.f21510 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private C23913 m18865(long j, int i, byte[] bArr) throws IOException {
        C17563 c17563 = this.f21512;
        c17563.getClass();
        try {
            C7586 c7586 = c17563.f53681.f68017;
            return new C23913(bArr, i, j, new C20386(c7586, c7586.m20338(j, i, bArr)));
        } catch (C1092 e) {
            throw new IOException(e.getMessage(), e);
        } catch (C10951 e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m18867() throws IOException {
        while (!this.f21513.isEmpty()) {
            m18868();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m18868() throws IOException {
        ArrayDeque arrayDeque = this.f21513;
        C23913 c23913 = (C23913) arrayDeque.removeFirst();
        try {
            m18864(c23913);
        } catch (IOException e) {
            this.f21518.getClass();
            if (!C4863.m14203((Exception) e) || this.f21517) {
                this.f21510 = e;
                ((C20386) c23913.f77319).m46700();
                m18863();
                throw e;
            }
            this.f21517 = true;
            ArrayList<C23913> arrayList = new ArrayList();
            arrayList.add(c23913);
            arrayList.addAll(arrayDeque);
            m18863();
            arrayDeque.clear();
            try {
                this.f21509 = Math.max(1, Math.min(this.f21509, this.f21512.m41054(c23913.f77317)));
                for (C23913 c23914 : arrayList) {
                    while (arrayDeque.size() >= this.f21509) {
                        m18868();
                    }
                    byte[] bArr = c23914.f77316;
                    arrayDeque.addLast(m18865(c23914.f77317, c23914.f77318, bArr));
                }
                m18867();
            } catch (IOException e2) {
                this.f21510 = C4863.m14183(e, e2);
                m18863();
                throw this.f21510;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18864(C23913 c23913) throws IOException {
        long jM46699 = ((C20386) c23913.f77319).m46699();
        int i = c23913.f77318;
        if (jM46699 == i) {
            long unused = c23913.f77317;
        } else {
            if (jM46699 <= 0) {
                throw new IOException("SMB write returned no progress");
            }
            throw new IOException("SMB write returned partial progress: expected " + i + ", actual " + jM46699);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m18863() {
        while (true) {
            ArrayDeque arrayDeque = this.f21513;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((C20386) ((C23913) arrayDeque.removeFirst()).f77319).m46700();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m18866() throws IOException {
        if (this.f21520) {
            throw new IOException("Stream is closed");
        }
        IOException iOException = this.f21510;
        if (iOException != null) {
            throw iOException;
        }
    }
}
