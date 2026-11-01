package p067l;

/* JADX INFO: renamed from: l.۟۠ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: D5R7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9342 {

    /* JADX INFO: renamed from: ֫ */
    public String f25463;

    /* JADX INFO: renamed from: ۧ */
    public String f25464;

    /* JADX INFO: renamed from: ܽ */
    public C12891 f25465;

    /* JADX INFO: renamed from: ܿ */
    public final C12891 m21676() {
        return this.f25465;
    }

    public C9342(String str, String str2, String[] strArr, String str3) {
        this.f25464 = str;
        this.f25463 = str2;
        this.f25465 = new C12891(str3, strArr);
    }

    public C9342(String str, String str2, C12891 c12891) {
        this.f25464 = str;
        this.f25463 = str2;
        this.f25465 = c12891;
    }

    /* JADX INFO: renamed from: ֫ */
    public final String m21672() {
        return this.f25465.m29529();
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m21673() {
        return this.f25463;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m21675() {
        return this.f25464;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String[] m21677() {
        return this.f25465.m29530();
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m21674() {
        return this.f25465.m29531();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9342.class != obj.getClass()) {
            return false;
        }
        C9342 c9342 = (C9342) obj;
        String str = c9342.f25464;
        String str2 = c9342.f25463;
        String str3 = this.f25463;
        if (str3 == null ? str2 != null : !str3.equals(str2)) {
            return false;
        }
        String str4 = this.f25464;
        if (str4 == null ? str == null : str4.equals(str)) {
            return this.f25465.equals(c9342.f25465);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25463;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f25464;
        return this.f25465.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f25464 + "->" + this.f25463 + this.f25465.m29529();
    }
}
