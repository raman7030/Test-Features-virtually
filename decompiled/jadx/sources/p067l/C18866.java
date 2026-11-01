package p067l;

/* JADX INFO: renamed from: l.ܿ۬֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H8UA */
/* JADX INFO: loaded from: classes4.dex */
public final class C18866 {

    /* JADX INFO: renamed from: ܽ */
    public static final C18866 f56350 = new C18866(0, false);

    /* JADX INFO: renamed from: ֫ */
    public final int f56351;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f56352;

    public C18866(int i, boolean z) {
        this.f56351 = i;
        this.f56352 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18866.class != obj.getClass()) {
            return false;
        }
        C18866 c18866 = (C18866) obj;
        return this.f56351 == c18866.f56351 && this.f56352 == c18866.f56352;
    }

    public final int hashCode() {
        return (this.f56351 << 1) + (this.f56352 ? 1 : 0);
    }
}
