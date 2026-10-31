package com.google.android.material.color;

import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import java.util.HashMap;
import java.util.Map;
import l.C14402;
import l.C20195;

/* JADX INFO: loaded from: classes.dex */
public final class MaterialColorUtilitiesHelper {
    public static final Map colorResourceIdToColorValue;
    public static final MaterialDynamicColors dynamicColors;

    static {
        MaterialDynamicColors materialDynamicColors = new MaterialDynamicColors();
        dynamicColors = materialDynamicColors;
        HashMap map = new HashMap();
        map.put(Integer.valueOf(C14402.f43597), materialDynamicColors.primary());
        map.put(Integer.valueOf(C14402.f43760), materialDynamicColors.onPrimary());
        map.put(Integer.valueOf(C14402.f43688), materialDynamicColors.inversePrimary());
        map.put(Integer.valueOf(C14402.f44051), materialDynamicColors.primaryContainer());
        map.put(Integer.valueOf(C14402.f44124), materialDynamicColors.onPrimaryContainer());
        map.put(Integer.valueOf(C14402.f43461), materialDynamicColors.secondary());
        map.put(Integer.valueOf(C14402.f43826), materialDynamicColors.onSecondary());
        map.put(Integer.valueOf(C14402.f43506), materialDynamicColors.secondaryContainer());
        map.put(Integer.valueOf(C14402.f43624), materialDynamicColors.onSecondaryContainer());
        map.put(Integer.valueOf(C14402.f43800), materialDynamicColors.tertiary());
        map.put(Integer.valueOf(C14402.f43959), materialDynamicColors.onTertiary());
        map.put(Integer.valueOf(C14402.f43778), materialDynamicColors.tertiaryContainer());
        map.put(Integer.valueOf(C14402.f43936), materialDynamicColors.onTertiaryContainer());
        map.put(Integer.valueOf(C14402.f44078), materialDynamicColors.background());
        map.put(Integer.valueOf(C14402.f43782), materialDynamicColors.onBackground());
        map.put(Integer.valueOf(C14402.f43392), materialDynamicColors.surface());
        map.put(Integer.valueOf(C14402.f43438), materialDynamicColors.onSurface());
        map.put(Integer.valueOf(C14402.f43484), materialDynamicColors.surfaceVariant());
        map.put(Integer.valueOf(C14402.f43913), materialDynamicColors.onSurfaceVariant());
        map.put(Integer.valueOf(C14402.f43529), materialDynamicColors.inverseSurface());
        map.put(Integer.valueOf(C14402.f43733), materialDynamicColors.inverseOnSurface());
        map.put(Integer.valueOf(C14402.f43552), materialDynamicColors.surfaceBright());
        map.put(Integer.valueOf(C14402.f44028), materialDynamicColors.surfaceDim());
        map.put(Integer.valueOf(C14402.f43415), materialDynamicColors.surfaceContainer());
        map.put(Integer.valueOf(C14402.f44074), materialDynamicColors.surfaceContainerLow());
        map.put(Integer.valueOf(C14402.f43642), materialDynamicColors.surfaceContainerHigh());
        map.put(Integer.valueOf(C14402.f44097), materialDynamicColors.surfaceContainerLowest());
        map.put(Integer.valueOf(C14402.f43867), materialDynamicColors.surfaceContainerHighest());
        map.put(Integer.valueOf(C14402.f43844), materialDynamicColors.outline());
        map.put(Integer.valueOf(C14402.f44142), materialDynamicColors.outlineVariant());
        map.put(Integer.valueOf(C14402.f43488), materialDynamicColors.error());
        map.put(Integer.valueOf(C14402.f43715), materialDynamicColors.onError());
        map.put(Integer.valueOf(C14402.f43804), materialDynamicColors.errorContainer());
        map.put(Integer.valueOf(C14402.f43579), materialDynamicColors.onErrorContainer());
        map.put(Integer.valueOf(C14402.f44101), materialDynamicColors.controlActivated());
        map.put(Integer.valueOf(C14402.f43533), materialDynamicColors.controlNormal());
        map.put(Integer.valueOf(C14402.f44032), materialDynamicColors.controlHighlight());
        map.put(Integer.valueOf(C14402.f43575), materialDynamicColors.textPrimaryInverse());
        map.put(Integer.valueOf(C14402.f44120), materialDynamicColors.textSecondaryAndTertiaryInverse());
        map.put(Integer.valueOf(C14402.f43822), materialDynamicColors.textSecondaryAndTertiaryInverseDisabled());
        map.put(Integer.valueOf(C14402.f43756), materialDynamicColors.textPrimaryInverseDisableOnly());
        map.put(Integer.valueOf(C14402.f43711), materialDynamicColors.textHintInverse());
        colorResourceIdToColorValue = C20195.unmodifiableMap(map);
    }

    public static Map createColorResourcesIdsToColorValues(DynamicScheme dynamicScheme) {
        HashMap map = new HashMap();
        for (Map.Entry entry : colorResourceIdToColorValue.entrySet()) {
            map.put((Integer) entry.getKey(), Integer.valueOf(((DynamicColor) entry.getValue()).getArgb(dynamicScheme)));
        }
        return C20195.unmodifiableMap(map);
    }
}
