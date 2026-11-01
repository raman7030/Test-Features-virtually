package p067l;

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
public final class C17095 {

    /* JADX INFO: renamed from: ֫ */
    public final Bitmap f50511;

    /* JADX INFO: renamed from: ۧ */
    public final String f50512;

    /* JADX INFO: renamed from: ܳ */
    public final String f50513;

    /* JADX INFO: renamed from: ܽ */
    public final boolean f50514;

    /* JADX INFO: renamed from: ܿ */
    public final Bitmap f50515;

    /* JADX INFO: renamed from: ᩳ */
    public Drawable f50516;

    public C17095(C13010 c13010, CharSequence charSequence, CharSequence charSequence2, byte[] bArr) {
        boolean z;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = m38730(c13010.f36613);
            z = true;
        } else {
            z = false;
        }
        if (TextUtils.isEmpty(charSequence2)) {
            charSequence2 = "unknown";
        } else {
            z = false;
        }
        this.f50513 = charSequence.toString();
        this.f50512 = charSequence2.toString();
        if (bArr != null) {
            this.f50516 = new C3685(C7050.m16235(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            z = false;
        } else {
            this.f50516 = C3014.m5093((((long) charSequence2.hashCode()) & 4294967295L) | (((long) charSequence.hashCode()) << 32));
        }
        this.f50514 = z;
        int i = Build.VERSION.SDK_INT;
        this.f50511 = m38729(this.f50516, 512, 512, 33 <= i && i <= 35);
        this.f50515 = m38729(this.f50516, 256, 256, false);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m38729(Drawable drawable, int i, int i2, boolean z) {
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

    /* JADX INFO: renamed from: ֫ */
    public static C10391 m38731(C13010 c13010, InterfaceC19370 interfaceC19370) throws IOException {
        AbstractC17043 abstractC17043Mo26445 = interfaceC19370.mo26445();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            ParcelFileDescriptor parcelFileDescriptorMo29982 = abstractC17043Mo26445.mo29982("r");
            try {
                if (parcelFileDescriptorMo29982 == null) {
                    throw new IOException("Music file descriptor is unavailable");
                }
                mediaMetadataRetriever.setDataSource(parcelFileDescriptorMo29982.getFileDescriptor());
                C17095 c17095 = new C17095(c13010, mediaMetadataRetriever);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                long jMax = 0;
                if (!TextUtils.isEmpty(strExtractMetadata)) {
                    try {
                        jMax = Math.max(Long.parseLong(strExtractMetadata), 0L);
                    } catch (NumberFormatException unused) {
                    }
                }
                parcelFileDescriptorMo29982.close();
                mediaMetadataRetriever.release();
                if (c17095.f50514) {
                    C24618 c24618M38671 = abstractC17043Mo26445.m38671("r");
                    try {
                        C11300 c11300M26239 = C11300.m26239(c24618M38671);
                        if (c11300M26239 != null) {
                            c17095 = new C17095(c13010, c11300M26239.m26243(), c11300M26239.m26241(), c11300M26239.m26242());
                        }
                        c24618M38671.close();
                    } catch (Throwable th) {
                        try {
                            c24618M38671.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                return new C10391(c17095, jMax);
            } catch (Throwable th3) {
                if (parcelFileDescriptorMo29982 != null) {
                    try {
                        parcelFileDescriptorMo29982.close();
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
    public C17095(C13010 c13010, MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(7);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(3);
        this(c13010, strExtractMetadata, TextUtils.isEmpty(strExtractMetadata2) ? mediaMetadataRetriever.extractMetadata(2) : strExtractMetadata2, mediaMetadataRetriever.getEmbeddedPicture());
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m38730(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            iLastIndexOf = str.length();
        }
        return C8597.m20011(50, str.substring(0, iLastIndexOf));
    }
}
