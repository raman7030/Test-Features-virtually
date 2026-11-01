package p067l;

/* JADX INFO: renamed from: l.ۚ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S69M */
/* JADX INFO: loaded from: classes2.dex */
public final class C7673 {

    /* JADX INFO: renamed from: ֫ */
    public int f20122;

    /* JADX INFO: renamed from: ۧ */
    public int f20123;

    /* JADX INFO: renamed from: ܽ */
    public Object f20124;

    /* JADX INFO: renamed from: ᩳ */
    public int f20125;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f20122;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f20125);
        sb.append("c:");
        sb.append(this.f20123);
        sb.append(",p:");
        sb.append(this.f20124);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C7673)) {
                return false;
            }
            C7673 c7673 = (C7673) obj;
            int i = this.f20122;
            if (i != c7673.f20122) {
                return false;
            }
            if (i != 8 || Math.abs(this.f20123 - this.f20125) != 1 || this.f20123 != c7673.f20125 || this.f20125 != c7673.f20123) {
                if (this.f20123 != c7673.f20123 || this.f20125 != c7673.f20125) {
                    return false;
                }
                Object obj2 = this.f20124;
                if (obj2 != null) {
                    if (!obj2.equals(c7673.f20124)) {
                        return false;
                    }
                } else if (c7673.f20124 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f20122 * 31) + this.f20125) * 31) + this.f20123;
    }
}
