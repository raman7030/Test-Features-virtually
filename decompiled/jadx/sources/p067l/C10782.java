package p067l;

/* JADX INFO: renamed from: l.ۡۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F7LT */
/* JADX INFO: loaded from: classes3.dex */
public final class C10782 implements InterfaceC6758 {

    /* JADX INFO: renamed from: ܳ */
    public static final C24812 f29874 = new C24812();

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC3669 f29875;

    /* JADX INFO: renamed from: ۧ */
    public final C10307 f29876;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f29877;

    /* JADX INFO: renamed from: ܿ */
    public final C11157 f29878;

    /* JADX INFO: renamed from: ᩳ */
    public final InterfaceC8974 f29879;

    public C10782(InterfaceC3669 interfaceC3669, C10307 c10307, C11157 c11157, InterfaceC8974 interfaceC8974, boolean z) {
        this.f29875 = interfaceC3669;
        this.f29876 = c10307;
        this.f29878 = c11157;
        this.f29879 = interfaceC8974;
        this.f29877 = z;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m24842(C17750 c17750) {
        return this.f29875.mo7075(c17750, f29874) == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10782 m24841() {
        InterfaceC3669 c18580;
        InterfaceC3669 interfaceC3669 = this.f29875;
        InterfaceC3669 interfaceC3669Mo7081 = interfaceC3669.mo7081();
        C23877.m52960(!((interfaceC3669Mo7081 instanceof C17317) || (interfaceC3669Mo7081 instanceof C14557)));
        C23877.m52959("Can't recreate wrapped extractors. Outer type: " + interfaceC3669.getClass(), interfaceC3669.mo7081() == interfaceC3669);
        if (interfaceC3669 instanceof C11769) {
            c18580 = new C11769(this.f29876.f28517, this.f29878, this.f29879, this.f29877);
        } else if (interfaceC3669 instanceof C24555) {
            c18580 = new C24555(0);
        } else if (interfaceC3669 instanceof C17849) {
            c18580 = new C17849();
        } else if (interfaceC3669 instanceof C18520) {
            c18580 = new C18520();
        } else {
            if (!(interfaceC3669 instanceof C18580)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC3669.getClass().getSimpleName()));
            }
            c18580 = new C18580(0);
        }
        return new C10782(c18580, this.f29876, this.f29878, this.f29879, this.f29877);
    }
}
