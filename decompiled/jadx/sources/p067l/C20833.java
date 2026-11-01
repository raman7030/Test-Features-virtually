package p067l;

/* JADX INFO: renamed from: l.᩵ۧܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes4.dex */
public final class C20833 {

    /* JADX INFO: renamed from: ֫ */
    public int f65461;

    /* JADX INFO: renamed from: ۧ */
    public int[] f65462 = new int[2];

    /* JADX INFO: renamed from: ܽ */
    public C13259 f65463;

    /* JADX INFO: renamed from: ֫ */
    public final void m47063(C13929 c13929) {
        this.f65463 = c13929.pattern();
        int iGroupCount = c13929.groupCount();
        this.f65461 = iGroupCount;
        int i = (iGroupCount + 1) * 2;
        if (this.f65462.length < i) {
            this.f65462 = new int[i];
        }
        for (int i2 = 0; i2 <= this.f65461; i2++) {
            int i3 = i2 * 2;
            this.f65462[i3] = c13929.start(i2);
            this.f65462[i3 + 1] = c13929.end(i2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C13259 m47064() {
        return this.f65463;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m47065() {
        return this.f65462[0];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m47062() {
        return this.f65462[1];
    }
}
