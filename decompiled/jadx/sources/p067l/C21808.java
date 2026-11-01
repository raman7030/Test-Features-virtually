package p067l;

/* JADX INFO: renamed from: l.᩶᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5IF */
/* JADX INFO: loaded from: classes4.dex */
public class C21808 {
    /* JADX INFO: renamed from: ֫ */
    public AbstractC3880 mo30320(AbstractC3880 abstractC3880) {
        int i = C23819.f75703[abstractC3880.f8412.ordinal()];
        if (i == 2) {
            abstractC3880.mo7668(mo27265(abstractC3880.mo7672()));
            return abstractC3880;
        }
        if (i != 3) {
            if (i != 4) {
                return abstractC3880;
            }
            throw null;
        }
        abstractC3880.mo7670(mo27265(abstractC3880.mo7675()));
        abstractC3880.mo7673(mo27265(abstractC3880.mo7674()));
        return abstractC3880;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC10348 mo27265(AbstractC10348 abstractC10348) {
        int i = C23819.f75703[abstractC10348.f28660.ordinal()];
        if (i == 2) {
            abstractC10348.mo23969(mo27265(abstractC10348.mo23968()));
            return abstractC10348;
        }
        if (i == 3) {
            abstractC10348.mo4920(mo27265(abstractC10348.mo4921()));
            abstractC10348.mo4922(mo27265(abstractC10348.mo4923()));
            return abstractC10348;
        }
        if (i == 4) {
            AbstractC10348[] abstractC10348ArrMo17753 = abstractC10348.mo17753();
            for (int i2 = 0; i2 < abstractC10348ArrMo17753.length; i2++) {
                abstractC10348ArrMo17753[i2] = mo27265(abstractC10348ArrMo17753[i2]);
            }
        }
        return abstractC10348;
    }
}
