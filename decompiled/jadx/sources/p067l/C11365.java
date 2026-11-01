package p067l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06VH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11365 {

    /* JADX INFO: renamed from: ֡ */
    public final C14361 f31719;

    /* JADX INFO: renamed from: ֫ */
    public final C24775 f31720;

    /* JADX INFO: renamed from: ۖ */
    public final int f31721;

    /* JADX INFO: renamed from: ۘ */
    public final C22094 f31722;

    /* JADX INFO: renamed from: ۚ */
    public final boolean f31723;

    /* JADX INFO: renamed from: ۜ */
    public final boolean f31724;

    /* JADX INFO: renamed from: ۡ */
    public final boolean f31725;

    /* JADX INFO: renamed from: ۢ */
    public final int f31726;

    /* JADX INFO: renamed from: ۧ */
    public final C15031 f31727;

    /* JADX INFO: renamed from: ܳ */
    public final C17852 f31728;

    /* JADX INFO: renamed from: ܺ */
    public final Object[] f31729;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f31730;

    /* JADX INFO: renamed from: ܿ */
    public final int[] f31731;

    /* JADX INFO: renamed from: ᩳ */
    public final C12350 f31732;

    /* JADX INFO: renamed from: ᩴ */
    public final int f31733;

    /* JADX INFO: renamed from: ᩵ */
    public final C4659 f31734;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean f31735;

    /* JADX INFO: renamed from: ᩻ */
    public final int f31736;

    /* JADX WARN: Code duplicated, block: B:158:0x021c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0235 A[EDGE_INSN: B:164:0x0235->B:165:0x0236 BREAK  A[LOOP:2: B:59:0x00ed->B:159:0x021e]] */
    /* JADX WARN: Code duplicated, block: B:167:0x023a  */
    /* JADX WARN: Code duplicated, block: B:168:0x023c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0240  */
    /* JADX WARN: Code duplicated, block: B:171:0x0242  */
    /* JADX WARN: Code duplicated, block: B:173:0x0246  */
    /* JADX WARN: Code duplicated, block: B:174:0x0248  */
    /* JADX WARN: Code duplicated, block: B:176:0x024c  */
    /* JADX WARN: Code duplicated, block: B:177:0x024e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:178:0x0250  */
    /* JADX WARN: Code duplicated, block: B:179:0x0252  */
    /* JADX WARN: Code duplicated, block: B:182:0x0257 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x025a  */
    /* JADX WARN: Code duplicated, block: B:185:0x025c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0260  */
    /* JADX WARN: Code duplicated, block: B:190:0x0268  */
    /* JADX WARN: Code duplicated, block: B:192:0x026d  */
    /* JADX WARN: Code duplicated, block: B:221:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:222:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:229:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:246:0x0235 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:275:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Failed to find 'out' block for switch in B:210:0x0291. Please report as an issue. */
    public C11365(int[] iArr, Object[] objArr, int i, int i2, int i3, boolean z, boolean z2, C14361 c14361, boolean z3, C4659 c4659, C24775 c24775, C7933 c7933, C7933 c7934) {
        boolean z4;
        C12350 c12350;
        byte b;
        int i4;
        int i5;
        int i6;
        boolean z5;
        int i7;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean zMo4821;
        this.f31731 = iArr;
        this.f31729 = objArr;
        this.f31736 = i;
        this.f31733 = i2;
        this.f31721 = i3;
        this.f31724 = z;
        this.f31735 = z2;
        this.f31719 = c14361;
        this.f31730 = z3;
        this.f31734 = c4659;
        this.f31720 = c24775;
        this.f31728 = z3 ? null : C17852.m40532(iArr, objArr, i);
        this.f31727 = iArr[i] == 17 ? (C15031) objArr[iArr[i + 2]] : null;
        int i8 = 0;
        int i9 = i;
        while (true) {
            int i10 = 4;
            int i11 = 3;
            int i12 = 1;
            if (i8 < iArr.length / 8) {
                int i13 = iArr[i9];
                if (i13 != 20) {
                    if (i13 == 1 || i13 == 3 || (i13 == 16 && iArr[i9 + 2] != 0)) {
                        i9 = iArr[i9 + 1];
                        i8++;
                    } else if (i13 == 4) {
                        int i14 = iArr[i9 + 1];
                        if (iArr[i14] == 20) {
                            C6000 c6000 = (C6000) objArr[iArr[i14 + 2]];
                            if (c6000.f15032 != 0) {
                                InterfaceC12628 interfaceC12628 = (InterfaceC12628) objArr[iArr[i9 + 2]];
                                int iM36555 = C16057.m36555(interfaceC12628);
                                int i15 = 0;
                                while (true) {
                                    if (i15 < iM36555) {
                                        if (!interfaceC12628.mo4821(i15) || (!c6000.f15038.mo4821(i15) && i15 != c6000.f15034 && (c6000.f15033 || !Character.isSurrogate((char) i15)))) {
                                            i15++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                z4 = true;
                this.f31723 = z4;
                if (iArr[i] == 21) {
                    c12350 = (C12350) objArr[iArr[i + 2]];
                } else {
                    c12350 = null;
                }
                this.f31732 = c12350;
                int i16 = 11;
                if (!z3 || this.f31727 != null || this.f31728 != null || z4 || c12350 != null) {
                    b = -1;
                    break;
                }
                ArrayList arrayList = new ArrayList();
                int i17 = 0;
                boolean z9 = false;
                b = 0;
                int i18 = i;
                while (true) {
                    if (i17 < iArr.length / 8) {
                        int i19 = iArr[i18];
                        if (i19 == 0) {
                            if (!z9 || !arrayList.isEmpty()) {
                                break;
                            } else {
                                break;
                            }
                        }
                        if (i19 != i12 && i19 != i11) {
                            int i20 = 7;
                            if (i19 != i10) {
                                if (i19 == 7) {
                                    arrayList.add(Integer.valueOf(iArr[i18 + 2]));
                                } else if (i19 != 8) {
                                    if (i19 != i16) {
                                        if (i19 != 16) {
                                            if (i19 != 28 && i19 != 29) {
                                            }
                                        } else if (iArr[i18 + 2] == 0) {
                                        }
                                    }
                                } else if (arrayList.isEmpty() || ((Integer) C6406.m14670(arrayList, 1)).intValue() != iArr[i18 + 2]) {
                                }
                                b = 1;
                            } else {
                                InterfaceC12628 interfaceC12629 = (InterfaceC12628) objArr[iArr[i18 + 2]];
                                int i21 = iArr[i18 + 1];
                                int i22 = 0;
                                while (true) {
                                    if (i22 < iArr.length / 8) {
                                        int i23 = iArr[i21];
                                        if (i23 == i20 || i23 == 8 || i23 == 11) {
                                            i21 = iArr[i21 + 1];
                                        } else {
                                            if (i23 != 0) {
                                                if (i23 == 1 || (i23 == 4 && iArr[i21 + 3] > 0)) {
                                                    InterfaceC12628 interfaceC126210 = (InterfaceC12628) objArr[iArr[i21 + 2]];
                                                    C7933 c7935 = C16057.f47257;
                                                    int iM42223 = C18543.m42223(interfaceC126210);
                                                    if (iM42223 >= 0) {
                                                        zMo4821 = interfaceC12629.mo4821(iM42223);
                                                        z8 = !zMo4821;
                                                        if (z8) {
                                                            z9 = true;
                                                        }
                                                    } else {
                                                        int iMin = Math.min(C16057.m36555(interfaceC12629), C16057.m36555(interfaceC126210));
                                                        int i24 = 0;
                                                        while (true) {
                                                            if (i24 < iMin) {
                                                                if (interfaceC12629.mo4821(i24) && interfaceC126210.mo4821(i24)) {
                                                                    z8 = false;
                                                                    if (z8) {
                                                                        z9 = true;
                                                                    }
                                                                } else {
                                                                    i24++;
                                                                }
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    if (i23 == 3 || i23 == 28 || i23 == 29) {
                                                        int[] iArr2 = (int[]) objArr[iArr[i21 + 2]];
                                                        if (iArr2.length == 0) {
                                                            i21 = iArr[i21 + 1];
                                                        } else {
                                                            int i25 = iArr2[0];
                                                            if (i23 == 3) {
                                                                zMo4821 = interfaceC12629.mo4821(i25);
                                                                z8 = !zMo4821;
                                                                if (z8) {
                                                                    z9 = true;
                                                                }
                                                            } else {
                                                                if (i23 == 28) {
                                                                    int i26 = ((i25 + (-97)) | (122 - i25)) >= 0 ? i25 - 32 : i25;
                                                                    if (interfaceC12629.mo4821(i25) || (i26 != i25 && interfaceC12629.mo4821(i26))) {
                                                                    }
                                                                } else {
                                                                    int iM36556 = C16057.m36555(interfaceC12629);
                                                                    int i27 = 0;
                                                                    while (true) {
                                                                        if (i27 < iM36556) {
                                                                            if ((i27 != i25 && i25 != C5595.m12395(i27)) || !interfaceC12629.mo4821(i27)) {
                                                                                i27++;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                if (z8) {
                                                                    z9 = true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z8 = false;
                                                    if (z8) {
                                                        z9 = true;
                                                    }
                                                }
                                            }
                                            z8 = true;
                                            if (z8) {
                                                z9 = true;
                                            }
                                        }
                                        i22++;
                                        i20 = 7;
                                    }
                                    z8 = false;
                                    if (z8) {
                                        z9 = true;
                                    }
                                }
                            }
                        }
                        i18 = iArr[i18 + 1];
                        i17++;
                        i10 = 4;
                        i12 = 1;
                        i16 = 11;
                        i11 = 3;
                    }
                    b = -1;
                    break;
                }
                if (this.f31727 != null) {
                    i4 = 1;
                } else if (this.f31728 != null) {
                    i4 = 2;
                } else if (this.f31723) {
                    i4 = 3;
                } else if (this.f31732 != null) {
                    i4 = 4;
                } else if (b >= 0) {
                    i4 = 5;
                } else {
                    i4 = 0;
                }
                this.f31726 = i4;
                if (b >= 0) {
                    if (!z3) {
                        if (!this.f31723) {
                            i5 = 0;
                            i6 = i;
                            while (true) {
                                if (i5 >= iArr.length / 8) {
                                    i7 = iArr[i6];
                                    if (i7 == 0) {
                                        if (i7 == 1 && i7 != 2 && i7 != 3 && i7 != 11) {
                                            if (i7 != 20) {
                                                if (i7 != 34 && i7 != 39 && i7 != 42 && i7 != 36 && i7 != 37) {
                                                    switch (i7) {
                                                        case 15:
                                                            break;
                                                        case 16:
                                                            if (iArr[i6 + 2] != 0) {
                                                            }
                                                            break;
                                                        case 17:
                                                            break;
                                                        default:
                                                            switch (i7) {
                                                                case 28:
                                                                case 29:
                                                                case 30:
                                                                case 31:
                                                                case 32:
                                                                    continue;
                                                            }
                                                            break;
                                                    }
                                                    if (!z5) {
                                                    }
                                                }
                                            }
                                        }
                                        i6 = iArr[i6 + 1];
                                        i5++;
                                    }
                                    z5 = true;
                                    if (!z5) {
                                    }
                                }
                                z5 = false;
                                if (!z5) {
                                }
                            }
                        }
                        z6 = false;
                    }
                    z6 = true;
                } else if (b != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.f31725 = z6;
                if (!z3 || z || z2) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                this.f31722 = C22094.m49756(iArr, objArr, i, i2, c7933, c7934, z7);
                return;
            }
            z4 = false;
            this.f31723 = z4;
            if (iArr[i] == 21) {
                c12350 = (C12350) objArr[iArr[i + 2]];
            } else {
                c12350 = null;
            }
            this.f31732 = c12350;
            int i110 = 11;
            if (!z3) {
                b = -1;
                break;
            } else {
                b = -1;
                break;
            }
            if (this.f31727 != null) {
                i4 = 1;
            } else if (this.f31728 != null) {
                i4 = 2;
            } else if (this.f31723) {
                i4 = 3;
            } else if (this.f31732 != null) {
                i4 = 4;
            } else if (b >= 0) {
                i4 = 5;
            } else {
                i4 = 0;
            }
            this.f31726 = i4;
            if (b >= 0) {
                if (!z3) {
                    if (!this.f31723) {
                        i5 = 0;
                        i6 = i;
                        while (true) {
                            if (i5 >= iArr.length / 8) {
                                i7 = iArr[i6];
                                if (i7 == 0) {
                                    if (i7 == 1) {
                                    }
                                    i6 = iArr[i6 + 1];
                                    i5++;
                                }
                                z5 = true;
                                if (!z5) {
                                }
                            }
                            z5 = false;
                            if (!z5) {
                            }
                        }
                    }
                    z6 = false;
                }
                z6 = true;
            } else if (b != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            this.f31725 = z6;
            if (z3) {
                z7 = true;
            } else {
                z7 = true;
            }
            this.f31722 = C22094.m49756(iArr, objArr, i, i2, c7933, c7934, z7);
            return;
        }
    }
}
