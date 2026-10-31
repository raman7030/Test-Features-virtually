package l;

/* JADX INFO: renamed from: l.ۨۙ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N8KR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11469 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f34254;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f34255;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f34256;

    public C11469(C5824 c5824) {
        this.f34255 = c5824.f17879;
        this.f34256 = c5824.f17880;
        this.f34254 = c5824.f17878;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C5824 m28275() {
        return new C5824(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11469)) {
            return false;
        }
        C11469 c11469 = (C11469) obj;
        return this.f34255 == c11469.f34255 && this.f34256 == c11469.f34256 && this.f34254 == c11469.f34254;
    }

    public final int hashCode() {
        return C11003.hash(Long.valueOf(this.f34255), Float.valueOf(this.f34256), Long.valueOf(this.f34254));
    }
}
