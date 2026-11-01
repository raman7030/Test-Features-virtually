package p067l;

/* JADX INFO: renamed from: l.ۗۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBP8 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5293 {
    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static Object m11446(InterfaceC14680 interfaceC14680, Integer num, Object obj) {
        int iIntValue = num.intValue();
        boolean zMo4793 = interfaceC14680.mo4793(iIntValue);
        Object objMo4686 = interfaceC14680.mo4686(iIntValue, obj);
        if (zMo4793) {
            return objMo4686;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۧ */
    public static Object m11448(InterfaceC14680 interfaceC14680, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        Object obj2 = interfaceC14680.get(iIntValue);
        if (obj2 != interfaceC14680.mo4687() || interfaceC14680.mo4793(iIntValue)) {
            return obj2;
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܽ */
    public static Object m11449(InterfaceC14680 interfaceC14680, Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (interfaceC14680.mo4793(iIntValue)) {
            return interfaceC14680.remove(iIntValue);
        }
        return null;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public static boolean m11447(InterfaceC14680 interfaceC14680, Object obj) {
        if (obj == null) {
            return false;
        }
        return interfaceC14680.mo4793(((Integer) obj).intValue());
    }
}
