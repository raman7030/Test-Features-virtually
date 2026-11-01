package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩺᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC24502 implements InterfaceC6338 {
    public static final EnumC24502 BEFORE_ROC;
    public static final EnumC24502 ROC;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC24502[] f77518a;

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: G */
    public final /* synthetic */ long mo6949G(InterfaceC11901 interfaceC11901) {
        return AbstractC17736.m40302d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: T */
    public final /* synthetic */ Object mo6950T(C10500 c10500) {
        return AbstractC17736.m40304f(this, c10500);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean mo6951e(InterfaceC11901 interfaceC11901) {
        return AbstractC17736.m40303e(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int mo6952l(InterfaceC11901 interfaceC11901) {
        return AbstractC17736.m40301c(this, interfaceC11901);
    }

    public static EnumC24502 valueOf(String str) {
        return (EnumC24502) Enum.valueOf(EnumC24502.class, str);
    }

    public static EnumC24502[] values() {
        return (EnumC24502[]) f77518a.clone();
    }

    static {
        EnumC24502 enumC24502 = new EnumC24502("BEFORE_ROC", 0);
        BEFORE_ROC = enumC24502;
        EnumC24502 enumC24503 = new EnumC24502("ROC", 1);
        ROC = enumC24503;
        f77518a = new EnumC24502[]{enumC24502, enumC24503};
    }

    @Override // p067l.InterfaceC6338
    public final int getValue() {
        return ordinal();
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        return AbstractC7877.m18196d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(getValue(), EnumC19947.ERA);
    }
}
