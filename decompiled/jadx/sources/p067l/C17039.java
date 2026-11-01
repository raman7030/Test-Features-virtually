package p067l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܶ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97TY */
/* JADX INFO: loaded from: classes4.dex */
public final class C17039 {

    /* JADX INFO: renamed from: ֫ */
    public Rect f50384;

    /* JADX INFO: renamed from: ۜ */
    public int f50385;

    /* JADX INFO: renamed from: ܳ */
    public boolean f50387;

    /* JADX INFO: renamed from: ܿ */
    public boolean f50389;

    /* JADX INFO: renamed from: ᩷ */
    public int f50391;

    /* JADX INFO: renamed from: ᩻ */
    public int[] f50392;

    /* JADX INFO: renamed from: ۧ */
    public final int[] f50386 = new int[4];

    /* JADX INFO: renamed from: ܽ */
    public int f50388 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public int f50390 = -1;

    /* JADX INFO: renamed from: ֫ */
    public static int m38636(int i, int i2) {
        return (i & 16777215) | ((i2 * 17) << 24);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38641(String str) {
        int i;
        String strTrim = str.trim();
        String str2 = C5792.f14228;
        for (String str3 : strTrim.split("\\r?\\n", -1)) {
            if (!str3.startsWith("palette: ")) {
                if (str3.startsWith("size: ")) {
                    String[] strArrSplit = str3.substring(6).trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        try {
                            this.f50391 = Integer.parseInt(strArrSplit[0]);
                            this.f50385 = Integer.parseInt(strArrSplit[1]);
                            this.f50387 = true;
                        } catch (RuntimeException e) {
                            C21334.m48350("Parsing IDX failed", e);
                        }
                    }
                }
            } else {
                String[] strArrSplit2 = str3.substring(9).split(",", -1);
                this.f50392 = new int[strArrSplit2.length];
                for (int i2 = 0; i2 < strArrSplit2.length; i2++) {
                    int[] iArr = this.f50392;
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

    /* JADX INFO: renamed from: ۧ */
    public final void m38642(C19203 c19203) {
        int[] iArr = this.f50392;
        if (iArr == null || !this.f50387) {
            return;
        }
        c19203.m43724(c19203.m43710() - 2);
        int iM43710 = c19203.m43710();
        while (c19203.m43731() < iM43710 && c19203.m43703() > 0) {
            int iM43702 = c19203.m43702();
            int[] iArr2 = this.f50386;
            switch (iM43702) {
                case 0:
                case 1:
                case 2:
                    break;
                case 3:
                    if (c19203.m43703() < 2) {
                        return;
                    }
                    int iM43703 = c19203.m43702();
                    int iM43704 = c19203.m43702();
                    iArr2[3] = m38637(iM43703 >> 4, iArr);
                    iArr2[2] = m38637(iM43703 & 15, iArr);
                    iArr2[1] = m38637(iM43704 >> 4, iArr);
                    iArr2[0] = m38637(iM43704 & 15, iArr);
                    this.f50389 = true;
                    break;
                case 4:
                    if (c19203.m43703() < 2 || !this.f50389) {
                        return;
                    }
                    int iM43705 = c19203.m43702();
                    int iM43706 = c19203.m43702();
                    iArr2[3] = m38636(iArr2[3], iM43705 >> 4);
                    iArr2[2] = m38636(iArr2[2], iM43705 & 15);
                    iArr2[1] = m38636(iArr2[1], iM43706 >> 4);
                    iArr2[0] = m38636(iArr2[0], iM43706 & 15);
                    break;
                case 5:
                    if (c19203.m43703() < 6) {
                        return;
                    }
                    int iM43707 = c19203.m43702();
                    int iM43708 = c19203.m43702();
                    int i = (iM43707 << 4) | (iM43708 >> 4);
                    int iM43709 = ((iM43708 & 15) << 8) | c19203.m43702();
                    int iM437010 = c19203.m43702();
                    int iM437011 = c19203.m43702();
                    this.f50384 = new Rect(i, (iM437010 << 4) | (iM437011 >> 4), iM43709 + 1, (((iM437011 & 15) << 8) | c19203.m43702()) + 1);
                    break;
                case 6:
                    if (c19203.m43703() < 4) {
                        return;
                    }
                    this.f50388 = c19203.m43710();
                    this.f50390 = c19203.m43710();
                    break;
                default:
                    return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m38637(int i, int[] iArr) {
        return (i < 0 || i >= iArr.length) ? iArr[0] : iArr[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21196 m38639(C19203 c19203) {
        Rect rect;
        if (this.f50392 == null || !this.f50387 || !this.f50389 || (rect = this.f50384) == null || this.f50388 == -1 || this.f50390 == -1 || rect.width() < 2 || this.f50384.height() < 2) {
            return null;
        }
        Rect rect2 = this.f50384;
        int[] iArr = new int[rect2.height() * rect2.width()];
        C17861 c17861 = new C17861();
        c19203.m43730(this.f50388);
        c17861.m40557(c19203);
        m38638(c17861, true, rect2, iArr);
        c19203.m43730(this.f50390);
        c17861.m40557(c19203);
        m38638(c17861, false, rect2, iArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888);
        C23207 c23207 = new C23207();
        c23207.m51724(bitmapCreateBitmap);
        c23207.m51728(rect2.left / this.f50391);
        c23207.m51730(0);
        c23207.m51722(rect2.top / this.f50385, 0);
        c23207.m51723(0);
        c23207.m51738(rect2.width() / this.f50391);
        c23207.m51721(rect2.height() / this.f50385);
        return c23207.m51720();
    }

    /* JADX INFO: renamed from: ֫ */
    private void m38638(C17861 c17861, boolean z, Rect rect, int[] iArr) {
        int i;
        int i2;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i3 = !z ? 1 : 0;
        int i4 = i3 * iWidth;
        while (true) {
            int i5 = 0;
            do {
                int iM40558 = 0;
                int i6 = 1;
                while (true) {
                    if (iM40558 >= i6 || i6 > 64) {
                        i = iM40558 & 3;
                        if (iM40558 >= 4) {
                            i2 = iM40558 >> 2;
                            break;
                        } else {
                            i2 = iWidth;
                            break;
                        }
                    }
                    if (c17861.m40554() < 4) {
                        i2 = 0;
                        i = -1;
                        break;
                    } else {
                        iM40558 = (iM40558 << 4) | c17861.m40558(4);
                        i6 <<= 2;
                    }
                }
                int iMin = Math.min(i2, iWidth - i5);
                if (iMin > 0) {
                    int i7 = i4 + iMin;
                    Arrays.fill(iArr, i4, i7, this.f50386[i]);
                    i5 += iMin;
                    i4 = i7;
                }
            } while (i5 < iWidth);
            i3 += 2;
            if (i3 >= iHeight) {
                return;
            }
            i4 = i3 * iWidth;
            c17861.m40559();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m38640() {
        this.f50389 = false;
        this.f50384 = null;
        this.f50388 = -1;
        this.f50390 = -1;
    }
}
