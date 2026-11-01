package p067l;

/* JADX INFO: renamed from: l.᩺֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68HB */
/* JADX INFO: loaded from: classes.dex */
public final class C23885 implements InterfaceC2565 {

    /* JADX INFO: renamed from: ֫ */
    public int f75854;

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC17178 f75855;

    /* JADX INFO: renamed from: ۡ */
    public long f75856;

    /* JADX INFO: renamed from: ۧ */
    public boolean f75858;

    /* JADX INFO: renamed from: ܺ */
    public C11157 f75860;

    /* JADX INFO: renamed from: ܽ */
    public boolean f75861;

    /* JADX INFO: renamed from: ܿ */
    public int f75862;

    /* JADX INFO: renamed from: ᩳ */
    public int f75863;

    /* JADX INFO: renamed from: ᩷ */
    public boolean f75864;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f75865;

    /* JADX INFO: renamed from: ܳ */
    public final C17861 f75859 = new C17861(new byte[10], 10);

    /* JADX INFO: renamed from: ۢ */
    public int f75857 = 0;

    public C23885(InterfaceC17178 interfaceC17178) {
        this.f75855 = interfaceC17178;
    }

    @Override // p067l.InterfaceC2565
    /* JADX INFO: renamed from: ֫ */
    public final void mo3865(C11157 c11157, InterfaceC23116 interfaceC23116, C20672 c20672) {
        this.f75860 = c11157;
        this.f75855.mo3398(interfaceC23116, c20672);
    }

    @Override // p067l.InterfaceC2565
    /* JADX INFO: renamed from: ֫ */
    public final void mo3863() {
        this.f75857 = 0;
        this.f75854 = 0;
        this.f75864 = false;
        this.f75855.mo3395();
    }

    @Override // p067l.InterfaceC2565
    /* JADX INFO: renamed from: ֫ */
    public final void mo3864(int i, C19203 c19203) {
        C23877.m52958(this.f75860);
        int i2 = i & 1;
        int i3 = -1;
        int i4 = 2;
        InterfaceC17178 interfaceC17178 = this.f75855;
        if (i2 != 0) {
            int i5 = this.f75857;
            if (i5 != 0 && i5 != 1) {
                if (i5 == 2) {
                    C21334.m48351("Unexpected start indicator reading extended header");
                } else {
                    if (i5 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f75862 != -1) {
                        C21334.m48351("Unexpected start indicator: expected " + this.f75862 + " more bytes");
                    }
                    interfaceC17178.mo3399(c19203.m43729() == 0);
                }
            }
            this.f75857 = 1;
            this.f75854 = 0;
        }
        while (c19203.m43703() > 0) {
            int i6 = this.f75857;
            if (i6 != 0) {
                C17861 c17861 = this.f75859;
                if (i6 != 1) {
                    if (i6 == i4) {
                        if (m52974(c19203, c17861.f53313, Math.min(10, this.f75863)) && m52974(c19203, (byte[]) null, this.f75863)) {
                            c17861.m40569(0);
                            this.f75856 = -9223372036854775807L;
                            if (this.f75865) {
                                c17861.m40566(4);
                                long jM40558 = ((long) c17861.m40558(3)) << 30;
                                c17861.m40566(1);
                                long jM40559 = jM40558 | ((long) (c17861.m40558(15) << 15));
                                c17861.m40566(1);
                                long jM405510 = jM40559 | ((long) c17861.m40558(15));
                                c17861.m40566(1);
                                if (!this.f75864 && this.f75861) {
                                    c17861.m40566(4);
                                    long jM405511 = ((long) c17861.m40558(3)) << 30;
                                    c17861.m40566(1);
                                    long jM405512 = jM405511 | ((long) (c17861.m40558(15) << 15));
                                    c17861.m40566(1);
                                    long jM405513 = jM405512 | ((long) c17861.m40558(15));
                                    c17861.m40566(1);
                                    this.f75860.m25735(jM405513);
                                    this.f75864 = true;
                                }
                                this.f75856 = this.f75860.m25735(jM405510);
                            }
                            i |= this.f75858 ? 4 : 0;
                            interfaceC17178.mo3396(i, this.f75856);
                            this.f75857 = 3;
                            this.f75854 = 0;
                        }
                    } else {
                        if (i6 != 3) {
                            throw new IllegalStateException();
                        }
                        int iM43703 = c19203.m43703();
                        int i7 = this.f75862;
                        int i8 = i7 == i3 ? 0 : iM43703 - i7;
                        if (i8 > 0) {
                            iM43703 -= i8;
                            c19203.m43732(c19203.m43731() + iM43703);
                        }
                        interfaceC17178.mo3397(c19203);
                        int i9 = this.f75862;
                        if (i9 != i3) {
                            int i10 = i9 - iM43703;
                            this.f75862 = i10;
                            if (i10 == 0) {
                                interfaceC17178.mo3399(false);
                                this.f75857 = 1;
                                this.f75854 = 0;
                            }
                        }
                    }
                } else if (m52974(c19203, c17861.f53313, 9)) {
                    this.f75857 = m52975() ? 2 : 0;
                    this.f75854 = 0;
                }
            } else {
                c19203.m43724(c19203.m43703());
            }
            i3 = -1;
            i4 = 2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m52976(boolean z) {
        return this.f75857 == 3 && this.f75862 == -1 && !(z && (this.f75855 instanceof C5780)) && (!z || m52975());
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m52974(C19203 c19203, byte[] bArr, int i) {
        int iMin = Math.min(c19203.m43703(), i - this.f75854);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c19203.m43724(iMin);
        } else {
            c19203.m43707(this.f75854, iMin, bArr);
        }
        int i2 = this.f75854 + iMin;
        this.f75854 = i2;
        return i2 == i;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m52975() {
        C17861 c17861 = this.f75859;
        c17861.m40569(0);
        int iM40558 = c17861.m40558(24);
        if (iM40558 != 1) {
            C10050.m23419(iM40558, "Unexpected start code prefix: ");
            this.f75862 = -1;
            return false;
        }
        c17861.m40566(8);
        int iM40559 = c17861.m40558(16);
        c17861.m40566(5);
        this.f75858 = c17861.m40567();
        c17861.m40566(2);
        this.f75865 = c17861.m40567();
        this.f75861 = c17861.m40567();
        c17861.m40566(6);
        int iM405510 = c17861.m40558(8);
        this.f75863 = iM405510;
        if (iM40559 == 0) {
            this.f75862 = -1;
            return true;
        }
        int i = (iM40559 - 3) - iM405510;
        this.f75862 = i;
        if (i < 0) {
            C21334.m48351("Found negative packet payload size: " + this.f75862);
            this.f75862 = -1;
        }
        return true;
    }
}
