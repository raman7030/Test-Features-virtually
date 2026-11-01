package p067l;

/* JADX INFO: renamed from: l.֫ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BMB */
/* JADX INFO: loaded from: classes2.dex */
public final class C4051 extends C12769 {

    /* JADX INFO: renamed from: ֫ */
    public final C16120 f8914;

    public C4051(C16120 c16120) {
        this.f8914 = c16120;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4051) {
            return this.f8914.equals(((C4051) obj).f8914);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8914.hashCode();
    }

    @Override // p067l.C12769
    public final String toString() {
        return "Closed(" + this.f8914 + ')';
    }
}
