package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.ۘ۠֫, reason: contains not printable characters */
/* JADX INFO: compiled from: LBKC */
/* JADX INFO: loaded from: classes2.dex */
public final class C3810 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m11492(int i, int i2, byte[] bArr) throws IOException {
        BitmapFactory.Options options;
        int i3 = 0;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw C9080.m23440("Could not decode image data", new IllegalStateException());
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            C7605 c7605 = new C7605(byteArrayInputStream, 0);
            byteArrayInputStream.close();
            switch (c7605.m20384()) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = BottomAppBarTopEdgeTreatment.ANGLE_UP;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
