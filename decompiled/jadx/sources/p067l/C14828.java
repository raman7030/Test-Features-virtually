package p067l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.۬۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WU */
/* JADX INFO: loaded from: classes3.dex */
public final class C14828 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f42297 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final C0907 f42298 = new C21535(Math.min((int) (Runtime.getRuntime().maxMemory() / 6), 10485760));

    /* JADX INFO: renamed from: ֫ */
    public static void m33866(String str, Bitmap bitmap) {
        C15370 c15370M28835 = null;
        if (str == null || bitmap == null) {
            throw null;
        }
        f42298.m6786(str, bitmap);
        try {
            c15370M28835 = C5441.f12975.m28835(str);
            if (c15370M28835 == null) {
                return;
            }
            InterfaceC12257 interfaceC12257M54977 = C25037.m54977(c15370M28835.m35032(0));
            bitmap.compress(Bitmap.CompressFormat.PNG, 80, interfaceC12257M54977.mo28279());
            interfaceC12257M54977.close();
            c15370M28835.m35034();
        } catch (IOException unused) {
            if (c15370M28835 != null) {
                try {
                    c15370M28835.m35033();
                } catch (IOException unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m33865(String str, InterfaceC6782 interfaceC6782, int i) throws TimeoutException {
        Bitmap bitmapM33864 = m33864(str);
        if (bitmapM33864 != null) {
            return bitmapM33864;
        }
        Future futureSubmit = C4081.f8988.submit(new CallableC23546(interfaceC6782));
        try {
            bitmapM33864 = (Bitmap) futureSubmit.get(i, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            futureSubmit.cancel(true);
            throw e;
        } catch (Exception unused) {
        }
        if (bitmapM33864 != null) {
            m33866(str, bitmapM33864);
        }
        return bitmapM33864;
    }

    /* JADX INFO: renamed from: ۧ */
    public static Bitmap m33867(String str) {
        return (Bitmap) f42298.m6785(str);
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m33868(String str) {
        str.getClass();
        try {
            return (f42298.m6785(str) == null && C5441.f12975.m28839(str) == null) ? false : true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static Bitmap m33864(String str) {
        str.getClass();
        C0907 c0907 = f42298;
        Bitmap bitmapDecodeStream = (Bitmap) c0907.m6785(str);
        if (bitmapDecodeStream == null) {
            try {
                C3798 c3798M28839 = C5441.f12975.m28839(str);
                if (c3798M28839 != null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(C25037.m54976(c3798M28839.m7411(0)).mo14212());
                    c3798M28839.close();
                    if (bitmapDecodeStream != null) {
                        c0907.m6786(str, bitmapDecodeStream);
                    }
                }
            } catch (IOException unused) {
            }
        }
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: ֫ */
    public static int m33863(Bitmap bitmap) {
        int i;
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (config == Bitmap.Config.ALPHA_8) {
            i = 1;
        } else {
            i = (config == Bitmap.Config.ARGB_4444 || config == Bitmap.Config.RGB_565) ? 2 : 4;
        }
        return width * height * i;
    }
}
