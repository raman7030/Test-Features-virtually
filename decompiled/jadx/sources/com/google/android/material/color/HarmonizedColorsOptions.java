package com.google.android.material.color;

import l.C17931;

/* JADX INFO: loaded from: classes.dex */
public class HarmonizedColorsOptions {
    public final int colorAttributeToHarmonizeWith;
    public final HarmonizedColorAttributes colorAttributes;
    public final int[] colorResourceIds;

    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    public HarmonizedColorsOptions(Builder builder) {
        this.colorResourceIds = builder.colorResourceIds;
        this.colorAttributes = builder.colorAttributes;
        this.colorAttributeToHarmonizeWith = builder.colorAttributeToHarmonizeWith;
    }

    public int[] getColorResourceIds() {
        return this.colorResourceIds;
    }

    public HarmonizedColorAttributes getColorAttributes() {
        return this.colorAttributes;
    }

    public int getColorAttributeToHarmonizeWith() {
        return this.colorAttributeToHarmonizeWith;
    }

    public class Builder {
        public HarmonizedColorAttributes colorAttributes;
        public int[] colorResourceIds = new int[0];
        public int colorAttributeToHarmonizeWith = C17931.f55686;

        public Builder setColorResourceIds(int[] iArr) {
            this.colorResourceIds = iArr;
            return this;
        }

        public Builder setColorAttributes(HarmonizedColorAttributes harmonizedColorAttributes) {
            this.colorAttributes = harmonizedColorAttributes;
            return this;
        }

        public Builder setColorAttributeToHarmonizeWith(int i) {
            this.colorAttributeToHarmonizeWith = i;
            return this;
        }

        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }
    }

    public int getThemeOverlayResourceId(int i) {
        HarmonizedColorAttributes harmonizedColorAttributes = this.colorAttributes;
        return (harmonizedColorAttributes == null || harmonizedColorAttributes.getThemeOverlay() == 0) ? i : this.colorAttributes.getThemeOverlay();
    }
}
