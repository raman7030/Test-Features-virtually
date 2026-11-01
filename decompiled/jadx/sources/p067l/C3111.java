package p067l;

/* JADX INFO: renamed from: l.֨֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8CE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3111 {

    /* JADX INFO: renamed from: ֫ */
    public static double f5659;

    static {
        Math.log(10.0d);
        f5659 = 440.0d;
    }

    /* JADX INFO: renamed from: ֫ */
    public static double m5317(double d) {
        return ((Math.log(d / f5659) * 12.0d) / Math.log(2.0d)) + 69.0d;
    }

    /* JADX INFO: renamed from: ۧ */
    public static double m5318(double d) {
        return Math.pow(2.0d, (d - 69.0d) * 0.08333333333333333d) * f5659;
    }
}
