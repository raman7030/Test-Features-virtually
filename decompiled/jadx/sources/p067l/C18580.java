package p067l;

import java.io.EOFException;
import java.math.RoundingMode;
import java.util.List;

/* JADX INFO: renamed from: l.ܿۖۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 58Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18580 implements InterfaceC3669 {

    /* JADX INFO: renamed from: ᩸ */
    public static final C9199 f55449 = new C9199();

    /* JADX INFO: renamed from: ֡ */
    public long f55450;

    /* JADX INFO: renamed from: ֨ */
    public final C21105 f55451;

    /* JADX INFO: renamed from: ֫ */
    public long f55452;

    /* JADX INFO: renamed from: ۖ */
    public InterfaceC20790 f55453;

    /* JADX INFO: renamed from: ۘ */
    public int f55454;

    /* JADX INFO: renamed from: ۚ */
    public InterfaceC24615 f55455;

    /* JADX INFO: renamed from: ۜ */
    public final long f55456;

    /* JADX INFO: renamed from: ۠ */
    public final C18777 f55457;

    /* JADX INFO: renamed from: ۡ */
    public boolean f55458;

    /* JADX INFO: renamed from: ۢ */
    public final C18106 f55459;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC20790 f55460;

    /* JADX INFO: renamed from: ܳ */
    public long f55461;

    /* JADX INFO: renamed from: ܶ */
    public int f55462;

    /* JADX INFO: renamed from: ܺ */
    public C25079 f55463;

    /* JADX INFO: renamed from: ܽ */
    public boolean f55464;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC23116 f55465;

    /* JADX INFO: renamed from: ᩳ */
    public long f55466;

    /* JADX INFO: renamed from: ᩴ */
    public long f55467;

    /* JADX INFO: renamed from: ᩵ */
    public final C19203 f55468;

    /* JADX INFO: renamed from: ᩷ */
    public final C9704 f55469;

    /* JADX INFO: renamed from: ᩻ */
    public final int f55470;

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076() {
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܽ */
    public final InterfaceC3669 mo7081() {
        return this;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ܳ */
    public final List mo7080() {
        return AbstractC16192.m36872of();
    }

    public C18580(int i) {
        this(i, -9223372036854775807L);
    }

    public C18580(int i, long j) {
        this.f55470 = (i & 2) != 0 ? i | 1 : i;
        this.f55456 = j;
        this.f55468 = new C19203(10);
        this.f55457 = new C18777();
        this.f55469 = new C9704();
        this.f55452 = -9223372036854775807L;
        this.f55459 = new C18106();
        C21105 c21105 = new C21105();
        this.f55451 = c21105;
        this.f55460 = c21105;
        this.f55466 = -1L;
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo7079(InterfaceC10375 interfaceC10375) {
        return m42277(interfaceC10375, true);
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7078(InterfaceC23116 interfaceC23116) {
        this.f55465 = interfaceC23116;
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(0, 1);
        this.f55453 = interfaceC20790Mo5732;
        this.f55460 = interfaceC20790Mo5732;
        this.f55465.mo5734();
    }

    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final void mo7077(long j, long j2) {
        this.f55462 = 0;
        this.f55452 = -9223372036854775807L;
        this.f55467 = 0L;
        this.f55454 = 0;
        this.f55450 = j2;
        InterfaceC24615 interfaceC24615 = this.f55455;
        if (!(interfaceC24615 instanceof C17909) || ((C17909) interfaceC24615).m40715(j2)) {
            return;
        }
        this.f55458 = true;
        this.f55460 = this.f55451;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42280() {
        this.f55464 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m42277(InterfaceC10375 interfaceC10375, boolean z) throws EOFException {
        int i;
        int iMo24039;
        int iM36604;
        int i2 = z ? 32768 : 524288;
        interfaceC10375.mo24036();
        if (interfaceC10375.getPosition() == 0) {
            C25079 c25079M41182 = this.f55459.m41182(interfaceC10375, (this.f55470 & 8) == 0 ? null : f55449);
            this.f55463 = c25079M41182;
            if (c25079M41182 != null) {
                this.f55469.m22651(c25079M41182);
            }
            iMo24039 = (int) interfaceC10375.mo24039();
            if (!z) {
                interfaceC10375.mo24040(iMo24039);
            }
            i = 0;
        } else {
            i = 0;
            iMo24039 = 0;
        }
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (m42278(interfaceC10375)) {
                if (i3 > 0) {
                    break;
                }
                m42279();
                throw new EOFException();
            }
            C19203 c19203 = this.f55468;
            c19203.m43730(0);
            int iM43739 = c19203.m43739();
            if ((i == 0 || ((-128000) & iM43739) == (((long) i) & (-128000))) && (iM36604 = C16094.m36604(iM43739)) != -1) {
                i3++;
                if (i3 != 1) {
                    if (i3 == 4) {
                        break;
                    }
                } else {
                    this.f55457.m42806(iM43739);
                    i = iM43739;
                }
                interfaceC10375.mo24030(iM36604 - 4);
            } else {
                int i5 = i4 + 1;
                if (i4 == i2) {
                    if (z) {
                        return false;
                    }
                    m42279();
                    throw new EOFException();
                }
                if (z) {
                    interfaceC10375.mo24036();
                    interfaceC10375.mo24030(iMo24039 + i5);
                } else {
                    interfaceC10375.mo24040(1);
                }
                i4 = i5;
                i = 0;
                i3 = 0;
            }
        }
        if (z) {
            interfaceC10375.mo24040(iMo24039 + i4);
        } else {
            interfaceC10375.mo24036();
        }
        this.f55462 = i;
        return true;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m42278(InterfaceC10375 interfaceC10375) {
        InterfaceC24615 interfaceC24615 = this.f55455;
        if (interfaceC24615 != null) {
            long jMo19818 = interfaceC24615.mo19818();
            if (jMo19818 == -1 || interfaceC10375.mo24039() <= jMo19818 - 4) {
            }
            return true;
        }
        try {
            return !interfaceC10375.mo24038(true, 0, 4, this.f55468.m43728());
        } catch (EOFException unused) {
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m42279() {
        InterfaceC11402 interfaceC11402 = this.f55455;
        if ((interfaceC11402 instanceof C12546) && ((C11046) interfaceC11402).mo8955()) {
            long j = this.f55466;
            if (j == -1 || j == this.f55455.mo19818()) {
                return;
            }
            this.f55455 = ((C12546) this.f55455).m28929(this.f55466);
            InterfaceC23116 interfaceC23116 = this.f55465;
            interfaceC23116.getClass();
            interfaceC23116.mo5733(this.f55455);
            InterfaceC20790 interfaceC20790 = this.f55453;
            interfaceC20790.getClass();
            interfaceC20790.mo10501(this.f55455.mo8953());
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
    @Override // p067l.InterfaceC3669
    /* JADX INFO: renamed from: ֫ */
    public final int mo7075(InterfaceC10375 interfaceC10375, C24812 c24812) {
        int i;
        int i2;
        long j;
        InterfaceC24615 interfaceC24615;
        C19203 c19203;
        long j2;
        long position;
        long j3;
        int iMo10498;
        int i3;
        int iM43739;
        int i4;
        int i5;
        long position2;
        InterfaceC24615 interfaceC24616;
        long j4;
        C19203 c19204;
        int i6;
        int iM437310;
        C9704 c9704;
        C21934 c21934M49464;
        long j5;
        int i7;
        int i8;
        long position3;
        long j6;
        long length;
        long jM49465;
        C18777 c18777;
        InterfaceC24615 c12546;
        int i9;
        long j7;
        C25079 c25079;
        long position4;
        C19251 c19251M43862;
        boolean z;
        int i10;
        boolean z2;
        long length2;
        long jM42276;
        long jMo19818;
        long j8;
        C3601 c3601;
        C25079 c250710;
        int iM55048;
        int i11;
        InterfaceC16361 interfaceC16361M55049;
        C23877.m52958(this.f55453);
        String str = C5792.f14228;
        int i12 = this.f55462;
        C18777 c18778 = this.f55457;
        if (i12 == 0) {
            try {
                m42277(interfaceC10375, false);
                interfaceC24615 = this.f55455;
                c19203 = this.f55468;
                if (interfaceC24615 == null) {
                    c19204 = new C19203(c18778.f56103);
                    interfaceC10375.mo24031(0, c18778.f56103, c19204.m43728());
                    i6 = 21;
                    if ((c18778.f56106 & 1) != 0) {
                        if (c18778.f56101 != 1) {
                            i6 = 36;
                        }
                    } else if (c18778.f56101 == 1) {
                        i6 = 13;
                    }
                    if (c19204.m43729() >= i6 + 4) {
                        c19204.m43730(i6);
                        iM437310 = c19204.m43739();
                        if (iM437310 != 1483304551 && iM437310 != 1231971951) {
                            if (c19204.m43729() >= 40) {
                                c19204.m43730(36);
                                if (c19204.m43739() == 1447187017) {
                                    iM437310 = 1447187017;
                                } else {
                                    iM437310 = 0;
                                }
                            } else {
                                iM437310 = 0;
                            }
                        }
                    } else if (c19204.m43729() >= 40) {
                        c19204.m43730(36);
                        if (c19204.m43739() == 1447187017) {
                            iM437310 = 1447187017;
                        } else {
                            iM437310 = 0;
                        }
                    } else {
                        iM437310 = 0;
                    }
                    c9704 = this.f55469;
                    if (iM437310 == 1231971951) {
                        c21934M49464 = C21934.m49464(c18778, c19204);
                        j5 = c21934M49464.f68956;
                        if ((c9704.f26765 != -1 || c9704.f26766 == -1) && (i7 = c21934M49464.f68957) != -1 && (i8 = c21934M49464.f68959) != -1) {
                            c9704.f26765 = i7;
                            c9704.f26766 = i8;
                        }
                        position3 = interfaceC10375.getPosition();
                        if (interfaceC10375.getLength() != -1 || j5 == -1) {
                            j6 = -9223372036854775807L;
                        } else {
                            j6 = -9223372036854775807L;
                            long j9 = position3 + j5;
                            if (interfaceC10375.getLength() != j9) {
                                C21334.m48349("Data size mismatch between stream (" + interfaceC10375.getLength() + ") and Xing frame (" + j9 + "), using Xing value.");
                            }
                        }
                        interfaceC10375.mo24040(c18778.f56103);
                        if (iM437310 == 1483304551) {
                            c12546 = C11205.m25872(c21934M49464, position3);
                        } else {
                            length = interfaceC10375.getLength();
                            jM49465 = c21934M49464.m49465();
                            c18777 = c21934M49464.f68960;
                            if (jM49465 != j6) {
                                if (j5 != -1) {
                                    length = position3 + j5;
                                    i9 = c18777.f56103;
                                } else if (length != -1) {
                                    j5 = length - position3;
                                    i9 = c18777.f56103;
                                } else {
                                    c12546 = null;
                                }
                                long j10 = j5 - ((long) i9);
                                long j11 = length;
                                RoundingMode roundingMode = RoundingMode.HALF_UP;
                                c12546 = new C12546(C15129.m34548(C5792.m12993(j10, 8000000L, jM49465, roundingMode)), C15129.m34548(C10436.m24132(j10, c21934M49464.f68961, roundingMode)), j11, position3 + ((long) c18777.f56103), false);
                            } else {
                                c12546 = null;
                            }
                        }
                        j7 = j6;
                    } else {
                        if (iM437310 != 1447187017) {
                            c12546 = C8522.m19815(interfaceC10375.getLength(), interfaceC10375.getPosition(), this.f55457, c19204);
                            interfaceC10375.mo24040(c18778.f56103);
                        } else if (iM437310 != 1483304551) {
                            c21934M49464 = C21934.m49464(c18778, c19204);
                            j5 = c21934M49464.f68956;
                            if (c9704.f26765 != -1) {
                                c9704.f26765 = i7;
                                c9704.f26766 = i8;
                            } else {
                                c9704.f26765 = i7;
                                c9704.f26766 = i8;
                            }
                            position3 = interfaceC10375.getPosition();
                            if (interfaceC10375.getLength() != -1) {
                                j6 = -9223372036854775807L;
                            } else {
                                j6 = -9223372036854775807L;
                            }
                            interfaceC10375.mo24040(c18778.f56103);
                            if (iM437310 == 1483304551) {
                                c12546 = C11205.m25872(c21934M49464, position3);
                            } else {
                                length = interfaceC10375.getLength();
                                jM49465 = c21934M49464.m49465();
                                c18777 = c21934M49464.f68960;
                                if (jM49465 != j6) {
                                    if (j5 != -1) {
                                        length = position3 + j5;
                                        i9 = c18777.f56103;
                                    } else if (length != -1) {
                                        j5 = length - position3;
                                        i9 = c18777.f56103;
                                    } else {
                                        c12546 = null;
                                    }
                                    long j12 = j5 - ((long) i9);
                                    long j13 = length;
                                    RoundingMode roundingMode2 = RoundingMode.HALF_UP;
                                    c12546 = new C12546(C15129.m34548(C5792.m12993(j12, 8000000L, jM49465, roundingMode2)), C15129.m34548(C10436.m24132(j12, c21934M49464.f68961, roundingMode2)), j13, position3 + ((long) c18777.f56103), false);
                                } else {
                                    c12546 = null;
                                }
                            }
                            j7 = j6;
                        } else {
                            interfaceC10375.mo24036();
                            c12546 = null;
                        }
                        j7 = -9223372036854775807L;
                    }
                    c25079 = this.f55463;
                    position4 = interfaceC10375.getPosition();
                    if (c25079 != null) {
                        c19251M43862 = null;
                        break;
                    }
                    iM55048 = c25079.m55048();
                    i11 = 0;
                    while (true) {
                        if (i11 < iM55048) {
                            c19251M43862 = null;
                            break;
                        }
                        interfaceC16361M55049 = c25079.m55049(i11);
                        if (interfaceC16361M55049 instanceof C22306) {
                            c19251M43862 = C19251.m43862(position4, (C22306) interfaceC16361M55049, m42276(c25079));
                            break;
                        }
                        i11++;
                    }
                    z = this.f55464;
                    i10 = this.f55470;
                    if (z) {
                        c12546 = new C15897(j7);
                    } else {
                        if ((i10 & 4) != 0) {
                            if (c19251M43862 != null) {
                                jM42276 = c19251M43862.mo8953();
                            } else {
                                if (c12546 != null) {
                                    long jMo8953 = c12546.mo8953();
                                    jMo19818 = c12546.mo19818();
                                    j8 = jMo8953;
                                } else {
                                    jM42276 = m42276(this.f55463);
                                }
                                c12546 = new C17909(j8, interfaceC10375.getPosition(), jMo19818);
                            }
                            j8 = jM42276;
                            jMo19818 = -1;
                            c12546 = new C17909(j8, interfaceC10375.getPosition(), jMo19818);
                        } else if (c19251M43862 != null) {
                            c12546 = c19251M43862;
                        } else if (c12546 == null) {
                            c12546 = null;
                        }
                        if (c12546 == null && !c12546.mo8955() && (i10 & 1) != 0 && c12546.mo8953() != -9223372036854775807L && (c12546.mo19818() != -1 || interfaceC10375.getLength() != -1)) {
                            long jMo19816 = c12546.mo19816() != -1 ? c12546.mo19816() : 0L;
                            if (c12546.mo19818() != -1) {
                                length2 = c12546.mo19818();
                            } else {
                                length2 = interfaceC10375.getLength();
                            }
                            long j14 = length2;
                            c12546 = new C12546(C15129.m34552(C5792.m12993(j14 - jMo19816, 8000000L, c12546.mo8953(), RoundingMode.HALF_UP)), -1, j14, jMo19816, false);
                        } else if (c12546 != null || (!c12546.mo8955() && (i10 & 1) != 0)) {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC10375.mo24031(0, 4, c19203.m43728());
                            c19203.m43730(0);
                            c18778.m42806(c19203.m43739());
                            c12546 = new C12546(c18778.f56100, c18778.f56103, interfaceC10375.getLength(), interfaceC10375.getPosition(), z2);
                        }
                        this.f55453.mo10501(c12546.mo8953());
                    }
                    this.f55455 = c12546;
                    this.f55465.mo5733(c12546);
                    c3601 = new C3601();
                    c3601.m6694("audio/mpeg");
                    c3601.m6697(c18778.f56105);
                    c3601.m6683(4096);
                    c3601.m6704(c18778.f56101);
                    c3601.m6688(c18778.f56104);
                    c3601.m6709(c9704.f26765);
                    c3601.m6690(c9704.f26766);
                    if ((i10 & 8) != 0) {
                        c250710 = null;
                    } else {
                        c250710 = this.f55463;
                    }
                    c3601.m6681(c250710);
                    if (this.f55455.mo19819() != -2147483647) {
                        c3601.m6700(this.f55455.mo19819());
                    }
                    this.f55460.mo10503(c3601.m6672());
                    this.f55461 = interfaceC10375.getPosition();
                    j2 = 0;
                    j = 1000000;
                } else {
                    if (this.f55461 != 0) {
                        position = interfaceC10375.getPosition();
                        j3 = this.f55461;
                        if (position < j3) {
                            interfaceC10375.mo24040((int) (j3 - position));
                        }
                    }
                    j = 1000000;
                    j2 = 0;
                }
                if (this.f55454 == 0) {
                    interfaceC10375.mo24036();
                    if (m42278(interfaceC10375)) {
                        i = -1;
                        i2 = -1;
                    } else {
                        c19203.m43730(0);
                        iM43739 = c19203.m43739();
                        if (((-128000) & iM43739) == (((long) this.f55462) & (-128000))) {
                            i4 = 0;
                            i5 = 1;
                        } else if (C16094.m36604(iM43739) == -1) {
                            i5 = 1;
                            i4 = 0;
                        } else {
                            c18778.m42806(iM43739);
                            if (this.f55452 == -9223372036854775807L) {
                                this.f55452 = this.f55455.mo19817(interfaceC10375.getPosition());
                                j4 = this.f55456;
                                if (j4 != -9223372036854775807L) {
                                    this.f55452 = (j4 - this.f55455.mo19817(j2)) + this.f55452;
                                }
                            }
                            this.f55454 = c18778.f56103;
                            position2 = interfaceC10375.getPosition() + ((long) c18778.f56103);
                            this.f55466 = position2;
                            interfaceC24616 = this.f55455;
                            if (interfaceC24616 instanceof C17909) {
                                C17909 c17909 = (C17909) interfaceC24616;
                                c17909.m40714((((this.f55467 + ((long) c18778.f56102)) * j) / ((long) c18778.f56104)) + this.f55452, position2);
                                if (this.f55458 && c17909.m40715(this.f55450)) {
                                    this.f55458 = false;
                                    this.f55460 = this.f55453;
                                }
                            }
                            iMo10498 = this.f55460.mo10498((InterfaceC11649) interfaceC10375, this.f55454, true);
                            if (iMo10498 == -1) {
                                i = -1;
                                i2 = -1;
                            } else {
                                i3 = this.f55454 - iMo10498;
                                this.f55454 = i3;
                                if (i3 <= 0) {
                                    this.f55460.mo10502(this.f55452 + ((this.f55467 * j) / ((long) c18778.f56104)), 1, c18778.f56103, 0, null);
                                    this.f55467 += (long) c18778.f56102;
                                    this.f55454 = 0;
                                }
                                i = -1;
                                i2 = 0;
                            }
                        }
                        interfaceC10375.mo24040(i5);
                        this.f55462 = i4;
                        i = -1;
                        i2 = 0;
                    }
                } else {
                    iMo10498 = this.f55460.mo10498((InterfaceC11649) interfaceC10375, this.f55454, true);
                    if (iMo10498 == -1) {
                        i = -1;
                        i2 = -1;
                    } else {
                        i3 = this.f55454 - iMo10498;
                        this.f55454 = i3;
                        if (i3 <= 0) {
                            this.f55460.mo10502(this.f55452 + ((this.f55467 * j) / ((long) c18778.f56104)), 1, c18778.f56103, 0, null);
                            this.f55467 += (long) c18778.f56102;
                            this.f55454 = 0;
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
            interfaceC24615 = this.f55455;
            c19203 = this.f55468;
            if (interfaceC24615 == null) {
                c19204 = new C19203(c18778.f56103);
                interfaceC10375.mo24031(0, c18778.f56103, c19204.m43728());
                i6 = 21;
                if ((c18778.f56106 & 1) != 0) {
                    if (c18778.f56101 != 1) {
                        i6 = 36;
                    }
                } else if (c18778.f56101 == 1) {
                    i6 = 13;
                }
                if (c19204.m43729() >= i6 + 4) {
                    c19204.m43730(i6);
                    iM437310 = c19204.m43739();
                    if (iM437310 != 1483304551) {
                        if (c19204.m43729() >= 40) {
                            c19204.m43730(36);
                            if (c19204.m43739() == 1447187017) {
                                iM437310 = 1447187017;
                            } else {
                                iM437310 = 0;
                            }
                        } else {
                            iM437310 = 0;
                        }
                    }
                } else if (c19204.m43729() >= 40) {
                    c19204.m43730(36);
                    if (c19204.m43739() == 1447187017) {
                        iM437310 = 1447187017;
                    } else {
                        iM437310 = 0;
                    }
                } else {
                    iM437310 = 0;
                }
                c9704 = this.f55469;
                if (iM437310 == 1231971951) {
                    c21934M49464 = C21934.m49464(c18778, c19204);
                    j5 = c21934M49464.f68956;
                    if (c9704.f26765 != -1) {
                        c9704.f26765 = i7;
                        c9704.f26766 = i8;
                    } else {
                        c9704.f26765 = i7;
                        c9704.f26766 = i8;
                    }
                    position3 = interfaceC10375.getPosition();
                    if (interfaceC10375.getLength() != -1) {
                        j6 = -9223372036854775807L;
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    interfaceC10375.mo24040(c18778.f56103);
                    if (iM437310 == 1483304551) {
                        c12546 = C11205.m25872(c21934M49464, position3);
                    } else {
                        length = interfaceC10375.getLength();
                        jM49465 = c21934M49464.m49465();
                        c18777 = c21934M49464.f68960;
                        if (jM49465 != j6) {
                            if (j5 != -1) {
                                length = position3 + j5;
                                i9 = c18777.f56103;
                            } else if (length != -1) {
                                j5 = length - position3;
                                i9 = c18777.f56103;
                            } else {
                                c12546 = null;
                            }
                            long j15 = j5 - ((long) i9);
                            long j16 = length;
                            RoundingMode roundingMode3 = RoundingMode.HALF_UP;
                            c12546 = new C12546(C15129.m34548(C5792.m12993(j15, 8000000L, jM49465, roundingMode3)), C15129.m34548(C10436.m24132(j15, c21934M49464.f68961, roundingMode3)), j16, position3 + ((long) c18777.f56103), false);
                        } else {
                            c12546 = null;
                        }
                    }
                    j7 = j6;
                } else {
                    if (iM437310 != 1447187017) {
                        c12546 = C8522.m19815(interfaceC10375.getLength(), interfaceC10375.getPosition(), this.f55457, c19204);
                        interfaceC10375.mo24040(c18778.f56103);
                    } else if (iM437310 != 1483304551) {
                        c21934M49464 = C21934.m49464(c18778, c19204);
                        j5 = c21934M49464.f68956;
                        if (c9704.f26765 != -1) {
                            c9704.f26765 = i7;
                            c9704.f26766 = i8;
                        } else {
                            c9704.f26765 = i7;
                            c9704.f26766 = i8;
                        }
                        position3 = interfaceC10375.getPosition();
                        if (interfaceC10375.getLength() != -1) {
                            j6 = -9223372036854775807L;
                        } else {
                            j6 = -9223372036854775807L;
                        }
                        interfaceC10375.mo24040(c18778.f56103);
                        if (iM437310 == 1483304551) {
                            c12546 = C11205.m25872(c21934M49464, position3);
                        } else {
                            length = interfaceC10375.getLength();
                            jM49465 = c21934M49464.m49465();
                            c18777 = c21934M49464.f68960;
                            if (jM49465 != j6) {
                                if (j5 != -1) {
                                    length = position3 + j5;
                                    i9 = c18777.f56103;
                                } else if (length != -1) {
                                    j5 = length - position3;
                                    i9 = c18777.f56103;
                                } else {
                                    c12546 = null;
                                }
                                long j17 = j5 - ((long) i9);
                                long j18 = length;
                                RoundingMode roundingMode4 = RoundingMode.HALF_UP;
                                c12546 = new C12546(C15129.m34548(C5792.m12993(j17, 8000000L, jM49465, roundingMode4)), C15129.m34548(C10436.m24132(j17, c21934M49464.f68961, roundingMode4)), j18, position3 + ((long) c18777.f56103), false);
                            } else {
                                c12546 = null;
                            }
                        }
                        j7 = j6;
                    } else {
                        interfaceC10375.mo24036();
                        c12546 = null;
                    }
                    j7 = -9223372036854775807L;
                }
                c25079 = this.f55463;
                position4 = interfaceC10375.getPosition();
                if (c25079 != null) {
                    c19251M43862 = null;
                    break;
                }
                iM55048 = c25079.m55048();
                i11 = 0;
                while (true) {
                    if (i11 < iM55048) {
                        c19251M43862 = null;
                        break;
                    }
                    interfaceC16361M55049 = c25079.m55049(i11);
                    if (interfaceC16361M55049 instanceof C22306) {
                        c19251M43862 = C19251.m43862(position4, (C22306) interfaceC16361M55049, m42276(c25079));
                        break;
                    }
                    i11++;
                }
                z = this.f55464;
                i10 = this.f55470;
                if (z) {
                    c12546 = new C15897(j7);
                } else {
                    if ((i10 & 4) != 0) {
                        if (c19251M43862 != null) {
                            jM42276 = c19251M43862.mo8953();
                        } else {
                            if (c12546 != null) {
                                long jMo8954 = c12546.mo8953();
                                jMo19818 = c12546.mo19818();
                                j8 = jMo8954;
                            } else {
                                jM42276 = m42276(this.f55463);
                            }
                            c12546 = new C17909(j8, interfaceC10375.getPosition(), jMo19818);
                        }
                        j8 = jM42276;
                        jMo19818 = -1;
                        c12546 = new C17909(j8, interfaceC10375.getPosition(), jMo19818);
                    } else if (c19251M43862 != null) {
                        c12546 = c19251M43862;
                    } else if (c12546 == null) {
                        c12546 = null;
                    }
                    if (c12546 == null) {
                        if (c12546 != null) {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC10375.mo24031(0, 4, c19203.m43728());
                            c19203.m43730(0);
                            c18778.m42806(c19203.m43739());
                            c12546 = new C12546(c18778.f56100, c18778.f56103, interfaceC10375.getLength(), interfaceC10375.getPosition(), z2);
                        } else {
                            if ((i10 & 2) != 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            interfaceC10375.mo24031(0, 4, c19203.m43728());
                            c19203.m43730(0);
                            c18778.m42806(c19203.m43739());
                            c12546 = new C12546(c18778.f56100, c18778.f56103, interfaceC10375.getLength(), interfaceC10375.getPosition(), z2);
                        }
                    } else if (c12546 != null) {
                        if ((i10 & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        interfaceC10375.mo24031(0, 4, c19203.m43728());
                        c19203.m43730(0);
                        c18778.m42806(c19203.m43739());
                        c12546 = new C12546(c18778.f56100, c18778.f56103, interfaceC10375.getLength(), interfaceC10375.getPosition(), z2);
                    } else {
                        if ((i10 & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        interfaceC10375.mo24031(0, 4, c19203.m43728());
                        c19203.m43730(0);
                        c18778.m42806(c19203.m43739());
                        c12546 = new C12546(c18778.f56100, c18778.f56103, interfaceC10375.getLength(), interfaceC10375.getPosition(), z2);
                    }
                    this.f55453.mo10501(c12546.mo8953());
                }
                this.f55455 = c12546;
                this.f55465.mo5733(c12546);
                c3601 = new C3601();
                c3601.m6694("audio/mpeg");
                c3601.m6697(c18778.f56105);
                c3601.m6683(4096);
                c3601.m6704(c18778.f56101);
                c3601.m6688(c18778.f56104);
                c3601.m6709(c9704.f26765);
                c3601.m6690(c9704.f26766);
                if ((i10 & 8) != 0) {
                    c250710 = null;
                } else {
                    c250710 = this.f55463;
                }
                c3601.m6681(c250710);
                if (this.f55455.mo19819() != -2147483647) {
                    c3601.m6700(this.f55455.mo19819());
                }
                this.f55460.mo10503(c3601.m6672());
                this.f55461 = interfaceC10375.getPosition();
                j2 = 0;
                j = 1000000;
            } else {
                if (this.f55461 != 0) {
                    position = interfaceC10375.getPosition();
                    j3 = this.f55461;
                    if (position < j3) {
                        interfaceC10375.mo24040((int) (j3 - position));
                    }
                }
                j = 1000000;
                j2 = 0;
            }
            if (this.f55454 == 0) {
                interfaceC10375.mo24036();
                if (m42278(interfaceC10375)) {
                    i = -1;
                    i2 = -1;
                } else {
                    c19203.m43730(0);
                    iM43739 = c19203.m43739();
                    if (((-128000) & iM43739) == (((long) this.f55462) & (-128000))) {
                        i4 = 0;
                        i5 = 1;
                    } else if (C16094.m36604(iM43739) == -1) {
                        i5 = 1;
                        i4 = 0;
                    } else {
                        c18778.m42806(iM43739);
                        if (this.f55452 == -9223372036854775807L) {
                            this.f55452 = this.f55455.mo19817(interfaceC10375.getPosition());
                            j4 = this.f55456;
                            if (j4 != -9223372036854775807L) {
                                this.f55452 = (j4 - this.f55455.mo19817(j2)) + this.f55452;
                            }
                        }
                        this.f55454 = c18778.f56103;
                        position2 = interfaceC10375.getPosition() + ((long) c18778.f56103);
                        this.f55466 = position2;
                        interfaceC24616 = this.f55455;
                        if (interfaceC24616 instanceof C17909) {
                            C17909 c179010 = (C17909) interfaceC24616;
                            c179010.m40714((((this.f55467 + ((long) c18778.f56102)) * j) / ((long) c18778.f56104)) + this.f55452, position2);
                            if (this.f55458) {
                                this.f55458 = false;
                                this.f55460 = this.f55453;
                            }
                        }
                        iMo10498 = this.f55460.mo10498((InterfaceC11649) interfaceC10375, this.f55454, true);
                        if (iMo10498 == -1) {
                            i = -1;
                            i2 = -1;
                        } else {
                            i3 = this.f55454 - iMo10498;
                            this.f55454 = i3;
                            if (i3 <= 0) {
                                this.f55460.mo10502(this.f55452 + ((this.f55467 * j) / ((long) c18778.f56104)), 1, c18778.f56103, 0, null);
                                this.f55467 += (long) c18778.f56102;
                                this.f55454 = 0;
                            }
                            i = -1;
                            i2 = 0;
                        }
                    }
                    interfaceC10375.mo24040(i5);
                    this.f55462 = i4;
                    i = -1;
                    i2 = 0;
                }
            } else {
                iMo10498 = this.f55460.mo10498((InterfaceC11649) interfaceC10375, this.f55454, true);
                if (iMo10498 == -1) {
                    i = -1;
                    i2 = -1;
                } else {
                    i3 = this.f55454 - iMo10498;
                    this.f55454 = i3;
                    if (i3 <= 0) {
                        this.f55460.mo10502(this.f55452 + ((this.f55467 * j) / ((long) c18778.f56104)), 1, c18778.f56103, 0, null);
                        this.f55467 += (long) c18778.f56102;
                        this.f55454 = 0;
                    }
                    i = -1;
                    i2 = 0;
                }
            }
        }
        if (i2 == i) {
            InterfaceC24615 interfaceC24617 = this.f55455;
            if (interfaceC24617 instanceof C17909) {
                long j19 = ((this.f55467 * j) / ((long) c18778.f56104)) + this.f55452;
                if (interfaceC24617.mo8953() != j19) {
                    ((C17909) this.f55455).m40716(j19);
                    this.f55465.mo5733(this.f55455);
                    this.f55453.mo10501(this.f55455.mo8953());
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static long m42276(C25079 c25079) {
        if (c25079 == null) {
            return -9223372036854775807L;
        }
        int iM55048 = c25079.m55048();
        for (int i = 0; i < iM55048; i++) {
            InterfaceC16361 interfaceC16361M55049 = c25079.m55049(i);
            if (interfaceC16361M55049 instanceof C10906) {
                C10906 c10906 = (C10906) interfaceC16361M55049;
                if (c10906.f47841.equals("TLEN")) {
                    return C5792.m12990(Long.parseLong((String) c10906.f30236.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }
}
