package l;

/* JADX INFO: renamed from: l.ۨ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38I8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11352 implements InterfaceC17847 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C8353 f33976;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f33977;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9248 f33978;

    public C11352(String str) {
        C1297 c1297 = new C1297();
        c1297.m4462("video/mp2t");
        c1297.m4465(str);
        this.f33976 = c1297.m4440();
    }

    @Override // l.InterfaceC17847
    /* JADX INFO: renamed from: ֫ */
    public final void mo22462(C9248 c9248, InterfaceC21830 interfaceC21830, C19259 c19259) {
        this.f33978 = c9248;
        c19259.m44443();
        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(c19259.m44445(), 5);
        this.f33977 = interfaceC19383Mo3429;
        interfaceC19383Mo3429.mo8456(this.f33976);
    }

    @Override // l.InterfaceC17847
    /* JADX INFO: renamed from: ֫ */
    public final void mo22463(C17714 c17714) {
        C22632.m50632(this.f33978);
        String str = C3603.f11424;
        long jM23733 = this.f33978.m23733();
        long jM23735 = this.f33978.m23735();
        if (jM23733 == -9223372036854775807L || jM23735 == -9223372036854775807L) {
            return;
        }
        C8353 c8353 = this.f33976;
        if (jM23735 != c8353.f25620) {
            C1297 c1297M21948 = c8353.m21948();
            c1297M21948.m4443(jM23735);
            C8353 c8353M4440 = c1297M21948.m4440();
            this.f33976 = c8353M4440;
            this.f33977.mo8456(c8353M4440);
        }
        int iM41457 = c17714.m41457();
        this.f33977.mo8453(iM41457, c17714);
        this.f33977.mo8455(jM23733, 1, iM41457, 0, null);
    }
}
