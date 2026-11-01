package p067l;

/* JADX INFO: renamed from: l.᩷ۙۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T91K */
/* JADX INFO: loaded from: classes5.dex */
public final class C21987 implements InterfaceC6996 {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p067l.InterfaceC6996
    /* JADX INFO: renamed from: ֫ */
    public final void mo3729(InterfaceC5655 interfaceC5655, AbstractC2555 abstractC2555) {
        boolean zM45366;
        C22673 c22673 = (C22673) abstractC2555;
        AbstractC13147 abstractC13147Mo3768 = c22673.mo3768();
        if (abstractC13147Mo3768 != null) {
            AbstractC2555 abstractC2555Mo3768 = abstractC13147Mo3768.mo3768();
            if (abstractC2555Mo3768 instanceof AbstractC19991) {
                zM45366 = ((AbstractC19991) abstractC2555Mo3768).m45366();
            } else {
                zM45366 = false;
            }
        } else {
            zM45366 = false;
        }
        if (!zM45366) {
            interfaceC5655.mo12600(c22673);
        }
        int length = interfaceC5655.length();
        interfaceC5655.mo12594(c22673);
        AbstractC6564.f16934.m31139(interfaceC5655.mo12591(), Boolean.valueOf(zM45366));
        interfaceC5655.mo12593(c22673, length);
        if (zM45366) {
            return;
        }
        interfaceC5655.mo12598(c22673);
    }
}
