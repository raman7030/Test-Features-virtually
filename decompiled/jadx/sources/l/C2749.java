package l;

/* JADX INFO: renamed from: l.ۖ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O69P */
/* JADX INFO: loaded from: classes2.dex */
public final class C2749 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9099 f8553;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f8554;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f8555;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m8499(C2749 c2749, C1547 c1547) {
        c2749.getClass();
        c1547.m5302(c2749.f8554);
        c1547.m5304(c2749.f8555);
        c1547.m5304(C9099.m23471(c2749.f8553));
    }

    public C2749(int i, int i2, C9099 c9099) {
        this.f8554 = i;
        this.f8555 = i2;
        this.f8553 = c9099;
    }

    public C2749(C10720 c10720, C23419 c23419) {
        this.f8554 = c10720.m26904();
        this.f8555 = c10720.m26907();
        C9099 c9099 = (C9099) c23419.m51887(c10720.m26907());
        this.f8553 = c9099;
        if (c9099 == null) {
            throw new RuntimeException("Could not find the EncodedCatchHandler referenced by this TryItem");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m8500() {
        return this.f8554;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m8501() {
        return this.f8555;
    }
}
