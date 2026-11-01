package p067l;

/* JADX INFO: renamed from: l.֫ۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3885 extends AbstractC17966 {

    /* JADX INFO: renamed from: ֫ */
    public final String[] f8426;

    /* JADX INFO: renamed from: ۧ */
    public final int f8427;

    /* JADX INFO: renamed from: ܽ */
    public int f8428;

    /* JADX INFO: renamed from: ᩳ */
    public final int f8429;

    public C3885(String[] strArr, int i) {
        this.f8426 = strArr;
        this.f8427 = i;
        int length = 0;
        for (int i2 = 0; i2 < i; i2++) {
            length += strArr[i2].length();
        }
        this.f8429 = length;
    }

    @Override // p067l.AbstractC17966
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3885.class != obj.getClass()) {
            throw new RuntimeException();
        }
        C3885 c3885 = (C3885) obj;
        int i = c3885.f8427;
        int i2 = this.f8427;
        if (i2 != i || this.f8429 != c3885.f8429) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!this.f8426[i3].equals(c3885.f8426[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC17966
    public final int hashCode() {
        int iHashCode = this.f8428;
        if (iHashCode == 0 && this.f8429 > 0) {
            for (int i = 0; i < this.f8427; i++) {
                iHashCode = (iHashCode * 31) + this.f8426[i].hashCode();
            }
            this.f8428 = iHashCode;
        }
        return iHashCode;
    }

    @Override // p067l.AbstractC17966
    /* JADX INFO: renamed from: ֫ */
    public final String mo7686() {
        StringBuilder sb = new StringBuilder(this.f8429);
        for (int i = 0; i < this.f8427; i++) {
            sb.append(this.f8426[i]);
        }
        return sb.toString();
    }
}
