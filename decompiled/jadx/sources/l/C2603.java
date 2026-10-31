package l;

/* JADX INFO: renamed from: l.ۖܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes2.dex */
public final class C2603 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C3581 f8223;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f8224;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4014 f8225;

    public C2603(C4014 c4014, AbstractC4308 abstractC4308, C3581 c3581) {
        this.f8225 = c4014;
        this.f8224 = abstractC4308;
        this.f8223 = c3581;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2603)) {
            return false;
        }
        C2603 c2603 = (C2603) obj;
        return c2603.f8223 == this.f8223 && this.f8225.f12745.m17550(this.f8224, c2603.f8224);
    }

    public final int hashCode() {
        C6319 c6319 = this.f8225.f12745;
        return C6319.m17468(this.f8224) & (~this.f8223.hashCode());
    }
}
