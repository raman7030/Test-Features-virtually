package p067l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܶ */
/* JADX INFO: compiled from: H1AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0936 extends AbstractC1251 {

    /* JADX INFO: renamed from: ۡ */
    public int f9187;

    /* JADX INFO: renamed from: ܺ */
    public ArrayList f9188;

    public C0936(C1591 c1591, int i) {
        super(c1591);
        ArrayList<AbstractC1251> arrayList = new ArrayList();
        this.f9188 = arrayList;
        this.f28288 = i;
        C1591 c1592 = this.f28286;
        C1591 c1591M37922 = c1592.m37922(i);
        while (c1591M37922 != null) {
            c1592 = c1591M37922;
            c1591M37922 = c1591M37922.m37922(this.f28288);
        }
        this.f28286 = c1592;
        int i2 = this.f28288;
        arrayList.add(i2 == 0 ? c1592.f49276 : i2 == 1 ? c1592.f49260 : null);
        C1591 c1591M37915 = c1592.m37915(this.f28288);
        while (c1591M37915 != null) {
            int i3 = this.f28288;
            arrayList.add(i3 == 0 ? c1591M37915.f49276 : i3 == 1 ? c1591M37915.f49260 : null);
            c1591M37915 = c1591M37915.m37915(this.f28288);
        }
        for (AbstractC1251 abstractC1251 : arrayList) {
            int i4 = this.f28288;
            if (i4 == 0) {
                abstractC1251.f28286.f49257 = this;
            } else if (i4 == 1) {
                abstractC1251.f28286.f49256 = this;
            }
        }
        if (this.f28288 == 0 && ((C1906) this.f28286.f49252).m50915() && arrayList.size() > 1) {
            this.f28286 = ((AbstractC1251) C20013.m45383(arrayList, 1)).f28286;
        }
        this.f9187 = this.f28288 == 0 ? this.f28286.m37896() : this.f28286.m37865();
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f28288 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC1251 abstractC1251 : this.f9188) {
            strConcat = C17588.m40053(C17588.m40053(strConcat, "<") + abstractC1251, "> ");
        }
        return strConcat;
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܳ */
    public final boolean mo8445() {
        ArrayList arrayList = this.f9188;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1251) arrayList.get(i)).mo8445()) {
                return false;
            }
        }
        return true;
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ᩳ */
    public final long mo8447() {
        ArrayList arrayList = this.f9188;
        int size = arrayList.size();
        long jMo8447 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC1251 abstractC1251 = (AbstractC1251) arrayList.get(i);
            jMo8447 = ((long) abstractC1251.f28289.f56460) + abstractC1251.mo8447() + jMo8447 + ((long) abstractC1251.f28292.f56460);
        }
        return jMo8447;
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ܽ */
    public final void mo8446() {
        this.f28285 = null;
        Iterator it = this.f9188.iterator();
        while (it.hasNext()) {
            ((AbstractC1251) it.next()).mo8446();
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01de A[PHI: r2 r18 r22
      0x01de: PHI (r2v60 int) = (r2v56 int), (r2v65 int) binds: [B:120:0x01dc, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r18v5 float) = (r18v4 float), (r18v7 float) binds: [B:120:0x01dc, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]
      0x01de: PHI (r22v1 float) = (r22v0 float), (r22v3 float) binds: [B:120:0x01dc, B:111:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:301:0x00fa A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f2 A[ADDED_TO_REGION] */
    @Override // p067l.AbstractC1251, p067l.InterfaceC1391
    /* JADX INFO: renamed from: ֫ */
    public final void mo8443(InterfaceC1391 interfaceC1391) {
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        float f;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        boolean z;
        ArrayList arrayList2;
        int i8;
        int i9;
        float f3;
        int i10;
        int i11;
        float f4;
        float f5;
        int iMax;
        int i12;
        int i13;
        boolean z2;
        float f6;
        C1706 c1706 = this.f28292;
        if (c1706.f56464) {
            C1706 c1707 = this.f28289;
            if (c1707.f56464) {
                C1591 c1591 = this.f28286.f49252;
                boolean zM50915 = (c1591 == null || !(c1591 instanceof C1906)) ? false : ((C1906) c1591).m50915();
                int i14 = c1707.f56459 - c1706.f56459;
                ArrayList arrayList3 = this.f9188;
                int size = arrayList3.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((AbstractC1251) arrayList3.get(i15)).f28286.m37893() != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                for (int i17 = i16; i17 >= 0; i17--) {
                    if (((AbstractC1251) arrayList3.get(i17)).f28286.m37893() != 8) {
                        i = i17;
                        break;
                    }
                }
                int i18 = 0;
                while (true) {
                    if (i18 >= 2) {
                        arrayList = arrayList3;
                        i3 = i15;
                        f = 0.0f;
                        i4 = 0;
                        i5 = 0;
                        f2 = 0.0f;
                        i6 = 0;
                        break;
                    }
                    i5 = 0;
                    int i19 = 0;
                    i4 = 0;
                    int i20 = 0;
                    f2 = 0.0f;
                    while (i19 < size) {
                        AbstractC1251 abstractC1251 = (AbstractC1251) arrayList3.get(i19);
                        ArrayList arrayList4 = arrayList3;
                        if (abstractC1251.f28286.m37893() == i2) {
                            i12 = i15;
                        } else {
                            i20++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += abstractC1251.f28292.f56460;
                            }
                            C1566 c1566 = abstractC1251.f28284;
                            int i21 = c1566.f56459;
                            i12 = i15;
                            boolean z3 = abstractC1251.f28287 != EnumC1241.MATCH_CONSTRAINT;
                            if (z3) {
                                int i22 = this.f28288;
                                if (i22 == 0 && !abstractC1251.f28286.f49276.f28284.f56464) {
                                    return;
                                }
                                if (i22 == 1 && !abstractC1251.f28286.f49260.f28284.f56464) {
                                    return;
                                }
                            } else {
                                if (abstractC1251.f28290 == 1 && i18 == 0) {
                                    i13 = c1566.f47790;
                                    i4++;
                                } else {
                                    if (c1566.f56464) {
                                        i13 = i21;
                                    }
                                    if (z2) {
                                        i5 += i13;
                                    } else {
                                        i4++;
                                        f6 = abstractC1251.f28286.f49287[this.f28288];
                                        if (f6 >= 0.0f) {
                                            f2 += f6;
                                        }
                                    }
                                    if (i19 >= i16 && i19 < i) {
                                        i5 += -abstractC1251.f28289.f56460;
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                    i4++;
                                    f6 = abstractC1251.f28286.f49287[this.f28288];
                                    if (f6 >= 0.0f) {
                                        f2 += f6;
                                    }
                                } else {
                                    i5 += i13;
                                }
                                if (i19 >= i16) {
                                }
                            }
                            i13 = i21;
                            z2 = z3;
                            if (z2) {
                                i4++;
                                f6 = abstractC1251.f28286.f49287[this.f28288];
                                if (f6 >= 0.0f) {
                                    f2 += f6;
                                }
                            } else {
                                i5 += i13;
                            }
                            if (i19 >= i16) {
                            }
                        }
                        i19++;
                        i2 = 8;
                        arrayList3 = arrayList4;
                        i15 = i12;
                    }
                    arrayList = arrayList3;
                    i3 = i15;
                    if (i5 < i14 || i4 == 0) {
                        i6 = i20;
                        f = 0.0f;
                        break;
                    } else {
                        i18++;
                        i2 = 8;
                        arrayList3 = arrayList;
                        i15 = i3;
                    }
                }
                int i23 = c1706.f56459;
                if (zM50915) {
                    i23 = c1707.f56459;
                }
                if (i5 > i14) {
                    int i24 = (int) (((i5 - i14) / 2.0f) + 0.5f);
                    i23 = zM50915 ? i23 + i24 : i23 - i24;
                }
                if (i4 > 0) {
                    float f7 = i14 - i5;
                    int i25 = (int) ((f7 / i4) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        ArrayList arrayList5 = arrayList;
                        int i28 = i25;
                        AbstractC1251 abstractC1252 = (AbstractC1251) arrayList5.get(i26);
                        int i29 = i5;
                        C1591 c1592 = abstractC1252.f28286;
                        int i30 = i23;
                        C1566 c1567 = abstractC1252.f28284;
                        boolean z4 = zM50915;
                        if (c1592.m37893() == 8 || abstractC1252.f28287 != EnumC1241.MATCH_CONSTRAINT || c1567.f56464) {
                            f4 = f7;
                            f5 = f;
                        } else {
                            int i31 = f2 > f ? (int) (((abstractC1252.f28286.f49287[this.f28288] * f7) / f2) + 0.5f) : i28;
                            if (this.f28288 == 0) {
                                C1591 c1593 = abstractC1252.f28286;
                                f4 = f7;
                                int i32 = c1593.f49233;
                                f5 = f;
                                iMax = Math.max(c1593.f49273, abstractC1252.f28290 == 1 ? Math.min(i31, c1567.f47790) : i31);
                                if (i32 > 0) {
                                    iMax = Math.min(i32, iMax);
                                }
                                if (iMax != i31) {
                                    i31 = iMax;
                                    i27++;
                                }
                            } else {
                                f4 = f7;
                                f5 = f;
                                C1591 c1594 = abstractC1252.f28286;
                                int i33 = c1594.f49248;
                                iMax = Math.max(c1594.f49258, abstractC1252.f28290 == 1 ? Math.min(i31, c1567.f47790) : i31);
                                if (i33 > 0) {
                                    iMax = Math.min(i33, iMax);
                                }
                                if (iMax != i31) {
                                    i31 = iMax;
                                    i27++;
                                }
                            }
                            c1567.mo37000(i31);
                        }
                        i26++;
                        i23 = i30;
                        i5 = i29;
                        f7 = f4;
                        i25 = i28;
                        zM50915 = z4;
                        f = f5;
                        arrayList = arrayList5;
                    }
                    i7 = i23;
                    z = zM50915;
                    int i34 = i5;
                    arrayList2 = arrayList;
                    f3 = 0.5f;
                    if (i27 > 0) {
                        i4 -= i27;
                        int i35 = 0;
                        int i36 = 0;
                        while (i35 < size) {
                            AbstractC1251 abstractC1253 = (AbstractC1251) arrayList2.get(i35);
                            if (abstractC1253.f28286.m37893() == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i36 += abstractC1253.f28292.f56460;
                                }
                                i36 += abstractC1253.f28284.f56459;
                                if (i35 < i16 && i35 < i) {
                                    i36 += -abstractC1253.f28289.f56460;
                                }
                            }
                            i35++;
                            i3 = i11;
                        }
                        i8 = i3;
                        i5 = i36;
                    } else {
                        i8 = i3;
                        i5 = i34;
                    }
                    i9 = 2;
                    if (this.f9187 == 2 && i27 == 0) {
                        this.f9187 = 0;
                    }
                } else {
                    i7 = i23;
                    z = zM50915;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 2;
                    f3 = 0.5f;
                }
                if (i5 > i14) {
                    this.f9187 = i9;
                }
                if (i6 > 0 && i4 == 0 && i8 == i) {
                    this.f9187 = i9;
                }
                int i37 = this.f9187;
                if (i37 == 1) {
                    if (i6 > 1) {
                        i10 = (i14 - i5) / (i6 - 1);
                    } else {
                        i10 = i6 == 1 ? (i14 - i5) / 2 : 0;
                    }
                    if (i4 > 0) {
                        i10 = 0;
                    }
                    int i38 = i7;
                    for (int i39 = 0; i39 < size; i39++) {
                        AbstractC1251 abstractC1254 = (AbstractC1251) arrayList2.get(z ? size - (i39 + 1) : i39);
                        C1591 c1595 = abstractC1254.f28286;
                        C1706 c1708 = abstractC1254.f28289;
                        C1706 c1709 = abstractC1254.f28292;
                        if (c1595.m37893() == 8) {
                            c1709.mo37000(i38);
                            c1708.mo37000(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z ? i38 - i10 : i38 + i10;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                if (z) {
                                    i38 -= c1709.f56460;
                                } else {
                                    i38 += c1709.f56460;
                                }
                            }
                            if (z) {
                                c1708.mo37000(i38);
                            } else {
                                c1709.mo37000(i38);
                            }
                            C1566 c1568 = abstractC1254.f28284;
                            int i40 = c1568.f56459;
                            if (abstractC1254.f28287 == EnumC1241.MATCH_CONSTRAINT && abstractC1254.f28290 == 1) {
                                i40 = c1568.f47790;
                            }
                            i38 = z ? i38 - i40 : i38 + i40;
                            if (z) {
                                c1709.mo37000(i38);
                            } else {
                                c1708.mo37000(i38);
                            }
                            abstractC1254.f28293 = true;
                            if (i39 < i16 && i39 < i) {
                                if (z) {
                                    i38 -= -c1708.f56460;
                                } else {
                                    i38 += -c1708.f56460;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i37 == 0) {
                    int i41 = (i14 - i5) / (i6 + 1);
                    if (i4 > 0) {
                        i41 = 0;
                    }
                    int i42 = i7;
                    for (int i43 = 0; i43 < size; i43++) {
                        AbstractC1251 abstractC1255 = (AbstractC1251) arrayList2.get(z ? size - (i43 + 1) : i43);
                        C1591 c1596 = abstractC1255.f28286;
                        C1706 c17010 = abstractC1255.f28289;
                        C1706 c17011 = abstractC1255.f28292;
                        if (c1596.m37893() == 8) {
                            c17011.mo37000(i42);
                            c17010.mo37000(i42);
                        } else {
                            int i44 = z ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i8) {
                                if (z) {
                                    i44 -= c17011.f56460;
                                } else {
                                    i44 += c17011.f56460;
                                }
                            }
                            if (z) {
                                c17010.mo37000(i44);
                            } else {
                                c17011.mo37000(i44);
                            }
                            C1566 c1569 = abstractC1255.f28284;
                            int iMin = c1569.f56459;
                            if (abstractC1255.f28287 == EnumC1241.MATCH_CONSTRAINT && abstractC1255.f28290 == 1) {
                                iMin = Math.min(iMin, c1569.f47790);
                            }
                            i42 = z ? i44 - iMin : i44 + iMin;
                            if (z) {
                                c17011.mo37000(i42);
                            } else {
                                c17010.mo37000(i42);
                            }
                            if (i43 < i16 && i43 < i) {
                                if (z) {
                                    i42 -= -c17010.f56460;
                                } else {
                                    i42 += -c17010.f56460;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float fM37930 = this.f28288 == 0 ? this.f28286.m37930() : this.f28286.m37888();
                    if (z) {
                        fM37930 = 1.0f - fM37930;
                    }
                    int i45 = (int) (((i14 - i5) * fM37930) + f3);
                    if (i45 < 0 || i4 > 0) {
                        i45 = 0;
                    }
                    int i46 = z ? i7 - i45 : i7 + i45;
                    for (int i47 = 0; i47 < size; i47++) {
                        AbstractC1251 abstractC1256 = (AbstractC1251) arrayList2.get(z ? size - (i47 + 1) : i47);
                        C1591 c1597 = abstractC1256.f28286;
                        C1706 c17012 = abstractC1256.f28289;
                        C1706 c17013 = abstractC1256.f28292;
                        if (c1597.m37893() == 8) {
                            c17013.mo37000(i46);
                            c17012.mo37000(i46);
                        } else {
                            if (i47 > 0 && i47 >= i8) {
                                if (z) {
                                    i46 -= c17013.f56460;
                                } else {
                                    i46 += c17013.f56460;
                                }
                            }
                            if (z) {
                                c17012.mo37000(i46);
                            } else {
                                c17013.mo37000(i46);
                            }
                            C1566 c15610 = abstractC1256.f28284;
                            int i48 = c15610.f56459;
                            if (abstractC1256.f28287 == EnumC1241.MATCH_CONSTRAINT && abstractC1256.f28290 == 1) {
                                i48 = c15610.f47790;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                c17013.mo37000(i46);
                            } else {
                                c17012.mo37000(i46);
                            }
                            if (i47 < i16 && i47 < i) {
                                if (z) {
                                    i46 -= -c17012.f56460;
                                } else {
                                    i46 += -c17012.f56460;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ۧ */
    public final void mo8444() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9188;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC1251) arrayList.get(i)).mo8444();
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    private C1591 m8441() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9188;
            if (i >= arrayList.size()) {
                return null;
            }
            AbstractC1251 abstractC1251 = (AbstractC1251) arrayList.get(i);
            if (abstractC1251.f28286.m37893() != 8) {
                return abstractC1251.f28286;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۜ */
    private C1591 m8440() {
        AbstractC1251 abstractC1251;
        ArrayList arrayList = this.f9188;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            abstractC1251 = (AbstractC1251) arrayList.get(size);
        } while (abstractC1251.f28286.m37893() == 8);
        return abstractC1251.f28286;
    }

    @Override // p067l.AbstractC1251
    /* JADX INFO: renamed from: ֫ */
    public final void mo8442() {
        ArrayList arrayList = this.f9188;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1251) it.next()).mo8442();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C1591 c1591 = ((AbstractC1251) arrayList.get(0)).f28286;
        C1591 c1592 = ((AbstractC1251) arrayList.get(size - 1)).f28286;
        int i = this.f28288;
        C1706 c1706 = this.f28289;
        C1706 c1707 = this.f28292;
        if (i == 0) {
            C1101 c1101 = c1591.f49261;
            C1101 c1102 = c1592.f49279;
            C1706 c1706M23797 = AbstractC1251.m23797(c1101, 0);
            int iM16917 = c1101.m16917();
            C1591 c1591M8441 = m8441();
            if (c1591M8441 != null) {
                iM16917 = c1591M8441.f49261.m16917();
            }
            if (c1706M23797 != null) {
                AbstractC1251.m23798(c1707, c1706M23797, iM16917);
            }
            C1706 c1706M23798 = AbstractC1251.m23797(c1102, 0);
            int iM16918 = c1102.m16917();
            C1591 c1591M8440 = m8440();
            if (c1591M8440 != null) {
                iM16918 = c1591M8440.f49279.m16917();
            }
            if (c1706M23798 != null) {
                AbstractC1251.m23798(c1706, c1706M23798, -iM16918);
            }
        } else {
            C1101 c1103 = c1591.f49281;
            C1101 c1104 = c1592.f49253;
            C1706 c1706M23799 = AbstractC1251.m23797(c1103, 1);
            int iM16919 = c1103.m16917();
            C1591 c1591M8442 = m8441();
            if (c1591M8442 != null) {
                iM16919 = c1591M8442.f49281.m16917();
            }
            if (c1706M23799 != null) {
                AbstractC1251.m23798(c1707, c1706M23799, iM16919);
            }
            C1706 c1706M237910 = AbstractC1251.m23797(c1104, 1);
            int iM169110 = c1104.m16917();
            C1591 c1591M8443 = m8440();
            if (c1591M8443 != null) {
                iM169110 = c1591M8443.f49253.m16917();
            }
            if (c1706M237910 != null) {
                AbstractC1251.m23798(c1706, c1706M237910, -iM169110);
            }
        }
        c1707.f56455 = this;
        c1706.f56455 = this;
    }
}
