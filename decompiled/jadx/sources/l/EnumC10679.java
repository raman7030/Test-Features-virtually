package l;

/* JADX INFO: renamed from: l.ۧ֫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7EB */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC10679 {
    ARRAY(0),
    INNER_TYPE(1),
    WILDCARD(2),
    TYPE_ARGUMENT(3);


    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final int f32148 = 3;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f32152;

    EnumC10679(int i) {
        this.f32152 = i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int m26809() {
        return this.f32152;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m26808() {
        return toString();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static EnumC10679 m26806(String str) {
        for (EnumC10679 enumC10679 : values()) {
            if (enumC10679.m26808().equals(str)) {
                return enumC10679;
            }
        }
        return null;
    }
}
