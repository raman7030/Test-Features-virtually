package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֨᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1353 implements InterfaceC4176 {
    public static final EnumC1353 AH;
    public static final /* synthetic */ EnumC1353[] a;

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

    @Override // l.InterfaceC4176
    public final int getValue() {
        return 1;
    }

    @Override // l.InterfaceC2268
    public final /* synthetic */ int l(InterfaceC10030 interfaceC10030) {
        return AbstractC16169.c(this, interfaceC10030);
    }

    public static EnumC1353 valueOf(String str) {
        return (EnumC1353) Enum.valueOf(EnumC1353.class, str);
    }

    public static EnumC1353[] values() {
        return (EnumC1353[]) a.clone();
    }

    static {
        EnumC1353 enumC1353 = new EnumC1353("AH", 0);
        AH = enumC1353;
        a = new EnumC1353[]{enumC1353};
    }

    @Override // l.InterfaceC2268
    public final C22729 n(InterfaceC10030 interfaceC10030) {
        if (interfaceC10030 == EnumC18496.ERA) {
            return C22729.f(1L, 1L);
        }
        return AbstractC5796.d(this, interfaceC10030);
    }

    @Override // l.InterfaceC2974
    public final InterfaceC15672 s(InterfaceC15672 interfaceC15672) {
        return interfaceC15672.c(1, EnumC18496.ERA);
    }
}
