package p067l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۢۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 75EB */
/* JADX INFO: loaded from: classes3.dex */
public class C11261 extends C1732 implements InterfaceC21990 {

    /* JADX INFO: renamed from: ᩸ */
    public ViewOnTouchListenerC19978 f31359;

    /* JADX INFO: renamed from: ᩹ */
    public ImageView.ScaleType f31360;

    public C11261(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C11261(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f31359;
        if (viewOnTouchListenerC19978 == null || viewOnTouchListenerC19978.m45351() == null) {
            this.f31359 = new ViewOnTouchListenerC19978(this);
        }
        ImageView.ScaleType scaleType = this.f31360;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f31360 = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f31359;
        if (viewOnTouchListenerC19978 == null || viewOnTouchListenerC19978.m45351() == null) {
            this.f31359 = new ViewOnTouchListenerC19978(this);
        }
        ImageView.ScaleType scaleType = this.f31360;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f31360 = null;
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView
    public final ImageView.ScaleType getScaleType() {
        return this.f31359.m45344();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26178(float f, float f2) {
        this.f31359.m45349(f, f2);
    }

    @Override // p067l.C1732, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f31359;
        if (viewOnTouchListenerC19978 != null) {
            viewOnTouchListenerC19978.m45352();
        }
    }

    @Override // p067l.C1732, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f31359;
        if (viewOnTouchListenerC19978 != null) {
            viewOnTouchListenerC19978.m45352();
        }
    }

    @Override // p067l.C1732, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f31359;
        if (viewOnTouchListenerC19978 != null) {
            viewOnTouchListenerC19978.m45352();
        }
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f31359.m45342(onLongClickListener);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m26177(float f) {
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f31359;
        ImageView imageViewM45351 = viewOnTouchListenerC19978.m45351();
        if (imageViewM45351 != null) {
            viewOnTouchListenerC19978.m45341(f, imageViewM45351.getRight() / 2.0f, imageViewM45351.getBottom() / 2.0f, false);
        }
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC19978 viewOnTouchListenerC19978 = this.f31359;
        if (viewOnTouchListenerC19978 != null) {
            viewOnTouchListenerC19978.m45343(scaleType);
        } else {
            this.f31360 = scaleType;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f31359.m45338();
        super.onDetachedFromWindow();
    }
}
