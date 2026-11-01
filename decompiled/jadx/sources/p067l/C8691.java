package p067l;

/* JADX INFO: renamed from: l.ۜۡ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H4Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8691 {

    /* JADX INFO: renamed from: ֫ */
    public InterfaceC18749 f23506;

    /* JADX INFO: renamed from: ۧ */
    public EnumC15415 f23507;

    public C8691(InterfaceC16066 interfaceC16066, EnumC15415 enumC15415) {
        C13045.m29867(enumC15415, "initialState");
        C13045.m29861(interfaceC16066);
        this.f23506 = C17407.m39627(interfaceC16066);
        this.f23507 = enumC15415;
    }

    /* JADX INFO: renamed from: ֫ */
    public final EnumC15415 m20120() {
        return this.f23507;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20121(InterfaceC24784 interfaceC24784, EnumC24133 enumC24133) {
        EnumC15415 enumC15415M53380 = enumC24133.m53380();
        EnumC15415 enumC15415 = this.f23507;
        C13045.m29867(enumC15415, "state1");
        if (enumC15415M53380 != null && enumC15415M53380.compareTo(enumC15415) < 0) {
            enumC15415 = enumC15415M53380;
        }
        this.f23507 = enumC15415;
        this.f23506.mo4562(interfaceC24784, enumC24133);
        this.f23507 = enumC15415M53380;
    }
}
