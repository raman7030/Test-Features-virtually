package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۡ᩸ */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1295 {

    /* JADX INFO: renamed from: ۜ */
    public static SparseIntArray f30611;

    /* JADX INFO: renamed from: ֫ */
    public int f30612;

    /* JADX INFO: renamed from: ۧ */
    public boolean f30613;

    /* JADX INFO: renamed from: ܳ */
    public float f30614;

    /* JADX INFO: renamed from: ܽ */
    public int f30615;

    /* JADX INFO: renamed from: ܿ */
    public int f30616;

    /* JADX INFO: renamed from: ᩳ */
    public float f30617;

    /* JADX INFO: renamed from: ᩻ */
    public String f30618;

    /* JADX INFO: renamed from: ֫ */
    public final void m25459(C1295 c1295) {
        this.f30613 = c1295.f30613;
        this.f30612 = c1295.f30612;
        this.f30618 = c1295.f30618;
        this.f30616 = c1295.f30616;
        this.f30615 = c1295.f30615;
        this.f30614 = c1295.f30614;
        this.f30617 = c1295.f30617;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f30611 = sparseIntArray;
        sparseIntArray.append(2, 1);
        sparseIntArray.append(4, 2);
        sparseIntArray.append(5, 3);
        sparseIntArray.append(1, 4);
        sparseIntArray.append(0, 5);
        sparseIntArray.append(3, 6);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25458(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1925.f72682);
        this.f30613 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f30611.get(index)) {
                case 1:
                    this.f30614 = typedArrayObtainStyledAttributes.getFloat(index, this.f30614);
                    break;
                case 2:
                    this.f30616 = typedArrayObtainStyledAttributes.getInt(index, this.f30616);
                    break;
                case 3:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.f30618 = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.f30618 = C1265.f28949[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    this.f30615 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f30612 = C1050.m14541(typedArrayObtainStyledAttributes, index, this.f30612);
                    break;
                case 6:
                    this.f30617 = typedArrayObtainStyledAttributes.getFloat(index, this.f30617);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
