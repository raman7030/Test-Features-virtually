package l;

/* JADX INFO: renamed from: l.ܿ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C17359 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C17359 f53166 = new C17359(0, false);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f53167;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f53168;

    public C17359(int i, boolean z) {
        this.f53167 = i;
        this.f53168 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17359.class != obj.getClass()) {
            return false;
        }
        C17359 c17359 = (C17359) obj;
        return this.f53167 == c17359.f53167 && this.f53168 == c17359.f53168;
    }

    public final int hashCode() {
        return (this.f53167 << 1) + (this.f53168 ? 1 : 0);
    }
}
