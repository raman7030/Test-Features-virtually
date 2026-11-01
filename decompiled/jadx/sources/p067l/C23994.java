package p067l;

/* JADX INFO: renamed from: l.᩺ۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: T4QU */
/* JADX INFO: loaded from: classes.dex */
public final class C23994 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۙ */
    public C13266 f76205;

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return i + 4;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23994 m53164(String str, C5651 c5651) {
        C13266 c13266M30314 = C13266.m30314(str, c5651);
        C23994 c23994 = new C23994(c5651);
        c23994.f76205 = c13266M30314;
        return (C23994) c5651.f13727.m27254(c23994);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        this.f76205 = (C13266) this.f18865.f13748.m3722(c12556.m28944());
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7531(this.f76205.f18866);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return "type_id_item: " + this.f76205.m30317();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C23994 c23994) {
        return this.f76205.compareTo(c23994.f76205);
    }

    /* JADX INFO: renamed from: ۢ */
    public final String m53167() {
        String strM30317 = this.f76205.m30317();
        return strM30317.length() > 1 ? "L" : strM30317;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final String m53168() {
        return this.f76205.m30317();
    }

    /* JADX INFO: renamed from: ᩻ */
    public final int m53169() {
        String strM30317 = this.f76205.m30317();
        return (strM30317.charAt(0) == 'J' || strM30317.charAt(0) == 'D') ? 2 : 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m53166(String str) {
        this.f76205.m30316(str);
    }

    public final int hashCode() {
        return this.f76205.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C23994.class.equals(obj.getClass()) && this.f76205 == ((C23994) obj).f76205;
    }
}
