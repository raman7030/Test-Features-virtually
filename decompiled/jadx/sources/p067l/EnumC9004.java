package p067l;

/* JADX INFO: renamed from: l.ۜ᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: N67N */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC9004 {
    string,
    type,
    field,
    method,
    none;

    /* JADX INFO: renamed from: ֫ */
    public boolean m20828(AbstractC7230 abstractC7230) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return abstractC7230 instanceof C13266;
        }
        if (iOrdinal == 1) {
            return abstractC7230 instanceof C23994;
        }
        if (iOrdinal == 2) {
            return abstractC7230 instanceof C19971;
        }
        if (iOrdinal != 3) {
            return iOrdinal == 4 && abstractC7230 == null;
        }
        return abstractC7230 instanceof C23324;
    }
}
