package l;

/* JADX INFO: renamed from: l.ܰܿܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3BHK */
/* JADX INFO: loaded from: classes3.dex */
public final class C13964 implements Comparable {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12512 f41674;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C21480 f41675;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f41676;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC23137 f41677;

    public C13964(int i, EnumC23137 enumC23137, C21480 c21480) {
        if (i < 0) {
            throw new IllegalArgumentException("address < 0");
        }
        if (enumC23137 == null) {
            throw new NullPointerException("disposition == null");
        }
        try {
            if (c21480.m48653() == null) {
                throw new NullPointerException("spec.getLocalItem() == null");
            }
            this.f41676 = i;
            this.f41677 = enumC23137;
            this.f41675 = c21480;
            this.f41674 = C12512.m30694(c21480.getType());
        } catch (NullPointerException unused) {
            throw new NullPointerException("spec == null");
        }
    }

    public final String toString() {
        return Integer.toHexString(this.f41676) + " " + this.f41677 + " " + this.f41675;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C13964) && compareTo((C13964) obj) == 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C13964 c13964) {
        int i = c13964.f41676;
        int i2 = this.f41676;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        boolean zM33422 = m33422();
        if (zM33422 != c13964.m33422()) {
            return zM33422 ? 1 : -1;
        }
        return this.f41675.compareTo(c13964.f41675);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m33415() {
        return this.f41676;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC23137 m33419() {
        return this.f41677;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m33422() {
        return this.f41677 == EnumC23137.START;
    }

    public final C13217 getName() {
        return this.f41675.m48653().getName();
    }

    public final C13217 getSignature() {
        return this.f41675.m48653().getSignature();
    }

    public final C12512 getType() {
        return this.f41674;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m33421() {
        return this.f41675.m48652();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C21480 m33423() {
        return this.f41675;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m33418(C21480 c21480) {
        return this.f41675.m48647(c21480);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m33420(C13964 c13964) {
        return this.f41675.m48647(c13964.f41675);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13964 m33417(EnumC23137 enumC23137) {
        return enumC23137 == this.f41677 ? this : new C13964(this.f41676, enumC23137, this.f41675);
    }
}
