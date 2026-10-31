package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.view.ContextThemeWrapper;
import java.util.HashMap;
import java.util.Map;
import l.C0881;
import l.C18637;

/* JADX INFO: loaded from: classes.dex */
public class HarmonizedColors {
    public static final String TAG = "HarmonizedColors";

    public static void applyToContextIfAvailable(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            Map mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
            int themeOverlayResourceId = harmonizedColorsOptions.getThemeOverlayResourceId(0);
            if (!ResourcesLoaderUtils.addResourcesLoaderToContext(context, mapCreateHarmonizedColorReplacementMap) || themeOverlayResourceId == 0) {
                return;
            }
            ThemeUtils.applyThemeOverlay(context, themeOverlayResourceId);
        }
    }

    public static Context wrapContextIfAvailable(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        if (isHarmonizedColorAvailable()) {
            Map mapCreateHarmonizedColorReplacementMap = createHarmonizedColorReplacementMap(context, harmonizedColorsOptions);
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, harmonizedColorsOptions.getThemeOverlayResourceId(C18637.f58114));
            contextThemeWrapper.applyOverrideConfiguration(new Configuration());
            if (ResourcesLoaderUtils.addResourcesLoaderToContext(contextThemeWrapper, mapCreateHarmonizedColorReplacementMap)) {
                return contextThemeWrapper;
            }
        }
        return context;
    }

    public static boolean isHarmonizedColorAvailable() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static Map createHarmonizedColorReplacementMap(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        HashMap map = new HashMap();
        int color = MaterialColors.getColor(context, harmonizedColorsOptions.getColorAttributeToHarmonizeWith(), TAG);
        for (int i : harmonizedColorsOptions.getColorResourceIds()) {
            map.put(Integer.valueOf(i), Integer.valueOf(MaterialColors.harmonize(C0881.m3228(context, i), color)));
        }
        HarmonizedColorAttributes colorAttributes = harmonizedColorsOptions.getColorAttributes();
        if (colorAttributes != null) {
            int[] attributes = colorAttributes.getAttributes();
            if (attributes.length > 0) {
                int themeOverlay = colorAttributes.getThemeOverlay();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributes);
                TypedArray typedArrayObtainStyledAttributes2 = themeOverlay != 0 ? new ContextThemeWrapper(context, themeOverlay).obtainStyledAttributes(attributes) : null;
                addHarmonizedColorAttributesToReplacementMap(map, typedArrayObtainStyledAttributes, typedArrayObtainStyledAttributes2, color);
                typedArrayObtainStyledAttributes.recycle();
                if (typedArrayObtainStyledAttributes2 != null) {
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
        }
        return map;
    }

    public static void addHarmonizedColorAttributesToReplacementMap(Map map, TypedArray typedArray, TypedArray typedArray2, int i) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i2 = 0; i2 < typedArray.getIndexCount(); i2++) {
            int resourceId = typedArray2.getResourceId(i2, 0);
            if (resourceId != 0 && typedArray.hasValue(i2) && ResourcesLoaderUtils.isColorResource(typedArray.getType(i2))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(MaterialColors.harmonize(typedArray.getColor(i2, 0), i)));
            }
        }
    }
}
