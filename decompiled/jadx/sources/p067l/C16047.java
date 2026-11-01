package p067l;

/* JADX INFO: renamed from: l.ܳ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9QC */
/* JADX INFO: loaded from: classes3.dex */
public final class C16047 {
    /* JADX INFO: renamed from: ֫ */
    public static Object m36517(AbstractC9303 abstractC9303, EnumC9146 enumC9146, EnumC18730 enumC18730) {
        switch (C11829.f33017[enumC9146.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC9303.mo21547());
            case 2:
                return Float.valueOf(abstractC9303.mo21530());
            case 3:
                return Long.valueOf(abstractC9303.mo21525());
            case 4:
                return Long.valueOf(abstractC9303.mo21546());
            case 5:
                return Integer.valueOf(abstractC9303.mo21536());
            case 6:
                return Long.valueOf(abstractC9303.mo21531());
            case 7:
                return Integer.valueOf(abstractC9303.mo21544());
            case 8:
                return Boolean.valueOf(abstractC9303.mo21539());
            case 9:
                return abstractC9303.mo21534();
            case 10:
                return Integer.valueOf(abstractC9303.mo21545());
            case 11:
                return Integer.valueOf(abstractC9303.mo21542());
            case 12:
                return Long.valueOf(abstractC9303.mo21543());
            case 13:
                return Integer.valueOf(abstractC9303.mo21518());
            case 14:
                return Long.valueOf(abstractC9303.mo21527());
            case 15:
                return enumC18730.mo29213(abstractC9303);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
