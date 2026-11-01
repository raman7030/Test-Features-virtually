package p067l;

/* JADX INFO: renamed from: l.᩸ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC22630 implements InterfaceC5865 {
    WEEK_BASED_YEARS("WeekBasedYears", C5057.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", C5057.ofSeconds(7889238));


    /* JADX INFO: renamed from: a */
    public final String f71400a;

    /* JADX INFO: renamed from: b */
    public final C5057 f71401b;

    @Override // p067l.InterfaceC5865
    public final boolean isDurationEstimated() {
        return true;
    }

    EnumC22630(String str, C5057 c5057) {
        this.f71400a = str;
        this.f71401b = c5057;
    }

    @Override // p067l.InterfaceC5865
    public final C5057 getDuration() {
        return this.f71401b;
    }

    @Override // p067l.InterfaceC5865
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo13170m(InterfaceC17263 interfaceC17263, long j) {
        int i = AbstractC20618.f63684a[ordinal()];
        if (i == 1) {
            EnumC16593 enumC16593 = AbstractC23300.f73304c;
            return interfaceC17263.mo7152c(AbstractC24029.m53226P(interfaceC17263.mo6952l(enumC16593), j), enumC16593);
        }
        if (i == 2) {
            return interfaceC17263.mo7153d(j / 4, EnumC10559.YEARS).mo7153d((j % 4) * 3, EnumC10559.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // p067l.InterfaceC5865
    /* JADX INFO: renamed from: l */
    public final long mo13169l(InterfaceC17263 interfaceC17263, InterfaceC17263 interfaceC17264) {
        if (interfaceC17263.getClass() != interfaceC17264.getClass()) {
            return interfaceC17263.mo7155g(interfaceC17264, this);
        }
        int i = AbstractC20618.f63684a[ordinal()];
        if (i == 1) {
            EnumC16593 enumC16593 = AbstractC23300.f73304c;
            return AbstractC24029.m53228R(interfaceC17264.mo6949G(enumC16593), interfaceC17263.mo6949G(enumC16593));
        }
        if (i == 2) {
            return interfaceC17263.mo7155g(interfaceC17264, EnumC10559.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f71400a;
    }
}
