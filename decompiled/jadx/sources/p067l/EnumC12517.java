package p067l;

/* JADX INFO: renamed from: l.ۧ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC12517 {
    ARRAY(0),
    INNER_TYPE(1),
    WILDCARD(2),
    TYPE_ARGUMENT(3);


    /* JADX INFO: renamed from: ۫ */
    public static final int f35119 = 3;

    /* JADX INFO: renamed from: ᩸ */
    public final int f35123;

    EnumC12517(int i) {
        this.f35123 = i;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m28848() {
        return this.f35123;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m28847() {
        return toString();
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC12517 m28845(String str) {
        for (EnumC12517 enumC12517 : values()) {
            if (enumC12517.m28847().equals(str)) {
                return enumC12517;
            }
        }
        return null;
    }
}
