package l;

import bin.mt.json.JSONArray;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩳۨ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 077H */
/* JADX INFO: loaded from: classes4.dex */
public final class C18041 {

    /* JADX INFO: renamed from: ܶ۬ۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f56235 = {2424, -26063, -26071, -26107, -26056, -26053, -26060, -26107, -26070, -26063, -26071, -25994, -26052, -26053, -26066, -26053, -26058, -26085, -26102, -26095, -26107, -26091, -26102, -26081, -26092, -26107, -26088, -26090, -26091, -26087, -26095, -26081, -26082, -26098, -26062, -26061, -26071, -25990, -26085, -26102, -26095, -25990, -26070, -26053, -26055, -26063, -26053, -26051, -26049, -25990, -26061, -26071, -25990, -26060, -26059, -26066, -25990, -26071, -26065, -26070, -26070, -26059, -26072, -26066, -26049, -26050, -25990, -26056, -26077, -25990, -26057, -26066, -26107, -26053, -26070, -26063, -26107, -26067, -26059, -26072, -26063, -26071, -26070, -26053, -26055, -26049, -26107, -26059, -26070, -26049, -26060, -25996};

    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m42095(String str) {
        short[] sArr = f56235;
        if (C4075.f12947 >= 0) {
            C7811.m20844();
        } else {
            short s = sArr[0];
            if (!C2272.f7362) {
                int i = 63288 * s;
                int i2 = s + 15822;
                if (C1294.m4372() > 0) {
                    int i3 = (i2 * i2) - i < 0 ? 26387 : 39514;
                    C18081 c18081M42150 = C18081.m42150();
                    short[] sArr2 = f56235;
                    if (C1504.m5179() && C4075.f12947 < 0) {
                        String strM42157 = c18081M42150.m42157(C1773.m5917(sArr2, 1, 10, i3));
                        short[] sArr3 = f56235;
                        if (C0714.f2697 < 0) {
                            String strM12578 = C4159.m12578(sArr3, 11, 1, i3);
                            if (C1047.f3863 < 0) {
                                if (!Arrays.asList(ViewOnClickListenerC1958.m6436(strM42157, strM12578)).contains(str)) {
                                    return;
                                }
                                String strM7036 = C2126.m7036(f56235, 12, 5, i3);
                                if (C4075.m12263() > 0) {
                                    JSONArray jSONArrayM2439 = RunnableC0588.m2439();
                                    short[] sArr4 = f56235;
                                    if (C3746.m11369() < 0) {
                                        String strM3789 = RunnableC1108.m3789(sArr4, 17, 16, i3);
                                        short[] sArr5 = f56235;
                                        if (RunnableC1108.f4040) {
                                            throw C3059.m9367(jSONArrayM2439, strM3789, C22628.m50602(sArr5, 33, 59, i3), strM7036);
                                        }
                                    } else if (C3746.m11369() < 0) {
                                        C3245.m9925();
                                        if (ServiceConnectionC3453.m10564() <= 0) {
                                            C7811.m20844();
                                        }
                                    }
                                }
                            }
                        } else if (C3746.m11369() < 0) {
                            C3245.m9925();
                            if (ServiceConnectionC3453.m10564() <= 0) {
                                C7811.m20844();
                            }
                        }
                    }
                    C4263.m12819();
                    if (C3683.m11222()) {
                        C3245.m9925();
                        if (ServiceConnectionC3453.m10564() <= 0) {
                            C7811.m20844();
                        }
                    } else {
                        C7811.m20844();
                    }
                } else {
                    C3245.m9925();
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        C7811.m20844();
                    }
                }
            } else if (C3746.m11369() < 0) {
                C3245.m9925();
                if (ServiceConnectionC3453.m10564() <= 0) {
                    C7811.m20844();
                }
            } else {
                C4263.m12819();
                if (C3683.m11222()) {
                    C7811.m20844();
                } else {
                    C3245.m9925();
                    if (ServiceConnectionC3453.m10564() <= 0) {
                        C7811.m20844();
                    }
                }
            }
        }
        C1047.m3599();
    }
}
