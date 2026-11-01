package p067l;

import bin.p000mt.json.JSONArray;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 077H */
/* JADX INFO: loaded from: classes4.dex */
public final class C19515 {

    /* JADX INFO: renamed from: ܶ۬ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f82298 = {2424, -26063, -26071, -26107, -26056, -26053, -26060, -26107, -26070, -26063, -26071, -25994, -26052, -26053, -26066, -26053, -26058, -26085, -26102, -26095, -26107, -26091, -26102, -26081, -26092, -26107, -26088, -26090, -26091, -26087, -26095, -26081, -26082, -26098, -26062, -26061, -26071, -25990, -26085, -26102, -26095, -25990, -26070, -26053, -26055, -26063, -26053, -26051, -26049, -25990, -26061, -26071, -25990, -26060, -26059, -26066, -25990, -26071, -26065, -26070, -26070, -26059, -26072, -26066, -26049, -26050, -25990, -26056, -26077, -25990, -26057, -26066, -26107, -26053, -26070, -26063, -26107, -26067, -26059, -26072, -26063, -26071, -26070, -26053, -26055, -26049, -26107, -26059, -26070, -26049, -26060, -25996};

    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX INFO: renamed from: ֫ */
    public static void m44346(String str) {
        short[] sArr = f82298;
        if (C1044.f81959 >= 0) {
            C1229.m56410();
        } else {
            short s = sArr[0];
            if (!C0955.f81898) {
                int i = 63288 * s;
                int i2 = s + 15822;
                if (C0906.m55809() > 0) {
                    int i3 = (i2 * i2) - i < 0 ? 26387 : 39514;
                    C19553 c19553M44409 = C19553.m44409();
                    short[] sArr2 = f82298;
                    if (C0917.m55854() && C1044.f81959 < 0) {
                        String strM44416 = c19553M44409.m44416(C0930.m55893(sArr2, 1, 10, i3));
                        short[] sArr3 = f82298;
                        if (C0877.f81843 < 0) {
                            String strM56318 = C1048.m56318(sArr3, 11, 1, i3);
                            if (C0894.f81854 < 0) {
                                if (!Arrays.asList(ViewOnClickListenerC0939.m55948(strM44416, strM56318)).contains(str)) {
                                    return;
                                }
                                String strM55993 = C0947.m55993(f82298, 12, 5, i3);
                                if (C1044.m56286() > 0) {
                                    JSONArray jSONArrayM55670 = RunnableC0871.m55670();
                                    short[] sArr4 = f82298;
                                    if (C1028.m56247() < 0) {
                                        String strM55783 = RunnableC0897.m55783(sArr4, 17, 16, i3);
                                        short[] sArr5 = f82298;
                                        if (RunnableC0897.f81856) {
                                            throw C5276.m11409(jSONArrayM55670, strM55783, C1964.m56584(sArr5, 33, 59, i3), strM55993);
                                        }
                                    } else if (C1028.m56247() < 0) {
                                        C1003.m56123();
                                        if (ServiceConnectionC1013.m56157() <= 0) {
                                            C1229.m56410();
                                        }
                                    }
                                }
                            }
                        } else if (C1028.m56247() < 0) {
                            C1003.m56123();
                            if (ServiceConnectionC1013.m56157() <= 0) {
                                C1229.m56410();
                            }
                        }
                    }
                    C1053.m56327();
                    if (C1025.m56230()) {
                        C1003.m56123();
                        if (ServiceConnectionC1013.m56157() <= 0) {
                            C1229.m56410();
                        }
                    } else {
                        C1229.m56410();
                    }
                } else {
                    C1003.m56123();
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        C1229.m56410();
                    }
                }
            } else if (C1028.m56247() < 0) {
                C1003.m56123();
                if (ServiceConnectionC1013.m56157() <= 0) {
                    C1229.m56410();
                }
            } else {
                C1053.m56327();
                if (C1025.m56230()) {
                    C1229.m56410();
                } else {
                    C1003.m56123();
                    if (ServiceConnectionC1013.m56157() <= 0) {
                        C1229.m56410();
                    }
                }
            }
        }
        C0894.m55769();
    }
}
