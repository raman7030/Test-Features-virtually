package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩸᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC21878 implements InterfaceC2268, InterfaceC2974 {
    public static final EnumC21878 FRIDAY;
    public static final EnumC21878 MONDAY;
    public static final EnumC21878 SATURDAY;
    public static final EnumC21878 SUNDAY;
    public static final EnumC21878 THURSDAY;
    public static final EnumC21878 TUESDAY;
    public static final EnumC21878 WEDNESDAY;
    public static final EnumC21878[] a;
    public static final /* synthetic */ EnumC21878[] b;

    public static EnumC21878 valueOf(String str) {
        return (EnumC21878) Enum.valueOf(EnumC21878.class, str);
    }

    public static EnumC21878[] values() {
        return (EnumC21878[]) b.clone();
    }

    static {
        EnumC21878 enumC21878 = new EnumC21878("MONDAY", 0);
        MONDAY = enumC21878;
        EnumC21878 enumC21879 = new EnumC21878("TUESDAY", 1);
        TUESDAY = enumC21879;
        EnumC21878 enumC218710 = new EnumC21878("WEDNESDAY", 2);
        WEDNESDAY = enumC218710;
        EnumC21878 enumC218711 = new EnumC21878("THURSDAY", 3);
        THURSDAY = enumC218711;
        EnumC21878 enumC218712 = new EnumC21878("FRIDAY", 4);
        FRIDAY = enumC218712;
        EnumC21878 enumC218713 = new EnumC21878("SATURDAY", 5);
        SATURDAY = enumC218713;
        EnumC21878 enumC218714 = new EnumC21878("SUNDAY", 6);
        SUNDAY = enumC218714;
        b = new EnumC21878[]{enumC21878, enumC21879, enumC218710, enumC218711, enumC218712, enumC218713, enumC218714};
        a = values();
    }

    public static EnumC21878 V(int i) {
        if (i < 1 || i > 7) {
            throw new C16232("Invalid value for DayOfWeek: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return interfaceC10030 == EnumC18496.DAY_OF_WEEK;
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.DAY_OF_WEEK) {
            return interfaceC10030.s();
        }
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.DAY_OF_WEEK) {
            return getValue();
        }
        return AbstractC5796.a(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.DAY_OF_WEEK) {
            return getValue();
        }
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return interfaceC10030.C(this);
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.DAYS;
        }
        return AbstractC5796.c(this, c8556);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(getValue(), EnumC18496.DAY_OF_WEEK);
    }
}
