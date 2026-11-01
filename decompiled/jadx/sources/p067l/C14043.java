package p067l;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۫۠ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V2SC */
/* JADX INFO: loaded from: classes3.dex */
public final class C14043 {

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap f39606;

    /* JADX INFO: renamed from: ۧ */
    public final ArrayList f39607;

    /* JADX INFO: renamed from: ܳ */
    public final ArrayList f39608;

    /* JADX INFO: renamed from: ܽ */
    public int f39609;

    /* JADX INFO: renamed from: ܿ */
    public int f39610;

    /* JADX INFO: renamed from: ᩳ */
    public int f39611;

    public C14043(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.f39608 = arrayList;
        this.f39609 = 16;
        this.f39611 = 12544;
        this.f39610 = -1;
        ArrayList arrayList2 = new ArrayList();
        this.f39607 = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(C13373.f37520);
        this.f39606 = bitmap;
        arrayList.add(C24101.f76516);
        arrayList.add(C24101.f76515);
        arrayList.add(C24101.f76513);
        arrayList.add(C24101.f76512);
        arrayList.add(C24101.f76511);
        arrayList.add(C24101.f76514);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13373 m31878() {
        int iMax;
        Bitmap bitmap = this.f39606;
        if (bitmap == null) {
            throw new AssertionError();
        }
        double dSqrt = -1.0d;
        int i = this.f39611;
        if (i > 0) {
            int height = bitmap.getHeight() * bitmap.getWidth();
            if (height > i) {
                dSqrt = Math.sqrt(((double) i) / ((double) height));
            }
        } else {
            int i2 = this.f39610;
            if (i2 > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i2) {
                dSqrt = ((double) i2) / ((double) iMax);
            }
        }
        Bitmap bitmapCreateScaledBitmap = dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        int width = bitmapCreateScaledBitmap.getWidth();
        int height2 = bitmapCreateScaledBitmap.getHeight();
        int[] iArr = new int[width * height2];
        bitmapCreateScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
        ArrayList arrayList = this.f39607;
        C5326 c5326 = new C5326(iArr, this.f39609, arrayList.isEmpty() ? null : (InterfaceC12032[]) arrayList.toArray(new InterfaceC12032[arrayList.size()]));
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        C13373 c13373 = new C13373(c5326.f12530, this.f39608);
        c13373.m30512();
        return c13373;
    }
}
