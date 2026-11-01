package p067l;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4PJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12450 {

    /* JADX INFO: renamed from: ᩺ */
    public static Typeface f34804;

    /* JADX INFO: renamed from: ֡ */
    public int f34805;

    /* JADX INFO: renamed from: ֨ */
    public int f34806;

    /* JADX INFO: renamed from: ֫ */
    public int f34807;

    /* JADX INFO: renamed from: ۖ */
    public int f34808;

    /* JADX INFO: renamed from: ۗ */
    public final Drawable f34809;

    /* JADX INFO: renamed from: ۘ */
    public int f34810;

    /* JADX INFO: renamed from: ۙ */
    public int f34811;

    /* JADX INFO: renamed from: ۚ */
    public int f34812;

    /* JADX INFO: renamed from: ۛ */
    public float f34813;

    /* JADX INFO: renamed from: ۜ */
    public float f34814;

    /* JADX INFO: renamed from: ۠ */
    public C3831 f34815;

    /* JADX INFO: renamed from: ۡ */
    public int f34816;

    /* JADX INFO: renamed from: ۢ */
    public int f34817;

    /* JADX INFO: renamed from: ۤ */
    public int f34818;

    /* JADX INFO: renamed from: ۧ */
    public float f34819;

    /* JADX INFO: renamed from: ۨ */
    public int f34820;

    /* JADX INFO: renamed from: ۫ */
    public final Drawable f34821;

    /* JADX INFO: renamed from: ۬ */
    public final Drawable f34822;

    /* JADX INFO: renamed from: ܳ */
    public int f34823;

    /* JADX INFO: renamed from: ܶ */
    public int f34824;

    /* JADX INFO: renamed from: ܺ */
    public int f34825;

    /* JADX INFO: renamed from: ܽ */
    public int f34826;

    /* JADX INFO: renamed from: ܿ */
    public float f34827;

    /* JADX INFO: renamed from: ᩳ */
    public final C12862 f34828;

    /* JADX INFO: renamed from: ᩴ */
    public int f34829;

    /* JADX INFO: renamed from: ᩵ */
    public int f34830;

    /* JADX INFO: renamed from: ᩶ */
    public int f34831;

    /* JADX INFO: renamed from: ᩷ */
    public float f34832;

    /* JADX INFO: renamed from: ᩸ */
    public float f34833;

    /* JADX INFO: renamed from: ᩹ */
    public int f34834;

    /* JADX INFO: renamed from: ᩻ */
    public int f34835;

    public C12450(C8838 c8838, C12862 c12862) {
        this.f34828 = c12862;
        C3831 c3831 = new C3831(0);
        this.f34815 = c3831;
        if (f34804 == null) {
            f34804 = C7050.m16216();
        }
        c3831.setTypeface(f34804);
        c3831.setStrokeWidth(1.0f);
        float f = c8838.getContext().getResources().getDisplayMetrics().density;
        this.f34827 = f;
        this.f34823 = -579373193;
        this.f34817 = 964130679;
        this.f34832 = 8.0f * f;
        this.f34814 = 48.0f * f;
        this.f34824 = 2003199590;
        this.f34833 = f * 4.0f;
        Resources resources = c8838.getResources();
        Drawable drawableMutate = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f34822 = drawableMutate;
        Drawable drawableMutate2 = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f34821 = drawableMutate2;
        Drawable drawableMutate3 = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f34809 = drawableMutate3;
        drawableMutate.setAlpha(210);
        drawableMutate2.setAlpha(210);
        drawableMutate3.setAlpha(230);
        int i = C23223.f72969;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        drawableMutate.setColorFilter(porterDuffColorFilter);
        drawableMutate2.setColorFilter(porterDuffColorFilter);
        drawableMutate3.setColorFilter(porterDuffColorFilter);
        this.f34835 = i;
        this.f34834 = C23223.m51761(-1593835521, 1627389951) & i;
        if (C23223.m51768()) {
            this.f34811 = -5654586;
            this.f34807 = -1007616;
            this.f34829 = -13948117;
            this.f34830 = -13948117;
            this.f34812 = -7829368;
            this.f34805 = -13223878;
            this.f34806 = -8947849;
            this.f34820 = -10066330;
            this.f34826 = -12106427;
            return;
        }
        this.f34811 = -16777216;
        this.f34807 = -2267648;
        this.f34829 = -1;
        this.f34830 = -1248257;
        this.f34812 = -5197648;
        this.f34805 = -986896;
        this.f34806 = -6250336;
        this.f34820 = -5197648;
        this.f34826 = -1309;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m28668(int i) {
        if (this.f34810 == i) {
            return;
        }
        m28665(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28666() {
        m28667(this.f34810);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m28667(int i) {
        int i2 = this.f34808;
        C12862 c12862 = this.f34828;
        if (!(i2 == c12862.m29481() && this.f34825 == c12862.m29475()) && i > 0) {
            m28665(i);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    private void m28665(int i) {
        float fMeasureText;
        this.f34810 = i;
        C12862 c12862 = this.f34828;
        int iM29481 = c12862.m29481();
        this.f34808 = iM29481;
        int iM29475 = c12862.m29475();
        this.f34825 = iM29475;
        float f = i;
        float f2 = f - (this.f34832 * 1.5f);
        float fM53892 = C24420.m53892(c12862.m29475(), 3, iM29481 + 1, 1) + 0.5f + 1.0f + iM29475;
        float f3 = f / fM53892;
        C3831 c3831 = this.f34815;
        c3831.setTextSize(f3);
        float fMeasureText2 = c3831.measureText("0");
        this.f34819 = fMeasureText2;
        if (fMeasureText2 * fM53892 > f2) {
            do {
                f3 /= 1.01f;
                c3831.setTextSize(f3);
                fMeasureText = c3831.measureText("0");
                this.f34819 = fMeasureText;
            } while (fMeasureText * fM53892 > f2);
        } else {
            while (true) {
                float f4 = f3 * 1.01f;
                c3831.setTextSize(f4);
                float fMeasureText3 = c3831.measureText("0");
                this.f34819 = fMeasureText3;
                if (fMeasureText3 * fM53892 >= f2) {
                    break;
                } else {
                    f3 = f4;
                }
            }
            c3831.setTextSize(f3);
            this.f34819 = c3831.measureText("0");
        }
        Paint.FontMetrics fontMetrics = c3831.getFontMetrics();
        float f5 = fontMetrics.descent;
        float f6 = fontMetrics.ascent;
        this.f34816 = ((int) (f5 - f6)) + 1;
        this.f34831 = Math.round(-f6);
        float f7 = this.f34819;
        this.f34813 = 0.22f * f7;
        this.f34818 = Math.round(f7 * 0.27f);
    }
}
