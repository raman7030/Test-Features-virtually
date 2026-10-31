package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: H1AQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1895 extends AbstractC8245 {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f6406;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f6407;

    public C1895(C15094 c15094, int i) {
        super(c15094);
        ArrayList<AbstractC8245> arrayList = new ArrayList();
        this.f6407 = arrayList;
        this.f25378 = i;
        C15094 c15095 = this.f25376;
        C15094 c15094M35764 = c15095.m35764(i);
        while (c15094M35764 != null) {
            c15095 = c15094M35764;
            c15094M35764 = c15094M35764.m35764(this.f25378);
        }
        this.f25376 = c15095;
        int i2 = this.f25378;
        arrayList.add(i2 == 0 ? c15095.f46156 : i2 == 1 ? c15095.f46140 : null);
        C15094 c15094M35757 = c15095.m35757(this.f25378);
        while (c15094M35757 != null) {
            int i3 = this.f25378;
            arrayList.add(i3 == 0 ? c15094M35757.f46156 : i3 == 1 ? c15094M35757.f46140 : null);
            c15094M35757 = c15094M35757.m35757(this.f25378);
        }
        for (AbstractC8245 abstractC8245 : arrayList) {
            int i4 = this.f25378;
            if (i4 == 0) {
                abstractC8245.f25376.f46137 = this;
            } else if (i4 == 1) {
                abstractC8245.f25376.f46136 = this;
            }
        }
        if (this.f25378 == 0 && ((C21446) this.f25376.f46132).m48578() && arrayList.size() > 1) {
            this.f25376 = ((AbstractC8245) C18566.m43105(arrayList, 1)).f25376;
        }
        this.f6406 = this.f25378 == 0 ? this.f25376.m35738() : this.f25376.m35707();
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f25378 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC8245 abstractC8245 : this.f6407) {
            strConcat = C16014.m37867(C16014.m37867(strConcat, "<") + abstractC8245, "> ");
        }
        return strConcat;
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean mo6243() {
        ArrayList arrayList = this.f6407;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC8245) arrayList.get(i)).mo6243()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long mo6245() {
        ArrayList arrayList = this.f6407;
        int size = arrayList.size();
        long jMo6245 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC8245 abstractC8245 = (AbstractC8245) arrayList.get(i);
            jMo6245 = ((long) abstractC8245.f25379.f53272) + abstractC8245.mo6245() + jMo6245 + ((long) abstractC8245.f25382.f53272);
        }
        return jMo6245;
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void mo6244() {
        this.f25375 = null;
        Iterator it = this.f6407.iterator();
        while (it.hasNext()) {
            ((AbstractC8245) it.next()).mo6244();
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
    @Override // l.AbstractC8245, l.InterfaceC11068
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6241(InterfaceC11068 interfaceC11068) {
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
        C17417 c17417 = this.f25382;
        if (c17417.f53276) {
            C17417 c17418 = this.f25379;
            if (c17418.f53276) {
                C15094 c15094 = this.f25376.f46132;
                boolean zM48578 = (c15094 == null || !(c15094 instanceof C21446)) ? false : ((C21446) c15094).m48578();
                int i14 = c17418.f53271 - c17417.f53271;
                ArrayList arrayList3 = this.f6407;
                int size = arrayList3.size();
                int i15 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i15 >= size) {
                        i15 = -1;
                        break;
                    } else if (((AbstractC8245) arrayList3.get(i15)).f25376.m35735() != 8) {
                        break;
                    } else {
                        i15++;
                    }
                }
                int i16 = size - 1;
                for (int i17 = i16; i17 >= 0; i17--) {
                    if (((AbstractC8245) arrayList3.get(i17)).f25376.m35735() != 8) {
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
                        AbstractC8245 abstractC8245 = (AbstractC8245) arrayList3.get(i19);
                        ArrayList arrayList4 = arrayList3;
                        if (abstractC8245.f25376.m35735() == i2) {
                            i12 = i15;
                        } else {
                            i20++;
                            if (i19 > 0 && i19 >= i15) {
                                i5 += abstractC8245.f25382.f53272;
                            }
                            C14594 c14594 = abstractC8245.f25374;
                            int i21 = c14594.f53271;
                            i12 = i15;
                            boolean z3 = abstractC8245.f25377 != EnumC8040.MATCH_CONSTRAINT;
                            if (z3) {
                                int i22 = this.f25378;
                                if (i22 == 0 && !abstractC8245.f25376.f46156.f25374.f53276) {
                                    return;
                                }
                                if (i22 == 1 && !abstractC8245.f25376.f46140.f25374.f53276) {
                                    return;
                                }
                            } else {
                                if (abstractC8245.f25380 == 1 && i18 == 0) {
                                    i13 = c14594.f44683;
                                    i4++;
                                } else {
                                    if (c14594.f53276) {
                                        i13 = i21;
                                    }
                                    if (z2) {
                                        i5 += i13;
                                    } else {
                                        i4++;
                                        f6 = abstractC8245.f25376.f46167[this.f25378];
                                        if (f6 >= 0.0f) {
                                            f2 += f6;
                                        }
                                    }
                                    if (i19 >= i16 && i19 < i) {
                                        i5 += -abstractC8245.f25379.f53272;
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                    i4++;
                                    f6 = abstractC8245.f25376.f46167[this.f25378];
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
                                f6 = abstractC8245.f25376.f46167[this.f25378];
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
                int i23 = c17417.f53271;
                if (zM48578) {
                    i23 = c17418.f53271;
                }
                if (i5 > i14) {
                    int i24 = (int) (((i5 - i14) / 2.0f) + 0.5f);
                    i23 = zM48578 ? i23 + i24 : i23 - i24;
                }
                if (i4 > 0) {
                    float f7 = i14 - i5;
                    int i25 = (int) ((f7 / i4) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        ArrayList arrayList5 = arrayList;
                        int i28 = i25;
                        AbstractC8245 abstractC8246 = (AbstractC8245) arrayList5.get(i26);
                        int i29 = i5;
                        C15094 c15095 = abstractC8246.f25376;
                        int i30 = i23;
                        C14594 c14595 = abstractC8246.f25374;
                        boolean z4 = zM48578;
                        if (c15095.m35735() == 8 || abstractC8246.f25377 != EnumC8040.MATCH_CONSTRAINT || c14595.f53276) {
                            f4 = f7;
                            f5 = f;
                        } else {
                            int i31 = f2 > f ? (int) (((abstractC8246.f25376.f46167[this.f25378] * f7) / f2) + 0.5f) : i28;
                            if (this.f25378 == 0) {
                                C15094 c15096 = abstractC8246.f25376;
                                f4 = f7;
                                int i32 = c15096.f46113;
                                f5 = f;
                                iMax = Math.max(c15096.f46153, abstractC8246.f25380 == 1 ? Math.min(i31, c14595.f44683) : i31);
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
                                C15094 c15097 = abstractC8246.f25376;
                                int i33 = c15097.f46128;
                                iMax = Math.max(c15097.f46138, abstractC8246.f25380 == 1 ? Math.min(i31, c14595.f44683) : i31);
                                if (i33 > 0) {
                                    iMax = Math.min(i33, iMax);
                                }
                                if (iMax != i31) {
                                    i31 = iMax;
                                    i27++;
                                }
                            }
                            c14595.mo34849(i31);
                        }
                        i26++;
                        i23 = i30;
                        i5 = i29;
                        f7 = f4;
                        i25 = i28;
                        zM48578 = z4;
                        f = f5;
                        arrayList = arrayList5;
                    }
                    i7 = i23;
                    z = zM48578;
                    int i34 = i5;
                    arrayList2 = arrayList;
                    f3 = 0.5f;
                    if (i27 > 0) {
                        i4 -= i27;
                        int i35 = 0;
                        int i36 = 0;
                        while (i35 < size) {
                            AbstractC8245 abstractC8247 = (AbstractC8245) arrayList2.get(i35);
                            if (abstractC8247.f25376.m35735() == 8) {
                                i11 = i3;
                            } else {
                                i11 = i3;
                                if (i35 > 0 && i35 >= i11) {
                                    i36 += abstractC8247.f25382.f53272;
                                }
                                i36 += abstractC8247.f25374.f53271;
                                if (i35 < i16 && i35 < i) {
                                    i36 += -abstractC8247.f25379.f53272;
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
                    if (this.f6406 == 2 && i27 == 0) {
                        this.f6406 = 0;
                    }
                } else {
                    i7 = i23;
                    z = zM48578;
                    arrayList2 = arrayList;
                    i8 = i3;
                    i9 = 2;
                    f3 = 0.5f;
                }
                if (i5 > i14) {
                    this.f6406 = i9;
                }
                if (i6 > 0 && i4 == 0 && i8 == i) {
                    this.f6406 = i9;
                }
                int i37 = this.f6406;
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
                        AbstractC8245 abstractC8248 = (AbstractC8245) arrayList2.get(z ? size - (i39 + 1) : i39);
                        C15094 c15098 = abstractC8248.f25376;
                        C17417 c17419 = abstractC8248.f25379;
                        C17417 c174110 = abstractC8248.f25382;
                        if (c15098.m35735() == 8) {
                            c174110.mo34849(i38);
                            c17419.mo34849(i38);
                        } else {
                            if (i39 > 0) {
                                i38 = z ? i38 - i10 : i38 + i10;
                            }
                            if (i39 > 0 && i39 >= i8) {
                                if (z) {
                                    i38 -= c174110.f53272;
                                } else {
                                    i38 += c174110.f53272;
                                }
                            }
                            if (z) {
                                c17419.mo34849(i38);
                            } else {
                                c174110.mo34849(i38);
                            }
                            C14594 c14596 = abstractC8248.f25374;
                            int i40 = c14596.f53271;
                            if (abstractC8248.f25377 == EnumC8040.MATCH_CONSTRAINT && abstractC8248.f25380 == 1) {
                                i40 = c14596.f44683;
                            }
                            i38 = z ? i38 - i40 : i38 + i40;
                            if (z) {
                                c174110.mo34849(i38);
                            } else {
                                c17419.mo34849(i38);
                            }
                            abstractC8248.f25383 = true;
                            if (i39 < i16 && i39 < i) {
                                if (z) {
                                    i38 -= -c17419.f53272;
                                } else {
                                    i38 += -c17419.f53272;
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
                        AbstractC8245 abstractC8249 = (AbstractC8245) arrayList2.get(z ? size - (i43 + 1) : i43);
                        C15094 c15099 = abstractC8249.f25376;
                        C17417 c174111 = abstractC8249.f25379;
                        C17417 c174112 = abstractC8249.f25382;
                        if (c15099.m35735() == 8) {
                            c174112.mo34849(i42);
                            c174111.mo34849(i42);
                        } else {
                            int i44 = z ? i42 - i41 : i42 + i41;
                            if (i43 > 0 && i43 >= i8) {
                                if (z) {
                                    i44 -= c174112.f53272;
                                } else {
                                    i44 += c174112.f53272;
                                }
                            }
                            if (z) {
                                c174111.mo34849(i44);
                            } else {
                                c174112.mo34849(i44);
                            }
                            C14594 c14597 = abstractC8249.f25374;
                            int iMin = c14597.f53271;
                            if (abstractC8249.f25377 == EnumC8040.MATCH_CONSTRAINT && abstractC8249.f25380 == 1) {
                                iMin = Math.min(iMin, c14597.f44683);
                            }
                            i42 = z ? i44 - iMin : i44 + iMin;
                            if (z) {
                                c174112.mo34849(i42);
                            } else {
                                c174111.mo34849(i42);
                            }
                            if (i43 < i16 && i43 < i) {
                                if (z) {
                                    i42 -= -c174111.f53272;
                                } else {
                                    i42 += -c174111.f53272;
                                }
                            }
                        }
                    }
                    return;
                }
                if (i37 == 2) {
                    float fM35772 = this.f25378 == 0 ? this.f25376.m35772() : this.f25376.m35730();
                    if (z) {
                        fM35772 = 1.0f - fM35772;
                    }
                    int i45 = (int) (((i14 - i5) * fM35772) + f3);
                    if (i45 < 0 || i4 > 0) {
                        i45 = 0;
                    }
                    int i46 = z ? i7 - i45 : i7 + i45;
                    for (int i47 = 0; i47 < size; i47++) {
                        AbstractC8245 abstractC82410 = (AbstractC8245) arrayList2.get(z ? size - (i47 + 1) : i47);
                        C15094 c150910 = abstractC82410.f25376;
                        C17417 c174113 = abstractC82410.f25379;
                        C17417 c174114 = abstractC82410.f25382;
                        if (c150910.m35735() == 8) {
                            c174114.mo34849(i46);
                            c174113.mo34849(i46);
                        } else {
                            if (i47 > 0 && i47 >= i8) {
                                if (z) {
                                    i46 -= c174114.f53272;
                                } else {
                                    i46 += c174114.f53272;
                                }
                            }
                            if (z) {
                                c174113.mo34849(i46);
                            } else {
                                c174114.mo34849(i46);
                            }
                            C14594 c14598 = abstractC82410.f25374;
                            int i48 = c14598.f53271;
                            if (abstractC82410.f25377 == EnumC8040.MATCH_CONSTRAINT && abstractC82410.f25380 == 1) {
                                i48 = c14598.f44683;
                            }
                            i46 = z ? i46 - i48 : i46 + i48;
                            if (z) {
                                c174114.mo34849(i46);
                            } else {
                                c174113.mo34849(i46);
                            }
                            if (i47 < i16 && i47 < i) {
                                if (z) {
                                    i46 -= -c174113.f53272;
                                } else {
                                    i46 += -c174113.f53272;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo6242() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6407;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC8245) arrayList.get(i)).mo6242();
            i++;
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private C15094 m6239() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6407;
            if (i >= arrayList.size()) {
                return null;
            }
            AbstractC8245 abstractC8245 = (AbstractC8245) arrayList.get(i);
            if (abstractC8245.f25376.m35735() != 8) {
                return abstractC8245.f25376;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private C15094 m6238() {
        AbstractC8245 abstractC8245;
        ArrayList arrayList = this.f6407;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            abstractC8245 = (AbstractC8245) arrayList.get(size);
        } while (abstractC8245.f25376.m35735() == 8);
        return abstractC8245.f25376;
    }

    @Override // l.AbstractC8245
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6240() {
        ArrayList arrayList = this.f6407;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC8245) it.next()).mo6240();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C15094 c15094 = ((AbstractC8245) arrayList.get(0)).f25376;
        C15094 c15095 = ((AbstractC8245) arrayList.get(size - 1)).f25376;
        int i = this.f25378;
        C17417 c17417 = this.f25379;
        C17417 c17418 = this.f25382;
        if (i == 0) {
            C5218 c5218 = c15094.f46141;
            C5218 c5219 = c15095.f46159;
            C17417 c17417M21827 = AbstractC8245.m21827(c5218, 0);
            int iM15007 = c5218.m15007();
            C15094 c15094M6239 = m6239();
            if (c15094M6239 != null) {
                iM15007 = c15094M6239.f46141.m15007();
            }
            if (c17417M21827 != null) {
                AbstractC8245.m21828(c17418, c17417M21827, iM15007);
            }
            C17417 c17417M21828 = AbstractC8245.m21827(c5219, 0);
            int iM15008 = c5219.m15007();
            C15094 c15094M6238 = m6238();
            if (c15094M6238 != null) {
                iM15008 = c15094M6238.f46159.m15007();
            }
            if (c17417M21828 != null) {
                AbstractC8245.m21828(c17417, c17417M21828, -iM15008);
            }
        } else {
            C5218 c52110 = c15094.f46161;
            C5218 c52111 = c15095.f46133;
            C17417 c17417M21829 = AbstractC8245.m21827(c52110, 1);
            int iM15009 = c52110.m15007();
            C15094 c15094M62310 = m6239();
            if (c15094M62310 != null) {
                iM15009 = c15094M62310.f46161.m15007();
            }
            if (c17417M21829 != null) {
                AbstractC8245.m21828(c17418, c17417M21829, iM15009);
            }
            C17417 c17417M218210 = AbstractC8245.m21827(c52111, 1);
            int iM150010 = c52111.m15007();
            C15094 c15094M62311 = m6238();
            if (c15094M62311 != null) {
                iM150010 = c15094M62311.f46133.m15007();
            }
            if (c17417M218210 != null) {
                AbstractC8245.m21828(c17417, c17417M218210, -iM150010);
            }
        }
        c17418.f53267 = this;
        c17417.f53267 = this;
    }
}
