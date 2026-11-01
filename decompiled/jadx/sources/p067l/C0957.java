package p067l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۖۚ */
/* JADX INFO: compiled from: U1D7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0957 {

    /* JADX INFO: renamed from: ֫ */
    public static SparseIntArray f10239;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f10239 = sparseIntArray;
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

    /* JADX INFO: renamed from: ֫ */
    public static void m9642(C1027 c1027, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f10239;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c1027.f14583 = typedArray.getString(index);
                    continue;
                    break;
                case 2:
                    c1027.f14584 = typedArray.getString(index);
                    continue;
                    break;
                case 4:
                    c1027.f14579 = typedArray.getString(index);
                    continue;
                    break;
                case 5:
                    c1027.f14587 = typedArray.getFloat(index, c1027.f14587);
                    continue;
                    break;
                case 6:
                    c1027.f14580 = typedArray.getResourceId(index, c1027.f14580);
                    continue;
                    break;
                case 7:
                    if (C1342.f33266) {
                        int resourceId = typedArray.getResourceId(index, c1027.f18546);
                        c1027.f18546 = resourceId;
                        if (resourceId == -1) {
                            c1027.f18547 = typedArray.getString(index);
                        } else {
                            continue;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c1027.f18547 = typedArray.getString(index);
                    } else {
                        c1027.f18546 = typedArray.getResourceId(index, c1027.f18546);
                    }
                    break;
                case 8:
                    int integer = typedArray.getInteger(index, c1027.f18545);
                    c1027.f18545 = integer;
                    c1027.f14573 = (integer + 0.5f) / 100.0f;
                    continue;
                    break;
                case 9:
                    c1027.f14571 = typedArray.getResourceId(index, c1027.f14571);
                    continue;
                    break;
                case 10:
                    c1027.f14570 = typedArray.getBoolean(index, c1027.f14570);
                    continue;
                    break;
                case 11:
                    c1027.f14586 = typedArray.getResourceId(index, c1027.f14586);
                    break;
            }
            Integer.toHexString(index);
            sparseIntArray.get(index);
        }
    }
}
