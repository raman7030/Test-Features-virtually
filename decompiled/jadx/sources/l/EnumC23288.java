package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩺᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC23288 implements InterfaceC4176 {
    public static final EnumC23288 BEFORE_ROC;
    public static final EnumC23288 ROC;
    public static final /* synthetic */ EnumC23288[] a;

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

    public static EnumC23288 valueOf(String str) {
        return (EnumC23288) Enum.valueOf(EnumC23288.class, str);
    }

    public static EnumC23288[] values() {
        return (EnumC23288[]) a.clone();
    }

    static {
        EnumC23288 enumC23288 = new EnumC23288("BEFORE_ROC", 0);
        BEFORE_ROC = enumC23288;
        EnumC23288 enumC23289 = new EnumC23288("ROC", 1);
        ROC = enumC23289;
        a = new EnumC23288[]{enumC23288, enumC23289};
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
