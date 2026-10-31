package l;

/* JADX INFO: renamed from: l.ۧܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: L8S9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11121 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f33360;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f33361;

    public C11121(int i, boolean z) {
        this.f33360 = i;
        this.f33361 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11121.class != obj.getClass()) {
            return false;
        }
        C11121 c11121 = (C11121) obj;
        return this.f33360 == c11121.f33360 && this.f33361 == c11121.f33361;
    }

    public final int hashCode() {
        return (this.f33360 * 31) + (this.f33361 ? 1 : 0);
    }
}
