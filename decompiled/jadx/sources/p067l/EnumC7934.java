package p067l;

/* JADX INFO: renamed from: l.ۛۚܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: LAQJ */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC7934 {
    SHIZUKU,
    DHIZUKU,
    SHELL,
    SYSTEM;

    /* JADX INFO: renamed from: ֫ */
    public EnumC7934 m18341() {
        int iOrdinal = ordinal();
        EnumC7934[] enumC7934ArrValues = values();
        int i = iOrdinal + 1;
        if (i >= enumC7934ArrValues.length) {
            throw new RuntimeException();
        }
        return enumC7934ArrValues[i];
    }
}
