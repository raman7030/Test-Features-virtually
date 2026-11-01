package p067l;

/* JADX INFO: renamed from: l.ᩴܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC20311 {
    STATIC,
    NON_STATIC,
    BOTH,
    UNDEFINED;

    /* JADX INFO: renamed from: ֫ */
    public static EnumC20311 m45860(AbstractC7783 abstractC7783) {
        return abstractC7783.mo17483() ? STATIC : NON_STATIC;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC20311 m45861(EnumC20311 enumC20311, EnumC20311 enumC20312) {
        EnumC20311 enumC20313 = UNDEFINED;
        if (enumC20311 == enumC20313) {
            return enumC20312;
        }
        return (enumC20312 == enumC20313 || enumC20311 == enumC20312) ? enumC20311 : BOTH;
    }
}
