package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C21886 {

    /* JADX INFO: renamed from: ֫ */
    public int f68822;

    /* JADX INFO: renamed from: ۧ */
    public int f68823;

    /* JADX INFO: renamed from: ܽ */
    public long[] f68824 = new long[10];

    /* JADX INFO: renamed from: ᩳ */
    public Object[] f68825 = new Object[10];

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m49348() {
        this.f68822 = 0;
        this.f68823 = 0;
        Arrays.fill(this.f68825, (Object) null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized void m49349(long j, Object obj) {
        int i = this.f68823;
        if (i > 0) {
            if (j <= this.f68824[((this.f68822 + i) - 1) % this.f68825.length]) {
                m49348();
            }
        }
        m49346();
        int i2 = this.f68822;
        int i3 = this.f68823;
        Object[] objArr = this.f68825;
        int length = (i2 + i3) % objArr.length;
        this.f68824[length] = j;
        objArr[length] = obj;
        this.f68823 = i3 + 1;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized Object m49350() {
        return this.f68823 == 0 ? null : m49345();
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized Object m49351(long j) {
        return m49344(j, true);
    }

    /* JADX INFO: renamed from: ܽ */
    public final synchronized int m49352() {
        return this.f68823;
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized Object m49347(long j) {
        return m49344(j, false);
    }

    /* JADX INFO: renamed from: ֫ */
    private Object m49344(long j, boolean z) {
        Object objM49345 = null;
        long j2 = C14849.FOREVER_NS;
        while (this.f68823 > 0) {
            long j3 = j - this.f68824[this.f68822];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM49345 = m49345();
            j2 = j3;
        }
        return objM49345;
    }

    /* JADX INFO: renamed from: ܿ */
    private Object m49345() {
        C23877.m52960(this.f68823 > 0);
        Object[] objArr = this.f68825;
        int i = this.f68822;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f68822 = (i + 1) % objArr.length;
        this.f68823--;
        return obj;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m49346() {
        int length = this.f68825.length;
        if (this.f68823 < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f68822;
        int i3 = length - i2;
        System.arraycopy(this.f68824, i2, jArr, 0, i3);
        System.arraycopy(this.f68825, this.f68822, objArr, 0, i3);
        int i4 = this.f68822;
        if (i4 > 0) {
            System.arraycopy(this.f68824, 0, jArr, i3, i4);
            System.arraycopy(this.f68825, 0, objArr, i3, this.f68822);
        }
        this.f68824 = jArr;
        this.f68825 = objArr;
        this.f68822 = 0;
    }
}
