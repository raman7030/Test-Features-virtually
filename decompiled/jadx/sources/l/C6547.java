package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1AV */
/* JADX INFO: loaded from: classes2.dex */
public final class C6547 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f20195;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f20195 = sparseIntArray;
        sparseIntArray.append(4, 1);
        sparseIntArray.append(2, 2);
        sparseIntArray.append(11, 3);
        sparseIntArray.append(0, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(8, 6);
        sparseIntArray.append(9, 7);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(10, 8);
        sparseIntArray.append(7, 11);
        sparseIntArray.append(6, 12);
        sparseIntArray.append(5, 10);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m18052(C20659 c20659, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f20195;
            switch (sparseIntArray.get(index)) {
                case 1:
                    if (C10075.f30305) {
                        int resourceId = typedArray.getResourceId(index, c20659.f15713);
                        c20659.f15713 = resourceId;
                        if (resourceId == -1) {
                            c20659.f15714 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c20659.f15714 = typedArray.getString(index);
                    } else {
                        c20659.f15713 = typedArray.getResourceId(index, c20659.f15713);
                    }
                    break;
                case 2:
                    c20659.f15712 = typedArray.getInt(index, c20659.f15712);
                    break;
                case 3:
                    if (typedArray.peekValue(index).type == 3) {
                        c20659.f66434 = typedArray.getString(index);
                    } else {
                        c20659.f66434 = C8518.f26034[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    c20659.f28448 = typedArray.getInteger(index, c20659.f28448);
                    break;
                case 5:
                    c20659.f66438 = typedArray.getInt(index, c20659.f66438);
                    break;
                case 6:
                    c20659.f66437 = typedArray.getFloat(index, c20659.f66437);
                    break;
                case 7:
                    c20659.f66436 = typedArray.getFloat(index, c20659.f66436);
                    break;
                case 8:
                    float f = typedArray.getFloat(index, c20659.f66435);
                    c20659.f66440 = f;
                    c20659.f66435 = f;
                    break;
                case 9:
                    c20659.f66439 = typedArray.getInt(index, c20659.f66439);
                    break;
                case 10:
                    c20659.f66441 = typedArray.getInt(index, c20659.f66441);
                    break;
                case 11:
                    c20659.f66440 = typedArray.getFloat(index, c20659.f66440);
                    break;
                case 12:
                    c20659.f66435 = typedArray.getFloat(index, c20659.f66435);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
    }
}
