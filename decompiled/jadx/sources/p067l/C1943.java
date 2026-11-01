package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.᩹ۢ */
/* JADX INFO: compiled from: O5RA */
/* JADX INFO: loaded from: classes.dex */
public final class C1943 {

    /* JADX INFO: renamed from: ۧ */
    public C1130 f74707;

    /* JADX INFO: renamed from: ܳ */
    public final View f74708;

    /* JADX INFO: renamed from: ܿ */
    public C1130 f74710;

    /* JADX INFO: renamed from: ᩳ */
    public C1130 f74711;

    /* JADX INFO: renamed from: ֫ */
    public int f74706 = -1;

    /* JADX INFO: renamed from: ܽ */
    public final C1138 f74709 = C1138.m18626();

    public C1943(View view) {
        this.f74708 = view;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52166(AttributeSet attributeSet, int i) {
        View view = this.f74708;
        Context context = view.getContext();
        int[] iArr = C1010.f13514;
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, iArr, i, 0);
        C1717.m43548(view, view.getContext(), iArr, attributeSet, c1970M53129.m53143(), i);
        try {
            if (c1970M53129.m53135(0)) {
                this.f74706 = c1970M53129.m53139(0, -1);
                ColorStateList colorStateListM18631 = this.f74709.m18631(view.getContext(), this.f74706);
                if (colorStateListM18631 != null) {
                    m52164(colorStateListM18631);
                }
            }
            if (c1970M53129.m53135(1)) {
                C1717.m43549(view, c1970M53129.m53137(1));
            }
            if (c1970M53129.m53135(2)) {
                C1717.m43550(view, C1602.m38504(c1970M53129.m53142(2, -1), null));
            }
        } finally {
            c1970M53129.m53146();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52163(int i) {
        this.f74706 = i;
        C1138 c1138 = this.f74709;
        m52164(c1138 != null ? c1138.m18631(this.f74708.getContext(), i) : null);
        m52162();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m52170() {
        this.f74706 = -1;
        m52164((ColorStateList) null);
        m52162();
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m52168(ColorStateList colorStateList) {
        if (this.f74707 == null) {
            this.f74707 = new C1130();
        }
        C1130 c1130 = this.f74707;
        c1130.f20691 = colorStateList;
        c1130.f20689 = true;
        m52162();
    }

    /* JADX INFO: renamed from: ۧ */
    public final ColorStateList m52167() {
        C1130 c1130 = this.f74707;
        if (c1130 != null) {
            return c1130.f20691;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52165(PorterDuff.Mode mode) {
        if (this.f74707 == null) {
            this.f74707 = new C1130();
        }
        C1130 c1130 = this.f74707;
        c1130.f20692 = mode;
        c1130.f20690 = true;
        m52162();
    }

    /* JADX INFO: renamed from: ܽ */
    public final PorterDuff.Mode m52169() {
        C1130 c1130 = this.f74707;
        if (c1130 != null) {
            return c1130.f20692;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52162() {
        View view = this.f74708;
        Drawable background = view.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : this.f74711 != null) {
                if (this.f74710 == null) {
                    this.f74710 = new C1130();
                }
                C1130 c1130 = this.f74710;
                c1130.f20691 = null;
                c1130.f20689 = false;
                c1130.f20692 = null;
                c1130.f20690 = false;
                ColorStateList colorStateListM43575 = C1717.m43575(view);
                if (colorStateListM43575 != null) {
                    c1130.f20689 = true;
                    c1130.f20691 = colorStateListM43575;
                }
                PorterDuff.Mode modeM43587 = C1717.m43587(view);
                if (modeM43587 != null) {
                    c1130.f20690 = true;
                    c1130.f20692 = modeM43587;
                }
                if (c1130.f20689 || c1130.f20690) {
                    int[] drawableState = view.getDrawableState();
                    int i2 = C1138.f21149;
                    C0920.m7580(background, c1130, drawableState);
                    return;
                }
            }
            C1130 c1131 = this.f74707;
            if (c1131 != null) {
                int[] drawableState2 = view.getDrawableState();
                int i3 = C1138.f21149;
                C0920.m7580(background, c1131, drawableState2);
            } else {
                C1130 c1132 = this.f74711;
                if (c1132 != null) {
                    int[] drawableState3 = view.getDrawableState();
                    int i4 = C1138.f21149;
                    C0920.m7580(background, c1132, drawableState3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m52164(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f74711 == null) {
                this.f74711 = new C1130();
            }
            C1130 c1130 = this.f74711;
            c1130.f20691 = colorStateList;
            c1130.f20689 = true;
        } else {
            this.f74711 = null;
        }
        m52162();
    }
}
