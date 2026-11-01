package p067l;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: l.ܽᩳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18335 extends InputStream implements InterfaceC16534 {

    /* JADX INFO: renamed from: ۧ֫ */
    public static final InterfaceC4410 f54745 = C13128.m30022(C18335.class);

    /* JADX INFO: renamed from: ֫֫ */
    public C19816 f54746;

    /* JADX INFO: renamed from: ۙ */
    public EnumC4254 f54748;

    /* JADX INFO: renamed from: ۛ */
    public long f54749;

    /* JADX INFO: renamed from: ۟ */
    public long f54750;

    /* JADX INFO: renamed from: ۤ */
    public final int f54751;

    /* JADX INFO: renamed from: ۫ */
    public boolean f54753;

    /* JADX INFO: renamed from: ۬ */
    public C9578 f54754;

    /* JADX INFO: renamed from: ܰ */
    public final long f54755;

    /* JADX INFO: renamed from: ᩶ */
    public final int f54756;

    /* JADX INFO: renamed from: ᩸ */
    public final boolean f54757;

    /* JADX INFO: renamed from: ᩹ */
    public final long f54758;

    /* JADX INFO: renamed from: ᩺ */
    public long f54759;

    /* JADX INFO: renamed from: ۗ */
    public int f54747 = 0;

    /* JADX INFO: renamed from: ۨ */
    public final ArrayDeque f54752 = new ArrayDeque();

    @Override // java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.InputStream, p067l.InterfaceC16534
    public /* synthetic */ long transferTo(OutputStream outputStream) {
        return C3123.transferTo(this, outputStream);
    }

    public C18335(C9578 c9578, int i, long j, long j2, long j3, int i2) {
        this.f54749 = 0L;
        this.f54759 = 0L;
        this.f54754 = c9578;
        this.f54756 = i;
        this.f54755 = j;
        this.f54749 = j2;
        this.f54759 = j2;
        this.f54750 = j3;
        boolean z = j3 >= 0;
        this.f54757 = z;
        long j4 = C14849.FOREVER_NS;
        if (z && C14849.FOREVER_NS - j2 >= j3) {
            j4 = j2 + j3;
        }
        this.f54758 = j4;
        this.f54751 = Math.max(1, i2);
    }

    @Override // java.io.InputStream
    public final int read() {
        C19816 c19816 = this.f54746;
        if (c19816 == null || this.f54747 >= c19816.m45061()) {
            m41771();
        }
        if (this.f54753) {
            return -1;
        }
        C19816 c19817 = this.f54746;
        int i = this.f54747;
        this.f54747 = i + 1;
        return c19817.m45058(i) & 255;
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
        C19816 c19816 = this.f54746;
        if (c19816 == null || this.f54747 >= c19816.m45061()) {
            m41771();
        }
        if (this.f54753) {
            return -1;
        }
        int iMin = Math.min(this.f54746.m45061() - this.f54747, i2);
        this.f54746.m45059(this.f54747, bArr, i, iMin);
        this.f54747 += iMin;
        return iMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        EnumC4254 enumC4254;
        boolean zIsEmpty = this.f54752.isEmpty();
        m41769();
        if (this.f54748 == null) {
            C19816 c19816 = this.f54746;
            boolean z = c19816 == null || this.f54747 >= c19816.m45061();
            if (this.f54753 || (this.f54757 && this.f54750 == 0 && z && zIsEmpty)) {
                enumC4254 = EnumC4254.NORMAL_FINISHED;
            } else {
                enumC4254 = !zIsEmpty ? EnumC4254.EARLY_CLOSE_WITH_PENDING : EnumC4254.EARLY_CLOSE;
            }
            this.f54748 = enumC4254;
        }
        this.f54753 = true;
        this.f54754 = null;
        this.f54746 = null;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (j <= 0) {
            return 0L;
        }
        C19816 c19816 = this.f54746;
        if (c19816 != null) {
            int iM45061 = c19816.m45061();
            int i = this.f54747;
            if (j < iM45061 - i) {
                this.f54747 = i + ((int) j);
                return j;
            }
        }
        C19816 c19817 = this.f54746;
        long jM45061 = c19817 == null ? this.f54759 : (this.f54759 - ((long) c19817.m45061())) + ((long) this.f54747);
        long j2 = C14849.FOREVER_NS;
        if (C14849.FOREVER_NS - jM45061 >= j) {
            j2 = jM45061 + j;
        }
        this.f54746 = null;
        this.f54747 = 0;
        m41769();
        this.f54749 = j2;
        this.f54759 = j2;
        if (this.f54757) {
            this.f54750 = Math.max(0L, this.f54758 - j2);
        }
        return j;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m41771() {
        if (this.f54753) {
            return;
        }
        m41770();
        ArrayDeque arrayDeque = this.f54752;
        if (arrayDeque.isEmpty()) {
            this.f54753 = true;
            this.f54748 = EnumC4254.NORMAL_FINISHED;
            return;
        }
        C12972 c12972 = (C12972) arrayDeque.removeFirst();
        Future future = c12972.f36485;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        InterfaceC18040 interfaceC18040 = C4630.f10377;
        C19816 c19816 = (C19816) C19382.m44125(this.f54755, future);
        long jM54605 = ((C24864) c19816.mo5341()).m54605();
        EnumC9460 enumC9460 = EnumC9460.STATUS_SUCCESS;
        if (jM54605 == enumC9460.getValue()) {
            this.f54746 = c19816;
            this.f54747 = 0;
            this.f54759 += (long) c19816.m45061();
        }
        if (((C24864) c19816.mo5341()).m54605() == EnumC9460.STATUS_END_OF_FILE.getValue() || c19816.m45061() == 0) {
            f54745.mo9195(Long.valueOf(this.f54759), "EOF, {} bytes read");
            this.f54753 = true;
            this.f54748 = EnumC4254.NORMAL_FINISHED;
            this.f54746 = null;
            this.f54747 = 0;
            m41769();
            return;
        }
        if (((C24864) c19816.mo5341()).m54605() != enumC9460.getValue()) {
            throw new C3406((C24864) c19816.mo5341(), "Read failed for " + this);
        }
        if (this.f54757 && c19816.m45061() < c12972.f36486) {
            m41769();
            this.f54750 = 0L;
        }
        m41770();
    }

    /* JADX INFO: renamed from: ܽ */
    private void m41770() {
        while (!this.f54753 && this.f54754 != null) {
            ArrayDeque arrayDeque = this.f54752;
            if (arrayDeque.size() >= this.f54751) {
                return;
            }
            boolean z = this.f54757;
            if (z && this.f54750 <= 0) {
                return;
            }
            int iMin = this.f54756;
            if (z) {
                iMin = (int) Math.min(iMin, this.f54750);
            }
            C9578 c9578 = this.f54754;
            arrayDeque.addLast(new C12972(c9578.f13421.m10465(c9578.f13423, this.f54749, iMin), iMin));
            long j = iMin;
            this.f54749 += j;
            if (z) {
                this.f54750 -= j;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m41769() {
        while (true) {
            ArrayDeque arrayDeque = this.f54752;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                try {
                    ((C12972) arrayDeque.removeFirst()).f36485.cancel(true);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
