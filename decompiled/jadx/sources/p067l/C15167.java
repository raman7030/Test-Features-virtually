package p067l;

/* JADX INFO: renamed from: l.ܰ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8OV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15167 implements InterfaceC16409 {

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f43275 = new C19203();

    /* JADX INFO: renamed from: ۧ */
    public final C11157 f43276;

    public C15167(C11157 c11157) {
        this.f43276 = c11157;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    @Override // p067l.InterfaceC16409
    /* JADX INFO: renamed from: ֫ */
    public final C19092 mo29259(InterfaceC10375 interfaceC10375, long j) {
        int iM21076;
        long position = interfaceC10375.getPosition();
        int iMin = (int) Math.min(20000L, interfaceC10375.getLength() - position);
        C19203 c19203 = this.f43275;
        c19203.m43727(iMin);
        interfaceC10375.mo24031(0, iMin, c19203.m43728());
        int iM43731 = -1;
        int iM43732 = -1;
        long j2 = -9223372036854775807L;
        while (c19203.m43703() >= 4) {
            if (C9133.m21076(c19203.m43731(), c19203.m43728()) != 442) {
                c19203.m43724(1);
            } else {
                c19203.m43724(4);
                long jM7725 = C3907.m7725(c19203);
                if (jM7725 != -9223372036854775807L) {
                    long jM25735 = this.f43276.m25735(jM7725);
                    if (jM25735 > j) {
                        if (j2 == -9223372036854775807L) {
                            return C19092.m43373(jM25735, position);
                        }
                        return C19092.m43372(position + ((long) iM43732));
                    }
                    if (100000 + jM25735 > j) {
                        return C19092.m43372(position + ((long) c19203.m43731()));
                    }
                    iM43732 = c19203.m43731();
                    j2 = jM25735;
                }
                int iM43729 = c19203.m43729();
                if (c19203.m43703() < 10) {
                    c19203.m43730(iM43729);
                } else {
                    c19203.m43724(9);
                    int iM43702 = c19203.m43702() & 7;
                    if (c19203.m43703() < iM43702) {
                        c19203.m43730(iM43729);
                    } else {
                        c19203.m43724(iM43702);
                        if (c19203.m43703() < 4) {
                            c19203.m43730(iM43729);
                        } else {
                            if (C9133.m21076(c19203.m43731(), c19203.m43728()) == 443) {
                                c19203.m43724(4);
                                int iM43710 = c19203.m43710();
                                if (c19203.m43703() < iM43710) {
                                    c19203.m43730(iM43729);
                                } else {
                                    c19203.m43724(iM43710);
                                    while (c19203.m43703() >= 4) {
                                        iM21076 = C9133.m21076(c19203.m43731(), c19203.m43728());
                                        if (iM21076 == 442 || iM21076 == 441 || (iM21076 >>> 8) != 1) {
                                            break;
                                        }
                                        c19203.m43724(4);
                                        if (c19203.m43703() < 2) {
                                            c19203.m43730(iM43729);
                                            break;
                                        }
                                        c19203.m43730(Math.min(c19203.m43729(), c19203.m43731() + c19203.m43710()));
                                    }
                                }
                            } else {
                                while (c19203.m43703() >= 4) {
                                    iM21076 = C9133.m21076(c19203.m43731(), c19203.m43728());
                                    if (iM21076 == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                iM43731 = c19203.m43731();
            }
        }
        if (j2 != -9223372036854775807L) {
            return C19092.m43375(j2, position + ((long) iM43731));
        }
        return C19092.f56961;
    }

    @Override // p067l.InterfaceC16409
    /* JADX INFO: renamed from: ֫ */
    public final void mo29260() {
        byte[] bArr = C5792.f14227;
        C19203 c19203 = this.f43275;
        c19203.getClass();
        c19203.m43708(bArr.length, bArr);
    }
}
