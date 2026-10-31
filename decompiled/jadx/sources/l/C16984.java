package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: renamed from: l.ܿ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: I1AI */
/* JADX INFO: loaded from: classes4.dex */
public class C16984 extends AbstractC7539 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public float f52095;

    /* JADX INFO: renamed from: ۖ֫, reason: not valid java name and contains not printable characters */
    public View[] f52096;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f52097;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public float f52098;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f52099;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public float f52100;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public float f52101;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public float f52102;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f52103;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f52104;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public boolean f52105;

    /* JADX INFO: renamed from: ܺ֫, reason: not valid java name and contains not printable characters */
    public float f52106;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public float f52107;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public float f52108;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C17606 f52109;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public float f52110;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f52111;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public float f52112;

    public C16984(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52112 = Float.NaN;
        this.f52098 = Float.NaN;
        this.f52108 = Float.NaN;
        this.f52110 = 1.0f;
        this.f52101 = 1.0f;
        this.f52111 = Float.NaN;
        this.f52104 = Float.NaN;
        this.f52099 = Float.NaN;
        this.f52095 = Float.NaN;
        this.f52102 = Float.NaN;
        this.f52107 = Float.NaN;
        this.f52105 = true;
        this.f52096 = null;
        this.f52100 = 0.0f;
        this.f52106 = 0.0f;
    }

    public C16984(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52112 = Float.NaN;
        this.f52098 = Float.NaN;
        this.f52108 = Float.NaN;
        this.f52110 = 1.0f;
        this.f52101 = 1.0f;
        this.f52111 = Float.NaN;
        this.f52104 = Float.NaN;
        this.f52099 = Float.NaN;
        this.f52095 = Float.NaN;
        this.f52102 = Float.NaN;
        this.f52107 = Float.NaN;
        this.f52105 = true;
        this.f52096 = null;
        this.f52100 = 0.0f;
        this.f52106 = 0.0f;
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ֫ */
    public final void mo1338(AttributeSet attributeSet) {
        super.mo1338(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69980);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f52103 = true;
                } else if (index == 13) {
                    this.f52097 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // l.AbstractC7539, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f52109 = (C17606) getParent();
        if (this.f52103 || this.f52097) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f23298; i++) {
                View viewById = this.f52109.getViewById(this.f23297[i]);
                if (viewById != null) {
                    if (this.f52103) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f52097 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ܽ */
    public final void mo20237(C17606 c17606) {
        this.f52109 = c17606;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (Float.isNaN(this.f52108)) {
                return;
            }
            this.f52108 = rotation;
            return;
        }
        this.f52108 = rotation;
    }

    @Override // android.view.View
    public final void setRotation(float f) {
        this.f52108 = f;
        m39815();
    }

    @Override // android.view.View
    public final void setScaleX(float f) {
        this.f52110 = f;
        m39815();
    }

    @Override // android.view.View
    public final void setScaleY(float f) {
        this.f52101 = f;
        m39815();
    }

    @Override // android.view.View
    public final void setPivotX(float f) {
        this.f52112 = f;
        m39815();
    }

    @Override // android.view.View
    public final void setPivotY(float f) {
        this.f52098 = f;
        m39815();
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        this.f52100 = f;
        m39815();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        this.f52106 = f;
        m39815();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        m20228();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        m20228();
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ۧ */
    public final void mo15917() {
        m39816();
        this.f52111 = Float.NaN;
        this.f52104 = Float.NaN;
        C15094 c15094M39759 = ((C16900) getLayoutParams()).m39759();
        c15094M39759.m35770(0);
        c15094M39759.m35733(0);
        m39817();
        layout(((int) this.f52102) - getPaddingLeft(), ((int) this.f52107) - getPaddingTop(), getPaddingRight() + ((int) this.f52099), getPaddingBottom() + ((int) this.f52095));
        m39815();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m39816() {
        int i;
        if (this.f52109 == null || (i = this.f23298) == 0) {
            return;
        }
        View[] viewArr = this.f52096;
        if (viewArr == null || viewArr.length != i) {
            this.f52096 = new View[i];
        }
        for (int i2 = 0; i2 < this.f23298; i2++) {
            this.f52096[i2] = this.f52109.getViewById(this.f23297[i2]);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m39817() {
        if (this.f52109 == null) {
            return;
        }
        if (this.f52105 || Float.isNaN(this.f52111) || Float.isNaN(this.f52104)) {
            if (Float.isNaN(this.f52112) || Float.isNaN(this.f52098)) {
                View[] viewArrM20235 = m20235(this.f52109);
                int left = viewArrM20235[0].getLeft();
                int top = viewArrM20235[0].getTop();
                int right = viewArrM20235[0].getRight();
                int bottom = viewArrM20235[0].getBottom();
                for (int i = 0; i < this.f23298; i++) {
                    View view = viewArrM20235[i];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f52099 = right;
                this.f52095 = bottom;
                this.f52102 = left;
                this.f52107 = top;
                if (Float.isNaN(this.f52112)) {
                    this.f52111 = (left + right) / 2;
                } else {
                    this.f52111 = this.f52112;
                }
                if (Float.isNaN(this.f52098)) {
                    this.f52104 = (top + bottom) / 2;
                    return;
                } else {
                    this.f52104 = this.f52098;
                    return;
                }
            }
            this.f52104 = this.f52098;
            this.f52111 = this.f52112;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m39815() {
        if (this.f52109 == null) {
            return;
        }
        if (this.f52096 == null) {
            m39816();
        }
        m39817();
        double radians = Float.isNaN(this.f52108) ? 0.0d : Math.toRadians(this.f52108);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.f52110;
        float f2 = f * fCos;
        float f3 = this.f52101;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.f23298; i++) {
            View view = this.f52096[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.f52111;
            float f8 = bottom - this.f52104;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.f52100;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.f52106;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.f52101);
            view.setScaleX(this.f52110);
            if (!Float.isNaN(this.f52108)) {
                view.setRotation(this.f52108);
            }
        }
    }
}
