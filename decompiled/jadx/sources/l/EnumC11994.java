package l;

/* JADX INFO: renamed from: l.ۨ᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: I81O */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC11994 {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f35914;

    EnumC11994(long j) {
        this.f35914 = j;
    }

    public long getValue() {
        return this.f35914;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC11994 m29326(long j) {
        EnumC11994[] enumC11994ArrValues = values();
        for (int i = 0; i < enumC11994ArrValues.length; i++) {
            if (enumC11994ArrValues[i].getValue() == j) {
                return enumC11994ArrValues[i];
            }
        }
        throw new IllegalArgumentException(C16014.m37865(j, "Unsupported FileSection Type "));
    }
}
