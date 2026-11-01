package p067l;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.֡ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8M6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2604 {
    /* JADX INFO: renamed from: ֫ */
    public static C20711 m3904(int i, byte[] bArr) {
        ArrayList arrayListM3903;
        C19203 c19203 = new C19203(bArr);
        try {
            c19203.m43724(4);
            int iM43739 = c19203.m43739();
            c19203.m43730(0);
            if (!(iM43739 == 1886547818)) {
                arrayListM3903 = m3903(c19203);
            } else {
                c19203.m43724(8);
                int iM43731 = c19203.m43731();
                int iM43729 = c19203.m43729();
                while (true) {
                    if (iM43731 < iM43729) {
                        int iM437310 = c19203.m43739() + iM43731;
                        if (iM437310 > iM43731 && iM437310 <= iM43729) {
                            int iM437311 = c19203.m43739();
                            if (iM437311 != 2037673328 && iM437311 != 1836279920) {
                                c19203.m43730(iM437310);
                                iM43731 = iM437310;
                            }
                            c19203.m43732(iM437310);
                            arrayListM3903 = m3903(c19203);
                        }
                    }
                    arrayListM3903 = null;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (arrayListM3903 == null) {
            return null;
        }
        int size = arrayListM3903.size();
        if (size == 1) {
            C5958 c5958 = (C5958) arrayListM3903.get(0);
            return new C20711(c5958, c5958, i);
        }
        if (size != 2) {
            return null;
        }
        return new C20711((C5958) arrayListM3903.get(0), (C5958) arrayListM3903.get(1), i);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m3903(C19203 c19203) {
        C19203 c19204;
        int i;
        ArrayList arrayList;
        C5958 c5958;
        C19203 c19205 = c19203;
        if (c19203.m43702() != 0) {
            return null;
        }
        c19205.m43724(7);
        int iM43739 = c19203.m43739();
        if (iM43739 == 1684433976) {
            C19203 c19206 = new C19203();
            Inflater inflater = new Inflater(true);
            try {
                if (!C5792.m13008(c19205, c19206, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                c19205 = c19206;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iM43739 != 1918990112) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int iM43731 = c19205.m43731();
        int iM43729 = c19205.m43729();
        while (iM43731 < iM43729) {
            int iM437310 = c19205.m43739() + iM43731;
            if (iM437310 <= iM43731 || iM437310 > iM43729) {
                return null;
            }
            if (c19205.m43739() == 1835365224) {
                int iM437311 = c19205.m43739();
                if (iM437311 > 10000) {
                    c19204 = c19205;
                    arrayList = arrayList2;
                    i = iM43729;
                    c5958 = null;
                } else {
                    float[] fArr = new float[iM437311];
                    for (int i2 = 0; i2 < iM437311; i2++) {
                        fArr[i2] = Float.intBitsToFloat(c19205.m43739());
                    }
                    int iM437312 = c19205.m43739();
                    if (iM437312 > 32000) {
                        c19204 = c19205;
                        arrayList = arrayList2;
                        i = iM43729;
                    } else {
                        double dLog = Math.log(2.0d);
                        int iCeil = (int) Math.ceil(Math.log(((double) iM437311) * 2.0d) / dLog);
                        byte[] bArrM43728 = c19205.m43728();
                        C17861 c17861 = new C17861(bArrM43728, bArrM43728.length);
                        c17861.m40569(c19205.m43731() * 8);
                        float[] fArr2 = new float[iM437312 * 5];
                        int i3 = 5;
                        int[] iArr = new int[5];
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i4 < iM437312) {
                                i = iM43729;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < i3) {
                                        int i7 = iArr[i6];
                                        int iM40558 = c17861.m40558(iCeil);
                                        int i8 = iCeil;
                                        int i9 = i7 + ((iM40558 >> 1) ^ (-(iM40558 & 1)));
                                        if (i9 < iM437311 && i9 >= 0) {
                                            fArr2[i5] = fArr[i9];
                                            iArr[i6] = i9;
                                            i6++;
                                            i3 = 5;
                                            i5++;
                                            iCeil = i8;
                                        }
                                    } else {
                                        i4++;
                                        i3 = 5;
                                        iM43729 = i;
                                    }
                                }
                            } else {
                                i = iM43729;
                                c17861.m40569((c17861.m40568() + 7) & (-8));
                                int i10 = 32;
                                int iM40559 = c17861.m40558(32);
                                C20040[] c20040Arr = new C20040[iM40559];
                                int i11 = 0;
                                while (true) {
                                    if (i11 < iM40559) {
                                        int iM405510 = c17861.m40558(8);
                                        int iM405511 = c17861.m40558(8);
                                        int iM405512 = c17861.m40558(i10);
                                        if (iM405512 <= 128000) {
                                            c19204 = c19205;
                                            arrayList = arrayList2;
                                            int iCeil2 = (int) Math.ceil(Math.log(((double) iM437312) * 2.0d) / dLog);
                                            float[] fArr3 = new float[iM405512 * 3];
                                            int i12 = iM40559;
                                            float[] fArr4 = new float[iM405512 * 2];
                                            int i13 = 0;
                                            double d = dLog;
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < iM405512) {
                                                    int iM405513 = c17861.m40558(iCeil2);
                                                    int i15 = i13 + ((iM405513 >> 1) ^ (-(iM405513 & 1)));
                                                    if (i15 >= 0 && i15 < iM437312) {
                                                        int i16 = i14 * 3;
                                                        int i17 = i15 * 5;
                                                        fArr3[i16] = fArr2[i17];
                                                        fArr3[i16 + 1] = fArr2[i17 + 1];
                                                        fArr3[i16 + 2] = fArr2[i17 + 2];
                                                        int i18 = i14 * 2;
                                                        fArr4[i18] = fArr2[i17 + 3];
                                                        fArr4[i18 + 1] = fArr2[i17 + 4];
                                                        i14++;
                                                        i13 = i15;
                                                    }
                                                } else {
                                                    c20040Arr[i11] = new C20040(iM405510, iM405511, fArr3, fArr4);
                                                    i11++;
                                                    i10 = 32;
                                                    c19205 = c19204;
                                                    arrayList2 = arrayList;
                                                    iM40559 = i12;
                                                    dLog = d;
                                                }
                                            }
                                        }
                                    } else {
                                        c19204 = c19205;
                                        arrayList = arrayList2;
                                        c5958 = new C5958(c20040Arr);
                                    }
                                }
                            }
                            c19204 = c19205;
                            arrayList = arrayList2;
                        }
                    }
                    c5958 = null;
                }
                if (c5958 == null) {
                    return null;
                }
                arrayList2 = arrayList;
                arrayList2.add(c5958);
            } else {
                c19204 = c19205;
                i = iM43729;
            }
            c19204.m43730(iM437310);
            iM43729 = i;
            iM43731 = iM437310;
            c19205 = c19204;
        }
        return arrayList2;
    }
}
