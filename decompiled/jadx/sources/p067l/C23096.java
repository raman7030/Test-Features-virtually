package p067l;

/* JADX INFO: renamed from: l.᩸᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 152K */
/* JADX INFO: loaded from: classes.dex */
public final class C23096 {

    /* JADX INFO: renamed from: ֫ */
    public long f72588 = 0;

    /* JADX INFO: renamed from: ۧ */
    public C23096 f72589;

    /* JADX INFO: renamed from: ܿ */
    public final void m51515(int i) {
        if (i >= 64) {
            m51509();
            this.f72589.m51515(i - 64);
        } else {
            this.f72588 |= 1 << i;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m51509() {
        if (this.f72589 == null) {
            this.f72589 = new C23096();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51511(int i) {
        if (i >= 64) {
            C23096 c23096 = this.f72589;
            if (c23096 != null) {
                c23096.m51511(i - 64);
                return;
            }
            return;
        }
        this.f72588 &= ~(1 << i);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m51514(int i) {
        if (i < 64) {
            return (this.f72588 & (1 << i)) != 0;
        }
        m51509();
        return this.f72589.m51514(i - 64);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51510() {
        this.f72588 = 0L;
        C23096 c23096 = this.f72589;
        if (c23096 != null) {
            c23096.m51510();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m51512(int i, boolean z) {
        if (i >= 64) {
            m51509();
            this.f72589.m51512(i - 64, z);
            return;
        }
        long j = this.f72588;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f72588 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m51515(i);
        } else {
            m51511(i);
        }
        if (z2 || this.f72589 != null) {
            m51509();
            this.f72589.m51512(0, z2);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final boolean m51516(int i) {
        if (i >= 64) {
            m51509();
            return this.f72589.m51516(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f72588;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f72588 = j3;
        long j4 = j - 1;
        this.f72588 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C23096 c23096 = this.f72589;
        if (c23096 != null) {
            if (c23096.m51514(0)) {
                m51515(63);
            }
            this.f72589.m51516(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m51513(int i) {
        C23096 c23096 = this.f72589;
        if (c23096 == null) {
            if (i >= 64) {
                return Long.bitCount(this.f72588);
            }
            return Long.bitCount(this.f72588 & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f72588 & ((1 << i) - 1));
        }
        return Long.bitCount(this.f72588) + c23096.m51513(i - 64);
    }

    public final String toString() {
        if (this.f72589 == null) {
            return Long.toBinaryString(this.f72588);
        }
        return this.f72589.toString() + "xx" + Long.toBinaryString(this.f72588);
    }
}
