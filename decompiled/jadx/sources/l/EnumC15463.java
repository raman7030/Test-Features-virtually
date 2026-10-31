package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܶ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC15463 implements InterfaceC4176 {
    public static final EnumC15463 BCE;
    public static final EnumC15463 CE;
    public static final /* synthetic */ EnumC15463[] a;

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

    public static EnumC15463 valueOf(String str) {
        return (EnumC15463) Enum.valueOf(EnumC15463.class, str);
    }

    public static EnumC15463[] values() {
        return (EnumC15463[]) a.clone();
    }

    static {
        EnumC15463 enumC15463 = new EnumC15463("BCE", 0);
        BCE = enumC15463;
        EnumC15463 enumC15464 = new EnumC15463("CE", 1);
        CE = enumC15464;
        a = new EnumC15463[]{enumC15463, enumC15464};
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
