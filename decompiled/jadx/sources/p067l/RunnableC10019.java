package p067l;

/* JADX INFO: renamed from: l.۠۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC10019 implements Runnable {

    /* JADX INFO: renamed from: ܺ۫ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f82073;

    /* JADX INFO: renamed from: ۙ */
    public final AbstractC5996 f27723;

    /* JADX INFO: renamed from: ᩶ */
    public final int f27724;

    /* JADX INFO: renamed from: ᩸ */
    public C18736 f27725;

    /* JADX INFO: renamed from: ᩹ */
    public final ServiceC10885 f27726;

    static {
        ApplicationC14266.m56479(80);
        f82073 = new short[]{1868, -10180, -11969, -15842, 21206, 21193, 21200, 21199};
    }

    @Override // java.lang.Runnable
    public native void run();

    public RunnableC10019(ServiceC10885 serviceC10885, AbstractC5996 abstractC5996, int i) {
        this.f27726 = serviceC10885;
        this.f27723 = abstractC5996;
        this.f27724 = i;
    }
}
