package com.google.android.material.color;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.Map;
import p067l.C16056;
import p067l.C21562;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialColorUtilitiesHelper {
    public static final Map colorResourceIdToColorValue;
    public static final MaterialDynamicColors dynamicColors;

    static {
        MaterialDynamicColors materialDynamicColors = new MaterialDynamicColors();
        dynamicColors = materialDynamicColors;
        HashMap map = new HashMap();
        map.put(Integer.valueOf(C16056.f46690), materialDynamicColors.primary());
        map.put(Integer.valueOf(C16056.f46853), materialDynamicColors.onPrimary());
        map.put(Integer.valueOf(C16056.f46781), materialDynamicColors.inversePrimary());
        map.put(Integer.valueOf(C16056.f47144), materialDynamicColors.primaryContainer());
        map.put(Integer.valueOf(C16056.f47217), materialDynamicColors.onPrimaryContainer());
        map.put(Integer.valueOf(C16056.f46554), materialDynamicColors.secondary());
        map.put(Integer.valueOf(C16056.f46919), materialDynamicColors.onSecondary());
        map.put(Integer.valueOf(C16056.f46599), materialDynamicColors.secondaryContainer());
        map.put(Integer.valueOf(C16056.f46717), materialDynamicColors.onSecondaryContainer());
        map.put(Integer.valueOf(C16056.f46893), materialDynamicColors.tertiary());
        map.put(Integer.valueOf(C16056.f47052), materialDynamicColors.onTertiary());
        map.put(Integer.valueOf(C16056.f46871), materialDynamicColors.tertiaryContainer());
        map.put(Integer.valueOf(C16056.f47029), materialDynamicColors.onTertiaryContainer());
        map.put(Integer.valueOf(C16056.f47171), materialDynamicColors.background());
        map.put(Integer.valueOf(C16056.f46875), materialDynamicColors.onBackground());
        map.put(Integer.valueOf(C16056.f46485), materialDynamicColors.surface());
        map.put(Integer.valueOf(C16056.f46531), materialDynamicColors.onSurface());
        map.put(Integer.valueOf(C16056.f46577), materialDynamicColors.surfaceVariant());
        map.put(Integer.valueOf(C16056.f47006), materialDynamicColors.onSurfaceVariant());
        map.put(Integer.valueOf(C16056.f46622), materialDynamicColors.inverseSurface());
        map.put(Integer.valueOf(C16056.f46826), materialDynamicColors.inverseOnSurface());
        map.put(Integer.valueOf(C16056.f46645), materialDynamicColors.surfaceBright());
        map.put(Integer.valueOf(C16056.f47121), materialDynamicColors.surfaceDim());
        map.put(Integer.valueOf(C16056.f46508), materialDynamicColors.surfaceContainer());
        map.put(Integer.valueOf(C16056.f47167), materialDynamicColors.surfaceContainerLow());
        map.put(Integer.valueOf(C16056.f46735), materialDynamicColors.surfaceContainerHigh());
        map.put(Integer.valueOf(C16056.f47190), materialDynamicColors.surfaceContainerLowest());
        map.put(Integer.valueOf(C16056.f46960), materialDynamicColors.surfaceContainerHighest());
        map.put(Integer.valueOf(C16056.f46937), materialDynamicColors.outline());
        map.put(Integer.valueOf(C16056.f47235), materialDynamicColors.outlineVariant());
        map.put(Integer.valueOf(C16056.f46581), materialDynamicColors.error());
        map.put(Integer.valueOf(C16056.f46808), materialDynamicColors.onError());
        map.put(Integer.valueOf(C16056.f46897), materialDynamicColors.errorContainer());
        map.put(Integer.valueOf(C16056.f46672), materialDynamicColors.onErrorContainer());
        map.put(Integer.valueOf(C16056.f47194), materialDynamicColors.controlActivated());
        map.put(Integer.valueOf(C16056.f46626), materialDynamicColors.controlNormal());
        map.put(Integer.valueOf(C16056.f47125), materialDynamicColors.controlHighlight());
        map.put(Integer.valueOf(C16056.f46668), materialDynamicColors.textPrimaryInverse());
        map.put(Integer.valueOf(C16056.f47213), materialDynamicColors.textSecondaryAndTertiaryInverse());
        map.put(Integer.valueOf(C16056.f46915), materialDynamicColors.textSecondaryAndTertiaryInverseDisabled());
        map.put(Integer.valueOf(C16056.f46849), materialDynamicColors.textPrimaryInverseDisableOnly());
        map.put(Integer.valueOf(C16056.f46804), materialDynamicColors.textHintInverse());
        colorResourceIdToColorValue = C21562.unmodifiableMap(map);
    }

    public static Map createColorResourcesIdsToColorValues(DynamicScheme dynamicScheme) {
        HashMap map = new HashMap();
        for (Map.Entry entry : colorResourceIdToColorValue.entrySet()) {
            map.put((Integer) entry.getKey(), Integer.valueOf(((DynamicColor) entry.getValue()).getArgb(dynamicScheme)));
        }
        return C21562.unmodifiableMap(map);
    }
}
