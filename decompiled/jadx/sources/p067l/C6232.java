package p067l;

/* JADX INFO: renamed from: l.ۘܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8JS */
/* JADX INFO: loaded from: classes3.dex */
public class C6232 implements InterfaceC20790 {

    /* JADX INFO: renamed from: ֡ */
    public boolean f15700;

    /* JADX INFO: renamed from: ֨ */
    public int f15701;

    /* JADX INFO: renamed from: ֫ */
    public int f15702;

    /* JADX INFO: renamed from: ۘ */
    public int f15705;

    /* JADX INFO: renamed from: ۚ */
    public int f15707;

    /* JADX INFO: renamed from: ۛ */
    public Object f15708;

    /* JADX INFO: renamed from: ۜ */
    public final InterfaceC6601 f15709;

    /* JADX INFO: renamed from: ۠ */
    public final C22326 f15710;

    /* JADX INFO: renamed from: ۡ */
    public boolean f15711;

    /* JADX INFO: renamed from: ۤ */
    public boolean f15713;

    /* JADX INFO: renamed from: ۫ */
    public C10307 f15716;

    /* JADX INFO: renamed from: ۬ */
    public C10307 f15717;

    /* JADX INFO: renamed from: ܰ */
    public long f15718;

    /* JADX INFO: renamed from: ܳ */
    public C10307 f15719;

    /* JADX INFO: renamed from: ܶ */
    public long f15720;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC2577 f15723;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f15725;

    /* JADX INFO: renamed from: ᩻ */
    public final C16658 f15732;

    /* JADX INFO: renamed from: ᩷ */
    public final C10926 f15728 = new C10926();

    /* JADX INFO: renamed from: ܽ */
    public int f15722 = 1000;

    /* JADX INFO: renamed from: ᩶ */
    public long[] f15727 = new long[1000];

    /* JADX INFO: renamed from: ᩵ */
    public long[] f15726 = new long[1000];

    /* JADX INFO: renamed from: ۗ */
    public long[] f15704 = new long[1000];

    /* JADX INFO: renamed from: ۢ */
    public int[] f15712 = new int[1000];

    /* JADX INFO: renamed from: ᩹ */
    public int[] f15730 = new int[1000];

    /* JADX INFO: renamed from: ᩳ */
    public C20119[] f15724 = new C20119[1000];

    /* JADX INFO: renamed from: ᩸ */
    public final C5561 f15729 = new C5561(new C11597());

    /* JADX INFO: renamed from: ۙ */
    public long f15706 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ܺ */
    public long f15721 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ۖ */
    public long f15703 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ۨ */
    public boolean f15715 = true;

    /* JADX INFO: renamed from: ᩺ */
    public boolean f15731 = true;

    /* JADX INFO: renamed from: ۧ */
    public boolean f15714 = true;

