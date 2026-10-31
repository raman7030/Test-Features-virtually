package l;

/* JADX INFO: renamed from: l.᩸ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC21319 implements InterfaceC3679 {
    WEEK_BASED_YEARS("WeekBasedYears", C2828.ofSeconds(31556952)),
    QUARTER_YEARS("QuarterYears", C2828.ofSeconds(7889238));

    public final String a;
    public final C2828 b;

    @Override // l.InterfaceC3679
    public final boolean isDurationEstimated() {
        return true;
    }

    EnumC21319(String str, C2828 c2828) {
        this.a = str;
        this.b = c2828;
    }

    @Override // l.InterfaceC3679
    public final C2828 getDuration() {
        return this.b;
    }

    @Override // l.InterfaceC3679
    public final InterfaceC15672 m(InterfaceC15672 interfaceC15672, long j) {
        int i = AbstractC19202.a[ordinal()];
        if (i == 1) {
            EnumC14967 enumC14967 = AbstractC22024.c;
            return interfaceC15672.c(AbstractC22791.P(interfaceC15672.l(enumC14967), j), enumC14967);
        }
        if (i == 2) {
            return interfaceC15672.d(j / 4, EnumC8618.YEARS).d((j % 4) * 3, EnumC8618.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // l.InterfaceC3679
    public final long l(InterfaceC15672 interfaceC15672, InterfaceC15672 interfaceC15673) {
        if (interfaceC15672.getClass() != interfaceC15673.getClass()) {
            return interfaceC15672.g(interfaceC15673, this);
        }
        int i = AbstractC19202.a[ordinal()];
        if (i == 1) {
            EnumC14967 enumC14967 = AbstractC22024.c;
            return AbstractC22791.R(interfaceC15673.G(enumC14967), interfaceC15672.G(enumC14967));
        }
        if (i == 2) {
            return interfaceC15672.g(interfaceC15673, EnumC8618.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
