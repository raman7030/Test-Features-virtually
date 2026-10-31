package l;

/* JADX INFO: renamed from: l.֨ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SLZ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1185 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Float m4005(AbstractC2681 abstractC2681, Integer num, Float f) {
        int iIntValue = num.intValue();
        boolean zMo21825 = abstractC2681.mo21825(iIntValue);
        float fMo8401 = abstractC2681.mo8401(f.floatValue(), iIntValue);
        if (zMo21825) {
            return Float.valueOf(fMo8401);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Float m4006(AbstractC2681 abstractC2681, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        float f = abstractC2681.get(iIntValue);
        if (f != abstractC2681.mo8402() || abstractC2681.mo21825(iIntValue)) {
            return Float.valueOf(f);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Float m4007(AbstractC2681 abstractC2681, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (abstractC2681.mo21825(iIntValue)) {
            return Float.valueOf(abstractC2681.remove(iIntValue));
        }
        return null;
    }
}
