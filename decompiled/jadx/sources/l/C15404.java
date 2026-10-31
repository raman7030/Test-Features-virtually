package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: P67K */
/* JADX INFO: loaded from: classes4.dex */
public final class C15404 extends View {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f47170;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public LayoutInflater f47171;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f47172;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public WeakReference f47173;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public C15404(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C15404(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f47170 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3390.f10702, i, 0);
        this.f47172 = typedArrayObtainStyledAttributes.getResourceId(2, -1);
        this.f47170 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(0, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m36453(LayoutInflater layoutInflater) {
        this.f47171 = layoutInflater;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        WeakReference weakReference = this.f47173;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            m36452();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final View m36452() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            int i = this.f47170;
            if (i != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflaterFrom = this.f47171;
                if (layoutInflaterFrom == null) {
                    layoutInflaterFrom = LayoutInflater.from(getContext());
                }
                View viewInflate = layoutInflaterFrom.inflate(i, viewGroup, false);
                int i2 = this.f47172;
                if (i2 != -1) {
                    viewInflate.setId(i2);
                }
                int iIndexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
                } else {
                    viewGroup.addView(viewInflate, iIndexOfChild);
                }
                this.f47173 = new WeakReference(viewInflate);
                return viewInflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }
}
