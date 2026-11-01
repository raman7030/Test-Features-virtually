package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.֡۫ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46P2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2759 extends C8253 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean f4642;

    /* JADX INFO: renamed from: ۜ */
    public final EnumC19980 f4643;

    /* JADX INFO: renamed from: ۡ */
    public final ArrayList f4644;

    /* JADX INFO: renamed from: ۢ */
    public final CharSequence f4645;

    /* JADX INFO: renamed from: ܳ */
    public final C19524 f4647;

    /* JADX INFO: renamed from: ܺ */
    public final int f4648;

    /* JADX INFO: renamed from: ܽ */
    public byte[] f4649;

    /* JADX INFO: renamed from: ܿ */
    public int[] f4650;

    /* JADX INFO: renamed from: ᩳ */
    public long[] f4651;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f4646 = new ArrayList();

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f4652 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public int f4653 = -1;

    public C2759(CharSequence charSequence, C4150 c4150, EnumC19980 enumC19980, int i, C19524 c19524) {
        this.f4645 = charSequence;
        ArrayList arrayListM8412 = c4150.m8412();
        this.f4644 = arrayListM8412;
        this.f4643 = enumC19980;
        this.f4647 = c19524;
        this.f4642 = c19524 == null && enumC19980 != EnumC19980.JSON && C19524.m44356(arrayListM8412);
        this.f4648 = i;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x017f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0191  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:122:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:124:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:130:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:150:0x0227  */
    /* JADX WARN: Code duplicated, block: B:152:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:154:0x0230  */
    /* JADX WARN: Code duplicated, block: B:225:0x0333  */
    /* JADX WARN: Code duplicated, block: B:296:0x0470  */
    /* JADX WARN: Code duplicated, block: B:299:0x0479  */
    /* JADX WARN: Code duplicated, block: B:368:0x0481 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:76:0x0102  */
    /* JADX WARN: Code duplicated, block: B:83:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0129  */
    /* JADX WARN: Code duplicated, block: B:94:0x0138 A[LOOP:6: B:92:0x0132->B:94:0x0138, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0147  */
    /* JADX WARN: Code duplicated, block: B:97:0x0151  */
    /* JADX INFO: renamed from: ֫ */
    public final void m4325(List list) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        int i2;
        int i3;
        int i4;
        int iM10072;
        int i5;
        int iM10073;
        int i6;
        long[] jArr;
        boolean z;
        boolean z2;
        long[] jArr2;
        int iM4331;
        int i7;
        int i8;
        int i9;
        int type;
        int i10;
        int i11;
        ArrayList arrayList3 = this.f4644;
        int i12 = 1;
        int size = arrayList3.size() + 1;
        this.f4649 = new byte[size];
        this.f4650 = new int[size];
        this.f4651 = new long[size];
        int i13 = 0;
        while (i13 < arrayList3.size()) {
            C20195.m45697();
            InterfaceC2808 interfaceC2808 = (InterfaceC2808) arrayList3.get(i13);
            long[] jArr3 = this.f4651;
            int i14 = i13 + 1;
            jArr3[i14] = jArr3[i13] + ((interfaceC2808.getType() == 141 || interfaceC2808.getType() == -1) ? 0L : ((long) (interfaceC2808.mo4433() - interfaceC2808.mo4434())) + 2);
            i13 = i14;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4772 c4772 = (C4772) it.next();
            C20195.m45697();
            int i15 = c4772.f10815;
            int i16 = c4772.f10820;
            int i17 = c4772.f10821;
            int i18 = c4772.f10818;
            if (i18 == 72 && i15 >= 0 && i15 < arrayList3.size()) {
                if (((InterfaceC2808) arrayList3.get(i15)).getType() == 93) {
                    m4318(i15, 8);
                } else {
                    int iM4332 = m4331(i15);
                    if (iM4332 >= 0) {
                        m4318(iM4332, 4);
                    }
                    m4322(i15);
                }
            }
            if (i15 >= 0 && i17 >= i15 && i17 < arrayList3.size()) {
                int i19 = this.f4648;
                if (i18 == -3 || i18 == -2) {
                    m4317(i15, i17, true);
                } else if (i18 == i12) {
                    m4322(i15);
                    if (i18 == 1 || !(i16 == 21 || i16 == 22)) {
                        i6 = 1;
                    } else {
                        boolean z3 = c4772.m10072(93, arrayList3) >= 0;
                        if (c4772.f10814 || z3) {
                            i6 = 1;
                            m4319(i15, z3 ? 3 : 1);
                        } else {
                            int[] iArr = this.f4650;
                            i6 = 1;
                            iArr[i15] = iArr[i15] + 1;
                            int iM4329 = m4329(i17);
                            iArr[iM4329] = iArr[iM4329] - 1;
                        }
                    }
                    if (i18 == i6 && i16 == i6) {
                        m4319(i15, i6);
                    }
                } else if (i18 == 2) {
                    m4317(i15, i17, true);
                } else if (i18 == 8) {
                    jArr = this.f4651;
                    if (jArr[i17 + 1] - jArr[i15] <= i19 || m4323(i15, i17)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m4317(i15, i17, z);
                } else if (i18 == 9) {
                    if (i18 != 51) {
                        jArr2 = this.f4651;
                        if (jArr2[i17 + 1] - jArr2[i15] <= i19 / 2 || m4323(i15, i17)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = true;
                    }
                    m4317(i15, i17, z2);
                } else if (i18 == 14) {
                    jArr = this.f4651;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m4317(i15, i17, z);
                } else if (i18 == 24) {
                    m4322(i15);
                    if (i18 == 1) {
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    if (i18 == i6) {
                        m4319(i15, i6);
                    }
                } else if (i18 == 30) {
                    jArr = this.f4651;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m4317(i15, i17, z);
                } else if (i18 == 40 || i18 == 43) {
                    m4320(i15);
                    m4320(m4329(i17));
                    for (int i20 = i15 + 1; i20 <= i17; i20++) {
                        m4319(i20, 3);
                    }
                } else if (i18 == 47) {
                    jArr = this.f4651;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m4317(i15, i17, z);
                } else if (i18 == 57) {
                    iM4331 = m4331(i15);
                    if (m4324(i15) != 2) {
                        if (iM4331 >= 0 || !(((InterfaceC2808) arrayList3.get(iM4331)).getType() == 135 || ((InterfaceC2808) arrayList3.get(iM4331)).getType() == 29 || ((InterfaceC2808) arrayList3.get(iM4331)).getType() == 28)) {
                            i7 = 3;
                        } else {
                            i7 = 1;
                        }
                        m4319(i15, i7);
                    }
                    m4319(m4329(i15), 3);
                    m4319(i17, 3);
                    if (c4772.f10822) {
                        m4321(i17, m4329(i17));
                    }
                } else if (i18 == 66) {
                    jArr = this.f4651;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m4317(i15, i17, z);
                } else if (i18 == 68) {
                    for (i8 = i15; i8 <= i17; i8++) {
                        type = ((InterfaceC2808) arrayList3.get(i8)).getType();
                        if (type != 145 || type == 143) {
                            i10 = 144;
                            i11 = 64;
                        } else {
                            i10 = 144;
                            i11 = 64;
                            if (type == 144) {
                            }
                            if (type != 7 || type == 145 || type == i10) {
                                m4318(i8 + 1, i11);
                            }
                        }
                        m4318(i8, i11);
                        if (type != 7) {
                            m4318(i8 + 1, i11);
                        } else {
                            m4318(i8 + 1, i11);
                        }
                    }
                    for (i9 = 0; i9 < c4772.f10817; i9++) {
                        int iM10071 = c4772.m10071(i9);
                        m4318(iM10071, 64);
                        m4318(iM10071 + 1, 64);
                    }
                } else if (i18 == 17) {
                    m4317(i15, i17, true);
                } else if (i18 == 18) {
                    m4322(i15);
                    if (i18 == 1) {
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    if (i18 == i6) {
                        m4319(i15, i6);
                    }
                } else if (i18 == 50) {
                    jArr = this.f4651;
                    if (jArr[i17 + 1] - jArr[i15] <= i19) {
                        z = true;
                    } else {
                        z = true;
                    }
                    m4317(i15, i17, z);
                } else if (i18 == 51) {
                    if (i18 != 51) {
                        jArr2 = this.f4651;
                        if (jArr2[i17 + 1] - jArr2[i15] <= i19 / 2) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                    } else {
                        z2 = true;
                    }
                    m4317(i15, i17, z2);
                } else if (i18 == 54) {
                    while (i8 <= i17) {
                        type = ((InterfaceC2808) arrayList3.get(i8)).getType();
                        if (type != 145) {
                            i10 = 144;
                            i11 = 64;
                            m4318(i8, i11);
                        } else {
                            i10 = 144;
                            i11 = 64;
                            m4318(i8, i11);
                        }
                        if (type != 7) {
                            m4318(i8 + 1, i11);
                        } else {
                            m4318(i8 + 1, i11);
                        }
                    }
                    while (i9 < c4772.f10817) {
                        int iM10074 = c4772.m10071(i9);
                        m4318(iM10074, 64);
                        m4318(iM10074 + 1, 64);
                    }
                } else if (i18 == 55) {
                    iM4331 = m4331(i15);
                    if (m4324(i15) != 2) {
                        if (iM4331 >= 0) {
                            i7 = 3;
                        } else {
                            i7 = 3;
                        }
                        m4319(i15, i7);
                    }
                    m4319(m4329(i15), 3);
                    m4319(i17, 3);
                    if (c4772.f10822) {
                        m4321(i17, m4329(i17));
                    }
                } else if (i18 == 63) {
                    m4317(i15, i17, true);
                } else if (i18 == 64) {
                    m4322(i15);
                    if (i18 == 1) {
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    if (i18 == i6) {
                        m4319(i15, i6);
                    }
                }
                if (i18 == 41 || i18 == 58) {
                    for (int i21 = 0; i21 < c4772.f10817; i21++) {
                        m4320(c4772.m10071(i21));
                        m4320(m4329(c4772.m10071(i21)));
                    }
                }
                if (i18 == 15 || i18 == 64 || i18 == 18 || i18 == 67) {
                    for (int i22 = 0; i22 < c4772.f10817; i22++) {
                        m4319(c4772.m10071(i22), 3);
                    }
                }
                if (i18 == 34 && c4772.m10072(43, arrayList3) >= 0) {
                    int iM10075 = c4772.m10072(91, arrayList3);
                    int iM10076 = c4772.m10072(92, arrayList3);
                    if (iM10075 >= 0 && iM10076 >= 0) {
                        m4317(iM10075, iM10076, true);
                    }
                }
                if (i18 == 59 || i18 == 60) {
                    long[] jArr4 = this.f4651;
                    if (jArr4[i17 + 1] - jArr4[i15] > i19) {
                        int i23 = -1;
                        for (int i24 = 0; i24 < c4772.f10817; i24++) {
                            int iM10077 = c4772.m10071(i24);
                            if (iM10077 >= 0) {
                                m4322(iM10077);
                                if (i23 < 0) {
                                    i23 = iM10077;
                                }
                            }
                        }
                        if (i23 >= 0) {
                            int[] iArr2 = this.f4650;
                            iArr2[i23] = iArr2[i23] + 1;
                            int iM43210 = m4329(i17);
                            iArr2[iM43210] = iArr2[iM43210] - 1;
                        }
                    }
                }
                if (i18 == 21 && (iM10073 = c4772.m10072(18, arrayList3)) >= 0) {
                    m4319(iM10073, ((InterfaceC2808) arrayList3.get(m4331(iM10073))).getType() == 92 ? 1 : 2);
                }
                if (i18 == 25) {
                    int iM10078 = c4772.m10072(10, arrayList3);
                    int iM10079 = c4772.m10072(21, arrayList3);
                    if (iM10078 >= 0) {
                        m4320(iM10078);
                    }
                    if (iM10079 >= 0) {
                        m4320(iM10079);
                    }
                }
                if (i18 == 20) {
                    m4322(m4329(i17));
                }
                if (i18 == 23) {
                    int iM100710 = c4772.m10072(91, arrayList3);
                    int iM100711 = c4772.m10072(92, arrayList3);
                    if (iM100710 >= 0) {
                        if (iM100711 < 0) {
                            iM100711 = i17;
                        }
                        i4 = 1;
                        m4317(iM100710, iM100711, true);
                    } else {
                        i4 = 1;
                    }
                } else {
                    i4 = 1;
                }
                if (i18 == 24 && (i5 = c4772.f10816) >= 0) {
                    int[] iArr3 = this.f4650;
                    iArr3[i5] = iArr3[i5] + i4;
                    int iM43211 = m4329(i17);
                    iArr3[iM43211] = iArr3[iM43211] - i4;
                }
                if (i18 == 22 && c4772.m10072(17, arrayList3) >= 0 && (iM10072 = c4772.m10072(38, arrayList3)) >= 0) {
                    m4320(iM10072);
                }
                if (i18 == 72 || i18 == 65) {
                    m4322(m4329(i17));
                }
            }
            i12 = 1;
        }
        if (this.f4643 == EnumC19980.TYPESCRIPT) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C4772 c4773 = (C4772) it2.next();
                C20195.m45697();
                if (c4773.f10818 == 58 && c4773.f10820 == 42 && (i2 = c4773.f10815) >= 0 && (i3 = c4773.f10821) >= i2 && i3 < arrayList3.size()) {
                    int iM43212 = m4329(c4773.f10821);
                    if (((InterfaceC2808) arrayList3.get(iM43212)).getType() == 115 && m4321(c4773.f10821, iM43212)) {
                        int i25 = c4773.f10821;
                        byte[] bArr = this.f4649;
                        bArr[i25] = (byte) (bArr[i25] & ((byte) (-5)));
                    }
                }
            }
        }
        int i26 = 0;
        while (true) {
            arrayList = this.f4646;
            int size2 = arrayList.size();
            arrayList2 = this.f4652;
            if (i26 >= size2) {
                break;
            }
            C10856 c10856 = (C10856) arrayList.get(i26);
            int iMax = Math.max(0, Math.max(c10856.f30091.mo4432(), ((Integer) arrayList2.get(i26)).intValue()));
            InterfaceC2808 interfaceC2809 = c10856.f30090;
            int size3 = interfaceC2809 == null ? arrayList3.size() - 1 : interfaceC2809.mo4432();
            for (int i27 = iMax; i27 <= Math.min(arrayList3.size() - 1, size3 + 1); i27++) {
                m4318(i27, 16);
            }
            for (int iMax2 = Math.max(0, iMax - 1); iMax2 <= Math.min(arrayList3.size() - 1, size3); iMax2++) {
                byte[] bArr2 = this.f4649;
                bArr2[iMax2] = (byte) (bArr2[iMax2] & ((byte) (-5)));
            }
            i26++;
        }
        for (int i28 = 0; i28 < arrayList3.size(); i28++) {
            int type2 = ((InterfaceC2808) arrayList3.get(i28)).getType();
            if (type2 == 145 || type2 == 143) {
                i = 64;
            } else {
                i = 64;
                if (type2 == 144) {
                }
                if (type2 != 145 || type2 == 7 || type2 == 144) {
                    m4318(i28 + 1, i);
                }
                if (type2 == 142) {
                    m4318(i28, 16);
                    m4318(i28 + 1, 16);
                }
            }
            m4318(i28, i);
            if (type2 != 145) {
                m4318(i28 + 1, i);
            } else {
                m4318(i28 + 1, i);
            }
            if (type2 == 142) {
                m4318(i28, 16);
                m4318(i28 + 1, 16);
            }
        }
        for (int i29 = 0; i29 < arrayList3.size(); i29++) {
            C20195.m45697();
            if (m4328(i29, 4) || m4328(i29, 8)) {
                int iM43213 = m4329(i29);
                int type3 = ((InterfaceC2808) arrayList3.get(iM43213)).getType();
                boolean z4 = type3 == 92 || type3 == -1;
                for (int i30 = i29; z4 && i30 <= iM43213; i30++) {
                    z4 = !m4328(i30, 16);
                }
                if (!z4) {
                    byte[] bArr3 = this.f4649;
                    bArr3[i29] = (byte) (bArr3[i29] & ((byte) (-9)));
                }
                if (z4) {
                    byte[] bArr4 = this.f4649;
                    bArr4[i29] = (byte) (bArr4[i29] & ((byte) (-5)));
                }
            }
        }
        this.f4651 = null;
        arrayList.clear();
        arrayList2.clear();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    @Override // p067l.InterfaceC14288
    /* JADX INFO: renamed from: ֫ */
    public final void mo4327(AbstractC20244 abstractC20244, Object obj, int i, int i2, String str, C4821 c4821) {
        int iValueOf;
        boolean z = this.f4642;
        ArrayList arrayList = this.f4652;
        ArrayList arrayList2 = this.f4646;
        if (z && (obj instanceof InterfaceC2808)) {
            InterfaceC2808 interfaceC2808 = (InterfaceC2808) obj;
            if (interfaceC2808.mo4432() > this.f4653) {
                this.f4653 = interfaceC2808.mo4432();
                arrayList2.clear();
                arrayList.clear();
            }
        }
        if (arrayList2.size() >= 64) {
            throw new C20866();
        }
        C10856 c10856M26580 = ((AbstractC5461) abstractC20244).m26580();
        C10856 c10856 = c10856M26580;
        while (true) {
            if (c10856M26580 == null) {
                c10856M26580 = c10856;
                break;
            } else {
                if ((c10856M26580 instanceof C4120) || (c10856M26580 instanceof C12564) || (c10856M26580 instanceof C4791)) {
                    break;
                }
                c10856 = c10856M26580;
                c10856M26580 = c10856M26580.f65695;
            }
        }
        if (c10856M26580 != null) {
            arrayList2.add(c10856M26580);
            if (this.f4643 == EnumC19980.JSON && (obj instanceof InterfaceC2808)) {
                InterfaceC2808 interfaceC2809 = (InterfaceC2808) obj;
                if (interfaceC2809.getType() == -1) {
                    iValueOf = Integer.valueOf(interfaceC2809.mo4432());
                } else {
                    iValueOf = -1;
                }
            } else {
                iValueOf = -1;
            }
            arrayList.add(iValueOf);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m4324(int i) {
        return this.f4649[i] & 3;
    }

    /* JADX INFO: renamed from: ܽ */
    private void m4319(int i, int i2) {
        byte[] bArr = this.f4649;
        bArr[i] = (byte) (i2 | (bArr[i] & (-4)));
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m4328(int i, int i2) {
        return (this.f4649[i] & i2) != 0;
    }

    /* JADX INFO: renamed from: ܳ */
    private void m4318(int i, int i2) {
        byte[] bArr = this.f4649;
        bArr[i] = (byte) (((byte) i2) | bArr[i]);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m4326(C19524 c19524) {
        if (c19524 == null) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4644;
            if (i >= arrayList.size()) {
                return;
            }
            InterfaceC2808 interfaceC2808 = (InterfaceC2808) arrayList.get(i);
            if (interfaceC2808.getType() == 44 && c19524.m44360(interfaceC2808.mo4434())) {
                m4321(i, m4329(i));
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private boolean m4321(int i, int i2) {
        boolean z = false;
        for (int i3 = i + 1; i3 < i2; i3++) {
            InterfaceC2808 interfaceC2808 = (InterfaceC2808) this.f4644.get(i3);
            if (C10136.m23617(interfaceC2808.getText())) {
                if (interfaceC2808.getType() == 141) {
                    m4318(i3 + 1, 16);
                } else if (interfaceC2808.getType() == 4) {
                    m4318(i3, 32);
                }
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m4317(int i, int i2, boolean z) {
        int i3;
        ArrayList arrayList = this.f4644;
        int type = ((InterfaceC2808) arrayList.get(i)).getType();
        if (type == 91) {
            i3 = 92;
        } else {
            i3 = type == 89 ? 90 : 88;
        }
        int i4 = 0;
        boolean z2 = ((InterfaceC2808) arrayList.get(i2)).getType() == i3;
        int i5 = 3;
        if (z2 && m4329(i) == i2) {
            if (m4330(i, i2)) {
                InterfaceC2808 interfaceC2808 = (InterfaceC2808) arrayList.get(i2 - 1);
                if (interfaceC2808.getType() == 141 && C10136.m23617(interfaceC2808.getText())) {
                    i5 = 2;
                }
                m4319(i2, i5);
                return;
            }
            if (m4323(i, i2)) {
                do {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } while (((InterfaceC2808) arrayList.get(i)).getType() == 141);
                int[] iArr = this.f4650;
                iArr[i] = iArr[i] + 1;
                iArr[i2] = iArr[i2] - 1;
                m4322(i2);
                return;
            }
            m4319(i2, 3);
            return;
        }
        boolean z3 = type == 91;
        if (z) {
            m4322(m4329(i));
            int[] iArr2 = this.f4650;
            int iM4329 = m4329(i);
            iArr2[iM4329] = iArr2[iM4329] + 1;
            if (z2) {
                m4322(i2);
                int[] iArr3 = this.f4650;
                iArr3[i2] = iArr3[i2] - 1;
            }
        } else {
            m4319(m4329(i), z3 ? 1 : 3);
            if (z2) {
                m4319(i2, z3 ? 1 : 3);
            }
        }
        while (true) {
            i++;
            if (i >= i2) {
                return;
            }
            int type2 = ((InterfaceC2808) arrayList.get(i)).getType();
            if (type2 == 91 || type2 == 89 || type2 == 87) {
                i4++;
            }
            if (type2 == 92 || type2 == 90 || type2 == 88) {
                i4--;
            }
            if (i4 == 0 && (type2 == 94 || type2 == 93)) {
                int iM43210 = m4329(i);
                if (z) {
                    m4322(iM43210);
                } else {
                    m4320(iM43210);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m4329(int i) {
        ArrayList arrayList;
        do {
            i++;
            arrayList = this.f4644;
            if (i >= arrayList.size()) {
                break;
            }
        } while (((InterfaceC2808) arrayList.get(i)).mo4430() != 0);
        return Math.min(i, arrayList.size() - 1);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m4331(int i) {
        do {
            i--;
            if (i < 0) {
                break;
            }
        } while (((InterfaceC2808) this.f4644.get(i)).mo4430() != 0);
        return i;
    }

    /* JADX INFO: renamed from: ᩳ */
    private void m4322(int i) {
        if (i < 0 || i >= this.f4649.length) {
            return;
        }
        m4319(i, 2);
    }

    /* JADX INFO: renamed from: ܿ */
    private void m4320(int i) {
        if (i < 0 || i >= this.f4649.length || m4324(i) == 2) {
            return;
        }
        m4319(i, 1);
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m4330(int i, int i2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            InterfaceC2808 interfaceC2808 = (InterfaceC2808) this.f4644.get(i3);
            int type = interfaceC2808.getType();
            if (type == 4 || type == 3) {
                String text = interfaceC2808.getText();
                if (text.contains("@ts-") || text.contains("#__PURE__") || text.contains("@__PURE__") || text.contains("sourceURL=") || text.contains("sourceMappingURL=") || text.contains("eslint") || text.contains("prettier") || text.contains("istanbul")) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩳ */
    private boolean m4323(int i, int i2) {
        for (int i3 = i + 1; i3 < i2; i3++) {
            int type = ((InterfaceC2808) this.f4644.get(i3)).getType();
            if (type == 3 || type == 4 || type == 2) {
                return true;
            }
        }
        return false;
    }
}
