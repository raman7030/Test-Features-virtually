package l;

/* JADX INFO: renamed from: l.᩸ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: U58U */
/* JADX INFO: loaded from: classes.dex */
public final class C21759 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f69724;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f69725;

    public C21759(String str, String str2) {
        this.f69724 = C3603.m11048(str);
        this.f69725 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C21759.class == obj.getClass()) {
            C21759 c21759 = (C21759) obj;
            if (C11003.equals(this.f69724, c21759.f69724) && C11003.equals(this.f69725, c21759.f69725)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f69725.hashCode() * 31;
        String str = this.f69724;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    static {
        C3603.m11056(0);
        C3603.m11056(1);
    }
}
