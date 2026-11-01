package p067l;

/* JADX INFO: renamed from: l.᩷۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AXS */
/* JADX INFO: loaded from: classes4.dex */
public final class C22234 {
    /* JADX INFO: renamed from: ֫ */
    public static final void m50071(C8548 c8548, InterfaceC13575 interfaceC13575, boolean z) {
        Object objMo19952 = c8548.mo19952();
        Throwable thMo19949 = c8548.mo19949(objMo19952);
        Object objM45501 = thMo19949 != null ? C20086.m45501(thMo19949) : c8548.mo19953(objMo19952);
        if (z) {
            C12651 c12651 = (C12651) interfaceC13575;
            AbstractC20461 abstractC20461 = c12651.f35515;
            Object obj = c12651.f35518;
            InterfaceC16436 context = abstractC20461.getContext();
            Object objM33528 = C14661.m33528(context, obj);
            C20203 c20203M51895 = objM33528 != C14661.f41844 ? C23301.m51895(abstractC20461, context) : null;
            try {
                c12651.f35515.mo10744(objM45501);
                C10027 c10027 = C10027.f27775;
                if (c20203M51895 == null) {
                    C14661.m33527(context, objM33528);
                    return;
                }
                throw null;
            } catch (Throwable th) {
                if (c20203M51895 != null) {
                    throw null;
                }
                C14661.m33527(context, objM33528);
                throw th;
            }
        }
        interfaceC13575.mo10744(objM45501);
    }
}
