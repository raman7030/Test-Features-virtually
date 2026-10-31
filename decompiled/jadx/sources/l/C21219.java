package l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.᩸֡, reason: contains not printable characters */
/* JADX INFO: compiled from: H1BK */
/* JADX INFO: loaded from: classes4.dex */
public final class C21219 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static SparseIntArray f68377;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f68377 = sparseIntArray;
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m48170(C21924 c21924, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f68377;
            switch (sparseIntArray.get(index)) {
                case 1:
                    if (C10075.f30305) {
                        int resourceId = typedArray.getResourceId(index, c21924.f15713);
                        c21924.f15713 = resourceId;
                        if (resourceId == -1) {
                            c21924.f15714 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c21924.f15714 = typedArray.getString(index);
                    } else {
                        c21924.f15713 = typedArray.getResourceId(index, c21924.f15713);
                    }
                    break;
                case 2:
                    c21924.f15712 = typedArray.getInt(index, c21924.f15712);
                    break;
                case 3:
                    typedArray.getString(index);
                    break;
                case 4:
                    c21924.f70195 = typedArray.getInteger(index, c21924.f70195);
                    break;
                case 5:
                    c21924.f70192 = typedArray.getInt(index, c21924.f70192);
                    break;
                case 6:
                    c21924.f70187 = typedArray.getFloat(index, c21924.f70187);
                    break;
                case 7:
                    if (typedArray.peekValue(index).type == 5) {
                        c21924.f70190 = typedArray.getDimension(index, c21924.f70190);
                    } else {
                        c21924.f70190 = typedArray.getFloat(index, c21924.f70190);
                    }
                    break;
                case 8:
                    c21924.f70196 = typedArray.getInt(index, c21924.f70196);
                    break;
                case 9:
                    c21924.f70198 = typedArray.getFloat(index, c21924.f70198);
                    break;
                case 10:
                    c21924.f70202 = typedArray.getDimension(index, c21924.f70202);
                    break;
                case 11:
                    c21924.f70201 = typedArray.getFloat(index, c21924.f70201);
                    break;
                case 12:
                    c21924.f70194 = typedArray.getFloat(index, c21924.f70194);
                    break;
                case 13:
                    c21924.f70193 = typedArray.getFloat(index, c21924.f70193);
                    break;
                case 14:
                    c21924.f70189 = typedArray.getFloat(index, c21924.f70189);
                    break;
                case 15:
                    c21924.f70197 = typedArray.getFloat(index, c21924.f70197);
                    break;
                case 16:
                    c21924.f70188 = typedArray.getFloat(index, c21924.f70188);
                    break;
                case 17:
                    c21924.f70199 = typedArray.getDimension(index, c21924.f70199);
                    break;
                case 18:
                    c21924.f70200 = typedArray.getDimension(index, c21924.f70200);
                    break;
                case 19:
                    c21924.f70186 = typedArray.getDimension(index, c21924.f70186);
                    break;
                case 20:
                    c21924.f70191 = typedArray.getFloat(index, c21924.f70191);
                    break;
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
            }
        }
    }
}
