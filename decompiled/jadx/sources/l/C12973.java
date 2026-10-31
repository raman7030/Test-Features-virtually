package l;

/* JADX INFO: renamed from: l.۬۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C12973 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f38878;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f38879;

    static {
        new C12973();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12973.class == obj.getClass()) {
            C12973 c12973 = (C12973) obj;
            if (this.f38879 == c12973.f38879 && this.f38878 == c12973.f38878) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f38879), Integer.valueOf(this.f38878));
    }
}
