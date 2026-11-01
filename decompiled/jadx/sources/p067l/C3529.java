package p067l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֨ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KE */
/* JADX INFO: loaded from: classes2.dex */
public final class C3529 extends AbstractC16744 {

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f7154 = new C19203();

    /* JADX INFO: renamed from: ۧ */
    public final C17861 f7155 = new C17861();

    /* JADX INFO: renamed from: ܽ */
    public C11157 f7156;

    @Override // p067l.AbstractC16744
    /* JADX INFO: renamed from: ֫ */
    public final C25079 mo6303(C10040 c10040, ByteBuffer byteBuffer) {
        InterfaceC16361 c22976;
        C11157 c11157 = this.f7156;
        if (c11157 == null || c10040.f27789 != c11157.m25736()) {
            C11157 c11158 = new C11157(c10040.f72706);
            this.f7156 = c11158;
            c11158.m25732(c10040.f72706 - c10040.f27789);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C19203 c19203 = this.f7154;
        c19203.m43708(iLimit, bArrArray);
        C17861 c17861 = this.f7155;
        c17861.m40565(iLimit, bArrArray);
        c17861.m40566(39);
        long jM40558 = (((long) c17861.m40558(1)) << 32) | ((long) c17861.m40558(32));
        c17861.m40566(20);
        int iM40558 = c17861.m40558(12);
        int iM40559 = c17861.m40558(8);
        c19203.m43724(14);
        if (iM40559 == 0) {
            c22976 = new C22976();
        } else if (iM40559 == 255) {
            c22976 = C2858.m4593(c19203, iM40558, jM40558);
        } else if (iM40559 == 4) {
            c22976 = C6882.m15777(c19203);
        } else if (iM40559 == 5) {
            c22976 = C16939.m38520(c19203, jM40558, this.f7156);
        } else {
            c22976 = iM40559 != 6 ? null : C5541.m12231(c19203, jM40558, this.f7156);
        }
        return c22976 == null ? new C25079(new InterfaceC16361[0]) : new C25079(c22976);
    }
}
