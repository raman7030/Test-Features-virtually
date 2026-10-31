package l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۧۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC10735 implements InterfaceC2268, InterfaceC2974 {
    public static final EnumC10735 APRIL;
    public static final EnumC10735 AUGUST;
    public static final EnumC10735 DECEMBER;
    public static final EnumC10735 FEBRUARY;
    public static final EnumC10735 JANUARY;
    public static final EnumC10735 JULY;
    public static final EnumC10735 JUNE;
    public static final EnumC10735 MARCH;
    public static final EnumC10735 MAY;
    public static final EnumC10735 NOVEMBER;
    public static final EnumC10735 OCTOBER;
    public static final EnumC10735 SEPTEMBER;
    public static final EnumC10735[] a;
    public static final /* synthetic */ EnumC10735[] b;

    public static EnumC10735 valueOf(String str) {
        return (EnumC10735) Enum.valueOf(EnumC10735.class, str);
    }

    public static EnumC10735[] values() {
        return (EnumC10735[]) b.clone();
    }

    static {
        EnumC10735 enumC10735 = new EnumC10735("JANUARY", 0);
        JANUARY = enumC10735;
        EnumC10735 enumC10736 = new EnumC10735("FEBRUARY", 1);
        FEBRUARY = enumC10736;
        EnumC10735 enumC10737 = new EnumC10735("MARCH", 2);
        MARCH = enumC10737;
        EnumC10735 enumC10738 = new EnumC10735("APRIL", 3);
        APRIL = enumC10738;
        EnumC10735 enumC10739 = new EnumC10735("MAY", 4);
        MAY = enumC10739;
        EnumC10735 enumC107310 = new EnumC10735("JUNE", 5);
        JUNE = enumC107310;
        EnumC10735 enumC107311 = new EnumC10735("JULY", 6);
        JULY = enumC107311;
        EnumC10735 enumC107312 = new EnumC10735("AUGUST", 7);
        AUGUST = enumC107312;
        EnumC10735 enumC107313 = new EnumC10735("SEPTEMBER", 8);
        SEPTEMBER = enumC107313;
        EnumC10735 enumC107314 = new EnumC10735("OCTOBER", 9);
        OCTOBER = enumC107314;
        EnumC10735 enumC107315 = new EnumC10735("NOVEMBER", 10);
        NOVEMBER = enumC107315;
        EnumC10735 enumC107316 = new EnumC10735("DECEMBER", 11);
        DECEMBER = enumC107316;
        b = new EnumC10735[]{enumC10735, enumC10736, enumC10737, enumC10738, enumC10739, enumC107310, enumC107311, enumC107312, enumC107313, enumC107314, enumC107315, enumC107316};
        a = values();
    }

    public static EnumC10735 Y(int i) {
        if (i < 1 || i > 12) {
            throw new C16232("Invalid value for MonthOfYear: " + i);
        }
        return a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // l.InterfaceC2268
    public final boolean e(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 instanceof EnumC18496) {
            return interfaceC10030 == EnumC18496.MONTH_OF_YEAR;
        }
        return interfaceC10030 != null && interfaceC10030.l(this);
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.MONTH_OF_YEAR) {
            return interfaceC10030.s();
        }
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final int l(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.MONTH_OF_YEAR) {
            return getValue();
        }
        return AbstractC5796.a(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final long G(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.MONTH_OF_YEAR) {
            return getValue();
        }
        if (interfaceC10030 instanceof EnumC18496) {
            throw new C11441(AbstractC15526.a("Unsupported field: ", interfaceC10030));
        }
        return interfaceC10030.C(this);
    }

    public final int W(boolean z) {
        int i = AbstractC1562.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    public final int X() {
        int i = AbstractC1562.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int V(boolean z) {
        switch (AbstractC1562.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + UMErrorCode.E_UM_BE_EMPTY_URL_PATH;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    @Override // l.InterfaceC2268
    public final Object T(C8556 c8556) {
        if (c8556 == AbstractC5796.b) {
            return C8409.c;
        }
        if (c8556 == AbstractC5796.c) {
            return EnumC8618.MONTHS;
        }
        return AbstractC5796.c(this, c8556);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        if (!AbstractC16169.r(interfaceC15672).equals(C8409.c)) {
            throw new C16232("Adjustment only supported on ISO date-time");
        }
        return interfaceC15672.c(getValue(), EnumC18496.MONTH_OF_YEAR);
    }
}
