package l;

/* JADX INFO: renamed from: l.۟۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7338 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String f22550;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public String f22551;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C11072 f22552;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C11072 m19703() {
        return this.f22552;
    }

    public C7338(String str, String str2, String[] strArr, String str3) {
        this.f22551 = str;
        this.f22550 = str2;
        this.f22552 = new C11072(str3, strArr);
    }

    public C7338(String str, String str2, C11072 c11072) {
        this.f22551 = str;
        this.f22550 = str2;
        this.f22552 = c11072;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String m19699() {
        return this.f22552.m27467();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m19700() {
        return this.f22550;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m19702() {
        return this.f22551;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String[] m19704() {
        return this.f22552.m27468();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m19701() {
        return this.f22552.m27469();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7338.class != obj.getClass()) {
            return false;
        }
        C7338 c7338 = (C7338) obj;
        String str = c7338.f22551;
        String str2 = c7338.f22550;
        String str3 = this.f22550;
        if (str3 == null ? str2 != null : !str3.equals(str2)) {
            return false;
        }
        String str4 = this.f22551;
        if (str4 == null ? str == null : str4.equals(str)) {
            return this.f22552.equals(c7338.f22552);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f22550;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f22551;
        return this.f22552.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f22551 + "->" + this.f22550 + this.f22552.m27467();
    }
}
