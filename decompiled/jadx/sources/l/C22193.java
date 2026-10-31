package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.᩹ۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5RA */
/* JADX INFO: loaded from: classes.dex */
public final class C22193 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C5800 f71986;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final View f71987;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C5800 f71989;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C5800 f71990;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f71985 = -1;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C5965 f71988 = C5965.m16700();

    public C22193(View view) {
        this.f71987 = view;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49839(AttributeSet attributeSet, int i) {
        View view = this.f71987;
        Context context = view.getContext();
        int[] iArr = C3390.f10707;
        C22733 c22733M50796 = C22733.m50796(context, attributeSet, iArr, i, 0);
        C17648.m41302(view, view.getContext(), iArr, attributeSet, c22733M50796.m50810(), i);
        try {
            if (c22733M50796.m50802(0)) {
                this.f71985 = c22733M50796.m50806(0, -1);
                ColorStateList colorStateListM16705 = this.f71988.m16705(view.getContext(), this.f71985);
                if (colorStateListM16705 != null) {
                    m49837(colorStateListM16705);
                }
            }
            if (c22733M50796.m50802(1)) {
                C17648.m41303(view, c22733M50796.m50804(1));
            }
            if (c22733M50796.m50802(2)) {
                C17648.m41304(view, C15320.m36346(c22733M50796.m50809(2, -1), null));
            }
        } finally {
            c22733M50796.m50813();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49836(int i) {
        this.f71985 = i;
        C5965 c5965 = this.f71988;
        m49837(c5965 != null ? c5965.m16705(this.f71987.getContext(), i) : null);
        m49835();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m49843() {
        this.f71985 = -1;
        m49837((ColorStateList) null);
        m49835();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m49841(ColorStateList colorStateList) {
        if (this.f71986 == null) {
            this.f71986 = new C5800();
        }
        C5800 c5800 = this.f71986;
        c5800.f17838 = colorStateList;
        c5800.f17836 = true;
        m49835();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m49840() {
        C5800 c5800 = this.f71986;
        if (c5800 != null) {
            return c5800.f17838;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49838(PorterDuff.Mode mode) {
        if (this.f71986 == null) {
            this.f71986 = new C5800();
        }
        C5800 c5800 = this.f71986;
        c5800.f17839 = mode;
        c5800.f17837 = true;
        m49835();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final PorterDuff.Mode m49842() {
        C5800 c5800 = this.f71986;
        if (c5800 != null) {
            return c5800.f17839;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49835() {
        View view = this.f71987;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : this.f71990 != null) {
                if (this.f71989 == null) {
                    this.f71989 = new C5800();
                }
                C5800 c5800 = this.f71989;
                c5800.f17838 = null;
                c5800.f17836 = false;
                c5800.f17839 = null;
                c5800.f17837 = false;
                ColorStateList colorStateListM41329 = C17648.m41329(view);
                if (colorStateListM41329 != null) {
                    c5800.f17836 = true;
                    c5800.f17838 = colorStateListM41329;
                }
                PorterDuff.Mode modeM41341 = C17648.m41341(view);
                if (modeM41341 != null) {
                    c5800.f17837 = true;
                    c5800.f17839 = modeM41341;
                }
                if (c5800.f17836 || c5800.f17837) {
                    int[] drawableState = view.getDrawableState();
                    int i2 = C5965.f18296;
                    C1566.m5351(background, c5800, drawableState);
                    return;
                }
            }
            C5800 c5801 = this.f71986;
            if (c5801 != null) {
                int[] drawableState2 = view.getDrawableState();
                int i3 = C5965.f18296;
                C1566.m5351(background, c5801, drawableState2);
            } else {
                C5800 c5802 = this.f71990;
                if (c5802 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    int i4 = C5965.f18296;
                    C1566.m5351(background, c5802, drawableState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m49837(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f71990 == null) {
                this.f71990 = new C5800();
            }
            C5800 c5800 = this.f71990;
            c5800.f17838 = colorStateList;
            c5800.f17836 = true;
        } else {
            this.f71990 = null;
        }
        m49835();
    }
}
