package p067l;

import android.media.MediaDataSource;
import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.prng.X931RNG;

/* JADX INFO: renamed from: l.ܰ᩻᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L8GV */
/* JADX INFO: loaded from: classes3.dex */
public final class C15826 implements Closeable {

    /* JADX INFO: renamed from: ֫֫ */
    public final long f45814;

    /* JADX INFO: renamed from: ۗ */
    public volatile boolean f45815;

    /* JADX INFO: renamed from: ۙ */
    public volatile int f45816;

    /* JADX INFO: renamed from: ۛ */
    public final int f45817;

    /* JADX INFO: renamed from: ۟ */
    public final InterfaceC24544 f45818;

    /* JADX INFO: renamed from: ۤ */
    public long f45819;

    /* JADX INFO: renamed from: ۧ֫ */
    public final AtomicInteger f45820;

    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC25149 f45821;

    /* JADX INFO: renamed from: ۫ */
    public volatile InputStream f45822;

    /* JADX INFO: renamed from: ۬ */
    public final CRC32 f45823;

    /* JADX INFO: renamed from: ܰ */
    public final C12472 f45824;

    /* JADX INFO: renamed from: ᩶ */
    public Thread f45825;

    /* JADX INFO: renamed from: ᩸ */
    public int f45826;

    /* JADX INFO: renamed from: ᩹ */
    public final C24618 f45827;

