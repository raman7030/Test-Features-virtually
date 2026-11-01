package p067l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۜۚ */
/* JADX INFO: compiled from: W1AV */
/* JADX INFO: loaded from: classes2.dex */
public final class C1167 {

    /* JADX INFO: renamed from: ֫ */
    public static SparseIntArray f23074;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23074 = sparseIntArray;
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

    /* JADX INFO: renamed from: ֫ */
    public static void m20002(C1867 c1867, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f23074;
            switch (sparseIntArray.get(index)) {
                case 1:
                    if (C1342.f33266) {
                        int resourceId = typedArray.getResourceId(index, c1867.f18546);
                        c1867.f18546 = resourceId;
                        if (resourceId == -1) {
                            c1867.f18547 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c1867.f18547 = typedArray.getString(index);
                    } else {
                        c1867.f18546 = typedArray.getResourceId(index, c1867.f18546);
                    }
                    break;
                case 2:
                    c1867.f18545 = typedArray.getInt(index, c1867.f18545);
                    break;
                case 3:
                    if (typedArray.peekValue(index).type == 3) {
                        c1867.f69116 = typedArray.getString(index);
                    } else {
                        c1867.f69116 = C1265.f28949[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 4:
                    c1867.f31397 = typedArray.getInteger(index, c1867.f31397);
                    break;
                case 5:
                    c1867.f69120 = typedArray.getInt(index, c1867.f69120);
                    break;
                case 6:
                    c1867.f69119 = typedArray.getFloat(index, c1867.f69119);
                    break;
                case 7:
                    c1867.f69118 = typedArray.getFloat(index, c1867.f69118);
                    break;
                case 8:
                    float f = typedArray.getFloat(index, c1867.f69117);
                    c1867.f69122 = f;
                    c1867.f69117 = f;
                    break;
                case 9:
                    c1867.f69121 = typedArray.getInt(index, c1867.f69121);
                    break;
                case 10:
                    c1867.f69123 = typedArray.getInt(index, c1867.f69123);
                    break;
                case 11:
                    c1867.f69122 = typedArray.getFloat(index, c1867.f69122);
                    break;
                case 12:
                    c1867.f69117 = typedArray.getFloat(index, c1867.f69117);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
    }
}
