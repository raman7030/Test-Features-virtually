package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܺۤۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5ZZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15873 extends ImageView {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f49050;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public Animation.AnimationListener f49051;

    public C15873(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(C8819.f26882);
        this.f49050 = typedArrayObtainStyledAttributes.getColor(0, -328966);
        typedArrayObtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C17648.m41301(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(this.f49050);
        setBackground(shapeDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m37618(Animation.AnimationListener animationListener) {
        this.f49051 = animationListener;
    }

    @Override // android.view.View
    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f49051;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.view.View
    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f49051;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f49050 = i;
        }
    }
}
