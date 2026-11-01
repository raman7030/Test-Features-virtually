package p067l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: renamed from: l.᩺ۘ */
/* JADX INFO: compiled from: O5HE */
/* JADX INFO: loaded from: classes.dex */
public final class C1970 {

    /* JADX INFO: renamed from: ֫ */
    public final Context f76163;

    /* JADX INFO: renamed from: ۧ */
    public TypedValue f76164;

    /* JADX INFO: renamed from: ܽ */
    public final TypedArray f76165;

    /* JADX INFO: renamed from: ֫ */
    public static C1970 m53128(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1970(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1970 m53129(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1970(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: ֫ */
    public static C1970 m53127(Context context, int i, int[] iArr) {
        return new C1970(context, context.obtainStyledAttributes(i, iArr));
    }

    public C1970(Context context, TypedArray typedArray) {
        this.f76163 = context;
        this.f76165 = typedArray;
    }

    /* JADX INFO: renamed from: ܽ */
    public final TypedArray m53143() {
        return this.f76165;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final Drawable m53148(int i) {
        int resourceId;
        TypedArray typedArray = this.f76165;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return C22622.m50680(this.f76163, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    /* JADX INFO: renamed from: ܿ */
    public final Drawable m53145(int i) {
        int resourceId;
        TypedArray typedArray = this.f76165;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C1138.m18626().m18630(this.f76163, resourceId);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Typeface m53133(int i, int i2, AbstractC1584 abstractC1584) {
        int resourceId = this.f76165.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f76164 == null) {
            this.f76164 = new TypedValue();
        }
        return C1059.m14955(this.f76163, resourceId, this.f76164, i2, abstractC1584);
    }

    /* JADX INFO: renamed from: ᩻ */
    public final CharSequence m53150(int i) {
        return this.f76165.getText(i);
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m53140(int i) {
        return this.f76165.getString(i);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m53134(int i, boolean z) {
        return this.f76165.getBoolean(i, z);
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m53142(int i, int i2) {
        return this.f76165.getInt(i, i2);
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m53130() {
        return this.f76165.getFloat(4, -1.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53131(int i) {
        return this.f76165.getColor(i, 0);
    }

    /* JADX INFO: renamed from: ۧ */
    public final ColorStateList m53137(int i) {
        int resourceId;
        ColorStateList colorStateListM5547;
        TypedArray typedArray = this.f76165;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM5547 = C0886.m5547(this.f76163, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM5547;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m53147(int i, int i2) {
        return this.f76165.getInteger(i, i2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final float m53141(int i) {
        return this.f76165.getDimension(i, -1.0f);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m53132(int i, int i2) {
        return this.f76165.getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m53136(int i, int i2) {
        return this.f76165.getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m53144(int i, int i2) {
        return this.f76165.getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: ܳ */
    public final int m53139(int i, int i2) {
        return this.f76165.getResourceId(i, i2);
    }

    /* JADX INFO: renamed from: ۧ */
    public final CharSequence[] m53138() {
        return this.f76165.getTextArray(0);
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m53135(int i) {
        return this.f76165.hasValue(i);
    }

    /* JADX INFO: renamed from: ᩳ */
    public final TypedValue m53149() {
        return this.f76165.peekValue(19);
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m53146() {
        this.f76165.recycle();
    }
}
