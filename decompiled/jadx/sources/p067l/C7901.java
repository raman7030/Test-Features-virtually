package p067l;

/* JADX INFO: renamed from: l.ۛۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: S4UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C7901 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public String f20728;

    /* JADX INFO: renamed from: ۙ */
    public int f20729;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f20728.compareTo(((C7901) obj).f20728);
    }

    public C7901(C5651 c5651) {
        super(c5651);
        this.f20729 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C7901 m18245(String str, C5651 c5651) {
        C7901 c7901 = new C7901(c5651);
        c7901.f20729 = 0;
        c7901.f20728 = str;
        return (C7901) c5651.f13747.m27254(c7901);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        c12556.m28943();
        this.f20728 = c12556.m28940();
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return C12981.m29759(this.f20728.length()) + i + C6458.m14763(this.f20728).length + 1;
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        byte[] bArrM14763 = C6458.m14763(this.f20728);
        c3838.m7530(this.f20728.length());
        c3838.m7527(bArrM14763, 0, bArrM14763.length);
        c3838.m7529(0);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return "string_data_item: \"" + C6458.m14762(this.f20728) + "\"";
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m18247() {
        return this.f20728;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m18246(String str) {
        this.f20728 = str;
    }

    public final int hashCode() {
        if (this.f20729 == 0) {
            this.f20729 = this.f20728.hashCode();
        }
        return this.f20729;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C7901.class.equals(obj.getClass())) {
            return false;
        }
        return this.f20728.equals(((C7901) obj).f20728);
    }
}
