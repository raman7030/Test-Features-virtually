package p067l;

/* JADX INFO: renamed from: l.᩹ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes.dex */
public final class C23288 {

    /* JADX INFO: renamed from: ֫ */
    public static final String[] f73279 = {"B", "S", "C", "I"};

    /* JADX INFO: renamed from: ֫ */
    public static void m51868(C7726 c7726) {
        for (C22618 c22618 : new C16581(c7726).m37584()) {
            String strM50676 = c22618.m50676();
            AbstractC10348 abstractC10348 = c22618.f71372;
            if (strM50676 == null) {
                System.err.println(c22618);
            } else {
                if (abstractC10348.f28658 == EnumC3642.CONSTANT) {
                    C13761 c13761 = (C13761) abstractC10348;
                    char cCharAt = strM50676.charAt(0);
                    if (cCharAt == 'D') {
                        Object obj = c13761.f38899;
                        if (!(obj instanceof Double)) {
                            c13761.f38899 = Double.valueOf(Double.longBitsToDouble(((Number) obj).longValue()));
                        }
                    } else if (cCharAt == 'F') {
                        Object obj2 = c13761.f38899;
                        if (!(obj2 instanceof Float)) {
                            c13761.f38899 = Float.valueOf(Float.intBitsToFloat(((Number) obj2).intValue()));
                        }
                    } else if (cCharAt == 'L' || cCharAt == '[') {
                        Integer num = 0;
                        if (num.equals(c13761.f38899)) {
                            c13761.f38899 = C13761.f38898;
                        }
                        if (strM50676.equals("[F")) {
                            Object obj3 = c13761.f38899;
                            if (obj3 instanceof int[]) {
                                int[] iArr = (int[]) obj3;
                                float[] fArr = new float[iArr.length];
                                for (int i = 0; i < iArr.length; i++) {
                                    fArr[i] = Float.intBitsToFloat(iArr[i]);
                                }
                                c13761.f38899 = fArr;
                            }
                        }
                        if (strM50676.equals("[D")) {
                            Object obj4 = c13761.f38899;
                            if (obj4 instanceof long[]) {
                                long[] jArr = (long[]) obj4;
                                double[] dArr = new double[jArr.length];
                                for (int i2 = 0; i2 < jArr.length; i2++) {
                                    dArr[i2] = Double.longBitsToDouble(jArr[i2]);
                                }
                                c13761.f38899 = dArr;
                            }
                        }
                    }
                }
                abstractC10348.f28659 = strM50676;
                abstractC10348.f28661 = null;
                c22618.f71371 = null;
                c22618.f71378 = null;
                c22618.f71370 = null;
                c22618.f71375 = null;
                c22618.f71374 = null;
                c22618.f71379 = null;
            }
        }
    }
}
