package p067l;

/* JADX INFO: renamed from: l.ۧ۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 9AXU */
/* JADX INFO: loaded from: classes3.dex */
public final class C12846 {
    /* JADX INFO: renamed from: ֫ */
    public static final String m29416(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: ֫ */
    public static final String m29417(InterfaceC13575 interfaceC13575) {
        Object objM45501;
        if (interfaceC13575 instanceof C12651) {
            return interfaceC13575.toString();
        }
        try {
            objM45501 = interfaceC13575 + '@' + m29416((Object) interfaceC13575);
        } catch (Throwable th) {
            objM45501 = C20086.m45501(th);
        }
        if (C6004.m13520(objM45501) != null) {
            objM45501 = interfaceC13575.getClass().getName() + '@' + m29416((Object) interfaceC13575);
        }
        return (String) objM45501;
    }
}