    /* JADX INFO: renamed from: ᩺ */
    public final String f45828;

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:9:0x0011, B:11:0x0017, B:17:0x0031, B:20:0x0049, B:23:0x0058, B:25:0x005c, B:27:0x0066, B:29:0x006a, B:30:0x0070, B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a, B:39:0x008c, B:40:0x0091, B:41:0x0092, B:42:0x0099, B:22:0x0051, B:43:0x009a, B:44:0x00a1), top: B:48:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: IOException -> 0x008b, all -> 0x00a2, TRY_LEAVE, TryCatch #2 {IOException -> 0x008b, blocks: (B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a), top: B:50:0x0072, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[Catch: IOException -> 0x008b, all -> 0x00a2, TRY_ENTER, TryCatch #2 {IOException -> 0x008b, blocks: (B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a), top: B:50:0x0072, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:9:0x0011, B:11:0x0017, B:17:0x0031, B:20:0x0049, B:23:0x0058, B:25:0x005c, B:27:0x0066, B:29:0x006a, B:30:0x0070, B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a, B:39:0x008c, B:40:0x0091, B:41:0x0092, B:42:0x0099, B:22:0x0051, B:43:0x009a, B:44:0x00a1), top: B:48:0x0002, inners: #1, #2 }] */
    /* JADX INFO: renamed from: ۧ */
    private synchronized byte[] m35917(int i, int i2) {
        InputStream inputStreamMo37461;
        if (this.f45815) {
            throw new IOException("Closed");
        }
        long j = ((long) i) * X931RNG.BLOCK64_RESEED_MAX;
        if (this.f45822 == null) {
            if (!this.f45815) {
                throw new IOException("Closed");
            }
            inputStreamMo37461 = this.f45818.mo37461(j);
            if (!(inputStreamMo37461 instanceof BufferedInputStream)) {
                inputStreamMo37461 = new BufferedInputStream(inputStreamMo37461);
            }
            this.f45822 = inputStreamMo37461;
            if (!this.f45815) {
                throw new IOException("Closed");
            }
            byte[] bArr = C23461.f74712;
            byte[] bArr2 = new byte[i2];
            C23461.m52184(inputStreamMo37461, bArr2, i2);
            this.f45819 = j + ((long) i2);
            return bArr2;
        }
        try {
            long j2 = this.f45819;
            if (j == j2) {
                InputStream inputStream = this.f45822;
                byte[] bArr3 = C23461.f74712;
                byte[] bArr4 = new byte[i2];
                C23461.m52184(inputStream, bArr4, i2);
                this.f45819 = ((long) i2) + j;
                return bArr4;
            }
            if (j > j2 && j - j2 < 327680) {
                C23461.m52183(j - this.f45819, this.f45822);
                this.f45819 = j;
                byte[] bArr5 = new byte[i2];
                C23461.m52184(this.f45822, bArr5, i2);
                this.f45819 = ((long) i2) + j;
                return bArr5;
            }
            C23461.m52177((Closeable) this.f45822);
            this.f45822 = null;
            if (!this.f45815) {
                throw new IOException("Closed");
            }
            inputStreamMo37461 = this.f45818.mo37461(j);
            if (!(inputStreamMo37461 instanceof BufferedInputStream) && !(inputStreamMo37461 instanceof C6514)) {
                inputStreamMo37461 = new BufferedInputStream(inputStreamMo37461);
            }
            this.f45822 = inputStreamMo37461;
            try {
                if (!this.f45815) {
                    throw new IOException("Closed");
                }
                byte[] bArr6 = C23461.f74712;
                byte[] bArr7 = new byte[i2];
                C23461.m52184(inputStreamMo37461, bArr7, i2);
                this.f45819 = j + ((long) i2);
                return bArr7;
            } catch (IOException e) {
                C23461.m52177((Closeable) inputStreamMo37461);
                this.f45822 = null;
                throw e;
            }
        } catch (IOException unused) {
            C23461.m52177((Closeable) this.f45822);
            this.f45822 = null;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ܳ */
    public final synchronized void m35921() {
        synchronized (this.f45820) {
            if (!this.f45815 && this.f45825 == null && this.f45827 != null) {
                this.f45826++;
                Thread thread = new Thread(new RunnableC20435(2, this));
                this.f45825 = thread;
                thread.setDaemon(true);
                this.f45825.setName("NetworkFileCacheThread-" + this.f45828.hashCode());
                this.f45825.start();
                return;
            }
            if (this.f45825 == null || this.f45815 || this.f45827 == null) {
                throw new IllegalStateException();
            }
        }
    }

    public C15826(InterfaceC24544 interfaceC24544, String str, long j) {
        C5033 c5033M10712 = C5033.m10712();
        c5033M10712.m10716(320L);
        this.f45821 = c5033M10712.m10714();
        this.f45816 = 0;
        this.f45820 = new AtomicInteger(1);
        this.f45823 = new CRC32();
        this.f45818 = interfaceC24544;
        this.f45828 = str;
        this.f45814 = j;
        long j2 = (j + 32767) / X931RNG.BLOCK64_RESEED_MAX;
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        this.f45817 = i - 1;
        this.f45827 = null;
        this.f45824 = null;
    }

    public C15826(C16504 c16504, String str, long j, AbstractC17043 abstractC17043) {
        C5033 c5033M10712 = C5033.m10712();
        c5033M10712.m10716(320L);
        this.f45821 = c5033M10712.m10714();
        int i = 0;
        this.f45816 = 0;
        this.f45820 = new AtomicInteger(1);
        this.f45823 = new CRC32();
        this.f45818 = c16504;
        this.f45828 = str;
        this.f45814 = j;
        long j2 = (32767 + j) / X931RNG.BLOCK64_RESEED_MAX;
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        this.f45817 = i2 - 1;
        abstractC17043.mo37342();
        C24618 c24618M38671 = abstractC17043.m38671("rw");
        this.f45827 = c24618M38671;
        this.f45824 = new C12472();
        try {
            if (c24618M38671.length() < 12) {
                m35913();
                return;
            }
            if (c24618M38671.readInt() != 358818181 || c24618M38671.readLong() != j) {
                throw new IOException();
            }
            c24618M38671.seek(12L);
            while (this.f45827.available() > 0) {
                if (this.f45827.available() < 32776) {
                    C24618 c24618 = this.f45827;
                    c24618.setLength(c24618.getFilePointer());
                    return;
                }
                int i3 = this.f45827.readInt();
                int iMo23137 = this.f45827.mo23137();
                if (i3 > this.f45817 || iMo23137 > 32768) {
                    throw new IOException();
                }
                int i4 = i + 1;
                this.f45824.mo25657(i3, i);
                this.f45827.seek((((long) i4) * 32776) + 12);
                i = i4;
            }
        } catch (Exception unused) {
            m35913();
        }
    }

    /* JADX INFO: renamed from: ۖ */
    private void m35913() {
        C24618 c24618 = this.f45827;
        c24618.setLength(0L);
        c24618.writeInt(358818181);
        long j = this.f45814;
        c24618.write((int) (j & 255));
        c24618.write((int) ((j >>> 8) & 255));
        c24618.write((int) ((j >>> 16) & 255));
        c24618.write((int) ((j >>> 24) & 255));
        c24618.write((int) ((j >>> 32) & 255));
        c24618.write((int) ((j >>> 40) & 255));
        c24618.write((int) ((j >>> 48) & 255));
        c24618.write((int) ((j >>> 56) & 255));
        this.f45824.clear();
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m35922(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || bArr == null || i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        long j2 = this.f45814;
        if (j >= j2) {
            return -1;
        }
        int iMin = (int) Math.min(i2, j2 - j);
        if (iMin == 0) {
            return 0;
        }
        int i3 = iMin;
        while (i3 > 0) {
            int i4 = (int) (j / X931RNG.BLOCK64_RESEED_MAX);
            long j3 = ((long) i4) * X931RNG.BLOCK64_RESEED_MAX;
            int i5 = i4 == this.f45817 ? (int) (j2 - j3) : 32768;
            int i6 = (int) (j - j3);
            int iMin2 = Math.min(i5 - i6, i3);
            System.arraycopy(m35911(i4, i5), i6, bArr, i, iMin2);
            i3 -= iMin2;
            i += iMin2;
            j += (long) iMin2;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m35924() {
        return this.f45814;
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m35916(C15826 c15826) {
        while (!c15826.f45815 && c15826.f45824.size() < c15826.f45817 + 1) {
            try {
                int i = c15826.f45816;
                int i2 = i;
                while (true) {
                    if (i2 > c15826.f45817) {
                        i2 = -1;
                        break;
                    } else if (!c15826.f45824.mo25658(i2)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    for (int i3 = 0; i3 < i; i3++) {
                        if (!c15826.f45824.mo25658(i3)) {
                            i2 = i3;
                            break;
                        }
                    }
                }
                if (i2 == -1) {
                    break;
                }
                try {
                    c15826.m35911(i2, i2 == c15826.f45817 ? (int) (c15826.f45814 - (((long) i2) * X931RNG.BLOCK64_RESEED_MAX)) : 32768);
                    if (i == c15826.f45816) {
                        c15826.f45816 = i2 + 1;
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                synchronized (c15826) {
                    if (c15826.f45822 != null) {
                        C23461.m52177((Closeable) c15826.f45822);
                        c15826.f45822 = null;
                    }
                    c15826.m35915();
                    throw th;
                }
            }
        }
        synchronized (c15826) {
            if (c15826.f45822 != null) {
                C23461.m52177((Closeable) c15826.f45822);
                c15826.f45822 = null;
            }
        }
        c15826.m35915();
    }

    /* JADX INFO: renamed from: ֫ */
    private byte[] m35911(int i, int i2) {
        synchronized (this.f45820) {
            if (this.f45815) {
                throw new IOException("Closed");
            }
            this.f45826++;
        }
        try {
            try {
                byte[] bArr = (byte[]) this.f45821.mo26990(Integer.valueOf(i), new CallableC12475(this, i, i2));
                m35915();
                return bArr;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException("Failed to load page " + i, e);
            }
        } catch (Throwable th) {
            m35915();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private void m35915() {
        boolean z;
        synchronized (this.f45820) {
            z = true;
            this.f45826--;
            if (!this.f45815 || this.f45826 != 0) {
                z = false;
            }
        }
        if (z) {
            m35914();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m35912(C15826 c15826, int i, int i2) {
        int iM28704;
        byte[] bArr = null;
        if (c15826.f45827 != null && (iM28704 = c15826.f45824.m28704(i)) != -1) {
            try {
                synchronized (c15826.f45827) {
                    try {
                        try {
                            c15826.f45827.seek((((long) iM28704) * 32776) + 12);
                            int i3 = c15826.f45827.readInt();
                            int iMo23137 = c15826.f45827.mo23137();
                            int iMo23138 = c15826.f45827.mo23137();
                            if (i3 == i) {
                                if (iMo23137 == i2) {
                                    byte[] bArr2 = new byte[iMo23137];
                                    C24618 c24618 = c15826.f45827;
                                    c24618.getClass();
                                    c24618.m54256(bArr2, 0, iMo23137);
                                    CRC32 crc32 = c15826.f45823;
                                    crc32.reset();
                                    crc32.update(bArr2);
                                    if (iMo23138 == ((int) (crc32.getValue() & 65535))) {
                                        bArr = bArr2;
                                    }
                                }
                            }
                        } catch (Exception unused) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception unused2) {
                c15826.m35913();
            }
        }
        if (bArr != null && bArr.length == i2) {
            return bArr;
        }
        c15826.f45816 = i;
        byte[] bArrM35917 = c15826.m35917(i, i2);
        c15826.m35920(i, bArrM35917);
        return bArrM35917;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX INFO: renamed from: ֫ */
    public final void m35920(int i, byte[] bArr) {
        long length;
        C24618 c24618 = this.f45827;
        if (c24618 == null) {
            return;
        }
        try {
            synchronized (c24618) {
                int iM28704 = this.f45824.m28704(i);
                if (iM28704 >= 0) {
                    length = (((long) iM28704) * 32776) + 12;
                    if (length < this.f45827.length()) {
                        this.f45827.seek(length);
                        if (this.f45827.readInt() != i) {
                            length = -1;
                        }
                    } else {
                        length = -1;
                    }
                } else {
                    length = -1;
                }
                if (length == -1) {
                    length = this.f45827.length();
                    int i2 = (int) ((length - 12) % 32776);
                    if (i2 != 0) {
                        length -= (long) i2;
                        this.f45827.setLength(length);
                    }
                }
                int i3 = (int) ((length - 12) / 32776);
                this.f45827.seek(length);
                this.f45827.writeInt(i);
                this.f45827.m54257(bArr.length);
                C24618 c24619 = this.f45827;
                CRC32 crc32 = this.f45823;
                crc32.reset();
                crc32.update(bArr);
                c24619.m54257((int) (crc32.getValue() & 65535));
                C24618 c246110 = this.f45827;
                c246110.getClass();
                c246110.write(bArr, 0, bArr.length);
                if (bArr.length < 32768) {
                    C24618 c246111 = this.f45827;
                    int length2 = 32768 - bArr.length;
                    c246111.getClass();
                    c246111.write(new byte[length2], 0, length2);
                }
                this.f45824.mo25657(i, i3);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final MediaDataSource m35919() {
        return new C8451(this);
    }

    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC4502 m35923() {
        return new C13816(this);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final boolean m35925() {
        synchronized (this.f45820) {
            if (this.f45815) {
                return false;
            }
            this.f45820.incrementAndGet();
            return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f45815 && this.f45820.decrementAndGet() <= 0) {
            C24618 c24618 = this.f45827;
            if (c24618 != null) {
                c24618.flush();
            }
            C4081.f8987.submit(new RunnableC22901(3, this));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m35910(C15826 c15826) {
        SystemClock.sleep(200L);
        synchronized (c15826.f45820) {
            if (c15826.f45820.get() > 0) {
                return;
            }
            if (c15826.f45815) {
                return;
            }
            boolean z = true;
            c15826.f45815 = true;
            if (c15826.f45826 != 0) {
                z = false;
            }
            C23461.m52177((Closeable) c15826.f45822);
            Thread thread = c15826.f45825;
            if (thread != null && thread.isAlive()) {
                c15826.f45825.interrupt();
            }
            if (z) {
                c15826.m35914();
            }
        }
    }

    /* JADX INFO: renamed from: ۘ */
    private void m35914() {
        C23461.m52177((Closeable) this.f45822);
        this.f45822 = null;
        C23461.m52177(this.f45827);
        this.f45821.mo26992();
        this.f45821.mo26991();
        C12472 c12472 = this.f45824;
        if (c12472 != null) {
            c12472.clear();
            this.f45824.m28705();
        }
    }
}
