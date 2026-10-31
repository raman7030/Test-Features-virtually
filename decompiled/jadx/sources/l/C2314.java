package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U1D7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2314 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f7447;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f7447 = sparseIntArray;
        sparseIntArray.append(0, 8);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 1);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(7, 6);
        sparseIntArray.append(9, 5);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(2, 10);
        sparseIntArray.append(8, 11);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m7572(C3725 c3725, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f7447;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c3725.f11776 = typedArray.getString(index);
                    continue;
                    break;
                case 2:
                    c3725.f11777 = typedArray.getString(index);
                    continue;
                    break;
                case 4:
                    c3725.f11772 = typedArray.getString(index);
                    continue;
                    break;
                case 5:
                    c3725.f11780 = typedArray.getFloat(index, c3725.f11780);
                    continue;
                    break;
                case 6:
                    c3725.f11773 = typedArray.getResourceId(index, c3725.f11773);
                    continue;
                    break;
                case 7:
                    if (C10075.f30305) {
                        int resourceId = typedArray.getResourceId(index, c3725.f15713);
                        c3725.f15713 = resourceId;
                        if (resourceId == -1) {
                            c3725.f15714 = typedArray.getString(index);
                        } else {
                            continue;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c3725.f15714 = typedArray.getString(index);
                    } else {
                        c3725.f15713 = typedArray.getResourceId(index, c3725.f15713);
                    }
                    break;
                case 8:
                    int integer = typedArray.getInteger(index, c3725.f15712);
                    c3725.f15712 = integer;
                    c3725.f11766 = (integer + 0.5f) / 100.0f;
                    continue;
                    break;
                case 9:
                    c3725.f11764 = typedArray.getResourceId(index, c3725.f11764);
                    continue;
                    break;
                case 10:
                    c3725.f11763 = typedArray.getBoolean(index, c3725.f11763);
                    continue;
                    break;
                case 11:
                    c3725.f11779 = typedArray.getResourceId(index, c3725.f11779);
                    break;
            }
            Integer.toHexString(index);
            sparseIntArray.get(index);
        }
    }
}
