package p067l;

/* JADX INFO: renamed from: l.֫ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3839 extends C12810 {

    /* JADX INFO: renamed from: ᩳ */
    public final /* synthetic */ C11216 f8240;

    public C3839(C11216 c11216) {
        this.f8240 = c11216;
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7534(C8320 c8320, Object obj) {
        C4036 c4036 = (C4036) obj;
        AbstractC14355 abstractC14355 = c8320.f22261;
        AbstractC7783 abstractC7783 = (AbstractC7783) (abstractC14355 == null ? null : abstractC14355.mo3380(this, c4036));
        EnumC3600 enumC3600 = abstractC7783.f20405;
        if (enumC3600 == EnumC3600.f7353 || enumC3600 == EnumC3600.f7345 || enumC3600 == EnumC3600.f7347) {
            return abstractC7783;
        }
        AbstractC12224 abstractC12224 = c8320.f22259;
        EnumC3600 enumC3601 = EnumC3600.f7351;
        C11216 c11216 = this.f8240;
        if (enumC3600 == enumC3601) {
            c4036.f8851.f7517 = (C9794) abstractC7783;
            return c11216.f31180.m52661((C8320) null, c4036, (AbstractC21195) abstractC7783, abstractC12224, C17010.f50312);
        }
        c4036.f8855.f20027 = (C15828) abstractC7783;
        return c11216.f31180.m52674(c4036, abstractC7783.f20406, abstractC12224, (AbstractC21195) abstractC7783);
    }

    @Override // p067l.InterfaceC14249
    /* JADX INFO: renamed from: ֫ */
    public final Object mo7535(C9661 c9661, Object obj) {
        return this.f8240.f31180.m52662((C9661) null, (C4036) obj, c9661.f26610, C17010.f50312);
    }
}
