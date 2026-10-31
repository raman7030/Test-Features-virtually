package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ۢۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 75EB */
/* JADX INFO: loaded from: classes3.dex */
public class C9357 extends C17939 implements InterfaceC20646 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC18529 f28410;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ImageView.ScaleType f28411;

    public C9357(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C9357(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f28410;
        if (viewOnTouchListenerC18529 == null || viewOnTouchListenerC18529.m43073() == null) {
            this.f28410 = new ViewOnTouchListenerC18529(this);
        }
        ImageView.ScaleType scaleType = this.f28411;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f28411 = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f28410;
        if (viewOnTouchListenerC18529 == null || viewOnTouchListenerC18529.m43073() == null) {
            this.f28410 = new ViewOnTouchListenerC18529(this);
        }
        ImageView.ScaleType scaleType = this.f28411;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.f28411 = null;
        }
        super.onAttachedToWindow();
    }

    @Override // android.widget.ImageView
    public final ImageView.ScaleType getScaleType() {
        return this.f28410.m43066();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24168(float f, float f2) {
        this.f28410.m43071(f, f2);
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f28410;
        if (viewOnTouchListenerC18529 != null) {
            viewOnTouchListenerC18529.m43074();
        }
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f28410;
        if (viewOnTouchListenerC18529 != null) {
            viewOnTouchListenerC18529.m43074();
        }
    }

    @Override // l.C17939, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f28410;
        if (viewOnTouchListenerC18529 != null) {
            viewOnTouchListenerC18529.m43074();
        }
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f28410.m43064(onLongClickListener);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m24167(float f) {
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f28410;
        ImageView imageViewM43073 = viewOnTouchListenerC18529.m43073();
        if (imageViewM43073 != null) {
            viewOnTouchListenerC18529.m43063(f, imageViewM43073.getRight() / 2.0f, imageViewM43073.getBottom() / 2.0f, false);
        }
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC18529 viewOnTouchListenerC18529 = this.f28410;
        if (viewOnTouchListenerC18529 != null) {
            viewOnTouchListenerC18529.m43065(scaleType);
        } else {
            this.f28411 = scaleType;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f28410.m43060();
        super.onDetachedFromWindow();
    }
}
