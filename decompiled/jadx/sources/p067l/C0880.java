package p067l;

import android.content.res.TypedArray;
import android.util.SparseIntArray;

/* JADX INFO: renamed from: l.֨֡ */
/* JADX INFO: compiled from: B1BC */
/* JADX INFO: loaded from: classes2.dex */
public final class C0880 {

    /* JADX INFO: renamed from: ֫ */
    public static SparseIntArray f5584;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5584 = sparseIntArray;
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

    /* JADX INFO: renamed from: ֫ */
    public static void m5225(C1230 c1230, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            SparseIntArray sparseIntArray = f5584;
            switch (sparseIntArray.get(index)) {
                case 1:
                    c1230.f27050 = typedArray.getFloat(index, c1230.f27050);
                    break;
                case 2:
                    c1230.f27054 = typedArray.getDimension(index, c1230.f27054);
                    break;
                case 3:
                case 11:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    break;
                case 4:
                    c1230.f27046 = typedArray.getFloat(index, c1230.f27046);
                    break;
                case 5:
                    c1230.f27049 = typedArray.getFloat(index, c1230.f27049);
                    break;
                case 6:
                    c1230.f27042 = typedArray.getFloat(index, c1230.f27042);
                    break;
                case 7:
                    c1230.f27043 = typedArray.getFloat(index, c1230.f27043);
                    break;
                case 8:
                    c1230.f27052 = typedArray.getFloat(index, c1230.f27052);
                    break;
                case 9:
                    typedArray.getString(index);
                    break;
                case 10:
                    if (C1342.f33266) {
                        int resourceId = typedArray.getResourceId(index, c1230.f18546);
                        c1230.f18546 = resourceId;
                        if (resourceId == -1) {
                            c1230.f18547 = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        c1230.f18547 = typedArray.getString(index);
                    } else {
                        c1230.f18546 = typedArray.getResourceId(index, c1230.f18546);
                    }
                    break;
                case 12:
                    c1230.f18545 = typedArray.getInt(index, c1230.f18545);
                    break;
                case 13:
                    c1230.f27048 = typedArray.getInteger(index, c1230.f27048);
                    break;
                case 14:
                    c1230.f27051 = typedArray.getFloat(index, c1230.f27051);
                    break;
                case 15:
                    c1230.f27040 = typedArray.getDimension(index, c1230.f27040);
                    break;
                case 16:
                    c1230.f27044 = typedArray.getDimension(index, c1230.f27044);
                    break;
                case 17:
                    c1230.f27041 = typedArray.getDimension(index, c1230.f27041);
                    break;
                case 18:
                    c1230.f27047 = typedArray.getFloat(index, c1230.f27047);
                    break;
                case 19:
                    c1230.f27045 = typedArray.getDimension(index, c1230.f27045);
                    break;
                case 20:
                    c1230.f27053 = typedArray.getDimension(index, c1230.f27053);
                    break;
            }
        }
    }
}
