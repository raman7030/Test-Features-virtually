package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.᩷֨֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 58QC */
/* JADX INFO: loaded from: classes4.dex */
public final class C20537 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f66145;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f66146;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long[] f66147 = new long[10];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object[] f66148 = new Object[10];

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47025() {
        this.f66145 = 0;
        this.f66146 = 0;
        Arrays.fill(this.f66148, (Object) null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized void m47026(long j, Object obj) {
        int i = this.f66146;
        if (i > 0) {
            if (j <= this.f66147[((this.f66145 + i) - 1) % this.f66148.length]) {
                m47025();
            }
        }
        m47023();
        int i2 = this.f66145;
        int i3 = this.f66146;
        Object[] objArr = this.f66148;
        int length = (i2 + i3) % objArr.length;
        this.f66147[length] = j;
        objArr[length] = obj;
        this.f66146 = i3 + 1;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m47027() {
        return this.f66146 == 0 ? null : m47022();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized Object m47028(long j) {
        return m47021(j, true);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized int m47029() {
        return this.f66146;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized Object m47024(long j) {
        return m47021(j, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private Object m47021(long j, boolean z) {
        Object objM47022 = null;
        long j2 = C13132.FOREVER_NS;
        while (this.f66146 > 0) {
            long j3 = j - this.f66147[this.f66145];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM47022 = m47022();
            j2 = j3;
        }
        return objM47022;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private Object m47022() {
        C22632.m50634(this.f66146 > 0);
        Object[] objArr = this.f66148;
        int i = this.f66145;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f66145 = (i + 1) % objArr.length;
        this.f66146--;
        return obj;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m47023() {
        int length = this.f66148.length;
        if (this.f66146 < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f66145;
        int i3 = length - i2;
        System.arraycopy(this.f66147, i2, jArr, 0, i3);
        System.arraycopy(this.f66148, this.f66145, objArr, 0, i3);
        int i4 = this.f66145;
        if (i4 > 0) {
            System.arraycopy(this.f66147, 0, jArr, i3, i4);
            System.arraycopy(this.f66148, 0, objArr, i3, this.f66145);
        }
        this.f66147 = jArr;
        this.f66148 = objArr;
        this.f66145 = 0;
    }
}
