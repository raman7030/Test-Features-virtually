package l;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: l.ܺ۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6OT */
/* JADX INFO: loaded from: classes4.dex */
public final class C15959 implements InterfaceC10316 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f49260 = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public IOException f49261;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f49262;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10316 f49263;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f49264;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f49265;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f49266;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public byte[] f49267;

    public C15959(InterfaceC10316 interfaceC10316) {
        this.f49263 = interfaceC10316;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37736(long j, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m37732();
            if (this.f49266) {
                throw new IllegalStateException("Recovery append batch is already active");
            }
            this.f49266 = true;
            this.f49267 = bArr;
            this.f49264 = j;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37735() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            try {
                m37734();
                this.f49267 = null;
                this.f49262 = 0;
                this.f49266 = false;
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                this.f49267 = null;
                this.f49262 = 0;
                this.f49266 = false;
                throw th;
            }
        } catch (Throwable th2) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m37732() throws IOException {
        if (this.f49265) {
            throw new IOException("Recovery file is closed");
        }
        if (this.f49261 != null) {
            throw new IOException("Buffered recovery append requires reopening", this.f49261);
        }
    }

    public final void flush() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m37734();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m37734() throws IOException {
        m37732();
        int i = this.f49262;
        if (i == 0) {
            return;
        }
        try {
            this.f49263.mo14383(this.f49264, i, this.f49267);
            this.f49264 += (long) this.f49262;
            this.f49262 = 0;
        } catch (IOException e) {
            this.f49261 = e;
            throw e;
        }
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ֫ */
    public final void mo14383(long j, int i, byte[] bArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m37732();
            int i2 = 0;
            m37733(j, bArr, 0, i);
            byte[] bArr2 = this.f49267;
            InterfaceC10316 interfaceC10316 = this.f49263;
            if (bArr2 == null) {
                interfaceC10316.mo14383(j, i, bArr);
            } else if (j != this.f49264 + ((long) this.f49262)) {
                m37734();
                interfaceC10316.mo14383(j, i, bArr);
                this.f49264 = interfaceC10316.length();
            } else {
                while (i > 0) {
                    int iMin = Math.min(i, this.f49267.length - this.f49262);
                    System.arraycopy(bArr, i2, this.f49267, this.f49262, iMin);
                    int i3 = this.f49262 + iMin;
                    this.f49262 = i3;
                    i2 += iMin;
                    i -= iMin;
                    if (i3 == this.f49267.length) {
                        m37734();
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
    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ֫ */
    public final void mo14384(long j, byte[] bArr, int i, int i2) {
        long j2;
        int i3;
        int i4 = i2;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.readLock().lock();
        try {
            m37732();
            m37733(j, bArr, i, i2);
            int i5 = this.f49262;
            if (i5 != 0) {
                long j3 = this.f49264;
                if (j >= ((long) i5) + j3 || ((long) i4) + j <= j3) {
                    this.f49263.mo14384(j, bArr, i, i2);
                } else {
                    if (j < j3) {
                        int i6 = (int) (j3 - j);
                        this.f49263.mo14384(j, bArr, i, i6);
                        j2 = ((long) i6) + j;
                        i3 = i + i6;
                        i4 -= i6;
                    } else {
                        j2 = j;
                        i3 = i;
                    }
                    int iMin = (int) Math.min(i4, (this.f49264 + ((long) this.f49262)) - j2);
                    System.arraycopy(this.f49267, (int) (j2 - this.f49264), bArr, i3, iMin);
                    if (iMin < i4) {
                        this.f49263.mo14384(((long) iMin) + j2, bArr, i3 + iMin, i4 - iMin);
                    }
                }
            } else {
                this.f49263.mo14384(j, bArr, i, i2);
            }
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m37733(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || j > C13132.FOREVER_NS - ((long) i2) || i < 0 || i2 < 0 || i > bArr.length - i2) {
            throw new IndexOutOfBoundsException("Invalid recovery I/O range");
        }
    }

    @Override // l.InterfaceC10316
    public final long length() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.readLock().lock();
        try {
            m37732();
            int i = this.f49262;
            InterfaceC10316 interfaceC10316 = this.f49263;
            return i == 0 ? interfaceC10316.length() : Math.max(interfaceC10316.length(), this.f49264 + ((long) this.f49262));
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034 A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0009, B:7:0x0013, B:10:0x001a, B:11:0x0020, B:13:0x0024, B:15:0x002a, B:16:0x0034, B:19:0x0049, B:20:0x0050, B:21:0x0051, B:22:0x0058), top: B:26:0x0009 }] */
    @Override // l.InterfaceC10316
    public final void truncate(long j) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (this.f49265) {
                throw new IOException("Recovery file is closed");
            }
            if (j < 0) {
                throw new IllegalArgumentException("Negative recovery length");
            }
            IOException iOException = this.f49261;
            InterfaceC10316 interfaceC10316 = this.f49263;
            if (iOException != null) {
                this.f49262 = 0;
                interfaceC10316.truncate(j);
            } else {
                int i = this.f49262;
                if (i != 0) {
                    long j2 = this.f49264;
                    if (j >= j2) {
                        this.f49262 = (int) Math.min(i, j - j2);
                    } else {
                        interfaceC10316.truncate(j);
                        this.f49262 = 0;
                        this.f49264 = Math.min(this.f49264, j);
                    }
                } else {
                    interfaceC10316.truncate(j);
                    this.f49262 = 0;
                    this.f49264 = Math.min(this.f49264, j);
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ܺ */
    public final void mo14386() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            m37734();
            this.f49263.mo14386();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // l.InterfaceC10316
    /* JADX INFO: renamed from: ۘ֫ */
    public final void mo14385() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.f49263.mo14385();
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        InterfaceC10316 interfaceC10316 = this.f49263;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f49260;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (!this.f49265) {
                try {
                    if (this.f49261 == null) {
                        m37734();
                    }
                    this.f49267 = null;
                    this.f49262 = 0;
                    this.f49266 = false;
                    this.f49265 = true;
                    interfaceC10316.close();
                } catch (Throwable th) {
                    this.f49267 = null;
                    this.f49262 = 0;
                    this.f49266 = false;
                    this.f49265 = true;
                    interfaceC10316.close();
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
