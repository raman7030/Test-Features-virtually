package l;

/* JADX INFO: renamed from: l.ᩴܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC18879 {
    STATIC,
    NON_STATIC,
    BOTH,
    UNDEFINED;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC18879 m43594(AbstractC5698 abstractC5698) {
        return abstractC5698.mo15572() ? STATIC : NON_STATIC;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC18879 m43595(EnumC18879 enumC18879, EnumC18879 enumC188710) {
        EnumC18879 enumC188711 = UNDEFINED;
        if (enumC18879 == enumC188711) {
            return enumC188710;
        }
        return (enumC188710 == enumC188711 || enumC18879 == enumC188710) ? enumC18879 : BOTH;
    }
}
