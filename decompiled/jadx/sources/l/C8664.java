package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1B7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8664 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f26432;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26432 = sparseIntArray;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m22421(C15718 c15718, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f26432;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c15718.f48482 = typedArray.getFloat(index, c15718.f48482);
                    break;
                case 2:
                    c15718.f48486 = typedArray.getDimension(index, c15718.f48486);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    c15718.f48485 = typedArray.getFloat(index, c15718.f48485);
                    break;
                case 5:
                    c15718.f48479 = typedArray.getFloat(index, c15718.f48479);
                    break;
                case 6:
                    c15718.f48478 = typedArray.getFloat(index, c15718.f48478);
                    break;
                case 7:
                    c15718.f48481 = typedArray.getFloat(index, c15718.f48481);
                    break;
                case 8:
                    c15718.f48474 = typedArray.getFloat(index, c15718.f48474);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C10075.f30305) {
                        int resourceId = typedArray.getResourceId(index, c15718.f15713);
                        c15718.f15713 = resourceId;
                        if (resourceId == -1) {
                            c15718.f15714 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c15718.f15714 = typedArray.getString(index);
                    } else {
                        c15718.f15713 = typedArray.getResourceId(index, c15718.f15713);
                    }
                    break;
                case 12:
                    c15718.f15712 = typedArray.getInt(index, c15718.f15712);
                    break;
                case 13:
                    c15718.f48480 = typedArray.getInteger(index, c15718.f48480);
                    break;
                case 14:
                    c15718.f48473 = typedArray.getFloat(index, c15718.f48473);
                    break;
                case 15:
                    c15718.f48483 = typedArray.getDimension(index, c15718.f48483);
                    break;
                case 16:
                    c15718.f48484 = typedArray.getDimension(index, c15718.f48484);
                    break;
                case 17:
                    c15718.f48471 = typedArray.getDimension(index, c15718.f48471);
                    break;
                case 18:
                    c15718.f48476 = typedArray.getFloat(index, c15718.f48476);
                    break;
                case 19:
                    c15718.f48477 = typedArray.getInt(index, c15718.f48477);
                    break;
                case 20:
                    c15718.f48472 = typedArray.getFloat(index, c15718.f48472);
                    break;
                case 21:
                    if (typedArray.peekValue(index).type == 5) {
                        c15718.f48475 = typedArray.getDimension(index, c15718.f48475);
                    } else {
                        c15718.f48475 = typedArray.getFloat(index, c15718.f48475);
                    }
                    break;
            }
        }
    }
}
