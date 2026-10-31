package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.alipay.sdk.m.p.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8V3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2032 implements InterfaceC9773 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Bitmap f6775;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Canvas f6776;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Paint f6777;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C13299 f6778;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Paint f6779;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C12594 f6780;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C7655 f6781;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final byte[] f6772 = {0, 7, 8, 15};

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final byte[] f6774 = {0, 119, -120, -1};

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final byte[] f6773 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m6610(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13571 mo6617(int i, int i2, byte[] bArr) {
        return C14710.m35002(this, bArr, i2);
    }

    public C2032(List list) {
        C17714 c17714 = new C17714((byte[]) list.get(0));
        int iM41464 = c17714.m41464();
        int iM41465 = c17714.m41464();
        Paint paint = new Paint();
        this.f6779 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f6777 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f6776 = new Canvas();
        this.f6780 = new C12594(719, 575, 0, 719, 0, 575);
        this.f6778 = new C13299(0, new int[]{0, -1, -16777216, -8421505}, m6615(), m6616());
        this.f6781 = new C7655(iM41464, iM41465);
    }

    @Override // l.InterfaceC9773
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo6618(byte[] bArr, int i, int i2, C21062 c21062, InterfaceC23483 interfaceC23483) {
        C7655 c7655;
        C12866 c12866;
        int i3;
        int[] iArr;
        C23177 c23177;
        int iM38343;
        int iM38344;
        int iM38345;
        int iM38346;
        C16302 c16302 = new C16302(bArr, i + i2);
        c16302.m38354(i);
        while (true) {
            int iM38339 = c16302.m38339();
            c7655 = this.f6781;
            if (iM38339 >= 48 && c16302.m38343(8) == 15) {
                int iM38347 = c16302.m38343(8);
                int i4 = 16;
                int iM38348 = c16302.m38343(16);
                int iM38349 = c16302.m38343(16);
                int iM383410 = c16302.m38348() + iM38349;
                if (iM38349 * 8 > c16302.m38339()) {
                    C19956.m46037("Data field length exceeds limit");
                    c16302.m38351(c16302.m38339());
                } else {
                    switch (iM38347) {
                        case 16:
                            if (iM38348 == c7655.f23640) {
                                C6244 c6244 = c7655.f23641;
                                c16302.m38343(8);
                                int iM383411 = c16302.m38343(4);
                                int iM383412 = c16302.m38343(2);
                                c16302.m38351(2);
                                int i5 = iM38349 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i5 > 0) {
                                    int iM383413 = c16302.m38343(8);
                                    c16302.m38351(8);
                                    i5 -= 6;
                                    sparseArray.put(iM383413, new C11889(c16302.m38343(16), c16302.m38343(16)));
                                }
                                C6244 c6245 = new C6244(iM383411, iM383412, sparseArray);
                                if (iM383412 != 0) {
                                    c7655.f23641 = c6245;
                                    c7655.f23634.clear();
                                    c7655.f23639.clear();
                                    c7655.f23636.clear();
                                } else if (c6244 != null && c6244.f19325 != iM383411) {
                                    c7655.f23641 = c6245;
                                }
                            }
                            break;
                        case 17:
                            C6244 c6246 = c7655.f23641;
                            SparseArray sparseArray2 = c7655.f23634;
                            if (iM38348 == c7655.f23640 && c6246 != null) {
                                int iM383414 = c16302.m38343(8);
                                c16302.m38351(4);
                                boolean zM38352 = c16302.m38352();
                                c16302.m38351(3);
                                int iM383415 = c16302.m38343(16);
                                int iM383416 = c16302.m38343(16);
                                c16302.m38343(3);
                                int iM383417 = c16302.m38343(3);
                                c16302.m38351(2);
                                int iM383418 = c16302.m38343(8);
                                int iM383419 = c16302.m38343(8);
                                int iM383420 = c16302.m38343(4);
                                int iM383421 = c16302.m38343(2);
                                c16302.m38351(2);
                                int i6 = iM38349 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i6 > 0) {
                                    int iM383422 = c16302.m38343(i4);
                                    int iM383423 = c16302.m38343(2);
                                    c16302.m38343(2);
                                    int iM383424 = c16302.m38343(12);
                                    c16302.m38351(4);
                                    int iM383425 = c16302.m38343(12);
                                    int i7 = i6 - 6;
                                    if (iM383423 == 1 || iM383423 == 2) {
                                        c16302.m38343(8);
                                        c16302.m38343(8);
                                        i6 -= 8;
                                    } else {
                                        i6 = i7;
                                    }
                                    sparseArray3.put(iM383422, new C14004(iM383424, iM383425));
                                    i4 = 16;
                                }
                                C23177 c23178 = new C23177(iM383414, zM38352, iM383415, iM383416, iM383417, iM383418, iM383419, iM383420, iM383421, sparseArray3);
                                if (c6246.f19324 == 0 && (c23177 = (C23177) sparseArray2.get(iM383414)) != null) {
                                    SparseArray sparseArray4 = c23177.f74502;
                                    for (int i8 = 0; i8 < sparseArray4.size(); i8++) {
                                        c23178.f74502.put(sparseArray4.keyAt(i8), (C14004) sparseArray4.valueAt(i8));
                                    }
                                }
                                sparseArray2.put(c23178.f74500, c23178);
                            }
                            break;
                        case 18:
                            if (iM38348 == c7655.f23640) {
                                C13299 c13299M6612 = m6612(c16302, iM38349);
                                c7655.f23639.put(c13299M6612.f39814, c13299M6612);
                            } else if (iM38348 == c7655.f23637) {
                                C13299 c13299M6613 = m6612(c16302, iM38349);
                                c7655.f23633.put(c13299M6613.f39814, c13299M6613);
                            }
                            break;
                        case 19:
                            if (iM38348 == c7655.f23640) {
                                C10478 c10478M6611 = m6611(c16302);
                                c7655.f23636.put(c10478M6611.f31442, c10478M6611);
                            } else if (iM38348 == c7655.f23637) {
                                C10478 c10478M6612 = m6611(c16302);
                                c7655.f23635.put(c10478M6612.f31442, c10478M6612);
                            }
                            break;
                        case 20:
                            if (iM38348 == c7655.f23640) {
                                c16302.m38351(4);
                                boolean zM38353 = c16302.m38352();
                                c16302.m38351(3);
                                int iM383426 = c16302.m38343(16);
                                int iM383427 = c16302.m38343(16);
                                if (zM38353) {
                                    iM38345 = c16302.m38343(16);
                                    iM38343 = c16302.m38343(16);
                                    iM38346 = c16302.m38343(16);
                                    iM38344 = c16302.m38343(16);
                                } else {
                                    iM38343 = iM383426;
                                    iM38344 = iM383427;
                                    iM38345 = 0;
                                    iM38346 = 0;
                                }
                                c7655.f23638 = new C12594(iM383426, iM383427, iM38345, iM38343, iM38346, iM38344);
                            }
                            break;
                    }
                    c16302.m38347(iM383410 - c16302.m38348());
                }
            }
        }
        C6244 c6247 = c7655.f23641;
        if (c6247 == null) {
            c12866 = new C12866(-9223372036854775807L, -9223372036854775807L, AbstractC14545.of());
        } else {
            C12594 c12594 = c7655.f23638;
            if (c12594 == null) {
                c12594 = this.f6780;
            }
            Bitmap bitmap = this.f6775;
            Canvas canvas = this.f6776;
            if (bitmap == null || c12594.f37987 + 1 != bitmap.getWidth() || c12594.f37985 + 1 != this.f6775.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c12594.f37987 + 1, c12594.f37985 + 1, Bitmap.Config.ARGB_8888);
                this.f6775 = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = c6247.f19323;
            int i9 = 0;
            while (i9 < sparseArray5.size()) {
                canvas.save();
                C11889 c11889 = (C11889) sparseArray5.valueAt(i9);
                C23177 c23179 = (C23177) c7655.f23634.get(sparseArray5.keyAt(i9));
                int i10 = c11889.f35518;
                int i11 = c12594.f37988;
                int i12 = c12594.f37985;
                int i13 = c12594.f37987;
                int i14 = i10 + i11;
                int i15 = c11889.f35519 + c12594.f37989;
                int i16 = c23179.f74496;
                int i17 = c23179.f74494;
                int i18 = c23179.f74501;
                int i19 = i14 + i16;
                SparseArray sparseArray6 = sparseArray5;
                int i20 = i9;
                int i21 = i15 + i18;
                int i22 = i19;
                canvas.clipRect(i14, i15, Math.min(i19, c12594.f37986), Math.min(i21, c12594.f37990));
                C13299 c13299 = (C13299) c7655.f23639.get(i17);
                if (c13299 == null && (c13299 = (C13299) c7655.f23633.get(i17)) == null) {
                    c13299 = this.f6778;
                }
                SparseArray sparseArray7 = c23179.f74502;
                int i23 = 0;
                C12594 c12595 = c12594;
                while (i23 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i23);
                    int i24 = i23;
                    C14004 c14004 = (C14004) sparseArray7.valueAt(i23);
                    SparseArray sparseArray8 = sparseArray7;
                    C10478 c10478 = (C10478) c7655.f23636.get(iKeyAt);
                    if (c10478 == null) {
                        c10478 = (C10478) c7655.f23635.get(iKeyAt);
                    }
                    C10478 c10479 = c10478;
                    if (c10479 != null) {
                        Paint paint = c10479.f31443 ? null : this.f6779;
                        int i25 = c23179.f74497;
                        int i26 = c14004.f42363 + i14;
                        int i27 = i15 + c14004.f42364;
                        if (i25 == 3) {
                            iArr = c13299.f39813;
                        } else if (i25 == 2) {
                            iArr = c13299.f39812;
                        } else {
                            iArr = c13299.f39811;
                        }
                        int[] iArr2 = iArr;
                        m6613(c10479.f31444, iArr2, i25, i26, i27, paint, canvas);
                        m6613(c10479.f31441, iArr2, i25, i26, i27 + 1, paint, canvas);
                    }
                    i23 = i24 + 1;
                    i14 = i14;
                    sparseArray7 = sparseArray8;
                    c7655 = c7655;
                    i18 = i18;
                    i16 = i16;
                    i13 = i13;
                    i12 = i12;
                    i21 = i21;
                    i22 = i22;
                    arrayList = arrayList;
                }
                ArrayList arrayList2 = arrayList;
                C7655 c7656 = c7655;
                int i28 = i18;
                int i29 = i16;
                int i30 = i13;
                int i31 = i12;
                int i32 = i22;
                int i33 = i21;
                int i34 = i14;
                if (c23179.f74499) {
                    int i35 = c23179.f74497;
                    if (i35 == 3) {
                        i3 = c13299.f39813[c23179.f74495];
                    } else if (i35 == 2) {
                        i3 = c13299.f39812[c23179.f74503];
                    } else {
                        i3 = c13299.f39811[c23179.f74498];
                    }
                    Paint paint2 = this.f6777;
                    paint2.setColor(i3);
                    canvas.drawRect(i34, i15, i32, i33, paint2);
                }
                C21927 c21927 = new C21927();
                c21927.m49387(Bitmap.createBitmap(this.f6775, i34, i15, i29, i28));
                float f = i34;
                float f2 = i30;
                c21927.m49391(f / f2);
                c21927.m49393(0);
                float f3 = i31;
                c21927.m49385(i15 / f3, 0);
                c21927.m49386(0);
                c21927.m49401(i29 / f2);
                c21927.m49384(i28 / f3);
                arrayList = arrayList2;
                arrayList.add(c21927.m49383());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i9 = i20 + 1;
                sparseArray5 = sparseArray6;
                c12594 = c12595;
                c7655 = c7656;
            }
            c12866 = new C12866(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        interfaceC23483.accept(c12866);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C13299 m6612(C16302 c16302, int i) {
        int[] iArr;
        int i2;
        int iM38343;
        int iM38344;
        int iM38345;
        int iM38346;
        int i3 = 8;
        int iM38347 = c16302.m38343(8);
        c16302.m38351(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM6615 = m6615();
        int[] iArrM6616 = m6616();
        while (i5 > 0) {
            int iM38348 = c16302.m38343(i3);
            int iM38349 = c16302.m38343(i3);
            if ((iM38349 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM38349 & 64) != 0 ? iArrM6615 : iArrM6616;
            }
            if ((iM38349 & 1) != 0) {
                iM38343 = c16302.m38343(i3);
                iM38346 = c16302.m38343(i3);
                iM38345 = c16302.m38343(i3);
                iM38344 = c16302.m38343(i3);
                i2 = i5 - 6;
            } else {
                int iM383410 = c16302.m38343(6) << i4;
                int iM383411 = c16302.m38343(4) << 4;
                int iM383412 = c16302.m38343(4) << 4;
                int iM383413 = c16302.m38343(i4) << 6;
                i2 = i5 - 4;
                iM38343 = iM383410;
                iM38344 = iM383413;
                iM38345 = iM383412;
                iM38346 = iM383411;
            }
            if (iM38343 == 0) {
                iM38346 = 0;
                iM38345 = 0;
                iM38344 = 255;
            }
            double d = iM38343;
            double d2 = iM38346 + a.g;
            int i6 = i2;
            double d3 = iM38345 + a.g;
            iArr[iM38348] = m6610((byte) (255 - (iM38344 & 255)), C3603.m11000((int) ((1.402d * d2) + d), 0, 255), C3603.m11000((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), C3603.m11000((int) ((d3 * 1.772d) + d), 0, 255));
            i3 = 8;
            i4 = 2;
            i5 = i6;
            iArr2 = iArr2;
        }
        return new C13299(iM38347, iArr2, iArrM6615, iArrM6616);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C10478 m6611(C16302 c16302) {
        byte[] bArr;
        int iM38343 = c16302.m38343(16);
        c16302.m38351(4);
        int iM38344 = c16302.m38343(2);
        boolean zM38352 = c16302.m38352();
        c16302.m38351(1);
        byte[] bArr2 = C3603.f11423;
        if (iM38344 == 1) {
            c16302.m38351(c16302.m38343(8) * 16);
        } else {
            if (iM38344 == 0) {
                int iM38345 = c16302.m38343(16);
                int iM38346 = c16302.m38343(16);
                if (iM38345 > 0) {
                    bArr2 = new byte[iM38345];
                    c16302.m38345(iM38345, bArr2);
                }
                if (iM38346 > 0) {
                    bArr = new byte[iM38346];
                    c16302.m38345(iM38346, bArr);
                }
            }
            return new C10478(bArr2, bArr, iM38343, zM38352);
        }
        bArr = bArr2;
        return new C10478(bArr2, bArr, iM38343, zM38352);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int[] m6615() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m6610(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m6610(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int[] m6616() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m6610(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m6610(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m6610(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m6610(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m6610(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m6613(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        int i4;
        int iM38343;
        int iM38344;
        byte[] bArr4;
        int iM38345;
        int iM38346;
        int i5;
        boolean z2;
        int iM38347;
        boolean z3;
        int i6;
        C16302 c16302 = new C16302(bArr, bArr.length);
        byte[] bArrM6614 = null;
        byte[] bArrM6615 = null;
        byte[] bArrM6616 = null;
        int i7 = i2;
        int i8 = i3;
        while (c16302.m38339() != 0) {
            int iM38348 = c16302.m38343(8);
            if (iM38348 != 240) {
                int i9 = 3;
                int i10 = 2;
                int i11 = 4;
                switch (iM38348) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArrM6616 == null) {
                                bArr2 = f6772;
                            } else {
                                bArr3 = bArrM6616;
                            }
                            bArr3 = bArr2;
                        } else if (bArrM6614 == null) {
                            bArr2 = f6774;
                            bArr3 = bArr2;
                        } else {
                            bArr3 = bArrM6614;
                        }
                        boolean z4 = false;
                        int i12 = i7;
                        while (true) {
                            int iM38349 = c16302.m38343(2);
                            if (iM38349 == 0) {
                                if (c16302.m38352()) {
                                    iM38343 = c16302.m38343(3) + 3;
                                    iM38344 = c16302.m38343(2);
                                } else if (c16302.m38352()) {
                                    iM38349 = 0;
                                    z = z4;
                                    i4 = 1;
                                } else {
                                    int iM383410 = c16302.m38343(2);
                                    if (iM383410 == 0) {
                                        iM38349 = 0;
                                        z4 = true;
                                    } else if (iM383410 == 1) {
                                        iM38349 = 0;
                                        z = z4;
                                        i4 = 2;
                                    } else if (iM383410 == 2) {
                                        int iM383411 = c16302.m38343(4) + 12;
                                        iM38349 = c16302.m38343(2);
                                        z = z4;
                                        i4 = iM383411;
                                    } else if (iM383410 != 3) {
                                        iM38349 = 0;
                                    } else {
                                        iM38343 = c16302.m38343(8) + 29;
                                        iM38344 = c16302.m38343(2);
                                    }
                                    z = z4;
                                    i4 = 0;
                                }
                                i4 = iM38343;
                                z = z4;
                                iM38349 = iM38344;
                            } else {
                                z = z4;
                                i4 = 1;
                            }
                            if (i4 != 0 && paint != null) {
                                if (bArr3 != 0) {
                                    iM38349 = bArr3[iM38349];
                                }
                                paint.setColor(iArr[iM38349]);
                                canvas.drawRect(i12, i8, i12 + i4, i8 + 1, paint);
                            }
                            i12 += i4;
                            if (z) {
                                c16302.m38344();
                                i7 = i12;
                            } else {
                                z4 = z;
                            }
                            break;
                        }
                        break;
                    case 17:
                        if (i == 3) {
                            bArr4 = bArrM6615 == null ? f6773 : bArrM6615;
                        } else {
                            bArr4 = null;
                        }
                        byte[] bArr5 = bArr4;
                        boolean z5 = false;
                        int i13 = i7;
                        int i14 = 8;
                        while (true) {
                            int iM383412 = c16302.m38343(i11);
                            if (iM383412 != 0) {
                                z2 = z5;
                                i5 = 1;
                            } else {
                                if (!c16302.m38352()) {
                                    int iM383413 = c16302.m38343(i9);
                                    if (iM383413 != 0) {
                                        iM38345 = iM383413 + 2;
                                    } else {
                                        z5 = true;
                                        iM38345 = 0;
                                    }
                                    iM383412 = 0;
                                } else {
                                    if (!c16302.m38352()) {
                                        iM38345 = c16302.m38343(i10) + 4;
                                        iM38346 = c16302.m38343(i11);
                                    } else {
                                        int iM383414 = c16302.m38343(i10);
                                        if (iM383414 == 0) {
                                            iM38345 = 1;
                                        } else if (iM383414 == 1) {
                                            iM38345 = 2;
                                        } else if (iM383414 != i10) {
                                            if (iM383414 == i9) {
                                                iM38345 = c16302.m38343(i14) + 25;
                                                iM38346 = c16302.m38343(i11);
                                            }
                                            iM38345 = 0;
                                        } else {
                                            iM38345 = c16302.m38343(i11) + 9;
                                            iM38346 = c16302.m38343(i11);
                                        }
                                        iM383412 = 0;
                                    }
                                    iM383412 = iM38346;
                                }
                                i5 = iM38345;
                                z2 = z5;
                            }
                            if (i5 != 0 && paint != null) {
                                if (bArr5 != 0) {
                                    iM383412 = bArr5[iM383412];
                                }
                                paint.setColor(iArr[iM383412]);
                                canvas.drawRect(i13, i8, i13 + i5, i8 + 1, paint);
                            }
                            i13 += i5;
                            if (z2) {
                                c16302.m38344();
                                i7 = i13;
                            } else {
                                i9 = 3;
                                i10 = 2;
                                i11 = 4;
                                i14 = 8;
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z6 = false;
                        int i15 = i7;
                        while (true) {
                            int iM383415 = c16302.m38343(8);
                            if (iM383415 != 0) {
                                z3 = z6;
                                i6 = 1;
                            } else {
                                if (!c16302.m38352()) {
                                    iM38347 = c16302.m38343(7);
                                    iM383415 = 0;
                                    if (iM38347 == 0) {
                                        z3 = true;
                                        i6 = 0;
                                    }
                                } else {
                                    iM38347 = c16302.m38343(7);
                                    iM383415 = c16302.m38343(8);
                                }
                                z3 = z6;
                                i6 = iM38347;
                            }
                            if (i6 != 0 && paint != null) {
                                paint.setColor(iArr[iM383415]);
                                canvas.drawRect(i15, i8, i15 + i6, i8 + 1, paint);
                            }
                            i15 += i6;
                            if (z3) {
                                i7 = i15;
                            } else {
                                z6 = z3;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iM38348) {
                            case 32:
                                bArrM6616 = m6614(4, 4, c16302);
                                break;
                            case 33:
                                bArrM6614 = m6614(4, 8, c16302);
                                break;
                            case 34:
                                bArrM6615 = m6614(16, 8, c16302);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i2;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static byte[] m6614(int i, int i2, C16302 c16302) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c16302.m38343(i2);
        }
        return bArr;
    }

    @Override // l.InterfaceC9773
    public final void reset() {
        C7655 c7655 = this.f6781;
        c7655.f23634.clear();
        c7655.f23639.clear();
        c7655.f23636.clear();
        c7655.f23633.clear();
        c7655.f23635.clear();
        c7655.f23638 = null;
        c7655.f23641 = null;
    }
}
