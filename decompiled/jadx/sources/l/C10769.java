package l;

/* JADX INFO: renamed from: l.ۧۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10769 extends AbstractC16412 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final AbstractC16412 f32418 = new C10769("");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f32419;

    public C10769(String str) {
        this.f32419 = str;
    }

    @Override // l.AbstractC16412
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10769.class != obj.getClass()) {
            throw new RuntimeException();
        }
        return C11003.equals(this.f32419, ((C10769) obj).f32419);
    }

    @Override // l.AbstractC16412
    public final int hashCode() {
        return this.f32419.hashCode();
    }

    @Override // l.AbstractC16412
    /* JADX INFO: renamed from: ֫ */
    public final String mo5456() {
        return this.f32419;
    }
}
