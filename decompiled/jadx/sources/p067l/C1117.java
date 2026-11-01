package p067l;

import com.alipay.sdk.p010m.p041p.C0184a;

/* JADX INFO: renamed from: l.ۚ᩵ */
/* JADX INFO: compiled from: 75UL */
/* JADX INFO: loaded from: classes2.dex */
public final class C1117 implements Cloneable {

    /* JADX INFO: renamed from: ۗ */
    public static final Object f19997 = new Object();

    /* JADX INFO: renamed from: ۙ */
    public Object[] f19998;

    /* JADX INFO: renamed from: ᩶ */
    public int f19999;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f20000 = false;

    /* JADX INFO: renamed from: ᩹ */
    public long[] f20001;

    public C1117() {
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
        this.f20001 = new long[i4];
        this.f19998 = new Object[i4];
    }

    public final C1117 clone() {
        try {
            C1117 c1117 = (C1117) super.clone();
            c1117.f20001 = (long[]) this.f20001.clone();
            c1117.f19998 = (Object[]) this.f19998.clone();
            return c1117;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final Object m17612(long j, Long l2) {
        Object obj;
        int iM4843 = C0872.m4843(j, this.f20001, this.f19999);
        return (iM4843 < 0 || (obj = this.f19998[iM4843]) == f19997) ? l2 : obj;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m17613(long j) {
        int iM4843 = C0872.m4843(j, this.f20001, this.f19999);
        if (iM4843 >= 0) {
            Object[] objArr = this.f19998;
            Object obj = objArr[iM4843];
            Object obj2 = f19997;
            if (obj != obj2) {
                objArr[iM4843] = obj2;
                this.f20000 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m17615(int i) {
        Object[] objArr = this.f19998;
        Object obj = objArr[i];
        Object obj2 = f19997;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f20000 = true;
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m17606() {
        int i = this.f19999;
        long[] jArr = this.f20001;
        Object[] objArr = this.f19998;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f19997) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f20000 = false;
        this.f19999 = i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17611(long j, Object obj) {
        int iM4843 = C0872.m4843(j, this.f20001, this.f19999);
        if (iM4843 >= 0) {
            this.f19998[iM4843] = obj;
            return;
        }
        int i = ~iM4843;
        int i2 = this.f19999;
        if (i < i2) {
            Object[] objArr = this.f19998;
            if (objArr[i] == f19997) {
                this.f20001[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f20000 && i2 >= this.f20001.length) {
            m17606();
            i = ~C0872.m4843(j, this.f20001, this.f19999);
        }
        int i3 = this.f19999;
        if (i3 >= this.f20001.length) {
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
            long[] jArr2 = this.f20001;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f19998;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f20001 = jArr;
            this.f19998 = objArr2;
        }
        int i8 = this.f19999 - i;
        if (i8 != 0) {
            long[] jArr3 = this.f20001;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f19998;
            System.arraycopy(objArr4, i, objArr4, i9, this.f19999 - i);
        }
        this.f20001[i] = j;
        this.f19998[i] = obj;
        this.f19999++;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m17614() {
        if (this.f20000) {
            m17606();
        }
        return this.f19999;
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m17608(int i) {
        if (this.f20000) {
            m17606();
        }
        return this.f20001[i];
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Object m17616(int i) {
        if (this.f20000) {
            m17606();
        }
        return this.f19998[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m17607(long j) {
        if (this.f20000) {
            m17606();
        }
        return C0872.m4843(j, this.f20001, this.f19999);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17609() {
        int i = this.f19999;
        Object[] objArr = this.f19998;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f19999 = 0;
        this.f20000 = false;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m17610(long j, Long l2) {
        int i = this.f19999;
        if (i != 0 && j <= this.f20001[i - 1]) {
            m17611(j, (Object) l2);
            return;
        }
        if (this.f20000 && i >= this.f20001.length) {
            m17606();
        }
        int i2 = this.f19999;
        if (i2 >= this.f20001.length) {
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
            long[] jArr2 = this.f20001;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f19998;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f20001 = jArr;
            this.f19998 = objArr;
        }
        this.f20001[i2] = j;
        this.f19998[i2] = l2;
        this.f19999 = i2 + 1;
    }

    public final String toString() {
        if (m17614() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f19999 * 28);
        sb.append('{');
        for (int i = 0; i < this.f19999; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m17608(i));
            sb.append(C0184a.f880h);
            Object objM17616 = m17616(i);
            if (objM17616 != this) {
                sb.append(objM17616);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
