package p067l;

/* JADX INFO: renamed from: l.ۖ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes2.dex */
public final class C4981 {

    /* JADX INFO: renamed from: ֫ */
    public final C11016 f11347;

    /* JADX INFO: renamed from: ۧ */
    public int f11348;

    /* JADX INFO: renamed from: ܽ */
    public int f11349;

    /* JADX INFO: renamed from: ֫ */
    public static void m10546(C4981 c4981, C3838 c3838) {
        c4981.getClass();
        c3838.m7531(c4981.f11348);
        c3838.m7533(c4981.f11349);
        c3838.m7533(C11016.m25418(c4981.f11347));
    }

    public C4981(int i, int i2, C11016 c11016) {
        this.f11348 = i;
        this.f11349 = i2;
        this.f11347 = c11016;
    }

    public C4981(C12556 c12556, C24625 c24625) {
        this.f11348 = c12556.m28944();
        this.f11349 = c12556.m28947();
        C11016 c11016 = (C11016) c24625.m54285(c12556.m28947());
        this.f11347 = c11016;
        if (c11016 == null) {
            throw new RuntimeException("Could not find the EncodedCatchHandler referenced by this TryItem");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m10547() {
        return this.f11348;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m10548() {
        return this.f11349;
    }
}
