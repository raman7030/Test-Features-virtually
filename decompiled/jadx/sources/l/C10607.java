package l;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۤ᩺ܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4PJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10607 {

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static Typeface f31833;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f31834;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f31835;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f31836;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f31837;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Drawable f31838;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f31839;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f31840;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f31841;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f31842;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f31843;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C1539 f31844;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f31845;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f31846;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f31847;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f31848;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f31849;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Drawable f31850;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Drawable f31851;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f31852;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f31853;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f31854;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31855;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f31856;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C11041 f31857;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f31858;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f31859;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31860;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f31861;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f31862;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f31863;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f31864;

    public C10607(C6807 c6807, C11041 c11041) {
        this.f31857 = c11041;
        C1539 c1539 = new C1539(0);
        this.f31844 = c1539;
        if (f31833 == null) {
            f31833 = C4925.m14319();
        }
        c1539.setTypeface(f31833);
        c1539.setStrokeWidth(1.0f);
        float f = c6807.getContext().getResources().getDisplayMetrics().density;
        this.f31856 = f;
        this.f31852 = -579373193;
        this.f31846 = 964130679;
        this.f31861 = 8.0f * f;
        this.f31843 = 48.0f * f;
        this.f31853 = 2003199590;
        this.f31862 = f * 4.0f;
        Resources resources = c6807.getResources();
        Drawable drawableMutate = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f31851 = drawableMutate;
        Drawable drawableMutate2 = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f31850 = drawableMutate2;
        Drawable drawableMutate3 = resources.getDrawable(R.drawable.MT_Protector).mutate();
        this.f31838 = drawableMutate3;
        drawableMutate.setAlpha(210);
        drawableMutate2.setAlpha(210);
        drawableMutate3.setAlpha(230);
        int i = C21943.f70257;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
        drawableMutate.setColorFilter(porterDuffColorFilter);
        drawableMutate2.setColorFilter(porterDuffColorFilter);
        drawableMutate3.setColorFilter(porterDuffColorFilter);
        this.f31864 = i;
        this.f31863 = C21943.m49424(-1593835521, 1627389951) & i;
        if (C21943.m49431()) {
            this.f31840 = -5654586;
            this.f31836 = -1007616;
            this.f31858 = -13948117;
            this.f31859 = -13948117;
            this.f31841 = -7829368;
            this.f31834 = -13223878;
            this.f31835 = -8947849;
            this.f31849 = -10066330;
            this.f31855 = -12106427;
            return;
        }
        this.f31840 = -16777216;
        this.f31836 = -2267648;
        this.f31858 = -1;
        this.f31859 = -1248257;
        this.f31841 = -5197648;
        this.f31834 = -986896;
        this.f31835 = -6250336;
        this.f31849 = -5197648;
        this.f31855 = -1309;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m26629(int i) {
        if (this.f31839 == i) {
            return;
        }
        m26626(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26627() {
        m26628(this.f31839);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m26628(int i) {
        int i2 = this.f31837;
        C11041 c11041 = this.f31857;
        if (!(i2 == c11041.m27419() && this.f31854 == c11041.m27413()) && i > 0) {
            m26626(i);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private void m26626(int i) {
        float fMeasureText;
        this.f31839 = i;
        C11041 c11041 = this.f31857;
        int iM27419 = c11041.m27419();
        this.f31837 = iM27419;
        int iM27413 = c11041.m27413();
        this.f31854 = iM27413;
        float f = i;
        float f2 = f - (this.f31861 * 1.5f);
        float fM51496 = C23202.m51496(c11041.m27413(), 3, iM27419 + 1, 1) + 0.5f + 1.0f + iM27413;
        float f3 = f / fM51496;
        C1539 c1539 = this.f31844;
        c1539.setTextSize(f3);
        float fMeasureText2 = c1539.measureText("0");
        this.f31848 = fMeasureText2;
        if (fMeasureText2 * fM51496 > f2) {
            do {
                f3 /= 1.01f;
                c1539.setTextSize(f3);
                fMeasureText = c1539.measureText("0");
                this.f31848 = fMeasureText;
            } while (fMeasureText * fM51496 > f2);
        } else {
            while (true) {
                float f4 = f3 * 1.01f;
                c1539.setTextSize(f4);
                float fMeasureText3 = c1539.measureText("0");
                this.f31848 = fMeasureText3;
                if (fMeasureText3 * fM51496 >= f2) {
                    break;
                } else {
                    f3 = f4;
                }
            }
            c1539.setTextSize(f3);
            this.f31848 = c1539.measureText("0");
        }
        Paint.FontMetrics fontMetrics = c1539.getFontMetrics();
        float f5 = fontMetrics.descent;
        float f6 = fontMetrics.ascent;
        this.f31845 = ((int) (f5 - f6)) + 1;
        this.f31860 = Math.round(-f6);
        float f7 = this.f31848;
        this.f31842 = 0.22f * f7;
        this.f31847 = Math.round(f7 * 0.27f);
    }
}
