package p067l;

/* JADX INFO: renamed from: l.ܿۘܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes4.dex */
public final class C18623 {

    /* JADX INFO: renamed from: ֫ */
    public final C13221 f55599;

    /* JADX INFO: renamed from: ۖ */
    public final Object f55600;

    /* JADX INFO: renamed from: ۘ */
    public final long f55601;

    /* JADX INFO: renamed from: ۜ */
    public final C19294 f55602;

    /* JADX INFO: renamed from: ۡ */
    public final int f55603;

    /* JADX INFO: renamed from: ۢ */
    public final C16611 f55604;

    /* JADX INFO: renamed from: ۧ */
    public final C12391 f55605;

    /* JADX INFO: renamed from: ܳ */
    public final long f55606;

    /* JADX INFO: renamed from: ܺ */
    public final int f55607;

    /* JADX INFO: renamed from: ܽ */
    public final C17952 f55608;

    /* JADX INFO: renamed from: ܿ */
    public final int f55609;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f55610;

    /* JADX INFO: renamed from: ᩷ */
    public final C24320 f55611;

    /* JADX INFO: renamed from: ᩻ */
    public final C21977 f55612;

    public C18623(C21977 c21977, long j, C24320 c24320, Object obj, long j2, int i, int i2, int i3, C17952 c17952, C13221 c13221, C12391 c12391, C16611 c16611, C19294 c19294) {
        this.f55612 = c21977;
        this.f55606 = j;
        this.f55611 = c24320;
        this.f55600 = obj;
        this.f55601 = j2;
        this.f55607 = i;
        this.f55603 = i2;
        this.f55609 = i3;
        this.f55608 = c17952;
        this.f55599 = c13221;
        this.f55605 = c12391;
        this.f55604 = c16611;
        this.f55602 = c19294;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m42372(C18623 c18623, C21977 c21977) {
        synchronized (c18623) {
            if (c18623.f55612 != c21977) {
                throw new IllegalArgumentException("Syntax window request belongs to another session");
            }
            if (c18623.f55610) {
                throw new IllegalStateException("Syntax window request was already constructed");
            }
            c18623.f55610 = true;
        }
    }
}
