package l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97TY */
/* JADX INFO: loaded from: classes4.dex */
public final class C15436 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Rect f47255;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f47256;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f47258;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f47260;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f47262;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int[] f47263;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f47257 = new int[4];

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f47259 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f47261 = -1;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36478(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36483(String str) {
        int i;
        String strTrim = str.trim();
        String str2 = C3603.f11424;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (!str3.startsWith("palette: ")) {
                if (str3.startsWith("size: ")) {
                    String[] strArrSplit = str3.substring(6).trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        try {
                            this.f47262 = Integer.parseInt(strArrSplit[0]);
                            this.f47256 = Integer.parseInt(strArrSplit[1]);
                            this.f47258 = true;
                        } catch (RuntimeException e) {
                            C19956.m46036("Parsing IDX failed", e);
                        }
                    }
                }
            } else {
                String[] strArrSplit2 = str3.substring(9).split(",", -1);
                this.f47263 = new int[strArrSplit2.length];
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    int[] iArr = this.f47263;
                    try {
                        i = Integer.parseInt(strArrSplit2[i2].trim(), 16);
                    } catch (RuntimeException unused) {
                        i = 0;
                    }
                    iArr[i2] = i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m36484(C17714 c17714) {
        int[] iArr = this.f47263;
        if (iArr == null || !this.f47258) {
            return;
        }
        c17714.m41478(c17714.m41464() - 2);
        int iM41464 = c17714.m41464();
        while (c17714.m41485() < iM41464 && c17714.m41457() > 0) {
            int iM41456 = c17714.m41456();
            int[] iArr2 = this.f47257;
            switch (iM41456) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (c17714.m41457() < 2) {
                        return;
                    }
                    int iM41457 = c17714.m41456();
                    int iM41458 = c17714.m41456();
                    iArr2[3] = m36479(iM41457 >> 4, iArr);
                    iArr2[2] = m36479(iM41457 & 15, iArr);
                    iArr2[1] = m36479(iM41458 >> 4, iArr);
                    iArr2[0] = m36479(iM41458 & 15, iArr);
                    this.f47260 = true;
                    break;
                case 4:
                    if (c17714.m41457() < 2 || !this.f47260) {
                        return;
                    }
                    int iM41459 = c17714.m41456();
                    int iM414510 = c17714.m41456();
                    iArr2[3] = m36478(iArr2[3], iM41459 >> 4);
                    iArr2[2] = m36478(iArr2[2], iM41459 & 15);
                    iArr2[1] = m36478(iArr2[1], iM414510 >> 4);
                    iArr2[0] = m36478(iArr2[0], iM414510 & 15);
                    break;
                case 5:
                    if (c17714.m41457() < 6) {
                        return;
                    }
                    int iM414511 = c17714.m41456();
                    int iM414512 = c17714.m41456();
                    int i = (iM414511 << 4) | (iM414512 >> 4);
                    int iM414513 = ((iM414512 & 15) << 8) | c17714.m41456();
                    int iM414514 = c17714.m41456();
                    int iM414515 = c17714.m41456();
                    this.f47255 = new Rect(i, (iM414514 << 4) | (iM414515 >> 4), iM414513 + 1, (((iM414515 & 15) << 8) | c17714.m41456()) + 1);
                    break;
                case 6:
                    if (c17714.m41457() < 4) {
                        return;
                    }
                    this.f47259 = c17714.m41464();
                    this.f47261 = c17714.m41464();
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m36479(int i, int[] iArr) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19811 m36481(C17714 c17714) {
        Rect rect;
        if (this.f47263 == null || !this.f47258 || !this.f47260 || (rect = this.f47255) == null || this.f47259 == -1 || this.f47261 == -1 || rect.width() < 2 || this.f47255.height() < 2) {
            return null;
        }
        Rect rect2 = this.f47255;
        int[] iArr = new int[rect2.height() * rect2.width()];
        C16302 c16302 = new C16302();
        c17714.m41484(this.f47259);
        c16302.m38342(c17714);
        m36480(c16302, true, rect2, iArr);
        c17714.m41484(this.f47261);
        c16302.m38342(c17714);
        m36480(c16302, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        C21927 c21927 = new C21927();
        c21927.m49387(bitmapCreateBitmap);
        c21927.m49391(rect2.left / this.f47262);
        c21927.m49393(0);
        c21927.m49385(rect2.top / this.f47256, 0);
        c21927.m49386(0);
        c21927.m49401(rect2.width() / this.f47262);
        c21927.m49384(rect2.height() / this.f47256);
        return c21927.m49383();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m36480(C16302 c16302, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * iWidth;
        while (true) {
            int i5 = 0;
            do {
                int iM38343 = 0;
                int i6 = 1;
                while (true) {
                    if (iM38343 >= i6 || i6 > 64) {
                        i = iM38343 & 3;
                        if (iM38343 >= 4) {
                            i2 = iM38343 >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (c16302.m38339() < 4) {
                        i2 = 0;
                        i = -1;
                        break;
                    } else {
                        iM38343 = (iM38343 << 4) | c16302.m38343(4);
                        i6 <<= 2;
                    }
                }
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    Arrays.fill(iArr, i4, i7, this.f47257[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            c16302.m38344();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36482() {
        this.f47260 = false;
        this.f47255 = null;
        this.f47259 = -1;
        this.f47261 = -1;
    }
}
