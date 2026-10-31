package l;

/* JADX INFO: renamed from: l.ۚ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: S69M */
/* JADX INFO: loaded from: classes2.dex */
public final class C5581 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f17282;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f17283;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f17284;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f17285;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f17282;
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
        sb.append(this.f17285);
        sb.append("c:");
        sb.append(this.f17283);
        sb.append(",p:");
        sb.append(this.f17284);
        sb.append("]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C5581)) {
                return false;
            }
            C5581 c5581 = (C5581) obj;
            int i = this.f17282;
            if (i != c5581.f17282) {
                return false;
            }
            if (i != 8 || Math.abs(this.f17283 - this.f17285) != 1 || this.f17283 != c5581.f17285 || this.f17285 != c5581.f17283) {
                if (this.f17283 != c5581.f17283 || this.f17285 != c5581.f17285) {
                    return false;
                }
                Object obj2 = this.f17284;
                if (obj2 != null) {
                    if (!obj2.equals(c5581.f17284)) {
                        return false;
                    }
                } else if (c5581.f17284 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f17282 * 31) + this.f17285) * 31) + this.f17283;
    }
}
