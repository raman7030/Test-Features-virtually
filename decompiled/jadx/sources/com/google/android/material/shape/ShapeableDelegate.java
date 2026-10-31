package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import com.google.android.material.canvas.CanvasCompat;

/* JADX INFO: loaded from: classes.dex */
public abstract class ShapeableDelegate {
    public ShapeAppearanceModel shapeAppearanceModel;
    public boolean forceCompatClippingEnabled = false;
    public boolean offsetZeroCornerEdgeBoundsEnabled = false;
    public RectF maskBounds = new RectF();
    public final Path shapePath = new Path();

    public abstract void invalidateClippingMethod(View view);

    public abstract boolean shouldUseCompatClipping();

    public static ShapeableDelegate create(View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return new ShapeableDelegateV33(view);
        }
        if (i >= 22) {
            return new ShapeableDelegateV22(view);
        }
        return new ShapeableDelegateV14();
    }

    public boolean isForceCompatClippingEnabled() {
        return this.forceCompatClippingEnabled;
    }

    public void setForceCompatClippingEnabled(View view, boolean z) {
        if (z != this.forceCompatClippingEnabled) {
            this.forceCompatClippingEnabled = z;
            invalidateClippingMethod(view);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(View view, boolean z) {
        this.offsetZeroCornerEdgeBoundsEnabled = z;
        invalidateClippingMethod(view);
    }

    public void onShapeAppearanceChanged(View view, ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    public void onMaskChanged(View view, RectF rectF) {
        this.maskBounds = rectF;
        updateShapePath();
        invalidateClippingMethod(view);
    }

    private void updateShapePath() {
        if (!isMaskBoundsValid() || this.shapeAppearanceModel == null) {
            return;
        }
        ShapeAppearancePathProvider.getInstance().calculatePath(this.shapeAppearanceModel, 1.0f, this.maskBounds, this.shapePath);
    }

    private boolean isMaskBoundsValid() {
        RectF rectF = this.maskBounds;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    public void maybeClip(Canvas canvas, CanvasCompat.CanvasOperation canvasOperation) {
        if (shouldUseCompatClipping() && !this.shapePath.isEmpty()) {
            canvas.save();
            canvas.clipPath(this.shapePath);
            canvasOperation.run(canvas);
            canvas.restore();
            return;
        }
        canvasOperation.run(canvas);
    }
}
