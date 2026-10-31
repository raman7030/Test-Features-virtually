package l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܰۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8N2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13530 implements InterfaceC1368, InterfaceC9505 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C17714 f40350;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f40351;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long[][] f40352;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f40353;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C17714 f40354;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f40355;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f40356;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C17714 f40357;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ArrayList f40358;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayDeque f40359;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f40360;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f40361;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f40362;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C17805 f40363;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C17714 f40364;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6950 f40365;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f40366;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f40367;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f40368;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f40369;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f40370;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17714 f40371;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f40372;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f40373;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public AbstractC14545 f40374 = AbstractC14545.of();

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public C2633 f40375;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long f40376;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f40377;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f40378;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f40379;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C22703[] f40380;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public long f40381;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo6829() {
        return true;
    }

    public C13530(InterfaceC6950 interfaceC6950, int i) {
        this.f40365 = interfaceC6950;
        this.f40353 = i;
        this.f40351 = (i & 4) != 0 ? 3 : 0;
        this.f40363 = new C17805();
        this.f40358 = new ArrayList();
        this.f40371 = new C17714(16);
        this.f40359 = new ArrayDeque();
        this.f40357 = new C17714(C16509.f50737);
        this.f40350 = new C17714(6);
        this.f40354 = new C17714();
        this.f40356 = -1;
        this.f40362 = InterfaceC21830.f69942;
        this.f40380 = new C22703[0];
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        InterfaceC3860 interfaceC3860M40114 = C17099.m40114(interfaceC8424, (this.f40353 & 2) != 0);
        this.f40374 = interfaceC3860M40114 != null ? AbstractC14545.of((Object) interfaceC3860M40114) : AbstractC14545.of();
        return interfaceC3860M40114 == null;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return this.f40374;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        if ((this.f40353 & 16) == 0) {
            interfaceC21830 = new C9067(interfaceC21830, this.f40365);
        }
        this.f40362 = interfaceC21830;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f40359.clear();
        this.f40373 = 0;
        this.f40356 = -1;
        this.f40369 = 0;
        this.f40378 = 0;
        this.f40379 = 0;
        this.f40355 = false;
        if (j == 0) {
            if (this.f40351 == 3) {
                this.f40363.m41735();
                this.f40358.clear();
                return;
            } else {
                this.f40351 = 0;
                this.f40373 = 0;
                return;
            }
        }
        for (C22703 c22703 : this.f40380) {
            C20628 c20628 = c22703.f73349;
            int iM11036 = C3603.m11036(c20628.f66358, j2, false);
            while (true) {
                if (iM11036 < 0) {
                    iM11036 = -1;
                    break;
                } else if ((c20628.f66353[iM11036] & 1) != 0) {
                    break;
                } else {
                    iM11036--;
                }
            }
            if (iM11036 == -1) {
                iM11036 = c20628.m47166(j2);
            }
            c22703.f73347 = iM11036;
            C0331 c0331 = c22703.f73350;
            if (c0331 != null) {
                c0331.m1750();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:144:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:155:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:158:0x02d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:159:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:169:0x030c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0321  */
    /* JADX WARN: Code duplicated, block: B:180:0x0365 A[PHI: r14
      0x0365: PHI (r14v5 int) = (r14v4 int), (r14v10 int) binds: [B:156:0x02d1, B:383:0x0365] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:181:0x0369  */
    /* JADX WARN: Code duplicated, block: B:183:0x0377  */
    /* JADX WARN: Code duplicated, block: B:185:0x037b  */
    /* JADX WARN: Code duplicated, block: B:187:0x038e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0392  */
    /* JADX WARN: Code duplicated, block: B:192:0x0399 A[LOOP:4: B:190:0x0395->B:192:0x0399, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:198:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:200:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:201:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:246:0x049d  */
    /* JADX WARN: Code duplicated, block: B:251:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:272:0x052c  */
    /* JADX WARN: Code duplicated, block: B:273:0x053f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0545  */
    /* JADX WARN: Code duplicated, block: B:282:0x055d  */
    /* JADX WARN: Code duplicated, block: B:285:0x0571  */
    /* JADX WARN: Code duplicated, block: B:349:0x0653  */
    /* JADX WARN: Code duplicated, block: B:351:0x0662  */
    /* JADX WARN: Code duplicated, block: B:356:0x0691  */
    /* JADX WARN: Code duplicated, block: B:357:0x0695  */
    /* JADX WARN: Code duplicated, block: B:368:0x06a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x04b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x069f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x0350 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:386:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:387:0x0344 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:391:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x02e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x03b0 A[EDGE_INSN: B:394:0x03b0->B:193:0x03b0 BREAK  A[LOOP:4: B:190:0x0395->B:192:0x0399], SYNTHETIC] */
    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) throws C9080 {
        C23615 c23616;
        long j;
        long length;
        C0780 c0780;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        long j5;
        boolean z;
        C14276 c14276;
        C17714 c17714;
        int[] iArr;
        int[] iArr2;
        int i3;
        boolean z2;
        char c;
        int i4;
        C0331 c0331;
        long j6;
        int i5;
        int i6;
        int i7;
        C17714 c17715;
        byte[] bArrM41482;
        int i8;
        int i9;
        int iM38881;
        int i10;
        int iM41493;
        C8353 c8353;
        C11415 c11415;
        boolean z3;
        boolean z4;
        int i11;
        C23615 c23617 = c23615;
        while (true) {
            int i12 = this.f40351;
            ArrayDeque arrayDeque = this.f40359;
            int i13 = this.f40353;
            C17714 c17716 = this.f40354;
            if (i12 == 0) {
                c23616 = c23617;
                int i14 = this.f40373;
                C17714 c17717 = this.f40371;
                if (i14 == 0) {
                    if (interfaceC8424.mo22063(true, 0, 8, c17717.m41482())) {
                        this.f40373 = 8;
                        c17717.m41484(0);
                        this.f40372 = c17717.m41479();
                        this.f40368 = c17717.m41493();
                        j = this.f40372;
                        if (j == 1) {
                            interfaceC8424.readFully(c17717.m41482(), 8, 8);
                            this.f40373 += 8;
                            this.f40372 = c17717.m41466();
                        } else if (j == 0) {
                            length = interfaceC8424.getLength();
                            if (length == -1) {
                                length = c0780.f2885;
                            }
                            if (length != -1) {
                                this.f40372 = (length - interfaceC8424.getPosition()) + ((long) this.f40373);
                            }
                        }
                        j2 = this.f40372;
                        i = this.f40373;
                        if (j2 >= i) {
                            throw C9080.m23441("Atom size less than header length (unsupported).");
                        }
                        i2 = this.f40368;
                        if (i2 != 1836019574) {
                            long position = interfaceC8424.getPosition();
                            j3 = this.f40372;
                            j4 = this.f40373;
                            j5 = (position + j3) - j4;
                            if (j3 != j4) {
                                c17716.m41481(8);
                                interfaceC8424.mo22061(0, 8, c17716.m41482());
                                C21998.m49490(c17716);
                                interfaceC8424.mo22070(c17716.m41485());
                                interfaceC8424.mo22066();
                            }
                            arrayDeque.push(new C0780(this.f40368, j5));
                            if (this.f40372 != this.f40373) {
                                this.f40351 = 0;
                                this.f40373 = 0;
                            } else {
                                m32568(j5);
                            }
                        } else {
                            long position2 = interfaceC8424.getPosition();
                            j3 = this.f40372;
                            j4 = this.f40373;
                            j5 = (position2 + j3) - j4;
                            if (j3 != j4) {
                                c17716.m41481(8);
                                interfaceC8424.mo22061(0, 8, c17716.m41482());
                                C21998.m49490(c17716);
                                interfaceC8424.mo22070(c17716.m41485());
                                interfaceC8424.mo22066();
                            }
                            arrayDeque.push(new C0780(this.f40368, j5));
                            if (this.f40372 != this.f40373) {
                                this.f40351 = 0;
                                this.f40373 = 0;
                            } else {
                                m32568(j5);
                            }
                        }
                        z = true;
                    } else {
                        if (this.f40361 == 2 && (i13 & 2) != 0) {
                            InterfaceC19383 interfaceC19383Mo3429 = this.f40362.mo3429(0, 4);
                            C2633 c2633 = this.f40375;
                            C23896 c23896 = c2633 == null ? null : new C23896(c2633);
                            C1297 c1297 = new C1297();
                            c1297.m4449(c23896);
                            interfaceC19383Mo3429.mo8456(c1297.m4440());
                            this.f40362.mo3431();
                            this.f40362.mo3430(new C20794(-9223372036854775807L));
                        }
                        z = false;
                    }
                } else {
                    j = this.f40372;
                    if (j == 1) {
                        interfaceC8424.readFully(c17717.m41482(), 8, 8);
                        this.f40373 += 8;
                        this.f40372 = c17717.m41466();
                    } else if (j == 0) {
                        length = interfaceC8424.getLength();
                        if (length == -1 && (c0780 = (C0780) arrayDeque.peek()) != null) {
                            length = c0780.f2885;
                        }
                        if (length != -1) {
                            this.f40372 = (length - interfaceC8424.getPosition()) + ((long) this.f40373);
                        }
                    }
                    j2 = this.f40372;
                    i = this.f40373;
                    if (j2 >= i) {
                        throw C9080.m23441("Atom size less than header length (unsupported).");
                    }
                    i2 = this.f40368;
                    if (i2 != 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473 || i2 == 1635284069) {
                        long position3 = interfaceC8424.getPosition();
                        j3 = this.f40372;
                        j4 = this.f40373;
                        j5 = (position3 + j3) - j4;
                        if (j3 != j4 && this.f40368 == 1835365473) {
                            c17716.m41481(8);
                            interfaceC8424.mo22061(0, 8, c17716.m41482());
                            C21998.m49490(c17716);
                            interfaceC8424.mo22070(c17716.m41485());
                            interfaceC8424.mo22066();
                        }
                        arrayDeque.push(new C0780(this.f40368, j5));
                        if (this.f40372 != this.f40373) {
                            this.f40351 = 0;
                            this.f40373 = 0;
                        } else {
                            m32568(j5);
                        }
                    } else if (i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124) {
                        C22632.m50634(i == 8);
                        C22632.m50634(this.f40372 <= 2147483647L);
                        C17714 c17718 = new C17714((int) this.f40372);
                        System.arraycopy(c17717.m41482(), 0, c17718.m41482(), 0, 8);
                        this.f40364 = c17718;
                        this.f40351 = 1;
                    } else {
                        long position4 = interfaceC8424.getPosition();
                        long j7 = this.f40373;
                        long j8 = position4 - j7;
                        if (this.f40368 == 1836086884) {
                            this.f40375 = new C2633(0L, j8, -9223372036854775807L, j8 + j7, this.f40372 - j7);
                        }
                        this.f40364 = null;
                        this.f40351 = 1;
                    }
                    z = true;
                }
                if (!z) {
                    return -1;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new IllegalStateException();
                        }
                        this.f40363.m41736(interfaceC8424, c23617, this.f40358);
                        if (c23617.f76532 != 0) {
                            return 1;
                        }
                        this.f40351 = 0;
                        this.f40373 = 0;
                        return 1;
                    }
                    long position5 = interfaceC8424.getPosition();
                    if (this.f40356 == -1) {
                        boolean z5 = true;
                        int i15 = 0;
                        long j9 = C13132.FOREVER_NS;
                        boolean z6 = true;
                        long j10 = C13132.FOREVER_NS;
                        int i16 = -1;
                        int i17 = -1;
                        long j11 = C13132.FOREVER_NS;
                        while (true) {
                            C22703[] c22703Arr = this.f40380;
                            if (i15 >= c22703Arr.length) {
                                break;
                            }
                            C22703 c22703 = c22703Arr[i15];
                            int i18 = c22703.f73347;
                            C20628 c20628 = c22703.f73349;
                            if (i18 != c20628.f66356) {
                                long j12 = c20628.f66357[i18];
                                long[][] jArr = this.f40352;
                                String str = C3603.f11424;
                                long j13 = jArr[i15][i18];
                                long j14 = j12 - position5;
                                boolean z7 = j14 < 0 || j14 >= 262144;
                                if ((!z7 && z5) || (z7 == z5 && j14 < j11)) {
                                    i17 = i15;
                                    z5 = z7;
                                    j11 = j14;
                                    j10 = j13;
                                }
                                if (j13 < j9) {
                                    i16 = i15;
                                    z6 = z7;
                                    j9 = j13;
                                }
                            }
                            i15++;
                        }
                        int i19 = (j9 == C13132.FOREVER_NS || !z6 || j10 < j9 + 10485760) ? i17 : i16;
                        this.f40356 = i19;
                        if (i19 == -1) {
                            return -1;
                        }
                    }
                    C22703 c22704 = this.f40380[this.f40356];
                    InterfaceC19383 interfaceC19383 = c22704.f73346;
                    C20628 c20629 = c22704.f73349;
                    C14276 c14277 = c22704.f73348;
                    int i20 = c22704.f73347;
                    long[] jArr2 = c20629.f66357;
                    int[] iArr3 = c20629.f66353;
                    int[] iArr4 = c20629.f66354;
                    long j15 = jArr2[i20];
                    C17714 c17719 = c17716;
                    long j16 = j15 + this.f40376;
                    int length2 = iArr4[i20];
                    C0331 c0332 = c22704.f73350;
                    long j17 = (j16 - position5) + ((long) this.f40369);
                    if (j17 < 0 || j17 >= 262144) {
                        c23615.f76532 = j16;
                        return 1;
                    }
                    int i21 = c14277.f43013;
                    int i22 = c14277.f43021;
                    if (i21 == 1) {
                        j17 += 8;
                        length2 -= 8;
                    }
                    interfaceC8424.mo22070((int) j17);
                    if (c22704.f73345 && this.f40369 == 0 && this.f40378 == 0 && this.f40379 == 0 && (iArr3[i20] & 1) != 0) {
                        if (length2 > 4194304) {
                            c22704.f73345 = false;
                            c11415 = null;
                            i13 = i13;
                            i22 = i22;
                            c14276 = c14277;
                            c17714 = c17719;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i3 = i20;
                        } else {
                            byte[] bArr = new byte[length2];
                            try {
                                interfaceC8424.mo22061(0, length2, bArr);
                                interfaceC8424.mo22066();
                                if (i22 <= 0 || i22 > 4) {
                                    c14276 = c14277;
                                    c17714 = c17719;
                                    iArr = iArr3;
                                } else {
                                    int i23 = 0;
                                    int i24 = 0;
                                    int i25 = 0;
                                    boolean z8 = false;
                                    boolean z9 = false;
                                    boolean z10 = false;
                                    while (true) {
                                        if (i25 < length2) {
                                            iArr = iArr3;
                                            if (length2 - i25 < i22) {
                                                c14276 = c14277;
                                                c17714 = c17719;
                                            } else {
                                                int i26 = 0;
                                                c17714 = c17719;
                                                int i27 = 0;
                                                while (i27 < i22) {
                                                    i26 = (i26 << 8) | (bArr[i25 + i27] & 255);
                                                    i27++;
                                                    c14277 = c14277;
                                                }
                                                c14276 = c14277;
                                                int i28 = i25 + i22;
                                                if (i26 >= 2 && i26 <= length2 - i28) {
                                                    int i29 = (bArr[i28] & 126) >> 1;
                                                    int i30 = i26 + 4;
                                                    int i31 = i23 + i30;
                                                    if (i29 == 32 || i29 == 33 || i29 == 34) {
                                                        i24 += i30;
                                                        boolean z11 = z8 | (i29 == 32);
                                                        boolean z12 = z9 | (i29 == 33);
                                                        z8 = z11;
                                                        z10 |= i29 == 34;
                                                        z9 = z12;
                                                    }
                                                    i25 = i28 + i26;
                                                    i23 = i31;
                                                    iArr3 = iArr;
                                                    c17719 = c17714;
                                                    c14277 = c14276;
                                                }
                                            }
                                        } else {
                                            c14276 = c14277;
                                            c17714 = c17719;
                                            iArr = iArr3;
                                            if (z8 && z9 && z10) {
                                                byte[] bArr2 = new byte[i23];
                                                byte[] bArr3 = new byte[i24];
                                                int i32 = 0;
                                                int i33 = 0;
                                                int i34 = 0;
                                                while (i33 < length2) {
                                                    int i35 = 0;
                                                    int[] iArr5 = iArr4;
                                                    int i36 = 0;
                                                    while (i36 < i22) {
                                                        i35 = (i35 << 8) | (bArr[i33 + i36] & 255);
                                                        i36++;
                                                        i20 = i20;
                                                    }
                                                    int i37 = i20;
                                                    int i38 = i33 + i22;
                                                    int i39 = (bArr[i38] & 126) >> 1;
                                                    byte[] bArr4 = C16509.f50737;
                                                    int i40 = i22;
                                                    int i41 = i13;
                                                    System.arraycopy(bArr4, 0, bArr2, i34, 4);
                                                    int i42 = i34 + 4;
                                                    System.arraycopy(bArr, i38, bArr2, i42, i35);
                                                    i34 = i42 + i35;
                                                    if (i39 == 32 || i39 == 33 || i39 == 34) {
                                                        System.arraycopy(bArr4, 0, bArr3, i32, 4);
                                                        int i43 = i32 + 4;
                                                        System.arraycopy(bArr, i38, bArr3, i43, i35);
                                                        i32 = i43 + i35;
                                                    }
                                                    i33 = i38 + i35;
                                                    i22 = i40;
                                                    iArr4 = iArr5;
                                                    i20 = i37;
                                                    i13 = i41;
                                                }
                                                i13 = i13;
                                                i22 = i22;
                                                iArr2 = iArr4;
                                                i3 = i20;
                                                c11415 = new C11415(bArr3, bArr2);
                                            }
                                            c22704.f73345 = false;
                                        }
                                    }
                                }
                                iArr2 = iArr4;
                                i3 = i20;
                                c11415 = null;
                                c22704.f73345 = false;
                            } catch (Throwable th) {
                                interfaceC8424.mo22066();
                                throw th;
                            }
                        }
                        if (c11415 != null) {
                            byte[] bArr5 = c11415.f34119;
                            C1297 c1297M21948 = c22704.f73344.m21948();
                            c1297M21948.m4446((List) AbstractC14545.of((Object) c11415.f34118));
                            C8353 c8353M4440 = c1297M21948.m4440();
                            c22704.f73344 = c8353M4440;
                            interfaceC19383.mo8456(c8353M4440);
                            interfaceC19383.mo8453(bArr5.length, new C17714(bArr5));
                            interfaceC8424.mo22070(length2);
                            this.f40369 = length2;
                            this.f40378 = bArr5.length;
                            length2 = bArr5.length;
                            this.f40379 = 0;
                            z2 = true;
                            this.f40355 = true;
                        }
                        if (z2) {
                            c = 1;
                        } else {
                            c8353 = c22704.f73344;
                            if (C11003.equals(c8353.f25614, "video/avc") ? !C11003.equals(c8353.f25614, "video/hevc") || (i13 & 128) == 0 : (i13 & 32) == 0) {
                                c = 1;
                                this.f40355 = true;
                            } else {
                                c = 1;
                            }
                        }
                        if (!z2) {
                            i4 = length2;
                            c0331 = c0332;
                        } else if (i22 != 0) {
                            c17715 = this.f40350;
                            bArrM41482 = c17715.m41482();
                            bArrM41482[0] = 0;
                            bArrM41482[c] = 0;
                            bArrM41482[2] = 0;
                            i8 = 4 - i22;
                            length2 += i8;
                            while (this.f40378 < length2) {
                                i9 = this.f40379;
                                if (i9 == 0) {
                                    if (!this.f40355 || C16509.m38881(c22704.f73344) + i22 > iArr2[i3] - this.f40369) {
                                        iM38881 = 0;
                                        i10 = i22;
                                    } else {
                                        iM38881 = C16509.m38881(c22704.f73344);
                                        i10 = i22 + iM38881;
                                    }
                                    interfaceC8424.readFully(bArrM41482, i8, i10);
                                    this.f40369 += i10;
                                    c17715.m41484(0);
                                    iM41493 = c17715.m41493();
                                    if (iM41493 >= 0) {
                                        throw C9080.m23440("Invalid NAL length", (Throwable) null);
                                    }
                                    this.f40379 = iM41493 - iM38881;
                                    C17714 c177110 = this.f40357;
                                    c177110.m41484(0);
                                    interfaceC19383.mo8453(4, c177110);
                                    this.f40378 += 4;
                                    if (iM38881 > 0) {
                                        interfaceC19383.mo8453(iM38881, c17715);
                                        this.f40378 += iM38881;
                                        if (C16509.m38888(bArrM41482, iM38881, c22704.f73344)) {
                                            this.f40355 = true;
                                        }
                                    }
                                } else {
                                    int iMo8451 = interfaceC19383.mo8451((InterfaceC9765) interfaceC8424, i9, false);
                                    this.f40369 += iMo8451;
                                    this.f40378 += iMo8451;
                                    this.f40379 -= iMo8451;
                                }
                            }
                            i4 = length2;
                            c0331 = c0332;
                        } else {
                            if ("audio/ac4".equals(c14276.f43020.f25614)) {
                                if (this.f40378 == 0) {
                                    C17714 c177111 = c17714;
                                    C13653.m32807(length2, c177111);
                                    interfaceC19383.mo8453(7, c177111);
                                    this.f40378 += 7;
                                }
                                length2 += 7;
                                c0331 = c0332;
                            } else if (c0332 != null) {
                                c0331 = c0332;
                                c0331.m1751(interfaceC8424);
                            }
                            c0331 = c0332;
                            while (true) {
                                i7 = this.f40378;
                                if (i7 < length2) {
                                    break;
                                }
                                int iMo8452 = interfaceC19383.mo8451((InterfaceC9765) interfaceC8424, length2 - i7, false);
                                this.f40369 += iMo8452;
                                this.f40378 += iMo8452;
                                this.f40379 -= iMo8452;
                            }
                            i4 = length2;
                        }
                        j6 = c20629.f66358[i3];
                        i5 = iArr[i3];
                        if (!this.f40355) {
                            i5 |= 67108864;
                        }
                        if (c0331 != null) {
                            c0331.m1752(interfaceC19383, j6, i5, i4, 0, null);
                            i6 = 1;
                            if (i3 + 1 == c20629.f66356) {
                                c0331.m1753(interfaceC19383, null);
                            }
                        } else {
                            interfaceC19383.mo8455(j6, i5, i4, 0, null);
                            i6 = 1;
                        }
                        c22704.f73347 += i6;
                        this.f40356 = -1;
                        this.f40369 = 0;
                        this.f40378 = 0;
                        this.f40379 = 0;
                        this.f40355 = false;
                        return 0;
                    }
                    i13 = i13;
                    i22 = i22;
                    c14276 = c14277;
                    c17714 = c17719;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    i3 = i20;
                    z2 = false;
                    if (z2) {
                        c8353 = c22704.f73344;
                        if (C11003.equals(c8353.f25614, "video/avc")) {
                            c = 1;
                            this.f40355 = true;
                        } else {
                            c = 1;
                            this.f40355 = true;
                        }
                    } else {
                        c = 1;
                    }
                    if (!z2) {
                        i4 = length2;
                        c0331 = c0332;
                    } else if (i22 != 0) {
                        c17715 = this.f40350;
                        bArrM41482 = c17715.m41482();
                        bArrM41482[0] = 0;
                        bArrM41482[c] = 0;
                        bArrM41482[2] = 0;
                        i8 = 4 - i22;
                        length2 += i8;
                        while (this.f40378 < length2) {
                            i9 = this.f40379;
                            if (i9 == 0) {
                                if (this.f40355) {
                                    iM38881 = 0;
                                    i10 = i22;
                                } else {
                                    iM38881 = 0;
                                    i10 = i22;
                                }
                                interfaceC8424.readFully(bArrM41482, i8, i10);
                                this.f40369 += i10;
                                c17715.m41484(0);
                                iM41493 = c17715.m41493();
                                if (iM41493 >= 0) {
                                    throw C9080.m23440("Invalid NAL length", (Throwable) null);
                                }
                                this.f40379 = iM41493 - iM38881;
                                C17714 c177112 = this.f40357;
                                c177112.m41484(0);
                                interfaceC19383.mo8453(4, c177112);
                                this.f40378 += 4;
                                if (iM38881 > 0) {
                                    interfaceC19383.mo8453(iM38881, c17715);
                                    this.f40378 += iM38881;
                                    if (C16509.m38888(bArrM41482, iM38881, c22704.f73344)) {
                                        this.f40355 = true;
                                    }
                                }
                            } else {
                                int iMo8453 = interfaceC19383.mo8451((InterfaceC9765) interfaceC8424, i9, false);
                                this.f40369 += iMo8453;
                                this.f40378 += iMo8453;
                                this.f40379 -= iMo8453;
                            }
                        }
                        i4 = length2;
                        c0331 = c0332;
                    } else {
                        if ("audio/ac4".equals(c14276.f43020.f25614)) {
                            if (this.f40378 == 0) {
                                C17714 c177113 = c17714;
                                C13653.m32807(length2, c177113);
                                interfaceC19383.mo8453(7, c177113);
                                this.f40378 += 7;
                            }
                            length2 += 7;
                            c0331 = c0332;
                        } else if (c0332 != null) {
                            c0331 = c0332;
                            c0331.m1751(interfaceC8424);
                        }
                        c0331 = c0332;
                        while (true) {
                            i7 = this.f40378;
                            if (i7 < length2) {
                                break;
                                break;
                            }
                            int iMo8454 = interfaceC19383.mo8451((InterfaceC9765) interfaceC8424, length2 - i7, false);
                            this.f40369 += iMo8454;
                            this.f40378 += iMo8454;
                            this.f40379 -= iMo8454;
                        }
                        i4 = length2;
                    }
                    j6 = c20629.f66358[i3];
                    i5 = iArr[i3];
                    if (!this.f40355) {
                        i5 |= 67108864;
                    }
                    if (c0331 != null) {
                        c0331.m1752(interfaceC19383, j6, i5, i4, 0, null);
                        i6 = 1;
                        if (i3 + 1 == c20629.f66356) {
                            c0331.m1753(interfaceC19383, null);
                        }
                    } else {
                        interfaceC19383.mo8455(j6, i5, i4, 0, null);
                        i6 = 1;
                    }
                    c22704.f73347 += i6;
                    this.f40356 = -1;
                    this.f40369 = 0;
                    this.f40378 = 0;
                    this.f40379 = 0;
                    this.f40355 = false;
                    return 0;
                }
                c23616 = c23617;
                long j18 = this.f40372 - ((long) this.f40373);
                long position6 = interfaceC8424.getPosition() + j18;
                C17714 c177114 = this.f40364;
                if (c177114 != null) {
                    interfaceC8424.readFully(c177114.m41482(), this.f40373, (int) j18);
                    if (this.f40368 == 1718909296) {
                        this.f40366 = true;
                        c177114.m41484(8);
                        int iM41494 = c177114.m41493();
                        if (iM41494 != 1751476579) {
                            i11 = iM41494 != 1903435808 ? 0 : 1;
                        } else {
                            i11 = 2;
                        }
                        if (i11 == 0) {
                            c177114.m41478(4);
                            do {
                                if (c177114.m41457() <= 0) {
                                    i11 = 0;
                                    break;
                                }
                                int iM41495 = c177114.m41493();
                                if (iM41495 != 1751476579) {
                                    i11 = iM41495 != 1903435808 ? 0 : 1;
                                } else {
                                    i11 = 2;
                                }
                            } while (i11 == 0);
                        }
                        this.f40361 = i11;
                    } else if (!arrayDeque.isEmpty()) {
                        ((C0780) arrayDeque.peek()).f2886.add(new C7836(this.f40368, c177114));
                    }
                } else {
                    if (!this.f40366 && this.f40368 == 1835295092) {
                        this.f40361 = 1;
                    }
                    if (j18 < 262144) {
                        interfaceC8424.mo22070((int) j18);
                    } else {
                        c23616.f76532 = interfaceC8424.getPosition() + j18;
                        z3 = true;
                    }
                    m32568(position6);
                    if (this.f40367) {
                        this.f40360 = true;
                        c23616.f76532 = this.f40381;
                        this.f40367 = false;
                        z3 = true;
                    }
                    if (z3 || this.f40351 == 2) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return 1;
                    }
                }
                z3 = false;
                m32568(position6);
                if (this.f40367) {
                    this.f40360 = true;
                    c23616.f76532 = this.f40381;
                    this.f40367 = false;
                    z3 = true;
                }
                if (z3) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                if (z4) {
                    return 1;
                }
            }
            c23617 = c23616;
        }
    }

    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ۜ */
    public final long mo6827() {
        return this.f40377;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x008c A[LOOP:2: B:38:0x0083->B:42:0x008c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b6 A[LOOP:3: B:52:0x00ad->B:56:0x00b6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2 A[EDGE_INSN: B:74:0x00d2->B:66:0x00d2 BREAK  A[LOOP:1: B:33:0x006c->B:65:0x00ce], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0090 A[EDGE_INSN: B:80:0x0090->B:44:0x0090 BREAK  A[LOOP:2: B:38:0x0083->B:42:0x008c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00ba A[EDGE_INSN: B:82:0x00ba->B:58:0x00ba BREAK  A[LOOP:3: B:52:0x00ad->B:56:0x00b6], SYNTHETIC] */
    @Override // l.InterfaceC9505
    /* JADX INFO: renamed from: ֫ */
    public final C6682 mo1721(long j) {
        long jMin;
        long j2;
        long j3;
        int i;
        C22703[] c22703Arr;
        C8799 c8799;
        C20628 c20628;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iM11036;
        int iM11037;
        int iM47166;
        long j4 = j;
        C22703[] c22703Arr2 = this.f40380;
        int length = c22703Arr2.length;
        C8799 c87910 = C8799.f26802;
        if (length == 0) {
            return new C6682(c87910, c87910);
        }
        int i2 = this.f40370;
        boolean z = false;
        int i3 = -1;
        long jMin2 = -1;
        if (i2 != -1) {
            C20628 c20629 = c22703Arr2[i2].f73349;
            long[] jArr3 = c20629.f66358;
            int iM11038 = C3603.m11036(jArr3, j4, false);
            while (true) {
                if (iM11038 < 0) {
                    iM11038 = -1;
                    break;
                }
                if ((c20629.f66353[iM11038] & 1) != 0) {
                    break;
                }
                iM11038--;
            }
            if (iM11038 == -1) {
                iM11038 = c20629.m47166(j4);
            }
            long[] jArr4 = c20629.f66357;
            if (iM11038 == -1) {
                return new C6682(c87910, c87910);
            }
            j2 = jArr3[iM11038];
            jMin = jArr4[iM11038];
            if (j2 >= j4 || iM11038 >= c20629.f66356 - 1 || (iM47166 = c20629.m47166(j4)) == -1 || iM47166 == iM11038) {
                j4 = j2;
            } else {
                j3 = jArr3[iM47166];
                jMin2 = jArr4[iM47166];
            }
            i = 0;
            while (true) {
                c22703Arr = this.f40380;
                if (i < c22703Arr.length) {
                    break;
                }
                if (i != this.f40370) {
                    c20628 = c22703Arr[i].f73349;
                    jArr = c20628.f66357;
                    iArr = c20628.f66353;
                    jArr2 = c20628.f66358;
                    iM11036 = C3603.m11036(jArr2, j2, z);
                    while (true) {
                        if (iM11036 >= 0) {
                            iM11036 = -1;
                            break;
                        }
                        if ((iArr[iM11036] & 1) != 0) {
                            break;
                        }
                        iM11036--;
                    }
                    if (iM11036 == i3) {
                        iM11036 = c20628.m47166(j2);
                    }
                    if (iM11036 != i3) {
                        jMin = Math.min(jArr[iM11036], jMin);
                    }
                    if (j3 != -9223372036854775807L) {
                        z = false;
                        iM11037 = C3603.m11036(jArr2, j3, false);
                        while (true) {
                            if (iM11037 >= 0) {
                                iM11037 = -1;
                                break;
                            }
                            if ((iArr[iM11037] & 1) != 0) {
                                break;
                            }
                            iM11037--;
                        }
                        if (iM11037 == -1) {
                            iM11037 = c20628.m47166(j3);
                        }
                        if (iM11037 == -1) {
                            jMin2 = Math.min(jArr[iM11037], jMin2);
                        }
                    } else {
                        z = false;
                    }
                }
                i++;
                i3 = -1;
            }
            c8799 = new C8799(j2, jMin);
            if (j3 == -9223372036854775807L) {
                return new C6682(c8799, c8799);
            }
            return new C6682(c8799, new C8799(j3, jMin2));
        }
        jMin = C13132.FOREVER_NS;
        j2 = j4;
        j3 = -9223372036854775807L;
        i = 0;
        while (true) {
            c22703Arr = this.f40380;
            if (i < c22703Arr.length) {
                break;
                break;
            }
            if (i != this.f40370) {
                c20628 = c22703Arr[i].f73349;
                jArr = c20628.f66357;
                iArr = c20628.f66353;
                jArr2 = c20628.f66358;
                iM11036 = C3603.m11036(jArr2, j2, z);
                while (true) {
                    if (iM11036 >= 0) {
                        iM11036 = -1;
                        break;
                    }
                    if ((iArr[iM11036] & 1) != 0) {
                        break;
                        break;
                    }
                    iM11036--;
                }
                if (iM11036 == i3) {
                    iM11036 = c20628.m47166(j2);
                }
                if (iM11036 != i3) {
                    jMin = Math.min(jArr[iM11036], jMin);
                }
                if (j3 != -9223372036854775807L) {
                    z = false;
                    iM11037 = C3603.m11036(jArr2, j3, false);
                    while (true) {
                        if (iM11037 >= 0) {
                            iM11037 = -1;
                            break;
                        }
                        if ((iArr[iM11037] & 1) != 0) {
                            break;
                            break;
                        }
                        iM11037--;
                    }
                    if (iM11037 == -1) {
                        iM11037 = c20628.m47166(j3);
                    }
                    if (iM11037 == -1) {
                        jMin2 = Math.min(jArr[iM11037], jMin2);
                    }
                } else {
                    z = false;
                }
            }
            i++;
            i3 = -1;
        }
        c8799 = new C8799(j2, jMin);
        if (j3 == -9223372036854775807L) {
            return new C6682(c8799, c8799);
        }
        return new C6682(c8799, new C8799(j3, jMin2));
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0002 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m32568(long j) {
        ArrayList arrayList;
        C23896 c23896M49488;
        ArrayDeque arrayDeque;
        C23896 c23896;
        ArrayList arrayList2;
        C7718 c7718;
        long j2;
        C23896 c23897;
        String str;
        ArrayList arrayList3;
        C0074 c0074M25165;
        int i;
        while (true) {
            ArrayDeque arrayDeque2 = this.f40359;
            if (arrayDeque2.isEmpty() || ((C0780) arrayDeque2.peek()).f2885 != j) {
                break;
            }
            C0780 c0780 = (C0780) arrayDeque2.pop();
            if (c0780.f45441 == 1836019574) {
                C0780 c0780M2974 = c0780.m2974(1835365473);
                ArrayList arrayList4 = new ArrayList();
                int i2 = this.f40353;
                if (c0780M2974 != null) {
                    c23896M49488 = C21998.m49488(c0780M2974);
                    if (this.f40360) {
                        C22632.m50632(c23896M49488);
                        C0074 c0074M25166 = C10004.m25165(c23896M49488, "auxiliary.tracks.interleaved");
                        if (c0074M25166 != null && c0074M25166.f991[0] == 0) {
                            this.f40376 = this.f40381 + 16;
                        }
                        C0074 c0074M25167 = C10004.m25165(c23896M49488, "auxiliary.tracks.map");
                        C22632.m50632(c0074M25167);
                        ArrayList arrayListM1028 = c0074M25167.m1028();
                        ArrayList arrayList5 = new ArrayList(arrayListM1028.size());
                        for (int i3 = 0; i3 < arrayListM1028.size(); i3++) {
                            int iIntValue = ((Integer) arrayListM1028.get(i3)).intValue();
                            if (iIntValue == 0) {
                                i = 1;
                            } else if (iIntValue == 1) {
                                i = 2;
                            } else if (iIntValue != 2) {
                                i = iIntValue != 3 ? 0 : 4;
                            } else {
                                i = 3;
                            }
                            arrayList5.add(Integer.valueOf(i));
                        }
                        arrayList = arrayList5;
                    } else {
                        if (c23896M49488 != null && (i2 & 64) != 0 && (c0074M25165 = C10004.m25165(c23896M49488, "auxiliary.tracks.offset")) != null) {
                            long jM41466 = new C17714(c0074M25165.f991).m41466();
                            if (jM41466 > 0) {
                                this.f40381 = jM41466;
                                this.f40367 = true;
                                arrayDeque = arrayDeque2;
                            }
                            arrayDeque.clear();
                            if (!this.f40367) {
                                this.f40351 = 2;
                            }
                        }
                        arrayList = arrayList4;
                    }
                } else {
                    arrayList = arrayList4;
                    c23896M49488 = null;
                }
                ArrayList arrayList6 = new ArrayList();
                boolean z = this.f40361 == 1;
                C7718 c7719 = new C7718();
                C7836 c7836M2975 = c0780.m2975(1969517665);
                if (c7836M2975 != null) {
                    C23896 c23896M49489 = C21998.m49489(c7836M2975);
                    c7719.m20671(c23896M49489);
                    c23896 = c23896M49489;
                } else {
                    c23896 = null;
                }
                C7836 c7836M2976 = c0780.m2975(1836476516);
                c7836M2976.getClass();
                C23896 c23898 = new C23896(C21998.m49493(c7836M2976.f24238));
                C7718 c77110 = c7719;
                ArrayList arrayListM49485 = C21998.m49485(c0780, c7719, -9223372036854775807L, null, (i2 & 1) != 0, z, new C23868());
                if (this.f40360) {
                    boolean z2 = arrayList.size() == arrayListM49485.size();
                    Locale locale = Locale.US;
                    C22632.m50633(C19373.m44634("The number of auxiliary track types from metadata (", arrayList.size(), ") is not same as the number of auxiliary tracks (", MotionUtils.EASING_TYPE_FORMAT_END, arrayListM49485.size()), z2);
                }
                String strM16227 = C5770.m16227(arrayListM49485);
                long j3 = -9223372036854775807L;
                int i4 = 0;
                int i5 = 0;
                int size = -1;
                while (i5 < arrayListM49485.size()) {
                    C20628 c20628 = (C20628) arrayListM49485.get(i5);
                    int i6 = c20628.f66356;
                    ArrayList arrayList7 = arrayListM49485;
                    int i7 = c20628.f66355;
                    if (i6 == 0) {
                        c7718 = c77110;
                        arrayList2 = arrayList;
                        str = strM16227;
                        ArrayList arrayList8 = arrayList6;
                        c23897 = c23896M49488;
                        arrayList3 = arrayList8;
                    } else {
                        C14276 c14276 = c20628.f66352;
                        ArrayList arrayList9 = arrayList6;
                        InterfaceC21830 interfaceC21830 = this.f40362;
                        int i8 = i4 + 1;
                        String str2 = strM16227;
                        int i9 = c14276.f43011;
                        C23896 c23899 = c23896M49488;
                        C8353 c8353 = c14276.f43020;
                        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(i4, i9);
                        C22703 c22703 = new C22703(c14276, c20628, interfaceC19383Mo3429);
                        C7718 c77111 = c77110;
                        ArrayList arrayList10 = arrayList;
                        long j4 = c14276.f43010;
                        if (j4 == -9223372036854775807L) {
                            j4 = c20628.f66351;
                        }
                        interfaceC19383Mo3429.mo8454(j4);
                        long jMax = Math.max(j3, j4);
                        int i10 = "audio/true-hd".equals(c8353.f25614) ? i7 * 16 : i7 + 30;
                        C1297 c1297M21948 = c8353.m21948();
                        c1297M21948.m4451(i10);
                        if (i9 == 2) {
                            int i11 = c8353.f25608;
                            if ((i2 & 8) != 0) {
                                i11 |= size == -1 ? 1 : 2;
                            }
                            if (this.f40360) {
                                i11 |= 32768;
                                arrayList2 = arrayList10;
                                c1297M21948.m4461(((Integer) arrayList2.get(i5)).intValue());
                            } else {
                                arrayList2 = arrayList10;
                            }
                            c1297M21948.m4454(i11);
                        } else {
                            arrayList2 = arrayList10;
                        }
                        if (i9 == 1) {
                            c7718 = c77111;
                            int i12 = c7718.f23852;
                            j2 = jMax;
                            if (i12 != -1 && c7718.f23853 != -1) {
                                c1297M21948.m4477(i12);
                                c1297M21948.m4458(c7718.f23853);
                            }
                        } else {
                            c7718 = c77111;
                            j2 = jMax;
                        }
                        C23896 c238910 = c8353.f25612;
                        ArrayList arrayList11 = this.f40358;
                        c23897 = c23899;
                        C10004.m25169(i9, c23897, c1297M21948, c238910, arrayList11.isEmpty() ? null : new C23896(arrayList11), c23896, c23898);
                        str = str2;
                        c1297M21948.m4462(str);
                        C8353 c8353M4440 = c1297M21948.m4440();
                        c22703.f73344 = c8353M4440;
                        c22703.f73345 = c14276.f43019 && c14276.f43021 != 0 && C11003.equals(c8353.f25614, "video/hevc");
                        interfaceC19383Mo3429.mo8456(c8353M4440);
                        if (i9 == 2 && size == -1) {
                            size = arrayList9.size();
                        }
                        arrayList3 = arrayList9;
                        arrayList3.add(c22703);
                        i4 = i8;
                        j3 = j2;
                    }
                    i5++;
                    strM16227 = str;
                    c77110 = c7718;
                    arrayList = arrayList2;
                    arrayListM49485 = arrayList7;
                    arrayDeque2 = arrayDeque2;
                    C23896 c238911 = c23897;
                    arrayList6 = arrayList3;
                    c23896M49488 = c238911;
                }
                arrayDeque = arrayDeque2;
                this.f40370 = size;
                this.f40377 = j3;
                C22703[] c22703Arr = (C22703[]) arrayList6.toArray(new C22703[0]);
                this.f40380 = c22703Arr;
                long[][] jArr = new long[c22703Arr.length][];
                int[] iArr = new int[c22703Arr.length];
                long[] jArr2 = new long[c22703Arr.length];
                boolean[] zArr = new boolean[c22703Arr.length];
                for (int i13 = 0; i13 < c22703Arr.length; i13++) {
                    jArr[i13] = new long[c22703Arr[i13].f73349.f66356];
                    jArr2[i13] = c22703Arr[i13].f73349.f66358[0];
                }
                int i14 = 0;
                long j5 = 0;
                while (i14 < c22703Arr.length) {
                    long j6 = C13132.FOREVER_NS;
                    int i15 = -1;
                    for (int i16 = 0; i16 < c22703Arr.length; i16++) {
                        if (!zArr[i16]) {
                            long j7 = jArr2[i16];
                            if (j7 <= j6) {
                                i15 = i16;
                                j6 = j7;
                            }
                        }
                    }
                    int i17 = iArr[i15];
                    long[] jArr3 = jArr[i15];
                    jArr3[i17] = j5;
                    C20628 c20629 = c22703Arr[i15].f73349;
                    j5 += (long) c20629.f66354[i17];
                    int i18 = i17 + 1;
                    iArr[i15] = i18;
                    if (i18 < jArr3.length) {
                        jArr2[i15] = c20629.f66358[i18];
                    } else {
                        zArr[i15] = true;
                        i14++;
                    }
                }
                this.f40352 = jArr;
                this.f40362.mo3431();
                this.f40362.mo3430(this);
                arrayDeque.clear();
                if (!this.f40367) {
                    this.f40351 = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((C0780) arrayDeque2.peek()).f2884.add(c0780);
            }
        }
        if (this.f40351 != 2) {
            this.f40351 = 0;
            this.f40373 = 0;
        }
    }
}
