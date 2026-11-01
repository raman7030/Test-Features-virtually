package p067l;

/* JADX INFO: renamed from: l.᩺۬ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y9K4 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24231 {
    UNIVERSAL(0),
    APPLICATION(64),
    CONTEXT_SPECIFIC(128),
    PRIVATE(192);


    /* JADX INFO: renamed from: ᩸ */
    public int f76798;

    EnumC24231(int i) {
        this.f76798 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC24231 m53540(byte b) {
        int i = b & 192;
        for (EnumC24231 enumC24231 : values()) {
            if (enumC24231.f76798 == i) {
                return enumC24231;
            }
        }
        throw new IllegalStateException("Could not parse ASN.1 Tag Class (should be impossible)");
    }

    public int getValue() {
        return this.f76798;
    }
}
