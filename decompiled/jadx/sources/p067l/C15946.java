package p067l;

/* JADX INFO: renamed from: l.ܳۙ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H55A */
/* JADX INFO: loaded from: classes4.dex */
public final class C15946 extends AbstractC17958 {

    /* JADX INFO: renamed from: ᩸ */
    public final float f46158;

    public C15946(C12556 c12556, byte b) {
        this.f46158 = Float.intBitsToFloat((int) ((C5755.m12834(c12556.m28942(b + 1)) >> 32) & 4294967295L));
    }

    public C15946(float f) {
        this.f46158 = f;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final void mo7663(C3838 c3838) {
        byte[] bArrM12840 = C5755.m12840(((long) Float.floatToRawIntBits(this.f46158)) << 32);
        c3838.m7529(EnumC5889.VALUE_FLOAT.f14502 | ((bArrM12840.length - 1) << 5));
        c3838.m7527(bArrM12840, 0, bArrM12840.length);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ֫ */
    public final int mo7662(int i) {
        return C5755.m12847(((long) Float.floatToRawIntBits(this.f46158)) << 32) + i + 1;
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۧ */
    public final int mo7665(AbstractC17958 abstractC17958) {
        return Float.compare(this.f46158, ((C15946) abstractC17958).f46158);
    }

    @Override // p067l.AbstractC17958
    /* JADX INFO: renamed from: ۖ */
    public final EnumC5889 mo7664() {
        return EnumC5889.VALUE_FLOAT;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f46158);
    }
}
