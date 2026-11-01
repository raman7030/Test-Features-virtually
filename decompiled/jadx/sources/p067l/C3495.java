package p067l;

/* JADX INFO: renamed from: l.֨ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: SLZ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3495 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static Float m6247(AbstractC4917 abstractC4917, Integer num, Float f) {
        int iIntValue = num.intValue();
        boolean zMo23794 = abstractC4917.mo23794(iIntValue);
        float fMo10447 = abstractC4917.mo10447(f.floatValue(), iIntValue);
        if (zMo23794) {
            return Float.valueOf(fMo10447);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static Float m6248(AbstractC4917 abstractC4917, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        float f = abstractC4917.get(iIntValue);
        if (f != abstractC4917.mo10448() || abstractC4917.mo23794(iIntValue)) {
            return Float.valueOf(f);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static Float m6249(AbstractC4917 abstractC4917, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (abstractC4917.mo23794(iIntValue)) {
            return Float.valueOf(abstractC4917.remove(iIntValue));
        }
        return null;
    }
}
