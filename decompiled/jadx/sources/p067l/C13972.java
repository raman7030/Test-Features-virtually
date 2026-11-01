package p067l;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: l.۫ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9WI */
/* JADX INFO: loaded from: classes3.dex */
public final class C13972 implements AutoCloseable {

    /* JADX INFO: renamed from: ۟ */
    public static final InterfaceC4410 f39443 = C13128.m30022(C13972.class);

    /* JADX INFO: renamed from: ۗ */
    public final byte[] f39444;

    /* JADX INFO: renamed from: ۙ */
    public final int f39445;

    /* JADX INFO: renamed from: ۛ */
    public C5807 f39446;

    /* JADX INFO: renamed from: ۤ */
    public final int f39447;

    /* JADX INFO: renamed from: ۨ */
    public final long f39448;

    /* JADX INFO: renamed from: ۫ */
    public boolean f39449;

    /* JADX INFO: renamed from: ۬ */
    public final int f39450;

    /* JADX INFO: renamed from: ܰ */
    public final AtomicLong f39451;

    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC3341 f39452;

    /* JADX INFO: renamed from: ᩸ */
    public final int f39453;

    /* JADX INFO: renamed from: ᩹ */
    public final int f39454;

    /* JADX INFO: renamed from: ᩺ */
    public final String f39455;

    /* JADX INFO: renamed from: ۘ */
    public final synchronized void m31750() {
        long jDecrementAndGet = this.f39451.decrementAndGet();
        if (jDecrementAndGet == 0) {
            m31753();
        } else {
            InterfaceC4410 interfaceC4410 = f39443;
            if (interfaceC4410.mo9194()) {
                interfaceC4410.mo9196(String.format("Release %s (%d)", this, Long.valueOf(jDecrementAndGet)));
            }
        }
    }

    public C13972(InterfaceC3341 interfaceC3341, byte[] bArr, C5807 c5807, String str, int i, int i2, long j) {
        this.f39449 = true;
        this.f39451 = new AtomicLong(1L);
        this.f39452 = interfaceC3341;
        this.f39444 = bArr;
        this.f39445 = 0;
        this.f39455 = str;
        this.f39450 = i;
        this.f39453 = i2;
        this.f39454 = 0;
        this.f39447 = 0;
        c5807.m13064();
        this.f39446 = c5807;
        this.f39448 = c5807.m13075();
        interfaceC3341.getClass();
    }

    public C13972(InterfaceC3341 interfaceC3341, int i, C5807 c5807, String str, int i2, int i3, int i4, int i5, long j) {
        this.f39449 = true;
        this.f39451 = new AtomicLong(1L);
        this.f39452 = interfaceC3341;
        this.f39445 = i;
        this.f39444 = null;
        this.f39455 = str;
        this.f39450 = i2;
        this.f39453 = i3;
        this.f39454 = i4;
        this.f39447 = i5;
        c5807.m13064();
        this.f39446 = c5807;
        this.f39448 = c5807.m13075();
        interfaceC3341.getClass();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m31754() throws C5255 {
        if (!m31751()) {
            throw new C5255("Descriptor is no longer valid");
        }
        return this.f39445;
    }

    /* JADX INFO: renamed from: ܳ */
    public final byte[] m31752() throws C5255 {
        if (!m31751()) {
            throw new C5255("Descriptor is no longer valid");
        }
        return this.f39444;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C5807 m31755() {
        C5807 c5807 = this.f39446;
        c5807.m13064();
        return c5807;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m31751() {
        if (this.f39449) {
            return this.f39448 == this.f39446.m13075() && this.f39446.m13071();
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m31753() {
        C5807 c5807 = this.f39446;
        if (c5807 != null) {
            try {
                if (m31751()) {
                    InterfaceC4410 interfaceC4410 = f39443;
                    if (interfaceC4410.mo9181()) {
                        interfaceC4410.mo9183("Closing file handle " + this);
                    }
                    boolean zM13076 = c5807.m13076();
                    InterfaceC3341 interfaceC3341 = this.f39452;
                    if (zM13076) {
                        c5807.m13063(new C15685(interfaceC3341, this.f39444), null, EnumC2572.NO_RETRY);
                    } else {
                        c5807.m13063(new C3874(interfaceC3341, this.f39445), new C9200(interfaceC3341), EnumC2572.NO_RETRY);
                    }
                }
            } finally {
                this.f39449 = false;
                c5807.m13077();
                this.f39446 = null;
            }
        }
        this.f39449 = false;
        if (c5807 != null) {
            c5807.m13077();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        m31750();
    }

    public final void finalize() {
        if (this.f39451.get() == 0 || !this.f39449) {
            return;
        }
        f39443.mo9199("File handle was not properly closed: " + this);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31748() {
        long jIncrementAndGet = this.f39451.incrementAndGet();
        InterfaceC4410 interfaceC4410 = f39443;
        if (interfaceC4410.mo9194()) {
            interfaceC4410.mo9196(String.format("Acquire %s (%d)", this, Long.valueOf(jIncrementAndGet)));
        }
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m31749() {
        this.f39449 = false;
    }

    public final String toString() {
        Object objValueOf;
        byte[] bArr = this.f39444;
        if (bArr != null) {
            objValueOf = C13854.m31530(bArr, 0, bArr.length);
        } else {
            objValueOf = Integer.valueOf(this.f39445);
        }
        return String.format("FileHandle %s [fid=%s,tree=%d,flags=%x,access=%x,attrs=%x,options=%x]", this.f39455, objValueOf, Long.valueOf(this.f39448), Integer.valueOf(this.f39450), Integer.valueOf(this.f39453), Integer.valueOf(this.f39454), Integer.valueOf(this.f39447));
    }

    public final int hashCode() {
        int iHashCode;
        long j = this.f39448;
        byte[] bArr = this.f39444;
        if (bArr != null) {
            iHashCode = Arrays.hashCode(bArr);
        } else {
            iHashCode = this.f39445;
        }
        return (int) ((j * 3) + ((long) iHashCode));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13972)) {
            return false;
        }
        C13972 c13972 = (C13972) obj;
        long j = c13972.f39448;
        long j2 = this.f39448;
        byte[] bArr = this.f39444;
        if (bArr != null) {
            return Arrays.equals(bArr, c13972.f39444) && j2 == j;
        }
        return this.f39445 == c13972.f39445 && j2 == j;
    }
}
