package l;

/* JADX INFO: renamed from: l.᩺۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9K4 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23004 {
    UNIVERSAL(0),
    APPLICATION(64),
    CONTEXT_SPECIFIC(128),
    PRIVATE(192);


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f74059;

    EnumC23004(int i) {
        this.f74059 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC23004 m51147(byte b) {
        int i = b & 192;
        for (EnumC23004 enumC23004 : values()) {
            if (enumC23004.f74059 == i) {
                return enumC23004;
            }
        }
        throw new IllegalStateException("Could not parse ASN.1 Tag Class (should be impossible)");
    }

    public int getValue() {
        return this.f74059;
    }
}
