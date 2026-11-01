package p067l;

/* JADX INFO: renamed from: l.ᩳ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19779 implements InterfaceC20790 {

    /* JADX INFO: renamed from: ۧ */
    public boolean f60177;

    /* JADX INFO: renamed from: ܽ */
    public boolean f60178;

    /* JADX INFO: renamed from: ֫ */
    public final C21105 f60176 = new C21105();

    /* JADX INFO: renamed from: ᩳ */
    public long f60179 = -9223372036854775807L;

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo10501(long j) {
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10500(int i, C19203 c19203) {
        c19203.m43724(i);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10504(C19203 c19203, int i, int i2) {
        c19203.m43724(i);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10503(C10307 c10307) {
        this.f60178 = true;
        this.f60176.getClass();
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final int mo10498(InterfaceC11649 interfaceC11649, int i, boolean z) {
        return this.f60176.mo10505(interfaceC11649, i, z);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ۧ */
    public final int mo10505(InterfaceC11649 interfaceC11649, int i, boolean z) {
        return this.f60176.mo10505(interfaceC11649, i, z);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10502(long j, int i, int i2, int i3, C20119 c20119) {
        if (this.f60179 != -9223372036854775807L) {
            if (c20119 == null) {
                this.f60177 = true;
            }
        } else {
            if (c20119 != null || (i & 1) == 0) {
                return;
            }
            this.f60179 = j;
        }
    }
}
