package l;

/* JADX INFO: renamed from: l.᩵ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C19428 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f62848;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int[] f62849 = new int[2];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11459 f62850;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m44769(C12164 c12164) {
        this.f62850 = c12164.pattern();
        int iGroupCount = c12164.groupCount();
        this.f62848 = iGroupCount;
        int i = (iGroupCount + 1) * 2;
        if (this.f62849.length < i) {
            this.f62849 = new int[i];
        }
        for (int i2 = 0; i2 <= this.f62848; i2++) {
            int i3 = i2 * 2;
            this.f62849[i3] = c12164.start(i2);
            this.f62849[i3 + 1] = c12164.end(i2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C11459 m44770() {
        return this.f62850;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m44771() {
        return this.f62849[0];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m44768() {
        return this.f62849[1];
    }
}
