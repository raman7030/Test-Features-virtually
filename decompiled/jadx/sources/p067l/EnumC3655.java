package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֨᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3655 implements InterfaceC6338 {

    /* JADX INFO: renamed from: AH */
    public static final EnumC3655 f7677AH;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC3655[] f7678a;

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

    @Override // p067l.InterfaceC6338
    public final int getValue() {
        return 1;
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int mo6952l(InterfaceC11901 interfaceC11901) {
        return AbstractC17736.m40301c(this, interfaceC11901);
    }

    public static EnumC3655 valueOf(String str) {
        return (EnumC3655) Enum.valueOf(EnumC3655.class, str);
    }

    public static EnumC3655[] values() {
        return (EnumC3655[]) f7678a.clone();
    }

    static {
        EnumC3655 enumC3655 = new EnumC3655("AH", 0);
        f7677AH = enumC3655;
        f7678a = new EnumC3655[]{enumC3655};
    }

    @Override // p067l.InterfaceC4524
    /* JADX INFO: renamed from: n */
    public final C23970 mo6953n(InterfaceC11901 interfaceC11901) {
        if (interfaceC11901 == EnumC19947.ERA) {
            return C23970.m53119f(1L, 1L);
        }
        return AbstractC7877.m18196d(this, interfaceC11901);
    }

    @Override // p067l.InterfaceC5195
    /* JADX INFO: renamed from: s */
    public final InterfaceC17263 mo6954s(InterfaceC17263 interfaceC17263) {
        return interfaceC17263.mo7152c(1, EnumC19947.ERA);
    }
}
