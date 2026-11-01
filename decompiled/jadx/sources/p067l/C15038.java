package p067l;

/* JADX INFO: renamed from: l.۬᩶֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 556V */
/* JADX INFO: loaded from: classes4.dex */
public final class C15038 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۗ */
    public int f42956;

    /* JADX INFO: renamed from: ۙ */
    public C8333 f42957;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f42957.compareTo(((C15038) obj).f42957);
    }

    public C15038(C5651 c5651) {
        super(c5651);
        this.f42956 = 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15038 m34413(C5651 c5651, C8333 c8333) {
        C15038 c15038 = new C15038(c5651);
        c15038.f42956 = 0;
        c15038.f42957 = c8333;
        return (C15038) c5651.f13750.m27254(c15038);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        this.f42957 = new C8333(this.f18865, c12556);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return this.f42957.mo7662(i);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        this.f42957.mo7663(c3838);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return C1514.m34687(new StringBuilder("encoded_array @0x"), this.f18864);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final C8333 m34414() {
        return this.f42957;
    }

    public final int hashCode() {
        if (this.f42956 == 0) {
            this.f42956 = this.f42957.hashCode();
        }
        return this.f42956;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C15038.class.equals(obj.getClass()) && this.f42957.compareTo(((C15038) obj).f42957) == 0;
    }
}
