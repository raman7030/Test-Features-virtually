package l;

/* JADX INFO: renamed from: l.֫ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1596 extends AbstractC16412 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String[] f5647;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f5648;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f5649;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f5650;

    public C1596(String[] strArr, int i) {
        this.f5647 = strArr;
        this.f5648 = i;
        int length = 0;
        for (int i2 = 0; i2 < i; i2++) {
            length += strArr[i2].length();
        }
        this.f5650 = length;
    }

    @Override // l.AbstractC16412
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1596.class != obj.getClass()) {
            throw new RuntimeException();
        }
        C1596 c1596 = (C1596) obj;
        int i = c1596.f5648;
        int i2 = this.f5648;
        if (i2 != i || this.f5650 != c1596.f5650) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!this.f5647[i3].equals(c1596.f5647[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC16412
    public final int hashCode() {
        int iHashCode = this.f5649;
        if (iHashCode == 0 && this.f5650 > 0) {
            for (int i = 0; i < this.f5648; i++) {
                iHashCode = (iHashCode * 31) + this.f5647[i].hashCode();
            }
            this.f5649 = iHashCode;
        }
        return iHashCode;
    }

    @Override // l.AbstractC16412
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String mo5456() {
        StringBuilder sb = new StringBuilder(this.f5650);
        for (int i = 0; i < this.f5648; i++) {
            sb.append(this.f5647[i]);
        }
        return sb.toString();
    }
}
