package l;

import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17058 implements InterfaceC1368 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C7187 f52267 = new C7187();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f52268;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C19714 f52269;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f52270;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f52271;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f52272;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public InterfaceC23408 f52273;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f52274;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final C17265 f52275;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f52276;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C16559 f52277;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC19383 f52278;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f52279;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f52280;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C23896 f52281;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f52282;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC21830 f52283;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f52284;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public long f52285;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final C17714 f52286;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C7718 f52287;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f52288;

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4838() {
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC1368 mo4843() {
        return this;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ܳ */
    public final List mo4842() {
        return AbstractC14545.of();
    }

    public C17058(int i) {
        this(i, -9223372036854775807L);
    }

    public C17058(int i, long j) {
        this.f52288 = (i & 2) != 0 ? i | 1 : i;
        this.f52274 = j;
        this.f52286 = new C17714(10);
        this.f52275 = new C17265();
        this.f52287 = new C7718();
        this.f52270 = -9223372036854775807L;
        this.f52277 = new C16559();
        C19714 c19714 = new C19714();
        this.f52269 = c19714;
        this.f52278 = c19714;
        this.f52284 = -1L;
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo4841(InterfaceC8424 interfaceC8424) {
        return m40032(interfaceC8424, true);
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4840(InterfaceC21830 interfaceC21830) {
        this.f52283 = interfaceC21830;
        InterfaceC19383 interfaceC19383Mo3429 = interfaceC21830.mo3429(0, 1);
        this.f52271 = interfaceC19383Mo3429;
        this.f52278 = interfaceC19383Mo3429;
        this.f52283.mo3431();
    }

    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final void mo4839(long j, long j2) {
        this.f52280 = 0;
        this.f52270 = -9223372036854775807L;
        this.f52285 = 0L;
        this.f52272 = 0;
        this.f52268 = j2;
        InterfaceC23408 interfaceC23408 = this.f52273;
        if (!(interfaceC23408 instanceof C16352) || ((C16352) interfaceC23408).m38498(j2)) {
            return;
        }
        this.f52276 = true;
        this.f52278 = this.f52269;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m40035() {
        this.f52282 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m40032(InterfaceC8424 interfaceC8424, boolean z) throws EOFException {
        int i;
        int iMo22069;
        int iM34471;
        int i2 = z ? 32768 : 524288;
        interfaceC8424.mo22066();
        if (interfaceC8424.getPosition() == 0) {
            C23896 c23896M38956 = this.f52277.m38956(interfaceC8424, (this.f52288 & 8) == 0 ? null : f52267);
            this.f52281 = c23896M38956;
            if (c23896M38956 != null) {
                this.f52287.m20671(c23896M38956);
            }
            iMo22069 = (int) interfaceC8424.mo22069();
            if (!z) {
                interfaceC8424.mo22070(iMo22069);
            }
            i = 0;
        } else {
            i = 0;
            iMo22069 = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (m40033(interfaceC8424)) {
                if (i3 > 0) {
                    break;
                }
                m40034();
                throw new EOFException();
            }
            C17714 c17714 = this.f52286;
            c17714.m41484(0);
            int iM41493 = c17714.m41493();
            if ((i == 0 || ((-128000) & iM41493) == (((long) i) & (-128000))) && (iM34471 = C14442.m34471(iM41493)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.f52275.m40557(iM41493);
                    i = iM41493;
                }
                interfaceC8424.mo22060(iM34471 - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    m40034();
                    throw new EOFException();
                }
                if (z) {
                    interfaceC8424.mo22066();
                    interfaceC8424.mo22060(iMo22069 + i5);
                } else {
                    interfaceC8424.mo22070(1);
                }
                i4 = i5;
                i = 0;
                i3 = 0;
            }
        }
        if (z) {
            interfaceC8424.mo22070(iMo22069 + i4);
        } else {
            interfaceC8424.mo22066();
        }
        this.f52280 = i;
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m40033(InterfaceC8424 interfaceC8424) {
        InterfaceC23408 interfaceC23408 = this.f52273;
        if (interfaceC23408 != null) {
            long jMo17870 = interfaceC23408.mo17870();
            if (jMo17870 == -1 || interfaceC8424.mo22069() <= jMo17870 - 4) {
            }
            return true;
        }
        try {
            return !interfaceC8424.mo22068(true, 0, 4, this.f52286.m41482());
        } catch (EOFException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    private void m40034() {
        InterfaceC9505 interfaceC9505 = this.f52273;
        if ((interfaceC9505 instanceof C10709) && ((C9130) interfaceC9505).mo6829()) {
            long j = this.f52284;
            if (j == -1 || j == this.f52273.mo17870()) {
                return;
            }
            this.f52273 = ((C10709) this.f52273).m26889(this.f52284);
            InterfaceC21830 interfaceC21830 = this.f52283;
            interfaceC21830.getClass();
            interfaceC21830.mo3430(this.f52273);
            InterfaceC19383 interfaceC19383 = this.f52271;
            interfaceC19383.getClass();
            interfaceC19383.mo8454(this.f52273.mo6827());
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x0247 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x0249  */
    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0253  */
    /* JADX WARN: Code duplicated, block: B:124:0x0257  */
    /* JADX WARN: Code duplicated, block: B:125:0x025b  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:134:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:136:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:138:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:13:0x0042  */
    /* JADX WARN: Code duplicated, block: B:140:0x0309  */
    /* JADX WARN: Code duplicated, block: B:144:0x0315  */
    /* JADX WARN: Code duplicated, block: B:147:0x0320  */
    /* JADX WARN: Code duplicated, block: B:149:0x0338  */
    /* JADX WARN: Code duplicated, block: B:14:0x0045  */
    /* JADX WARN: Code duplicated, block: B:151:0x033f  */
    /* JADX WARN: Code duplicated, block: B:152:0x0342  */
    /* JADX WARN: Code duplicated, block: B:154:0x0350  */
    /* JADX WARN: Code duplicated, block: B:156:0x0362  */
    /* JADX WARN: Code duplicated, block: B:159:0x0382  */
    /* JADX WARN: Code duplicated, block: B:164:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:166:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:168:0x03be  */
    /* JADX WARN: Code duplicated, block: B:169:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:183:0x0195 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0090  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x0118  */
    /* JADX WARN: Code duplicated, block: B:59:0x011f  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f  */
    /* JADX WARN: Code duplicated, block: B:70:0x016e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0178  */
    /* JADX WARN: Code duplicated, block: B:75:0x017f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0192 A[LOOP:0: B:74:0x017d->B:78:0x0192, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0195 A[EDGE_INSN: B:79:0x0195->B:80:0x0196 BREAK  A[LOOP:0: B:74:0x017d->B:78:0x0192]] */
    /* JADX WARN: Code duplicated, block: B:82:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:92:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x01da  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // l.InterfaceC1368
    /* JADX INFO: renamed from: ֫ */
    public final int mo4837(InterfaceC8424 interfaceC8424, C23615 c23615) {
        int i;
        int i2;
        long j;
        InterfaceC23408 interfaceC23408;
        C17714 c17714;
        long j2;
        long position;
        long j3;
        int iMo8451;
        int i3;
        int iM41493;
        int i4;
        int i5;
        long position2;
        InterfaceC23408 interfaceC23409;
        long j4;
        C17714 c17715;
        int i6;
        int iM41494;
        C7718 c7718;
        C20587 c20587M47138;
        long j5;
        int i7;
        int i8;
        long position3;
        long j6;
        long length;
        long jM47139;
        C17265 c17265;
        InterfaceC23408 c10709;
        int i9;
        long j7;
        C23896 c23896;
        long position4;
        C17764 c17764M41616;
        boolean z;
        int i10;
        boolean z2;
        long length2;
        long jM40031;
        long jMo17870;
        long j8;
        C1297 c1297;
        C23896 c23897;
        int iM52639;
        int i11;
        InterfaceC14723 interfaceC14723M52640;
        C22632.m50632(this.f52271);
        String str = C3603.f11424;
        int i12 = this.f52280;
        C17265 c17266 = this.f52275;
        if (i12 == 0) {
            try {
                m40032(interfaceC8424, false);
                interfaceC23408 = this.f52273;
                c17714 = this.f52286;
                if (interfaceC23408 == null) {
                    c17715 = new C17714(c17266.f52921);
                    interfaceC8424.mo22061(0, c17266.f52921, c17715.m41482());
                    i6 = 21;
                    if ((c17266.f52924 & 1) != 0) {
                        if (c17266.f52919 != 1) {
                            i6 = 36;
                        }
                    } else if (c17266.f52919 == 1) {
                        i6 = 13;
                    }
                    if (c17715.m41483() >= i6 + 4) {
                        c17715.m41484(i6);
                        iM41494 = c17715.m41493();
                        if (iM41494 != 1483304551 && iM41494 != 1231971951) {
                            if (c17715.m41483() >= 40) {
                                c17715.m41484(36);
                                if (c17715.m41493() == 1447187017) {
                                    iM41494 = 1447187017;
                                } else {
                                    iM41494 = 0;
                                }
                            } else {
                                iM41494 = 0;
                            }
                        }
                    } else if (c17715.m41483() >= 40) {
                        c17715.m41484(36);
                        if (c17715.m41493() == 1447187017) {
                            iM41494 = 1447187017;
                        } else {
                            iM41494 = 0;
                        }
                    } else {
                        iM41494 = 0;
                    }
                    c7718 = this.f52287;
                    if (iM41494 == 1231971951) {
                        c20587M47138 = C20587.m47138(c17266, c17715);
                        j5 = c20587M47138.f66275;
                        if ((c7718.f23852 != -1 || c7718.f23853 == -1) && (i7 = c20587M47138.f66276) != -1 && (i8 = c20587M47138.f66278) != -1) {
                            c7718.f23852 = i7;
                            c7718.f23853 = i8;
                        }
                        position3 = interfaceC8424.getPosition();
                        if (interfaceC8424.getLength() != -1 || j5 == -1) {
                            j6 = -9223372036854775807L;
                        } else {
                            j6 = -9223372036854775807L;
                            long j9 = position3 + j5;
                            if (interfaceC8424.getLength() != j9) {
                                C19956.m46035("Data size mismatch between stream (" + interfaceC8424.getLength() + ") and Xing frame (" + j9 + "), using Xing value.");
                            }
                        }
                        interfaceC8424.mo22070(c17266.f52921);
                        if (iM41494 == 1483304551) {
                            c10709 = C9298.m23863(c20587M47138, position3);
                        } else {
                            length = interfaceC8424.getLength();
                            jM47139 = c20587M47138.m47139();
                            c17265 = c20587M47138.f66279;
                            if (jM47139 != j6) {
                                if (j5 != -1) {
                                    length = position3 + j5;
                                    i9 = c17265.f52921;
                                } else if (length != -1) {
                                    j5 = length - position3;
                                    i9 = c17265.f52921;
                                } else {
                                    c10709 = null;
                                }
                                long j10 = j5 - ((long) i9);
                                long j11 = length;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                c10709 = new C10709(C13426.m32446(C3603.m11017(j10, 8000000L, jM47139, roundingMode)), C13426.m32446(C8488.m22164(j10, c20587M47138.f66280, roundingMode)), j11, position3 + ((long) c17265.f52921), false);
                            } else {
                                c10709 = null;
                            }
                        }
                        j7 = j6;
                    } else {
                        if (iM41494 != 1447187017) {
                            c10709 = C6475.m17867(interfaceC8424.getLength(), interfaceC8424.getPosition(), this.f52275, c17715);
                            interfaceC8424.mo22070(c17266.f52921);
                        } else if (iM41494 != 1483304551) {
                            c20587M47138 = C20587.m47138(c17266, c17715);
                            j5 = c20587M47138.f66275;
                            if (c7718.f23852 != -1) {
                                c7718.f23852 = i7;
                                c7718.f23853 = i8;
                            } else {
                                c7718.f23852 = i7;
                                c7718.f23853 = i8;
                            }
                            position3 = interfaceC8424.getPosition();
                            if (interfaceC8424.getLength() != -1) {
                                j6 = -9223372036854775807L;
                            } else {
                                j6 = -9223372036854775807L;
                            }
                            interfaceC8424.mo22070(c17266.f52921);
                            if (iM41494 == 1483304551) {
                                c10709 = C9298.m23863(c20587M47138, position3);
                            } else {
                                length = interfaceC8424.getLength();
                                jM47139 = c20587M47138.m47139();
                                c17265 = c20587M47138.f66279;
                                if (jM47139 != j6) {
                                    if (j5 != -1) {
                                        length = position3 + j5;
                                        i9 = c17265.f52921;
                                    } else if (length != -1) {
                                        j5 = length - position3;
                                        i9 = c17265.f52921;
                                    } else {
                                        c10709 = null;
                                    }
                                    long j12 = j5 - ((long) i9);
                                    long j13 = length;
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    c10709 = new C10709(C13426.m32446(C3603.m11017(j12, 8000000L, jM47139, roundingMode2)), C13426.m32446(C8488.m22164(j12, c20587M47138.f66280, roundingMode2)), j13, position3 + ((long) c17265.f52921), false);
                                } else {
                                    c10709 = null;
                                }
                            }
                            j7 = j6;
                        } else {
                            interfaceC8424.mo22066();
                            c10709 = null;
                        }
                        j7 = -9223372036854775807L;
                    }
                    c23896 = this.f52281;
                    position4 = interfaceC8424.getPosition();
                    if (c23896 != null) {
                        c17764M41616 = null;
                        break;
                    }
                    iM52639 = c23896.m52639();
                    i11 = 0;
                    while (true) {
                        if (i11 < iM52639) {
                            c17764M41616 = null;
                            break;
                        }
                        interfaceC14723M52640 = c23896.m52640(i11);
                        if (interfaceC14723M52640 instanceof C20978) {
                            c17764M41616 = C17764.m41616(position4, (C20978) interfaceC14723M52640, m40031(c23896));
                            break;
                        }
                        i11++;
                    }
                    z = this.f52282;
                    i10 = this.f52288;
                    if (z) {
                        c10709 = new C14235(j7);
                    } else {
                        if ((i10 & 4) != 0) {
                            if (c17764M41616 != null) {
                                jM40031 = c17764M41616.mo6827();
                            } else {
                                if (c10709 != null) {
                                    long jMo6827 = c10709.mo6827();
                                    jMo17870 = c10709.mo17870();
                                    j8 = jMo6827;
                                } else {
                                    jM40031 = m40031(this.f52281);
                                }
                                c10709 = new C16352(j8, interfaceC8424.getPosition(), jMo17870);
                            }
                            j8 = jM40031;
                            jMo17870 = -1;
                            c10709 = new C16352(j8, interfaceC8424.getPosition(), jMo17870);
                        } else if (c17764M41616 != null) {
                            c10709 = c17764M41616;
                        } else if (c10709 == null) {
                            c10709 = null;
                        }
                        if (c10709 == null && !c10709.mo6829() && (i10 & 1) != 0 && c10709.mo6827() != -9223372036854775807L && (c10709.mo17870() != -1 || interfaceC8424.getLength() != -1)) {
                            long jMo17868 = c10709.mo17868() != -1 ? c10709.mo17868() : 0L;
                            if (c10709.mo17870() != -1) {
                                length2 = c10709.mo17870();
                            } else {
                                length2 = interfaceC8424.getLength();
                            }
                            long j14 = length2;
                            c10709 = new C10709(C13426.m32450(C3603.m11017(j14 - jMo17868, 8000000L, c10709.mo6827(), RoundingMode.HALF_UP)), -1, j14, jMo17868, false);
                        } else if (c10709 != null || (!c10709.mo6829() && (i10 & 1) != 0)) {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC8424.mo22061(0, 4, c17714.m41482());
                            c17714.m41484(0);
                            c17266.m40557(c17714.m41493());
                            c10709 = new C10709(c17266.f52918, c17266.f52921, interfaceC8424.getLength(), interfaceC8424.getPosition(), z2);
                        }
                        this.f52271.mo8454(c10709.mo6827());
                    }
                    this.f52273 = c10709;
                    this.f52283.mo3430(c10709);
                    c1297 = new C1297();
                    c1297.m4462("audio/mpeg");
                    c1297.m4465(c17266.f52923);
                    c1297.m4451(4096);
                    c1297.m4472(c17266.f52919);
                    c1297.m4456(c17266.f52922);
                    c1297.m4477(c7718.f23852);
                    c1297.m4458(c7718.f23853);
                    if ((i10 & 8) != 0) {
                        c23897 = null;
                    } else {
                        c23897 = this.f52281;
                    }
                    c1297.m4449(c23897);
                    if (this.f52273.mo17871() != -2147483647) {
                        c1297.m4468(this.f52273.mo17871());
                    }
                    this.f52278.mo8456(c1297.m4440());
                    this.f52279 = interfaceC8424.getPosition();
                    j2 = 0;
                    j = 1000000;
                } else {
                    if (this.f52279 != 0) {
                        position = interfaceC8424.getPosition();
                        j3 = this.f52279;
                        if (position < j3) {
                            interfaceC8424.mo22070((int) (j3 - position));
                        }
                    }
                    j = 1000000;
                    j2 = 0;
                }
                if (this.f52272 == 0) {
                    interfaceC8424.mo22066();
                    if (m40033(interfaceC8424)) {
                        i = -1;
                        i2 = -1;
                    } else {
                        c17714.m41484(0);
                        iM41493 = c17714.m41493();
                        if (((-128000) & iM41493) == (((long) this.f52280) & (-128000))) {
                            i4 = 0;
                            i5 = 1;
                        } else if (C14442.m34471(iM41493) == -1) {
                            i5 = 1;
                            i4 = 0;
                        } else {
                            c17266.m40557(iM41493);
                            if (this.f52270 == -9223372036854775807L) {
                                this.f52270 = this.f52273.mo17869(interfaceC8424.getPosition());
                                j4 = this.f52274;
                                if (j4 != -9223372036854775807L) {
                                    this.f52270 = (j4 - this.f52273.mo17869(j2)) + this.f52270;
                                }
                            }
                            this.f52272 = c17266.f52921;
                            position2 = interfaceC8424.getPosition() + ((long) c17266.f52921);
                            this.f52284 = position2;
                            interfaceC23409 = this.f52273;
                            if (interfaceC23409 instanceof C16352) {
                                C16352 c16352 = (C16352) interfaceC23409;
                                c16352.m38497((((this.f52285 + ((long) c17266.f52920)) * j) / ((long) c17266.f52922)) + this.f52270, position2);
                                if (this.f52276 && c16352.m38498(this.f52268)) {
                                    this.f52276 = false;
                                    this.f52278 = this.f52271;
                                }
                            }
                            iMo8451 = this.f52278.mo8451((InterfaceC9765) interfaceC8424, this.f52272, true);
                            if (iMo8451 == -1) {
                                i = -1;
                                i2 = -1;
                            } else {
                                i3 = this.f52272 - iMo8451;
                                this.f52272 = i3;
                                if (i3 <= 0) {
                                    this.f52278.mo8455(this.f52270 + ((this.f52285 * j) / ((long) c17266.f52922)), 1, c17266.f52921, 0, null);
                                    this.f52285 += (long) c17266.f52920;
                                    this.f52272 = 0;
                                }
                                i = -1;
                                i2 = 0;
                            }
                        }
                        interfaceC8424.mo22070(i5);
                        this.f52280 = i4;
                        i = -1;
                        i2 = 0;
                    }
                } else {
                    iMo8451 = this.f52278.mo8451((InterfaceC9765) interfaceC8424, this.f52272, true);
                    if (iMo8451 == -1) {
                        i = -1;
                        i2 = -1;
                    } else {
                        i3 = this.f52272 - iMo8451;
                        this.f52272 = i3;
                        if (i3 <= 0) {
                            this.f52278.mo8455(this.f52270 + ((this.f52285 * j) / ((long) c17266.f52922)), 1, c17266.f52921, 0, null);
                            this.f52285 += (long) c17266.f52920;
                            this.f52272 = 0;
                        }
                        i = -1;
                        i2 = 0;
                    }
                }
            } catch (EOFException unused) {
                i = -1;
                i2 = -1;
                j = 1000000;
            }
        } else {
            interfaceC23408 = this.f52273;
            c17714 = this.f52286;
            if (interfaceC23408 == null) {
                c17715 = new C17714(c17266.f52921);
                interfaceC8424.mo22061(0, c17266.f52921, c17715.m41482());
                i6 = 21;
                if ((c17266.f52924 & 1) != 0) {
                    if (c17266.f52919 != 1) {
                        i6 = 36;
                    }
                } else if (c17266.f52919 == 1) {
                    i6 = 13;
                }
                if (c17715.m41483() >= i6 + 4) {
                    c17715.m41484(i6);
                    iM41494 = c17715.m41493();
                    if (iM41494 != 1483304551) {
                        if (c17715.m41483() >= 40) {
                            c17715.m41484(36);
                            if (c17715.m41493() == 1447187017) {
                                iM41494 = 1447187017;
                            } else {
                                iM41494 = 0;
                            }
                        } else {
                            iM41494 = 0;
                        }
                    }
                } else if (c17715.m41483() >= 40) {
                    c17715.m41484(36);
                    if (c17715.m41493() == 1447187017) {
                        iM41494 = 1447187017;
                    } else {
                        iM41494 = 0;
                    }
                } else {
                    iM41494 = 0;
                }
                c7718 = this.f52287;
                if (iM41494 == 1231971951) {
                    c20587M47138 = C20587.m47138(c17266, c17715);
                    j5 = c20587M47138.f66275;
                    if (c7718.f23852 != -1) {
                        c7718.f23852 = i7;
                        c7718.f23853 = i8;
                    } else {
                        c7718.f23852 = i7;
                        c7718.f23853 = i8;
                    }
                    position3 = interfaceC8424.getPosition();
                    if (interfaceC8424.getLength() != -1) {
                        j6 = -9223372036854775807L;
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    interfaceC8424.mo22070(c17266.f52921);
                    if (iM41494 == 1483304551) {
                        c10709 = C9298.m23863(c20587M47138, position3);
                    } else {
                        length = interfaceC8424.getLength();
                        jM47139 = c20587M47138.m47139();
                        c17265 = c20587M47138.f66279;
                        if (jM47139 != j6) {
                            if (j5 != -1) {
                                length = position3 + j5;
                                i9 = c17265.f52921;
                            } else if (length != -1) {
                                j5 = length - position3;
                                i9 = c17265.f52921;
                            } else {
                                c10709 = null;
                            }
                            long j15 = j5 - ((long) i9);
                            long j16 = length;
                            RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                            c10709 = new C10709(C13426.m32446(C3603.m11017(j15, 8000000L, jM47139, roundingMode3)), C13426.m32446(C8488.m22164(j15, c20587M47138.f66280, roundingMode3)), j16, position3 + ((long) c17265.f52921), false);
                        } else {
                            c10709 = null;
                        }
                    }
                    j7 = j6;
                } else {
                    if (iM41494 != 1447187017) {
                        c10709 = C6475.m17867(interfaceC8424.getLength(), interfaceC8424.getPosition(), this.f52275, c17715);
                        interfaceC8424.mo22070(c17266.f52921);
                    } else if (iM41494 != 1483304551) {
                        c20587M47138 = C20587.m47138(c17266, c17715);
                        j5 = c20587M47138.f66275;
                        if (c7718.f23852 != -1) {
                            c7718.f23852 = i7;
                            c7718.f23853 = i8;
                        } else {
                            c7718.f23852 = i7;
                            c7718.f23853 = i8;
                        }
                        position3 = interfaceC8424.getPosition();
                        if (interfaceC8424.getLength() != -1) {
                            j6 = -9223372036854775807L;
                        } else {
                            j6 = -9223372036854775807L;
                        }
                        interfaceC8424.mo22070(c17266.f52921);
                        if (iM41494 == 1483304551) {
                            c10709 = C9298.m23863(c20587M47138, position3);
                        } else {
                            length = interfaceC8424.getLength();
                            jM47139 = c20587M47138.m47139();
                            c17265 = c20587M47138.f66279;
                            if (jM47139 != j6) {
                                if (j5 != -1) {
                                    length = position3 + j5;
                                    i9 = c17265.f52921;
                                } else if (length != -1) {
                                    j5 = length - position3;
                                    i9 = c17265.f52921;
                                } else {
                                    c10709 = null;
                                }
                                long j17 = j5 - ((long) i9);
                                long j18 = length;
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                c10709 = new C10709(C13426.m32446(C3603.m11017(j17, 8000000L, jM47139, roundingMode4)), C13426.m32446(C8488.m22164(j17, c20587M47138.f66280, roundingMode4)), j18, position3 + ((long) c17265.f52921), false);
                            } else {
                                c10709 = null;
                            }
                        }
                        j7 = j6;
                    } else {
                        interfaceC8424.mo22066();
                        c10709 = null;
                    }
                    j7 = -9223372036854775807L;
                }
                c23896 = this.f52281;
                position4 = interfaceC8424.getPosition();
                if (c23896 != null) {
                    c17764M41616 = null;
                    break;
                }
                iM52639 = c23896.m52639();
                i11 = 0;
                while (true) {
                    if (i11 < iM52639) {
                        c17764M41616 = null;
                        break;
                    }
                    interfaceC14723M52640 = c23896.m52640(i11);
                    if (interfaceC14723M52640 instanceof C20978) {
                        c17764M41616 = C17764.m41616(position4, (C20978) interfaceC14723M52640, m40031(c23896));
                        break;
                    }
                    i11++;
                }
                z = this.f52282;
                i10 = this.f52288;
                if (z) {
                    c10709 = new C14235(j7);
                } else {
                    if ((i10 & 4) != 0) {
                        if (c17764M41616 != null) {
                            jM40031 = c17764M41616.mo6827();
                        } else {
                            if (c10709 != null) {
                                long jMo6828 = c10709.mo6827();
                                jMo17870 = c10709.mo17870();
                                j8 = jMo6828;
                            } else {
                                jM40031 = m40031(this.f52281);
                            }
                            c10709 = new C16352(j8, interfaceC8424.getPosition(), jMo17870);
                        }
                        j8 = jM40031;
                        jMo17870 = -1;
                        c10709 = new C16352(j8, interfaceC8424.getPosition(), jMo17870);
                    } else if (c17764M41616 != null) {
                        c10709 = c17764M41616;
                    } else if (c10709 == null) {
                        c10709 = null;
                    }
                    if (c10709 == null) {
                        if (c10709 != null) {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC8424.mo22061(0, 4, c17714.m41482());
                            c17714.m41484(0);
                            c17266.m40557(c17714.m41493());
                            c10709 = new C10709(c17266.f52918, c17266.f52921, interfaceC8424.getLength(), interfaceC8424.getPosition(), z2);
                        } else {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC8424.mo22061(0, 4, c17714.m41482());
                            c17714.m41484(0);
                            c17266.m40557(c17714.m41493());
                            c10709 = new C10709(c17266.f52918, c17266.f52921, interfaceC8424.getLength(), interfaceC8424.getPosition(), z2);
                        }
                    } else if (c10709 != null) {
                        if ((i10 & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        interfaceC8424.mo22061(0, 4, c17714.m41482());
                        c17714.m41484(0);
                        c17266.m40557(c17714.m41493());
                        c10709 = new C10709(c17266.f52918, c17266.f52921, interfaceC8424.getLength(), interfaceC8424.getPosition(), z2);
                    } else {
                        if ((i10 & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        interfaceC8424.mo22061(0, 4, c17714.m41482());
                        c17714.m41484(0);
                        c17266.m40557(c17714.m41493());
                        c10709 = new C10709(c17266.f52918, c17266.f52921, interfaceC8424.getLength(), interfaceC8424.getPosition(), z2);
                    }
                    this.f52271.mo8454(c10709.mo6827());
                }
                this.f52273 = c10709;
                this.f52283.mo3430(c10709);
                c1297 = new C1297();
                c1297.m4462("audio/mpeg");
                c1297.m4465(c17266.f52923);
                c1297.m4451(4096);
                c1297.m4472(c17266.f52919);
                c1297.m4456(c17266.f52922);
                c1297.m4477(c7718.f23852);
                c1297.m4458(c7718.f23853);
                if ((i10 & 8) != 0) {
                    c23897 = null;
                } else {
                    c23897 = this.f52281;
                }
                c1297.m4449(c23897);
                if (this.f52273.mo17871() != -2147483647) {
                    c1297.m4468(this.f52273.mo17871());
                }
                this.f52278.mo8456(c1297.m4440());
                this.f52279 = interfaceC8424.getPosition();
                j2 = 0;
                j = 1000000;
            } else {
                if (this.f52279 != 0) {
                    position = interfaceC8424.getPosition();
                    j3 = this.f52279;
                    if (position < j3) {
                        interfaceC8424.mo22070((int) (j3 - position));
                    }
                }
                j = 1000000;
                j2 = 0;
            }
            if (this.f52272 == 0) {
                interfaceC8424.mo22066();
                if (m40033(interfaceC8424)) {
                    i = -1;
                    i2 = -1;
                } else {
                    c17714.m41484(0);
                    iM41493 = c17714.m41493();
                    if (((-128000) & iM41493) == (((long) this.f52280) & (-128000))) {
                        i4 = 0;
                        i5 = 1;
                    } else if (C14442.m34471(iM41493) == -1) {
                        i5 = 1;
                        i4 = 0;
                    } else {
                        c17266.m40557(iM41493);
                        if (this.f52270 == -9223372036854775807L) {
                            this.f52270 = this.f52273.mo17869(interfaceC8424.getPosition());
                            j4 = this.f52274;
                            if (j4 != -9223372036854775807L) {
                                this.f52270 = (j4 - this.f52273.mo17869(j2)) + this.f52270;
                            }
                        }
                        this.f52272 = c17266.f52921;
                        position2 = interfaceC8424.getPosition() + ((long) c17266.f52921);
                        this.f52284 = position2;
                        interfaceC23409 = this.f52273;
                        if (interfaceC23409 instanceof C16352) {
                            C16352 c16353 = (C16352) interfaceC23409;
                            c16353.m38497((((this.f52285 + ((long) c17266.f52920)) * j) / ((long) c17266.f52922)) + this.f52270, position2);
                            if (this.f52276) {
                                this.f52276 = false;
                                this.f52278 = this.f52271;
                            }
                        }
                        iMo8451 = this.f52278.mo8451((InterfaceC9765) interfaceC8424, this.f52272, true);
                        if (iMo8451 == -1) {
                            i = -1;
                            i2 = -1;
                        } else {
                            i3 = this.f52272 - iMo8451;
                            this.f52272 = i3;
                            if (i3 <= 0) {
                                this.f52278.mo8455(this.f52270 + ((this.f52285 * j) / ((long) c17266.f52922)), 1, c17266.f52921, 0, null);
                                this.f52285 += (long) c17266.f52920;
                                this.f52272 = 0;
                            }
                            i = -1;
                            i2 = 0;
                        }
                    }
                    interfaceC8424.mo22070(i5);
                    this.f52280 = i4;
                    i = -1;
                    i2 = 0;
                }
            } else {
                iMo8451 = this.f52278.mo8451((InterfaceC9765) interfaceC8424, this.f52272, true);
                if (iMo8451 == -1) {
                    i = -1;
                    i2 = -1;
                } else {
                    i3 = this.f52272 - iMo8451;
                    this.f52272 = i3;
                    if (i3 <= 0) {
                        this.f52278.mo8455(this.f52270 + ((this.f52285 * j) / ((long) c17266.f52922)), 1, c17266.f52921, 0, null);
                        this.f52285 += (long) c17266.f52920;
                        this.f52272 = 0;
                    }
                    i = -1;
                    i2 = 0;
                }
            }
        }
        if (i2 == i) {
            InterfaceC23408 interfaceC234010 = this.f52273;
            if (interfaceC234010 instanceof C16352) {
                long j19 = ((this.f52285 * j) / ((long) c17266.f52922)) + this.f52270;
                if (interfaceC234010.mo6827() != j19) {
                    ((C16352) this.f52273).m38499(j19);
                    this.f52283.mo3430(this.f52273);
                    this.f52271.mo8454(this.f52273.mo6827());
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static long m40031(C23896 c23896) {
        if (c23896 == null) {
            return -9223372036854775807L;
        }
        int iM52639 = c23896.m52639();
        for (int i = 0; i < iM52639; i++) {
            InterfaceC14723 interfaceC14723M52640 = c23896.m52640(i);
            if (interfaceC14723M52640 instanceof C8983) {
                C8983 c8983 = (C8983) interfaceC14723M52640;
                if (c8983.f44734.equals("TLEN")) {
                    return C3603.m11014(Long.parseLong((String) c8983.f27301.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }
}
