package l;

/* JADX INFO: renamed from: l.᩺֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68HB */
/* JADX INFO: loaded from: classes.dex */
public final class C22640 implements InterfaceC0207 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f73128;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15583 f73129;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public long f73130;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f73132;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C9248 f73134;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f73135;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f73136;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f73137;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f73138;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f73139;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C16302 f73133 = new C16302(new byte[10], 10);

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f73131 = 0;

    public C22640(InterfaceC15583 interfaceC15583) {
        this.f73129 = interfaceC15583;
    }

    @Override // l.InterfaceC0207
    /* JADX INFO: renamed from: ֫ */
    public final void mo1452(C9248 c9248, InterfaceC21830 interfaceC21830, C19259 c19259) {
        this.f73134 = c9248;
        this.f73129.mo1003(interfaceC21830, c19259);
    }

    @Override // l.InterfaceC0207
    /* JADX INFO: renamed from: ֫ */
    public final void mo1450() {
        this.f73131 = 0;
        this.f73128 = 0;
        this.f73138 = false;
        this.f73129.mo1000();
    }

    @Override // l.InterfaceC0207
    /* JADX INFO: renamed from: ֫ */
    public final void mo1451(int i, C17714 c17714) {
        C22632.m50632(this.f73134);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        InterfaceC15583 interfaceC15583 = this.f73129;
        if (i2 != 0) {
            int i5 = this.f73131;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    C19956.m46037("Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f73136 != -1) {
                        C19956.m46037("Unexpected start indicator: expected " + this.f73136 + " more bytes");
                    }
                    interfaceC15583.mo1004(c17714.m41483() == 0);
                }
            }
            this.f73131 = 1;
            this.f73128 = 0;
        }
        while (c17714.m41457() > 0) {
            int i6 = this.f73131;
            if (i6 != 0) {
                C16302 c16302 = this.f73133;
                if (i6 != 1) {
                    if (i6 == i4) {
                        if (m50648(c17714, c16302.f50146, Math.min(10, this.f73137)) && m50648(c17714, (byte[]) null, this.f73137)) {
                            c16302.m38354(0);
                            this.f73130 = -9223372036854775807L;
                            if (this.f73139) {
                                c16302.m38351(4);
                                long jM38343 = ((long) c16302.m38343(3)) << 30;
                                c16302.m38351(1);
                                long jM38344 = jM38343 | ((long) (c16302.m38343(15) << 15));
                                c16302.m38351(1);
                                long jM38345 = jM38344 | ((long) c16302.m38343(15));
                                c16302.m38351(1);
                                if (!this.f73138 && this.f73135) {
                                    c16302.m38351(4);
                                    long jM38346 = ((long) c16302.m38343(3)) << 30;
                                    c16302.m38351(1);
                                    long jM38347 = jM38346 | ((long) (c16302.m38343(15) << 15));
                                    c16302.m38351(1);
                                    long jM38348 = jM38347 | ((long) c16302.m38343(15));
                                    c16302.m38351(1);
                                    this.f73134.m23734(jM38348);
                                    this.f73138 = true;
                                }
                                this.f73130 = this.f73134.m23734(jM38345);
                            }
                            i |= this.f73132 ? 4 : 0;
                            interfaceC15583.mo1001(i, this.f73130);
                            this.f73131 = 3;
                            this.f73128 = 0;
                        }
                    } else {
                        if (i6 != 3) {
                            throw new IllegalStateException();
                        }
                        int iM41457 = c17714.m41457();
                        int i7 = this.f73136;
                        int i8 = i7 == i3 ? 0 : iM41457 - i7;
                        if (i8 > 0) {
                            iM41457 -= i8;
                            c17714.m41486(c17714.m41485() + iM41457);
                        }
                        interfaceC15583.mo1002(c17714);
                        int i9 = this.f73136;
                        if (i9 != i3) {
                            int i10 = i9 - iM41457;
                            this.f73136 = i10;
                            if (i10 == 0) {
                                interfaceC15583.mo1004(false);
                                this.f73131 = 1;
                                this.f73128 = 0;
                            }
                        }
                    }
                } else if (m50648(c17714, c16302.f50146, 9)) {
                    this.f73131 = m50649() ? 2 : 0;
                    this.f73128 = 0;
                }
            } else {
                c17714.m41478(c17714.m41457());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50650(boolean z) {
        return this.f73131 == 3 && this.f73136 == -1 && !(z && (this.f73129 instanceof C3590)) && (!z || m50649());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m50648(C17714 c17714, byte[] bArr, int i) {
        int iMin = Math.min(c17714.m41457(), i - this.f73128);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c17714.m41478(iMin);
        } else {
            c17714.m41461(this.f73128, iMin, bArr);
        }
        int i2 = this.f73128 + iMin;
        this.f73128 = i2;
        return i2 == i;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m50649() {
        C16302 c16302 = this.f73133;
        c16302.m38354(0);
        int iM38343 = c16302.m38343(24);
        if (iM38343 != 1) {
            C8083.m21451(iM38343, "Unexpected start code prefix: ");
            this.f73136 = -1;
            return false;
        }
        c16302.m38351(8);
        int iM38344 = c16302.m38343(16);
        c16302.m38351(5);
        this.f73132 = c16302.m38352();
        c16302.m38351(2);
        this.f73139 = c16302.m38352();
        this.f73135 = c16302.m38352();
        c16302.m38351(6);
        int iM38345 = c16302.m38343(8);
        this.f73137 = iM38345;
        if (iM38344 == 0) {
            this.f73136 = -1;
            return true;
        }
        int i = (iM38344 - 3) - iM38345;
        this.f73136 = i;
        if (i < 0) {
            C19956.m46037("Found negative packet payload size: " + this.f73136);
            this.f73136 = -1;
        }
        return true;
    }
}
