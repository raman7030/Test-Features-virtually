package p067l;

/* JADX INFO: renamed from: l.ۙᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public class C6954 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f18085;

    /* JADX INFO: renamed from: ۧ */
    public final long f18086;

    /* JADX INFO: renamed from: ܳ */
    public final boolean f18087;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f18088;

    /* JADX INFO: renamed from: ܿ */
    public final long f18089;

    /* JADX INFO: renamed from: ᩳ */
    public final boolean f18090;

    static {
        new C6954(new C21707());
        C7470.m17250(0, 1, 2, 3, 4);
        C5792.m13032(5);
        C5792.m13032(6);
        C5792.m13032(7);
    }

    public C6954(C21707 c21707) {
        String str = C5792.f14228;
        this.f18089 = c21707.f68392;
        this.f18086 = c21707.f68389;
        this.f18090 = c21707.f68393;
        this.f18088 = c21707.f68391;
        this.f18087 = c21707.f68390;
        this.f18085 = c21707.f68388;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6954)) {
            return false;
        }
        C6954 c6954 = (C6954) obj;
        return this.f18089 == c6954.f18089 && this.f18086 == c6954.f18086 && this.f18090 == c6954.f18090 && this.f18088 == c6954.f18088 && this.f18087 == c6954.f18087 && this.f18085 == c6954.f18085;
    }

    public final int hashCode() {
        long j = this.f18089;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f18086;
        return ((((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f18090 ? 1 : 0)) * 31) + (this.f18088 ? 1 : 0)) * 31) + (this.f18087 ? 1 : 0)) * 31) + (this.f18085 ? 1 : 0);
    }
}
