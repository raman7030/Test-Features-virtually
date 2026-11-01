package p067l;

import android.graphics.Bitmap;
import com.alipay.sdk.p010m.p041p.C0184a;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧ᩵ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13018 {

    /* JADX INFO: renamed from: ۜ */
    public int f36625;

    /* JADX INFO: renamed from: ۧ */
    public int f36626;

    /* JADX INFO: renamed from: ܽ */
    public int f36628;

    /* JADX INFO: renamed from: ܿ */
    public int f36629;

    /* JADX INFO: renamed from: ᩳ */
    public int f36630;

    /* JADX INFO: renamed from: ᩷ */
    public int f36631;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f36632;

    /* JADX INFO: renamed from: ֫ */
    public final C19203 f36624 = new C19203();

    /* JADX INFO: renamed from: ܳ */
    public final int[] f36627 = new int[256];

    /* JADX INFO: renamed from: ۧ */
    public static void m29836(C13018 c13018, C19203 c19203, int i) {
        c13018.getClass();
        if (i < 19) {
            return;
        }
        c13018.f36631 = c19203.m43710();
        c13018.f36625 = c19203.m43710();
        c19203.m43724(11);
        c13018.f36630 = c19203.m43710();
        c13018.f36629 = c19203.m43710();
    }

    /* JADX INFO: renamed from: ܽ */
    public static void m29837(C13018 c13018, C19203 c19203, int i) {
        int[] iArr = c13018.f36627;
        if (i % 5 != 2) {
            return;
        }
        c19203.m43724(2);
        Arrays.fill(iArr, 0);
        int i2 = i / 5;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM43702 = c19203.m43702();
            int iM43703 = c19203.m43702();
            int iM43704 = c19203.m43702();
            int iM43705 = c19203.m43702();
            int iM43706 = c19203.m43702();
            double d = iM43703;
            double d2 = iM43704 + C0184a.f879g;
            double d3 = iM43705 + C0184a.f879g;
            iArr[iM43702] = (C5792.m12976((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | (iM43706 << 24) | (C5792.m12976((int) ((1.402d * d2) + d), 0, 255) << 16) | C5792.m12976((int) ((d3 * 1.772d) + d), 0, 255);
        }
        c13018.f36632 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29835(C13018 c13018, C19203 c19203, int i) {
        int iM43737;
        C19203 c19204 = c13018.f36624;
        if (i < 4) {
            return;
        }
        c19203.m43724(3);
        int i2 = i - 4;
        if ((c19203.m43702() & 128) != 0) {
            if (i2 < 7 || (iM43737 = c19203.m43737()) < 4) {
                return;
            }
            c13018.f36628 = c19203.m43710();
            c13018.f36626 = c19203.m43710();
            c19204.m43727(iM43737 - 4);
            i2 = i - 11;
        }
        int iM43731 = c19204.m43731();
        int iM43729 = c19204.m43729();
        if (iM43731 >= iM43729 || i2 <= 0) {
            return;
        }
        int iMin = Math.min(i2, iM43729 - iM43731);
        c19203.m43707(iM43731, iMin, c19204.m43728());
        c19204.m43730(iM43731 + iMin);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C21196 m29838() {
        int iM43702;
        if (this.f36631 == 0 || this.f36625 == 0 || this.f36628 == 0 || this.f36626 == 0) {
            return null;
        }
        C19203 c19203 = this.f36624;
        if (c19203.m43729() == 0 || c19203.m43731() != c19203.m43729() || !this.f36632) {
            return null;
        }
        c19203.m43730(0);
        int i = this.f36628 * this.f36626;
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int iM43703 = c19203.m43702();
            int[] iArr2 = this.f36627;
            if (iM43703 != 0) {
                iM43702 = i2 + 1;
                iArr[i2] = iArr2[iM43703];
            } else {
                int iM43704 = c19203.m43702();
                if (iM43704 != 0) {
                    iM43702 = ((iM43704 & 64) == 0 ? iM43704 & 63 : ((iM43704 & 63) << 8) | c19203.m43702()) + i2;
                    Arrays.fill(iArr, i2, iM43702, (iM43704 & 128) == 0 ? iArr2[0] : iArr2[c19203.m43702()]);
                }
            }
            i2 = iM43702;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.f36628, this.f36626, Bitmap.Config.ARGB_8888);
        C23207 c23207 = new C23207();
        c23207.m51724(bitmapCreateBitmap);
        c23207.m51728(this.f36630 / this.f36631);
        c23207.m51730(0);
        c23207.m51722(this.f36629 / this.f36625, 0);
        c23207.m51723(0);
        c23207.m51738(this.f36628 / this.f36631);
        c23207.m51721(this.f36626 / this.f36625);
        return c23207.m51720();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m29839() {
        this.f36631 = 0;
        this.f36625 = 0;
        this.f36630 = 0;
        this.f36629 = 0;
        this.f36628 = 0;
        this.f36626 = 0;
        this.f36624.m43727(0);
        this.f36632 = false;
    }
}
