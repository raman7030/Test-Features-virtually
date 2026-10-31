package l;

/* JADX INFO: renamed from: l.۬ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: BAYE */
/* JADX INFO: loaded from: classes3.dex */
public final class C12934 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C15050 f38800 = new C15050("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC19763 f38801 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC19763 f38802 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC19763 f38803 = null;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Object m31439(InterfaceC14801 interfaceC14801) {
        Object objMo13850 = interfaceC14801.mo13850(0, C19991.f64723);
        C11233.m27799(objMo13850);
        return objMo13850;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Object m31441(InterfaceC14801 interfaceC14801, Object obj) {
        if (obj == null) {
            obj = m31439(interfaceC14801);
        }
        if (obj == 0) {
            return f38800;
        }
        if (obj instanceof Integer) {
            return interfaceC14801.mo13850(new C5879(interfaceC14801, ((Number) obj).intValue()), C3057.f9603);
        }
        return ((InterfaceC15941) obj).m37715(interfaceC14801);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final void m31440(InterfaceC14801 interfaceC14801, Object obj) {
        if (obj == f38800) {
            return;
        }
        if (obj instanceof C5879) {
            ((C5879) obj).m16439(interfaceC14801);
            return;
        }
        Object objMo13850 = interfaceC14801.mo13850(null, C4468.f14235);
        if (objMo13850 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((InterfaceC15941) objMo13850).m37716(obj);
    }
}
