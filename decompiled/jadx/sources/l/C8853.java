package l;

/* JADX INFO: renamed from: l.ۡۨ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: F7LT */
/* JADX INFO: loaded from: classes3.dex */
public final class C8853 implements InterfaceC4619 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final C23615 f26951 = new C23615();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC1368 f26952;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C8353 f26953;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f26954;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9248 f26955;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f26956;

    public C8853(InterfaceC1368 interfaceC1368, C8353 c8353, C9248 c9248, InterfaceC6950 interfaceC6950, boolean z) {
        this.f26952 = interfaceC1368;
        this.f26953 = c8353;
        this.f26955 = c9248;
        this.f26956 = interfaceC6950;
        this.f26954 = z;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m22871(C16184 c16184) {
        return this.f26952.mo4837(c16184, f26951) == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8853 m22870() {
        InterfaceC1368 c17058;
        InterfaceC1368 interfaceC1368 = this.f26952;
        InterfaceC1368 interfaceC1368Mo4843 = interfaceC1368.mo4843();
        C22632.m50634(!((interfaceC1368Mo4843 instanceof C15729) || (interfaceC1368Mo4843 instanceof C12825)));
        C22632.m50633("Can't recreate wrapped extractors. Outer type: " + interfaceC1368.getClass(), interfaceC1368.mo4843() == interfaceC1368);
        if (interfaceC1368 instanceof C9891) {
            c17058 = new C9891(this.f26953.f25603, this.f26955, this.f26956, this.f26954);
        } else if (interfaceC1368 instanceof C23345) {
            c17058 = new C23345(0);
        } else if (interfaceC1368 instanceof C16289) {
            c17058 = new C16289();
        } else if (interfaceC1368 instanceof C16995) {
            c17058 = new C16995();
        } else {
            if (!(interfaceC1368 instanceof C17058)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: ".concat(interfaceC1368.getClass().getSimpleName()));
            }
            c17058 = new C17058(0);
        }
        return new C8853(c17058, this.f26953, this.f26955, this.f26956, this.f26954);
    }
}
