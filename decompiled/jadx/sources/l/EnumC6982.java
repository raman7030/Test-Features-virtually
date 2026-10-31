package l;

/* JADX INFO: renamed from: l.ۜ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N67N */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC6982 {
    string,
    type,
    field,
    method,
    none;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m18874(AbstractC5116 abstractC5116) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return abstractC5116 instanceof C11467;
        }
        if (iOrdinal == 1) {
            return abstractC5116 instanceof C22755;
        }
        if (iOrdinal == 2) {
            return abstractC5116 instanceof C18522;
        }
        if (iOrdinal != 3) {
            return iOrdinal == 4 && abstractC5116 == null;
        }
        return abstractC5116 instanceof C22050;
    }
}
