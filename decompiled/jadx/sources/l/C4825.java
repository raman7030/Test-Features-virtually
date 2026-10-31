package l;

/* JADX INFO: renamed from: l.ۙᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 78PS */
/* JADX INFO: loaded from: classes2.dex */
public class C4825 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f15252;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f15253;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f15254;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f15255;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f15256;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final boolean f15257;

    static {
        new C4825(new C20348());
        C5368.m15341(0, 1, 2, 3, 4);
        C3603.m11056(5);
        C3603.m11056(6);
        C3603.m11056(7);
    }

    public C4825(C20348 c20348) {
        String str = C3603.f11424;
        this.f15256 = c20348.f65716;
        this.f15253 = c20348.f65713;
        this.f15257 = c20348.f65717;
        this.f15255 = c20348.f65715;
        this.f15254 = c20348.f65714;
        this.f15252 = c20348.f65712;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4825)) {
            return false;
        }
        C4825 c4825 = (C4825) obj;
        return this.f15256 == c4825.f15256 && this.f15253 == c4825.f15253 && this.f15257 == c4825.f15257 && this.f15255 == c4825.f15255 && this.f15254 == c4825.f15254 && this.f15252 == c4825.f15252;
    }

    public final int hashCode() {
        long j = this.f15256;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f15253;
        return ((((((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f15257 ? 1 : 0)) * 31) + (this.f15255 ? 1 : 0)) * 31) + (this.f15254 ? 1 : 0)) * 31) + (this.f15252 ? 1 : 0);
    }
}
