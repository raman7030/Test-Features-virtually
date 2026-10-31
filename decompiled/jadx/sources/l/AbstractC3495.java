package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X1BE */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3495 extends AbstractC7539 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public boolean f11077;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f11078;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void mo10676(C10157 c10157, int i, int i2) {
    }

    public AbstractC3495(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC3495(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // l.AbstractC7539
    /* JADX INFO: renamed from: ֫ */
    public void mo1338(AttributeSet attributeSet) {
        super.mo1338(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C21840.f69980);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f11078 = true;
                } else if (index == 13) {
                    this.f11077 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // l.AbstractC7539, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f11078 || this.f11077) && (parent = getParent()) != null && (parent instanceof C17606)) {
            C17606 c17606 = (C17606) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f23298; i++) {
                View viewById = c17606.getViewById(this.f23297[i]);
                if (viewById != null) {
                    if (this.f11078) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f11077 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
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
}
