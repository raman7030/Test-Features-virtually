package p067l;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۜ᩵᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C9003 extends OutputStream {

    /* JADX INFO: renamed from: ۗ */
    public int f24389;

    /* JADX INFO: renamed from: ۙ */
    public IOException f24390;

    /* JADX INFO: renamed from: ۛ */
    public final byte[] f24391;

    /* JADX INFO: renamed from: ۟ */
    public final C19061 f24392;

    /* JADX INFO: renamed from: ۤ */
    public final ArrayDeque f24393 = new ArrayDeque();

    /* JADX INFO: renamed from: ۨ */
    public int f24394;

    /* JADX INFO: renamed from: ۫ */
    public long f24395;

    /* JADX INFO: renamed from: ۬ */
    public final C9653 f24396;

    /* JADX INFO: renamed from: ܰ */
    public boolean f24397;

    /* JADX INFO: renamed from: ᩶ */
    public final C21545 f24398;

    /* JADX INFO: renamed from: ᩸ */
    public final C24405 f24399;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f24400;

    /* JADX INFO: renamed from: ᩺ */
    public final C15687 f24401;

    public C9003(int i, int i2, C19061 c19061, C24405 c24405, C15687 c15687, C9653 c9653, C21545 c21545) {
        this.f24391 = new byte[Math.max(1, i)];
        this.f24392 = c19061;
        this.f24399 = c24405;
        this.f24401 = c15687;
        this.f24396 = c9653;
        this.f24398 = c21545;
        this.f24389 = Math.max(1, i2);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        m20820();
        int i2 = this.f24394;
        byte[] bArr = this.f24391;
        if (i2 == bArr.length) {
            m20823();
        }
        int i3 = this.f24394;
        this.f24394 = i3 + 1;
        bArr[i3] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        m20820();
        C12826.checkFromIndexSize(i, i2, bArr.length);
        while (i2 > 0) {
            byte[] bArr2 = this.f24391;
            int iMin = Math.min(i2, bArr2.length - this.f24394);
            System.arraycopy(bArr, i, bArr2, this.f24394, iMin);
            int i3 = this.f24394 + iMin;
            this.f24394 = i3;
            i += iMin;
            i2 -= iMin;
            if (i3 == bArr2.length) {
                m20823();
            }
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        m20820();
        m20823();
        m20821();
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f24400) {
            return;
        }
        boolean z = false;
        boolean z2 = this.f24390 != null;
        if (!z2) {
            try {
                m20823();
                m20821();
            } catch (IOException e) {
                e = e;
            }
        }
        e = null;
        try {
            this.f24399.run();
        } catch (IOException e2) {
            e = C6991.m16064(e, e2);
        }
        if (!z2 && e == null && this.f24393.isEmpty()) {
            z = true;
        }
        InterfaceC11015 interfaceC11015 = z ? this.f24401 : this.f24396;
        if (!z) {
            m20817();
        }
        try {
            interfaceC11015.run();
        } catch (IOException e3) {
            e = C6991.m16064(e, e3);
        }
        this.f24400 = true;
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

    /* JADX INFO: renamed from: ᩻ */
    private void m20823() throws IOException {
        int i = this.f24394;
        if (i == 0) {
            return;
        }
        try {
            byte[] bArrCopyOf = Arrays.copyOf(this.f24391, i);
            long j = this.f24395;
            ArrayDeque arrayDeque = this.f24393;
            while (arrayDeque.size() >= this.f24389) {
                m20822();
            }
            arrayDeque.addLast(m20819(j, i, bArrCopyOf));
            this.f24395 += (long) i;
            this.f24394 = 0;
        } catch (IOException e) {
            this.f24390 = e;
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private C25096 m20819(long j, int i, byte[] bArr) throws IOException {
        C19061 c19061 = this.f24392;
        c19061.getClass();
        try {
            C9578 c9578 = c19061.f56871.f70699;
            return new C25096(bArr, i, j, new C21744(c9578, c9578.m22315(j, i, bArr)));
        } catch (C3406 e) {
            throw new IOException(e.getMessage(), e);
        } catch (C12776 e2) {
            throw new IOException(e2.getMessage(), e2);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m20821() throws IOException {
        while (!this.f24393.isEmpty()) {
            m20822();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m20822() throws IOException {
        ArrayDeque arrayDeque = this.f24393;
        C25096 c25096 = (C25096) arrayDeque.removeFirst();
        try {
            m20818(c25096);
        } catch (IOException e) {
            this.f24398.getClass();
            if (!C6991.m16084((Exception) e) || this.f24397) {
                this.f24390 = e;
                ((C21744) c25096.f80070).m49023();
                m20817();
                throw e;
            }
            this.f24397 = true;
            ArrayList<C25096> arrayList = new ArrayList();
            arrayList.add(c25096);
            arrayList.addAll(arrayDeque);
            m20817();
            arrayDeque.clear();
            try {
                this.f24389 = Math.max(1, Math.min(this.f24389, this.f24392.m43300(c25096.f80068)));
                for (C25096 c25097 : arrayList) {
                    while (arrayDeque.size() >= this.f24389) {
                        m20822();
                    }
                    byte[] bArr = c25097.f80067;
                    arrayDeque.addLast(m20819(c25097.f80068, c25097.f80069, bArr));
                }
                m20821();
            } catch (IOException e2) {
                this.f24390 = C6991.m16064(e, e2);
                m20817();
                throw this.f24390;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m20818(C25096 c25096) throws IOException {
        long jM49022 = ((C21744) c25096.f80070).m49022();
        int i = c25096.f80069;
        if (jM49022 == i) {
            long unused = c25096.f80068;
        } else {
            if (jM49022 <= 0) {
                throw new IOException("SMB write returned no progress");
            }
            throw new IOException("SMB write returned partial progress: expected " + i + ", actual " + jM49022);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m20817() {
        while (true) {
            ArrayDeque arrayDeque = this.f24393;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((C21744) ((C25096) arrayDeque.removeFirst()).f80070).m49023();
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m20820() throws IOException {
        if (this.f24400) {
            throw new IOException("Stream is closed");
        }
        IOException iOException = this.f24390;
        if (iOException != null) {
            throw iOException;
        }
    }
}
