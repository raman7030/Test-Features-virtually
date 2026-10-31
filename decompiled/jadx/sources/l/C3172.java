package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۗۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5XA */
/* JADX INFO: loaded from: classes2.dex */
public final class C3172 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean f9980;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean f9981;

    /* JADX INFO: renamed from: ۨ۟ۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f9982 = {184, 12843, 12845, 12859, 12844, 12912, 12850, 12863, 12848, 12857, 12843, 12863, 12857, 12859, 12859, 12848, 12836, 12854, 12829, 12816, 12843, 12845, 12859, 12844, 12912, 12844, 12859, 12857, 12855, 12849, 12848, 12843, 12845, 12859, 12844, 12912, 12861, 12849, 12843, 12848, 12842, 12844, 12839};

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f9983;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean f9984;

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m9726() {
        short s = f9982[0];
        if (C0050.f910 >= 0) {
            if (!C1916.f6442) {
                if (C1504.f5354) {
                    if (!C2126.m7040()) {
                    }
                }
            }
            C1711.m5736();
        } else {
            int i = s * s;
            if (ViewOnClickListenerC1958.f6529 > 0) {
                int i2 = i + 285069456;
                if (C0050.f910 < 0) {
                    int i3 = s + 16884;
                    int i4 = (i3 * i3) - (i2 + i2) > 0 ? 46777 : 12894;
                    String strM3603 = C1047.m3603(f9982, 1, 13, i4);
                    if (C3019.m9255() > 0) {
                        short[] sArr = f9982;
                        if (C3537.f11231 < 0) {
                            String property = System.getProperty(strM3603, C2958.m9031(sArr, 14, 2, i4));
                            if (C1504.f5354) {
                                if (!C1916.f6442) {
                                    if (C1504.f5354) {
                                        if (!C2126.m7040()) {
                                        }
                                    }
                                }
                                C1711.m5736();
                            } else {
                                short[] sArr2 = f9982;
                                if (C3432.f10845 >= 0) {
                                    if (!C1916.f6442) {
                                    }
                                    C1711.m5736();
                                } else {
                                    String strM10488 = C3432.m10488(sArr2, 16, 2, i4);
                                    boolean zM6437 = ViewOnClickListenerC1958.m6437(strM10488, property);
                                    if (C2105.f7037 == 0) {
                                        f9983 = zM6437;
                                        short[] sArr3 = f9982;
                                        if (!C0382.m1848()) {
                                            String strM9934 = C3245.m9934(sArr3, 18, 2, i4);
                                            if (!zM6437) {
                                                Locale locale = Locale.getDefault();
                                                if (C1294.m4369(strM10488, locale.getLanguage())) {
                                                    f9983 = true;
                                                    f9984 = C1294.m4369(strM9934, locale.getCountry());
                                                }
                                                f9980 = false;
                                                f9981 = false;
                                                return;
                                            }
                                            String property2 = System.getProperty(C3432.m10488(f9982, 20, 11, i4));
                                            if (property2 != null) {
                                                int iM9036 = C2958.m9036(property2, 95);
                                                if (iM9036 >= 0) {
                                                    property2 = C11340.m28015(property2, 0, iM9036);
                                                }
                                            } else {
                                                short[] sArr4 = f9982;
                                                if (C3245.f10203 > 0) {
                                                    property2 = System.getProperty(C3537.m10748(sArr4, 31, 12, i4), "");
                                                }
                                            }
                                            f9980 = true;
                                            boolean zM4369 = C1294.m4369(strM9934, property2);
                                            f9984 = zM4369;
                                            f9981 = zM4369;
                                            return;
                                        }
                                    }
                                }
                                if (C1504.f5354) {
                                    C1711.m5736();
                                } else if (!C2126.m7040()) {
                                    C1711.m5736();
                                }
                            }
                        } else if (!C2126.m7040()) {
                            C1711.m5736();
                        }
                    } else if (C1504.f5354) {
                        C1711.m5736();
                    } else if (!C2126.m7040()) {
                        C1711.m5736();
                    }
                }
            } else if (C1504.f5354) {
                C1711.m5736();
            } else if (!C2126.m7040()) {
                C1711.m5736();
            }
        }
        C11340.m28031();
    }

    static {
        m9726();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m9730() {
        return f9983;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m9729() {
        return f9984;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m9727() {
        return f9980;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m9728() {
        return f9981;
    }
}
