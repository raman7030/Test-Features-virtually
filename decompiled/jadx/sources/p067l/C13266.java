package p067l;

/* JADX INFO: renamed from: l.ۨۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U4P4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13266 extends AbstractC7230 {

    /* JADX INFO: renamed from: ۙ */
    public C7901 f37249;

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final int mo12140(int i) {
        return i + 4;
    }

    public C13266(C5651 c5651, C7901 c7901) {
        super(c5651);
        this.f37249 = c7901;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13266 m30314(String str, C5651 c5651) {
        return (C13266) c5651.f13748.m27254(new C13266(c5651, C7901.m18245(str, c5651)));
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12145(C12556 c12556, C13936 c13936) {
        this.f37249 = (C7901) c13936.m31709(EnumC16617.TYPE_STRING_DATA_ITEM, c12556.m28944());
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final void mo12144(C3838 c3838) {
        c3838.m7531(this.f37249.f18864);
    }

    @Override // p067l.AbstractC7230
    /* JADX INFO: renamed from: ֫ */
    public final String mo12142() {
        return "string_id_item: " + C6458.m14762(this.f37249.m18247());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ֫, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C13266 c13266) {
        return this.f37249.m18247().compareTo(c13266.f37249.m18247());
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m30317() {
        return this.f37249.m18247();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m30316(String str) {
        this.f37249.m18246(str);
    }

    public final int hashCode() {
        return this.f37249.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C13266.class.equals(obj.getClass()) && this.f37249 == ((C13266) obj).f37249;
    }
}
