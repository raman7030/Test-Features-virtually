package p067l;

/* JADX INFO: renamed from: l.ᩳ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AY8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19551 {

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC18880 f59522;

    /* JADX INFO: renamed from: ֫ */
    public static final InterfaceC18880 m44399() {
        return f59522;
    }

    static {
        AbstractC22885 abstractC22885;
        String strM50817 = C22709.m50817("kotlinx.coroutines.main.delay");
        if (!(strM50817 != null ? Boolean.parseBoolean(strM50817) : false)) {
            abstractC22885 = RunnableC18209.f54356;
        } else {
            int i = C11505.f32105;
            AbstractC22885 abstractC22886 = C5945.f14659;
            abstractC22886.getClass();
            abstractC22885 = !(abstractC22886 instanceof InterfaceC18880) ? RunnableC18209.f54356 : abstractC22886;
        }
        f59522 = abstractC22885;
    }
}
