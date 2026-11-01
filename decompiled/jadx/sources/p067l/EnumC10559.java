package p067l;

import com.amazonaws.auth.AWS4Signer;

/* JADX INFO: renamed from: l.ۡۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10559 implements InterfaceC5865 {
    NANOS("Nanos", C5057.m10790n(1)),
    MICROS("Micros", C5057.m10790n(1000)),
    MILLIS("Millis", C5057.m10790n(1000000)),
    SECONDS("Seconds", C5057.ofSeconds(1)),
    MINUTES("Minutes", C5057.ofSeconds(60)),
    HOURS("Hours", C5057.ofSeconds(3600)),
    HALF_DAYS("HalfDays", C5057.ofSeconds(43200)),
    DAYS("Days", C5057.ofSeconds(86400)),
    WEEKS("Weeks", C5057.ofSeconds(AWS4Signer.MAX_EXPIRATION_TIME_IN_SECONDS)),
    MONTHS("Months", C5057.ofSeconds(2629746)),
    YEARS("Years", C5057.ofSeconds(31556952)),
    DECADES("Decades", C5057.ofSeconds(315569520)),
    CENTURIES("Centuries", C5057.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", C5057.ofSeconds(31556952000L)),
    ERAS("Eras", C5057.ofSeconds(31556952000000000L)),
    FOREVER("Forever", C5057.m10792s(C14849.FOREVER_NS, 999999999));


    /* JADX INFO: renamed from: a */
    public final String f29243a;

    /* JADX INFO: renamed from: b */
    public final C5057 f29244b;

    EnumC10559(String str, C5057 c5057) {
        this.f29243a = str;
        this.f29244b = c5057;
    }

    @Override // p067l.InterfaceC5865
    public final C5057 getDuration() {
        return this.f29244b;
    }

    @Override // p067l.InterfaceC5865
    public final boolean isDurationEstimated() {
        return compareTo(DAYS) >= 0;
    }

    @Override // p067l.InterfaceC5865
    /* JADX INFO: renamed from: m */
    public final InterfaceC17263 mo13170m(InterfaceC17263 interfaceC17263, long j) {
        return interfaceC17263.mo7153d(j, this);
    }

    @Override // p067l.InterfaceC5865
    /* JADX INFO: renamed from: l */
    public final long mo13169l(InterfaceC17263 interfaceC17263, InterfaceC17263 interfaceC17264) {
        return interfaceC17263.mo7155g(interfaceC17264, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f29243a;
    }
}
