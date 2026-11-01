package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ܿ֡ */
/* JADX INFO: compiled from: I1AI */
/* JADX INFO: loaded from: classes4.dex */
public class C1685 extends AbstractC1216 {

    /* JADX INFO: renamed from: ֫֫ */
    public float f55275;

    /* JADX INFO: renamed from: ۖ֫ */
    public View[] f55276;

    /* JADX INFO: renamed from: ۛ */
    public boolean f55277;

    /* JADX INFO: renamed from: ۜ֫ */
    public float f55278;

    /* JADX INFO: renamed from: ۟ */
    public float f55279;

    /* JADX INFO: renamed from: ۡ֫ */
    public float f55280;

    /* JADX INFO: renamed from: ۢ֫ */
    public float f55281;

    /* JADX INFO: renamed from: ۧ֫ */
    public float f55282;

    /* JADX INFO: renamed from: ۨ */
    public boolean f55283;

    /* JADX INFO: renamed from: ܰ */
    public float f55284;

    /* JADX INFO: renamed from: ܳ֫ */
    public boolean f55285;

    /* JADX INFO: renamed from: ܺ֫ */
    public float f55286;

    /* JADX INFO: renamed from: ܽ֫ */
    public float f55287;

    /* JADX INFO: renamed from: ܿ֫ */
    public float f55288;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C1715 f55289;

    /* JADX INFO: renamed from: ᩷֫ */
    public float f55290;

    /* JADX INFO: renamed from: ᩺ */
    public float f55291;

    /* JADX INFO: renamed from: ᩻֫ */
    public float f55292;

    public C1685(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55292 = Float.NaN;
        this.f55278 = Float.NaN;
        this.f55288 = Float.NaN;
        this.f55290 = 1.0f;
        this.f55281 = 1.0f;
        this.f55291 = Float.NaN;
        this.f55284 = Float.NaN;
        this.f55279 = Float.NaN;
        this.f55275 = Float.NaN;
        this.f55282 = Float.NaN;
        this.f55287 = Float.NaN;
        this.f55285 = true;
        this.f55276 = null;
        this.f55280 = 0.0f;
        this.f55286 = 0.0f;
    }

    public C1685(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55292 = Float.NaN;
        this.f55278 = Float.NaN;
        this.f55288 = Float.NaN;
        this.f55290 = 1.0f;
        this.f55281 = 1.0f;
        this.f55291 = Float.NaN;
        this.f55284 = Float.NaN;
        this.f55279 = Float.NaN;
        this.f55275 = Float.NaN;
        this.f55282 = Float.NaN;
        this.f55287 = Float.NaN;
        this.f55285 = true;
        this.f55276 = null;
        this.f55280 = 0.0f;
        this.f55286 = 0.0f;
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public final void mo3751(AttributeSet attributeSet) {
        super.mo3751(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72689);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f55283 = true;
                } else if (index == 13) {
                    this.f55277 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p067l.AbstractC1216, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f55289 = (C1715) getParent();
        if (this.f55283 || this.f55277) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f26211; i++) {
                View viewById = this.f55289.getViewById(this.f26210[i]);
                if (viewById != null) {
                    if (this.f55283) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f55277 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ܽ */
    public final void mo22213(C1715 c1715) {
        this.f55289 = c1715;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (Float.isNaN(this.f55288)) {
                return;
            }
            this.f55288 = rotation;
            return;
        }
        this.f55288 = rotation;
    }

    @Override // android.view.View
    public final void setRotation(float f) {
        this.f55288 = f;
        m42058();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        this.f55290 = f;
        m42058();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        this.f55281 = f;
        m42058();
    }

    @Override // android.view.View
    public final void setPivotX(float f) {
        this.f55292 = f;
        m42058();
    }

    @Override // android.view.View
    public final void setPivotY(float f) {
        this.f55278 = f;
        m42058();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        this.f55280 = f;
        m42058();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.f55286 = f;
        m42058();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        m22204();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m22204();
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ۧ */
    public final void mo17838() {
        m42059();
        this.f55291 = Float.NaN;
        this.f55284 = Float.NaN;
        C1591 c1591M42000 = ((C1680) getLayoutParams()).m42000();
        c1591M42000.m37928(0);
        c1591M42000.m37891(0);
        m42060();
        layout(((int) this.f55282) - getPaddingLeft(), ((int) this.f55287) - getPaddingTop(), getPaddingRight() + ((int) this.f55279), getPaddingBottom() + ((int) this.f55275));
        m42058();
    }

    /* JADX INFO: renamed from: ܿ */
    private void m42059() {
        int i;
        if (this.f55289 == null || (i = this.f26211) == 0) {
            return;
        }
        View[] viewArr = this.f55276;
        if (viewArr == null || viewArr.length != i) {
            this.f55276 = new View[i];
        }
        for (int i2 = 0; i2 < this.f26211; i2++) {
            this.f55276[i2] = this.f55289.getViewById(this.f26210[i2]);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m42060() {
        if (this.f55289 == null) {
            return;
        }
        if (this.f55285 || Float.isNaN(this.f55291) || Float.isNaN(this.f55284)) {
            if (Float.isNaN(this.f55292) || Float.isNaN(this.f55278)) {
                View[] viewArrM22211 = m22211(this.f55289);
                int left = viewArrM22211[0].getLeft();
                int top = viewArrM22211[0].getTop();
                int right = viewArrM22211[0].getRight();
                int bottom = viewArrM22211[0].getBottom();
                for (int i = 0; i < this.f26211; i++) {
                    View view = viewArrM22211[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f55279 = right;
                this.f55275 = bottom;
                this.f55282 = left;
                this.f55287 = top;
                if (Float.isNaN(this.f55292)) {
                    this.f55291 = (left + right) / 2;
                } else {
                    this.f55291 = this.f55292;
                }
                if (Float.isNaN(this.f55278)) {
                    this.f55284 = (top + bottom) / 2;
                    return;
                } else {
                    this.f55284 = this.f55278;
                    return;
                }
            }
            this.f55284 = this.f55278;
            this.f55291 = this.f55292;
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m42058() {
        if (this.f55289 == null) {
            return;
        }
        if (this.f55276 == null) {
            m42059();
        }
        m42060();
        double radians = Float.isNaN(this.f55288) ? 0.0d : Math.toRadians(this.f55288);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f55290;
        float f2 = f * fCos;
        float f3 = this.f55281;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f26211; i++) {
            View view = this.f55276[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.f55291;
            float f8 = bottom - this.f55284;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f55280;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f55286;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f55281);
            view.setScaleX(this.f55290);
            if (!Float.isNaN(this.f55288)) {
                view.setRotation(this.f55288);
            }
        }
    }
}
