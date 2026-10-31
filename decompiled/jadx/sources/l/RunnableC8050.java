package l;

/* JADX INFO: renamed from: l.۠۠ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: CAJ3 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC8050 implements Runnable {

    /* JADX INFO: renamed from: ܺ۫ۧ, reason: not valid java name and contains not printable characters */
    private static final short[] f24809;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3817 f24810;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f24811;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C17222 f24812;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final ServiceC8961 f24813;

    static {
        ApplicationC12518.m30701(80);
        f24809 = new short[]{1868, -10180, -11969, -15842, 21206, 21193, 21200, 21199};
    }

    @Override // java.lang.Runnable
    public native void run();

    public RunnableC8050(ServiceC8961 serviceC8961, AbstractC3817 abstractC3817, int i) {
        this.f24813 = serviceC8961;
        this.f24810 = abstractC3817;
        this.f24811 = i;
    }
}
