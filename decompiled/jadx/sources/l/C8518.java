package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 21AZ */
/* JADX INFO: loaded from: classes3.dex */
public class C8518 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f26036 = "identity";

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static C8518 f26035 = new C8518();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String[] f26034 = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double mo22211(double d) {
        return d;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double mo22212(double d) {
        return 1.0d;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8518 m22210(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C9224(str);
        }
        switch (str) {
            case "accelerate":
                return new C9224("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new C9224("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new C9224("cubic(1, 1, 0, 0)");
            case "standard":
                return new C9224("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Arrays.toString(f26034);
                return f26035;
        }
    }

    public final String toString() {
        return this.f26036;
    }
}
