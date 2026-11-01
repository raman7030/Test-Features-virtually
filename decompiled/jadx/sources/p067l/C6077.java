package p067l;

import java.io.File;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.ۘۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6077 implements InterfaceC17475, InterfaceC8955 {

    /* JADX INFO: renamed from: ۗ */
    public byte[] f15280;

    /* JADX INFO: renamed from: ۙ */
    public final AtomicInteger f15281 = new AtomicInteger(1);

    /* JADX INFO: renamed from: ᩶ */
    public int f15282;

    /* JADX INFO: renamed from: ᩸ */
    public final C4736 f15283;

    /* JADX INFO: renamed from: ᩹ */
    public final int f15284;

    /* JADX INFO: renamed from: ֫ */
    public static C6077 m13828(File file, C10967 c10967, InterfaceC18588 interfaceC18588) {
        int i = c10967 == null ? 0 : c10967.f30368;
        if (i <= 0) {
            throw new IllegalArgumentException("Hex literal range is empty");
        }
        C6077 c6077M13827 = m13827(file, i, true, true);
        try {
            Iterator it = C21026.m47431(c10967).iterator();
            while (it.hasNext()) {
                c6077M13827.mo13832((C22367) it.next(), interfaceC18588);
            }
            c6077M13827.finish();
            return c6077M13827;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c6077M13827.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    public C6077(int i, C4736 c4736, boolean z) {
        if (c4736.length() != i) {
            throw new IllegalArgumentException("Hex clipboard allocation length mismatch");
        }
        this.f15284 = i;
        this.f15283 = c4736;
        if (z) {
            this.f15280 = new byte[Math.min(i, 1048576)];
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6077 m13826(File file, int i) throws IOException {
        if (i <= 65536) {
            throw new IllegalArgumentException("Hex clipboard file allocation is too small");
        }
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        return m13827(file, i, true, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6077 m13825(int i, long j, C24181 c24181) {
        synchronized (C19644.f59744) {
            if (C19644.f59747 != c24181) {
                return null;
            }
            C4736 c4736M53462 = c24181.m53462(i, j);
            if (c4736M53462 == null) {
                return null;
            }
            try {
                return new C6077(i, c4736M53462, true);
            } catch (Error | RuntimeException e) {
                try {
                    c4736M53462.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6077 m13829(File file, byte[] bArr, int i, int i2, InterfaceC18588 interfaceC18588) throws C25008 {
        if (i2 <= 0) {
            throw new IllegalArgumentException("Hex literal file allocation is empty");
        }
        InterfaceC18588 interfaceC18588M40721 = C17917.m40721(interfaceC18588);
        if (interfaceC18588M40721.mo3924()) {
            throw new C25008();
        }
        int i3 = 0;
        C6077 c6077M13827 = m13827(file, i2, true, false);
        while (i3 < i2) {
            try {
                if (interfaceC18588M40721.mo3924()) {
                    throw new C25008();
                }
                int iMin = Math.min(1048576, i2 - i3);
                c6077M13827.f15283.m10036(i3, bArr, i + i3, iMin);
                i3 += iMin;
            } catch (IOException | Error | RuntimeException e) {
                try {
                    c6077M13827.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
                throw e;
            }
        }
        if (interfaceC18588M40721.mo3924()) {
            throw new C25008();
        }
        c6077M13827.f15282 = i2;
        return c6077M13827;
    }

    /* JADX INFO: renamed from: ۧ */
    public static C6077 m13830(File file, int i) throws Throwable {
        if (i <= 65536) {
            throw new IllegalArgumentException("Hex clipboard file allocation is too small");
        }
        if (!file.isDirectory()) {
            throw new IOException("Hex clipboard cache directory is unavailable");
        }
        C24181 c24181M53454 = C24181.m53454(file);
        C4736 c4736M53461 = null;
        try {
            synchronized (C19644.f59744) {
                c4736M53461 = c24181M53454.m53461(i);
            }
            return new C6077(i, c4736M53461, true);
        } catch (IOException | Error | RuntimeException e) {
            if (c4736M53461 != null) {
                try {
                    c4736M53461.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6077 m13824(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Hex clipboard allocation is empty");
        }
        return m13827((File) null, i, false, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C6077 m13827(File file, int i, boolean z, boolean z2) {
        C4736 c4736M53461;
        AutoCloseable autoCloseable = null;
        try {
            synchronized (C19644.f59744) {
                if (C19644.f59747 == null) {
                    if (!z) {
                        throw new IOException("Hex clipboard shared arena is unavailable");
                    }
                    C19644.f59747 = C24181.m53454(file);
                }
                c4736M53461 = C19644.f59747.m53461(i);
            }
            return new C6077(i, c4736M53461, z2);
        } catch (IOException | Error | RuntimeException e) {
            if (0 != 0) {
                try {
                    autoCloseable.close();
                } catch (IOException e2) {
                    e.addSuppressed(e2);
                }
            }
            throw e;
        }
    }

    @Override // p067l.InterfaceC17475
    /* JADX INFO: renamed from: ֫ */
    public final int mo13832(C22367 c22367, InterfaceC18588 interfaceC18588) throws IOException {
        m13831();
        int i = this.f15282;
        int i2 = c22367.f70579;
        int i3 = c22367.f70579;
        if (((long) i) + ((long) i2) > this.f15284 || this.f15280 == null) {
            throw new IOException("Hex clipboard file backing overflow");
        }
        int i4 = 0;
        while (i4 < i3) {
            if (interfaceC18588.mo3924()) {
                throw new C25008();
            }
            int iMin = Math.min(this.f15280.length, i3 - i4);
            c22367.m50205(i4, this.f15280, 0, iMin);
            if (interfaceC18588.mo3924()) {
                throw new C25008();
            }
            this.f15283.m10036(this.f15282, this.f15280, 0, iMin);
            i4 += iMin;
            this.f15282 += iMin;
        }
        return i;
    }

    @Override // p067l.InterfaceC17475
    public final void finish() throws IOException {
        m13831();
        if (this.f15282 != this.f15284) {
            throw new IOException("Incomplete hex clipboard file backing");
        }
        this.f15280 = null;
    }

    @Override // p067l.InterfaceC20315
    public final int length() {
        return this.f15284;
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ֫ */
    public final void mo12117(int i, byte[] bArr, int i2, int i3) throws IOException {
        m13831();
        if (this.f15282 != this.f15284 || this.f15280 != null) {
            throw new IOException("Hex clipboard file backing is incomplete");
        }
        this.f15283.m10035(i, bArr, i2, i3);
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo12119() {
        return this.f15281.get() > 0 && this.f15283.isOpen();
    }

    @Override // p067l.InterfaceC20315
    /* JADX INFO: renamed from: ᩺ۧ */
    public final InterfaceC20315 mo12121() throws ClosedChannelException {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = this.f15281;
            i = atomicInteger.get();
            if (i <= 0) {
                throw new ClosedChannelException();
            }
            long j = ((long) i) + ((long) 1);
            i2 = (int) j;
            if (j != i2) {
                throw new ArithmeticException();
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicInteger atomicInteger = this.f15281;
        int iDecrementAndGet = atomicInteger.decrementAndGet();
        if (iDecrementAndGet == 0) {
            this.f15283.close();
        } else {
            if (iDecrementAndGet >= 0) {
                return;
            }
            atomicInteger.incrementAndGet();
            throw new IllegalStateException("Hex clipboard file source already closed");
        }
    }

    @Override // p067l.InterfaceC6233
    /* JADX INFO: renamed from: ֫ */
    public final Object mo12116() {
        return this.f15283;
    }

    @Override // p067l.InterfaceC8955
    /* JADX INFO: renamed from: ܿ */
    public final long mo13833() {
        return this.f15284;
    }

    @Override // p067l.InterfaceC8955
    /* JADX INFO: renamed from: ᩳ */
    public final long mo13834() {
        return this.f15284;
    }

    @Override // p067l.InterfaceC6233
    /* JADX INFO: renamed from: ܽ */
    public final long mo12120() {
        return this.f15283.length();
    }

    /* JADX INFO: renamed from: ܳ */
    private void m13831() throws ClosedChannelException {
        if (this.f15281.get() <= 0 || !this.f15283.isOpen()) {
            throw new ClosedChannelException();
        }
    }
}
