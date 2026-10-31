package com.google.android.material.color;

/* JADX INFO: loaded from: classes.dex */
public class ColorContrastOptions {
    public final int highContrastThemeOverlayResourceId;
    public final int mediumContrastThemeOverlayResourceId;

    public ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }

    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }

    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    public class Builder {
        public int highContrastThemeOverlayResourceId;
        public int mediumContrastThemeOverlayResourceId;

        public Builder setMediumContrastThemeOverlay(int i) {
            this.mediumContrastThemeOverlayResourceId = i;
            return this;
        }

        public Builder setHighContrastThemeOverlay(int i) {
            this.highContrastThemeOverlayResourceId = i;
            return this;
        }

        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }
    }
}
