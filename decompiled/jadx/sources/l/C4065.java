package l;

/* JADX INFO: renamed from: l.ۘܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: D8JS */
/* JADX INFO: loaded from: classes3.dex */
public class C4065 implements InterfaceC19383 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f12886;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f12887;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f12888;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f12891;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f12893;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Object f12894;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final InterfaceC4454 f12895;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C20999 f12896;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f12897;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f12899;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8353 f12902;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C8353 f12903;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f12904;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C8353 f12905;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f12906;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC0220 f12909;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f12911;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C15036 f12918;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9004 f12914 = new C9004();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f12908 = 1000;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long[] f12913 = new long[1000];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long[] f12912 = new long[1000];

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long[] f12890 = new long[1000];

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int[] f12898 = new int[1000];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int[] f12916 = new int[1000];

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18677[] f12910 = new C18677[1000];

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C3359 f12915 = new C3359(new C9710());

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f12892 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f12907 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f12889 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f12901 = true;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f12917 = true;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f12900 = true;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private synchronized void m12186(long j, int i, long j2, int i2, C18677 c18677) {
        int i3 = this.f12891;
        if (i3 > 0) {
            int iM12193 = m12193(i3 - 1);
            C22632.m50631(this.f12912[iM12193] + ((long) this.f12916[iM12193]) <= j2);
        }
        this.f12897 = (536870912 & i) != 0;
        this.f12889 = Math.max(this.f12889, j);
        int iM12194 = m12193(this.f12891);
        this.f12890[iM12194] = j;
        this.f12912[iM12194] = j2;
        this.f12916[iM12194] = i2;
        this.f12898[iM12194] = i;
        this.f12910[iM12194] = c18677;
        this.f12913[iM12194] = this.f12904;
        if (this.f12915.m10260() || !((C16058) this.f12915.m10257()).f49513.equals(this.f12902)) {
            C8353 c8353 = this.f12902;
            c8353.getClass();
            InterfaceC4454 interfaceC4454 = this.f12895;
            this.f12915.m10256(m12203(), new C16058(c8353, interfaceC4454 != null ? interfaceC4454.mo7629(this.f12918, c8353) : InterfaceC19977.f64693));
        }
        int i4 = this.f12891 + 1;
        this.f12891 = i4;
        int i5 = this.f12908;
        if (i4 == i5) {
            int i6 = i5 + 1000;
            long[] jArr = new long[i6];
            long[] jArr2 = new long[i6];
            long[] jArr3 = new long[i6];
            int[] iArr = new int[i6];
            int[] iArr2 = new int[i6];
            C18677[] c18677Arr = new C18677[i6];
            int i7 = this.f12887;
            int i8 = i5 - i7;
            System.arraycopy(this.f12912, i7, jArr2, 0, i8);
            System.arraycopy(this.f12890, this.f12887, jArr3, 0, i8);
            System.arraycopy(this.f12898, this.f12887, iArr, 0, i8);
            System.arraycopy(this.f12916, this.f12887, iArr2, 0, i8);
            System.arraycopy(this.f12910, this.f12887, c18677Arr, 0, i8);
            System.arraycopy(this.f12913, this.f12887, jArr, 0, i8);
            int i9 = this.f12887;
            System.arraycopy(this.f12912, 0, jArr2, i8, i9);
            System.arraycopy(this.f12890, 0, jArr3, i8, i9);
            System.arraycopy(this.f12898, 0, iArr, i8, i9);
            System.arraycopy(this.f12916, 0, iArr2, i8, i9);
            System.arraycopy(this.f12910, 0, c18677Arr, i8, i9);
            System.arraycopy(this.f12913, 0, jArr, i8, i9);
            this.f12912 = jArr2;
            this.f12890 = jArr3;
            this.f12898 = iArr;
            this.f12916 = iArr2;
            this.f12910 = c18677Arr;
            this.f12913 = jArr;
            this.f12887 = 0;
            this.f12908 = i6;
        }
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private synchronized void m12192() {
        this.f12893 = 0;
        this.f12896.m47817();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized int m12194(long j, boolean z) {
        int iM12193 = m12193(this.f12893);
        int i = this.f12893;
        int i2 = this.f12891;
        if ((i != i2) && j >= this.f12890[iM12193]) {
            if (j > this.f12889 && z) {
                return i2 - i;
            }
            int iM12185 = m12185(iM12193, i2 - i, j, true);
            if (iM12185 == -1) {
                return 0;
            }
            return iM12185;
        }
        return 0;
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public /* synthetic */ void mo8454(long j) {
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m12200(boolean z) {
        C8353 c8353;
        boolean z2 = false;
        if (this.f12893 != this.f12891) {
            if (((C16058) this.f12915.m10259(m12212())).f49513 != this.f12905) {
                return true;
            }
            return m12188(m12193(this.f12893));
        }
        if (z || this.f12897 || ((c8353 = this.f12902) != null && c8353 != this.f12905)) {
            z2 = true;
        }
        return z2;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m12205() {
        return this.f12897;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final synchronized long m12213() {
        return this.f12893 != this.f12891 ? this.f12913[m12193(this.f12893)] : this.f12904;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x000f  */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final synchronized void m12215(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.f12893 + i <= this.f12891) {
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
        C22632.m50631(z);
        this.f12893 += i;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final synchronized long m12217() {
        return Math.max(this.f12907, m12189(this.f12893));
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final synchronized long m12218() {
        return this.f12889;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final synchronized C8353 m12222() {
        return this.f12901 ? null : this.f12902;
    }

    public C4065(InterfaceC21725 interfaceC21725, InterfaceC4454 interfaceC4454, C15036 c15036) {
        this.f12895 = interfaceC4454;
        this.f12918 = c15036;
        this.f12896 = new C20999(interfaceC21725);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8453(int i, C17714 c17714) {
        mo8457(c17714, i, 0);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m12202() {
        m12209(true);
        InterfaceC0220 interfaceC0220 = this.f12909;
        if (interfaceC0220 != null) {
            interfaceC0220.mo1472(this.f12918);
            this.f12909 = null;
            this.f12905 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12209(boolean z) {
        this.f12896.m47814();
        this.f12891 = 0;
        this.f12888 = 0;
        this.f12887 = 0;
        this.f12893 = 0;
        this.f12917 = true;
        this.f12892 = Long.MIN_VALUE;
        this.f12907 = Long.MIN_VALUE;
        this.f12889 = Long.MIN_VALUE;
        this.f12897 = false;
        this.f12915.m10254();
        if (z) {
            this.f12903 = null;
            this.f12902 = null;
            this.f12901 = true;
            this.f12900 = true;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m12216(long j) {
        this.f12892 = j;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m12219(long j) {
        this.f12904 = j;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m12220() {
        this.f12886 = true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int m12203() {
        return this.f12888 + this.f12891;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12197(int i) {
        this.f12896.m47815(m12190(i));
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m12201() {
        m12196();
        InterfaceC0220 interfaceC0220 = this.f12909;
        if (interfaceC0220 != null) {
            interfaceC0220.mo1472(this.f12918);
            this.f12909 = null;
            this.f12905 = null;
        }
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final void m12204() throws C19272 {
        InterfaceC0220 interfaceC0220 = this.f12909;
        if (interfaceC0220 == null || interfaceC0220.getState() != 1) {
            return;
        }
        C19272 error = this.f12909.getError();
        error.getClass();
        throw error;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m12214() {
        return this.f12888;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m12212() {
        return this.f12888 + this.f12893;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m12195(C3002 c3002, C21843 c21843, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        C9004 c9004 = this.f12914;
        synchronized (this) {
            c21843.f69996 = false;
            i2 = -3;
            if (this.f12893 != this.f12891) {
                C8353 c8353 = ((C16058) this.f12915.m10259(m12212())).f49513;
                if (z2 || c8353 != this.f12905) {
                    m12187(c8353, c3002);
                    i2 = -5;
                } else {
                    int iM12193 = m12193(this.f12893);
                    if (m12188(iM12193)) {
                        c21843.m12693(this.f12898[iM12193]);
                        if (this.f12893 == this.f12891 - 1 && (z || this.f12897)) {
                            c21843.m12691(536870912);
                        }
                        c21843.f69997 = this.f12890[iM12193];
                        c9004.f27357 = this.f12916[iM12193];
                        c9004.f27356 = this.f12912[iM12193];
                        c9004.f27355 = this.f12910[iM12193];
                        i2 = -4;
                    } else {
                        c21843.f69996 = true;
                    }
                }
            } else if (z || this.f12897) {
                c21843.m12693(4);
                c21843.f69997 = Long.MIN_VALUE;
                i2 = -4;
            } else {
                C8353 c8354 = this.f12902;
                if (c8354 != null && (z2 || c8354 != this.f12905)) {
                    m12187(c8354, c3002);
                    i2 = -5;
                }
            }
        }
        if (i2 == -4 && !c21843.m12697()) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    this.f12896.m47813(c21843, this.f12914);
                } else {
                    this.f12896.m47816(c21843, this.f12914);
                }
            }
            if (!z3) {
                this.f12893++;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m12210(int i) {
        m12192();
        int i2 = this.f12888;
        if (i >= i2 && i <= this.f12891 + i2) {
            this.f12892 = Long.MIN_VALUE;
            this.f12893 = i - i2;
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final synchronized boolean m12211(long j, boolean z) {
        int iM12185;
        try {
            m12192();
            int iM12193 = m12193(this.f12893);
            int i = this.f12893;
            int i2 = this.f12891;
            if ((i != i2) && j >= this.f12890[iM12193] && (j <= this.f12889 || z)) {
                if (this.f12900) {
                    iM12185 = i2 - i;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= iM12185) {
                            if (!z) {
                                iM12185 = -1;
                                break;
                            }
                            break;
                        }
                        if (this.f12890[iM12193] >= j) {
                            iM12185 = i3;
                            break;
                        }
                        iM12193++;
                        if (iM12193 == this.f12908) {
                            iM12193 = 0;
                        }
                        i3++;
                    }
                } else {
                    iM12185 = m12185(iM12193, i2 - i, j, true);
                }
                if (iM12185 == -1) {
                    return false;
                }
                this.f12892 = j;
                this.f12893 += iM12185;
                return true;
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12198(long j, boolean z, boolean z2) {
        long jM12191;
        int i;
        C20999 c20999 = this.f12896;
        synchronized (this) {
            try {
                int i2 = this.f12891;
                jM12191 = -1;
                if (i2 != 0) {
                    long[] jArr = this.f12890;
                    int i3 = this.f12887;
                    if (j >= jArr[i3]) {
                        int iM12185 = m12185(i3, (!z2 || (i = this.f12893) == i2) ? i2 : i + 1, j, z);
                        if (iM12185 != -1) {
                            jM12191 = m12191(iM12185);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c20999.m47812(jM12191);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12207() {
        long jM12191;
        C20999 c20999 = this.f12896;
        synchronized (this) {
            int i = this.f12893;
            jM12191 = i == 0 ? -1L : m12191(i);
        }
        c20999.m47812(jM12191);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12196() {
        long jM12191;
        C20999 c20999 = this.f12896;
        synchronized (this) {
            int i = this.f12891;
            jM12191 = i == 0 ? -1L : m12191(i);
        }
        c20999.m47812(jM12191);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m12208(long j) {
        if (this.f12906 != j) {
            this.f12906 = j;
            this.f12899 = true;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m12199(InterfaceC2654 interfaceC2654) {
        this.f12894 = interfaceC2654;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object, l.ۖܽۧ] */
    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8456(C8353 c8353) {
        C8353 c8353Mo12206 = mo12206(c8353);
        boolean z = false;
        this.f12899 = false;
        this.f12903 = c8353;
        synchronized (this) {
            this.f12901 = false;
            if (!C11003.equals(c8353Mo12206, this.f12902)) {
                if (this.f12915.m10260() || !((C16058) this.f12915.m10257()).f49513.equals(c8353Mo12206)) {
                    this.f12902 = c8353Mo12206;
                } else {
                    this.f12902 = ((C16058) this.f12915.m10257()).f49513;
                }
                boolean z2 = this.f12900;
                C8353 c8354 = this.f12902;
                this.f12900 = z2 & C9786.m24798(c8354.f25614, c8354.f25619);
                this.f12911 = false;
                z = true;
            }
        }
        ?? r5 = this.f12894;
        if (r5 == 0 || !z) {
            return;
        }
        r5.mo8321();
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final int mo8451(InterfaceC9765 interfaceC9765, int i, boolean z) {
        return this.f12896.m47809(interfaceC9765, i, z);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ۧ */
    public final int mo8458(InterfaceC9765 interfaceC9765, int i, boolean z) {
        return this.f12896.m47809(interfaceC9765, i, z);
    }

    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public final void mo8457(C17714 c17714, int i, int i2) {
        this.f12896.m47811(i, c17714);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    @Override // l.InterfaceC19383
    /* JADX INFO: renamed from: ֫ */
    public void mo8455(long j, int i, int i2, int i3, C18677 c18677) {
        int i4;
        if (this.f12899) {
            C8353 c8353 = this.f12903;
            C22632.m50632(c8353);
            mo8456(c8353);
        }
        int i5 = i & 1;
        boolean z = true;
        boolean z2 = i5 != 0;
        if (this.f12917) {
            if (!z2) {
                return;
            } else {
                this.f12917 = false;
            }
        }
        long j2 = this.f12906 + j;
        if (!this.f12900) {
            i4 = i;
        } else {
            if (j2 < this.f12892) {
                return;
            }
            if (i5 == 0) {
                if (!this.f12911) {
                    C19956.m46037("Overriding unexpected non-sync sample for format: " + this.f12902);
                    this.f12911 = true;
                }
                i4 = i | 1;
            } else {
                i4 = i;
            }
        }
        if (this.f12886) {
            if (!z2) {
                return;
            }
            synchronized (this) {
                if (this.f12891 == 0) {
                    z = j2 > this.f12907;
                } else if (m12217() >= j2) {
                    z = false;
                } else {
                    int i6 = this.f12891;
                    int iM12193 = m12193(i6 - 1);
                    while (i6 > this.f12893 && this.f12890[iM12193] >= j2) {
                        i6--;
                        iM12193--;
                        if (iM12193 == -1) {
                            iM12193 = this.f12908 - 1;
                        }
                    }
                    m12190(this.f12888 + i6);
                }
            }
            if (!z) {
                return;
            } else {
                this.f12886 = false;
            }
        }
        m12186(j2, i4, (this.f12896.m47810() - ((long) i2)) - ((long) i3), i2, c18677);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m12221() {
        this.f12899 = true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C8353 mo12206(C8353 c8353) {
        if (this.f12906 == 0 || c8353.f25620 == C13132.FOREVER_NS) {
            return c8353;
        }
        C1297 c1297M21948 = c8353.m21948();
        c1297M21948.m4443(c8353.f25620 + this.f12906);
        return c1297M21948.m4440();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private long m12190(int i) {
        int iM12203 = m12203() - i;
        boolean z = false;
        C22632.m50631(iM12203 >= 0 && iM12203 <= this.f12891 - this.f12893);
        int i2 = this.f12891 - iM12203;
        this.f12891 = i2;
        this.f12889 = Math.max(this.f12907, m12189(i2));
        if (iM12203 == 0 && this.f12897) {
            z = true;
        }
        this.f12897 = z;
        this.f12915.m10255(i);
        int i3 = this.f12891;
        if (i3 == 0) {
            return 0L;
        }
        int iM12193 = m12193(i3 - 1);
        return this.f12912[iM12193] + ((long) this.f12916[iM12193]);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m12187(C8353 c8353, C3002 c3002) {
        C8353 c8354 = this.f12905;
        boolean z = c8354 == null;
        C19643 c19643 = c8354 == null ? null : c8354.f25602;
        this.f12905 = c8353;
        C19643 c19644 = c8353.f25602;
        InterfaceC4454 interfaceC4454 = this.f12895;
        c3002.f9455 = interfaceC4454 != null ? c8353.m21949(interfaceC4454.mo7624(c8353)) : c8353;
        c3002.f9454 = this.f12909;
        if (interfaceC4454 == null) {
            return;
        }
        if (z || !C11003.equals(c19643, c19644)) {
            InterfaceC0220 interfaceC0220 = this.f12909;
            C15036 c15036 = this.f12918;
            InterfaceC0220 interfaceC0220Mo7625 = interfaceC4454.mo7625(c15036, c8353);
            this.f12909 = interfaceC0220Mo7625;
            c3002.f9454 = interfaceC0220Mo7625;
            if (interfaceC0220 != null) {
                interfaceC0220.mo1472(c15036);
            }
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m12188(int i) {
        InterfaceC0220 interfaceC0220 = this.f12909;
        if (interfaceC0220 == null || interfaceC0220.getState() == 4) {
            return true;
        }
        return (this.f12898[i] & 1073741824) == 0 && this.f12909.mo1473();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m12185(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.f12890[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.f12898[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.f12908) {
                i = 0;
            }
        }
        return i3;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private long m12191(int i) {
        this.f12907 = Math.max(this.f12907, m12189(i));
        this.f12891 -= i;
        int i2 = this.f12888 + i;
        this.f12888 = i2;
        int i3 = this.f12887 + i;
        this.f12887 = i3;
        int i4 = this.f12908;
        if (i3 >= i4) {
            this.f12887 = i3 - i4;
        }
        int i5 = this.f12893 - i;
        this.f12893 = i5;
        if (i5 < 0) {
            this.f12893 = 0;
        }
        this.f12915.m10258(i2);
        if (this.f12891 == 0) {
            int i6 = this.f12887;
            if (i6 == 0) {
                i6 = this.f12908;
            }
            int i7 = i6 - 1;
            return this.f12912[i7] + ((long) this.f12916[i7]);
        }
        return this.f12912[this.f12887];
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private long m12189(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iM12193 = m12193(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.f12890[iM12193]);
            if ((this.f12898[iM12193] & 1) != 0) {
                return jMax;
            }
            iM12193--;
            if (iM12193 == -1) {
                iM12193 = this.f12908 - 1;
            }
        }
        return jMax;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private int m12193(int i) {
        int i2 = this.f12887 + i;
        int i3 = this.f12908;
        return i2 < i3 ? i2 : i2 - i3;
    }
}
