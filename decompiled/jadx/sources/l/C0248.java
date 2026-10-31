package l;

import java.util.ArrayList;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: l.֡ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: J8M6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0248 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19300 m1506(int i, byte[] bArr) {
        ArrayList arrayListM1505;
        C17714 c17714 = new C17714(bArr);
        try {
            c17714.m41478(4);
            int iM41493 = c17714.m41493();
            c17714.m41484(0);
            if (!(iM41493 == 1886547818)) {
                arrayListM1505 = m1505(c17714);
            } else {
                c17714.m41478(8);
                int iM41485 = c17714.m41485();
                int iM41483 = c17714.m41483();
                while (true) {
                    if (iM41485 < iM41483) {
                        int iM41494 = c17714.m41493() + iM41485;
                        if (iM41494 > iM41485 && iM41494 <= iM41483) {
                            int iM41495 = c17714.m41493();
                            if (iM41495 != 2037673328 && iM41495 != 1836279920) {
                                c17714.m41484(iM41494);
                                iM41485 = iM41494;
                            }
                            c17714.m41486(iM41494);
                            arrayListM1505 = m1505(c17714);
                        }
                    }
                    arrayListM1505 = null;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (arrayListM1505 == null) {
            return null;
        }
        int size = arrayListM1505.size();
        if (size == 1) {
            C3777 c3777 = (C3777) arrayListM1505.get(0);
            return new C19300(c3777, c3777, i);
        }
        if (size != 2) {
            return null;
        }
        return new C19300((C3777) arrayListM1505.get(0), (C3777) arrayListM1505.get(1), i);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m1505(C17714 c17714) {
        C17714 c17715;
        int i;
        ArrayList arrayList;
        C3777 c3777;
        C17714 c17716 = c17714;
        if (c17714.m41456() != 0) {
            return null;
        }
        c17716.m41478(7);
        int iM41493 = c17714.m41493();
        if (iM41493 == 1684433976) {
            C17714 c17717 = new C17714();
            Inflater inflater = new Inflater(true);
            try {
                if (!C3603.m11032(c17716, c17717, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                c17716 = c17717;
            } catch (Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iM41493 != 1918990112) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        int iM41485 = c17716.m41485();
        int iM41483 = c17716.m41483();
        while (iM41485 < iM41483) {
            int iM41494 = c17716.m41493() + iM41485;
            if (iM41494 <= iM41485 || iM41494 > iM41483) {
                return null;
            }
            if (c17716.m41493() == 1835365224) {
                int iM41495 = c17716.m41493();
                if (iM41495 > 10000) {
                    c17715 = c17716;
                    arrayList = arrayList2;
                    i = iM41483;
                    c3777 = null;
                } else {
                    float[] fArr = new float[iM41495];
                    for (int i2 = 0; i2 < iM41495; i2++) {
                        fArr[i2] = Float.intBitsToFloat(c17716.m41493());
                    }
                    int iM41496 = c17716.m41493();
                    if (iM41496 > 32000) {
                        c17715 = c17716;
                        arrayList = arrayList2;
                        i = iM41483;
                    } else {
                        double dLog = Math.log(2.0d);
                        int iCeil = (int) Math.ceil(Math.log(((double) iM41495) * 2.0d) / dLog);
                        byte[] bArrM41482 = c17716.m41482();
                        C16302 c16302 = new C16302(bArrM41482, bArrM41482.length);
                        c16302.m38354(c17716.m41485() * 8);
                        float[] fArr2 = new float[iM41496 * 5];
                        int i3 = 5;
                        int[] iArr = new int[5];
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            if (i4 < iM41496) {
                                i = iM41483;
                                int i6 = 0;
                                while (true) {
                                    if (i6 < i3) {
                                        int i7 = iArr[i6];
                                        int iM38343 = c16302.m38343(iCeil);
                                        int i8 = iCeil;
                                        int i9 = i7 + ((iM38343 >> 1) ^ (-(iM38343 & 1)));
                                        if (i9 < iM41495 && i9 >= 0) {
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
                                        iM41483 = i;
                                    }
                                }
                            } else {
                                i = iM41483;
                                c16302.m38354((c16302.m38353() + 7) & (-8));
                                int i10 = 32;
                                int iM38344 = c16302.m38343(32);
                                C18594[] c18594Arr = new C18594[iM38344];
                                int i11 = 0;
                                while (true) {
                                    if (i11 < iM38344) {
                                        int iM38345 = c16302.m38343(8);
                                        int iM38346 = c16302.m38343(8);
                                        int iM38347 = c16302.m38343(i10);
                                        if (iM38347 <= 128000) {
                                            c17715 = c17716;
                                            arrayList = arrayList2;
                                            int iCeil2 = (int) Math.ceil(Math.log(((double) iM41496) * 2.0d) / dLog);
                                            float[] fArr3 = new float[iM38347 * 3];
                                            int i12 = iM38344;
                                            float[] fArr4 = new float[iM38347 * 2];
                                            int i13 = 0;
                                            double d = dLog;
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < iM38347) {
                                                    int iM38348 = c16302.m38343(iCeil2);
                                                    int i15 = i13 + ((iM38348 >> 1) ^ (-(iM38348 & 1)));
                                                    if (i15 >= 0 && i15 < iM41496) {
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
                                                    c18594Arr[i11] = new C18594(iM38345, iM38346, fArr3, fArr4);
                                                    i11++;
                                                    i10 = 32;
                                                    c17716 = c17715;
                                                    arrayList2 = arrayList;
                                                    iM38344 = i12;
                                                    dLog = d;
                                                }
                                            }
                                        }
                                    } else {
                                        c17715 = c17716;
                                        arrayList = arrayList2;
                                        c3777 = new C3777(c18594Arr);
                                    }
                                }
                            }
                            c17715 = c17716;
                            arrayList = arrayList2;
                        }
                    }
                    c3777 = null;
                }
                if (c3777 == null) {
                    return null;
                }
                arrayList2 = arrayList;
                arrayList2.add(c3777);
            } else {
                c17715 = c17716;
                i = iM41483;
            }
            c17715.m41484(iM41494);
            iM41483 = i;
            iM41485 = iM41494;
            c17716 = c17715;
        }
        return arrayList2;
    }
}
