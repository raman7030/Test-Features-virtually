package p067l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۗۤۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: I5XA */
/* JADX INFO: loaded from: classes2.dex */
public final class C5383 {

    /* JADX INFO: renamed from: ֫ */
    public static boolean f12783;

    /* JADX INFO: renamed from: ۧ */
    public static boolean f12784;

    /* JADX INFO: renamed from: ۨ۟ۛ, reason: not valid java name and contains not printable characters */
    private static final short[] f81925 = {184, 12843, 12845, 12859, 12844, 12912, 12850, 12863, 12848, 12857, 12843, 12863, 12857, 12859, 12859, 12848, 12836, 12854, 12829, 12816, 12843, 12845, 12859, 12844, 12912, 12844, 12859, 12857, 12855, 12849, 12848, 12843, 12845, 12859, 12844, 12912, 12861, 12849, 12843, 12848, 12842, 12844, 12839};

    /* JADX INFO: renamed from: ܽ */
    public static boolean f12785;

    /* JADX INFO: renamed from: ᩳ */
    public static boolean f12786;

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x0075  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0081  */
    /* JADX INFO: renamed from: ֫ */
    public static void m11770() {
        short s = f81925[0];
        if (C0845.f81821 >= 0) {
            if (!C0937.f81884) {
                if (C0917.f81868) {
                    if (!C0947.m55997()) {
                    }
                }
            }
            C0927.m55873();
        } else {
            int i = s * s;
            if (ViewOnClickListenerC0939.f81888 > 0) {
                int i2 = i + 285069456;
                if (C0845.f81821 < 0) {
                    int i3 = s + 16884;
                    int i4 = (i3 * i3) - (i2 + i2) > 0 ? 46777 : 12894;
                    String strM55773 = C0894.m55773(f81925, 1, 13, i4);
                    if (C0992.m56107() > 0) {
                        short[] sArr = f81925;
                        if (C1017.f81942 < 0) {
                            String property = System.getProperty(strM55773, C0989.m56092(sArr, 14, 2, i4));
                            if (C0917.f81868) {
                                if (!C0937.f81884) {
                                    if (C0917.f81868) {
                                        if (!C0947.m55997()) {
                                        }
                                    }
                                }
                                C0927.m55873();
                            } else {
                                short[] sArr2 = f81925;
                                if (C1012.f81938 >= 0) {
                                    if (!C0937.f81884) {
                                    }
                                    C0927.m55873();
                                } else {
                                    String strM56144 = C1012.m56144(sArr2, 16, 2, i4);
                                    boolean zM55949 = ViewOnClickListenerC0939.m55949(strM56144, property);
                                    if (C0946.f81894 == 0) {
                                        f12785 = zM55949;
                                        short[] sArr3 = f81925;
                                        if (!C0861.m55626()) {
                                            String strM56132 = C1003.m56132(sArr3, 18, 2, i4);
                                            if (!zM55949) {
                                                Locale locale = Locale.getDefault();
                                                if (C0906.m55806(strM56144, locale.getLanguage())) {
                                                    f12785 = true;
                                                    f12786 = C0906.m55806(strM56132, locale.getCountry());
                                                }
                                                f12783 = false;
                                                f12784 = false;
                                                return;
                                            }
                                            String property2 = System.getProperty(C1012.m56144(f81925, 20, 11, i4));
                                            if (property2 != null) {
                                                int iM56097 = C0989.m56097(property2, 95);
                                                if (iM56097 >= 0) {
                                                    property2 = C1404.m56454(property2, 0, iM56097);
                                                }
                                            } else {
                                                short[] sArr4 = f81925;
                                                if (C1003.f81929 > 0) {
                                                    property2 = System.getProperty(C1017.m56189(sArr4, 31, 12, i4), "");
                                                }
                                            }
                                            f12783 = true;
                                            boolean zM55806 = C0906.m55806(strM56132, property2);
                                            f12786 = zM55806;
                                            f12784 = zM55806;
                                            return;
                                        }
                                    }
                                }
                                if (C0917.f81868) {
                                    C0927.m55873();
                                } else if (!C0947.m55997()) {
                                    C0927.m55873();
                                }
                            }
                        } else if (!C0947.m55997()) {
                            C0927.m55873();
                        }
                    } else if (C0917.f81868) {
                        C0927.m55873();
                    } else if (!C0947.m55997()) {
                        C0927.m55873();
                    }
                }
            } else if (C0917.f81868) {
                C0927.m55873();
            } else if (!C0947.m55997()) {
                C0927.m55873();
            }
        }
        C1404.m56468();
    }

    static {
        m11770();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m11774() {
        return f12785;
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m11773() {
        return f12786;
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m11771() {
        return f12783;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m11772() {
        return f12784;
    }
}
