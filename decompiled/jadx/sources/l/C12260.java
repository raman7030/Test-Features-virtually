package l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: l.۫۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: C9LQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12260 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f36518;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public ArrayList f36520 = new ArrayList();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ArrayList f36521 = new ArrayList();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Rect f36519 = new Rect();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] m29757() {
        ArrayList<C4499> arrayList = this.f36520;
        int size = (arrayList.size() * 8) + 32;
        ArrayList<C4499> arrayList2 = this.f36521;
        C10130 c10130 = new C10130((this.f36518.length * 4) + (arrayList2.size() * 8) + size);
        c10130.writeByte(0);
        c10130.writeByte(arrayList.size() * 2);
        c10130.writeByte(arrayList2.size() * 2);
        c10130.writeByte(this.f36518.length);
        c10130.writeInt(32);
        c10130.writeInt((arrayList.size() * 8) + 32);
        Rect rect = this.f36519;
        c10130.m25430(rect.left);
        c10130.m25430(rect.right);
        c10130.m25430(rect.top);
        c10130.m25430(rect.bottom);
        c10130.writeInt((arrayList2.size() * 8) + (arrayList.size() * 8) + 32);
        for (C4499 c4499 : arrayList) {
            c10130.m25430(c4499.f14318);
            c10130.m25430(c4499.f14317);
        }
        for (C4499 c44910 : arrayList2) {
            c10130.m25430(c44910.f14318);
            c10130.m25430(c44910.f14317);
        }
        for (int i : this.f36518) {
            c10130.m25430(i);
        }
        return c10130.m25438();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m29756(Bitmap bitmap) {
        m29755(this.f36520, bitmap.getWidth());
        m29755(this.f36521, bitmap.getHeight());
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m29755(ArrayList arrayList, int i) {
        int i2;
        int size = arrayList.size();
        while (true) {
            size--;
            i2 = 0;
            if (size < 0) {
                break;
            }
            C4499 c4499 = (C4499) arrayList.get(size);
            int i3 = c4499.f14318;
            int i4 = c4499.f14317;
            if (i3 >= i4) {
                arrayList.remove(size);
            } else {
                if (i3 < 0) {
                    c4499.f14318 = 0;
                }
                if (i4 > i) {
                    c4499.f14317 = i;
                }
            }
        }
        Collections.sort(arrayList);
        while (i2 < arrayList.size() - 1) {
            C4499 c44910 = (C4499) arrayList.get(i2);
            int i5 = i2 + 1;
            C4499 c44911 = (C4499) arrayList.get(i5);
            int i6 = c44911.f14318;
            int i7 = c44910.f14317;
            if (i6 <= i7) {
                c44910.f14317 = Math.max(i7, c44911.f14317);
                arrayList.remove(i5);
            } else {
                i2 = i5;
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m29758(Bitmap bitmap) {
        ArrayList<C4499> arrayListM29754 = m29754(this.f36520, bitmap.getWidth());
        ArrayList<C4499> arrayListM29755 = m29754(this.f36521, bitmap.getHeight());
        int[] iArr = new int[arrayListM29755.size() * arrayListM29754.size()];
        int i = 0;
        for (C4499 c4499 : arrayListM29755) {
            for (C4499 c44910 : arrayListM29754) {
                int i2 = c44910.f14318;
                int i3 = c44910.f14317;
                int i4 = c4499.f14318;
                int i5 = c4499.f14317;
                int pixel = bitmap.getPixel(i2, i4);
                while (true) {
                    if (i2 >= i3) {
                        int pixel2 = bitmap.getPixel(c44910.f14318, c4499.f14318);
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
        this.f36518 = iArr;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ArrayList m29754(ArrayList arrayList, int i) {
        int i2;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null && arrayList.size() != 0) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C4499 c4499 = (C4499) arrayList.get(i4);
                if (i4 == 0 && (i3 = c4499.f14318) != 0) {
                    arrayList2.add(new C4499(0, i3));
                } else if (i4 > 0) {
                    arrayList2.add(new C4499(((C4499) arrayList.get(i4 - 1)).f14317, c4499.f14318));
                }
                arrayList2.add(new C4499(c4499.f14318, c4499.f14317));
                if (i4 == arrayList.size() - 1 && (i2 = c4499.f14317) < i) {
                    arrayList2.add(new C4499(i2, i));
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rect m29753(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Rect rect = new Rect();
        if (!arrayList.isEmpty()) {
            rect.left = ((C4499) arrayList.get(0)).f14318;
            rect.right = i - ((C4499) C18566.m43105(arrayList, 1)).f14317;
        }
        if (!arrayList2.isEmpty()) {
            rect.top = ((C4499) arrayList2.get(0)).f14318;
            rect.bottom = i2 - ((C4499) C18566.m43105(arrayList2, 1)).f14317;
        }
        return rect;
    }

    public final String toString() {
        return "NinePatchChunk{xDivs=" + this.f36520 + ", yDivs=" + this.f36521 + ", padding=" + this.f36519 + ", colors=" + C22311.stream(this.f36518).mapToObj(new C13986(1)).collect(C22976.toList()) + '}';
    }
}
