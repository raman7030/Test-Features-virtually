package l;

/* JADX INFO: renamed from: l.۫֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Z9YI */
/* JADX INFO: loaded from: classes3.dex */
public final class C12066 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final String f36082;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f36083;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f36084;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f36085;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f36086;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f36087;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f36088;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C12066 m29443(int i, AbstractC3577 abstractC3577) {
        if (abstractC3577 instanceof C23354) {
            return new C12066(i, (C23354) abstractC3577);
        }
        throw new RuntimeException();
    }

    public C12066(int i, C23354 c23354) {
        this.f36088 = i;
        this.f36083 = c23354.f75031;
        this.f36086 = c23354.f75034;
        this.f36082 = c23354.f75030;
        this.f36084 = c23354.f75033;
        this.f36087 = c23354.f75032;
        this.f36085 = c23354.f11354;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12066.class != obj.getClass()) {
            return false;
        }
        C12066 c12066 = (C12066) obj;
        if (this.f36088 == c12066.f36088 && this.f36086 == c12066.f36086 && this.f36083.equals(c12066.f36083) && this.f36082.equals(c12066.f36082) && this.f36084.equals(c12066.f36084)) {
            return this.f36087.equals(c12066.f36087);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36087.hashCode() + C11010.m27349(C11010.m27349((C11010.m27349(this.f36088 * 31, 31, this.f36083) + this.f36086) * 31, 31, this.f36082), 31, this.f36084);
    }
}
