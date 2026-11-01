package p067l;

/* JADX INFO: renamed from: l.۬ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes3.dex */
public final class C14661 {

    /* JADX INFO: renamed from: ֫ */
    public static final C16672 f41844 = new C16672("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: ۧ */
    public static final InterfaceC21152 f41845 = null;

    /* JADX INFO: renamed from: ܽ */
    public static final InterfaceC21152 f41846 = null;

    /* JADX INFO: renamed from: ᩳ */
    public static final InterfaceC21152 f41847 = null;

    /* JADX INFO: renamed from: ֫ */
    public static final Object m33526(InterfaceC16436 interfaceC16436) {
        Object objMo15730 = interfaceC16436.mo15730(0, C21368.f67365);
        C13045.m29861(objMo15730);
        return objMo15730;
    }

    /* JADX INFO: renamed from: ۧ */
    public static final Object m33528(InterfaceC16436 interfaceC16436, Object obj) {
        if (obj == null) {
            obj = m33526(interfaceC16436);
        }
        if (obj == 0) {
            return f41844;
        }
        if (obj instanceof Integer) {
            return interfaceC16436.mo15730(new C7956(interfaceC16436, ((Number) obj).intValue()), C5274.f12406);
        }
        return ((InterfaceC17519) obj).m39890(interfaceC16436);
    }

    /* JADX INFO: renamed from: ֫ */
    public static final void m33527(InterfaceC16436 interfaceC16436, Object obj) {
        if (obj == f41844) {
            return;
        }
        if (obj instanceof C7956) {
            ((C7956) obj).m18365(interfaceC16436);
            return;
        }
        Object objMo15730 = interfaceC16436.mo15730(null, C6615.f17062);
        if (objMo15730 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((InterfaceC17519) objMo15730).m39891(obj);
    }
}
