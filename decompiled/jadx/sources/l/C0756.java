package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.֨֡, reason: contains not printable characters */
/* JADX INFO: compiled from: B1BC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0756 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f2812;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2812 = sparseIntArray;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(11, 2);
        sparseIntArray.append(7, 4);
        sparseIntArray.append(8, 5);
        sparseIntArray.append(9, 6);
        sparseIntArray.append(1, 19);
        sparseIntArray.append(2, 20);
        sparseIntArray.append(5, 7);
        sparseIntArray.append(17, 8);
        sparseIntArray.append(16, 9);
        sparseIntArray.append(15, 10);
        sparseIntArray.append(13, 12);
        sparseIntArray.append(12, 13);
        sparseIntArray.append(6, 14);
        sparseIntArray.append(3, 15);
        sparseIntArray.append(4, 16);
        sparseIntArray.append(10, 17);
        sparseIntArray.append(14, 18);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m2896(C7812 c7812, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f2812;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c7812.f24134 = typedArray.getFloat(index, c7812.f24134);
                    break;
                case 2:
                    c7812.f24138 = typedArray.getDimension(index, c7812.f24138);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    c7812.f24130 = typedArray.getFloat(index, c7812.f24130);
                    break;
                case 5:
                    c7812.f24133 = typedArray.getFloat(index, c7812.f24133);
                    break;
                case 6:
                    c7812.f24126 = typedArray.getFloat(index, c7812.f24126);
                    break;
                case 7:
                    c7812.f24127 = typedArray.getFloat(index, c7812.f24127);
                    break;
                case 8:
                    c7812.f24136 = typedArray.getFloat(index, c7812.f24136);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C10075.f30305) {
                        int resourceId = typedArray.getResourceId(index, c7812.f15713);
                        c7812.f15713 = resourceId;
                        if (resourceId == -1) {
                            c7812.f15714 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c7812.f15714 = typedArray.getString(index);
                    } else {
                        c7812.f15713 = typedArray.getResourceId(index, c7812.f15713);
                    }
                    break;
                case 12:
                    c7812.f15712 = typedArray.getInt(index, c7812.f15712);
                    break;
                case 13:
                    c7812.f24132 = typedArray.getInteger(index, c7812.f24132);
                    break;
                case 14:
                    c7812.f24135 = typedArray.getFloat(index, c7812.f24135);
                    break;
                case 15:
                    c7812.f24124 = typedArray.getDimension(index, c7812.f24124);
                    break;
                case 16:
                    c7812.f24128 = typedArray.getDimension(index, c7812.f24128);
                    break;
                case 17:
                    c7812.f24125 = typedArray.getDimension(index, c7812.f24125);
                    break;
                case 18:
                    c7812.f24131 = typedArray.getFloat(index, c7812.f24131);
                    break;
                case 19:
                    c7812.f24129 = typedArray.getDimension(index, c7812.f24129);
                    break;
                case 20:
                    c7812.f24137 = typedArray.getDimension(index, c7812.f24137);
                    break;
            }
        }
    }
}
