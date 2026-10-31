package l;

/* JADX INFO: renamed from: l.ۛۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC5856 {
    SHIZUKU,
    DHIZUKU,
    SHELL,
    SYSTEM;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC5856 m16416() {
        int iOrdinal = ordinal();
        EnumC5856[] enumC5856ArrValues = values();
        int i = iOrdinal + 1;
        if (i >= enumC5856ArrValues.length) {
            throw new RuntimeException();
        }
        return enumC5856ArrValues[i];
    }
}
