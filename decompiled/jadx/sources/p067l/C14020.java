package p067l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.۫۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9LQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C14020 {

    /* JADX INFO: renamed from: ֫ */
    public int[] f39535;

    /* JADX INFO: renamed from: ܽ */
    public ArrayList f39537 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ */
    public ArrayList f39538 = new ArrayList();

    /* JADX INFO: renamed from: ۧ */
    public Rect f39536 = new Rect();

    /* JADX INFO: renamed from: ֫ */
    public final byte[] m31819() {
        ArrayList<C6644> arrayList = this.f39537;
        int size = (arrayList.size() * 8) + 32;
        ArrayList<C6644> arrayList2 = this.f39538;
        C11996 c11996 = new C11996((this.f39535.length * 4) + (arrayList2.size() * 8) + size);
        c11996.writeByte(0);
        c11996.writeByte(arrayList.size() * 2);
        c11996.writeByte(arrayList2.size() * 2);
        c11996.writeByte(this.f39535.length);
        c11996.writeInt(32);
        c11996.writeInt((arrayList.size() * 8) + 32);
        Rect rect = this.f39536;
        c11996.m27450(rect.left);
        c11996.m27450(rect.right);
        c11996.m27450(rect.top);
        c11996.m27450(rect.bottom);
        c11996.writeInt((arrayList2.size() * 8) + (arrayList.size() * 8) + 32);
        for (C6644 c6644 : arrayList) {
            c11996.m27450(c6644.f17145);
            c11996.m27450(c6644.f17144);
        }
        for (C6644 c6645 : arrayList2) {
            c11996.m27450(c6645.f17145);
            c11996.m27450(c6645.f17144);
        }
        for (int i : this.f39535) {
            c11996.m27450(i);
        }
        return c11996.m27458();
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m31818(Bitmap bitmap) {
        m31817(this.f39537, bitmap.getWidth());
        m31817(this.f39538, bitmap.getHeight());
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m31817(ArrayList arrayList, int i) {
        int i2;
        int size = arrayList.size();
        while (true) {
            size--;
            i2 = 0;
            if (size < 0) {
                break;
            }
            C6644 c6644 = (C6644) arrayList.get(size);
            int i3 = c6644.f17145;
            int i4 = c6644.f17144;
            if (i3 >= i4) {
                arrayList.remove(size);
            } else {
                if (i3 < 0) {
                    c6644.f17145 = 0;
                }
                if (i4 > i) {
                    c6644.f17144 = i;
                }
            }
        }
        Collections.sort(arrayList);
        while (i2 < arrayList.size() - 1) {
            C6644 c6645 = (C6644) arrayList.get(i2);
            int i5 = i2 + 1;
            C6644 c6646 = (C6644) arrayList.get(i5);
            int i6 = c6646.f17145;
            int i7 = c6645.f17144;
            if (i6 <= i7) {
                c6645.f17144 = Math.max(i7, c6646.f17144);
                arrayList.remove(i5);
            } else {
                i2 = i5;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m31820(Bitmap bitmap) {
        ArrayList<C6644> arrayListM31816 = m31816(this.f39537, bitmap.getWidth());
        ArrayList<C6644> arrayListM31817 = m31816(this.f39538, bitmap.getHeight());
        int[] iArr = new int[arrayListM31817.size() * arrayListM31816.size()];
        int i = 0;
        for (C6644 c6644 : arrayListM31817) {
            for (C6644 c6645 : arrayListM31816) {
                int i2 = c6645.f17145;
                int i3 = c6645.f17144;
                int i4 = c6644.f17145;
                int i5 = c6644.f17144;
                int pixel = bitmap.getPixel(i2, i4);
                while (true) {
                    if (i2 >= i3) {
                        int pixel2 = bitmap.getPixel(c6645.f17145, c6644.f17145);
                        if (Color.alpha(pixel2) == 0) {
                            pixel2 = 0;
                        }
                        iArr[i] = pixel2;
                        break;
                    }
                    for (int i6 = i4; i6 < i5; i6++) {
                        if (pixel != bitmap.getPixel(i2, i6)) {
                            iArr[i] = 1;
                            break;
                        }
                    }
                    i2++;
                }
                i++;
            }
        }
        this.f39535 = iArr;
    }

    /* JADX INFO: renamed from: ֫ */
    public static ArrayList m31816(ArrayList arrayList, int i) {
        int i2;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && arrayList.size() != 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C6644 c6644 = (C6644) arrayList.get(i4);
                if (i4 == 0 && (i3 = c6644.f17145) != 0) {
                    arrayList2.add(new C6644(0, i3));
                } else if (i4 > 0) {
                    arrayList2.add(new C6644(((C6644) arrayList.get(i4 - 1)).f17144, c6644.f17145));
                }
                arrayList2.add(new C6644(c6644.f17145, c6644.f17144));
                if (i4 == arrayList.size() - 1 && (i2 = c6644.f17144) < i) {
                    arrayList2.add(new C6644(i2, i));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫ */
    public static Rect m31815(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Rect rect = new Rect();
        if (!arrayList.isEmpty()) {
            rect.left = ((C6644) arrayList.get(0)).f17145;
            rect.right = i - ((C6644) C20013.m45383(arrayList, 1)).f17144;
        }
        if (!arrayList2.isEmpty()) {
            rect.top = ((C6644) arrayList2.get(0)).f17145;
            rect.bottom = i2 - ((C6644) C20013.m45383(arrayList2, 1)).f17144;
        }
        return rect;
    }

    public final String toString() {
        return "NinePatchChunk{xDivs=" + this.f39537 + ", yDivs=" + this.f39538 + ", padding=" + this.f39536 + ", colors=" + C23573.stream(this.f39535).mapToObj(new C15661(1)).collect(C24205.toList()) + '}';
    }
}
