package p067l;

import com.google.android.material.motion.MotionUtils;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ܰۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: G8N2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15227 implements InterfaceC3669, InterfaceC11402 {

    /* JADX INFO: renamed from: ֡ */
    public final C19203 f43420;

    /* JADX INFO: renamed from: ֨ */
    public int f43421;

    /* JADX INFO: renamed from: ֫ */
    public long[][] f43422;

    /* JADX INFO: renamed from: ۖ */
    public final int f43423;

    /* JADX INFO: renamed from: ۗ */
    public final C19203 f43424;

    /* JADX INFO: renamed from: ۘ */
    public boolean f43425;

    /* JADX INFO: renamed from: ۙ */
    public int f43426;

    /* JADX INFO: renamed from: ۚ */
    public final C19203 f43427;

    /* JADX INFO: renamed from: ۛ */
    public final ArrayList f43428;

    /* JADX INFO: renamed from: ۜ */
    public final ArrayDeque f43429;

    /* JADX INFO: renamed from: ۠ */
    public boolean f43430;

    /* JADX INFO: renamed from: ۡ */
    public int f43431;

    /* JADX INFO: renamed from: ۢ */
    public InterfaceC23116 f43432;

    /* JADX INFO: renamed from: ۤ */
    public final C19290 f43433;

    /* JADX INFO: renamed from: ۧ */
    public C19203 f43434;

    /* JADX INFO: renamed from: ۨ */
    public final InterfaceC8974 f43435;

    /* JADX INFO: renamed from: ۫ */
    public boolean f43436;

    /* JADX INFO: renamed from: ۬ */
    public boolean f43437;

    /* JADX INFO: renamed from: ܳ */
    public int f43438;

    /* JADX INFO: renamed from: ܶ */
    public int f43439;

    /* JADX INFO: renamed from: ܺ */
    public int f43440;

    /* JADX INFO: renamed from: ܽ */
    public final C19203 f43441;

    /* JADX INFO: renamed from: ܿ */
    public long f43442;

    /* JADX INFO: renamed from: ᩳ */
    public int f43443;

    /* JADX INFO: renamed from: ᩴ */
    public AbstractC16192 f43444 = AbstractC16192.m36872of();

    /* JADX INFO: renamed from: ᩵ */
    public C4871 f43445;

    /* JADX INFO: renamed from: ᩶ */
    public long f43446;

    /* JADX INFO: renamed from: ᩷ */
    public long f43447;

    /* JADX INFO: renamed from: ᩸ */
    public int f43448;

    /* JADX INFO: renamed from: ᩹ */
    public int f43449;

    /* JADX INFO: renamed from: ᩺ */
    public C23945[] f43450;

    /* JADX INFO: renamed from: ᩻ */
    public long f43451;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ܿ */
    public final boolean mo8955() {
        return true;
    }

    public C15227(InterfaceC8974 interfaceC8974, int i) {
        this.f43435 = interfaceC8974;
        this.f43423 = i;
        this.f43421 = (i & 4) != 0 ? 3 : 0;
        this.f43433 = new C19290();
        this.f43428 = new ArrayList();
        this.f43441 = new C19203(16);
        this.f43429 = new ArrayDeque();
        this.f43427 = new C19203(C18058.f53916);
        this.f43420 = new C19203(6);
        this.f43424 = new C19203();
        this.f43426 = -1;
        this.f43432 = InterfaceC23116.f72651;
        this.f43450 = new C23945[0];
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        InterfaceC6037 interfaceC6037M42359 = C18619.m42359(interfaceC10375, (this.f43423 & 2) != 0);
        this.f43444 = interfaceC6037M42359 != null ? AbstractC16192.m36873of((Object) interfaceC6037M42359) : AbstractC16192.m36872of();
        return interfaceC6037M42359 == null;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return this.f43444;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        if ((this.f43423 & 16) == 0) {
            interfaceC23116 = new C10986(interfaceC23116, this.f43435);
        }
        this.f43432 = interfaceC23116;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f43429.clear();
        this.f43443 = 0;
        this.f43426 = -1;
        this.f43439 = 0;
        this.f43448 = 0;
        this.f43449 = 0;
        this.f43425 = false;
        if (j == 0) {
            if (this.f43421 == 3) {
                this.f43433.m43981();
                this.f43428.clear();
                return;
            } else {
                this.f43421 = 0;
                this.f43443 = 0;
                return;
            }
        }
        for (C23945 c23945 : this.f43450) {
            C21973 c21973 = c23945.f76074;
            int iM13012 = C5792.m13012(c21973.f69039, j2, false);
            while (true) {
                if (iM13012 < 0) {
                    iM13012 = -1;
                    break;
                } else if ((c21973.f69034[iM13012] & 1) != 0) {
                    break;
                } else {
                    iM13012--;
                }
            }
            if (iM13012 == -1) {
                iM13012 = c21973.m49493(j2);
            }
            c23945.f76072 = iM13012;
            C2683 c2683 = c23945.f76075;
            if (c2683 != null) {
                c2683.m4148();
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
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) throws C10998 {
        C24812 c24813;
        long j;
        long length;
        C3109 c3109;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        long j5;
        boolean z;
        C15936 c15936;
        C19203 c19203;
        int[] iArr;
        int[] iArr2;
        int i3;
        boolean z2;
        char c;
        int i4;
        C2683 c2683;
        long j6;
        int i5;
        int i6;
        int i7;
        C19203 c19204;
        byte[] bArrM43728;
        int i8;
        int i9;
        int iM41107;
        int i10;
        int iM43739;
        C10307 c10307;
        C13217 c13217;
        boolean z3;
        boolean z4;
        int i11;
        C24812 c24814 = c24812;
        while (true) {
            int i12 = this.f43421;
            ArrayDeque arrayDeque = this.f43429;
            int i13 = this.f43423;
            C19203 c19205 = this.f43424;
            if (i12 == 0) {
                c24813 = c24814;
                int i14 = this.f43443;
                C19203 c19206 = this.f43441;
                if (i14 == 0) {
                    if (interfaceC10375.mo24033(true, 0, 8, c19206.m43728())) {
                        this.f43443 = 8;
                        c19206.m43730(0);
                        this.f43442 = c19206.m43725();
                        this.f43438 = c19206.m43739();
                        j = this.f43442;
                        if (j == 1) {
                            interfaceC10375.readFully(c19206.m43728(), 8, 8);
                            this.f43443 += 8;
                            this.f43442 = c19206.m43712();
                        } else if (j == 0) {
                            length = interfaceC10375.getLength();
                            if (length == -1) {
                                length = c3109.f5657;
                            }
                            if (length != -1) {
                                this.f43442 = (length - interfaceC10375.getPosition()) + ((long) this.f43443);
                            }
                        }
                        j2 = this.f43442;
                        i = this.f43443;
                        if (j2 >= i) {
                            throw C10998.m25388("Atom size less than header length (unsupported).");
                        }
                        i2 = this.f43438;
                        if (i2 != 1836019574) {
                            long position = interfaceC10375.getPosition();
                            j3 = this.f43442;
                            j4 = this.f43443;
                            j5 = (position + j3) - j4;
                            if (j3 != j4) {
                                c19205.m43727(8);
                                interfaceC10375.mo24031(0, 8, c19205.m43728());
                                C23275.m51825(c19205);
                                interfaceC10375.mo24040(c19205.m43731());
                                interfaceC10375.mo24036();
                            }
                            arrayDeque.push(new C3109(this.f43438, j5));
                            if (this.f43442 != this.f43443) {
                                this.f43421 = 0;
                                this.f43443 = 0;
                            } else {
                                m34671(j5);
                            }
                        } else {
                            long position2 = interfaceC10375.getPosition();
                            j3 = this.f43442;
                            j4 = this.f43443;
                            j5 = (position2 + j3) - j4;
                            if (j3 != j4) {
                                c19205.m43727(8);
                                interfaceC10375.mo24031(0, 8, c19205.m43728());
                                C23275.m51825(c19205);
                                interfaceC10375.mo24040(c19205.m43731());
                                interfaceC10375.mo24036();
                            }
                            arrayDeque.push(new C3109(this.f43438, j5));
                            if (this.f43442 != this.f43443) {
                                this.f43421 = 0;
                                this.f43443 = 0;
                            } else {
                                m34671(j5);
                            }
                        }
                        z = true;
                    } else {
                        if (this.f43431 == 2 && (i13 & 2) != 0) {
                            InterfaceC20790 interfaceC20790Mo5732 = this.f43432.mo5732(0, 4);
                            C4871 c4871 = this.f43445;
                            C25079 c25079 = c4871 == null ? null : new C25079(c4871);
                            C3601 c3601 = new C3601();
                            c3601.m6681(c25079);
                            interfaceC20790Mo5732.mo10503(c3601.m6672());
                            this.f43432.mo5734();
                            this.f43432.mo5733(new C22131(-9223372036854775807L));
                        }
                        z = false;
                    }
                } else {
                    j = this.f43442;
                    if (j == 1) {
                        interfaceC10375.readFully(c19206.m43728(), 8, 8);
                        this.f43443 += 8;
                        this.f43442 = c19206.m43712();
                    } else if (j == 0) {
                        length = interfaceC10375.getLength();
                        if (length == -1 && (c3109 = (C3109) arrayDeque.peek()) != null) {
                            length = c3109.f5657;
                        }
                        if (length != -1) {
                            this.f43442 = (length - interfaceC10375.getPosition()) + ((long) this.f43443);
                        }
                    }
                    j2 = this.f43442;
                    i = this.f43443;
                    if (j2 >= i) {
                        throw C10998.m25388("Atom size less than header length (unsupported).");
                    }
                    i2 = this.f43438;
                    if (i2 != 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473 || i2 == 1635284069) {
                        long position3 = interfaceC10375.getPosition();
                        j3 = this.f43442;
                        j4 = this.f43443;
                        j5 = (position3 + j3) - j4;
                        if (j3 != j4 && this.f43438 == 1835365473) {
                            c19205.m43727(8);
                            interfaceC10375.mo24031(0, 8, c19205.m43728());
                            C23275.m51825(c19205);
                            interfaceC10375.mo24040(c19205.m43731());
                            interfaceC10375.mo24036();
                        }
                        arrayDeque.push(new C3109(this.f43438, j5));
                        if (this.f43442 != this.f43443) {
                            this.f43421 = 0;
                            this.f43443 = 0;
                        } else {
                            m34671(j5);
                        }
                    } else if (i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124) {
                        C23877.m52960(i == 8);
                        C23877.m52960(this.f43442 <= 2147483647L);
                        C19203 c19207 = new C19203((int) this.f43442);
                        System.arraycopy(c19206.m43728(), 0, c19207.m43728(), 0, 8);
                        this.f43434 = c19207;
                        this.f43421 = 1;
                    } else {
                        long position4 = interfaceC10375.getPosition();
                        long j7 = this.f43443;
                        long j8 = position4 - j7;
                        if (this.f43438 == 1836086884) {
                            this.f43445 = new C4871(0L, j8, -9223372036854775807L, j8 + j7, this.f43442 - j7);
                        }
                        this.f43434 = null;
                        this.f43421 = 1;
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
                        this.f43433.m43982(interfaceC10375, c24814, this.f43428);
                        if (c24814.f79276 != 0) {
                            return 1;
                        }
                        this.f43421 = 0;
                        this.f43443 = 0;
                        return 1;
                    }
                    long position5 = interfaceC10375.getPosition();
                    if (this.f43426 == -1) {
                        boolean z5 = true;
                        int i15 = 0;
                        long j9 = C14849.FOREVER_NS;
                        boolean z6 = true;
                        long j10 = C14849.FOREVER_NS;
                        int i16 = -1;
                        int i17 = -1;
                        long j11 = C14849.FOREVER_NS;
                        while (true) {
                            C23945[] c23945Arr = this.f43450;
                            if (i15 >= c23945Arr.length) {
                                break;
                            }
                            C23945 c23945 = c23945Arr[i15];
                            int i18 = c23945.f76072;
                            C21973 c21973 = c23945.f76074;
                            if (i18 != c21973.f69037) {
                                long j12 = c21973.f69038[i18];
                                long[][] jArr = this.f43422;
                                String str = C5792.f14228;
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
                        int i19 = (j9 == C14849.FOREVER_NS || !z6 || j10 < j9 + 10485760) ? i17 : i16;
                        this.f43426 = i19;
                        if (i19 == -1) {
                            return -1;
                        }
                    }
                    C23945 c23946 = this.f43450[this.f43426];
                    InterfaceC20790 interfaceC20790 = c23946.f76071;
                    C21973 c21974 = c23946.f76074;
                    C15936 c15937 = c23946.f76073;
                    int i20 = c23946.f76072;
                    long[] jArr2 = c21974.f69038;
                    int[] iArr3 = c21974.f69034;
                    int[] iArr4 = c21974.f69035;
                    long j15 = jArr2[i20];
                    C19203 c19208 = c19205;
                    long j16 = j15 + this.f43446;
                    int length2 = iArr4[i20];
                    C2683 c2684 = c23946.f76075;
                    long j17 = (j16 - position5) + ((long) this.f43439);
                    if (j17 < 0 || j17 >= 262144) {
                        c24812.f79276 = j16;
                        return 1;
                    }
                    int i21 = c15937.f46105;
                    int i22 = c15937.f46113;
                    if (i21 == 1) {
                        j17 += 8;
                        length2 -= 8;
                    }
                    interfaceC10375.mo24040((int) j17);
                    if (c23946.f76070 && this.f43439 == 0 && this.f43448 == 0 && this.f43449 == 0 && (iArr3[i20] & 1) != 0) {
                        if (length2 > 4194304) {
                            c23946.f76070 = false;
                            c13217 = null;
                            i13 = i13;
                            i22 = i22;
                            c15936 = c15937;
                            c19203 = c19208;
                            iArr = iArr3;
                            iArr2 = iArr4;
                            i3 = i20;
                        } else {
                            byte[] bArr = new byte[length2];
                            try {
                                interfaceC10375.mo24031(0, length2, bArr);
                                interfaceC10375.mo24036();
                                if (i22 <= 0 || i22 > 4) {
                                    c15936 = c15937;
                                    c19203 = c19208;
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
                                                c15936 = c15937;
                                                c19203 = c19208;
                                            } else {
                                                int i26 = 0;
                                                c19203 = c19208;
                                                int i27 = 0;
                                                while (i27 < i22) {
                                                    i26 = (i26 << 8) | (bArr[i25 + i27] & 255);
                                                    i27++;
                                                    c15937 = c15937;
                                                }
                                                c15936 = c15937;
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
                                                    c19208 = c19203;
                                                    c15937 = c15936;
                                                }
                                            }
                                        } else {
                                            c15936 = c15937;
                                            c19203 = c19208;
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
                                                    byte[] bArr4 = C18058.f53916;
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
                                                c13217 = new C13217(bArr3, bArr2);
                                            }
                                            c23946.f76070 = false;
                                        }
                                    }
                                }
                                iArr2 = iArr4;
                                i3 = i20;
                                c13217 = null;
                                c23946.f76070 = false;
                            } catch (Throwable th) {
                                interfaceC10375.mo24036();
                                throw th;
                            }
                        }
                        if (c13217 != null) {
                            byte[] bArr5 = c13217.f37115;
                            C3601 c3601M23918 = c23946.f76069.m23918();
                            c3601M23918.m6678((List) AbstractC16192.m36873of((Object) c13217.f37114));
                            C10307 c10307M6672 = c3601M23918.m6672();
                            c23946.f76069 = c10307M6672;
                            interfaceC20790.mo10503(c10307M6672);
                            interfaceC20790.mo10500(bArr5.length, new C19203(bArr5));
                            interfaceC10375.mo24040(length2);
                            this.f43439 = length2;
                            this.f43448 = bArr5.length;
                            length2 = bArr5.length;
                            this.f43449 = 0;
                            z2 = true;
                            this.f43425 = true;
                        }
                        if (z2) {
                            c = 1;
                        } else {
                            c10307 = c23946.f76069;
                            if (C12826.equals(c10307.f28528, "video/avc") ? !C12826.equals(c10307.f28528, "video/hevc") || (i13 & 128) == 0 : (i13 & 32) == 0) {
                                c = 1;
                                this.f43425 = true;
                            } else {
                                c = 1;
                            }
                        }
                        if (!z2) {
                            i4 = length2;
                            c2683 = c2684;
                        } else if (i22 != 0) {
                            c19204 = this.f43420;
                            bArrM43728 = c19204.m43728();
                            bArrM43728[0] = 0;
                            bArrM43728[c] = 0;
                            bArrM43728[2] = 0;
                            i8 = 4 - i22;
                            length2 += i8;
                            while (this.f43448 < length2) {
                                i9 = this.f43449;
                                if (i9 == 0) {
                                    if (!this.f43425 || C18058.m41107(c23946.f76069) + i22 > iArr2[i3] - this.f43439) {
                                        iM41107 = 0;
                                        i10 = i22;
                                    } else {
                                        iM41107 = C18058.m41107(c23946.f76069);
                                        i10 = i22 + iM41107;
                                    }
                                    interfaceC10375.readFully(bArrM43728, i8, i10);
                                    this.f43439 += i10;
                                    c19204.m43730(0);
                                    iM43739 = c19204.m43739();
                                    if (iM43739 >= 0) {
                                        throw C10998.m25387("Invalid NAL length", (Throwable) null);
                                    }
                                    this.f43449 = iM43739 - iM41107;
                                    C19203 c19209 = this.f43427;
                                    c19209.m43730(0);
                                    interfaceC20790.mo10500(4, c19209);
                                    this.f43448 += 4;
                                    if (iM41107 > 0) {
                                        interfaceC20790.mo10500(iM41107, c19204);
                                        this.f43448 += iM41107;
                                        if (C18058.m41114(bArrM43728, iM41107, c23946.f76069)) {
                                            this.f43425 = true;
                                        }
                                    }
                                } else {
                                    int iMo10498 = interfaceC20790.mo10498((InterfaceC11649) interfaceC10375, i9, false);
                                    this.f43439 += iMo10498;
                                    this.f43448 += iMo10498;
                                    this.f43449 -= iMo10498;
                                }
                            }
                            i4 = length2;
                            c2683 = c2684;
                        } else {
                            if ("audio/ac4".equals(c15936.f46112.f28528)) {
                                if (this.f43448 == 0) {
                                    C19203 c192010 = c19203;
                                    C15344.m34922(length2, c192010);
                                    interfaceC20790.mo10500(7, c192010);
                                    this.f43448 += 7;
                                }
                                length2 += 7;
                                c2683 = c2684;
                            } else if (c2684 != null) {
                                c2683 = c2684;
                                c2683.m4149(interfaceC10375);
                            }
                            c2683 = c2684;
                            while (true) {
                                i7 = this.f43448;
                                if (i7 < length2) {
                                    break;
                                }
                                int iMo10499 = interfaceC20790.mo10498((InterfaceC11649) interfaceC10375, length2 - i7, false);
                                this.f43439 += iMo10499;
                                this.f43448 += iMo10499;
                                this.f43449 -= iMo10499;
                            }
                            i4 = length2;
                        }
                        j6 = c21974.f69039[i3];
                        i5 = iArr[i3];
                        if (!this.f43425) {
                            i5 |= 67108864;
                        }
                        if (c2683 != null) {
                            c2683.m4150(interfaceC20790, j6, i5, i4, 0, null);
                            i6 = 1;
                            if (i3 + 1 == c21974.f69037) {
                                c2683.m4151(interfaceC20790, null);
                            }
                        } else {
                            interfaceC20790.mo10502(j6, i5, i4, 0, null);
                            i6 = 1;
                        }
                        c23946.f76072 += i6;
                        this.f43426 = -1;
                        this.f43439 = 0;
                        this.f43448 = 0;
                        this.f43449 = 0;
                        this.f43425 = false;
                        return 0;
                    }
                    i13 = i13;
                    i22 = i22;
                    c15936 = c15937;
                    c19203 = c19208;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    i3 = i20;
                    z2 = false;
                    if (z2) {
                        c10307 = c23946.f76069;
                        if (C12826.equals(c10307.f28528, "video/avc")) {
                            c = 1;
                            this.f43425 = true;
                        } else {
                            c = 1;
                            this.f43425 = true;
                        }
                    } else {
                        c = 1;
                    }
                    if (!z2) {
                        i4 = length2;
                        c2683 = c2684;
                    } else if (i22 != 0) {
                        c19204 = this.f43420;
                        bArrM43728 = c19204.m43728();
                        bArrM43728[0] = 0;
                        bArrM43728[c] = 0;
                        bArrM43728[2] = 0;
                        i8 = 4 - i22;
                        length2 += i8;
                        while (this.f43448 < length2) {
                            i9 = this.f43449;
                            if (i9 == 0) {
                                if (this.f43425) {
                                    iM41107 = 0;
                                    i10 = i22;
                                } else {
                                    iM41107 = 0;
                                    i10 = i22;
                                }
                                interfaceC10375.readFully(bArrM43728, i8, i10);
                                this.f43439 += i10;
                                c19204.m43730(0);
                                iM43739 = c19204.m43739();
                                if (iM43739 >= 0) {
                                    throw C10998.m25387("Invalid NAL length", (Throwable) null);
                                }
                                this.f43449 = iM43739 - iM41107;
                                C19203 c192011 = this.f43427;
                                c192011.m43730(0);
                                interfaceC20790.mo10500(4, c192011);
                                this.f43448 += 4;
                                if (iM41107 > 0) {
                                    interfaceC20790.mo10500(iM41107, c19204);
                                    this.f43448 += iM41107;
                                    if (C18058.m41114(bArrM43728, iM41107, c23946.f76069)) {
                                        this.f43425 = true;
                                    }
                                }
                            } else {
                                int iMo104910 = interfaceC20790.mo10498((InterfaceC11649) interfaceC10375, i9, false);
                                this.f43439 += iMo104910;
                                this.f43448 += iMo104910;
                                this.f43449 -= iMo104910;
                            }
                        }
                        i4 = length2;
                        c2683 = c2684;
                    } else {
                        if ("audio/ac4".equals(c15936.f46112.f28528)) {
                            if (this.f43448 == 0) {
                                C19203 c192012 = c19203;
                                C15344.m34922(length2, c192012);
                                interfaceC20790.mo10500(7, c192012);
                                this.f43448 += 7;
                            }
                            length2 += 7;
                            c2683 = c2684;
                        } else if (c2684 != null) {
                            c2683 = c2684;
                            c2683.m4149(interfaceC10375);
                        }
                        c2683 = c2684;
                        while (true) {
                            i7 = this.f43448;
                            if (i7 < length2) {
                                break;
                                break;
                            }
                            int iMo104911 = interfaceC20790.mo10498((InterfaceC11649) interfaceC10375, length2 - i7, false);
                            this.f43439 += iMo104911;
                            this.f43448 += iMo104911;
                            this.f43449 -= iMo104911;
                        }
                        i4 = length2;
                    }
                    j6 = c21974.f69039[i3];
                    i5 = iArr[i3];
                    if (!this.f43425) {
                        i5 |= 67108864;
                    }
                    if (c2683 != null) {
                        c2683.m4150(interfaceC20790, j6, i5, i4, 0, null);
                        i6 = 1;
                        if (i3 + 1 == c21974.f69037) {
                            c2683.m4151(interfaceC20790, null);
                        }
                    } else {
                        interfaceC20790.mo10502(j6, i5, i4, 0, null);
                        i6 = 1;
                    }
                    c23946.f76072 += i6;
                    this.f43426 = -1;
                    this.f43439 = 0;
                    this.f43448 = 0;
                    this.f43449 = 0;
                    this.f43425 = false;
                    return 0;
                }
                c24813 = c24814;
                long j18 = this.f43442 - ((long) this.f43443);
                long position6 = interfaceC10375.getPosition() + j18;
                C19203 c192013 = this.f43434;
                if (c192013 != null) {
                    interfaceC10375.readFully(c192013.m43728(), this.f43443, (int) j18);
                    if (this.f43438 == 1718909296) {
                        this.f43436 = true;
                        c192013.m43730(8);
                        int iM437310 = c192013.m43739();
                        if (iM437310 != 1751476579) {
                            i11 = iM437310 != 1903435808 ? 0 : 1;
                        } else {
                            i11 = 2;
                        }
                        if (i11 == 0) {
                            c192013.m43724(4);
                            do {
                                if (c192013.m43703() <= 0) {
                                    i11 = 0;
                                    break;
                                }
                                int iM437311 = c192013.m43739();
                                if (iM437311 != 1751476579) {
                                    i11 = iM437311 != 1903435808 ? 0 : 1;
                                } else {
                                    i11 = 2;
                                }
                            } while (i11 == 0);
                        }
                        this.f43431 = i11;
                    } else if (!arrayDeque.isEmpty()) {
                        ((C3109) arrayDeque.peek()).f5658.add(new C9815(this.f43438, c192013));
                    }
                } else {
                    if (!this.f43436 && this.f43438 == 1835295092) {
                        this.f43431 = 1;
                    }
                    if (j18 < 262144) {
                        interfaceC10375.mo24040((int) j18);
                    } else {
                        c24813.f79276 = interfaceC10375.getPosition() + j18;
                        z3 = true;
                    }
                    m34671(position6);
                    if (this.f43437) {
                        this.f43430 = true;
                        c24813.f79276 = this.f43451;
                        this.f43437 = false;
                        z3 = true;
                    }
                    if (z3 || this.f43421 == 2) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        return 1;
                    }
                }
                z3 = false;
                m34671(position6);
                if (this.f43437) {
                    this.f43430 = true;
                    c24813.f79276 = this.f43451;
                    this.f43437 = false;
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
            c24814 = c24813;
        }
    }

    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ۜ */
    public final long mo8953() {
        return this.f43447;
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
    @Override // p067l.InterfaceC11402
    /* JADX INFO: renamed from: ֫ */
    public final C8719 mo4119(long j) {
        long jMin;
        long j2;
        long j3;
        int i;
        C23945[] c23945Arr;
        C10731 c10731;
        C21973 c21973;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int iM13012;
        int iM13013;
        int iM49493;
        long j4 = j;
        C23945[] c23945Arr2 = this.f43450;
        int length = c23945Arr2.length;
        C10731 c10732 = C10731.f29727;
        if (length == 0) {
            return new C8719(c10732, c10732);
        }
        int i2 = this.f43440;
        boolean z = false;
        int i3 = -1;
        long jMin2 = -1;
        if (i2 != -1) {
            C21973 c21974 = c23945Arr2[i2].f76074;
            long[] jArr3 = c21974.f69039;
            int iM13014 = C5792.m13012(jArr3, j4, false);
            while (true) {
                if (iM13014 < 0) {
                    iM13014 = -1;
                    break;
                }
                if ((c21974.f69034[iM13014] & 1) != 0) {
                    break;
                }
                iM13014--;
            }
            if (iM13014 == -1) {
                iM13014 = c21974.m49493(j4);
            }
            long[] jArr4 = c21974.f69038;
            if (iM13014 == -1) {
                return new C8719(c10732, c10732);
            }
            j2 = jArr3[iM13014];
            jMin = jArr4[iM13014];
            if (j2 >= j4 || iM13014 >= c21974.f69037 - 1 || (iM49493 = c21974.m49493(j4)) == -1 || iM49493 == iM13014) {
                j4 = j2;
            } else {
                j3 = jArr3[iM49493];
                jMin2 = jArr4[iM49493];
            }
            i = 0;
            while (true) {
                c23945Arr = this.f43450;
                if (i < c23945Arr.length) {
                    break;
                }
                if (i != this.f43440) {
                    c21973 = c23945Arr[i].f76074;
                    jArr = c21973.f69038;
                    iArr = c21973.f69034;
                    jArr2 = c21973.f69039;
                    iM13012 = C5792.m13012(jArr2, j2, z);
                    while (true) {
                        if (iM13012 >= 0) {
                            iM13012 = -1;
                            break;
                        }
                        if ((iArr[iM13012] & 1) != 0) {
                            break;
                        }
                        iM13012--;
                    }
                    if (iM13012 == i3) {
                        iM13012 = c21973.m49493(j2);
                    }
                    if (iM13012 != i3) {
                        jMin = Math.min(jArr[iM13012], jMin);
                    }
                    if (j3 != -9223372036854775807L) {
                        z = false;
                        iM13013 = C5792.m13012(jArr2, j3, false);
                        while (true) {
                            if (iM13013 >= 0) {
                                iM13013 = -1;
                                break;
                            }
                            if ((iArr[iM13013] & 1) != 0) {
                                break;
                            }
                            iM13013--;
                        }
                        if (iM13013 == -1) {
                            iM13013 = c21973.m49493(j3);
                        }
                        if (iM13013 == -1) {
                            jMin2 = Math.min(jArr[iM13013], jMin2);
                        }
                    } else {
                        z = false;
                    }
                }
                i++;
                i3 = -1;
            }
            c10731 = new C10731(j2, jMin);
            if (j3 == -9223372036854775807L) {
                return new C8719(c10731, c10731);
            }
            return new C8719(c10731, new C10731(j3, jMin2));
        }
        jMin = C14849.FOREVER_NS;
        j2 = j4;
        j3 = -9223372036854775807L;
        i = 0;
        while (true) {
            c23945Arr = this.f43450;
            if (i < c23945Arr.length) {
                break;
                break;
            }
            if (i != this.f43440) {
                c21973 = c23945Arr[i].f76074;
                jArr = c21973.f69038;
                iArr = c21973.f69034;
                jArr2 = c21973.f69039;
                iM13012 = C5792.m13012(jArr2, j2, z);
                while (true) {
                    if (iM13012 >= 0) {
                        iM13012 = -1;
                        break;
                    }
                    if ((iArr[iM13012] & 1) != 0) {
                        break;
                        break;
                    }
                    iM13012--;
                }
                if (iM13012 == i3) {
                    iM13012 = c21973.m49493(j2);
                }
                if (iM13012 != i3) {
                    jMin = Math.min(jArr[iM13012], jMin);
                }
                if (j3 != -9223372036854775807L) {
                    z = false;
                    iM13013 = C5792.m13012(jArr2, j3, false);
                    while (true) {
                        if (iM13013 >= 0) {
                            iM13013 = -1;
                            break;
                        }
                        if ((iArr[iM13013] & 1) != 0) {
                            break;
                            break;
                        }
                        iM13013--;
                    }
                    if (iM13013 == -1) {
                        iM13013 = c21973.m49493(j3);
                    }
                    if (iM13013 == -1) {
                        jMin2 = Math.min(jArr[iM13013], jMin2);
                    }
                } else {
                    z = false;
                }
            }
            i++;
            i3 = -1;
        }
        c10731 = new C10731(j2, jMin);
        if (j3 == -9223372036854775807L) {
            return new C8719(c10731, c10731);
        }
        return new C8719(c10731, new C10731(j3, jMin2));
    }

    /* JADX WARN: Code duplicated, block: B:152:0x0315 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x0002 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ܽ */
    private void m34671(long j) {
        ArrayList arrayList;
        C25079 c25079M51823;
        ArrayDeque arrayDeque;
        C25079 c25079;
        ArrayList arrayList2;
        C9704 c9704;
        long j2;
        C25079 c250710;
        String str;
        ArrayList arrayList3;
        C2438 c2438M27182;
        int i;
        while (true) {
            ArrayDeque arrayDeque2 = this.f43429;
            if (arrayDeque2.isEmpty() || ((C3109) arrayDeque2.peek()).f5657 != j) {
                break;
            }
            C3109 c3109 = (C3109) arrayDeque2.pop();
            if (c3109.f48556 == 1836019574) {
                C3109 c3109M5303 = c3109.m5303(1835365473);
                ArrayList arrayList4 = new ArrayList();
                int i2 = this.f43423;
                if (c3109M5303 != null) {
                    c25079M51823 = C23275.m51823(c3109M5303);
                    if (this.f43430) {
                        C23877.m52958(c25079M51823);
                        C2438 c2438M27183 = C11876.m27182(c25079M51823, "auxiliary.tracks.interleaved");
                        if (c2438M27183 != null && c2438M27183.f3765[0] == 0) {
                            this.f43446 = this.f43451 + 16;
                        }
                        C2438 c2438M27184 = C11876.m27182(c25079M51823, "auxiliary.tracks.map");
                        C23877.m52958(c2438M27184);
                        ArrayList arrayListM3424 = c2438M27184.m3424();
                        ArrayList arrayList5 = new ArrayList(arrayListM3424.size());
                        for (int i3 = 0; i3 < arrayListM3424.size(); i3++) {
                            int iIntValue = ((Integer) arrayListM3424.get(i3)).intValue();
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
                        if (c25079M51823 != null && (i2 & 64) != 0 && (c2438M27182 = C11876.m27182(c25079M51823, "auxiliary.tracks.offset")) != null) {
                            long jM43712 = new C19203(c2438M27182.f3765).m43712();
                            if (jM43712 > 0) {
                                this.f43451 = jM43712;
                                this.f43437 = true;
                                arrayDeque = arrayDeque2;
                            }
                            arrayDeque.clear();
                            if (!this.f43437) {
                                this.f43421 = 2;
                            }
                        }
                        arrayList = arrayList4;
                    }
                } else {
                    arrayList = arrayList4;
                    c25079M51823 = null;
                }
                ArrayList arrayList6 = new ArrayList();
                boolean z = this.f43431 == 1;
                C9704 c9705 = new C9704();
                C9815 c9815M5304 = c3109.m5304(1969517665);
                if (c9815M5304 != null) {
                    C25079 c25079M51824 = C23275.m51824(c9815M5304);
                    c9705.m22651(c25079M51824);
                    c25079 = c25079M51824;
                } else {
                    c25079 = null;
                }
                C9815 c9815M5305 = c3109.m5304(1836476516);
                c9815M5305.getClass();
                C25079 c250711 = new C25079(C23275.m51828(c9815M5305.f27154));
                C9704 c9706 = c9705;
                ArrayList arrayListM51820 = C23275.m51820(c3109, c9705, -9223372036854775807L, null, (i2 & 1) != 0, z, new C25053());
                if (this.f43430) {
                    boolean z2 = arrayList.size() == arrayListM51820.size();
                    Locale locale = Locale.US;
                    C23877.m52959(C20780.m46928("The number of auxiliary track types from metadata (", arrayList.size(), ") is not same as the number of auxiliary tracks (", MotionUtils.EASING_TYPE_FORMAT_END, arrayListM51820.size()), z2);
                }
                String strM18146 = C7852.m18146(arrayListM51820);
                long j3 = -9223372036854775807L;
                int i4 = 0;
                int i5 = 0;
                int size = -1;
                while (i5 < arrayListM51820.size()) {
                    C21973 c21973 = (C21973) arrayListM51820.get(i5);
                    int i6 = c21973.f69037;
                    ArrayList arrayList7 = arrayListM51820;
                    int i7 = c21973.f69036;
                    if (i6 == 0) {
                        c9704 = c9706;
                        arrayList2 = arrayList;
                        str = strM18146;
                        ArrayList arrayList8 = arrayList6;
                        c250710 = c25079M51823;
                        arrayList3 = arrayList8;
                    } else {
                        C15936 c15936 = c21973.f69033;
                        ArrayList arrayList9 = arrayList6;
                        InterfaceC23116 interfaceC23116 = this.f43432;
                        int i8 = i4 + 1;
                        String str2 = strM18146;
                        int i9 = c15936.f46103;
                        C25079 c250712 = c25079M51823;
                        C10307 c10307 = c15936.f46112;
                        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(i4, i9);
                        C23945 c23945 = new C23945(c15936, c21973, interfaceC20790Mo5732);
                        C9704 c9707 = c9706;
                        ArrayList arrayList10 = arrayList;
                        long j4 = c15936.f46102;
                        if (j4 == -9223372036854775807L) {
                            j4 = c21973.f69032;
                        }
                        interfaceC20790Mo5732.mo10501(j4);
                        long jMax = Math.max(j3, j4);
                        int i10 = "audio/true-hd".equals(c10307.f28528) ? i7 * 16 : i7 + 30;
                        C3601 c3601M23918 = c10307.m23918();
                        c3601M23918.m6683(i10);
                        if (i9 == 2) {
                            int i11 = c10307.f28522;
                            if ((i2 & 8) != 0) {
                                i11 |= size == -1 ? 1 : 2;
                            }
                            if (this.f43430) {
                                i11 |= 32768;
                                arrayList2 = arrayList10;
                                c3601M23918.m6693(((Integer) arrayList2.get(i5)).intValue());
                            } else {
                                arrayList2 = arrayList10;
                            }
                            c3601M23918.m6686(i11);
                        } else {
                            arrayList2 = arrayList10;
                        }
                        if (i9 == 1) {
                            c9704 = c9707;
                            int i12 = c9704.f26765;
                            j2 = jMax;
                            if (i12 != -1 && c9704.f26766 != -1) {
                                c3601M23918.m6709(i12);
                                c3601M23918.m6690(c9704.f26766);
                            }
                        } else {
                            c9704 = c9707;
                            j2 = jMax;
                        }
                        C25079 c250713 = c10307.f28526;
                        ArrayList arrayList11 = this.f43428;
                        c250710 = c250712;
                        C11876.m27186(i9, c250710, c3601M23918, c250713, arrayList11.isEmpty() ? null : new C25079(arrayList11), c25079, c250711);
                        str = str2;
                        c3601M23918.m6694(str);
                        C10307 c10307M6672 = c3601M23918.m6672();
                        c23945.f76069 = c10307M6672;
                        c23945.f76070 = c15936.f46111 && c15936.f46113 != 0 && C12826.equals(c10307.f28528, "video/hevc");
                        interfaceC20790Mo5732.mo10503(c10307M6672);
                        if (i9 == 2 && size == -1) {
                            size = arrayList9.size();
                        }
                        arrayList3 = arrayList9;
                        arrayList3.add(c23945);
                        i4 = i8;
                        j3 = j2;
                    }
                    i5++;
                    strM18146 = str;
                    c9706 = c9704;
                    arrayList = arrayList2;
                    arrayListM51820 = arrayList7;
                    arrayDeque2 = arrayDeque2;
                    C25079 c250714 = c250710;
                    arrayList6 = arrayList3;
                    c25079M51823 = c250714;
                }
                arrayDeque = arrayDeque2;
                this.f43440 = size;
                this.f43447 = j3;
                C23945[] c23945Arr = (C23945[]) arrayList6.toArray(new C23945[0]);
                this.f43450 = c23945Arr;
                long[][] jArr = new long[c23945Arr.length][];
                int[] iArr = new int[c23945Arr.length];
                long[] jArr2 = new long[c23945Arr.length];
                boolean[] zArr = new boolean[c23945Arr.length];
                for (int i13 = 0; i13 < c23945Arr.length; i13++) {
                    jArr[i13] = new long[c23945Arr[i13].f76074.f69037];
                    jArr2[i13] = c23945Arr[i13].f76074.f69039[0];
                }
                int i14 = 0;
                long j5 = 0;
                while (i14 < c23945Arr.length) {
                    long j6 = C14849.FOREVER_NS;
                    int i15 = -1;
                    for (int i16 = 0; i16 < c23945Arr.length; i16++) {
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
                    C21973 c21974 = c23945Arr[i15].f76074;
                    j5 += (long) c21974.f69035[i17];
                    int i18 = i17 + 1;
                    iArr[i15] = i18;
                    if (i18 < jArr3.length) {
                        jArr2[i15] = c21974.f69039[i18];
                    } else {
                        zArr[i15] = true;
                        i14++;
                    }
                }
                this.f43422 = jArr;
                this.f43432.mo5734();
                this.f43432.mo5733(this);
                arrayDeque.clear();
                if (!this.f43437) {
                    this.f43421 = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((C3109) arrayDeque2.peek()).f5656.add(c3109);
            }
        }
        if (this.f43421 != 2) {
            this.f43421 = 0;
            this.f43443 = 0;
        }
    }
}
