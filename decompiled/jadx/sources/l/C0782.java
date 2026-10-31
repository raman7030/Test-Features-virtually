package l;

/* JADX INFO: renamed from: l.֨֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8CE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0782 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double f2887;

    static {
        Math.log(10.0d);
        f2887 = 440.0d;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static double m2988(double d) {
        return ((Math.log(d / f2887) * 12.0d) / Math.log(2.0d)) + 69.0d;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static double m2989(double d) {
        return Math.pow(2.0d, (d - 69.0d) * 0.08333333333333333d) * f2887;
    }
}
