package l;

import com.amazonaws.auth.AWS4Signer;

/* JADX INFO: renamed from: l.ۡۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC8618 implements InterfaceC3679 {
    NANOS("Nanos", C2828.n(1)),
    MICROS("Micros", C2828.n(1000)),
    MILLIS("Millis", C2828.n(1000000)),
    SECONDS("Seconds", C2828.ofSeconds(1)),
    MINUTES("Minutes", C2828.ofSeconds(60)),
    HOURS("Hours", C2828.ofSeconds(3600)),
    HALF_DAYS("HalfDays", C2828.ofSeconds(43200)),
    DAYS("Days", C2828.ofSeconds(86400)),
    WEEKS("Weeks", C2828.ofSeconds(AWS4Signer.MAX_EXPIRATION_TIME_IN_SECONDS)),
    MONTHS("Months", C2828.ofSeconds(2629746)),
    YEARS("Years", C2828.ofSeconds(31556952)),
    DECADES("Decades", C2828.ofSeconds(315569520)),
    CENTURIES("Centuries", C2828.ofSeconds(3155695200L)),
    MILLENNIA("Millennia", C2828.ofSeconds(31556952000L)),
    ERAS("Eras", C2828.ofSeconds(31556952000000000L)),
    FOREVER("Forever", C2828.s(C13132.FOREVER_NS, 999999999));

    public final String a;
    public final C2828 b;

    EnumC8618(String str, C2828 c2828) {
        this.a = str;
        this.b = c2828;
    }

    @Override // l.InterfaceC3679
    public final C2828 getDuration() {
        return this.b;
    }

    @Override // l.InterfaceC3679
    public final boolean isDurationEstimated() {
        return compareTo(DAYS) >= 0;
    }

    @Override // l.InterfaceC3679
    public final InterfaceC15672 m(InterfaceC15672 interfaceC15672, long j) {
        return interfaceC15672.d(j, this);
    }

    @Override // l.InterfaceC3679
    public final long l(InterfaceC15672 interfaceC15672, InterfaceC15672 interfaceC15673) {
        return interfaceC15672.g(interfaceC15673, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
