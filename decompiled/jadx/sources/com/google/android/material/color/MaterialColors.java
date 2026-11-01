package com.google.android.material.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import com.google.android.material.color.utilities.Blend;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.resources.MaterialAttributes;
import p067l.C0886;
import p067l.C1199;
import p067l.C19410;

/* JADX INFO: loaded from: classes.dex */
public class MaterialColors {
    public static final float ALPHA_DISABLED = 0.38f;
    public static final float ALPHA_DISABLED_LOW = 0.12f;
    public static final float ALPHA_FULL = 1.0f;
    public static final float ALPHA_LOW = 0.32f;
    public static final float ALPHA_MEDIUM = 0.54f;
    public static final int CHROMA_NEUTRAL = 6;
    public static final int TONE_ACCENT_CONTAINER_DARK = 30;
    public static final int TONE_ACCENT_CONTAINER_LIGHT = 90;
    public static final int TONE_ACCENT_DARK = 80;
    public static final int TONE_ACCENT_LIGHT = 40;
    public static final int TONE_ON_ACCENT_CONTAINER_DARK = 90;
    public static final int TONE_ON_ACCENT_CONTAINER_LIGHT = 10;
    public static final int TONE_ON_ACCENT_DARK = 20;
    public static final int TONE_ON_ACCENT_LIGHT = 100;
    public static final int TONE_SURFACE_CONTAINER_DARK = 12;
    public static final int TONE_SURFACE_CONTAINER_HIGH_DARK = 17;
    public static final int TONE_SURFACE_CONTAINER_HIGH_LIGHT = 92;
    public static final int TONE_SURFACE_CONTAINER_LIGHT = 94;

    public static int getColor(View view, int i) {
        return resolveColor(view.getContext(), MaterialAttributes.resolveTypedValueOrThrow(view, i));
    }

    public static int getColor(Context context, int i, String str) {
        return resolveColor(context, MaterialAttributes.resolveTypedValueOrThrow(context, i, str));
    }

    public static int getColor(View view, int i, int i2) {
        return getColor(view.getContext(), i, i2);
    }

    public static int getColor(Context context, int i, int i2) {
        Integer colorOrNull = getColorOrNull(context, i);
        return colorOrNull != null ? colorOrNull.intValue() : i2;
    }

    public static Integer getColorOrNull(Context context, int i) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        if (typedValueResolve != null) {
            return Integer.valueOf(resolveColor(context, typedValueResolve));
        }
        return null;
    }

    public static ColorStateList getColorStateList(Context context, int i, ColorStateList colorStateList) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        ColorStateList colorStateListResolveColorStateList = typedValueResolve != null ? resolveColorStateList(context, typedValueResolve) : null;
        return colorStateListResolveColorStateList == null ? colorStateList : colorStateListResolveColorStateList;
    }

    public static ColorStateList getColorStateListOrNull(Context context, int i) {
        TypedValue typedValueResolve = MaterialAttributes.resolve(context, i);
        if (typedValueResolve == null) {
            return null;
        }
        int i2 = typedValueResolve.resourceId;
        if (i2 != 0) {
            return C0886.m5547(context, i2);
        }
        int i3 = typedValueResolve.data;
        if (i3 != 0) {
            return ColorStateList.valueOf(i3);
        }
        return null;
    }

    public static int resolveColor(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        if (i != 0) {
            return C0886.m5542(context, i);
        }
        return typedValue.data;
    }

    public static ColorStateList resolveColorStateList(Context context, TypedValue typedValue) {
        int i = typedValue.resourceId;
        if (i != 0) {
            return C0886.m5547(context, i);
        }
        return ColorStateList.valueOf(typedValue.data);
    }

    public static int layer(View view, int i, int i2) {
        return layer(view, i, i2, 1.0f);
    }

    public static int layer(View view, int i, int i2, float f) {
        return layer(getColor(view, i), getColor(view, i2), f);
    }

    public static int layer(int i, int i2, float f) {
        return layer(i, C1199.m21223(i2, Math.round(Color.alpha(i2) * f)));
    }

    public static int layer(int i, int i2) {
        return C1199.m21221(i2, i);
    }

    public static int compositeARGBWithAlpha(int i, int i2) {
        return C1199.m21223(i, (Color.alpha(i) * i2) / 255);
    }

    public static boolean isColorLight(int i) {
        return i != 0 && C1199.m21209(i) > 0.5d;
    }

    public static int harmonizeWithPrimary(Context context, int i) {
        return harmonize(i, getColor(context, C19410.f58883, MaterialColors.class.getCanonicalName()));
    }

    public static int harmonize(int i, int i2) {
        return Blend.harmonize(i, i2);
    }

    public static ColorRoles getColorRoles(Context context, int i) {
        return getColorRoles(i, isLightTheme(context));
    }

    public static ColorRoles getColorRoles(int i, boolean z) {
        if (z) {
            return new ColorRoles(getColorRole(i, 40), getColorRole(i, 100), getColorRole(i, 90), getColorRole(i, 10));
        }
        return new ColorRoles(getColorRole(i, 80), getColorRole(i, 20), getColorRole(i, 30), getColorRole(i, 90));
    }

    public static int getSurfaceContainerFromSeed(Context context, int i) {
        return getColorRole(i, isLightTheme(context) ? 94 : 12, 6);
    }

    public static int getSurfaceContainerHighFromSeed(Context context, int i) {
        return getColorRole(i, isLightTheme(context) ? 92 : 17, 6);
    }

    public static boolean isLightTheme(Context context) {
        return MaterialAttributes.resolveBoolean(context, C19410.f58635, true);
    }

    public static int getColorRole(int i, int i2) {
        Hct hctFromInt = Hct.fromInt(i);
        hctFromInt.setTone(i2);
        return hctFromInt.toInt();
    }

    public static int getColorRole(int i, int i2, int i3) {
        Hct hctFromInt = Hct.fromInt(getColorRole(i, i2));
        hctFromInt.setChroma(i3);
        return hctFromInt.toInt();
    }
}
