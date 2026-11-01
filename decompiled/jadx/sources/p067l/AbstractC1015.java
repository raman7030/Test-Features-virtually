package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: l.ۗ᩸ */
/* JADX INFO: compiled from: X1BE */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1015 extends AbstractC1216 {

    /* JADX INFO: renamed from: ۛ */
    public boolean f13882;

    /* JADX INFO: renamed from: ۨ */
    public boolean f13883;

    /* JADX INFO: renamed from: ֫ */
    public void mo12671(C1346 c1346, int i, int i2) {
    }

    public AbstractC1015(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AbstractC1015(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p067l.AbstractC1216
    /* JADX INFO: renamed from: ֫ */
    public void mo3751(AttributeSet attributeSet) {
        super.mo3751(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1925.f72689);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f13883 = true;
                } else if (index == 13) {
                    this.f13882 = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p067l.AbstractC1216, android.view.View
    public final void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f13883 || this.f13882) && (parent = getParent()) != null && (parent instanceof C1715)) {
            C1715 c1715 = (C1715) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f26211; i++) {
                View viewById = c1715.getViewById(this.f26210[i]);
                if (viewById != null) {
                    if (this.f13883) {
                        viewById.setVisibility(visibility);
                    }
                    if (this.f13882 && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
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
}
