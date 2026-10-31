package l;

/* JADX INFO: renamed from: l.᩺ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB02 */
/* JADX INFO: loaded from: classes.dex */
public final class C23079 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static InterfaceC18330 m51243(AbstractC2975 abstractC2975, InterfaceC17624 interfaceC17624) {
        InterfaceC18330 interfaceC18330M10175;
        C11233.m27805(interfaceC17624, "key");
        if (interfaceC17624 instanceof AbstractC3324) {
            AbstractC3324 abstractC3324 = (AbstractC3324) interfaceC17624;
            if (!abstractC3324.m10176(abstractC2975.getKey()) || (interfaceC18330M10175 = abstractC3324.m10175(abstractC2975)) == null) {
                return null;
            }
            return interfaceC18330M10175;
        }
        C13906 c13906 = InterfaceC7557.f23344;
        if (C13906.f41439 == interfaceC17624) {
            return abstractC2975;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC14801 m51244(AbstractC2975 abstractC2975, InterfaceC17624 interfaceC17624) {
        C11233.m27805(interfaceC17624, "key");
        if (interfaceC17624 instanceof AbstractC3324) {
            AbstractC3324 abstractC3324 = (AbstractC3324) interfaceC17624;
            if (!abstractC3324.m10176(abstractC2975.getKey()) || abstractC3324.m10175(abstractC2975) == null) {
                return abstractC2975;
            }
        } else {
            C13906 c13906 = InterfaceC7557.f23344;
            if (C13906.f41439 != interfaceC17624) {
                return abstractC2975;
            }
        }
        return C23974.f77731;
    }
}
