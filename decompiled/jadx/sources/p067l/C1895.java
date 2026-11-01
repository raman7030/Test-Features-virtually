package p067l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩸֡ */
/* JADX INFO: compiled from: H1BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C1895 {

    /* JADX INFO: renamed from: ֫ */
    public static SparseIntArray f71060;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f71060 = sparseIntArray;
        sparseIntArray.append(13, 1);
        sparseIntArray.append(11, 2);
        sparseIntArray.append(14, 3);
        sparseIntArray.append(10, 4);
        sparseIntArray.append(18, 5);
        sparseIntArray.append(17, 6);
        sparseIntArray.append(16, 7);
        sparseIntArray.append(19, 8);
        sparseIntArray.append(0, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(5, 11);
        sparseIntArray.append(6, 12);
        sparseIntArray.append(7, 13);
        sparseIntArray.append(15, 14);
        sparseIntArray.append(3, 15);
        sparseIntArray.append(4, 16);
        sparseIntArray.append(1, 17);
        sparseIntArray.append(2, 18);
        sparseIntArray.append(8, 19);
        sparseIntArray.append(12, 20);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m50501(C1930 c1930, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f71060;
            switch (sparseIntArray.get(index)) {
                case 1:
                    if (C1342.f33266) {
                        int resourceId = typedArray.getResourceId(index, c1930.f18546);
                        c1930.f18546 = resourceId;
                        if (resourceId == -1) {
                            c1930.f18547 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c1930.f18547 = typedArray.getString(index);
                    } else {
                        c1930.f18546 = typedArray.getResourceId(index, c1930.f18546);
                    }
                    break;
                case 2:
                    c1930.f18545 = typedArray.getInt(index, c1930.f18545);
                    break;
                case 3:
                    typedArray.getString(index);
                    break;
                case 4:
                    c1930.f72907 = typedArray.getInteger(index, c1930.f72907);
                    break;
                case 5:
                    c1930.f72904 = typedArray.getInt(index, c1930.f72904);
                    break;
                case 6:
                    c1930.f72899 = typedArray.getFloat(index, c1930.f72899);
                    break;
                case 7:
                    if (typedArray.peekValue(index).type == 5) {
                        c1930.f72902 = typedArray.getDimension(index, c1930.f72902);
                    } else {
                        c1930.f72902 = typedArray.getFloat(index, c1930.f72902);
                    }
                    break;
                case 8:
                    c1930.f72908 = typedArray.getInt(index, c1930.f72908);
                    break;
                case 9:
                    c1930.f72910 = typedArray.getFloat(index, c1930.f72910);
                    break;
                case 10:
                    c1930.f72914 = typedArray.getDimension(index, c1930.f72914);
                    break;
                case 11:
                    c1930.f72913 = typedArray.getFloat(index, c1930.f72913);
                    break;
                case 12:
                    c1930.f72906 = typedArray.getFloat(index, c1930.f72906);
                    break;
                case 13:
                    c1930.f72905 = typedArray.getFloat(index, c1930.f72905);
                    break;
                case 14:
                    c1930.f72901 = typedArray.getFloat(index, c1930.f72901);
                    break;
                case 15:
                    c1930.f72909 = typedArray.getFloat(index, c1930.f72909);
                    break;
                case 16:
                    c1930.f72900 = typedArray.getFloat(index, c1930.f72900);
                    break;
                case 17:
                    c1930.f72911 = typedArray.getDimension(index, c1930.f72911);
                    break;
                case 18:
                    c1930.f72912 = typedArray.getDimension(index, c1930.f72912);
                    break;
                case 19:
                    c1930.f72898 = typedArray.getDimension(index, c1930.f72898);
                    break;
                case 20:
                    c1930.f72903 = typedArray.getFloat(index, c1930.f72903);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
    }
}
