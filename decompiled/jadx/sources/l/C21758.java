package l;

/* JADX INFO: renamed from: l.᩸ᩴ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes.dex */
public final class C21758 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC8352 m49077(EnumC11091 enumC11091) {
        int i = C0590.f2311[enumC11091.ordinal()];
        if (i == 1) {
            return EnumC8352.METHOD;
        }
        if (i == 2) {
            return EnumC8352.CONSTRUCTOR;
        }
        throw new AssertionError("Unexpected mode: " + enumC11091);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC8352 m49076(AbstractC5698 abstractC5698) {
        switch (C0590.f2312[abstractC5698.mo952().ordinal()]) {
            case 1:
                return EnumC8352.PACKAGE;
            case 2:
                return EnumC8352.ENUM;
            case 3:
            case 4:
                return EnumC8352.CLASS;
            case 5:
                return EnumC8352.RECORD;
            case 6:
                return EnumC8352.INTERFACE;
            case 7:
                return EnumC8352.TYPEVAR;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return EnumC8352.VAR;
            case 14:
                return (abstractC5698.f17563 & 2305843009213693952L) != 0 ? EnumC8352.RECORD_COMPONENT : EnumC8352.VAR;
            case 15:
                return EnumC8352.CONSTRUCTOR;
            case 16:
                return EnumC8352.METHOD;
            case 17:
                return EnumC8352.STATIC_INIT;
            case 18:
                return EnumC8352.INSTANCE_INIT;
            default:
                throw new AssertionError("Unexpected kind: " + abstractC5698.mo952());
        }
    }
}
