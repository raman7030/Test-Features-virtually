package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 75UL */
/* JADX INFO: loaded from: classes2.dex */
public final class C5549 implements Cloneable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final Object f17156 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Object[] f17157;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17158;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f17159 = false;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long[] f17160;

    public C5549() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f17160 = new long[i4];
        this.f17157 = new Object[i4];
    }

    public final C5549 clone() {
        try {
            C5549 c5549 = (C5549) super.clone();
            c5549.f17160 = (long[]) this.f17160.clone();
            c5549.f17157 = (Object[]) this.f17157.clone();
            return c5549;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object m15697(long j, Long l2) {
        Object obj;
        int iM2487 = C0609.m2487(j, this.f17160, this.f17158);
        return (iM2487 < 0 || (obj = this.f17157[iM2487]) == f17156) ? l2 : obj;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m15698(long j) {
        int iM2487 = C0609.m2487(j, this.f17160, this.f17158);
        if (iM2487 >= 0) {
            Object[] objArr = this.f17157;
            Object obj = objArr[iM2487];
            Object obj2 = f17156;
            if (obj != obj2) {
                objArr[iM2487] = obj2;
                this.f17159 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m15700(int i) {
        Object[] objArr = this.f17157;
        Object obj = objArr[i];
        Object obj2 = f17156;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f17159 = true;
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m15691() {
        int i = this.f17158;
        long[] jArr = this.f17160;
        Object[] objArr = this.f17157;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f17156) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f17159 = false;
        this.f17158 = i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15696(long j, Object obj) {
        int iM2487 = C0609.m2487(j, this.f17160, this.f17158);
        if (iM2487 >= 0) {
            this.f17157[iM2487] = obj;
            return;
        }
        int i = ~iM2487;
        int i2 = this.f17158;
        if (i < i2) {
            Object[] objArr = this.f17157;
            if (objArr[i] == f17156) {
                this.f17160[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f17159 && i2 >= this.f17160.length) {
            m15691();
            i = ~C0609.m2487(j, this.f17160, this.f17158);
        }
        int i3 = this.f17158;
        if (i3 >= this.f17160.length) {
            int i4 = (i3 + 1) * 8;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f17160;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f17157;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f17160 = jArr;
            this.f17157 = objArr2;
        }
        int i8 = this.f17158 - i;
        if (i8 != 0) {
            long[] jArr3 = this.f17160;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f17157;
            System.arraycopy(objArr4, i, objArr4, i9, this.f17158 - i);
        }
        this.f17160[i] = j;
        this.f17157[i] = obj;
        this.f17158++;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m15699() {
        if (this.f17159) {
            m15691();
        }
        return this.f17158;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m15693(int i) {
        if (this.f17159) {
            m15691();
        }
        return this.f17160[i];
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object m15701(int i) {
        if (this.f17159) {
            m15691();
        }
        return this.f17157[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m15692(long j) {
        if (this.f17159) {
            m15691();
        }
        return C0609.m2487(j, this.f17160, this.f17158);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15694() {
        int i = this.f17158;
        Object[] objArr = this.f17157;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f17158 = 0;
        this.f17159 = false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m15695(long j, Long l2) {
        int i = this.f17158;
        if (i != 0 && j <= this.f17160[i - 1]) {
            m15696(j, (Object) l2);
            return;
        }
        if (this.f17159 && i >= this.f17160.length) {
            m15691();
        }
        int i2 = this.f17158;
        if (i2 >= this.f17160.length) {
            int i3 = (i2 + 1) * 8;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.f17160;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f17157;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f17160 = jArr;
            this.f17157 = objArr;
        }
        this.f17160[i2] = j;
        this.f17157[i2] = l2;
        this.f17158 = i2 + 1;
    }

    public final String toString() {
        if (m15699() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f17158 * 28);
        sb.append('{');
        for (int i = 0; i < this.f17158; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m15693(i));
            sb.append(a.h);
            Object objM15701 = m15701(i);
            if (objM15701 != this) {
                sb.append(objM15701);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
