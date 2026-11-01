package p067l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۖ᩸ */
/* JADX INFO: compiled from: R1K2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0980 {

    /* JADX INFO: renamed from: ۘ */
    public static SparseIntArray f11485;

    /* JADX INFO: renamed from: ֫ */
    public boolean f11486;

    /* JADX INFO: renamed from: ۖ */
    public float f11487;

    /* JADX INFO: renamed from: ۜ */
    public float f11488;

    /* JADX INFO: renamed from: ۡ */
    public float f11489;

    /* JADX INFO: renamed from: ۢ */
    public float f11490;

    /* JADX INFO: renamed from: ۧ */
    public float f11491;

    /* JADX INFO: renamed from: ܳ */
    public float f11492;

    /* JADX INFO: renamed from: ܺ */
    public float f11493;

    /* JADX INFO: renamed from: ܽ */
    public boolean f11494;

    /* JADX INFO: renamed from: ܿ */
    public float f11495;

    /* JADX INFO: renamed from: ᩳ */
    public float f11496;

    /* JADX INFO: renamed from: ᩷ */
    public float f11497;

    /* JADX INFO: renamed from: ᩻ */
    public float f11498;

    /* JADX INFO: renamed from: ֫ */
    public final void m10680(C0980 c0980) {
        this.f11494 = c0980.f11494;
        this.f11496 = c0980.f11496;
        this.f11495 = c0980.f11495;
        this.f11492 = c0980.f11492;
        this.f11498 = c0980.f11498;
        this.f11488 = c0980.f11488;
        this.f11497 = c0980.f11497;
        this.f11490 = c0980.f11490;
        this.f11489 = c0980.f11489;
        this.f11493 = c0980.f11493;
        this.f11487 = c0980.f11487;
        this.f11486 = c0980.f11486;
        this.f11491 = c0980.f11491;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f11485 = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m10679(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1925.f72698);
        this.f11494 = true;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            switch (f11485.get(index)) {
                case 1:
                    this.f11496 = typedArrayObtainStyledAttributes.getFloat(index, this.f11496);
                    break;
                case 2:
                    this.f11495 = typedArrayObtainStyledAttributes.getFloat(index, this.f11495);
                    break;
                case 3:
                    this.f11492 = typedArrayObtainStyledAttributes.getFloat(index, this.f11492);
                    break;
                case 4:
                    this.f11498 = typedArrayObtainStyledAttributes.getFloat(index, this.f11498);
                    break;
                case 5:
                    this.f11488 = typedArrayObtainStyledAttributes.getFloat(index, this.f11488);
                    break;
                case 6:
                    this.f11497 = typedArrayObtainStyledAttributes.getDimension(index, this.f11497);
                    break;
                case 7:
                    this.f11490 = typedArrayObtainStyledAttributes.getDimension(index, this.f11490);
                    break;
                case 8:
                    this.f11489 = typedArrayObtainStyledAttributes.getDimension(index, this.f11489);
                    break;
                case 9:
                    this.f11493 = typedArrayObtainStyledAttributes.getDimension(index, this.f11493);
                    break;
                case 10:
                    this.f11487 = typedArrayObtainStyledAttributes.getDimension(index, this.f11487);
                    break;
                case 11:
                    this.f11486 = true;
                    this.f11491 = typedArrayObtainStyledAttributes.getDimension(index, this.f11491);
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
