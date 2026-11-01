package p067l;

/* JADX INFO: renamed from: l.ۨ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I81O */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC13768 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: ᩸ */
    public final long f38924;

    EnumC13768(long j) {
        this.f38924 = j;
    }

    public long getValue() {
        return this.f38924;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC13768 m31381(long j) {
        EnumC13768[] enumC13768ArrValues = values();
        for (int i = 0; i < enumC13768ArrValues.length; i++) {
            if (enumC13768ArrValues[i].getValue() == j) {
                return enumC13768ArrValues[i];
            }
        }
        throw new IllegalArgumentException(C17588.m40051(j, "Unsupported FileSection Type "));
    }
}
