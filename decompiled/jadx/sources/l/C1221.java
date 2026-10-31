package l;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֨ܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18KE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1221 extends AbstractC15126 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f4384 = new C17714();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C16302 f4385 = new C16302();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C9248 f4386;

    @Override // l.AbstractC15126
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23896 mo4059(C8072 c8072, ByteBuffer byteBuffer) {
        InterfaceC14723 c21683;
        C9248 c9248 = this.f4386;
        if (c9248 == null || c8072.f24876 != c9248.m23735()) {
            C9248 c9249 = new C9248(c8072.f69997);
            this.f4386 = c9249;
            c9249.m23731(c8072.f69997 - c8072.f24876);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C17714 c17714 = this.f4384;
        c17714.m41462(iLimit, bArrArray);
        C16302 c16302 = this.f4385;
        c16302.m38350(iLimit, bArrArray);
        c16302.m38351(39);
        long jM38343 = (((long) c16302.m38343(1)) << 32) | ((long) c16302.m38343(32));
        c16302.m38351(20);
        int iM38343 = c16302.m38343(12);
        int iM38344 = c16302.m38343(8);
        c17714.m41478(14);
        if (iM38344 == 0) {
            c21683 = new C21683();
        } else if (iM38344 == 255) {
            c21683 = C0515.m2226(c17714, iM38343, jM38343);
        } else if (iM38344 == 4) {
            c21683 = C4749.m13897(c17714);
        } else if (iM38344 == 5) {
            c21683 = C15331.m36362(c17714, jM38343, this.f4386);
        } else {
            c21683 = iM38344 != 6 ? null : C3338.m10195(c17714, jM38343, this.f4386);
        }
        return c21683 == null ? new C23896(new InterfaceC14723[0]) : new C23896(c21683);
    }
}