    /* JADX INFO: renamed from: ֫ */
    private synchronized void m14107(long j, int i, long j2, int i2, C20119 c20119) {
        int i3 = this.f15705;
        if (i3 > 0) {
            int iM14114 = m14114(i3 - 1);
            C23877.m52957(this.f15726[iM14114] + ((long) this.f15730[iM14114]) <= j2);
        }
        this.f15711 = (536870912 & i) != 0;
        this.f15703 = Math.max(this.f15703, j);
        int iM14115 = m14114(this.f15705);
        this.f15704[iM14115] = j;
        this.f15726[iM14115] = j2;
        this.f15730[iM14115] = i2;
        this.f15712[iM14115] = i;
        this.f15724[iM14115] = c20119;
        this.f15727[iM14115] = this.f15718;
        if (this.f15729.m12297() || !((C17630) this.f15729.m12294()).f52676.equals(this.f15716)) {
            C10307 c10307 = this.f15716;
            c10307.getClass();
            InterfaceC6601 interfaceC6601 = this.f15709;
            this.f15729.m12293(m14124(), new C17630(c10307, interfaceC6601 != null ? interfaceC6601.mo9700(this.f15732, c10307) : InterfaceC21354.f67333));
        }
        int i4 = this.f15705 + 1;
        this.f15705 = i4;
        int i5 = this.f15722;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            C20119[] c20119Arr = new C20119[i6];
            int i7 = this.f15701;
            int i8 = i5 - i7;
            System.arraycopy(this.f15726, i7, jArr2, 0, i8);
            System.arraycopy(this.f15704, this.f15701, jArr3, 0, i8);
            System.arraycopy(this.f15712, this.f15701, iArr, 0, i8);
            System.arraycopy(this.f15730, this.f15701, iArr2, 0, i8);
            System.arraycopy(this.f15724, this.f15701, c20119Arr, 0, i8);
            System.arraycopy(this.f15727, this.f15701, jArr, 0, i8);
            int i9 = this.f15701;
            System.arraycopy(this.f15726, 0, jArr2, i8, i9);
            System.arraycopy(this.f15704, 0, jArr3, i8, i9);
            System.arraycopy(this.f15712, 0, iArr, i8, i9);
            System.arraycopy(this.f15730, 0, iArr2, i8, i9);
            System.arraycopy(this.f15724, 0, c20119Arr, i8, i9);
            System.arraycopy(this.f15727, 0, jArr, i8, i9);
            this.f15726 = jArr2;
            this.f15704 = jArr3;
            this.f15712 = iArr;
            this.f15730 = iArr2;
            this.f15724 = c20119Arr;
            this.f15727 = jArr;
            this.f15701 = 0;
            this.f15722 = i6;
        }
    }

    /* JADX INFO: renamed from: ᩵ */
    private synchronized void m14113() {
        this.f15707 = 0;
        this.f15710.m50147();
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized int m14115(long j, boolean z) {
        int iM14114 = m14114(this.f15707);
        int i = this.f15707;
        int i2 = this.f15705;
        if ((i != i2) && j >= this.f15704[iM14114]) {
            if (j > this.f15703 && z) {
                return i2 - i;
            }
            int iM14106 = m14106(iM14114, i2 - i, j, true);
            if (iM14106 == -1) {
                return 0;
            }
            return iM14106;
        }
        return 0;
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo10501(long j) {
    }

    /* JADX INFO: renamed from: ֫ */
    public final synchronized boolean m14121(boolean z) {
        C10307 c10307;
        boolean z2 = false;
        if (this.f15707 != this.f15705) {
            if (((C17630) this.f15729.m12296(m14133())).f52676 != this.f15719) {
                return true;
            }
            return m14109(m14114(this.f15707));
        }
        if (z || this.f15711 || ((c10307 = this.f15716) != null && c10307 != this.f15719)) {
            z2 = true;
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۢ */
    public final synchronized boolean m14126() {
        return this.f15711;
    }

    /* JADX INFO: renamed from: ܺ */
    public final synchronized long m14134() {
        return this.f15707 != this.f15705 ? this.f15727[m14114(this.f15707)] : this.f15718;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    /* JADX INFO: renamed from: ܽ */
    public final synchronized void m14136(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f15707 + i <= this.f15705) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        } else {
            z = false;
        }
        C23877.m52957(z);
        this.f15707 += i;
    }

    /* JADX INFO: renamed from: ܿ */
    public final synchronized long m14138() {
        return Math.max(this.f15721, m14110(this.f15707));
    }

    /* JADX INFO: renamed from: ᩳ */
    public final synchronized long m14139() {
        return this.f15703;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final synchronized C10307 m14143() {
        return this.f15715 ? null : this.f15716;
    }

    public C6232(InterfaceC23016 interfaceC23016, InterfaceC6601 interfaceC6601, C16658 c16658) {
        this.f15709 = interfaceC6601;
        this.f15732 = c16658;
        this.f15710 = new C22326(interfaceC23016);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10500(int i, C19203 c19203) {
        mo10504(c19203, i, 0);
    }

    /* JADX INFO: renamed from: ۘ */
    public final void m14123() {
        m14130(true);
        InterfaceC2577 interfaceC2577 = this.f15723;
        if (interfaceC2577 != null) {
            interfaceC2577.mo3885(this.f15732);
            this.f15723 = null;
            this.f15719 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14130(boolean z) {
        this.f15710.m50144();
        this.f15705 = 0;
        this.f15702 = 0;
        this.f15701 = 0;
        this.f15707 = 0;
        this.f15731 = true;
        this.f15706 = Long.MIN_VALUE;
        this.f15721 = Long.MIN_VALUE;
        this.f15703 = Long.MIN_VALUE;
        this.f15711 = false;
        this.f15729.m12291();
        if (z) {
            this.f15717 = null;
            this.f15716 = null;
            this.f15715 = true;
            this.f15714 = true;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m14137(long j) {
        this.f15706 = j;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m14140(long j) {
        this.f15718 = j;
    }

    /* JADX INFO: renamed from: ᩴ */
    public final void m14141() {
        this.f15700 = true;
    }

    /* JADX INFO: renamed from: ۜ */
    public final int m14124() {
        return this.f15702 + this.f15705;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14118(int i) {
        this.f15710.m50145(m14111(i));
    }

    /* JADX INFO: renamed from: ۖ */
    public final void m14122() {
        m14117();
        InterfaceC2577 interfaceC2577 = this.f15723;
        if (interfaceC2577 != null) {
            interfaceC2577.mo3885(this.f15732);
            this.f15723 = null;
            this.f15719 = null;
        }
    }

    /* JADX INFO: renamed from: ۡ */
    public final void m14125() throws C20684 {
        InterfaceC2577 interfaceC2577 = this.f15723;
        if (interfaceC2577 == null || interfaceC2577.getState() != 1) {
            return;
        }
        C20684 error = this.f15723.getError();
        error.getClass();
        throw error;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m14135() {
        return this.f15702;
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m14133() {
        return this.f15702 + this.f15707;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m14116(C5221 c5221, C23128 c23128, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        C10926 c10926 = this.f15728;
        synchronized (this) {
            c23128.f72705 = false;
            i2 = -3;
            if (this.f15707 != this.f15705) {
                C10307 c10307 = ((C17630) this.f15729.m12296(m14133())).f52676;
                if (z2 || c10307 != this.f15719) {
                    m14108(c10307, c5221);
                    i2 = -5;
                } else {
                    int iM14114 = m14114(this.f15707);
                    if (m14109(iM14114)) {
                        c23128.m14569(this.f15712[iM14114]);
                        if (this.f15707 == this.f15705 - 1 && (z || this.f15711)) {
                            c23128.m14567(536870912);
                        }
                        c23128.f72706 = this.f15704[iM14114];
                        c10926.f30291 = this.f15730[iM14114];
                        c10926.f30290 = this.f15726[iM14114];
                        c10926.f30289 = this.f15724[iM14114];
                        i2 = -4;
                    } else {
                        c23128.f72705 = true;
                    }
                }
            } else if (z || this.f15711) {
                c23128.m14569(4);
                c23128.f72706 = Long.MIN_VALUE;
                i2 = -4;
            } else {
                C10307 c10308 = this.f15716;
                if (c10308 != null && (z2 || c10308 != this.f15719)) {
                    m14108(c10308, c5221);
                    i2 = -5;
                }
            }
        }
        if (i2 == -4 && !c23128.m14573()) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    this.f15710.m50143(c23128, this.f15728);
                } else {
                    this.f15710.m50146(c23128, this.f15728);
                }
            }
            if (!z3) {
                this.f15707++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m14131(int i) {
        m14113();
        int i2 = this.f15702;
        if (i >= i2 && i <= this.f15705 + i2) {
            this.f15706 = Long.MIN_VALUE;
            this.f15707 = i - i2;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    public final synchronized boolean m14132(long j, boolean z) {
        int iM14106;
        try {
            m14113();
            int iM14114 = m14114(this.f15707);
            int i = this.f15707;
            int i2 = this.f15705;
            if ((i != i2) && j >= this.f15704[iM14114] && (j <= this.f15703 || z)) {
                if (this.f15714) {
                    iM14106 = i2 - i;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= iM14106) {
                            if (!z) {
                                iM14106 = -1;
                                break;
                            }
                            break;
                        }
                        if (this.f15704[iM14114] >= j) {
                            iM14106 = i3;
                            break;
                        }
                        iM14114++;
                        if (iM14114 == this.f15722) {
                            iM14114 = 0;
                        }
                        i3++;
                    }
                } else {
                    iM14106 = m14106(iM14114, i2 - i, j, true);
                }
                if (iM14106 == -1) {
                    return false;
                }
                this.f15706 = j;
                this.f15707 += iM14106;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14119(long j, boolean z, boolean z2) {
        long jM14112;
        int i;
        C22326 c22326 = this.f15710;
        synchronized (this) {
            try {
                int i2 = this.f15705;
                jM14112 = -1;
                if (i2 != 0) {
                    long[] jArr = this.f15704;
                    int i3 = this.f15701;
                    if (j >= jArr[i3]) {
                        int iM14106 = m14106(i3, (!z2 || (i = this.f15707) == i2) ? i2 : i + 1, j, z);
                        if (iM14106 != -1) {
                            jM14112 = m14112(iM14106);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c22326.m50142(jM14112);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14128() {
        long jM14112;
        C22326 c22326 = this.f15710;
        synchronized (this) {
            int i = this.f15707;
            jM14112 = i == 0 ? -1L : m14112(i);
        }
        c22326.m50142(jM14112);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14117() {
        long jM14112;
        C22326 c22326 = this.f15710;
        synchronized (this) {
            int i = this.f15705;
            jM14112 = i == 0 ? -1L : m14112(i);
        }
        c22326.m50142(jM14112);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m14129(long j) {
        if (this.f15720 != j) {
            this.f15720 = j;
            this.f15713 = true;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m14120(InterfaceC4891 interfaceC4891) {
        this.f15708 = interfaceC4891;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, l.ۖܽۧ] */
    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10503(C10307 c10307) {
        C10307 c10307Mo14127 = mo14127(c10307);
        boolean z = false;
        this.f15713 = false;
        this.f15717 = c10307;
        synchronized (this) {
            this.f15715 = false;
            if (!C12826.equals(c10307Mo14127, this.f15716)) {
                if (this.f15729.m12297() || !((C17630) this.f15729.m12294()).f52676.equals(c10307Mo14127)) {
                    this.f15716 = c10307Mo14127;
                } else {
                    this.f15716 = ((C17630) this.f15729.m12294()).f52676;
                }
                boolean z2 = this.f15714;
                C10307 c10308 = this.f15716;
                this.f15714 = z2 & C11669.m26813(c10308.f28528, c10308.f28533);
                this.f15725 = false;
                z = true;
            }
        }
        ?? r5 = this.f15708;
        if (r5 == 0 || !z) {
            return;
        }
        r5.mo10365();
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final int mo10498(InterfaceC11649 interfaceC11649, int i, boolean z) {
        return this.f15710.m50139(interfaceC11649, i, z);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ۧ */
    public final int mo10505(InterfaceC11649 interfaceC11649, int i, boolean z) {
        return this.f15710.m50139(interfaceC11649, i, z);
    }

    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public final void mo10504(C19203 c19203, int i, int i2) {
        this.f15710.m50141(i, c19203);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    @Override // p067l.InterfaceC20790
    /* JADX INFO: renamed from: ֫ */
    public void mo10502(long j, int i, int i2, int i3, C20119 c20119) {
        int i4;
        if (this.f15713) {
            C10307 c10307 = this.f15717;
            C23877.m52958(c10307);
            mo10503(c10307);
        }
        int i5 = i & 1;
        boolean z = true;
        boolean z2 = i5 != 0;
        if (this.f15731) {
            if (!z2) {
                return;
            } else {
                this.f15731 = false;
            }
        }
        long j2 = this.f15720 + j;
        if (!this.f15714) {
            i4 = i;
        } else {
            if (j2 < this.f15706) {
                return;
            }
            if (i5 == 0) {
                if (!this.f15725) {
                    C21334.m48351("Overriding unexpected non-sync sample for format: " + this.f15716);
                    this.f15725 = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.f15700) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.f15705 == 0) {
                    z = j2 > this.f15721;
                } else if (m14138() >= j2) {
                    z = false;
                } else {
                    int i6 = this.f15705;
                    int iM14114 = m14114(i6 - 1);
                    while (i6 > this.f15707 && this.f15704[iM14114] >= j2) {
                        i6--;
                        iM14114--;
                        if (iM14114 == -1) {
                            iM14114 = this.f15722 - 1;
                        }
                    }
                    m14111(this.f15702 + i6);
                }
            }
            if (!z) {
                return;
            } else {
                this.f15700 = false;
            }
        }
        m14107(j2, i4, (this.f15710.m50140() - ((long) i2)) - ((long) i3), i2, c20119);
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m14142() {
        this.f15713 = true;
    }

    /* JADX INFO: renamed from: ۧ */
    public C10307 mo14127(C10307 c10307) {
        if (this.f15720 == 0 || c10307.f28534 == C14849.FOREVER_NS) {
            return c10307;
        }
        C3601 c3601M23918 = c10307.m23918();
        c3601M23918.m6675(c10307.f28534 + this.f15720);
        return c3601M23918.m6672();
    }

    /* JADX INFO: renamed from: ܿ */
    private long m14111(int i) {
        int iM14124 = m14124() - i;
        boolean z = false;
        C23877.m52957(iM14124 >= 0 && iM14124 <= this.f15705 - this.f15707);
        int i2 = this.f15705 - iM14124;
        this.f15705 = i2;
        this.f15703 = Math.max(this.f15721, m14110(i2));
        if (iM14124 == 0 && this.f15711) {
            z = true;
        }
        this.f15711 = z;
        this.f15729.m12292(i);
        int i3 = this.f15705;
        if (i3 == 0) {
            return 0L;
        }
        int iM14114 = m14114(i3 - 1);
        return this.f15726[iM14114] + ((long) this.f15730[iM14114]);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m14108(C10307 c10307, C5221 c5221) {
        C10307 c10308 = this.f15719;
        boolean z = c10308 == null;
        C21037 c21037 = c10308 == null ? null : c10308.f28516;
        this.f15719 = c10307;
        C21037 c21038 = c10307.f28516;
        InterfaceC6601 interfaceC6601 = this.f15709;
        c5221.f12253 = interfaceC6601 != null ? c10307.m23919(interfaceC6601.mo9695(c10307)) : c10307;
        c5221.f12252 = this.f15723;
        if (interfaceC6601 == null) {
            return;
        }
        if (z || !C12826.equals(c21037, c21038)) {
            InterfaceC2577 interfaceC2577 = this.f15723;
            C16658 c16658 = this.f15732;
            InterfaceC2577 interfaceC2577Mo9696 = interfaceC6601.mo9696(c16658, c10307);
            this.f15723 = interfaceC2577Mo9696;
            c5221.f12252 = interfaceC2577Mo9696;
            if (interfaceC2577 != null) {
                interfaceC2577.mo3885(c16658);
            }
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private boolean m14109(int i) {
        InterfaceC2577 interfaceC2577 = this.f15723;
        if (interfaceC2577 == null || interfaceC2577.getState() == 4) {
            return true;
        }
        return (this.f15712[i] & 1073741824) == 0 && this.f15723.mo3886();
    }

    /* JADX INFO: renamed from: ֫ */
    private int m14106(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f15704[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f15712[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f15722) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᩳ */
    private long m14112(int i) {
        this.f15721 = Math.max(this.f15721, m14110(i));
        this.f15705 -= i;
        int i2 = this.f15702 + i;
        this.f15702 = i2;
        int i3 = this.f15701 + i;
        this.f15701 = i3;
        int i4 = this.f15722;
        if (i3 >= i4) {
            this.f15701 = i3 - i4;
        }
        int i5 = this.f15707 - i;
        this.f15707 = i5;
        if (i5 < 0) {
            this.f15707 = 0;
        }
        this.f15729.m12295(i2);
        if (this.f15705 == 0) {
            int i6 = this.f15701;
            if (i6 == 0) {
                i6 = this.f15722;
            }
            int i7 = i6 - 1;
            return this.f15726[i7] + ((long) this.f15730[i7]);
        }
        return this.f15726[this.f15701];
    }

    /* JADX INFO: renamed from: ܳ */
    private long m14110(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM14114 = m14114(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f15704[iM14114]);
            if ((this.f15712[iM14114] & 1) != 0) {
                return jMax;
            }
            iM14114--;
            if (iM14114 == -1) {
                iM14114 = this.f15722 - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: ᩻ */
    private int m14114(int i) {
        int i2 = this.f15701 + i;
        int i3 = this.f15722;
        return i2 < i3 ? i2 : i2 - i3;
    }
}
