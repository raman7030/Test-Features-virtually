package l;

/* JADX INFO: renamed from: l.ܰ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O8OV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13467 implements InterfaceC14773 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f40205 = new C17714();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C9248 f40206;

    public C13467(C9248 c9248) {
        this.f40206 = c9248;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
    @Override // l.InterfaceC14773
    /* JADX INFO: renamed from: ֫ */
    public final C17596 mo27214(InterfaceC8424 interfaceC8424, long j) {
        int iM19133;
        long position = interfaceC8424.getPosition();
        int iMin = (int) Math.min(20000L, interfaceC8424.getLength() - position);
        C17714 c17714 = this.f40205;
        c17714.m41481(iMin);
        interfaceC8424.mo22061(0, iMin, c17714.m41482());
        int iM41485 = -1;
        int iM41486 = -1;
        long j2 = -9223372036854775807L;
        while (c17714.m41457() >= 4) {
            if (C7118.m19133(c17714.m41485(), c17714.m41482()) != 442) {
                c17714.m41478(1);
            } else {
                c17714.m41478(4);
                long jM5495 = C1619.m5495(c17714);
                if (jM5495 != -9223372036854775807L) {
                    long jM23734 = this.f40206.m23734(jM5495);
                    if (jM23734 > j) {
                        if (j2 == -9223372036854775807L) {
                            return C17596.m41127(jM23734, position);
                        }
                        return C17596.m41126(position + ((long) iM41486));
                    }
                    if (100000 + jM23734 > j) {
                        return C17596.m41126(position + ((long) c17714.m41485()));
                    }
                    iM41486 = c17714.m41485();
                    j2 = jM23734;
                }
                int iM41483 = c17714.m41483();
                if (c17714.m41457() < 10) {
                    c17714.m41484(iM41483);
                } else {
                    c17714.m41478(9);
                    int iM41456 = c17714.m41456() & 7;
                    if (c17714.m41457() < iM41456) {
                        c17714.m41484(iM41483);
                    } else {
                        c17714.m41478(iM41456);
                        if (c17714.m41457() < 4) {
                            c17714.m41484(iM41483);
                        } else {
                            if (C7118.m19133(c17714.m41485(), c17714.m41482()) == 443) {
                                c17714.m41478(4);
                                int iM41464 = c17714.m41464();
                                if (c17714.m41457() < iM41464) {
                                    c17714.m41484(iM41483);
                                } else {
                                    c17714.m41478(iM41464);
                                    while (c17714.m41457() >= 4) {
                                        iM19133 = C7118.m19133(c17714.m41485(), c17714.m41482());
                                        if (iM19133 == 442 || iM19133 == 441 || (iM19133 >>> 8) != 1) {
                                            break;
                                        }
                                        c17714.m41478(4);
                                        if (c17714.m41457() < 2) {
                                            c17714.m41484(iM41483);
                                            break;
                                        }
                                        c17714.m41484(Math.min(c17714.m41483(), c17714.m41485() + c17714.m41464()));
                                    }
                                }
                            } else {
                                while (c17714.m41457() >= 4) {
                                    iM19133 = C7118.m19133(c17714.m41485(), c17714.m41482());
                                    if (iM19133 == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                iM41485 = c17714.m41485();
            }
        }
        if (j2 != -9223372036854775807L) {
            return C17596.m41129(j2, position + ((long) iM41485));
        }
        return C17596.f53767;
    }

    @Override // l.InterfaceC14773
    /* JADX INFO: renamed from: ֫ */
    public final void mo27215() {
        byte[] bArr = C3603.f11423;
        C17714 c17714 = this.f40205;
        c17714.getClass();
        c17714.m41462(bArr.length, bArr);
    }
}
