package com.google.android.material.color;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.material.color.utilities.QuantizerCelebi;
import com.google.android.material.color.utilities.Score;

/* JADX INFO: loaded from: classes.dex */
public class DynamicColorsOptions {
    public static final DynamicColors.Precondition ALWAYS_ALLOW = new DynamicColors.Precondition() { // from class: com.google.android.material.color.DynamicColorsOptions.1
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(Activity activity, int i) {
            return true;
        }
    };
    public static final DynamicColors.OnAppliedCallback NO_OP_CALLBACK = new DynamicColors.OnAppliedCallback() { // from class: com.google.android.material.color.DynamicColorsOptions.2
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(Activity activity) {
        }
    };
    public Integer contentBasedSeedColor;
    public final DynamicColors.OnAppliedCallback onAppliedCallback;
    public final DynamicColors.Precondition precondition;
    public final int themeOverlay;

    public DynamicColorsOptions(Builder builder) {
        this.themeOverlay = builder.themeOverlay;
        this.precondition = builder.precondition;
        this.onAppliedCallback = builder.onAppliedCallback;
        if (builder.contentBasedSourceColor != null) {
            this.contentBasedSeedColor = builder.contentBasedSourceColor;
        } else if (builder.contentBasedSourceBitmap != null) {
            this.contentBasedSeedColor = Integer.valueOf(extractSeedColorFromImage(builder.contentBasedSourceBitmap));
        }
    }

    public int getThemeOverlay() {
        return this.themeOverlay;
    }

    public DynamicColors.Precondition getPrecondition() {
        return this.precondition;
    }

    public DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.onAppliedCallback;
    }

    public Integer getContentBasedSeedColor() {
        return this.contentBasedSeedColor;
    }

    public class Builder {
        public Bitmap contentBasedSourceBitmap;
        public Integer contentBasedSourceColor;
        public int themeOverlay;
        public DynamicColors.Precondition precondition = DynamicColorsOptions.ALWAYS_ALLOW;
        public DynamicColors.OnAppliedCallback onAppliedCallback = DynamicColorsOptions.NO_OP_CALLBACK;

        public Builder setThemeOverlay(int i) {
            this.themeOverlay = i;
            return this;
        }

        public Builder setPrecondition(DynamicColors.Precondition precondition) {
            this.precondition = precondition;
            return this;
        }

        public Builder setOnAppliedCallback(DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.onAppliedCallback = onAppliedCallback;
            return this;
        }

        public Builder setContentBasedSource(Bitmap bitmap) {
            this.contentBasedSourceBitmap = bitmap;
            this.contentBasedSourceColor = null;
            return this;
        }

        public Builder setContentBasedSource(int i) {
            this.contentBasedSourceBitmap = null;
            this.contentBasedSourceColor = Integer.valueOf(i);
            return this;
        }

        public DynamicColorsOptions build() {
            return new DynamicColorsOptions(this);
        }
    }

    public static int extractSeedColorFromImage(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return ((Integer) Score.score(QuantizerCelebi.quantize(iArr, 128)).get(0)).intValue();
    }
}
