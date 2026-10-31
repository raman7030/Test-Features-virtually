package l;

/* JADX INFO: renamed from: l.ۤۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10071 {
    public final InterfaceC2268 a;
    public final C6292 b;
    public int c;

    public C10071(InterfaceC2268 interfaceC2268, C6292 c6292) {
        InterfaceC2765 interfaceC2765 = c6292.e;
        if (interfaceC2765 != null) {
            InterfaceC2765 interfaceC2766 = (InterfaceC2765) interfaceC2268.T(AbstractC5796.b);
            AbstractC5650 abstractC5650 = (AbstractC5650) interfaceC2268.T(AbstractC5796.a);
            InterfaceC13410 interfaceC13410E = null;
            interfaceC2765 = C11003.equals(interfaceC2765, interfaceC2766) ? null : interfaceC2765;
            C11003.equals(null, abstractC5650);
            if (interfaceC2765 != null) {
                InterfaceC2765 interfaceC2767 = interfaceC2765 != null ? interfaceC2765 : interfaceC2766;
                if (interfaceC2765 != null) {
                    if (interfaceC2268.e(EnumC18496.EPOCH_DAY)) {
                        interfaceC13410E = interfaceC2767.E(interfaceC2268);
                    } else if (interfaceC2765 != C8409.c || interfaceC2766 != null) {
                        for (EnumC18496 enumC18496 : EnumC18496.values()) {
                            if (enumC18496.isDateBased() && interfaceC2268.e(enumC18496)) {
                                throw new C16232("Unable to apply override chronology '" + interfaceC2765 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + interfaceC2268);
                            }
                        }
                    }
                }
                interfaceC2268 = new C12187(interfaceC13410E, interfaceC2268, interfaceC2767, abstractC5650);
            }
        }
        this.a = interfaceC2268;
        this.b = c6292;
    }

    public final Object b(C8556 c8556) {
        InterfaceC2268 interfaceC2268 = this.a;
        Object objT = interfaceC2268.T(c8556);
        if (objT != null || this.c != 0) {
            return objT;
        }
        throw new C16232("Unable to extract " + c8556 + " from temporal " + interfaceC2268);
    }

    public final Long a(InterfaceC10030 interfaceC10030) {
        int i = this.c;
        InterfaceC2268 interfaceC2268 = this.a;
        if (i <= 0 || interfaceC2268.e(interfaceC10030)) {
            return Long.valueOf(interfaceC2268.G(interfaceC10030));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
