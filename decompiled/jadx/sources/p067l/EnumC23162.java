package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩸᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC23162 implements InterfaceC4524, InterfaceC5195 {
    public static final EnumC23162 FRIDAY;
    public static final EnumC23162 MONDAY;
    public static final EnumC23162 SATURDAY;
    public static final EnumC23162 SUNDAY;
    public static final EnumC23162 THURSDAY;
    public static final EnumC23162 TUESDAY;
    public static final EnumC23162 WEDNESDAY;

    /* JADX INFO: renamed from: a */
    public static final EnumC23162[] f72771a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC23162[] f72772b;

    public static EnumC23162 valueOf(String str) {
        return (EnumC23162) Enum.valueOf(EnumC23162.class, str);
    }

    public static EnumC23162[] values() {
        return (EnumC23162[]) f72772b.clone();
    }

    static {
        EnumC23162 enumC23162 = new EnumC23162("MONDAY", 0);
        MONDAY = enumC23162;
        EnumC23162 enumC23163 = new EnumC23162("TUESDAY", 1);
        TUESDAY = enumC23163;
        EnumC23162 enumC23164 = new EnumC23162("WEDNESDAY", 2);
        WEDNESDAY = enumC23164;
        EnumC23162 enumC23165 = new EnumC23162("THURSDAY", 3);
        THURSDAY = enumC23165;
        EnumC23162 enumC23166 = new EnumC23162("FRIDAY", 4);
        FRIDAY = enumC23166;
        EnumC23162 enumC23167 = new EnumC23162("SATURDAY", 5);
        SATURDAY = enumC23167;
        EnumC23162 enumC23168 = new EnumC23162("SUNDAY", 6);
        SUNDAY = enumC23168;
        f72772b = new EnumC23162[]{enumC23162, enumC23163, enumC23164, enumC23165, enumC23166, enumC23167, enumC23168};
        f72771a = values();
    }

    /* JADX INFO: renamed from: V */
    public static EnumC23162 m51623V(int i) {
        if (i < 1 || i > 7) {
            throw new C17796("Invalid value for DayOfWeek: " + i);
        }
        return f72771a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return interfaceC11901 == EnumC19947.DAY_OF_WEEK;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.DAY_OF_WEEK) {
            return interfaceC11901.mo3657s();
        }
        return AbstractC7877.m18196d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.DAY_OF_WEEK) {
            return getValue();
        }
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.DAY_OF_WEEK) {
            return getValue();
        }
        if (interfaceC11901 instanceof EnumC19947) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        return interfaceC11901.mo3652C(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.DAYS;
        }
        return AbstractC7877.m18195c(this, c10500);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(getValue(), EnumC19947.DAY_OF_WEEK);
    }
}
