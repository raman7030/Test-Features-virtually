package p067l;

/* JADX INFO: renamed from: l.᩸ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes.dex */
public final class C23047 {
    /* JADX INFO: renamed from: ֫ */
    public static EnumC10306 m51426(EnumC12909 enumC12909) {
        int i = C2929.f5085[enumC12909.ordinal()];
        if (i == 1) {
            return EnumC10306.METHOD;
        }
        if (i == 2) {
            return EnumC10306.CONSTRUCTOR;
        }
        throw new AssertionError("Unexpected mode: " + enumC12909);
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC10306 m51425(AbstractC7783 abstractC7783) {
        switch (C2929.f5086[abstractC7783.mo3347().ordinal()]) {
            case 1:
                return EnumC10306.PACKAGE;
            case 2:
                return EnumC10306.ENUM;
            case 3:
            case 4:
                return EnumC10306.CLASS;
            case 5:
                return EnumC10306.RECORD;
            case 6:
                return EnumC10306.INTERFACE;
            case 7:
                return EnumC10306.TYPEVAR;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return EnumC10306.VAR;
            case 14:
                return (abstractC7783.f20409 & 2305843009213693952L) != 0 ? EnumC10306.RECORD_COMPONENT : EnumC10306.VAR;
            case 15:
                return EnumC10306.CONSTRUCTOR;
            case 16:
                return EnumC10306.METHOD;
            case 17:
                return EnumC10306.STATIC_INIT;
            case 18:
                return EnumC10306.INSTANCE_INIT;
            default:
                throw new AssertionError("Unexpected kind: " + abstractC7783.mo3347());
        }
    }
}
