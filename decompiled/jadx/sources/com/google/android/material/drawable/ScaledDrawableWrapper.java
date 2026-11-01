package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import p067l.C0878;

/* JADX INFO: loaded from: classes.dex */
public class ScaledDrawableWrapper extends C0878 {
    public final int height;
    public final int width;

    public ScaledDrawableWrapper(Drawable drawable, int i, int i2) {
        super(drawable);
        this.width = i;
        this.height = i2;
    }

    @Override // p067l.C0878, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }

    @Override // p067l.C0878, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }
}
