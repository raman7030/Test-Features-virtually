package p067l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.۫۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBJR */
/* JADX INFO: loaded from: classes3.dex */
public final class C14158 {

    /* JADX INFO: renamed from: ֫ */
    public final boolean[] f40372;

    /* JADX INFO: renamed from: ۧ */
    public final int f40373;

    public C14158(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f40373 = width;
        this.f40372 = new boolean[width * height];
        int[] iArr = new int[width];
        for (int i = 0; i < height; i++) {
            bitmap.getPixels(iArr, 0, width, 0, i, width, 1);
            int i2 = i * width;
            for (int i3 = 0; i3 < width; i3++) {
                this.f40372[i2 + i3] = (iArr[i3] >>> 24) >= C12147.f33958;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m32635(int i, int i2) {
        return this.f40372[(i2 * this.f40373) + i];
    }
}
