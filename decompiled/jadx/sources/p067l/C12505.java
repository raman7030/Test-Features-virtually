package p067l;

/* JADX INFO: renamed from: l.ۧ֨ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5F4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12505 implements Comparable {

    /* JADX INFO: renamed from: ۗ */
    public String f35050;

    /* JADX INFO: renamed from: ۙ */
    public String f35051;

    /* JADX INFO: renamed from: ᩶ */
    public boolean f35052;

    /* JADX INFO: renamed from: ᩸ */
    public String f35053;

    /* JADX INFO: renamed from: ᩹ */
    public String f35054;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return ((C12505) obj).f35054.length() - this.f35054.length();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f35053);
        sb.append(" ");
        sb.append(this.f35054);
        sb.append(" ");
        sb.append(this.f35051);
        sb.append(" ");
        sb.append(this.f35052 ? "rw" : "ro");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12505.class != obj.getClass()) {
            return false;
        }
        return C12826.equals(this.f35054, ((C12505) obj).f35054);
    }

    public final int hashCode() {
        String str = this.f35054;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
