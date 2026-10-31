package l;

import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'JULIAN_DAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.᩶ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC19908 implements InterfaceC10030 {
    public static final EnumC19908 JULIAN_DAY;
    public static final EnumC19908 MODIFIED_JULIAN_DAY;
    public static final EnumC19908 RATA_DIE;
    public static final /* synthetic */ EnumC19908[] d;
    public static final long serialVersionUID = -7501623920830201812L;
    public final transient String a;
    public final transient C22729 b;
    public final transient long c;

    @Override // l.InterfaceC10030
    public final boolean isDateBased() {
        return true;
    }

    public static EnumC19908 valueOf(String str) {
        return (EnumC19908) Enum.valueOf(EnumC19908.class, str);
    }

    public static EnumC19908[] values() {
        return (EnumC19908[]) d.clone();
    }

    static {
        EnumC8618 enumC8618 = EnumC8618.DAYS;
        EnumC8618 enumC8619 = EnumC8618.FOREVER;
        EnumC19908 enumC19908 = new EnumC19908("JULIAN_DAY", 0, "JulianDay", enumC8618, enumC8619, 2440588L);
        JULIAN_DAY = enumC19908;
        EnumC19908 enumC19909 = new EnumC19908("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", enumC8618, enumC8619, 40587L);
        MODIFIED_JULIAN_DAY = enumC19909;
        EnumC19908 enumC199010 = new EnumC19908("RATA_DIE", 2, "RataDie", enumC8618, enumC8619, 719163L);
        RATA_DIE = enumC199010;
        d = new EnumC19908[]{enumC19908, enumC19909, enumC199010};
    }

    public EnumC19908(String str, int i, String str2, EnumC8618 enumC8618, EnumC8618 enumC8619, long j) {
        super(str, i);
        this.a = str2;
        this.b = C22729.f((-365243219162L) + j, 365241780471L + j);
        this.c = j;
    }

    @Override // l.InterfaceC10030
    public final InterfaceC15672 G(InterfaceC15672 interfaceC15672, long j) {
        if (!this.b.e(j)) {
            throw new C16232("Invalid value: " + this.a + " " + j);
        }
        return interfaceC15672.c(AbstractC22791.R(j, this.c), EnumC18496.EPOCH_DAY);
    }

    @Override // l.InterfaceC10030
    public final C22729 s() {
        return this.b;
    }

    @Override // l.InterfaceC10030
    public final boolean l(InterfaceC2268 interfaceC2268) {
        return interfaceC2268.e(EnumC18496.EPOCH_DAY);
    }

    @Override // l.InterfaceC10030
    public final C22729 m(InterfaceC2268 interfaceC2268) {
        if (interfaceC2268.e(EnumC18496.EPOCH_DAY)) {
            return this.b;
        }
        throw new C16232("Unsupported field: " + this);
    }

    @Override // l.InterfaceC10030
    public final long C(InterfaceC2268 interfaceC2268) {
        return interfaceC2268.G(EnumC18496.EPOCH_DAY) + this.c;
    }

    @Override // l.InterfaceC10030
    public final InterfaceC2268 n(Map map, C16420 c16420, EnumC17126 enumC17126) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        InterfaceC2765 interfaceC2765R = AbstractC16169.r(c16420);
        EnumC17126 enumC17127 = EnumC17126.LENIENT;
        long j = this.c;
        if (enumC17126 == enumC17127) {
            return interfaceC2765R.j(AbstractC22791.R(jLongValue, j));
        }
        this.b.b(jLongValue, this);
        return interfaceC2765R.j(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
