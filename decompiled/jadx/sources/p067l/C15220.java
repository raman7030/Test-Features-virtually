package p067l;

/* JADX INFO: renamed from: l.ܰۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9Q3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15220 {

    /* JADX INFO: renamed from: ֫ */
    public final C19244 f43409;

    /* JADX INFO: renamed from: ۧ */
    public final int f43410;

    public C15220(C19244 c19244, int i) {
        this.f43409 = c19244;
        this.f43410 = i;
    }

    public final int hashCode() {
        return (this.f43409.hashCode() * 65535) + this.f43410;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15220)) {
            return false;
        }
        C15220 c15220 = (C15220) obj;
        return this.f43409 == c15220.f43409 && this.f43410 == c15220.f43410;
    }
}
