package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܽۡ */
/* JADX INFO: compiled from: J4YO */
/* JADX INFO: loaded from: classes4.dex */
public final class C1662 {

    /* JADX INFO: renamed from: ֫ */
    public C1130 f53978;

    /* JADX INFO: renamed from: ۧ */
    public int f53979 = 0;

    /* JADX INFO: renamed from: ܽ */
    public C1130 f53980;

    /* JADX INFO: renamed from: ᩳ */
    public final ImageView f53981;

    public C1662(ImageView imageView) {
        this.f53981 = imageView;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41125(AttributeSet attributeSet, int i) {
        int iM53139;
        ImageView imageView = this.f53981;
        Context context = imageView.getContext();
        int[] iArr = C1010.f13530;
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, iArr, i, 0);
        C1717.m43548(imageView, imageView.getContext(), iArr, attributeSet, c1970M53129.m53143(), i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (iM53139 = c1970M53129.m53139(1, -1)) != -1 && (drawable = C22622.m50680(imageView.getContext(), iM53139)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C1602.m38505(drawable);
            }
            if (c1970M53129.m53135(2)) {
                C21906.m49448(imageView, c1970M53129.m53137(2));
            }
            if (c1970M53129.m53135(3)) {
                C21906.m49449(imageView, C1602.m38504(c1970M53129.m53142(3, -1), null));
            }
        } finally {
            c1970M53129.m53146();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41121(int i) {
        ImageView imageView = this.f53981;
        if (i != 0) {
            Drawable drawableM50680 = C22622.m50680(imageView.getContext(), i);
            if (drawableM50680 != null) {
                C1602.m38505(drawableM50680);
            }
            imageView.setImageDrawable(drawableM50680);
        } else {
            imageView.setImageDrawable(null);
        }
        m41126();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m41128() {
        return !(this.f53981.getBackground() instanceof RippleDrawable);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41122(ColorStateList colorStateList) {
        if (this.f53978 == null) {
            this.f53978 = new C1130();
        }
        C1130 c1130 = this.f53978;
        c1130.f20691 = colorStateList;
        c1130.f20689 = true;
        m41126();
    }

    /* JADX INFO: renamed from: ܽ */
    public final ColorStateList m41127() {
        C1130 c1130 = this.f53978;
        if (c1130 != null) {
            return c1130.f20691;
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41123(PorterDuff.Mode mode) {
        if (this.f53978 == null) {
            this.f53978 = new C1130();
        }
        C1130 c1130 = this.f53978;
        c1130.f20692 = mode;
        c1130.f20690 = true;
        m41126();
    }

    /* JADX INFO: renamed from: ᩳ */
    public final PorterDuff.Mode m41129() {
        C1130 c1130 = this.f53978;
        if (c1130 != null) {
            return c1130.f20692;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m41126() {
        ImageView imageView = this.f53981;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            C1602.m38505(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (this.f53980 == null) {
                    this.f53980 = new C1130();
                }
                C1130 c1130 = this.f53980;
                c1130.f20691 = null;
                c1130.f20689 = false;
                c1130.f20692 = null;
                c1130.f20690 = false;
                ColorStateList colorStateListM49447 = C21906.m49447(imageView);
                if (colorStateListM49447 != null) {
                    c1130.f20689 = true;
                    c1130.f20691 = colorStateListM49447;
                }
                PorterDuff.Mode modeM49450 = C21906.m49450(imageView);
                if (modeM49450 != null) {
                    c1130.f20690 = true;
                    c1130.f20692 = modeM49450;
                }
                if (c1130.f20689 || c1130.f20690) {
                    int[] drawableState = imageView.getDrawableState();
                    int i2 = C1138.f21149;
                    C0920.m7580(drawable, c1130, drawableState);
                    return;
                }
            }
            C1130 c1131 = this.f53978;
            if (c1131 != null) {
                int[] drawableState2 = imageView.getDrawableState();
                int i3 = C1138.f21149;
                C0920.m7580(drawable, c1131, drawableState2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41124(Drawable drawable) {
        this.f53979 = drawable.getLevel();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m41120() {
        ImageView imageView = this.f53981;
        if (imageView.getDrawable() != null) {
            imageView.getDrawable().setLevel(this.f53979);
        }
    }
}
