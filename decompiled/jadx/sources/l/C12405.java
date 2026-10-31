package l;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: l.۫۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBJR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12405 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean[] f37357;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f37358;

    public C12405(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        this.f37358 = width;
        this.f37357 = new boolean[width * height];
        int[] iArr = new int[width];
        for (int i = 0; i < height; i++) {
            bitmap.getPixels(iArr, 0, width, 0, i, width, 1);
            int i2 = i * width;
            for (int i3 = 0; i3 < width; i3++) {
                this.f37357[i2 + i3] = (iArr[i3] >>> 24) >= C10289.f30995;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m30571(int i, int i2) {
        return this.f37357[(i2 * this.f37358) + i];
    }
}
