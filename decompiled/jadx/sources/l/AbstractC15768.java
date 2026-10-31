package l;

/* JADX INFO: renamed from: l.ܺۜۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 98W2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15768 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f48611;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo5599(AbstractActivityC3346 abstractActivityC3346);

    public AbstractC15768(int i) {
        this.f48611 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m37180() {
        return this.f48611;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC15768 m37179(C12951 c12951) {
        int i = c12951.readByte() & 255;
        if (i == 0) {
            return C1658.f5795;
        }
        switch (i) {
            case 2:
                return new C23530(c12951);
            case 3:
                return new C10831(c12951);
            case 4:
                return new C6597(c12951);
            case 5:
                return new C14357(c12951);
            case 6:
                return new C7799(c12951);
            case 7:
                return new C20709(7);
            case 8:
                return new C8714(c12951);
            default:
                throw new IllegalArgumentException(C19370.m44628(i, "Unknown action: "));
        }
    }
}
