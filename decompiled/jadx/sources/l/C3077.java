package l;

/* JADX INFO: renamed from: l.ۗۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBP8 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3077 {
    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m9404(InterfaceC12954 interfaceC12954, Integer num, Object obj) {
        int iIntValue = num.intValue();
        boolean zMo2422 = interfaceC12954.mo2422(iIntValue);
        Object objMo2318 = interfaceC12954.mo2318(iIntValue, obj);
        if (zMo2422) {
            return objMo2318;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Object m9406(InterfaceC12954 interfaceC12954, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = interfaceC12954.get(iIntValue);
        if (obj2 != interfaceC12954.mo2319() || interfaceC12954.mo2422(iIntValue)) {
            return obj2;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Object m9407(InterfaceC12954 interfaceC12954, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (interfaceC12954.mo2422(iIntValue)) {
            return interfaceC12954.remove(iIntValue);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m9405(InterfaceC12954 interfaceC12954, Object obj) {
        if (obj == null) {
            return false;
        }
        return interfaceC12954.mo2422(((Integer) obj).intValue());
    }
}
