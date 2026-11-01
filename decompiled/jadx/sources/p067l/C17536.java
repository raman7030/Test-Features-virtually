package p067l;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ܺ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C17536 implements InterfaceC12173 {

    /* JADX INFO: renamed from: ۗ */
    public final ReentrantReadWriteLock f52406 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۙ */
    public IOException f52407;

    /* JADX INFO: renamed from: ۤ */
    public int f52408;

    /* JADX INFO: renamed from: ۫ */
    public final InterfaceC12173 f52409;

    /* JADX INFO: renamed from: ۬ */
    public long f52410;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f52411;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f52412;

    /* JADX INFO: renamed from: ᩹ */
    public byte[] f52413;

    public C17536(InterfaceC12173 interfaceC12173) {
        this.f52409 = interfaceC12173;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39911(long j, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m39907();
            if (this.f52412) {
                throw new IllegalStateException("Recovery append batch is already active");
            }
            this.f52412 = true;
            this.f52413 = bArr;
            this.f52410 = j;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m39910() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                m39909();
                this.f52413 = null;
                this.f52408 = 0;
                this.f52412 = false;
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                this.f52413 = null;
                this.f52408 = 0;
                this.f52412 = false;
                throw th;
            }
        } catch (Throwable th2) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m39907() throws IOException {
        if (this.f52411) {
            throw new IOException("Recovery file is closed");
        }
        if (this.f52407 != null) {
            throw new IOException("Buffered recovery append requires reopening", this.f52407);
        }
    }

    public final void flush() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m39909();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m39909() throws IOException {
        m39907();
        int i = this.f52408;
        if (i == 0) {
            return;
        }
        try {
            this.f52409.mo16280(this.f52410, i, this.f52413);
            this.f52410 += (long) this.f52408;
            this.f52408 = 0;
        } catch (IOException e) {
            this.f52407 = e;
            throw e;
        }
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ֫ */
    public final void mo16280(long j, int i, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m39907();
            int i2 = 0;
            m39908(j, bArr, 0, i);
            byte[] bArr2 = this.f52413;
            InterfaceC12173 interfaceC12173 = this.f52409;
            if (bArr2 == null) {
                interfaceC12173.mo16280(j, i, bArr);
            } else if (j != this.f52410 + ((long) this.f52408)) {
                m39909();
                interfaceC12173.mo16280(j, i, bArr);
                this.f52410 = interfaceC12173.length();
            } else {
                while (i > 0) {
                    int iMin = Math.min(i, this.f52413.length - this.f52408);
                    System.arraycopy(bArr, i2, this.f52413, this.f52408, iMin);
                    int i3 = this.f52408 + iMin;
                    this.f52408 = i3;
                    i2 += iMin;
                    i -= iMin;
                    if (i3 == this.f52413.length) {
                        m39909();
                    }
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x000c, B:5:0x0016, B:7:0x001e, B:12:0x002a, B:14:0x0044, B:16:0x005f, B:17:0x006d), top: B:23:0x000c }] */
    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ֫ */
    public final void mo16281(long j, byte[] bArr, int i, int i2) {
        long j2;
        int i3;
        int i4 = i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.readLock().lock();
        try {
            m39907();
            m39908(j, bArr, i, i2);
            int i5 = this.f52408;
            if (i5 != 0) {
                long j3 = this.f52410;
                if (j >= ((long) i5) + j3 || ((long) i4) + j <= j3) {
                    this.f52409.mo16281(j, bArr, i, i2);
                } else {
                    if (j < j3) {
                        int i6 = (int) (j3 - j);
                        this.f52409.mo16281(j, bArr, i, i6);
                        j2 = ((long) i6) + j;
                        i3 = i + i6;
                        i4 -= i6;
                    } else {
                        j2 = j;
                        i3 = i;
                    }
                    int iMin = (int) Math.min(i4, (this.f52410 + ((long) this.f52408)) - j2);
                    System.arraycopy(this.f52413, (int) (j2 - this.f52410), bArr, i3, iMin);
                    if (iMin < i4) {
                        this.f52409.mo16281(((long) iMin) + j2, bArr, i3 + iMin, i4 - iMin);
                    }
                }
            } else {
                this.f52409.mo16281(j, bArr, i, i2);
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m39908(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || j > C14849.FOREVER_NS - ((long) i2) || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException("Invalid recovery I/O range");
        }
    }

    @Override // p067l.InterfaceC12173
    public final long length() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.readLock().lock();
        try {
            m39907();
            int i = this.f52408;
            InterfaceC12173 interfaceC12173 = this.f52409;
            return i == 0 ? interfaceC12173.length() : Math.max(interfaceC12173.length(), this.f52410 + ((long) this.f52408));
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0009, B:7:0x0013, B:10:0x001a, B:11:0x0020, B:13:0x0024, B:15:0x002a, B:16:0x0034, B:19:0x0049, B:20:0x0050, B:21:0x0051, B:22:0x0058), top: B:26:0x0009 }] */
    @Override // p067l.InterfaceC12173
    public final void truncate(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (this.f52411) {
                throw new IOException("Recovery file is closed");
            }
            if (j < 0) {
                throw new IllegalArgumentException("Negative recovery length");
            }
            IOException iOException = this.f52407;
            InterfaceC12173 interfaceC12173 = this.f52409;
            if (iOException != null) {
                this.f52408 = 0;
                interfaceC12173.truncate(j);
            } else {
                int i = this.f52408;
                if (i != 0) {
                    long j2 = this.f52410;
                    if (j >= j2) {
                        this.f52408 = (int) Math.min(i, j - j2);
                    } else {
                        interfaceC12173.truncate(j);
                        this.f52408 = 0;
                        this.f52410 = Math.min(this.f52410, j);
                    }
                } else {
                    interfaceC12173.truncate(j);
                    this.f52408 = 0;
                    this.f52410 = Math.min(this.f52410, j);
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ܺ */
    public final void mo16283() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m39909();
            this.f52409.mo16283();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // p067l.InterfaceC12173
    /* JADX INFO: renamed from: ۘ֫ */
    public final void mo16282() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f52409.mo16282();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC12173 interfaceC12173 = this.f52409;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f52406;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!this.f52411) {
                try {
                    if (this.f52407 == null) {
                        m39909();
                    }
                    this.f52413 = null;
                    this.f52408 = 0;
                    this.f52412 = false;
                    this.f52411 = true;
                    interfaceC12173.close();
                } catch (Throwable th) {
                    this.f52413 = null;
                    this.f52408 = 0;
                    this.f52412 = false;
                    this.f52411 = true;
                    interfaceC12173.close();
                    throw th;
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th2) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th2;
        }
    }
}
