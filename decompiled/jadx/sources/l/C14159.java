package l;

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
public final class C14159 implements Closeable {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final long f42726;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public volatile boolean f42727;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f42728;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f42729;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC23332 f42730;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f42731;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f42732;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23969 f42733;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public volatile InputStream f42734;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final CRC32 f42735;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10630 f42736;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Thread f42737;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f42738;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C23411 f42739;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String f42740;

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:9:0x0011, B:11:0x0017, B:17:0x0031, B:20:0x0049, B:23:0x0058, B:25:0x005c, B:27:0x0066, B:29:0x006a, B:30:0x0070, B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a, B:39:0x008c, B:40:0x0091, B:41:0x0092, B:42:0x0099, B:22:0x0051, B:43:0x009a, B:44:0x00a1), top: B:48:0x0002, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0076 A[Catch: IOException -> 0x008b, all -> 0x00a2, TRY_LEAVE, TryCatch #2 {IOException -> 0x008b, blocks: (B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a), top: B:50:0x0072, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0083 A[Catch: IOException -> 0x008b, all -> 0x00a2, TRY_ENTER, TryCatch #2 {IOException -> 0x008b, blocks: (B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a), top: B:50:0x0072, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0092 A[Catch: all -> 0x00a2, TryCatch #0 {, blocks: (B:4:0x0002, B:6:0x0006, B:9:0x0011, B:11:0x0017, B:17:0x0031, B:20:0x0049, B:23:0x0058, B:25:0x005c, B:27:0x0066, B:29:0x006a, B:30:0x0070, B:31:0x0072, B:33:0x0076, B:36:0x0083, B:37:0x008a, B:39:0x008c, B:40:0x0091, B:41:0x0092, B:42:0x0099, B:22:0x0051, B:43:0x009a, B:44:0x00a1), top: B:48:0x0002, inners: #1, #2 }] */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private synchronized byte[] m33785(int i, int i2) {
        InputStream inputStreamMo35309;
        if (this.f42727) {
            throw new IOException("Closed");
        }
        long j = ((long) i) * X931RNG.BLOCK64_RESEED_MAX;
        if (this.f42734 == null) {
            if (!this.f42727) {
                throw new IOException("Closed");
            }
            inputStreamMo35309 = this.f42730.mo35309(j);
            if (!(inputStreamMo35309 instanceof BufferedInputStream)) {
                inputStreamMo35309 = new BufferedInputStream(inputStreamMo35309);
            }
            this.f42734 = inputStreamMo35309;
            if (!this.f42727) {
                throw new IOException("Closed");
            }
            byte[] bArr = C22194.f71991;
            byte[] bArr2 = new byte[i2];
            C22194.m49857(inputStreamMo35309, bArr2, i2);
            this.f42731 = j + ((long) i2);
            return bArr2;
        }
        try {
            long j2 = this.f42731;
            if (j == j2) {
                InputStream inputStream = this.f42734;
                byte[] bArr3 = C22194.f71991;
                byte[] bArr4 = new byte[i2];
                C22194.m49857(inputStream, bArr4, i2);
                this.f42731 = ((long) i2) + j;
                return bArr4;
            }
            if (j > j2 && j - j2 < 327680) {
                C22194.m49856(j - this.f42731, this.f42734);
                this.f42731 = j;
                byte[] bArr5 = new byte[i2];
                C22194.m49857(this.f42734, bArr5, i2);
                this.f42731 = ((long) i2) + j;
                return bArr5;
            }
            C22194.m49850((Closeable) this.f42734);
            this.f42734 = null;
            if (!this.f42727) {
                throw new IOException("Closed");
            }
            inputStreamMo35309 = this.f42730.mo35309(j);
            if (!(inputStreamMo35309 instanceof BufferedInputStream) && !(inputStreamMo35309 instanceof C4362)) {
                inputStreamMo35309 = new BufferedInputStream(inputStreamMo35309);
            }
            this.f42734 = inputStreamMo35309;
            try {
                if (!this.f42727) {
                    throw new IOException("Closed");
                }
                byte[] bArr6 = C22194.f71991;
                byte[] bArr7 = new byte[i2];
                C22194.m49857(inputStreamMo35309, bArr7, i2);
                this.f42731 = j + ((long) i2);
                return bArr7;
            } catch (IOException e) {
                C22194.m49850((Closeable) inputStreamMo35309);
                this.f42734 = null;
                throw e;
            }
        } catch (IOException unused) {
            C22194.m49850((Closeable) this.f42734);
            this.f42734 = null;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final synchronized void m33789() {
        synchronized (this.f42732) {
            if (!this.f42727 && this.f42737 == null && this.f42739 != null) {
                this.f42738++;
                Thread thread = new Thread(new RunnableC19009(2, this));
                this.f42737 = thread;
                thread.setDaemon(true);
                this.f42737.setName("NetworkFileCacheThread-" + this.f42740.hashCode());
                this.f42737.start();
                return;
            }
            if (this.f42737 == null || this.f42727 || this.f42739 == null) {
                throw new IllegalStateException();
            }
        }
    }

    public C14159(InterfaceC23332 interfaceC23332, String str, long j) {
        C2803 c2803M8652 = C2803.m8652();
        c2803M8652.m8656(320L);
        this.f42733 = c2803M8652.m8654();
        this.f42728 = 0;
        this.f42732 = new AtomicInteger(1);
        this.f42735 = new CRC32();
        this.f42730 = interfaceC23332;
        this.f42740 = str;
        this.f42726 = j;
        long j2 = (j + 32767) / X931RNG.BLOCK64_RESEED_MAX;
        int i = (int) j2;
        if (j2 != i) {
            throw new ArithmeticException();
        }
        this.f42729 = i - 1;
        this.f42739 = null;
        this.f42736 = null;
    }

    public C14159(C14874 c14874, String str, long j, AbstractC15440 abstractC15440) {
        C2803 c2803M8652 = C2803.m8652();
        c2803M8652.m8656(320L);
        this.f42733 = c2803M8652.m8654();
        int i = 0;
        this.f42728 = 0;
        this.f42732 = new AtomicInteger(1);
        this.f42735 = new CRC32();
        this.f42730 = c14874;
        this.f42740 = str;
        this.f42726 = j;
        long j2 = (32767 + j) / X931RNG.BLOCK64_RESEED_MAX;
        int i2 = (int) j2;
        if (j2 != i2) {
            throw new ArithmeticException();
        }
        this.f42729 = i2 - 1;
        abstractC15440.mo35195();
        C23411 c23411M36513 = abstractC15440.m36513("rw");
        this.f42739 = c23411M36513;
        this.f42736 = new C10630();
        try {
            if (c23411M36513.length() < 12) {
                m33781();
                return;
            }
            if (c23411M36513.readInt() != 358818181 || c23411M36513.readLong() != j) {
                throw new IOException();
            }
            c23411M36513.seek(12L);
            while (this.f42739.available() > 0) {
                if (this.f42739.available() < 32776) {
                    C23411 c23411 = this.f42739;
                    c23411.setLength(c23411.getFilePointer());
                    return;
                }
                int i3 = this.f42739.readInt();
                int iMo21172 = this.f42739.mo21172();
                if (i3 > this.f42729 || iMo21172 > 32768) {
                    throw new IOException();
                }
                int i4 = i + 1;
                this.f42736.mo23658(i3, i);
                this.f42739.seek((((long) i4) * 32776) + 12);
                i = i4;
            }
        } catch (Exception unused) {
            m33781();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m33781() {
        C23411 c23411 = this.f42739;
        c23411.setLength(0L);
        c23411.writeInt(358818181);
        long j = this.f42726;
        c23411.write((int) (j & 255));
        c23411.write((int) ((j >>> 8) & 255));
        c23411.write((int) ((j >>> 16) & 255));
        c23411.write((int) ((j >>> 24) & 255));
        c23411.write((int) ((j >>> 32) & 255));
        c23411.write((int) ((j >>> 40) & 255));
        c23411.write((int) ((j >>> 48) & 255));
        c23411.write((int) ((j >>> 56) & 255));
        this.f42736.clear();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m33790(long j, byte[] bArr, int i, int i2) {
        if (j < 0 || bArr == null || i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new IllegalArgumentException("Invalid arguments");
        }
        long j2 = this.f42726;
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
            int i5 = i4 == this.f42729 ? (int) (j2 - j3) : 32768;
            int i6 = (int) (j - j3);
            int iMin2 = Math.min(i5 - i6, i3);
            System.arraycopy(m33779(i4, i5), i6, bArr, i, iMin2);
            i3 -= iMin2;
            i += iMin2;
            j += (long) iMin2;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m33792() {
        return this.f42726;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m33784(C14159 c14159) {
        while (!c14159.f42727 && c14159.f42736.size() < c14159.f42729 + 1) {
            try {
                int i = c14159.f42728;
                int i2 = i;
                while (true) {
                    if (i2 > c14159.f42729) {
                        i2 = -1;
                        break;
                    } else if (!c14159.f42736.mo23659(i2)) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == -1) {
                    for (int i3 = 0; i3 < i; i3++) {
                        if (!c14159.f42736.mo23659(i3)) {
                            i2 = i3;
                            break;
                        }
                    }
                }
                if (i2 == -1) {
                    break;
                }
                try {
                    c14159.m33779(i2, i2 == c14159.f42729 ? (int) (c14159.f42726 - (((long) i2) * X931RNG.BLOCK64_RESEED_MAX)) : 32768);
                    if (i == c14159.f42728) {
                        c14159.f42728 = i2 + 1;
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                synchronized (c14159) {
                    if (c14159.f42734 != null) {
                        C22194.m49850((Closeable) c14159.f42734);
                        c14159.f42734 = null;
                    }
                    c14159.m33783();
                    throw th;
                }
            }
        }
        synchronized (c14159) {
            if (c14159.f42734 != null) {
                C22194.m49850((Closeable) c14159.f42734);
                c14159.f42734 = null;
            }
        }
        c14159.m33783();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private byte[] m33779(int i, int i2) {
        synchronized (this.f42732) {
            if (this.f42727) {
                throw new IOException("Closed");
            }
            this.f42738++;
        }
        try {
            try {
                byte[] bArr = (byte[]) this.f42733.mo24975(Integer.valueOf(i), new CallableC10633(this, i, i2));
                m33783();
                return bArr;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof IOException) {
                    throw ((IOException) cause);
                }
                throw new IOException("Failed to load page " + i, e);
            }
        } catch (Throwable th) {
            m33783();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private void m33783() {
        boolean z;
        synchronized (this.f42732) {
            z = true;
            this.f42738--;
            if (!this.f42727 || this.f42738 != 0) {
                z = false;
            }
        }
        if (z) {
            m33782();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m33780(C14159 c14159, int i, int i2) {
        int iM26664;
        byte[] bArr = null;
        if (c14159.f42739 != null && (iM26664 = c14159.f42736.m26664(i)) != -1) {
            try {
                synchronized (c14159.f42739) {
                    try {
                        try {
                            c14159.f42739.seek((((long) iM26664) * 32776) + 12);
                            int i3 = c14159.f42739.readInt();
                            int iMo21172 = c14159.f42739.mo21172();
                            int iMo21173 = c14159.f42739.mo21172();
                            if (i3 == i) {
                                if (iMo21172 == i2) {
                                    byte[] bArr2 = new byte[iMo21172];
                                    C23411 c23411 = c14159.f42739;
                                    c23411.getClass();
                                    c23411.m51858(bArr2, 0, iMo21172);
                                    CRC32 crc32 = c14159.f42735;
                                    crc32.reset();
                                    crc32.update(bArr2);
                                    if (iMo21173 == ((int) (crc32.getValue() & 65535))) {
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
                c14159.m33781();
            }
        }
        if (bArr != null && bArr.length == i2) {
            return bArr;
        }
        c14159.f42728 = i;
        byte[] bArrM33785 = c14159.m33785(i, i2);
        c14159.m33788(i, bArrM33785);
        return bArrM33785;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m33788(int i, byte[] bArr) {
        long length;
        C23411 c23411 = this.f42739;
        if (c23411 == null) {
            return;
        }
        try {
            synchronized (c23411) {
                int iM26664 = this.f42736.m26664(i);
                if (iM26664 >= 0) {
                    length = (((long) iM26664) * 32776) + 12;
                    if (length < this.f42739.length()) {
                        this.f42739.seek(length);
                        if (this.f42739.readInt() != i) {
                            length = -1;
                        }
                    } else {
                        length = -1;
                    }
                } else {
                    length = -1;
                }
                if (length == -1) {
                    length = this.f42739.length();
                    int i2 = (int) ((length - 12) % 32776);
                    if (i2 != 0) {
                        length -= (long) i2;
                        this.f42739.setLength(length);
                    }
                }
                int i3 = (int) ((length - 12) / 32776);
                this.f42739.seek(length);
                this.f42739.writeInt(i);
                this.f42739.m51859(bArr.length);
                C23411 c23412 = this.f42739;
                CRC32 crc32 = this.f42735;
                crc32.reset();
                crc32.update(bArr);
                c23412.m51859((int) (crc32.getValue() & 65535));
                C23411 c23413 = this.f42739;
                c23413.getClass();
                c23413.write(bArr, 0, bArr.length);
                if (bArr.length < 32768) {
                    C23411 c23414 = this.f42739;
                    int length2 = 32768 - bArr.length;
                    c23414.getClass();
                    c23414.write(new byte[length2], 0, length2);
                }
                this.f42736.mo23658(i, i3);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final MediaDataSource m33787() {
        return new C6399(this);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2245 m33791() {
        return new C12044(this);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m33793() {
        synchronized (this.f42732) {
            if (this.f42727) {
                return false;
            }
            this.f42732.incrementAndGet();
            return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f42727 && this.f42732.decrementAndGet() <= 0) {
            C23411 c23411 = this.f42739;
            if (c23411 != null) {
                c23411.flush();
            }
            C1802.f6208.submit(new RunnableC21604(3, this));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m33778(C14159 c14159) {
        SystemClock.sleep(200L);
        synchronized (c14159.f42732) {
            if (c14159.f42732.get() > 0) {
                return;
            }
            if (c14159.f42727) {
                return;
            }
            boolean z = true;
            c14159.f42727 = true;
            if (c14159.f42738 != 0) {
                z = false;
            }
            C22194.m49850((Closeable) c14159.f42734);
            Thread thread = c14159.f42737;
            if (thread != null && thread.isAlive()) {
                c14159.f42737.interrupt();
            }
            if (z) {
                c14159.m33782();
            }
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m33782() {
        C22194.m49850((Closeable) this.f42734);
        this.f42734 = null;
        C22194.m49850(this.f42739);
        this.f42733.mo24977();
        this.f42733.mo24976();
        C10630 c10630 = this.f42736;
        if (c10630 != null) {
            c10630.clear();
            this.f42736.m26665();
        }
    }
}
