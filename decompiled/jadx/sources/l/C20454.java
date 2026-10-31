package l;

/* JADX INFO: renamed from: l.᩶᩹ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5IF */
/* JADX INFO: loaded from: classes4.dex */
public class C20454 {
    /* JADX INFO: renamed from: ֫ */
    public AbstractC1591 mo28276(AbstractC1591 abstractC1591) {
        int i = C22570.f72976[abstractC1591.f5633.ordinal()];
        if (i == 2) {
            abstractC1591.mo5438(mo25248(abstractC1591.mo5442()));
            return abstractC1591;
        }
        if (i != 3) {
            if (i != 4) {
                return abstractC1591;
            }
            throw null;
        }
        abstractC1591.mo5440(mo25248(abstractC1591.mo5445()));
        abstractC1591.mo5443(mo25248(abstractC1591.mo5444()));
        return abstractC1591;
    }

    /* JADX INFO: renamed from: ֫ */
    public AbstractC8396 mo25248(AbstractC8396 abstractC8396) {
        int i = C22570.f72976[abstractC8396.f25747.ordinal()];
        if (i == 2) {
            abstractC8396.mo21998(mo25248(abstractC8396.mo21997()));
            return abstractC8396;
        }
        if (i == 3) {
            abstractC8396.mo2580(mo25248(abstractC8396.mo2581()));
            abstractC8396.mo2582(mo25248(abstractC8396.mo2583()));
            return abstractC8396;
        }
        if (i == 4) {
            AbstractC8396[] abstractC8396ArrMo15838 = abstractC8396.mo15838();
            for (int i2 = 0; i2 < abstractC8396ArrMo15838.length; i2++) {
                abstractC8396ArrMo15838[i2] = mo25248(abstractC8396ArrMo15838[i2]);
            }
        }
        return abstractC8396;
    }
}
