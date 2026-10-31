package com.google.android.material.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import l.C0734;
import l.C0881;
import l.C14402;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ShadowDrawableWrapper extends C0734 {
    public static final double COS_45 = Math.cos(Math.toRadians(45.0d));
    public static final float SHADOW_BOTTOM_SCALE = 1.0f;
    public static final float SHADOW_HORIZ_SCALE = 0.5f;
    public static final float SHADOW_MULTIPLIER = 1.5f;
    public static final float SHADOW_TOP_SCALE = 0.25f;
    public boolean addPaddingForCorners;
    public final RectF contentBounds;
    public float cornerRadius;
    public final Paint cornerShadowPaint;
    public Path cornerShadowPath;
    public boolean dirty;
    public final Paint edgeShadowPaint;
    public float maxShadowSize;
    public boolean printedShadowClipWarning;
    public float rawMaxShadowSize;
    public float rawShadowSize;
    public float rotation;
    public final int shadowEndColor;
    public final int shadowMiddleColor;
    public float shadowSize;
    public final int shadowStartColor;

    @Override // l.C0734, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public ShadowDrawableWrapper(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.dirty = true;
        this.addPaddingForCorners = true;
        this.printedShadowClipWarning = false;
        this.shadowStartColor = C0881.m3228(context, C14402.f43674);
        this.shadowMiddleColor = C0881.m3228(context, C14402.f43697);
        this.shadowEndColor = C0881.m3228(context, C14402.f44060);
        Paint paint = new Paint(5);
        this.cornerShadowPaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.cornerRadius = Math.round(f);
        this.contentBounds = new RectF();
        Paint paint2 = new Paint(paint);
        this.edgeShadowPaint = paint2;
        paint2.setAntiAlias(false);
        setShadowSize(f2, f3);
    }

    public static int toEven(float f) {
        int iRound = Math.round(f);
        return iRound % 2 == 1 ? iRound - 1 : iRound;
    }

    public void setAddPaddingForCorners(boolean z) {
        this.addPaddingForCorners = z;
        invalidateSelf();
    }

    @Override // l.C0734, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        super.setAlpha(i);
        this.cornerShadowPaint.setAlpha(i);
        this.edgeShadowPaint.setAlpha(i);
    }

    @Override // l.C0734, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.dirty = true;
    }

    public void setShadowSize(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float even = toEven(f);
        float even2 = toEven(f2);
        if (even > even2) {
            if (!this.printedShadowClipWarning) {
                this.printedShadowClipWarning = true;
            }
            even = even2;
        }
        if (this.rawShadowSize == even && this.rawMaxShadowSize == even2) {
            return;
        }
        this.rawShadowSize = even;
        this.rawMaxShadowSize = even2;
        this.shadowSize = Math.round(even * 1.5f);
        this.maxShadowSize = even2;
        this.dirty = true;
        invalidateSelf();
    }

    public void setShadowSize(float f) {
        setShadowSize(f, this.rawMaxShadowSize);
    }

    public float getShadowSize() {
        return this.rawShadowSize;
    }

    @Override // l.C0734, android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(calculateVerticalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        int iCeil2 = (int) Math.ceil(calculateHorizontalPadding(this.rawMaxShadowSize, this.cornerRadius, this.addPaddingForCorners));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    public static float calculateVerticalPadding(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - COS_45) * ((double) f2)) + ((double) (f * 1.5f)));
    }

    public static float calculateHorizontalPadding(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - COS_45) * ((double) f2)) + ((double) f));
    }

    public void setCornerRadius(float f) {
        float fRound = Math.round(f);
        if (this.cornerRadius == fRound) {
            return;
        }
        this.cornerRadius = fRound;
        this.dirty = true;
        invalidateSelf();
    }

    @Override // l.C0734, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.dirty) {
            buildComponents(getBounds());
            this.dirty = false;
        }
        drawShadow(canvas);
        super.draw(canvas);
    }

    public final void setRotation(float f) {
        if (this.rotation != f) {
            this.rotation = f;
            invalidateSelf();
        }
    }

    private void drawShadow(Canvas canvas) {
        float f;
        int iSave = canvas.save();
        canvas.rotate(this.rotation, this.contentBounds.centerX(), this.contentBounds.centerY());
        float f2 = this.cornerRadius;
        float f3 = (-f2) - this.shadowSize;
        float f4 = f2 * 2.0f;
        boolean z = this.contentBounds.width() - f4 > 0.0f;
        boolean z2 = this.contentBounds.height() - f4 > 0.0f;
        float f5 = this.rawShadowSize;
        float f6 = f2 / ((f5 - (0.5f * f5)) + f2);
        float f7 = f2 / ((f5 - (0.25f * f5)) + f2);
        float f8 = f2 / ((f5 - (f5 * 1.0f)) + f2);
        int iSave2 = canvas.save();
        RectF rectF = this.contentBounds;
        canvas.translate(rectF.left + f2, rectF.top + f2);
        canvas.scale(f6, f7);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z) {
            canvas.scale(1.0f / f6, 1.0f);
            f = 1.0f;
            canvas.drawRect(0.0f, f3, this.contentBounds.width() - f4, -this.cornerRadius, this.edgeShadowPaint);
        } else {
            f = 1.0f;
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF2 = this.contentBounds;
        canvas.translate(rectF2.right - f2, rectF2.bottom - f2);
        canvas.scale(f6, f8);
        canvas.rotate(180.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z) {
            canvas.scale(f / f6, 1.0f);
            canvas.drawRect(0.0f, f3, this.contentBounds.width() - f4, this.shadowSize + (-this.cornerRadius), this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF3 = this.contentBounds;
        canvas.translate(rectF3.left + f2, rectF3.bottom - f2);
        canvas.scale(f6, f8);
        canvas.rotate(270.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z2) {
            canvas.scale(1.0f / f8, 1.0f);
            canvas.drawRect(0.0f, f3, this.contentBounds.height() - f4, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave4);
        int iSave5 = canvas.save();
        RectF rectF4 = this.contentBounds;
        canvas.translate(rectF4.right - f2, rectF4.top + f2);
        canvas.scale(f6, f7);
        canvas.rotate(90.0f);
        canvas.drawPath(this.cornerShadowPath, this.cornerShadowPaint);
        if (z2) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f3, this.contentBounds.height() - f4, -this.cornerRadius, this.edgeShadowPaint);
        }
        canvas.restoreToCount(iSave5);
        canvas.restoreToCount(iSave);
    }

    private void buildShadowCorners() {
        float f = this.cornerRadius;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.shadowSize;
        rectF2.inset(-f2, -f2);
        Path path = this.cornerShadowPath;
        if (path == null) {
            this.cornerShadowPath = new Path();
        } else {
            path.reset();
        }
        this.cornerShadowPath.setFillType(Path.FillType.EVEN_ODD);
        this.cornerShadowPath.moveTo(-this.cornerRadius, 0.0f);
        this.cornerShadowPath.rLineTo(-this.shadowSize, 0.0f);
        this.cornerShadowPath.arcTo(rectF2, 180.0f, 90.0f, false);
        this.cornerShadowPath.arcTo(rectF, 270.0f, -90.0f, false);
        this.cornerShadowPath.close();
        float f3 = -rectF2.top;
        if (f3 > 0.0f) {
            float f4 = this.cornerRadius / f3;
            this.cornerShadowPaint.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, f4, ((1.0f - f4) / 2.0f) + f4, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.edgeShadowPaint.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.shadowStartColor, this.shadowMiddleColor, this.shadowEndColor}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.edgeShadowPaint.setAntiAlias(false);
    }

    private void buildComponents(Rect rect) {
        float f = this.rawMaxShadowSize;
        float f2 = 1.5f * f;
        this.contentBounds.set(rect.left + f, rect.top + f2, rect.right - f, rect.bottom - f2);
        Drawable drawable = getDrawable();
        RectF rectF = this.contentBounds;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        buildShadowCorners();
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void setMaxShadowSize(float f) {
        setShadowSize(this.rawShadowSize, f);
    }

    public float getMaxShadowSize() {
        return this.rawMaxShadowSize;
    }

    public float getMinWidth() {
        float f = this.rawMaxShadowSize;
        return (this.rawMaxShadowSize * 2.0f) + (Math.max(f, (f / 2.0f) + this.cornerRadius) * 2.0f);
    }

    public float getMinHeight() {
        float f = this.rawMaxShadowSize;
        return (this.rawMaxShadowSize * 1.5f * 2.0f) + (Math.max(f, ((f * 1.5f) / 2.0f) + this.cornerRadius) * 2.0f);
    }
}
