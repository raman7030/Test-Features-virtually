package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: renamed from: l.۫ۢ */
/* JADX INFO: compiled from: C4UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C1453 {

    /* JADX INFO: renamed from: ܳ */
    public final CompoundButton f39880;

    /* JADX INFO: renamed from: ܿ */
    public boolean f39882;

    /* JADX INFO: renamed from: ֫ */
    public ColorStateList f39878 = null;

    /* JADX INFO: renamed from: ۧ */
    public PorterDuff.Mode f39879 = null;

    /* JADX INFO: renamed from: ܽ */
    public boolean f39881 = false;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f39883 = false;

    public C1453(CompoundButton compoundButton) {
        this.f39880 = compoundButton;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31928(AttributeSet attributeSet, int i) {
        int iM53139;
        int iM531310;
        CompoundButton compoundButton = this.f39880;
        Context context = compoundButton.getContext();
        int[] iArr = C1010.f13506;
        C1970 c1970M53129 = C1970.m53129(context, attributeSet, iArr, i, 0);
        C1717.m43548(compoundButton, compoundButton.getContext(), iArr, attributeSet, c1970M53129.m53143(), i);
        try {
            if (c1970M53129.m53135(1) && (iM531310 = c1970M53129.m53139(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(C22622.m50680(compoundButton.getContext(), iM531310));
                } catch (Resources.NotFoundException unused) {
                    if (c1970M53129.m53135(0)) {
                        compoundButton.setButtonDrawable(C22622.m50680(compoundButton.getContext(), iM53139));
                    }
                }
            } else if (c1970M53129.m53135(0) && (iM53139 = c1970M53129.m53139(0, 0)) != 0) {
                compoundButton.setButtonDrawable(C22622.m50680(compoundButton.getContext(), iM53139));
            }
            if (c1970M53129.m53135(2)) {
                C17881.m40685(compoundButton, c1970M53129.m53137(2));
            }
            if (c1970M53129.m53135(3)) {
                C17881.m40686(compoundButton, C1602.m38504(c1970M53129.m53142(3, -1), null));
            }
        } finally {
            c1970M53129.m53146();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31926(ColorStateList colorStateList) {
        this.f39878 = colorStateList;
        this.f39881 = true;
        m31925();
    }

    /* JADX INFO: renamed from: ۧ */
    public final ColorStateList m31929() {
        return this.f39878;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31927(PorterDuff.Mode mode) {
        this.f39879 = mode;
        this.f39883 = true;
        m31925();
    }

    /* JADX INFO: renamed from: ܽ */
    public final PorterDuff.Mode m31930() {
        return this.f39879;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m31931() {
        if (this.f39882) {
            this.f39882 = false;
        } else {
            this.f39882 = true;
            m31925();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31925() {
        CompoundButton compoundButton = this.f39880;
        Drawable drawableM40684 = C17881.m40684(compoundButton);
        if (drawableM40684 != null) {
            if (this.f39881 || this.f39883) {
                Drawable drawableMutate = C1248.m23653(drawableM40684).mutate();
                if (this.f39881) {
                    C1248.m23645(drawableMutate, this.f39878);
                }
                if (this.f39883) {
                    C1248.m23648(drawableMutate, this.f39879);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }
}
