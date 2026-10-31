package l;

/* JADX INFO: renamed from: l.ᩳ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18319 implements InterfaceC19383 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f56959;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f56960;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19714 f56958 = new C19714();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f56961 = -9223372036854775807L;

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ void mo8454(long j) {
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8453(int i, C17714 c17714) {
        c17714.m41478(i);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8457(C17714 c17714, int i, int i2) {
        c17714.m41478(i);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8456(C8353 c8353) {
        this.f56960 = true;
        this.f56958.getClass();
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final int mo8451(InterfaceC9765 interfaceC9765, int i, boolean z) {
        return this.f56958.mo8458(interfaceC9765, i, z);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ۧ */
    public final int mo8458(InterfaceC9765 interfaceC9765, int i, boolean z) {
        return this.f56958.mo8458(interfaceC9765, i, z);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8455(long j, int i, int i2, int i3, C18677 c18677) {
        if (this.f56961 != -9223372036854775807L) {
            if (c18677 == null) {
                this.f56959 = true;
            }
        } else {
            if (c18677 != null || (i & 1) == 0) {
                return;
            }
            this.f56961 = j;
        }
    }
}
