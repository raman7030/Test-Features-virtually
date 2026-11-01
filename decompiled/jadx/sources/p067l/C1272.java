package p067l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۡۚ */
/* JADX INFO: compiled from: J1B7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1272 {

    /* JADX INFO: renamed from: ֫ */
    public static SparseIntArray f29357;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f29357 = sparseIntArray;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(9, 2);
        sparseIntArray.append(5, 4);
        sparseIntArray.append(6, 5);
        sparseIntArray.append(7, 6);
        sparseIntArray.append(3, 7);
        sparseIntArray.append(15, 8);
        sparseIntArray.append(14, 9);
        sparseIntArray.append(13, 10);
        sparseIntArray.append(11, 12);
        sparseIntArray.append(10, 13);
        sparseIntArray.append(4, 14);
        sparseIntArray.append(1, 15);
        sparseIntArray.append(2, 16);
        sparseIntArray.append(8, 17);
        sparseIntArray.append(12, 18);
        sparseIntArray.append(18, 20);
        sparseIntArray.append(17, 21);
        sparseIntArray.append(19, 19);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m24390(C1622 c1622, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f29357;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c1622.f51622 = typedArray.getFloat(index, c1622.f51622);
                    break;
                case 2:
                    c1622.f51626 = typedArray.getDimension(index, c1622.f51626);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    c1622.f51625 = typedArray.getFloat(index, c1622.f51625);
                    break;
                case 5:
                    c1622.f51619 = typedArray.getFloat(index, c1622.f51619);
                    break;
                case 6:
                    c1622.f51618 = typedArray.getFloat(index, c1622.f51618);
                    break;
                case 7:
                    c1622.f51621 = typedArray.getFloat(index, c1622.f51621);
                    break;
                case 8:
                    c1622.f51614 = typedArray.getFloat(index, c1622.f51614);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C1342.f33266) {
                        int resourceId = typedArray.getResourceId(index, c1622.f18546);
                        c1622.f18546 = resourceId;
                        if (resourceId == -1) {
                            c1622.f18547 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c1622.f18547 = typedArray.getString(index);
                    } else {
                        c1622.f18546 = typedArray.getResourceId(index, c1622.f18546);
                    }
                    break;
                case 12:
                    c1622.f18545 = typedArray.getInt(index, c1622.f18545);
                    break;
                case 13:
                    c1622.f51620 = typedArray.getInteger(index, c1622.f51620);
                    break;
                case 14:
                    c1622.f51613 = typedArray.getFloat(index, c1622.f51613);
                    break;
                case 15:
                    c1622.f51623 = typedArray.getDimension(index, c1622.f51623);
                    break;
                case 16:
                    c1622.f51624 = typedArray.getDimension(index, c1622.f51624);
                    break;
                case 17:
                    c1622.f51611 = typedArray.getDimension(index, c1622.f51611);
                    break;
                case 18:
                    c1622.f51616 = typedArray.getFloat(index, c1622.f51616);
                    break;
                case 19:
                    c1622.f51617 = typedArray.getInt(index, c1622.f51617);
                    break;
                case 20:
                    c1622.f51612 = typedArray.getFloat(index, c1622.f51612);
                    break;
                case 21:
                    if (typedArray.peekValue(index).type == 5) {
                        c1622.f51615 = typedArray.getDimension(index, c1622.f51615);
                    } else {
                        c1622.f51615 = typedArray.getFloat(index, c1622.f51615);
                    }
                    break;
            }
        }
    }
}
