package p067l;

/* JADX INFO: renamed from: l.᩻ۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88S1 */
/* JADX INFO: loaded from: classes.dex */
public final class C24694 implements InterfaceC16409 {

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f78171 = new C19203();

    /* JADX INFO: renamed from: ۧ */
    public final int f78172;

    /* JADX INFO: renamed from: ܽ */
    public final C11157 f78173;

    public C24694(int i, C11157 c11157) {
        this.f78172 = i;
        this.f78173 = c11157;
    }

    @Override // p067l.InterfaceC16409
    /* JADX INFO: renamed from: ֫ */
    public final C19092 mo29259(InterfaceC10375 interfaceC10375, long j) {
        long j2;
        long position = interfaceC10375.getPosition();
        int iMin = (int) Math.min(112800, interfaceC10375.getLength() - position);
        C19203 c19203 = this.f78171;
        c19203.m43727(iMin);
        interfaceC10375.mo24031(0, iMin, c19203.m43728());
        int iM43729 = c19203.m43729();
        long j3 = -1;
        long j4 = -9223372036854775807L;
        long j5 = -1;
        while (true) {
            if (c19203.m43703() < 188) {
                j2 = -9223372036854775807L;
                break;
            }
            byte[] bArrM43728 = c19203.m43728();
            int iM43731 = c19203.m43731();
            while (iM43731 < iM43729 && bArrM43728[iM43731] != 71) {
                iM43731++;
            }
            j2 = -9223372036854775807L;
            int i = iM43731 + 188;
            if (i > iM43729) {
                break;
            }
            long jM30909 = C13590.m30909(c19203, iM43731, this.f78172);
            if (jM30909 != -9223372036854775807L) {
                long jM25735 = this.f78173.m25735(jM30909);
                if (jM25735 > j) {
                    if (j4 == -9223372036854775807L) {
                        return C19092.m43373(jM25735, position);
                    }
                    return C19092.m43372(position + j5);
                }
                if (100000 + jM25735 > j) {
                    return C19092.m43372(position + ((long) iM43731));
                }
                j5 = iM43731;
                j4 = jM25735;
            }
            c19203.m43730(i);
            j3 = i;
        }
        if (j4 != j2) {
            return C19092.m43375(j4, position + j3);
        }
        return C19092.f56961;
    }

    @Override // p067l.InterfaceC16409
    /* JADX INFO: renamed from: ֫ */
    public final void mo29260() {
        byte[] bArr = C5792.f14227;
        C19203 c19203 = this.f78171;
        c19203.getClass();
        c19203.m43708(bArr.length, bArr);
    }
}
