package p067l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ֡ */
/* JADX INFO: compiled from: 21AZ */
/* JADX INFO: loaded from: classes3.dex */
public class C1265 {

    /* JADX INFO: renamed from: ֫ */
    public String f28951 = "identity";

    /* JADX INFO: renamed from: ܽ */
    public static C1265 f28950 = new C1265();

    /* JADX INFO: renamed from: ۧ */
    public static String[] f28949 = {"standard", "accelerate", "decelerate", "linear"};

    /* JADX INFO: renamed from: ֫ */
    public double mo24179(double d) {
        return d;
    }

    /* JADX INFO: renamed from: ۧ */
    public double mo24180(double d) {
        return 1.0d;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1265 m24178(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C1300(str);
        }
        switch (str) {
            case "accelerate":
                return new C1300("cubic(0.4, 0.05, 0.8, 0.7)");
            case "decelerate":
                return new C1300("cubic(0.0, 0.0, 0.2, 0.95)");
            case "linear":
                return new C1300("cubic(1, 1, 0, 0)");
            case "standard":
                return new C1300("cubic(0.4, 0.0, 0.2, 1)");
            default:
                Arrays.toString(f28949);
                return f28950;
        }
    }

    public final String toString() {
        return this.f28951;
    }
}
