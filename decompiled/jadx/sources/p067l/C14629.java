package p067l;

/* JADX INFO: renamed from: l.۬ۚۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8A6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C14629 {

    /* JADX INFO: renamed from: ֫ */
    public final String f41755;

    /* JADX INFO: renamed from: ۧ */
    public final String f41756;

    /* JADX INFO: renamed from: ܽ */
    public final int f41757;

    public C14629(String str, int i, String str2) {
        this.f41755 = str;
        this.f41757 = i;
        this.f41756 = str2;
    }

    public final int hashCode() {
        return C12826.hash(Integer.valueOf(this.f41757), this.f41756) + (m33430() * 31);
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m33426() {
        return this.f41755;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m33428() {
        return this.f41757;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m33429(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14629) {
            return m33427(obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m33430() {
        return C12826.hash(this.f41755);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m33427(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14629)) {
            return false;
        }
        return C12826.equals(this.f41755, ((C14629) obj).f41755);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14629)) {
            return false;
        }
        C14629 c14629 = (C14629) obj;
        return m33429(obj) && this.f41757 == c14629.f41757 && C12826.equals(this.f41756, c14629.f41756);
    }

    public final String toString() {
        String strM33426 = m33426();
        String strM16053 = strM33426 == null ? "null" : C6988.m16053("\"", strM33426, "\"");
        Integer numValueOf = Integer.valueOf(this.f41757);
        String str = this.f41756;
        return String.format("NetShareInfo1{netName: %s, type: %08x, remark: %s}", strM16053, numValueOf, str != null ? C6988.m16053("\"", str, "\"") : "null");
    }
}
