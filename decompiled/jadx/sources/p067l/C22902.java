package p067l;

import java.io.IOException;
import java.p066io.UncheckedIOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Supplier;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩸۬ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C22902 implements AutoCloseable {

    /* JADX INFO: renamed from: ۗ */
    public final int f72072;

    /* JADX INFO: renamed from: ۙ */
    public final C3455 f72073;

    /* JADX INFO: renamed from: ۛ */
    public final InterfaceC12173 f72074;

    /* JADX INFO: renamed from: ۟ */
    public volatile boolean f72075;

    /* JADX INFO: renamed from: ۤ */
    public final int f72076;

    /* JADX INFO: renamed from: ۧ֫ */
    public final UUID f72077;

    /* JADX INFO: renamed from: ۨ */
    public final long f72078;

    /* JADX INFO: renamed from: ۫ */
    public boolean f72079;

    /* JADX INFO: renamed from: ܰ */
    public boolean f72081;

    /* JADX INFO: renamed from: ܽ֫ */
    public long f72082;

    /* JADX INFO: renamed from: ᩶ */
    public C7479 f72083;

    /* JADX INFO: renamed from: ᩸ */
    public int f72084;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f72085;

    /* JADX INFO: renamed from: ᩺ */
    public final AtomicLong f72086 = new AtomicLong(1);

    /* JADX INFO: renamed from: ֫֫ */
    public int f72071 = 1;

    /* JADX INFO: renamed from: ۬ */
    public final FutureC5767 f72080 = new FutureC5767();

    /* JADX INFO: renamed from: ᩺ۧ */
    public final synchronized void m51158() {
        if (this.f72079) {
            throw new IllegalStateException("Page store is closed");
        }
        this.f72071++;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22902 m51132(InterfaceC22097 interfaceC22097, C3455 c3455) {
        return m51140(new C14854(interfaceC22097, false), c3455);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22902 m51133(InterfaceC22097 interfaceC22097, C3455 c3455, UUID uuid) {
        return m51131(new C14854(interfaceC22097, true), c3455, 2048, 16, uuid, 1L);
    }

    public C22902(InterfaceC12173 interfaceC12173, C3455 c3455, int i, int i2, UUID uuid, long j) {
        this.f72074 = new C17536(interfaceC12173);
        this.f72073 = c3455;
        this.f72072 = i;
        this.f72076 = i2;
        this.f72077 = uuid;
        this.f72078 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22902 m51130(InterfaceC12173 interfaceC12173, C3455 c3455) {
        return m51131(interfaceC12173, c3455, 2048, 16, UUID.randomUUID(), 1L);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22902 m51134(C22902 c22902, InterfaceC22097 interfaceC22097) throws IOException {
        if (c22902.f72078 == C14849.FOREVER_NS) {
            throw new IOException("Recovery generation exhausted");
        }
        return m51131(new C14854(interfaceC22097, true), c22902.f72073, c22902.f72072, c22902.f72076, c22902.f72077, c22902.f72078 + 1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C22902 m51131(InterfaceC12173 interfaceC12173, C3455 c3455, int i, int i2, UUID uuid, long j) throws Exception {
        try {
            m51135(i, i2);
            C22902 c22902 = new C22902(interfaceC12173, c3455, i, i2, uuid, j);
            UUID uuid2 = c22902.f72077;
            C11996 c11996 = new C11996(64);
            c11996.writeInt(843338829);
            c11996.writeInt(1);
            c11996.m27451(uuid2.getMostSignificantBits());
            c11996.m27451(uuid2.getLeastSignificantBits());
            c11996.m27451(c22902.f72078);
            c11996.writeInt(i);
            c11996.writeInt(i2);
            c11996.writeInt(C4107.m8259(0, c11996.size(), c11996.m27458()));
            while (c11996.size() < 64) {
                c11996.writeByte(0);
            }
            interfaceC12173.mo16280(0L, c11996.size(), c11996.m27458());
            interfaceC12173.mo16283();
            interfaceC12173.mo16282();
            c22902.f72082 = 64L;
            return c22902;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC12173.close();
            } catch (IOException e2) {
                e.addSuppressed(e2);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static C22902 m51140(InterfaceC12173 interfaceC12173, C3455 c3455) throws Exception {
        try {
            byte[] bArr = new byte[64];
            interfaceC12173.mo16281(0L, bArr, 0, 64);
            C14677 c14677 = new C14677(bArr);
            if (c14677.readInt() != 843338829 || c14677.readInt() != 1) {
                throw new IOException("Unsupported recovery file");
            }
            UUID uuid = new UUID(c14677.readLong(), c14677.readLong());
            long j = c14677.readLong();
            int i = c14677.readInt();
            int i2 = c14677.readInt();
            m51135(i, i2);
            if (j <= 0 || c14677.readInt() != C4107.m8259(0, 40, bArr)) {
                throw new IOException("Invalid recovery file header");
            }
            while (c14677.available() != 0) {
                if (c14677.readByte() != 0) {
                    throw new IOException("Unsupported recovery file header");
                }
            }
            C22902 c22902 = new C22902(interfaceC12173, c3455, i, i2, uuid, j);
            c22902.f72082 = interfaceC12173.length();
            c22902.f72075 = true;
            return c22902;
        } catch (IOException | RuntimeException e) {
            try {
                interfaceC12173.close();
                throw e;
            } catch (IOException e2) {
                e.addSuppressed(e2);
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51135(int i, int i2) throws IOException {
        if (i < 8 || i > 65536 || (i & 1) != 0 || i2 < 4 || i2 > 256 || (i2 & 1) != 0) {
            throw new IOException("Invalid recovery tree configuration");
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final long m51157() {
        long andIncrement = this.f72086.getAndIncrement();
        if (andIncrement > 0) {
            return andIncrement;
        }
        throw new IllegalStateException("Page identity exhausted");
    }

    /* JADX INFO: renamed from: ܳ */
    public final long m51154() {
        return this.f72086.get();
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m51152() {
        return this.f72075;
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m51155() {
        long j;
        synchronized (this.f72073.f6922) {
            j = this.f72082;
        }
        return j;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51147(long j, long j2) {
        synchronized (this.f72073.f6922) {
            if (!this.f72075 || j < 64 || j > this.f72082 || j2 <= 0) {
                throw new IOException("Invalid recovery acceptance");
            }
            ((C17536) this.f72074).truncate(j);
            this.f72082 = j;
            try {
                ((C17536) this.f72074).mo16283();
                this.f72086.set(j2);
                this.f72075 = false;
                this.f72085 = false;
            } catch (IOException e) {
                this.f72085 = true;
                throw e;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0073 */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0074, code lost:
    
        r1 = th;
     */
    /* JADX INFO: renamed from: ֫ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C16865 m51146() {
        C7479 c7479M6162;
        synchronized (this.f72073.f6922) {
            m51142();
            int i = this.f72084;
            if (i != 0) {
                C16865 c16865 = new C16865(this);
                this.f72084 = i + 1;
                return c16865;
            }
            int iMin = (int) Math.min(65536L, this.f72073.m6171() / 32);
            C7479 c7479 = null;
            if (iMin >= 8192) {
                try {
                    c7479M6162 = this.f72073.m6162((((long) iMin) + 23) & (-8));
                } catch (UncheckedIOException | C6138 unused) {
                    c7479M6162 = null;
                }
            } else {
                c7479M6162 = null;
            }
            try {
                C16865 c16866 = new C16865(this);
                byte[] bArr = c7479M6162 == null ? null : new byte[iMin];
                synchronized (this.f72073.f6922) {
                    m51142();
                    if (this.f72084 == 0) {
                        ((C17536) this.f72074).m39911(this.f72082, bArr);
                        this.f72083 = c7479M6162;
                    } else {
                        c7479 = c7479M6162;
                    }
                    try {
                        this.f72084++;
                        if (c7479 != null) {
                            c7479.close();
                        }
                        return c16866;
                    } catch (Throwable th) {
                        th = th;
                        c7479M6162 = c7479;
                        while (true) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable th2) {
                if (c7479M6162 != null) {
                    c7479M6162.close();
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m51150() {
        synchronized (this.f72073.f6922) {
            m51142();
            try {
                ((C17536) this.f72074).mo16283();
            } catch (IOException e) {
                this.f72085 = true;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10161 m51143(int i, int i2, boolean z, Supplier supplier) {
        long jM29369 = C12825.m29369(this.f72072, i2, z);
        C3455 c3455 = this.f72073;
        C7479 c7479M6162 = c3455.m6162(jM29369);
        try {
            C12825 c12825 = (C12825) supplier.get();
            C10161 c10161 = new C10161(this, m51157(), -1L, this.f72072, i, i2, z);
            if (c12825.f36092 != i || c12825.f36094 != i2 || c12825.m29381() != z) {
                throw new IllegalStateException("Invalid text page statistics");
            }
            c3455.m6165(c10161, c12825, c7479M6162);
            c7479M6162.close();
            return c10161;
        } catch (Throwable th) {
            try {
                c7479M6162.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10161 m51144(C12825 c12825) {
        boolean z;
        if (c12825.m29377() != this.f72072) {
            throw new IllegalArgumentException("Incompatible copied page capacity");
        }
        if (c12825.m29381()) {
            z = true;
        } else {
            for (int i = 0; i < c12825.f36092; i++) {
                if (c12825.m29372(i) > 255) {
                    z = false;
                }
            }
            z = true;
        }
        C10161 c10161 = new C10161(this, m51157(), -1L, this.f72072, c12825.f36092, c12825.f36094, z);
        m51148(c10161, c12825);
        return c10161;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51148(C10161 c10161, C12825 c12825) {
        long j;
        IOException iOException;
        long j2;
        synchronized (this.f72073.f6922) {
            if (c10161.f28118 >= 0) {
                return;
            }
            m51142();
            int i = c10161.f28117 ? 1 : 2;
            int i2 = c12825.f36092 * i;
            int i3 = i2 + 16;
            int i4 = i2 + 48;
            int i5 = i2 + 64;
            long j3 = this.f72082;
            C3455 c3455 = this.f72073;
            C11996 c11996 = c3455.f6924;
            byte[] bArr = c3455.f6923;
            CRC32 crc32 = c3455.f6925;
            try {
                if (i5 <= bArr.length) {
                    try {
                        c11996.m27460();
                        c11996.m27440(32);
                        c11996.seek(-1L);
                        m51137(c11996, c10161);
                        try {
                            c12825.m29376(c10161.f28117, 0, bArr, c12825.f36092, c11996.size());
                            crc32.reset();
                            crc32.update(bArr, 32, i3);
                            int value = (int) crc32.getValue();
                            c11996.m27440(i4);
                            c11996.seek(-1L);
                            C4107.m8265(c11996, j3, i3);
                            c11996.seek(0L);
                            j2 = j3;
                            try {
                                C4107.m8264(c11996, 1, c10161.f28115, i3, value);
                                ((C17536) this.f72074).mo16280(j2, i5, bArr);
                                j = j2;
                            } catch (IOException e) {
                                e = e;
                                iOException = e;
                                j = j2;
                                try {
                                    ((C17536) this.f72074).truncate(j);
                                    this.f72082 = j;
                                    throw iOException;
                                } catch (IOException e2) {
                                    this.f72085 = true;
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
                        ((C17536) this.f72074).truncate(j);
                        this.f72082 = j;
                        throw iOException;
                    }
                } else {
                    j = j3;
                    try {
                        m51136(c10161, c12825, j, i3, i);
                    } catch (IOException e5) {
                        e = e5;
                        iOException = e;
                        ((C17536) this.f72074).truncate(j);
                        this.f72082 = j;
                        throw iOException;
                    }
                }
                this.f72082 = ((long) i5) + j;
                c10161.f28118 = j;
            } catch (IOException e6) {
                e = e6;
                j = j3;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m51136(C10161 c10161, C12825 c12825, long j, int i, int i2) {
        InterfaceC12173 interfaceC12173;
        C22902 c22902 = this;
        C3455 c3455 = c22902.f72073;
        C11996 c11996 = c3455.f6924;
        byte[] bArr = c3455.f6923;
        CRC32 crc32 = c3455.f6925;
        c11996.m27460();
        m51137(c11996, c10161);
        crc32.reset();
        crc32.update(bArr, 0, c11996.size());
        int length = bArr.length / i2;
        int i3 = 0;
        while (true) {
            int i4 = c12825.f36092;
            if (i3 >= i4) {
                break;
            }
            int iMin = Math.min(i4 - i3, length);
            int i5 = i3 + iMin;
            c12825.m29376(c10161.f28117, i3, bArr, i5, 0);
            crc32.update(bArr, 0, iMin * i2);
            i3 = i5;
        }
        int value = (int) crc32.getValue();
        c11996.m27460();
        byte[] bArr2 = bArr;
        C4107.m8264(c11996, 1, c10161.f28115, i, value);
        m51137(c11996, c10161);
        long j2 = j;
        int size = c11996.size();
        int i6 = 0;
        while (true) {
            int i7 = c12825.f36092;
            interfaceC12173 = c22902.f72074;
            if (i6 >= i7) {
                break;
            }
            int iMin2 = Math.min(i7 - i6, (bArr2.length - size) / i2);
            int i8 = i6 + iMin2;
            byte[] bArr3 = bArr2;
            c12825.m29376(c10161.f28117, i6, bArr2, i8, size);
            int i9 = (iMin2 * i2) + size;
            if (i9 == bArr3.length) {
                ((C17536) interfaceC12173).mo16280(j2, i9, bArr3);
                j2 += (long) i9;
                size = 0;
            } else {
                size = i9;
            }
            bArr2 = bArr3;
            i6 = i8;
            c22902 = this;
        }
        byte[] bArr4 = bArr2;
        if (bArr4.length - size < 16) {
            ((C17536) interfaceC12173).mo16280(j2, size, bArr4);
            j2 += (long) size;
            size = 0;
        }
        c11996.m27440(size);
        c11996.seek(-1L);
        C4107.m8265(c11996, j, i);
        ((C17536) interfaceC12173).mo16280(j2, c11996.size(), bArr4);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m51137(C11996 c11996, C10161 c10161) {
        c11996.writeInt(c10161.f28113);
        c11996.writeInt(c10161.f28116);
        c11996.writeInt(c10161.f28114);
        c11996.writeInt(c10161.f28117 ? 1 : 2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C12825 m51145(C10161 c10161, C2784 c2784) {
        C12825 c12825M51129;
        if (c2784 == null) {
            synchronized (this.f72073.f6922) {
                C3455 c3455 = this.f72073;
                c12825M51129 = m51129(c10161, c3455.f6923, c3455.f6915, c3455.f6925);
            }
            return c12825M51129;
        }
        return m51129(c10161, c2784.f4702, c2784.f4704, c2784.f4703);
    }

    /* JADX INFO: renamed from: ֫ */
    private C12825 m51129(C10161 c10161, byte[] bArr, C14677 c14677, CRC32 crc32) throws IOException {
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        int i4;
        long j3;
        int i5;
        if (c10161.f28112 == this) {
            int i6 = c10161.f28113;
            int i7 = this.f72072;
            if (i6 == i7 && (i = c10161.f28116) >= 0 && i <= i7 && (i2 = c10161.f28114) >= 0 && i2 <= i) {
                int i8 = c10161.f28117 ? 1 : 2;
                int i9 = i * i8;
                int i10 = i9 + 16;
                int i11 = i9 + 64;
                synchronized (this.f72073.f6922) {
                    j = c10161.f28118;
                    if (j >= 64) {
                        j2 = i11;
                        if (j <= this.f72082 - j2) {
                        }
                    }
                    throw new IOException("Truncated or unwritten text page");
                }
                int iMin = Math.min(i11, bArr.length);
                ((C17536) this.f72074).mo16281(j, bArr, 0, iMin);
                c14677.seek(0L);
                C9490 c9490M8263 = C4107.m8263(c14677);
                if (c9490M8263.f25995 != 1 || c9490M8263.f25992 != c10161.f28115 || c9490M8263.f25994 != i10) {
                    throw new IOException("Invalid text page reference");
                }
                if (c14677.readInt() != c10161.f28113 || c14677.readInt() != c10161.f28116 || c14677.readInt() != c10161.f28114 || c14677.readInt() != i8) {
                    throw new IOException("Invalid text page metadata");
                }
                crc32.reset();
                int i12 = iMin;
                crc32.update(bArr, 32, Math.min(i10, i12 - 32));
                C12825 c12825 = new C12825(c10161.f28113, c10161.f28116, c10161.f28114, c10161.f28117);
                int i13 = 48;
                long j4 = ((long) i12) + j;
                int i14 = i9;
                int iM29373 = 0;
                int i15 = 0;
                while (i14 != 0) {
                    if (i13 == i12) {
                        int iMin2 = Math.min(i14 + 16, bArr.length);
                        i3 = i14;
                        ((C17536) this.f72074).mo16281(j4, bArr, 0, iMin2);
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
                    iM29373 = c12825.m29373(bArr, i5, iMin3, i15, iM29373);
                    i15 = (iMin3 / i8) + i15;
                    i13 = i5 + iMin3;
                    i14 = i3 - iMin3;
                    c9490M8263 = c9490M8263;
                    i12 = i4;
                    j4 = j3;
                    j = j;
                }
                long j5 = j;
                C9490 c9490 = c9490M8263;
                if (iM29373 != c10161.f28114 || ((int) crc32.getValue()) != c9490.f25993) {
                    throw new IOException("Invalid text page checksum");
                }
                if (i12 - i13 < 16) {
                    ((C17536) this.f72074).mo16281((j5 + j2) - 16, bArr, 0, 16);
                    i13 = 0;
                }
                c14677.seek(i13);
                if (C4107.m8262(c14677, j5 + j2) == j5) {
                    return c12825;
                }
                throw new IOException("Invalid recovery footer reference");
            }
        }
        throw new IOException("Invalid text page shape");
    }

    /* JADX INFO: renamed from: ۧ */
    public final C9490 m51153(long j) throws IOException {
        byte[] bArr = new byte[32];
        if (j < 64 || j > this.f72082 - ((long) 32)) {
            throw new IOException("Invalid recovery record offset");
        }
        ((C17536) this.f72074).mo16281(j, bArr, 0, 32);
        C9490 c9490M8263 = C4107.m8263(new C14677(bArr));
        if (((long) c9490M8263.f25994) + 48 <= this.f72082 - j) {
            return c9490M8263;
        }
        throw new IOException("Truncated recovery record");
    }

    /* JADX INFO: renamed from: ܽ */
    public final long m51156(long j, byte[] bArr, int i, int i2) {
        long j2;
        synchronized (this.f72073.f6922) {
            m51142();
            if (i2 < 0 || i2 > bArr.length || i2 > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            j2 = this.f72082;
            try {
                int iM8259 = C4107.m8259(0, i2, bArr);
                C3455 c3455 = this.f72073;
                C11996 c11996 = c3455.f6924;
                byte[] bArr2 = c3455.f6923;
                System.arraycopy(bArr, 0, bArr2, 32, i2);
                c11996.m27460();
                c11996.m27440(i2 + 32);
                C4107.m8264(c11996, i, j, i2, iM8259);
                c11996.seek(-1L);
                C4107.m8265(c11996, j2, i2);
                ((C17536) this.f72074).mo16280(j2, c11996.size(), bArr2);
                this.f72082 = ((long) c11996.size()) + j2;
            } catch (IOException e) {
                try {
                    ((C17536) this.f72074).truncate(j2);
                    this.f72082 = j2;
                    throw e;
                } catch (IOException e2) {
                    this.f72085 = true;
                    e.addSuppressed(e2);
                    throw e;
                }
            }
        }
        return j2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m51149(long j, C9490 c9490) {
        byte[] bArr;
        synchronized (this.f72073.f6922) {
            int i = c9490.f25994;
            if (i > 8192) {
                throw new IOException("Recovery metadata record is too large");
            }
            bArr = new byte[i];
            long j2 = j + 32;
            ((C17536) this.f72074).mo16281(j2, bArr, 0, i);
            int i2 = C4107.f9046;
            if (i != c9490.f25994 || C4107.m8259(0, i, bArr) != c9490.f25993) {
                throw new IOException("Invalid recovery payload checksum");
            }
            byte[] bArr2 = new byte[16];
            long j3 = j2 + ((long) i);
            ((C17536) this.f72074).mo16281(j3, bArr2, 0, 16);
            if (C4107.m8261(j3 + ((long) 16), bArr2) != j) {
                throw new IOException("Invalid recovery footer reference");
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: ᩴ */
    private void m51142() throws IOException {
        if (this.f72075) {
            throw new IOException("Recovery validation is required before append");
        }
        if (this.f72085) {
            throw new IOException("Recovery append requires reopening after I/O failure");
        }
    }

    /* JADX INFO: renamed from: ۘ */
    public final FutureC5767 m51151() {
        return this.f72080;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m51159() {
        synchronized (this) {
            int i = this.f72071 - 1;
            this.f72071 = i;
            if (i != 0) {
                return;
            }
            this.f72079 = true;
            try {
                this.f72073.m6166(this);
                ((C17536) this.f72074).close();
                this.f72080.m12889((Object) null);
            } catch (IOException | Error | RuntimeException e) {
                this.f72080.m12891(e);
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
            if (this.f72081) {
                return;
            }
            this.f72081 = true;
            m51159();
        }
    }
}
