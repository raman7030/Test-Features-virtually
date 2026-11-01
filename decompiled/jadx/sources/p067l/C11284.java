package p067l;

/* JADX INFO: renamed from: l.ۢۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C11284 implements InterfaceC19330 {

    /* JADX INFO: renamed from: ֫ */
    public final C17861 f31444 = new C17861(new byte[4], 4);

    /* JADX INFO: renamed from: ۧ */
    public final /* synthetic */ C17317 f31445;

    @Override // p067l.InterfaceC19330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24431(C11157 c11157, InterfaceC23116 interfaceC23116, C20672 c20672) {
    }

    public C11284(C17317 c17317) {
        this.f31445 = c17317;
    }

    @Override // p067l.InterfaceC19330
    /* JADX INFO: renamed from: ֫ */
    public final void mo24432(C19203 c19203) {
        C17317 c17317;
        if (c19203.m43702() == 0 && (c19203.m43702() & 128) != 0) {
            c19203.m43724(6);
            int iM43703 = c19203.m43703() / 4;
            int i = 0;
            while (true) {
                c17317 = this.f31445;
                if (i >= iM43703) {
                    break;
                }
                C17861 c17861 = this.f31444;
                c19203.m43707(0, 4, c17861.f53313);
                c17861.m40569(0);
                int iM40558 = c17861.m40558(16);
                c17861.m40566(3);
                if (iM40558 == 0) {
                    c17861.m40566(13);
                } else {
                    int iM40559 = c17861.m40558(13);
                    if (c17317.f51654.get(iM40559) == null) {
                        c17317.f51654.put(iM40559, new C18659(new C10613(c17317, iM40559)));
                        c17317.f51659++;
                    }
                }
                i++;
            }
            if (c17317.f51666 != 2) {
                c17317.f51654.remove(0);
            }
        }
    }
}
