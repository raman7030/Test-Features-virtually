package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۢ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC11703 implements InterfaceC6338 {

    /* JADX INFO: renamed from: BE */
    public static final EnumC11703 f32630BE;
    public static final EnumC11703 BEFORE_BE;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC11703[] f32631a;

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

    public static EnumC11703 valueOf(String str) {
        return (EnumC11703) Enum.valueOf(EnumC11703.class, str);
    }

    public static EnumC11703[] values() {
        return (EnumC11703[]) f32631a.clone();
    }

    static {
        EnumC11703 enumC11703 = new EnumC11703("BEFORE_BE", 0);
        BEFORE_BE = enumC11703;
        EnumC11703 enumC11704 = new EnumC11703("BE", 1);
        f32630BE = enumC11704;
        f32631a = new EnumC11703[]{enumC11703, enumC11704};
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
