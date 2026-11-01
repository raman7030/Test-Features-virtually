package p067l;

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
public final class EnumC21289 implements InterfaceC11901 {
    public static final EnumC21289 JULIAN_DAY;
    public static final EnumC21289 MODIFIED_JULIAN_DAY;
    public static final EnumC21289 RATA_DIE;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ EnumC21289[] f66956d;
    public static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a */
    public final transient String f66957a;

    /* JADX INFO: renamed from: b */
    public final transient C23970 f66958b;

    /* JADX INFO: renamed from: c */
    public final transient long f66959c;

    @Override // p067l.InterfaceC11901
    public final boolean isDateBased() {
        return true;
    }

    public static EnumC21289 valueOf(String str) {
        return (EnumC21289) Enum.valueOf(EnumC21289.class, str);
    }

    public static EnumC21289[] values() {
        return (EnumC21289[]) f66956d.clone();
    }

    static {
        EnumC10559 enumC10559 = EnumC10559.DAYS;
        EnumC10559 enumC105510 = EnumC10559.FOREVER;
        EnumC21289 enumC21289 = new EnumC21289("JULIAN_DAY", 0, "JulianDay", enumC10559, enumC105510, 2440588L);
        JULIAN_DAY = enumC21289;
        EnumC21289 enumC212810 = new EnumC21289("MODIFIED_JULIAN_DAY", 1, "ModifiedJulianDay", enumC10559, enumC105510, 40587L);
        MODIFIED_JULIAN_DAY = enumC212810;
        EnumC21289 enumC212811 = new EnumC21289("RATA_DIE", 2, "RataDie", enumC10559, enumC105510, 719163L);
        RATA_DIE = enumC212811;
        f66956d = new EnumC21289[]{enumC21289, enumC212810, enumC212811};
    }

    public EnumC21289(String str, int i, String str2, EnumC10559 enumC10559, EnumC10559 enumC105510, long j) {
        super(str, i);
        this.f66957a = str2;
        this.f66958b = C23970.m53119f((-365243219162L) + j, 365241780471L + j);
        this.f66959c = j;
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: G */
    public final InterfaceC17263 mo3653G(InterfaceC17263 interfaceC17263, long j) {
        if (!this.f66958b.m53125e(j)) {
            throw new C17796("Invalid value: " + this.f66957a + " " + j);
        }
        return interfaceC17263.mo7152c(AbstractC24029.m53228R(j, this.f66959c), EnumC19947.EPOCH_DAY);
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: s */
    public final C23970 mo3657s() {
        return this.f66958b;
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: l */
    public final boolean mo3654l(InterfaceC4524 interfaceC4524) {
        return interfaceC4524.mo6951e(EnumC19947.EPOCH_DAY);
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: m */
    public final C23970 mo3655m(InterfaceC4524 interfaceC4524) {
        if (interfaceC4524.mo6951e(EnumC19947.EPOCH_DAY)) {
            return this.f66958b;
        }
        throw new C17796("Unsupported field: " + this);
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: C */
    public final long mo3652C(InterfaceC4524 interfaceC4524) {
        return interfaceC4524.mo6949G(EnumC19947.EPOCH_DAY) + this.f66959c;
    }

    @Override // p067l.InterfaceC11901
    /* JADX INFO: renamed from: n */
    public final InterfaceC4524 mo3656n(Map map, C17974 c17974, EnumC18645 enumC18645) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        InterfaceC4997 interfaceC4997M40316r = AbstractC17736.m40316r(c17974);
        EnumC18645 enumC18646 = EnumC18645.LENIENT;
        long j = this.f66959c;
        if (enumC18645 == enumC18646) {
            return interfaceC4997M40316r.mo10583j(AbstractC24029.m53228R(jLongValue, j));
        }
        this.f66958b.m53122b(jLongValue, this);
        return interfaceC4997M40316r.mo10583j(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f66957a;
    }
}
