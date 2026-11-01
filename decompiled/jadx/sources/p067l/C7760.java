package p067l;

/* JADX INFO: renamed from: l.ۚ᩺᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: U1FZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C7760 extends Exception {

    /* JADX INFO: renamed from: ᩶ */
    public String f20359;

    /* JADX INFO: renamed from: ᩸ */
    public final int f20360;

    /* JADX INFO: renamed from: ᩹ */
    public final int f20361;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7760(String str, C3870 c3870) {
        StringBuilder sbM21133 = C9179.m21133(str, ": ");
        sbM21133.append(c3870.getMessage());
        super(sbM21133.toString(), c3870);
        this.f20359 = str;
        this.f20361 = c3870.m7629().m40851();
        this.f20360 = c3870.m7629().m40842() - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m17914() {
        return this.f20359;
    }
}
