package com.google.android.material.color;

import p067l.C19410;
import p067l.C20081;

/* JADX INFO: loaded from: classes.dex */
public final class HarmonizedColorAttributes {
    public static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {C19410.f58938, C19410.f58458, C19410.f58186, C19410.f58254};
    public final int[] attributes;
    public final int themeOverlay;

    public static HarmonizedColorAttributes create(int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    public static HarmonizedColorAttributes create(int[] iArr, int i) {
        return new HarmonizedColorAttributes(iArr, i);
    }

    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, C20081.f61535);
    }

    public HarmonizedColorAttributes(int[] iArr, int i) {
        if (i != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.attributes = iArr;
        this.themeOverlay = i;
    }

    public int[] getAttributes() {
        return this.attributes;
    }

    public int getThemeOverlay() {
        return this.themeOverlay;
    }
}
