package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import l.C17931;
import l.C7191;

/* JADX INFO: loaded from: classes.dex */
public class ElevationOverlayProvider {
    public static final float FORMULA_MULTIPLIER = 4.5f;
    public static final float FORMULA_OFFSET = 2.0f;
    public static final int OVERLAY_ACCENT_COLOR_ALPHA = (int) Math.round(5.1000000000000005d);
    public final int colorSurface;
    public final float displayDensity;
    public final int elevationOverlayAccentColor;
    public final int elevationOverlayColor;
    public final boolean elevationOverlayEnabled;

    public ElevationOverlayProvider(Context context) {
        this(MaterialAttributes.resolveBoolean(context, C17931.f55699, false), MaterialColors.getColor(context, C17931.f55665, 0), MaterialColors.getColor(context, C17931.f54947, 0), MaterialColors.getColor(context, C17931.f55377, 0), context.getResources().getDisplayMetrics().density);
    }

    public ElevationOverlayProvider(boolean z, int i, int i2, int i3, float f) {
        this.elevationOverlayEnabled = z;
        this.elevationOverlayColor = i;
        this.elevationOverlayAccentColor = i2;
        this.colorSurface = i3;
        this.displayDensity = f;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f, View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view) + f);
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f) {
        return compositeOverlayIfNeeded(this.colorSurface, f);
    }

    public int compositeOverlayIfNeeded(int i, float f, View view) {
        return compositeOverlayIfNeeded(i, getParentAbsoluteElevation(view) + f);
    }

    public int compositeOverlayIfNeeded(int i, float f) {
        return (this.elevationOverlayEnabled && isThemeSurfaceColor(i)) ? compositeOverlay(i, f) : i;
    }

    public int compositeOverlay(int i, float f, View view) {
        return compositeOverlay(i, getParentAbsoluteElevation(view) + f);
    }

    public int compositeOverlay(int i, float f) {
        int i2;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f);
        int iAlpha = Color.alpha(i);
        int iLayer = MaterialColors.layer(C7191.m19276(i, 255), this.elevationOverlayColor, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i2 = this.elevationOverlayAccentColor) != 0) {
            iLayer = MaterialColors.layer(iLayer, C7191.m19276(i2, OVERLAY_ACCENT_COLOR_ALPHA));
        }
        return C7191.m19276(iLayer, iAlpha);
    }

    public int calculateOverlayAlpha(float f) {
        return Math.round(calculateOverlayAlphaFraction(f) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f) {
        float f2 = this.displayDensity;
        if (f2 <= 0.0f || f <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.elevationOverlayEnabled;
    }

    public int getThemeElevationOverlayColor() {
        return this.elevationOverlayColor;
    }

    public int getThemeSurfaceColor() {
        return this.colorSurface;
    }

    public float getParentAbsoluteElevation(View view) {
        return ViewUtils.getParentAbsoluteElevation(view);
    }

    private boolean isThemeSurfaceColor(int i) {
        return C7191.m19276(i, 255) == this.colorSurface;
    }
}
