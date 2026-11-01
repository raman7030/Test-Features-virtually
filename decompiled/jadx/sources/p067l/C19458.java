package p067l;

/* JADX INFO: renamed from: l.ᩳۤ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: U5Q7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19458 extends AbstractC9476 implements InterfaceC16798 {

    /* JADX INFO: renamed from: ۗ */
    public static final EnumC5850 f59282 = EnumC5850.Format21lh;

    /* JADX INFO: renamed from: ۙ */
    public final int f59283;

    /* JADX INFO: renamed from: ᩶ */
    public final long f59284;

    @Override // p067l.InterfaceC23920
    /* JADX INFO: renamed from: ֨ */
    public final String mo4188() {
        return mo6217().f6089 + " v" + mo4189() + ", " + mo7162();
    }

    public C19458(EnumC3167 enumC3167, int i, long j) {
        super(enumC3167);
        C12981.m29763(i);
        this.f59283 = i;
        if ((281474976710655L & j) == 0) {
            this.f59284 = j;
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid literal value: %d. Low 48 bits must be zeroed out.", Long.valueOf(j)));
    }

    @Override // p067l.InterfaceC4059
    /* JADX INFO: renamed from: ֫ */
    public final int mo4189() {
        return this.f59283;
    }

    @Override // p067l.InterfaceC11436
    /* JADX INFO: renamed from: ᩸ */
    public final long mo7162() {
        return this.f59284;
    }

    @Override // p067l.InterfaceC7827
    /* JADX INFO: renamed from: ۗ */
    public final short mo7160() {
        return (short) (this.f59284 >>> 48);
    }

    @Override // p067l.AbstractC9476
    /* JADX INFO: renamed from: ۫ */
    public final EnumC5850 mo4190() {
        return f59282;
    }
}
