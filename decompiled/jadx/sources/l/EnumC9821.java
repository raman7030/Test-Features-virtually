package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۢ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC9821 implements InterfaceC4176 {
    public static final EnumC9821 BE;
    public static final EnumC9821 BEFORE_BE;
    public static final /* synthetic */ EnumC9821[] a;

    @Override // l.InterfaceC2268
    public final /* synthetic */ long G(InterfaceC10030 interfaceC10030) {
        return AbstractC16169.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ Object T(C8556 c8556) {
        return AbstractC16169.f(this, c8556);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ boolean e(InterfaceC10030 interfaceC10030) {
        return AbstractC16169.e(this, interfaceC10030);
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ int l(InterfaceC10030 interfaceC10030) {
        return AbstractC16169.c(this, interfaceC10030);
    }

    public static EnumC9821 valueOf(String str) {
        return (EnumC9821) Enum.valueOf(EnumC9821.class, str);
    }

    public static EnumC9821[] values() {
        return (EnumC9821[]) a.clone();
    }

    static {
        EnumC9821 enumC9821 = new EnumC9821("BEFORE_BE", 0);
        BEFORE_BE = enumC9821;
        EnumC9821 enumC9822 = new EnumC9821("BE", 1);
        BE = enumC9822;
        a = new EnumC9821[]{enumC9821, enumC9822};
    }

    @Override // l.InterfaceC4176
    public final int getValue() {
        return ordinal();
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(getValue(), EnumC18496.ERA);
    }
}
