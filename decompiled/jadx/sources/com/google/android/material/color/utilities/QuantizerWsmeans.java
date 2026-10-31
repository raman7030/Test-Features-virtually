package com.google.android.material.color.utilities;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class QuantizerWsmeans {
    public static final int MAX_ITERATIONS = 10;
    public static final double MIN_MOVEMENT_DISTANCE = 3.0d;

    public final class Distance implements Comparable {
        public int index = -1;
        public double distance = -1.0d;

        @Override // java.lang.Comparable
        public int compareTo(Distance distance) {
            return Double.valueOf(this.distance).compareTo(Double.valueOf(distance.distance));
        }
    }

    public static Map quantize(int[] iArr, int[] iArr2, int i) {
        Random random = new Random(272008L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        double[][] dArr = new double[iArr.length][];
        int[] iArr3 = new int[iArr.length];
        PointProviderLab pointProviderLab = new PointProviderLab();
        int i2 = 0;
        for (int i3 : iArr) {
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i3));
            if (num == null) {
                dArr[i2] = pointProviderLab.fromInt(i3);
                iArr3[i2] = i3;
                i2++;
                linkedHashMap.put(Integer.valueOf(i3), 1);
            } else {
                linkedHashMap.put(Integer.valueOf(i3), Integer.valueOf(num.intValue() + 1));
            }
        }
        int[] iArr4 = new int[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            iArr4[i4] = ((Integer) linkedHashMap.get(Integer.valueOf(iArr3[i4]))).intValue();
        }
        int iMin = Math.min(i, i2);
        if (iArr2.length != 0) {
            iMin = Math.min(iMin, iArr2.length);
        }
        double[][] dArr2 = new double[iMin][];
        int i5 = 0;
        for (int i6 = 0; i6 < iArr2.length; i6++) {
            dArr2[i6] = pointProviderLab.fromInt(iArr2[i6]);
            i5++;
        }
        int i7 = iMin - i5;
        if (i7 > 0) {
            for (int i8 = 0; i8 < i7; i8++) {
            }
        }
        int[] iArr5 = new int[i2];
        for (int i9 = 0; i9 < i2; i9++) {
            iArr5[i9] = random.nextInt(iMin);
        }
        int[][] iArr6 = new int[iMin][];
        for (int i10 = 0; i10 < iMin; i10++) {
            iArr6[i10] = new int[iMin];
        }
        Distance[][] distanceArr = new Distance[iMin][];
        for (int i11 = 0; i11 < iMin; i11++) {
            distanceArr[i11] = new Distance[iMin];
            for (int i12 = 0; i12 < iMin; i12++) {
                distanceArr[i11][i12] = new Distance();
            }
        }
        int[] iArr7 = new int[iMin];
        int i13 = 0;
        while (i13 < 10) {
            int i14 = 0;
            while (i14 < iMin) {
                int i15 = i14 + 1;
                int i16 = i15;
                while (i16 < iMin) {
                    double dDistance = pointProviderLab.distance(dArr2[i14], dArr2[i16]);
                    int i17 = i15;
                    Distance distance = distanceArr[i16][i14];
                    distance.distance = dDistance;
                    distance.index = i14;
                    Distance distance2 = distanceArr[i14][i16];
                    distance2.distance = dDistance;
                    distance2.index = i16;
                    i16++;
                    i15 = i17;
                }
                int i18 = i15;
                Arrays.sort(distanceArr[i14]);
                for (int i19 = 0; i19 < iMin; i19++) {
                    iArr6[i14][i19] = distanceArr[i14][i19].index;
                }
                i14 = i18;
            }
            int i20 = 0;
            int i21 = 0;
            while (i20 < i2) {
                double[] dArr3 = dArr[i20];
                int i22 = iArr5[i20];
                double dDistance2 = pointProviderLab.distance(dArr3, dArr2[i22]);
                int i23 = -1;
                int[][] iArr8 = iArr6;
                double d = dDistance2;
                int i24 = 0;
                while (i24 < iMin) {
                    Distance[][] distanceArr2 = distanceArr;
                    int i25 = i2;
                    if (distanceArr[i22][i24].distance < 4.0d * dDistance2) {
                        double dDistance3 = pointProviderLab.distance(dArr3, dArr2[i24]);
                        if (dDistance3 < d) {
                            i23 = i24;
                            d = dDistance3;
                        }
                    }
                    i24++;
                    distanceArr = distanceArr2;
                    i2 = i25;
                }
                Distance[][] distanceArr3 = distanceArr;
                int i26 = i2;
                if (i23 != -1 && Math.abs(Math.sqrt(d) - Math.sqrt(dDistance2)) > 3.0d) {
                    i21++;
                    iArr5[i20] = i23;
                }
                i20++;
                distanceArr = distanceArr3;
                iArr6 = iArr8;
                i2 = i26;
            }
            int[][] iArr9 = iArr6;
            Distance[][] distanceArr4 = distanceArr;
            int i27 = i2;
            if (i21 == 0 && i13 != 0) {
                break;
            }
            double[] dArr4 = new double[iMin];
            double[] dArr5 = new double[iMin];
            double[] dArr6 = new double[iMin];
            int i28 = 0;
            Arrays.fill(iArr7, 0);
            int i29 = i27;
            while (i28 < i29) {
                int i30 = iArr5[i28];
                double[] dArr7 = dArr[i28];
                int i31 = iArr4[i28];
                iArr7[i30] = iArr7[i30] + i31;
                int[] iArr10 = iArr4;
                double d2 = i31;
                dArr4[i30] = (dArr7[0] * d2) + dArr4[i30];
                dArr5[i30] = (dArr7[1] * d2) + dArr5[i30];
                dArr6[i30] = (dArr7[2] * d2) + dArr6[i30];
                i28++;
                iArr4 = iArr10;
                iArr5 = iArr5;
            }
            int[] iArr11 = iArr4;
            int[] iArr12 = iArr5;
            int i32 = 0;
            while (i32 < iMin) {
                int i33 = iArr7[i32];
                if (i33 == 0) {
                    dArr2[i32] = new double[]{0.0d, 0.0d, 0.0d};
                } else {
                    double d3 = i33;
                    double d4 = dArr4[i32] / d3;
                    double d5 = dArr5[i32] / d3;
                    double d6 = dArr6[i32] / d3;
                    double[] dArr8 = dArr2[i32];
                    dArr8[0] = d4;
                    dArr8[1] = d5;
                    dArr8[2] = d6;
                }
                i32++;
                i29 = i29;
            }
            i13++;
            distanceArr = distanceArr4;
            iArr6 = iArr9;
            i2 = i29;
            iArr4 = iArr11;
            iArr5 = iArr12;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (int i34 = 0; i34 < iMin; i34++) {
            int i35 = iArr7[i34];
            if (i35 != 0) {
                int i36 = pointProviderLab.toInt(dArr2[i34]);
                if (!linkedHashMap2.containsKey(Integer.valueOf(i36))) {
                    linkedHashMap2.put(Integer.valueOf(i36), Integer.valueOf(i35));
                }
            }
        }
        return linkedHashMap2;
    }
}
