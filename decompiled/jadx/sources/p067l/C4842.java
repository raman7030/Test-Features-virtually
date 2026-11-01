package p067l;

/* JADX INFO: renamed from: l.ۖܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C4842 {

    /* JADX INFO: renamed from: ֫ */
    public C5771 f11017;

    /* JADX INFO: renamed from: ۧ */
    public AbstractC6462 f11018;

    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ C6183 f11019;

    public C4842(C6183 c6183, AbstractC6462 abstractC6462, C5771 c5771) {
        this.f11019 = c6183;
        this.f11018 = abstractC6462;
        this.f11017 = c5771;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4842)) {
            return false;
        }
        C4842 c4842 = (C4842) obj;
        return c4842.f11017 == this.f11017 && this.f11019.f15560.m19490(this.f11018, c4842.f11018);
    }

    public final int hashCode() {
        C8374 c8374 = this.f11019.f15560;
        return C8374.m19408(this.f11018) & (~this.f11017.hashCode());
    }
}
