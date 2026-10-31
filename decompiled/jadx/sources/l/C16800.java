package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16800 extends InputStream implements InterfaceC14905 {

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public static final InterfaceC2148 f51563 = C11321.m27961(C16800.class);

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public C18358 f51564;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC1984 f51566;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public long f51567;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public long f51568;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f51569;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f51571;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C7586 f51572;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f51573;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f51574;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f51575;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f51576;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f51577;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f51565 = 0;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f51570 = new ArrayDeque();

    @Override // java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.InputStream, l.InterfaceC14905
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C0794.transferTo(this, outputStream);
    }

    public C16800(C7586 c7586, int i, long j, long j2, long j3, int i2) {
        this.f51567 = 0L;
        this.f51577 = 0L;
        this.f51572 = c7586;
        this.f51574 = i;
        this.f51573 = j;
        this.f51567 = j2;
        this.f51577 = j2;
        this.f51568 = j3;
        boolean z = j3 >= 0;
        this.f51575 = z;
        long j4 = C13132.FOREVER_NS;
        if (z && C13132.FOREVER_NS - j2 >= j3) {
            j4 = j2 + j3;
        }
        this.f51576 = j4;
        this.f51569 = Math.max(1, i2);
    }

    @Override // java.io.InputStream
    public final int read() {
        C18358 c18358 = this.f51564;
        if (c18358 == null || this.f51565 >= c18358.m42789()) {
            m39535();
        }
        if (this.f51571) {
            return -1;
        }
        C18358 c18359 = this.f51564;
        int i = this.f51565;
        this.f51565 = i + 1;
        return c18359.m42786(i) & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        C18358 c18358 = this.f51564;
        if (c18358 == null || this.f51565 >= c18358.m42789()) {
            m39535();
        }
        if (this.f51571) {
            return -1;
        }
        int iMin = Math.min(this.f51564.m42789() - this.f51565, i2);
        this.f51564.m42787(this.f51565, bArr, i, iMin);
        this.f51565 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EnumC1984 enumC1984;
        boolean zIsEmpty = this.f51570.isEmpty();
        m39533();
        if (this.f51566 == null) {
            C18358 c18358 = this.f51564;
            boolean z = c18358 == null || this.f51565 >= c18358.m42789();
            if (this.f51571 || (this.f51575 && this.f51568 == 0 && z && zIsEmpty)) {
                enumC1984 = EnumC1984.NORMAL_FINISHED;
            } else {
                enumC1984 = !zIsEmpty ? EnumC1984.EARLY_CLOSE_WITH_PENDING : EnumC1984.EARLY_CLOSE;
            }
            this.f51566 = enumC1984;
        }
        this.f51571 = true;
        this.f51572 = null;
        this.f51564 = null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        C18358 c18358 = this.f51564;
        if (c18358 != null) {
            int iM42789 = c18358.m42789();
            int i = this.f51565;
            if (j < iM42789 - i) {
                this.f51565 = i + ((int) j);
                return j;
            }
        }
        C18358 c18359 = this.f51564;
        long jM42789 = c18359 == null ? this.f51577 : (this.f51577 - ((long) c18359.m42789())) + ((long) this.f51565);
        long j2 = C13132.FOREVER_NS;
        if (C13132.FOREVER_NS - jM42789 >= j) {
            j2 = jM42789 + j;
        }
        this.f51564 = null;
        this.f51565 = 0;
        m39533();
        this.f51567 = j2;
        this.f51577 = j2;
        if (this.f51575) {
            this.f51568 = Math.max(0L, this.f51576 - j2);
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m39535() {
        if (this.f51571) {
            return;
        }
        m39534();
        ArrayDeque arrayDeque = this.f51570;
        if (arrayDeque.isEmpty()) {
            this.f51571 = true;
            this.f51566 = EnumC1984.NORMAL_FINISHED;
            return;
        }
        C11157 c11157 = (C11157) arrayDeque.removeFirst();
        Future future = c11157.f33485;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC16490 interfaceC16490 = C2380.f7586;
        C18358 c18358 = (C18358) C17902.m41878(this.f51573, future);
        long jM52202 = ((C23670) c18358.mo3028()).m52202();
        EnumC7462 enumC7462 = EnumC7462.STATUS_SUCCESS;
        if (jM52202 == enumC7462.getValue()) {
            this.f51564 = c18358;
            this.f51565 = 0;
            this.f51577 += (long) c18358.m42789();
        }
        if (((C23670) c18358.mo3028()).m52202() == EnumC7462.STATUS_END_OF_FILE.getValue() || c18358.m42789() == 0) {
            f51563.mo7100(Long.valueOf(this.f51577), "EOF, {} bytes read");
            this.f51571 = true;
            this.f51566 = EnumC1984.NORMAL_FINISHED;
            this.f51564 = null;
            this.f51565 = 0;
            m39533();
            return;
        }
        if (((C23670) c18358.mo3028()).m52202() != enumC7462.getValue()) {
            throw new C1092((C23670) c18358.mo3028(), "Read failed for " + this);
        }
        if (this.f51575 && c18358.m42789() < c11157.f33486) {
            m39533();
            this.f51568 = 0L;
        }
        m39534();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m39534() {
        while (!this.f51571 && this.f51572 != null) {
            ArrayDeque arrayDeque = this.f51570;
            if (arrayDeque.size() >= this.f51569) {
                return;
            }
            boolean z = this.f51575;
            if (z && this.f51568 <= 0) {
                return;
            }
            int iMin = this.f51574;
            if (z) {
                iMin = (int) Math.min(iMin, this.f51568);
            }
            C7586 c7586 = this.f51572;
            arrayDeque.addLast(new C11157(c7586.f10613.m8419(c7586.f10615, this.f51567, iMin), iMin));
            long j = iMin;
            this.f51567 += j;
            if (z) {
                this.f51568 -= j;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m39533() {
        while (true) {
            ArrayDeque arrayDeque = this.f51570;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                try {
                    ((C11157) arrayDeque.removeFirst()).f33485.cancel(true);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
