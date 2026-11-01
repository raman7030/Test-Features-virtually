package p067l;

/* JADX INFO: renamed from: l.ܺۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC17354 {

    /* JADX INFO: renamed from: ֫ */
    public final int f51750;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo7829(AbstractActivityC5549 abstractActivityC5549);

    public AbstractC17354(int i) {
        this.f51750 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m39350() {
        return this.f51750;
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC17354 m39349(C14677 c14677) {
        int i = c14677.readByte() & 255;
        if (i == 0) {
            return C3944.f8575;
        }
        switch (i) {
            case 2:
                return new C24731(c14677);
            case 3:
                return new C12662(c14677);
            case 4:
                return new C8638(c14677);
            case 5:
                return new C16013(c14677);
            case 6:
                return new C9781(c14677);
            case 7:
                return new C22050(7);
            case 8:
                return new C10650(c14677);
            default:
                throw new IllegalArgumentException(C20778.m46922(i, "Unknown action: "));
        }
    }
}
