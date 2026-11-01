package p067l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۠ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9928 implements InterfaceC15962 {
    public static final EnumC9928 INSENSITIVE;
    public static final EnumC9928 LENIENT;
    public static final EnumC9928 SENSITIVE;
    public static final EnumC9928 STRICT;

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ EnumC9928[] f27507a;

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: l */
    public final boolean mo9636l(C11940 c11940, StringBuilder sb) {
        return true;
    }

    public static EnumC9928 valueOf(String str) {
        return (EnumC9928) Enum.valueOf(EnumC9928.class, str);
    }

    public static EnumC9928[] values() {
        return (EnumC9928[]) f27507a.clone();
    }

    static {
        EnumC9928 enumC9928 = new EnumC9928("SENSITIVE", 0);
        SENSITIVE = enumC9928;
        EnumC9928 enumC9929 = new EnumC9928("INSENSITIVE", 1);
        INSENSITIVE = enumC9929;
        EnumC9928 enumC99210 = new EnumC9928("STRICT", 2);
        STRICT = enumC99210;
        EnumC9928 enumC99211 = new EnumC9928("LENIENT", 3);
        LENIENT = enumC99211;
        f27507a = new EnumC9928[]{enumC9928, enumC9929, enumC99210, enumC99211};
    }

    @Override // p067l.InterfaceC15962
    /* JADX INFO: renamed from: m */
    public final int mo9637m(C5234 c5234, CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            c5234.f12335b = true;
            return i;
        }
        if (iOrdinal == 1) {
            c5234.f12335b = false;
            return i;
        }
        if (iOrdinal == 2) {
            c5234.f12336c = true;
            return i;
        }
        if (iOrdinal != 3) {
            return i;
        }
        c5234.f12336c = false;
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
