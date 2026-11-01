package p067l;

/* JADX INFO: renamed from: l.۫ۢ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I81G */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC14090 {
    Unknown("", 128),
    Standard("standard label", 0),
    Compressed("compressed label", 192),
    Extended("extended label", 64);


    /* JADX INFO: renamed from: ۫ */
    public static final int f39944 = 63;

    /* JADX INFO: renamed from: ۬ */
    public static final int f39945 = 192;

    /* JADX INFO: renamed from: ᩸ */
    public final String f39947;

    /* JADX INFO: renamed from: ᩹ */
    public final int f39948;

    /* JADX INFO: renamed from: ۧ */
    public static int m31993(int i) {
        return i & 63;
    }

    EnumC14090(String str, int i) {
        this.f39947 = str;
        this.f39948 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m31995() {
        return this.f39947;
    }

    /* JADX INFO: renamed from: ۧ */
    public int m31996() {
        return this.f39948;
    }

    /* JADX INFO: renamed from: ֫ */
    public static EnumC14090 m31992(int i) {
        int i2 = i & 192;
        for (EnumC14090 enumC14090 : values()) {
            if (enumC14090.f39948 == i2) {
                return enumC14090;
            }
        }
        return Unknown;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name() + " index " + m31996();
    }
}
