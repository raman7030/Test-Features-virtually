package p067l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: l.ۜ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: T8UY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8462 implements InterfaceC17178 {

    /* JADX INFO: renamed from: ᩶ */
    public static final byte[] f22695 = {73, 68, 51};

    /* JADX INFO: renamed from: ֨ */
    public final int f22697;

    /* JADX INFO: renamed from: ۖ */
    public boolean f22699;

    /* JADX INFO: renamed from: ۚ */
    public InterfaceC20790 f22701;

    /* JADX INFO: renamed from: ۡ */
    public boolean f22704;

    /* JADX INFO: renamed from: ۢ */
    public String f22705;

    /* JADX INFO: renamed from: ܳ */
    public long f22707;

    /* JADX INFO: renamed from: ܶ */
    public int f22708;

    /* JADX INFO: renamed from: ܺ */
    public boolean f22709;

    /* JADX INFO: renamed from: ܽ */
    public final String f22710;

    /* JADX INFO: renamed from: ܿ */
    public InterfaceC20790 f22711;

    /* JADX INFO: renamed from: ᩳ */
    public int f22712;

    /* JADX INFO: renamed from: ᩴ */
    public InterfaceC20790 f22713;

    /* JADX INFO: renamed from: ᩵ */
    public final String f22714;

    /* JADX INFO: renamed from: ᩻ */
    public final boolean f22718;

    /* JADX INFO: renamed from: ֫ */
    public final C17861 f22698 = new C17861(new byte[7], 7);

    /* JADX INFO: renamed from: ۘ */
    public final C19203 f22700 = new C19203(Arrays.copyOf(f22695, 10));

    /* JADX INFO: renamed from: ᩷ */
    public int f22715 = -1;

    /* JADX INFO: renamed from: ۜ */
    public int f22702 = -1;

    /* JADX INFO: renamed from: ۠ */
    public long f22703 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩹ */
    public long f22717 = -9223372036854775807L;

    /* JADX INFO: renamed from: ᩸ */
    public int f22716 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f22706 = 0;

    /* JADX INFO: renamed from: ֡ */
    public int f22696 = 256;

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3399(boolean z) {
    }

    public C8462(String str, int i, String str2, boolean z) {
        this.f22718 = z;
        this.f22714 = str;
        this.f22697 = i;
        this.f22710 = str2;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3395() {
        this.f22717 = -9223372036854775807L;
        this.f22704 = false;
        this.f22716 = 0;
        this.f22706 = 0;
        this.f22696 = 256;
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3398(InterfaceC23116 interfaceC23116, C20672 c20672) {
        c20672.m46737();
        this.f22705 = c20672.m46738();
        InterfaceC20790 interfaceC20790Mo5732 = interfaceC23116.mo5732(c20672.m46739(), 1);
        this.f22701 = interfaceC20790Mo5732;
        this.f22711 = interfaceC20790Mo5732;
        if (this.f22718) {
            c20672.m46737();
            InterfaceC20790 interfaceC20790Mo5733 = interfaceC23116.mo5732(c20672.m46739(), 5);
            this.f22713 = interfaceC20790Mo5733;
            C3601 c3601 = new C3601();
            c3601.m6701(c20672.m46738());
            c3601.m6694(this.f22710);
            c3601.m6697("application/id3");
            interfaceC20790Mo5733.mo10503(c3601.m6672());
            return;
        }
        this.f22713 = new C21105();
    }

    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3396(int i, long j) {
        this.f22717 = j;
    }

    /* JADX INFO: renamed from: ۧ */
    public final long m19690() {
        return this.f22703;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:129:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:132:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:134:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:135:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:136:0x0303  */
    /* JADX WARN: Code duplicated, block: B:157:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p067l.InterfaceC17178
    /* JADX INFO: renamed from: ֫ */
    public final void mo3397(C19203 c19203) {
        int iM43713;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.f22701.getClass();
        String str = C5792.f14228;
        while (c19203.m43703() > 0) {
            int i6 = this.f22716;
            C19203 c19204 = this.f22700;
            C17861 c17861 = this.f22698;
            int i7 = 0;
            int i8 = 4;
            int i9 = 1;
            if (i6 == 0) {
                byte[] bArrM43728 = c19203.m43728();
                int iM43731 = c19203.m43731();
                int iM43729 = c19203.m43729();
                while (true) {
                    if (iM43731 < iM43729) {
                        int i10 = iM43731 + 1;
                        byte b = bArrM43728[iM43731];
                        int i11 = b & 255;
                        if (this.f22696 == 512 && (((((byte) i11) & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) == 65520) {
                            if (!this.f22704) {
                                int i12 = iM43731 - 1;
                                c19203.m43730(iM43731);
                                byte[] bArr = c17861.f53313;
                                if (c19203.m43703() >= i9) {
                                    c19203.m43707(i7, i9, bArr);
                                    c17861.m40569(i8);
                                    int iM40558 = c17861.m40558(i9);
                                    int i13 = this.f22715;
                                    if (i13 == -1 || iM40558 == i13) {
                                        if (this.f22702 != -1) {
                                            byte[] bArr2 = c17861.f53313;
                                            if (c19203.m43703() >= i9) {
                                                c19203.m43707(i7, i9, bArr2);
                                                c17861.m40569(2);
                                                i3 = 4;
                                                if (c17861.m40558(4) == this.f22702) {
                                                    c19203.m43730(i10);
                                                }
                                            }
                                        } else {
                                            i3 = 4;
                                        }
                                        byte[] bArr3 = c17861.f53313;
                                        if (c19203.m43703() >= i3) {
                                            c19203.m43707(i7, i3, bArr3);
                                            c17861.m40569(14);
                                            int iM40559 = c17861.m40558(13);
                                            if (iM40559 >= 7) {
                                                byte[] bArrM43729 = c19203.m43728();
                                                int iM437210 = c19203.m43729();
                                                int i14 = i12 + iM40559;
                                                if (i14 < iM437210) {
                                                    byte b2 = bArrM43729[i14];
                                                    if (b2 == -1) {
                                                        int i15 = i14 + 1;
                                                        if (i15 != iM437210) {
                                                            byte b3 = bArrM43729[i15];
                                                            if ((((b3 & 255 ? 1 : 0) | 65280 ? 1 : 0) & 65526) != 65520 || ((b3 & 8) >> 3) != iM40558) {
                                                            }
                                                        }
                                                    } else if (b2 == 73 && ((i4 = i14 + 1) == iM437210 || (bArrM43729[i4] == 68 && ((i5 = i14 + 2) == iM437210 || bArrM43729[i5] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                i = this.f22696;
                                i2 = i11 | i;
                                if (i2 != 329) {
                                    this.f22696 = 768;
                                } else if (i2 != 511) {
                                    this.f22696 = 512;
                                } else if (i2 != 836) {
                                    this.f22696 = 1024;
                                } else if (i2 != 1075) {
                                    if (i != 256) {
                                        this.f22696 = 256;
                                    }
                                    i8 = 4;
                                    i9 = 1;
                                    i7 = 0;
                                } else {
                                    this.f22716 = 2;
                                    this.f22706 = 3;
                                    this.f22708 = 0;
                                    c19204.m43730(0);
                                    c19203.m43730(i10);
                                }
                                iM43731 = i10;
                                i8 = 4;
                                i9 = 1;
                                i7 = 0;
                            }
                            this.f22712 = (b & 8) >> 3;
                            this.f22709 = (b & 1) == 0;
                            if (this.f22704) {
                                this.f22716 = 3;
                                this.f22706 = 0;
                            } else {
                                this.f22716 = 1;
                                this.f22706 = 0;
                            }
                            c19203.m43730(i10);
                        } else {
                            i = this.f22696;
                            i2 = i11 | i;
                            if (i2 != 329) {
                                this.f22696 = 768;
                            } else if (i2 != 511) {
                                this.f22696 = 512;
                            } else if (i2 != 836) {
                                this.f22696 = 1024;
                            } else if (i2 != 1075) {
                                if (i != 256) {
                                    this.f22696 = 256;
                                }
                                i8 = 4;
                                i9 = 1;
                                i7 = 0;
                            } else {
                                this.f22716 = 2;
                                this.f22706 = 3;
                                this.f22708 = 0;
                                c19204.m43730(0);
                                c19203.m43730(i10);
                            }
                            iM43731 = i10;
                            i8 = 4;
                            i9 = 1;
                            i7 = 0;
                        }
                    } else {
                        c19203.m43730(iM43731);
                    }
                }
            } else if (i6 != 1) {
                if (i6 == 2) {
                    byte[] bArrM437210 = c19204.m43728();
                    int iMin = Math.min(c19203.m43703(), 10 - this.f22706);
                    c19203.m43707(this.f22706, iMin, bArrM437210);
                    int i16 = this.f22706 + iMin;
                    this.f22706 = i16;
                    if (i16 == 10) {
                        this.f22713.mo10500(10, c19204);
                        c19204.m43730(6);
                        InterfaceC20790 interfaceC20790 = this.f22713;
                        iM43713 = c19204.m43713() + 10;
                        this.f22716 = 4;
                        this.f22706 = 10;
                        this.f22711 = interfaceC20790;
                        j = 0;
                        this.f22707 = j;
                        this.f22708 = iM43713;
                    }
                } else if (i6 == 3) {
                    int i17 = this.f22709 ? 7 : 5;
                    byte[] bArr4 = c17861.f53313;
                    int iMin2 = Math.min(c19203.m43703(), i17 - this.f22706);
                    c19203.m43707(this.f22706, iMin2, bArr4);
                    int i18 = this.f22706 + iMin2;
                    this.f22706 = i18;
                    if (i18 == i17) {
                        c17861.m40569(0);
                        if (!this.f22699) {
                            int iM405510 = c17861.m40558(2) + 1;
                            if (iM405510 != 2) {
                                C21334.m48351("Detected audio object type: " + iM405510 + ", but assuming AAC LC.");
                                iM405510 = 2;
                            }
                            c17861.m40566(5);
                            int iM405511 = c17861.m40558(3);
                            int i19 = this.f22702;
                            byte[] bArr5 = {(byte) (((iM405510 << 3) & 248) | ((i19 >> 1) & 7)), (byte) (((iM405511 << 3) & UMErrorCode.E_UM_BE_NOT_MAINPROCESS) | ((i19 << 7) & 128))};
                            C14674 c14674M31803 = C14004.m31803(new C17861(bArr5, 2), false);
                            C3601 c3601 = new C3601();
                            c3601.m6701(this.f22705);
                            c3601.m6694(this.f22710);
                            c3601.m6697("audio/mp4a-latm");
                            c3601.m6677(c14674M31803.f41889);
                            c3601.m6704(c14674M31803.f41888);
                            c3601.m6688(c14674M31803.f41890);
                            c3601.m6678(Collections.singletonList(bArr5));
                            c3601.m6703(this.f22714);
                            c3601.m6686(this.f22697);
                            C10307 c10307M6672 = c3601.m6672();
                            this.f22703 = 1024000000 / ((long) c10307M6672.f28538);
                            this.f22701.mo10503(c10307M6672);
                            this.f22699 = true;
                        } else {
                            c17861.m40566(10);
                        }
                        c17861.m40566(4);
                        int iM405512 = c17861.m40558(13);
                        iM43713 = iM405512 - 7;
                        if (this.f22709) {
                            iM43713 = iM405512 - 9;
                        }
                        InterfaceC20790 interfaceC20791 = this.f22701;
                        j = this.f22703;
                        this.f22716 = 4;
                        this.f22706 = 0;
                        this.f22711 = interfaceC20791;
                        this.f22707 = j;
                        this.f22708 = iM43713;
                    }
                } else {
                    if (i6 != 4) {
                        throw new IllegalStateException();
                    }
                    int iMin3 = Math.min(c19203.m43703(), this.f22708 - this.f22706);
                    this.f22711.mo10500(iMin3, c19203);
                    int i20 = this.f22706 + iMin3;
                    this.f22706 = i20;
                    if (i20 == this.f22708) {
                        C23877.m52960(this.f22717 != -9223372036854775807L);
                        this.f22711.mo10502(this.f22717, 1, this.f22708, 0, null);
                        this.f22717 += this.f22707;
                        this.f22716 = 0;
                        this.f22706 = 0;
                        this.f22696 = 256;
                    }
                }
            } else if (c19203.m43703() != 0) {
                c17861.f53313[0] = c19203.m43728()[c19203.m43731()];
                c17861.m40569(2);
                int iM405513 = c17861.m40558(4);
                int i21 = this.f22702;
                if (i21 != -1 && iM405513 != i21) {
                    this.f22704 = false;
                    this.f22716 = 0;
                    this.f22706 = 0;
                    this.f22696 = 256;
                } else {
                    if (!this.f22704) {
                        this.f22704 = true;
                        this.f22715 = this.f22712;
                        this.f22702 = iM405513;
                    }
                    this.f22716 = 3;
                    this.f22706 = 0;
                }
            }
        }
    }
}
