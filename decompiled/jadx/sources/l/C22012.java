package l;

/* JADX INFO: renamed from: l.᩹ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K608 */
/* JADX INFO: loaded from: classes.dex */
public final class C22012 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final String[] f70566 = {"B", "S", "C", "I"};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m49532(C5637 c5637) {
        for (C21307 c21307 : new C14955(c5637).m35432()) {
            String strM48341 = c21307.m48341();
            AbstractC8396 abstractC8396 = c21307.f68681;
            if (strM48341 == null) {
                System.err.println(c21307);
            } else {
                if (abstractC8396.f25745 == EnumC1340.CONSTANT) {
                    C11987 c11987 = (C11987) abstractC8396;
                    char cCharAt = strM48341.charAt(0);
                    if (cCharAt == 'D') {
                        Object obj = c11987.f35889;
                        if (!(obj instanceof Double)) {
                            c11987.f35889 = Double.valueOf(Double.longBitsToDouble(((Number) obj).longValue()));
                        }
                    } else if (cCharAt == 'F') {
                        Object obj2 = c11987.f35889;
                        if (!(obj2 instanceof Float)) {
                            c11987.f35889 = Float.valueOf(Float.intBitsToFloat(((Number) obj2).intValue()));
                        }
                    } else if (cCharAt == 'L' || cCharAt == '[') {
                        Integer num = 0;
                        if (num.equals(c11987.f35889)) {
                            c11987.f35889 = C11987.f35888;
                        }
                        if (strM48341.equals("[F")) {
                            Object obj3 = c11987.f35889;
                            if (obj3 instanceof int[]) {
                                int[] iArr = (int[]) obj3;
                                float[] fArr = new float[iArr.length];
                                for (int i = 0; i < iArr.length; i++) {
                                    fArr[i] = Float.intBitsToFloat(iArr[i]);
                                }
                                c11987.f35889 = fArr;
                            }
                        }
                        if (strM48341.equals("[D")) {
                            Object obj4 = c11987.f35889;
                            if (obj4 instanceof long[]) {
                                long[] jArr = (long[]) obj4;
                                double[] dArr = new double[jArr.length];
                                for (int i2 = 0; i2 < jArr.length; i2++) {
                                    dArr[i2] = Double.longBitsToDouble(jArr[i2]);
                                }
                                c11987.f35889 = dArr;
                            }
                        }
                    }
                }
                abstractC8396.f25746 = strM48341;
                abstractC8396.f25748 = null;
                c21307.f68680 = null;
                c21307.f68687 = null;
                c21307.f68679 = null;
                c21307.f68684 = null;
                c21307.f68683 = null;
                c21307.f68688 = null;
            }
        }
    }
}
