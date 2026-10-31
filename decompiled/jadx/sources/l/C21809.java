package l;

/* JADX INFO: renamed from: l.᩸᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 152K */
/* JADX INFO: loaded from: classes.dex */
public final class C21809 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f69880 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C21809 f69881;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m49164(int i) {
        if (i >= 64) {
            m49158();
            this.f69881.m49164(i - 64);
        } else {
            this.f69880 |= 1 << i;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m49158() {
        if (this.f69881 == null) {
            this.f69881 = new C21809();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49160(int i) {
        if (i >= 64) {
            C21809 c21809 = this.f69881;
            if (c21809 != null) {
                c21809.m49160(i - 64);
                return;
            }
            return;
        }
        this.f69880 &= ~(1 << i);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m49163(int i) {
        if (i < 64) {
            return (this.f69880 & (1 << i)) != 0;
        }
        m49158();
        return this.f69881.m49163(i - 64);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49159() {
        this.f69880 = 0L;
        C21809 c21809 = this.f69881;
        if (c21809 != null) {
            c21809.m49159();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49161(int i, boolean z) {
        if (i >= 64) {
            m49158();
            this.f69881.m49161(i - 64, z);
            return;
        }
        long j = this.f69880;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f69880 = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            m49164(i);
        } else {
            m49160(i);
        }
        if (z2 || this.f69881 != null) {
            m49158();
            this.f69881.m49161(0, z2);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean m49165(int i) {
        if (i >= 64) {
            m49158();
            return this.f69881.m49165(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f69880;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f69880 = j3;
        long j4 = j - 1;
        this.f69880 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        C21809 c21809 = this.f69881;
        if (c21809 != null) {
            if (c21809.m49163(0)) {
                m49164(63);
            }
            this.f69881.m49165(0);
        }
        return z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m49162(int i) {
        C21809 c21809 = this.f69881;
        if (c21809 == null) {
            if (i >= 64) {
                return Long.bitCount(this.f69880);
            }
            return Long.bitCount(this.f69880 & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f69880 & ((1 << i) - 1));
        }
        return Long.bitCount(this.f69880) + c21809.m49162(i - 64);
    }

    public final String toString() {
        if (this.f69881 == null) {
            return Long.toBinaryString(this.f69880);
        }
        return this.f69881.toString() + "xx" + Long.toBinaryString(this.f69880);
    }
}
