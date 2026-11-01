package p067l;

/* JADX INFO: renamed from: l.ۨۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KR */
/* JADX INFO: loaded from: classes3.dex */
public final class C13268 {

    /* JADX INFO: renamed from: ֫ */
    public final long f37250;

    /* JADX INFO: renamed from: ۧ */
    public final long f37251;

    /* JADX INFO: renamed from: ܽ */
    public final float f37252;

    public C13268(C7903 c7903) {
        this.f37251 = c7903.f20731;
        this.f37252 = c7903.f20732;
        this.f37250 = c7903.f20730;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C7903 m30319() {
        return new C7903(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13268)) {
            return false;
        }
        C13268 c13268 = (C13268) obj;
        return this.f37251 == c13268.f37251 && this.f37252 == c13268.f37252 && this.f37250 == c13268.f37250;
    }

    public final int hashCode() {
        return C12826.hash(Long.valueOf(this.f37251), Float.valueOf(this.f37252), Long.valueOf(this.f37250));
    }
}
