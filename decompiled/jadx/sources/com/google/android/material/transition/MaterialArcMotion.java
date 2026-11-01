package com.google.android.material.transition;

import android.graphics.Path;
import android.graphics.PointF;
import p067l.AbstractC2584;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialArcMotion extends AbstractC2584 {
    @Override // p067l.AbstractC2584
    public Path getPath(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        PointF controlPoint = getControlPoint(f, f2, f3, f4);
        path.quadTo(controlPoint.x, controlPoint.y, f3, f4);
        return path;
    }

    public static PointF getControlPoint(float f, float f2, float f3, float f4) {
        if (f2 > f4) {
            return new PointF(f3, f2);
        }
        return new PointF(f, f4);
    }
}
