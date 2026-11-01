package p067l;

/* JADX INFO: renamed from: l.֫֨ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: P8A8 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3782 implements InterfaceC19995 {

    /* JADX INFO: renamed from: ֫ */
    public C18534 f8100;

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ܽ */
    public final void mo7394(C17311 c17311) {
    }

    /* JADX INFO: renamed from: ֫ */
    public final C18534 m7391() {
        return this.f8100;
    }

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ֫ */
    public final void mo7392(C17311 c17311) {
        C18534 c18534 = this.f8100;
        if (c18534 != null) {
            c17311.m39277(c18534);
        }
    }

    @Override // p067l.InterfaceC19995
    /* JADX INFO: renamed from: ۧ */
    public final void mo7393(C17311 c17311) throws C10607 {
        c17311.m39276(EnumC5913.FOUR);
        int iM39280 = c17311.m39280();
        EnumC15299 enumC15299 = EnumC15299.SHARE_INFO_1_CONTAINER;
        if (iM39280 != enumC15299.m34834()) {
            throw new C10607(String.format("Expected info level %d, got: %d", Integer.valueOf(enumC15299.m34834()), Integer.valueOf(iM39280)));
        }
        int iM39281 = c17311.m39280();
        if (iM39281 == iM39280) {
            if (c17311.m39280() != 0) {
                this.f8100 = new C18534();
                return;
            } else {
                this.f8100 = null;
                return;
            }
        }
        throw new C10607(String.format("Expected info level %d to match enum level, got: %d", Integer.valueOf(iM39280), Integer.valueOf(iM39281)));
    }
}
