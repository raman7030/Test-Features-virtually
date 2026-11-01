package com.google.android.material.bottomappbar;

import com.google.android.material.shape.EdgeTreatment;
import com.google.android.material.shape.ShapePath;
import p067l.C21740;

/* JADX INFO: loaded from: classes.dex */
public class BottomAppBarTopEdgeTreatment extends EdgeTreatment implements Cloneable {
    public static final int ANGLE_LEFT = 180;
    public static final int ANGLE_UP = 270;
    public static final int ARC_HALF = 180;
    public static final int ARC_QUARTER = 90;
    public static final float ROUNDED_CORNER_FAB_OFFSET = 1.75f;
    public float cradleVerticalOffset;
    public float fabCornerSize = -1.0f;
    public float fabDiameter;
    public float fabMargin;
    public float horizontalOffset;
    public float roundedCornerRadius;

    public BottomAppBarTopEdgeTreatment(float f, float f2, float f3) {
        this.fabMargin = f;
        this.roundedCornerRadius = f2;
        setCradleVerticalOffset(f3);
        this.horizontalOffset = 0.0f;
    }

    @Override // com.google.android.material.shape.EdgeTreatment
    public void getEdgePath(float f, float f2, float f3, ShapePath shapePath) {
        float f4;
        float f5;
        float f6 = this.fabDiameter;
        if (f6 == 0.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f7 = ((this.fabMargin * 2.0f) + f6) / 2.0f;
        float f8 = f3 * this.roundedCornerRadius;
        float f9 = f2 + this.horizontalOffset;
        float fM49018 = C21740.m49018(1.0f, f3, f7, this.cradleVerticalOffset * f3);
        if (fM49018 / f7 >= 1.0f) {
            shapePath.lineTo(f, 0.0f);
            return;
        }
        float f10 = this.fabCornerSize;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f6) < 0.1f;
        if (z) {
            f4 = 0.0f;
            f5 = fM49018;
        } else {
            f4 = 1.75f;
            f5 = 0.0f;
        }
        float f12 = f7 + f8;
        float f13 = f5 + f8;
        float fSqrt = (float) Math.sqrt((f12 * f12) - (f13 * f13));
        float f14 = f9 - fSqrt;
        float f15 = f9 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f13));
        float f16 = (90.0f - degrees) + f4;
        shapePath.lineTo(f14, 0.0f);
        float f17 = f8 * 2.0f;
        shapePath.addArc(f14 - f8, 0.0f, f14 + f8, f17, 270.0f, degrees);
        if (z) {
            shapePath.addArc(f9 - f7, (-f7) - f5, f9 + f7, f7 - f5, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f18 = this.fabMargin;
            float f19 = f11 * 2.0f;
            float f20 = f9 - f7;
            shapePath.addArc(f20, -(f11 + f18), f18 + f19 + f20, f18 + f11, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f21 = f9 + f7;
            float f22 = this.fabMargin;
            shapePath.lineTo(f21 - ((f22 / 2.0f) + f11), f22 + f11);
            float f23 = this.fabMargin;
            shapePath.addArc(f21 - (f19 + f23), -(f11 + f23), f21, f23 + f11, 90.0f, f16 - 90.0f);
        }
        shapePath.addArc(f15 - f8, 0.0f, f15 + f8, f17, 270.0f - degrees, degrees);
        shapePath.lineTo(f, 0.0f);
    }

    public float getFabDiameter() {
        return this.fabDiameter;
    }

    public void setFabDiameter(float f) {
        this.fabDiameter = f;
    }

    public void setHorizontalOffset(float f) {
        this.horizontalOffset = f;
    }

    public float getHorizontalOffset() {
        return this.horizontalOffset;
    }

    public float getCradleVerticalOffset() {
        return this.cradleVerticalOffset;
    }

    public void setCradleVerticalOffset(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.cradleVerticalOffset = f;
    }

    public float getFabCradleMargin() {
        return this.fabMargin;
    }

    public void setFabCradleMargin(float f) {
        this.fabMargin = f;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.roundedCornerRadius;
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        this.roundedCornerRadius = f;
    }

    public float getFabCornerRadius() {
        return this.fabCornerSize;
    }

    public void setFabCornerSize(float f) {
        this.fabCornerSize = f;
    }
}
