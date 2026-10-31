package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9140 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f27671;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f27672;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f27673;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f27674;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f27675;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f27676;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f27677;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f27678;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23508(C9140 c9140) {
        this.f27673 = c9140.f27673;
        this.f27672 = c9140.f27672;
        this.f27678 = c9140.f27678;
        this.f27676 = c9140.f27676;
        this.f27675 = c9140.f27675;
        this.f27674 = c9140.f27674;
        this.f27677 = c9140.f27677;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f27671 = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23507(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C21840.f69973);
        this.f27673 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f27671.get(index)) {
                case 1:
                    this.f27674 = typedArrayObtainStyledAttributes.getFloat(index, this.f27674);
                    break;
                case 2:
                    this.f27676 = typedArrayObtainStyledAttributes.getInt(index, this.f27676);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f27678 = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f27678 = C8518.f26034[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f27675 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f27672 = C4201.m12665(typedArrayObtainStyledAttributes, index, this.f27672);
                    break;
                case 6:
                    this.f27677 = typedArrayObtainStyledAttributes.getFloat(index, this.f27677);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
