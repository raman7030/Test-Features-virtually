package l;

/* JADX INFO: renamed from: l.᩷֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20535 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f66143;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f66144;

    public C20535(int i, int i2) {
        this.f66144 = i;
        this.f66143 = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20535)) {
            return false;
        }
        C20535 c20535 = (C20535) obj;
        return this.f66144 == c20535.f66144 && this.f66143 == c20535.f66143;
    }

    public final int hashCode() {
        return C11003.hash(Integer.valueOf(this.f66144), Integer.valueOf(this.f66143));
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C20535 c20535) {
        int iCompare = Integer.compare(this.f66144, c20535.f66144);
        return iCompare != 0 ? iCompare : Integer.compare(this.f66143, c20535.f66143);
    }
}
