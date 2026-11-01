package p067l;

/* JADX INFO: renamed from: l.᩺ܶ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZB02 */
/* JADX INFO: loaded from: classes.dex */
public final class C24303 {
    /* JADX INFO: renamed from: ֫ */
    public static InterfaceC19790 m53637(AbstractC5196 abstractC5196, InterfaceC19119 interfaceC19119) {
        InterfaceC19790 interfaceC19790M12211;
        C13045.m29867(interfaceC19119, "key");
        if (interfaceC19119 instanceof AbstractC5528) {
            AbstractC5528 abstractC5528 = (AbstractC5528) interfaceC19119;
            if (!abstractC5528.m12212(abstractC5196.getKey()) || (interfaceC19790M12211 = abstractC5528.m12211(abstractC5196)) == null) {
                return null;
            }
            return interfaceC19790M12211;
        }
        C15585 c15585 = InterfaceC9551.f26257;
        if (C15585.f44521 == interfaceC19119) {
            return abstractC5196;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC16436 m53638(AbstractC5196 abstractC5196, InterfaceC19119 interfaceC19119) {
        C13045.m29867(interfaceC19119, "key");
        if (interfaceC19119 instanceof AbstractC5528) {
            AbstractC5528 abstractC5528 = (AbstractC5528) interfaceC19119;
            if (!abstractC5528.m12212(abstractC5196.getKey()) || abstractC5528.m12211(abstractC5196) == null) {
                return abstractC5196;
            }
        } else {
            C15585 c15585 = InterfaceC9551.f26257;
            if (C15585.f44521 != interfaceC19119) {
                return abstractC5196;
            }
        }
        return C25154.f80484;
    }
}
