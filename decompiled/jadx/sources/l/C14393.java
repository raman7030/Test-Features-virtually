package l;

/* JADX INFO: renamed from: l.ܳ۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9QC */
/* JADX INFO: loaded from: classes3.dex */
public final class C14393 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Object m34383(AbstractC7297 abstractC7297, EnumC7132 enumC7132, EnumC17216 enumC17216) {
        switch (C9955.f30060[enumC7132.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC7297.mo19579());
            case 2:
                return Float.valueOf(abstractC7297.mo19562());
            case 3:
                return Long.valueOf(abstractC7297.mo19557());
            case 4:
                return Long.valueOf(abstractC7297.mo19578());
            case 5:
                return Integer.valueOf(abstractC7297.mo19568());
            case 6:
                return Long.valueOf(abstractC7297.mo19563());
            case 7:
                return Integer.valueOf(abstractC7297.mo19576());
            case 8:
                return Boolean.valueOf(abstractC7297.mo19571());
            case 9:
                return abstractC7297.mo19566();
            case 10:
                return Integer.valueOf(abstractC7297.mo19577());
            case 11:
                return Integer.valueOf(abstractC7297.mo19574());
            case 12:
                return Long.valueOf(abstractC7297.mo19575());
            case 13:
                return Integer.valueOf(abstractC7297.mo19550());
            case 14:
                return Long.valueOf(abstractC7297.mo19559());
            case 15:
                return enumC17216.mo27168(abstractC7297);
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
