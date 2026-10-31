package l;

import android.graphics.Bitmap;
import com.alipay.sdk.m.p.a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11205 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f33626;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f33627;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f33629;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f33630;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f33631;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f33632;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f33633;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C17714 f33625 = new C17714();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f33628 = new int[256];

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m27774(C11205 c11205, C17714 c17714, int i) {
        c11205.getClass();
        if (i < 19) {
            return;
        }
        c11205.f33632 = c17714.m41464();
        c11205.f33626 = c17714.m41464();
        c17714.m41478(11);
        c11205.f33631 = c17714.m41464();
        c11205.f33630 = c17714.m41464();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static void m27775(C11205 c11205, C17714 c17714, int i) {
        int[] iArr = c11205.f33628;
        if (i % 5 != 2) {
            return;
        }
        c17714.m41478(2);
        Arrays.fill(iArr, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM41456 = c17714.m41456();
            int iM41457 = c17714.m41456();
            int iM41458 = c17714.m41456();
            int iM41459 = c17714.m41456();
            int iM414510 = c17714.m41456();
            double d = iM41457;
            double d2 = iM41458 + a.g;
            double d3 = iM41459 + a.g;
            iArr[iM41456] = (C3603.m11000((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (iM414510 << 24) | (C3603.m11000((int) ((1.402d * d2) + d), 0, 255) << 16) | C3603.m11000((int) ((d3 * 1.772d) + d), 0, 255);
        }
        c11205.f33633 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27773(C11205 c11205, C17714 c17714, int i) {
        int iM41491;
        C17714 c17715 = c11205.f33625;
        if (i < 4) {
            return;
        }
        c17714.m41478(3);
        int i2 = i - 4;
        if ((c17714.m41456() & 128) != 0) {
            if (i2 < 7 || (iM41491 = c17714.m41491()) < 4) {
                return;
            }
            c11205.f33629 = c17714.m41464();
            c11205.f33627 = c17714.m41464();
            c17715.m41481(iM41491 - 4);
            i2 = i - 11;
        }
        int iM41485 = c17715.m41485();
        int iM41483 = c17715.m41483();
        if (iM41485 >= iM41483 || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iM41483 - iM41485);
        c17714.m41461(iM41485, iMin, c17715.m41482());
        c17715.m41484(iM41485 + iMin);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C19811 m27776() {
        int iM41456;
        if (this.f33632 == 0 || this.f33626 == 0 || this.f33629 == 0 || this.f33627 == 0) {
            return null;
        }
        C17714 c17714 = this.f33625;
        if (c17714.m41483() == 0 || c17714.m41485() != c17714.m41483() || !this.f33633) {
            return null;
        }
        c17714.m41484(0);
        int i = this.f33629 * this.f33627;
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int iM41457 = c17714.m41456();
            int[] iArr2 = this.f33628;
            if (iM41457 != 0) {
                iM41456 = i2 + 1;
                iArr[i2] = iArr2[iM41457];
            } else {
                int iM41458 = c17714.m41456();
                if (iM41458 != 0) {
                    iM41456 = ((iM41458 & 64) == 0 ? iM41458 & 63 : ((iM41458 & 63) << 8) | c17714.m41456()) + i2;
                    Arrays.fill(iArr, i2, iM41456, (iM41458 & 128) == 0 ? iArr2[0] : iArr2[c17714.m41456()]);
                }
            }
            i2 = iM41456;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f33629, this.f33627, Bitmap.Config.ARGB_8888);
        C21927 c21927 = new C21927();
        c21927.m49387(bitmapCreateBitmap);
        c21927.m49391(this.f33631 / this.f33632);
        c21927.m49393(0);
        c21927.m49385(this.f33630 / this.f33626, 0);
        c21927.m49386(0);
        c21927.m49401(this.f33629 / this.f33632);
        c21927.m49384(this.f33627 / this.f33626);
        return c21927.m49383();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m27777() {
        this.f33632 = 0;
        this.f33626 = 0;
        this.f33631 = 0;
        this.f33630 = 0;
        this.f33629 = 0;
        this.f33627 = 0;
        this.f33625.m41481(0);
        this.f33633 = false;
    }
}
