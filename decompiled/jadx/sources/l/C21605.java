package l;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩸۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C21605 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final int f69369;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1143 f69370;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC10316 f69371;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f69372;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f69373;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final UUID f69374;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f69375;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f69376;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f69378;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public long f69379;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5377 f69380;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69381;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f69382;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AtomicLong f69383 = new AtomicLong(1);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public int f69368 = 1;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final FutureC3575 f69377 = new FutureC3575();

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized void m48811() {
        if (this.f69376) {
            throw new IllegalStateException("Page store is closed");
        }
        this.f69368++;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48785(InterfaceC20758 interfaceC20758, C1143 c1143) {
        return m48793(new C13137(interfaceC20758, false), c1143);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48786(InterfaceC20758 interfaceC20758, C1143 c1143, UUID uuid) {
        return m48784(new C13137(interfaceC20758, true), c1143, 2048, 16, uuid, 1L);
    }

    public C21605(InterfaceC10316 interfaceC10316, C1143 c1143, int i, int i2, UUID uuid, long j) {
        this.f69371 = new C15959(interfaceC10316);
        this.f69370 = c1143;
        this.f69369 = i;
        this.f69373 = i2;
        this.f69374 = uuid;
        this.f69375 = j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48783(InterfaceC10316 interfaceC10316, C1143 c1143) {
        return m48784(interfaceC10316, c1143, 2048, 16, UUID.randomUUID(), 1L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48787(C21605 c21605, InterfaceC20758 interfaceC20758) throws IOException {
        if (c21605.f69375 == C13132.FOREVER_NS) {
            throw new IOException("Recovery generation exhausted");
        }
        return m48784(new C13137(interfaceC20758, true), c21605.f69370, c21605.f69369, c21605.f69373, c21605.f69374, c21605.f69375 + 1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21605 m48784(InterfaceC10316 interfaceC10316, C1143 c1143, int i, int i2, UUID uuid, long j) throws Exception {
        try {
            m48788(i, i2);
            C21605 c21605 = new C21605(interfaceC10316, c1143, i, i2, uuid, j);
            UUID uuid2 = c21605.f69374;
            C10130 c10130 = new C10130(64);
            c10130.writeInt(843338829);
            c10130.writeInt(1);
            c10130.m25431(uuid2.getMostSignificantBits());
            c10130.m25431(uuid2.getLeastSignificantBits());
            c10130.m25431(c21605.f69375);
            c10130.writeInt(i);
            c10130.writeInt(i2);
            c10130.writeInt(C1829.m6061(0, c10130.size(), c10130.m25438()));
            while (c10130.size() < 64) {
                c10130.writeByte(0);
            }
            interfaceC10316.mo14383(0L, c10130.size(), c10130.m25438());
            interfaceC10316.mo14386();
            interfaceC10316.mo14385();
            c21605.f69379 = 64L;
            return c21605;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC10316.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C21605 m48793(InterfaceC10316 interfaceC10316, C1143 c1143) throws Exception {
        try {
            byte[] bArr = new byte[64];
            interfaceC10316.mo14384(0L, bArr, 0, 64);
            C12951 c12951 = new C12951(bArr);
            if (c12951.readInt() != 843338829 || c12951.readInt() != 1) {
                throw new IOException("Unsupported recovery file");
            }
            UUID uuid = new UUID(c12951.readLong(), c12951.readLong());
            long j = c12951.readLong();
            int i = c12951.readInt();
            int i2 = c12951.readInt();
            m48788(i, i2);
            if (j <= 0 || c12951.readInt() != C1829.m6061(0, 40, bArr)) {
                throw new IOException("Invalid recovery file header");
            }
            while (c12951.available() != 0) {
                if (c12951.readByte() != 0) {
                    throw new IOException("Unsupported recovery file header");
                }
            }
            C21605 c21605 = new C21605(interfaceC10316, c1143, i, i2, uuid, j);
            c21605.f69379 = interfaceC10316.length();
            c21605.f69372 = true;
            return c21605;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC10316.close();
                throw e;
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48788(int i, int i2) throws IOException {
        if (i < 8 || i > 65536 || (i & 1) != 0 || i2 < 4 || i2 > 256 || (i2 & 1) != 0) {
            throw new IOException("Invalid recovery tree configuration");
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long m48810() {
        long andIncrement = this.f69383.getAndIncrement();
        if (andIncrement > 0) {
            return andIncrement;
        }
        throw new IllegalStateException("Page identity exhausted");
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m48807() {
        return this.f69383.get();
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m48805() {
        return this.f69372;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m48808() {
        long j;
        synchronized (this.f69370.f4153) {
            j = this.f69379;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48800(long j, long j2) {
        synchronized (this.f69370.f4153) {
            if (!this.f69372 || j < 64 || j > this.f69379 || j2 <= 0) {
                throw new IOException("Invalid recovery acceptance");
            }
            ((C15959) this.f69371).truncate(j);
            this.f69379 = j;
            try {
                ((C15959) this.f69371).mo14386();
                this.f69383.set(j2);
                this.f69372 = false;
                this.f69382 = false;
            } catch (IOException e) {
                this.f69382 = true;
                throw e;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0073 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0074, code lost:
    
        r1 = th;
     */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C15253 m48799() {
        C5377 c5377M3921;
        synchronized (this.f69370.f4153) {
            m48795();
            int i = this.f69381;
            if (i != 0) {
                C15253 c15253 = new C15253(this);
                this.f69381 = i + 1;
                return c15253;
            }
            int iMin = (int) Math.min(65536L, this.f69370.m3930() / 32);
            C5377 c5377 = null;
            if (iMin >= 8192) {
                try {
                    c5377M3921 = this.f69370.m3921((((long) iMin) + 23) & (-8));
                } catch (UncheckedIOException | C3966 unused) {
                    c5377M3921 = null;
                }
            } else {
                c5377M3921 = null;
            }
            try {
                C15253 c15254 = new C15253(this);
                byte[] bArr = c5377M3921 == null ? null : new byte[iMin];
                synchronized (this.f69370.f4153) {
                    m48795();
                    if (this.f69381 == 0) {
                        ((C15959) this.f69371).m37736(this.f69379, bArr);
                        this.f69380 = c5377M3921;
                    } else {
                        c5377 = c5377M3921;
                    }
                    try {
                        this.f69381++;
                        if (c5377 != null) {
                            c5377.close();
                        }
                        return c15254;
                    } catch (Throwable th) {
                        th = th;
                        c5377M3921 = c5377;
                        while (true) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                if (c5377M3921 != null) {
                    c5377M3921.close();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m48803() {
        synchronized (this.f69370.f4153) {
            m48795();
            try {
                ((C15959) this.f69371).mo14386();
            } catch (IOException e) {
                this.f69382 = true;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8199 m48796(int i, int i2, boolean z, Supplier supplier) {
        long jM27307 = C11002.m27307(this.f69369, i2, z);
        C1143 c1143 = this.f69370;
        C5377 c5377M3921 = c1143.m3921(jM27307);
        try {
            C11002 c11002 = (C11002) supplier.get();
            C8199 c8199 = new C8199(this, m48810(), -1L, this.f69369, i, i2, z);
            if (c11002.f33098 != i || c11002.f33100 != i2 || c11002.m27319() != z) {
                throw new IllegalStateException("Invalid text page statistics");
            }
            c1143.m3924(c8199, c11002, c5377M3921);
            c5377M3921.close();
            return c8199;
        } catch (Throwable th) {
            try {
                c5377M3921.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8199 m48797(C11002 c11002) {
        boolean z;
        if (c11002.m27315() != this.f69369) {
            throw new IllegalArgumentException("Incompatible copied page capacity");
        }
        if (c11002.m27319()) {
            z = true;
        } else {
            for (int i = 0; i < c11002.f33098; i++) {
                if (c11002.m27310(i) > 255) {
                    z = false;
                }
            }
            z = true;
        }
        C8199 c8199 = new C8199(this, m48810(), -1L, this.f69369, c11002.f33098, c11002.f33100, z);
        m48801(c8199, c11002);
        return c8199;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m48801(C8199 c8199, C11002 c11002) {
        long j;
        IOException iOException;
        long j2;
        synchronized (this.f69370.f4153) {
            if (c8199.f25208 >= 0) {
                return;
            }
            m48795();
            int i = c8199.f25207 ? 1 : 2;
            int i2 = c11002.f33098 * i;
            int i3 = i2 + 16;
            int i4 = i2 + 48;
            int i5 = i2 + 64;
            long j3 = this.f69379;
            C1143 c1143 = this.f69370;
            C10130 c10130 = c1143.f4155;
            byte[] bArr = c1143.f4154;
            CRC32 crc32 = c1143.f4156;
            try {
                if (i5 <= bArr.length) {
                    try {
                        c10130.m25440();
                        c10130.m25420(32);
                        c10130.seek(-1L);
                        m48790(c10130, c8199);
                        try {
                            c11002.m27314(c8199.f25207, 0, bArr, c11002.f33098, c10130.size());
                            crc32.reset();
                            crc32.update(bArr, 32, i3);
                            int value = (int) crc32.getValue();
                            c10130.m25420(i4);
                            c10130.seek(-1L);
                            C1829.m6067(c10130, j3, i3);
                            c10130.seek(0L);
                            j2 = j3;
                            try {
                                C1829.m6066(c10130, 1, c8199.f25205, i3, value);
                                ((C15959) this.f69371).mo14383(j2, i5, bArr);
                                j = j2;
                            } catch (IOException e) {
                                e = e;
                                iOException = e;
                                j = j2;
                                try {
                                    ((C15959) this.f69371).truncate(j);
                                    this.f69379 = j;
                                    throw iOException;
                                } catch (IOException e2) {
                                    this.f69382 = true;
                                    iOException.addSuppressed(e2);
                                    throw iOException;
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            j2 = j3;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        j = j3;
                        iOException = e;
                        ((C15959) this.f69371).truncate(j);
                        this.f69379 = j;
                        throw iOException;
                    }
                } else {
                    j = j3;
                    try {
                        m48789(c8199, c11002, j, i3, i);
                    } catch (IOException e5) {
                        e = e5;
                        iOException = e;
                        ((C15959) this.f69371).truncate(j);
                        this.f69379 = j;
                        throw iOException;
                    }
                }
                this.f69379 = ((long) i5) + j;
                c8199.f25208 = j;
            } catch (IOException e6) {
                e = e6;
                j = j3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m48789(C8199 c8199, C11002 c11002, long j, int i, int i2) {
        InterfaceC10316 interfaceC10316;
        C21605 c21605 = this;
        C1143 c1143 = c21605.f69370;
        C10130 c10130 = c1143.f4155;
        byte[] bArr = c1143.f4154;
        CRC32 crc32 = c1143.f4156;
        c10130.m25440();
        m48790(c10130, c8199);
        crc32.reset();
        crc32.update(bArr, 0, c10130.size());
        int length = bArr.length / i2;
        int i3 = 0;
        while (true) {
            int i4 = c11002.f33098;
            if (i3 >= i4) {
                break;
            }
            int iMin = Math.min(i4 - i3, length);
            int i5 = i3 + iMin;
            c11002.m27314(c8199.f25207, i3, bArr, i5, 0);
            crc32.update(bArr, 0, iMin * i2);
            i3 = i5;
        }
        int value = (int) crc32.getValue();
        c10130.m25440();
        byte[] bArr2 = bArr;
        C1829.m6066(c10130, 1, c8199.f25205, i, value);
        m48790(c10130, c8199);
        long j2 = j;
        int size = c10130.size();
        int i6 = 0;
        while (true) {
            int i7 = c11002.f33098;
            interfaceC10316 = c21605.f69371;
            if (i6 >= i7) {
                break;
            }
            int iMin2 = Math.min(i7 - i6, (bArr2.length - size) / i2);
            int i8 = i6 + iMin2;
            byte[] bArr3 = bArr2;
            c11002.m27314(c8199.f25207, i6, bArr2, i8, size);
            int i9 = (iMin2 * i2) + size;
            if (i9 == bArr3.length) {
                ((C15959) interfaceC10316).mo14383(j2, i9, bArr3);
                j2 += (long) i9;
                size = 0;
            } else {
                size = i9;
            }
            bArr2 = bArr3;
            i6 = i8;
            c21605 = this;
        }
        byte[] bArr4 = bArr2;
        if (bArr4.length - size < 16) {
            ((C15959) interfaceC10316).mo14383(j2, size, bArr4);
            j2 += (long) size;
            size = 0;
        }
        c10130.m25420(size);
        c10130.seek(-1L);
        C1829.m6067(c10130, j, i);
        ((C15959) interfaceC10316).mo14383(j2, c10130.size(), bArr4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48790(C10130 c10130, C8199 c8199) {
        c10130.writeInt(c8199.f25203);
        c10130.writeInt(c8199.f25206);
        c10130.writeInt(c8199.f25204);
        c10130.writeInt(c8199.f25207 ? 1 : 2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11002 m48798(C8199 c8199, C0437 c0437) {
        C11002 c11002M48782;
        if (c0437 == null) {
            synchronized (this.f69370.f4153) {
                C1143 c1143 = this.f69370;
                c11002M48782 = m48782(c8199, c1143.f4154, c1143.f4146, c1143.f4156);
            }
            return c11002M48782;
        }
        return m48782(c8199, c0437.f1926, c0437.f1928, c0437.f1927);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C11002 m48782(C8199 c8199, byte[] bArr, C12951 c12951, CRC32 crc32) throws IOException {
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        long j3;
        int i5;
        if (c8199.f25202 == this) {
            int i6 = c8199.f25203;
            int i7 = this.f69369;
            if (i6 == i7 && (i = c8199.f25206) >= 0 && i <= i7 && (i2 = c8199.f25204) >= 0 && i2 <= i) {
                int i8 = c8199.f25207 ? 1 : 2;
                int i9 = i * i8;
                int i10 = i9 + 16;
                int i11 = i9 + 64;
                synchronized (this.f69370.f4153) {
                    j = c8199.f25208;
                    if (j >= 64) {
                        j2 = i11;
                        if (j <= this.f69379 - j2) {
                        }
                    }
                    throw new IOException("Truncated or unwritten text page");
                }
                int iMin = Math.min(i11, bArr.length);
                ((C15959) this.f69371).mo14384(j, bArr, 0, iMin);
                c12951.seek(0L);
                C7493 c7493M6065 = C1829.m6065(c12951);
                if (c7493M6065.f23083 != 1 || c7493M6065.f23080 != c8199.f25205 || c7493M6065.f23082 != i10) {
                    throw new IOException("Invalid text page reference");
                }
                if (c12951.readInt() != c8199.f25203 || c12951.readInt() != c8199.f25206 || c12951.readInt() != c8199.f25204 || c12951.readInt() != i8) {
                    throw new IOException("Invalid text page metadata");
                }
                crc32.reset();
                int i12 = iMin;
                crc32.update(bArr, 32, Math.min(i10, i12 - 32));
                C11002 c11002 = new C11002(c8199.f25203, c8199.f25206, c8199.f25204, c8199.f25207);
                int i13 = 48;
                long j4 = ((long) i12) + j;
                int i14 = i9;
                int iM27311 = 0;
                int i15 = 0;
                while (i14 != 0) {
                    if (i13 == i12) {
                        int iMin2 = Math.min(i14 + 16, bArr.length);
                        i3 = i14;
                        ((C15959) this.f69371).mo14384(j4, bArr, 0, iMin2);
                        crc32.update(bArr, 0, Math.min(i3, iMin2));
                        i4 = iMin2;
                        j3 = j4 + ((long) iMin2);
                        i5 = 0;
                    } else {
                        i3 = i14;
                        i4 = i12;
                        j3 = j4;
                        i5 = i13;
                    }
                    int iMin3 = Math.min(i3, i4 - i5);
                    iM27311 = c11002.m27311(bArr, i5, iMin3, i15, iM27311);
                    i15 = (iMin3 / i8) + i15;
                    i13 = i5 + iMin3;
                    i14 = i3 - iMin3;
                    c7493M6065 = c7493M6065;
                    i12 = i4;
                    j4 = j3;
                    j = j;
                }
                long j5 = j;
                C7493 c7493 = c7493M6065;
                if (iM27311 != c8199.f25204 || ((int) crc32.getValue()) != c7493.f23081) {
                    throw new IOException("Invalid text page checksum");
                }
                if (i12 - i13 < 16) {
                    ((C15959) this.f69371).mo14384((j5 + j2) - 16, bArr, 0, 16);
                    i13 = 0;
                }
                c12951.seek(i13);
                if (C1829.m6064(c12951, j5 + j2) == j5) {
                    return c11002;
                }
                throw new IOException("Invalid recovery footer reference");
            }
        }
        throw new IOException("Invalid text page shape");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C7493 m48806(long j) throws IOException {
        byte[] bArr = new byte[32];
        if (j < 64 || j > this.f69379 - ((long) 32)) {
            throw new IOException("Invalid recovery record offset");
        }
        ((C15959) this.f69371).mo14384(j, bArr, 0, 32);
        C7493 c7493M6065 = C1829.m6065(new C12951(bArr));
        if (((long) c7493M6065.f23082) + 48 <= this.f69379 - j) {
            return c7493M6065;
        }
        throw new IOException("Truncated recovery record");
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long m48809(long j, byte[] bArr, int i, int i2) {
        long j2;
        synchronized (this.f69370.f4153) {
            m48795();
            if (i2 < 0 || i2 > bArr.length || i2 > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            j2 = this.f69379;
            try {
                int iM6061 = C1829.m6061(0, i2, bArr);
                C1143 c1143 = this.f69370;
                C10130 c10130 = c1143.f4155;
                byte[] bArr2 = c1143.f4154;
                System.arraycopy(bArr, 0, bArr2, 32, i2);
                c10130.m25440();
                c10130.m25420(i2 + 32);
                C1829.m6066(c10130, i, j, i2, iM6061);
                c10130.seek(-1L);
                C1829.m6067(c10130, j2, i2);
                ((C15959) this.f69371).mo14383(j2, c10130.size(), bArr2);
                this.f69379 = ((long) c10130.size()) + j2;
            } catch (IOException e) {
                try {
                    ((C15959) this.f69371).truncate(j2);
                    this.f69379 = j2;
                    throw e;
                } catch (IOException e2) {
                    this.f69382 = true;
                    e.addSuppressed(e2);
                    throw e;
                }
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m48802(long j, C7493 c7493) {
        byte[] bArr;
        synchronized (this.f69370.f4153) {
            int i = c7493.f23082;
            if (i > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            bArr = new byte[i];
            long j2 = j + 32;
            ((C15959) this.f69371).mo14384(j2, bArr, 0, i);
            int i2 = C1829.f6267;
            if (i != c7493.f23082 || C1829.m6061(0, i, bArr) != c7493.f23081) {
                throw new IOException("Invalid recovery payload checksum");
            }
            byte[] bArr2 = new byte[16];
            long j3 = j2 + ((long) i);
            ((C15959) this.f69371).mo14384(j3, bArr2, 0, 16);
            if (C1829.m6063(j3 + ((long) 16), bArr2) != j) {
                throw new IOException("Invalid recovery footer reference");
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m48795() throws IOException {
        if (this.f69372) {
            throw new IOException("Recovery validation is required before append");
        }
        if (this.f69382) {
            throw new IOException("Recovery append requires reopening after I/O failure");
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final FutureC3575 m48804() {
        return this.f69377;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m48812() {
        synchronized (this) {
            int i = this.f69368 - 1;
            this.f69368 = i;
            if (i != 0) {
                return;
            }
            this.f69376 = true;
            try {
                this.f69370.m3925(this);
                ((C15959) this.f69371).close();
                this.f69377.m10912((Object) null);
            } catch (IOException | Error | RuntimeException e) {
                this.f69377.m10914(e);
                if (e instanceof IOException) {
                    throw new UncheckedIOException((IOException) e);
                }
                if (!(e instanceof RuntimeException)) {
                    throw ((Error) e);
                }
                throw ((RuntimeException) e);
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (this.f69378) {
                return;
            }
            this.f69378 = true;
            m48812();
        }
    }
}
