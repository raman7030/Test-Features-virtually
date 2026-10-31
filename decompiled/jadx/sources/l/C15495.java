package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.drawable.Drawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.IOException;

/* JADX INFO: renamed from: l.ܶ᩸ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C15495 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Bitmap f47380;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f47381;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f47382;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f47383;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Bitmap f47384;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Drawable f47385;

    public C15495(C11197 c11197, CharSequence charSequence, CharSequence charSequence2, byte[] bArr) {
        boolean z;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = m36571(c11197.f33614);
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = "unknown";
        } else {
            z = false;
        }
        this.f47382 = charSequence.toString();
        this.f47381 = charSequence2.toString();
        if (bArr != null) {
            this.f47385 = new C1385(C4925.m14338(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            z = false;
        } else {
            this.f47385 = C0679.m2754((((long) charSequence2.hashCode()) & 4294967295L) | (((long) charSequence.hashCode()) << 32));
        }
        this.f47383 = z;
        int i = Build.VERSION.SDK_INT;
        this.f47380 = m36570(this.f47385, 512, 512, 33 <= i && i <= 35);
        this.f47384 = m36570(this.f47385, 256, 256, false);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m36570(Drawable drawable, int i, int i2, boolean z) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        if (z) {
            canvas.drawColor(1073741824);
        }
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8441 m36572(C11197 c11197, InterfaceC17889 interfaceC17889) throws IOException {
        AbstractC15440 abstractC15440Mo24433 = interfaceC17889.mo24433();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            ParcelFileDescriptor parcelFileDescriptorMo27921 = abstractC15440Mo24433.mo27921("r");
            try {
                if (parcelFileDescriptorMo27921 == null) {
                    throw new IOException("Music file descriptor is unavailable");
                }
                mediaMetadataRetriever.setDataSource(parcelFileDescriptorMo27921.getFileDescriptor());
                C15495 c15495 = new C15495(c11197, mediaMetadataRetriever);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                long jMax = 0;
                if (!TextUtils.isEmpty(strExtractMetadata)) {
                    try {
                        jMax = Math.max(Long.parseLong(strExtractMetadata), 0L);
                    } catch (NumberFormatException unused) {
                    }
                }
                parcelFileDescriptorMo27921.close();
                mediaMetadataRetriever.release();
                if (c15495.f47383) {
                    C23411 c23411M36513 = abstractC15440Mo24433.m36513("r");
                    try {
                        C9398 c9398M24229 = C9398.m24229(c23411M36513);
                        if (c9398M24229 != null) {
                            c15495 = new C15495(c11197, c9398M24229.m24233(), c9398M24229.m24231(), c9398M24229.m24232());
                        }
                        c23411M36513.close();
                    } catch (Throwable th) {
                        try {
                            c23411M36513.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return new C8441(c15495, jMax);
            } catch (Throwable th3) {
                if (parcelFileDescriptorMo27921 != null) {
                    try {
                        parcelFileDescriptorMo27921.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (Throwable th5) {
            mediaMetadataRetriever.release();
            throw th5;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15495(C11197 c11197, MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(7);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(3);
        this(c11197, strExtractMetadata, TextUtils.isEmpty(strExtractMetadata2) ? mediaMetadataRetriever.extractMetadata(2) : strExtractMetadata2, mediaMetadataRetriever.getEmbeddedPicture());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m36571(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            iLastIndexOf = str.length();
        }
        return C6554.m18061(50, str.substring(0, iLastIndexOf));
    }
}
