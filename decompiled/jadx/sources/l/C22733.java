package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: renamed from: l.᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O5HE */
/* JADX INFO: loaded from: classes.dex */
public final class C22733 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Context f73436;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public TypedValue f73437;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TypedArray f73438;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22733 m50795(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C22733(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22733 m50796(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C22733(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C22733 m50794(Context context, int i, int[] iArr) {
        return new C22733(context, context.obtainStyledAttributes(i, iArr));
    }

    public C22733(Context context, TypedArray typedArray) {
        this.f73436 = context;
        this.f73438 = typedArray;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final TypedArray m50810() {
        return this.f73438;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Drawable m50815(int i) {
        int resourceId;
        TypedArray typedArray = this.f73438;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return C21311.m48345(this.f73436, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Drawable m50812(int i) {
        int resourceId;
        TypedArray typedArray = this.f73438;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C5965.m16700().m16704(this.f73436, resourceId);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Typeface m50800(int i, int i2, AbstractC14951 abstractC14951) {
        int resourceId = this.f73438.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f73437 == null) {
            this.f73437 = new TypedValue();
        }
        return C4369.m13091(this.f73436, resourceId, this.f73437, i2, abstractC14951);
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CharSequence m50817(int i) {
        return this.f73438.getText(i);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m50807(int i) {
        return this.f73438.getString(i);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m50801(int i, boolean z) {
        return this.f73438.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m50809(int i, int i2) {
        return this.f73438.getInt(i, i2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m50797() {
        return this.f73438.getFloat(4, -1.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50798(int i) {
        return this.f73438.getColor(i, 0);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ColorStateList m50804(int i) {
        int resourceId;
        ColorStateList colorStateListM3233;
        TypedArray typedArray = this.f73438;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM3233 = C0881.m3233(this.f73436, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM3233;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m50814(int i, int i2) {
        return this.f73438.getInteger(i, i2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float m50808(int i) {
        return this.f73438.getDimension(i, -1.0f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m50799(int i, int i2) {
        return this.f73438.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m50803(int i, int i2) {
        return this.f73438.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m50811(int i, int i2) {
        return this.f73438.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m50806(int i, int i2) {
        return this.f73438.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final CharSequence[] m50805() {
        return this.f73438.getTextArray(0);
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m50802(int i) {
        return this.f73438.hasValue(i);
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TypedValue m50816() {
        return this.f73438.peekValue(19);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m50813() {
        this.f73438.recycle();
    }
}
