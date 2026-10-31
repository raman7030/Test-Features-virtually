package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* JADX INFO: renamed from: l.ܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16194 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f49869;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f49870;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f49871;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f49872;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f49873;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38126(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69982);
        this.f49870 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f49869 = typedArrayObtainStyledAttributes.getFloat(index, this.f49869);
            } else if (index == 0) {
                this.f49872 = typedArrayObtainStyledAttributes.getInt(index, this.f49872);
                this.f49872 = C4201.f13667[this.f49872];
            } else if (index == 4) {
                this.f49873 = typedArrayObtainStyledAttributes.getInt(index, this.f49873);
            } else if (index == 3) {
                this.f49871 = typedArrayObtainStyledAttributes.getFloat(index, this.f49871);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
