package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۧۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC12571 implements InterfaceC4524, InterfaceC5195 {
    public static final EnumC12571 APRIL;
    public static final EnumC12571 AUGUST;
    public static final EnumC12571 DECEMBER;
    public static final EnumC12571 FEBRUARY;
    public static final EnumC12571 JANUARY;
    public static final EnumC12571 JULY;
    public static final EnumC12571 JUNE;
    public static final EnumC12571 MARCH;
    public static final EnumC12571 MAY;
    public static final EnumC12571 NOVEMBER;
    public static final EnumC12571 OCTOBER;
    public static final EnumC12571 SEPTEMBER;

    /* JADX INFO: renamed from: a */
    public static final EnumC12571[] f35323a;

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ EnumC12571[] f35324b;

    public static EnumC12571 valueOf(String str) {
        return (EnumC12571) Enum.valueOf(EnumC12571.class, str);
    }

    public static EnumC12571[] values() {
        return (EnumC12571[]) f35324b.clone();
    }

    static {
        EnumC12571 enumC12571 = new EnumC12571("JANUARY", 0);
        JANUARY = enumC12571;
        EnumC12571 enumC12572 = new EnumC12571("FEBRUARY", 1);
        FEBRUARY = enumC12572;
        EnumC12571 enumC12573 = new EnumC12571("MARCH", 2);
        MARCH = enumC12573;
        EnumC12571 enumC12574 = new EnumC12571("APRIL", 3);
        APRIL = enumC12574;
        EnumC12571 enumC12575 = new EnumC12571("MAY", 4);
        MAY = enumC12575;
        EnumC12571 enumC12576 = new EnumC12571("JUNE", 5);
        JUNE = enumC12576;
        EnumC12571 enumC12577 = new EnumC12571("JULY", 6);
        JULY = enumC12577;
        EnumC12571 enumC12578 = new EnumC12571("AUGUST", 7);
        AUGUST = enumC12578;
        EnumC12571 enumC12579 = new EnumC12571("SEPTEMBER", 8);
        SEPTEMBER = enumC12579;
        EnumC12571 enumC125710 = new EnumC12571("OCTOBER", 9);
        OCTOBER = enumC125710;
        EnumC12571 enumC125711 = new EnumC12571("NOVEMBER", 10);
        NOVEMBER = enumC125711;
        EnumC12571 enumC125712 = new EnumC12571("DECEMBER", 11);
        DECEMBER = enumC125712;
        f35324b = new EnumC12571[]{enumC12571, enumC12572, enumC12573, enumC12574, enumC12575, enumC12576, enumC12577, enumC12578, enumC12579, enumC125710, enumC125711, enumC125712};
        f35323a = values();
    }

    /* JADX INFO: renamed from: Y */
    public static EnumC12571 m28960Y(int i) {
        if (i < 1 || i > 12) {
            throw new C17796("Invalid value for MonthOfYear: " + i);
        }
        return f35323a[i - 1];
    }

    public final int getValue() {
        return ordinal() + 1;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final boolean mo6951e(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 instanceof EnumC19947) {
            return interfaceC11901 == EnumC19947.MONTH_OF_YEAR;
        }
        return interfaceC11901 != null && interfaceC11901.mo3654l(this);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.MONTH_OF_YEAR) {
            return interfaceC11901.mo3657s();
        }
        return AbstractC7877.m18196d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final int mo6952l(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.MONTH_OF_YEAR) {
            return getValue();
        }
        return AbstractC7877.m18193a(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final long mo6949G(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.MONTH_OF_YEAR) {
            return getValue();
        }
        if (interfaceC11901 instanceof EnumC19947) {
            throw new C13242(AbstractC17125.m38752a("Unsupported field: ", interfaceC11901));
        }
        return interfaceC11901.mo3652C(this);
    }

    /* JADX INFO: renamed from: W */
    public final int m28962W(boolean z) {
        int i = AbstractC3853.f8297a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return z ? 29 : 28;
    }

    /* JADX INFO: renamed from: X */
    public final int m28963X() {
        int i = AbstractC3853.f8297a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    /* JADX INFO: renamed from: V */
    public final int m28961V(boolean z) {
        switch (AbstractC3853.f8297a[ordinal()]) {
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

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final Object mo6950T(C10500 c10500) {
        if (c10500 == AbstractC7877.f20680b) {
            return C10361.f28676c;
        }
        if (c10500 == AbstractC7877.f20681c) {
            return EnumC10559.MONTHS;
        }
        return AbstractC7877.m18195c(this, c10500);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        if (!AbstractC17736.m40316r(interfaceC17263).equals(C10361.f28676c)) {
            throw new C17796("Adjustment only supported on ISO date-time");
        }
        return interfaceC17263.mo7152c(getValue(), EnumC19947.MONTH_OF_YEAR);
    }
}
