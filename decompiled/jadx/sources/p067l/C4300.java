package p067l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import com.alipay.sdk.p010m.p041p.C0184a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.֫᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F8V3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4300 implements InterfaceC11657 {

    /* JADX INFO: renamed from: ֫ */
    public Bitmap f9559;

    /* JADX INFO: renamed from: ۧ */
    public final Canvas f9560;

    /* JADX INFO: renamed from: ܳ */
    public final Paint f9561;

    /* JADX INFO: renamed from: ܽ */
    public final C15008 f9562;

    /* JADX INFO: renamed from: ܿ */
    public final Paint f9563;

    /* JADX INFO: renamed from: ᩳ */
    public final C14338 f9564;

    /* JADX INFO: renamed from: ᩻ */
    public final C9644 f9565;

    /* JADX INFO: renamed from: ۜ */
    public static final byte[] f9556 = {0, 7, 8, 15};

    /* JADX INFO: renamed from: ᩷ */
    public static final byte[] f9558 = {0, 119, -120, -1};

    /* JADX INFO: renamed from: ۢ */
    public static final byte[] f9557 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: ֫ */
    public static int m8736(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ InterfaceC15266 mo8743(int i, int i2, byte[] bArr) {
        return C16349.m37149(this, bArr, i2);
    }

    public C4300(List list) {
        C19203 c19203 = new C19203((byte[]) list.get(0));
        int iM43710 = c19203.m43710();
        int iM43711 = c19203.m43710();
        Paint paint = new Paint();
        this.f9563 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f9561 = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f9560 = new Canvas();
        this.f9564 = new C14338(719, 575, 0, 719, 0, 575);
        this.f9562 = new C15008(0, new int[]{0, -1, -16777216, -8421505}, m8741(), m8742());
        this.f9565 = new C9644(iM43710, iM43711);
    }

    @Override // p067l.InterfaceC11657
    /* JADX INFO: renamed from: ֫ */
    public final void mo8744(byte[] bArr, int i, int i2, C22386 c22386, InterfaceC24686 interfaceC24686) {
        C9644 c9644;
        C14596 c14596;
        int i3;
        int[] iArr;
        C24396 c24396;
        int iM40558;
        int iM40559;
        int iM405510;
        int iM405511;
        C17861 c17861 = new C17861(bArr, i + i2);
        c17861.m40569(i);
        while (true) {
            int iM40554 = c17861.m40554();
            c9644 = this.f9565;
            if (iM40554 >= 48 && c17861.m40558(8) == 15) {
                int iM405512 = c17861.m40558(8);
                int i4 = 16;
                int iM405513 = c17861.m40558(16);
                int iM405514 = c17861.m40558(16);
                int iM40563 = c17861.m40563() + iM405514;
                if (iM405514 * 8 > c17861.m40554()) {
                    C21334.m48351("Data field length exceeds limit");
                    c17861.m40566(c17861.m40554());
                } else {
                    switch (iM405512) {
                        case 16:
                            if (iM405513 == c9644.f26554) {
                                C8303 c8303 = c9644.f26555;
                                c17861.m40558(8);
                                int iM405515 = c17861.m40558(4);
                                int iM405516 = c17861.m40558(2);
                                c17861.m40566(2);
                                int i5 = iM405514 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i5 > 0) {
                                    int iM405517 = c17861.m40558(8);
                                    c17861.m40566(8);
                                    i5 -= 6;
                                    sparseArray.put(iM405517, new C13668(c17861.m40558(16), c17861.m40558(16)));
                                }
                                C8303 c8304 = new C8303(iM405515, iM405516, sparseArray);
                                if (iM405516 != 0) {
                                    c9644.f26555 = c8304;
                                    c9644.f26548.clear();
                                    c9644.f26553.clear();
                                    c9644.f26550.clear();
                                } else if (c8303 != null && c8303.f22189 != iM405515) {
                                    c9644.f26555 = c8304;
                                }
                            }
                            break;
                        case 17:
                            C8303 c8305 = c9644.f26555;
                            SparseArray sparseArray2 = c9644.f26548;
                            if (iM405513 == c9644.f26554 && c8305 != null) {
                                int iM405518 = c17861.m40558(8);
                                c17861.m40566(4);
                                boolean zM40567 = c17861.m40567();
                                c17861.m40566(3);
                                int iM405519 = c17861.m40558(16);
                                int iM405520 = c17861.m40558(16);
                                c17861.m40558(3);
                                int iM405521 = c17861.m40558(3);
                                c17861.m40566(2);
                                int iM405522 = c17861.m40558(8);
                                int iM405523 = c17861.m40558(8);
                                int iM405524 = c17861.m40558(4);
                                int iM405525 = c17861.m40558(2);
                                c17861.m40566(2);
                                int i6 = iM405514 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i6 > 0) {
                                    int iM405526 = c17861.m40558(i4);
                                    int iM405527 = c17861.m40558(2);
                                    c17861.m40558(2);
                                    int iM405528 = c17861.m40558(12);
                                    c17861.m40566(4);
                                    int iM405529 = c17861.m40558(12);
                                    int i7 = i6 - 6;
                                    if (iM405527 == 1 || iM405527 == 2) {
                                        c17861.m40558(8);
                                        c17861.m40558(8);
                                        i6 -= 8;
                                    } else {
                                        i6 = i7;
                                    }
                                    sparseArray3.put(iM405526, new C15678(iM405528, iM405529));
                                    i4 = 16;
                                }
                                C24396 c24397 = new C24396(iM405518, zM40567, iM405519, iM405520, iM405521, iM405522, iM405523, iM405524, iM405525, sparseArray3);
                                if (c8305.f22188 == 0 && (c24396 = (C24396) sparseArray2.get(iM405518)) != null) {
                                    SparseArray sparseArray4 = c24396.f77246;
                                    for (int i8 = 0; i8 < sparseArray4.size(); i8++) {
                                        c24397.f77246.put(sparseArray4.keyAt(i8), (C15678) sparseArray4.valueAt(i8));
                                    }
                                }
                                sparseArray2.put(c24397.f77244, c24397);
                            }
                            break;
                        case 18:
                            if (iM405513 == c9644.f26554) {
                                C15008 c15008M8738 = m8738(c17861, iM405514);
                                c9644.f26553.put(c15008M8738.f42881, c15008M8738);
                            } else if (iM405513 == c9644.f26551) {
                                C15008 c15008M8739 = m8738(c17861, iM405514);
                                c9644.f26547.put(c15008M8739.f42881, c15008M8739);
                            }
                            break;
                        case 19:
                            if (iM405513 == c9644.f26554) {
                                C12327 c12327M8737 = m8737(c17861);
                                c9644.f26550.put(c12327M8737.f34406, c12327M8737);
                            } else if (iM405513 == c9644.f26551) {
                                C12327 c12327M8738 = m8737(c17861);
                                c9644.f26549.put(c12327M8738.f34406, c12327M8738);
                            }
                            break;
                        case 20:
                            if (iM405513 == c9644.f26554) {
                                c17861.m40566(4);
                                boolean zM40568 = c17861.m40567();
                                c17861.m40566(3);
                                int iM405530 = c17861.m40558(16);
                                int iM405531 = c17861.m40558(16);
                                if (zM40568) {
                                    iM405510 = c17861.m40558(16);
                                    iM40558 = c17861.m40558(16);
                                    iM405511 = c17861.m40558(16);
                                    iM40559 = c17861.m40558(16);
                                } else {
                                    iM40558 = iM405530;
                                    iM40559 = iM405531;
                                    iM405510 = 0;
                                    iM405511 = 0;
                                }
                                c9644.f26552 = new C14338(iM405530, iM405531, iM405510, iM40558, iM405511, iM40559);
                            }
                            break;
                    }
                    c17861.m40562(iM40563 - c17861.m40563());
                }
            }
        }
        C8303 c8306 = c9644.f26555;
        if (c8306 == null) {
            c14596 = new C14596(-9223372036854775807L, -9223372036854775807L, AbstractC16192.m36872of());
        } else {
            C14338 c14338 = c9644.f26552;
            if (c14338 == null) {
                c14338 = this.f9564;
            }
            Bitmap bitmap = this.f9559;
            Canvas canvas = this.f9560;
            if (bitmap == null || c14338.f41014 + 1 != bitmap.getWidth() || c14338.f41012 + 1 != this.f9559.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c14338.f41014 + 1, c14338.f41012 + 1, Bitmap.Config.ARGB_8888);
                this.f9559 = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray5 = c8306.f22187;
            int i9 = 0;
            while (i9 < sparseArray5.size()) {
                canvas.save();
                C13668 c13668 = (C13668) sparseArray5.valueAt(i9);
                C24396 c24398 = (C24396) c9644.f26548.get(sparseArray5.keyAt(i9));
                int i10 = c13668.f38528;
                int i11 = c14338.f41015;
                int i12 = c14338.f41012;
                int i13 = c14338.f41014;
                int i14 = i10 + i11;
                int i15 = c13668.f38529 + c14338.f41016;
                int i16 = c24398.f77240;
                int i17 = c24398.f77238;
                int i18 = c24398.f77245;
                int i19 = i14 + i16;
                SparseArray sparseArray6 = sparseArray5;
                int i20 = i9;
                int i21 = i15 + i18;
                int i22 = i19;
                canvas.clipRect(i14, i15, Math.min(i19, c14338.f41013), Math.min(i21, c14338.f41017));
                C15008 c15008 = (C15008) c9644.f26553.get(i17);
                if (c15008 == null && (c15008 = (C15008) c9644.f26547.get(i17)) == null) {
                    c15008 = this.f9562;
                }
                SparseArray sparseArray7 = c24398.f77246;
                int i23 = 0;
                C14338 c14339 = c14338;
                while (i23 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i23);
                    int i24 = i23;
                    C15678 c15678 = (C15678) sparseArray7.valueAt(i23);
                    SparseArray sparseArray8 = sparseArray7;
                    C12327 c12327 = (C12327) c9644.f26550.get(iKeyAt);
                    if (c12327 == null) {
                        c12327 = (C12327) c9644.f26549.get(iKeyAt);
                    }
                    C12327 c12328 = c12327;
                    if (c12328 != null) {
                        Paint paint = c12328.f34407 ? null : this.f9563;
                        int i25 = c24398.f77241;
                        int i26 = c15678.f45446 + i14;
                        int i27 = i15 + c15678.f45447;
                        if (i25 == 3) {
                            iArr = c15008.f42880;
                        } else if (i25 == 2) {
                            iArr = c15008.f42879;
                        } else {
                            iArr = c15008.f42878;
                        }
                        int[] iArr2 = iArr;
                        m8739(c12328.f34408, iArr2, i25, i26, i27, paint, canvas);
                        m8739(c12328.f34405, iArr2, i25, i26, i27 + 1, paint, canvas);
                    }
                    i23 = i24 + 1;
                    i14 = i14;
                    sparseArray7 = sparseArray8;
                    c9644 = c9644;
                    i18 = i18;
                    i16 = i16;
                    i13 = i13;
                    i12 = i12;
                    i21 = i21;
                    i22 = i22;
                    arrayList = arrayList;
                }
                ArrayList arrayList2 = arrayList;
                C9644 c9645 = c9644;
                int i28 = i18;
                int i29 = i16;
                int i30 = i13;
                int i31 = i12;
                int i32 = i22;
                int i33 = i21;
                int i34 = i14;
                if (c24398.f77243) {
                    int i35 = c24398.f77241;
                    if (i35 == 3) {
                        i3 = c15008.f42880[c24398.f77239];
                    } else if (i35 == 2) {
                        i3 = c15008.f42879[c24398.f77247];
                    } else {
                        i3 = c15008.f42878[c24398.f77242];
                    }
                    Paint paint2 = this.f9561;
                    paint2.setColor(i3);
                    canvas.drawRect(i34, i15, i32, i33, paint2);
                }
                C23207 c23207 = new C23207();
                c23207.m51724(Bitmap.createBitmap(this.f9559, i34, i15, i29, i28));
                float f = i34;
                float f2 = i30;
                c23207.m51728(f / f2);
                c23207.m51730(0);
                float f3 = i31;
                c23207.m51722(i15 / f3, 0);
                c23207.m51723(0);
                c23207.m51738(i29 / f2);
                c23207.m51721(i28 / f3);
                arrayList = arrayList2;
                arrayList.add(c23207.m51720());
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i9 = i20 + 1;
                sparseArray5 = sparseArray6;
                c14338 = c14339;
                c9644 = c9645;
            }
            c14596 = new C14596(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        interfaceC24686.accept(c14596);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C15008 m8738(C17861 c17861, int i) {
        int[] iArr;
        int i2;
        int iM40558;
        int iM40559;
        int iM405510;
        int iM405511;
        int i3 = 8;
        int iM405512 = c17861.m40558(8);
        c17861.m40566(8);
        int i4 = 2;
        int i5 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrM8741 = m8741();
        int[] iArrM8742 = m8742();
        while (i5 > 0) {
            int iM405513 = c17861.m40558(i3);
            int iM405514 = c17861.m40558(i3);
            if ((iM405514 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iM405514 & 64) != 0 ? iArrM8741 : iArrM8742;
            }
            if ((iM405514 & 1) != 0) {
                iM40558 = c17861.m40558(i3);
                iM405511 = c17861.m40558(i3);
                iM405510 = c17861.m40558(i3);
                iM40559 = c17861.m40558(i3);
                i2 = i5 - 6;
            } else {
                int iM405515 = c17861.m40558(6) << i4;
                int iM405516 = c17861.m40558(4) << 4;
                int iM405517 = c17861.m40558(4) << 4;
                int iM405518 = c17861.m40558(i4) << 6;
                i2 = i5 - 4;
                iM40558 = iM405515;
                iM40559 = iM405518;
                iM405510 = iM405517;
                iM405511 = iM405516;
            }
            if (iM40558 == 0) {
                iM405511 = 0;
                iM405510 = 0;
                iM40559 = 255;
            }
            double d = iM40558;
            double d2 = iM405511 + C0184a.f879g;
            int i6 = i2;
            double d3 = iM405510 + C0184a.f879g;
            iArr[iM405513] = m8736((byte) (255 - (iM40559 & 255)), C5792.m12976((int) ((1.402d * d2) + d), 0, 255), C5792.m12976((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), C5792.m12976((int) ((d3 * 1.772d) + d), 0, 255));
            i3 = 8;
            i4 = 2;
            i5 = i6;
            iArr2 = iArr2;
        }
        return new C15008(iM405512, iArr2, iArrM8741, iArrM8742);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C12327 m8737(C17861 c17861) {
        byte[] bArr;
        int iM40558 = c17861.m40558(16);
        c17861.m40566(4);
        int iM40559 = c17861.m40558(2);
        boolean zM40567 = c17861.m40567();
        c17861.m40566(1);
        byte[] bArr2 = C5792.f14227;
        if (iM40559 == 1) {
            c17861.m40566(c17861.m40558(8) * 16);
        } else {
            if (iM40559 == 0) {
                int iM405510 = c17861.m40558(16);
                int iM405511 = c17861.m40558(16);
                if (iM405510 > 0) {
                    bArr2 = new byte[iM405510];
                    c17861.m40560(iM405510, bArr2);
                }
                if (iM405511 > 0) {
                    bArr = new byte[iM405511];
                    c17861.m40560(iM405511, bArr);
                }
            }
            return new C12327(bArr2, bArr, iM40558, zM40567);
        }
        bArr = bArr2;
        return new C12327(bArr2, bArr, iM40558, zM40567);
    }

    /* JADX INFO: renamed from: ֫ */
    public static int[] m8741() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m8736(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m8736(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int[] m8742() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m8736(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & 136;
                if (i2 == 0) {
                    iArr[i] = m8736(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = m8736(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = m8736(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = m8736(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m8739(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        boolean z;
        int i4;
        int iM40558;
        int iM40559;
        byte[] bArr4;
        int iM405510;
        int iM405511;
        int i5;
        boolean z2;
        int iM405512;
        boolean z3;
        int i6;
        C17861 c17861 = new C17861(bArr, bArr.length);
        byte[] bArrM8740 = null;
        byte[] bArrM8741 = null;
        byte[] bArrM8742 = null;
        int i7 = i2;
        int i8 = i3;
        while (c17861.m40554() != 0) {
            int iM405513 = c17861.m40558(8);
            if (iM405513 != 240) {
                int i9 = 3;
                int i10 = 2;
                int i11 = 4;
                switch (iM405513) {
                    case 16:
                        if (i != 3) {
                            if (i != 2) {
                                bArr2 = null;
                            } else if (bArrM8742 == null) {
                                bArr2 = f9556;
                            } else {
                                bArr3 = bArrM8742;
                            }
                            bArr3 = bArr2;
                        } else if (bArrM8740 == null) {
                            bArr2 = f9558;
                            bArr3 = bArr2;
                        } else {
                            bArr3 = bArrM8740;
                        }
                        boolean z4 = false;
                        int i12 = i7;
                        while (true) {
                            int iM405514 = c17861.m40558(2);
                            if (iM405514 == 0) {
                                if (c17861.m40567()) {
                                    iM40558 = c17861.m40558(3) + 3;
                                    iM40559 = c17861.m40558(2);
                                } else if (c17861.m40567()) {
                                    iM405514 = 0;
                                    z = z4;
                                    i4 = 1;
                                } else {
                                    int iM405515 = c17861.m40558(2);
                                    if (iM405515 == 0) {
                                        iM405514 = 0;
                                        z4 = true;
                                    } else if (iM405515 == 1) {
                                        iM405514 = 0;
                                        z = z4;
                                        i4 = 2;
                                    } else if (iM405515 == 2) {
                                        int iM405516 = c17861.m40558(4) + 12;
                                        iM405514 = c17861.m40558(2);
                                        z = z4;
                                        i4 = iM405516;
                                    } else if (iM405515 != 3) {
                                        iM405514 = 0;
                                    } else {
                                        iM40558 = c17861.m40558(8) + 29;
                                        iM40559 = c17861.m40558(2);
                                    }
                                    z = z4;
                                    i4 = 0;
                                }
                                i4 = iM40558;
                                z = z4;
                                iM405514 = iM40559;
                            } else {
                                z = z4;
                                i4 = 1;
                            }
                            if (i4 != 0 && paint != null) {
                                if (bArr3 != 0) {
                                    iM405514 = bArr3[iM405514];
                                }
                                paint.setColor(iArr[iM405514]);
                                canvas.drawRect(i12, i8, i12 + i4, i8 + 1, paint);
                            }
                            i12 += i4;
                            if (z) {
                                c17861.m40559();
                                i7 = i12;
                            } else {
                                z4 = z;
                            }
                            break;
                        }
                        break;
                    case 17:
                        if (i == 3) {
                            bArr4 = bArrM8741 == null ? f9557 : bArrM8741;
                        } else {
                            bArr4 = null;
                        }
                        byte[] bArr5 = bArr4;
                        boolean z5 = false;
                        int i13 = i7;
                        int i14 = 8;
                        while (true) {
                            int iM405517 = c17861.m40558(i11);
                            if (iM405517 != 0) {
                                z2 = z5;
                                i5 = 1;
                            } else {
                                if (!c17861.m40567()) {
                                    int iM405518 = c17861.m40558(i9);
                                    if (iM405518 != 0) {
                                        iM405510 = iM405518 + 2;
                                    } else {
                                        z5 = true;
                                        iM405510 = 0;
                                    }
                                    iM405517 = 0;
                                } else {
                                    if (!c17861.m40567()) {
                                        iM405510 = c17861.m40558(i10) + 4;
                                        iM405511 = c17861.m40558(i11);
                                    } else {
                                        int iM405519 = c17861.m40558(i10);
                                        if (iM405519 == 0) {
                                            iM405510 = 1;
                                        } else if (iM405519 == 1) {
                                            iM405510 = 2;
                                        } else if (iM405519 != i10) {
                                            if (iM405519 == i9) {
                                                iM405510 = c17861.m40558(i14) + 25;
                                                iM405511 = c17861.m40558(i11);
                                            }
                                            iM405510 = 0;
                                        } else {
                                            iM405510 = c17861.m40558(i11) + 9;
                                            iM405511 = c17861.m40558(i11);
                                        }
                                        iM405517 = 0;
                                    }
                                    iM405517 = iM405511;
                                }
                                i5 = iM405510;
                                z2 = z5;
                            }
                            if (i5 != 0 && paint != null) {
                                if (bArr5 != 0) {
                                    iM405517 = bArr5[iM405517];
                                }
                                paint.setColor(iArr[iM405517]);
                                canvas.drawRect(i13, i8, i13 + i5, i8 + 1, paint);
                            }
                            i13 += i5;
                            if (z2) {
                                c17861.m40559();
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
                            int iM405520 = c17861.m40558(8);
                            if (iM405520 != 0) {
                                z3 = z6;
                                i6 = 1;
                            } else {
                                if (!c17861.m40567()) {
                                    iM405512 = c17861.m40558(7);
                                    iM405520 = 0;
                                    if (iM405512 == 0) {
                                        z3 = true;
                                        i6 = 0;
                                    }
                                } else {
                                    iM405512 = c17861.m40558(7);
                                    iM405520 = c17861.m40558(8);
                                }
                                z3 = z6;
                                i6 = iM405512;
                            }
                            if (i6 != 0 && paint != null) {
                                paint.setColor(iArr[iM405520]);
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
                        switch (iM405513) {
                            case 32:
                                bArrM8742 = m8740(4, 4, c17861);
                                break;
                            case 33:
                                bArrM8740 = m8740(4, 8, c17861);
                                break;
                            case 34:
                                bArrM8741 = m8740(16, 8, c17861);
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

    /* JADX INFO: renamed from: ֫ */
    public static byte[] m8740(int i, int i2, C17861 c17861) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c17861.m40558(i2);
        }
        return bArr;
    }

    @Override // p067l.InterfaceC11657
    public final void reset() {
        C9644 c9644 = this.f9565;
        c9644.f26548.clear();
        c9644.f26553.clear();
        c9644.f26550.clear();
        c9644.f26547.clear();
        c9644.f26549.clear();
        c9644.f26552 = null;
        c9644.f26555 = null;
    }
}
