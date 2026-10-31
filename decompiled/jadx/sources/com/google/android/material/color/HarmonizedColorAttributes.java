package com.google.android.material.color;

import l.C17931;
import l.C18637;

/* JADX INFO: loaded from: classes.dex */
public final class HarmonizedColorAttributes {
    public static final int[] HARMONIZED_MATERIAL_ATTRIBUTES = {C17931.f55741, C17931.f55261, C17931.f54989, C17931.f55057};
    public final int[] attributes;
    public final int themeOverlay;

    public static HarmonizedColorAttributes create(int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    public static HarmonizedColorAttributes create(int[] iArr, int i) {
        return new HarmonizedColorAttributes(iArr, i);
    }

    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(HARMONIZED_MATERIAL_ATTRIBUTES, C18637.f58312);
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
