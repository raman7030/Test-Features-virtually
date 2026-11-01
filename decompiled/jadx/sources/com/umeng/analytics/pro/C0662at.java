package com.umeng.analytics.pro;

/* JADX INFO: renamed from: com.umeng.analytics.pro.at */
/* JADX INFO: compiled from: I5R4 */
/* JADX INFO: loaded from: classes.dex */
public class C0662at {

    /* JADX INFO: renamed from: a */
    public short[] f2435a;

    /* JADX INFO: renamed from: b */
    public int f2436b = -1;

    public C0662at(int i) {
        this.f2435a = new short[i];
    }

    /* JADX INFO: renamed from: a */
    public short m2269a() {
        short[] sArr = this.f2435a;
        int i = this.f2436b;
        this.f2436b = i - 1;
        return sArr[i];
    }

    /* JADX INFO: renamed from: a */
    public void m2270a(short s) {
        if (this.f2435a.length == this.f2436b + 1) {
            m2268d();
        }
        short[] sArr = this.f2435a;
        int i = this.f2436b + 1;
        this.f2436b = i;
        sArr[i] = s;
    }

    /* JADX INFO: renamed from: d */
    private void m2268d() {
        short[] sArr = this.f2435a;
        short[] sArr2 = new short[sArr.length * 2];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        this.f2435a = sArr2;
    }

    /* JADX INFO: renamed from: b */
    public short m2271b() {
        return this.f2435a[this.f2436b];
    }

    /* JADX INFO: renamed from: c */
    public void m2272c() {
        this.f2436b = -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<ShortStack vector:[");
        for (int i = 0; i < this.f2435a.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            if (i == this.f2436b) {
                sb.append(">>");
            }
            sb.append((int) this.f2435a[i]);
            if (i == this.f2436b) {
                sb.append("<<");
            }
        }
        sb.append("]>");
        return sb.toString();
    }
}
