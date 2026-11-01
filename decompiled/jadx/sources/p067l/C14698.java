package p067l;

/* JADX INFO: renamed from: l.۬۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C14698 {

    /* JADX INFO: renamed from: ֫ */
    public int f41922;

    /* JADX INFO: renamed from: ۧ */
    public int f41923;

    static {
        new C14698();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14698.class == obj.getClass()) {
            C14698 c14698 = (C14698) obj;
            if (this.f41923 == c14698.f41923 && this.f41922 == c14698.f41922) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f41923), Integer.valueOf(this.f41922));
    }
}
