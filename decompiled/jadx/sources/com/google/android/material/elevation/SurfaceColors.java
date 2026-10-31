package com.google.android.material.elevation;

import android.content.Context;
import com.google.android.material.color.MaterialColors;
import l.C17931;
import l.C23575;

/* JADX INFO: loaded from: classes.dex */
public enum SurfaceColors {
    SURFACE_0(C23575.f76161),
    SURFACE_1(C23575.f76376),
    SURFACE_2(C23575.f76399),
    SURFACE_3(C23575.f76329),
    SURFACE_4(C23575.f75809),
    SURFACE_5(C23575.f75762);

    public final int elevationResId;

    SurfaceColors(int i) {
        this.elevationResId = i;
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }

    public static int getColorForElevation(Context context, float f) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, C17931.f55377, 0), f);
    }
}
