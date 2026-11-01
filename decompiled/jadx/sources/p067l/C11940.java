package p067l;

/* JADX INFO: renamed from: l.ۤۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11940 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4524 f33253a;

    /* JADX INFO: renamed from: b */
    public final C8349 f33254b;

    /* JADX INFO: renamed from: c */
    public int f33255c;

    public C11940(InterfaceC4524 interfaceC4524, C8349 c8349) {
        InterfaceC4997 interfaceC4997 = c8349.f22325e;
        if (interfaceC4997 != null) {
            InterfaceC4997 interfaceC4998 = (InterfaceC4997) interfaceC4524.mo6950T(AbstractC7877.f20680b);
            AbstractC7739 abstractC7739 = (AbstractC7739) interfaceC4524.mo6950T(AbstractC7877.f20679a);
            InterfaceC15114 interfaceC15114Mo10577E = null;
            interfaceC4997 = C12826.equals(interfaceC4997, interfaceC4998) ? null : interfaceC4997;
            C12826.equals(null, abstractC7739);
            if (interfaceC4997 != null) {
                InterfaceC4997 interfaceC4999 = interfaceC4997 != null ? interfaceC4997 : interfaceC4998;
                if (interfaceC4997 != null) {
                    if (interfaceC4524.mo6951e(EnumC19947.EPOCH_DAY)) {
                        interfaceC15114Mo10577E = interfaceC4999.mo10577E(interfaceC4524);
                    } else if (interfaceC4997 != C10361.f28676c || interfaceC4998 != null) {
                        for (EnumC19947 enumC19947 : EnumC19947.values()) {
                            if (enumC19947.isDateBased() && interfaceC4524.mo6951e(enumC19947)) {
                                throw new C17796("Unable to apply override chronology '" + interfaceC4997 + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + interfaceC4524);
                            }
                        }
                    }
                }
                interfaceC4524 = new C13951(interfaceC15114Mo10577E, interfaceC4524, interfaceC4999, abstractC7739);
            }
        }
        this.f33253a = interfaceC4524;
        this.f33254b = c8349;
    }

    /* JADX INFO: renamed from: b */
    public final Object m27303b(C10500 c10500) {
        InterfaceC4524 interfaceC4524 = this.f33253a;
        Object objMo6950T = interfaceC4524.mo6950T(c10500);
        if (objMo6950T != null || this.f33255c != 0) {
            return objMo6950T;
        }
        throw new C17796("Unable to extract " + c10500 + " from temporal " + interfaceC4524);
    }

    /* JADX INFO: renamed from: a */
    public final Long m27302a(InterfaceC11901 interfaceC11901) {
        int i = this.f33255c;
        InterfaceC4524 interfaceC4524 = this.f33253a;
        if (i <= 0 || interfaceC4524.mo6951e(interfaceC11901)) {
            return Long.valueOf(interfaceC4524.mo6949G(interfaceC11901));
        }
        return null;
    }

    public final String toString() {
        return this.f33253a.toString();
    }
}
