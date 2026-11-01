package p067l;

/* JADX INFO: renamed from: l.ۧۙۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12603 extends AbstractC17966 {

    /* JADX INFO: renamed from: ۧ */
    public static final AbstractC17966 f35393 = new C12603("");

    /* JADX INFO: renamed from: ֫ */
    public final String f35394;

    public C12603(String str) {
        this.f35394 = str;
    }

    @Override // p067l.AbstractC17966
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12603.class != obj.getClass()) {
            throw new RuntimeException();
        }
        return C12826.equals(this.f35394, ((C12603) obj).f35394);
    }

    @Override // p067l.AbstractC17966
    public final int hashCode() {
        return this.f35394.hashCode();
    }

    @Override // p067l.AbstractC17966
    /* JADX INFO: renamed from: ֫ */
    public final String mo7686() {
        return this.f35394;
    }
}
