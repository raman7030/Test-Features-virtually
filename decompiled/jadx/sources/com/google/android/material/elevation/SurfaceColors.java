package com.google.android.material.elevation;

import android.content.Context;
import com.google.android.material.color.MaterialColors;
import p067l.C19410;
import p067l.C24774;

/* JADX INFO: loaded from: classes.dex */
public enum SurfaceColors {
    SURFACE_0(C24774.f78907),
    SURFACE_1(C24774.f79122),
    SURFACE_2(C24774.f79145),
    SURFACE_3(C24774.f79075),
    SURFACE_4(C24774.f78555),
    SURFACE_5(C24774.f78508);

    public final int elevationResId;

    SurfaceColors(int i) {
        this.elevationResId = i;
    }

    public int getColor(Context context) {
        return getColorForElevation(context, context.getResources().getDimension(this.elevationResId));
    }

    public static int getColorForElevation(Context context, float f) {
        return new ElevationOverlayProvider(context).compositeOverlay(MaterialColors.getColor(context, C19410.f58574, 0), f);
    }
}
