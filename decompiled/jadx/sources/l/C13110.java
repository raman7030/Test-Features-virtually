package l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.۬۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z3WU */
/* JADX INFO: loaded from: classes3.dex */
public final class C13110 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f39245 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C1315 f39246 = new C20167(Math.min((int) (Runtime.getRuntime().maxMemory() / 6), 10485760));

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m31775(String str, Bitmap bitmap) {
        C13680 c13680M26796 = null;
        if (str == null || bitmap == null) {
            throw null;
        }
        f39246.m4554(str, bitmap);
        try {
            c13680M26796 = C3233.f10168.m26796(str);
            if (c13680M26796 == null) {
                return;
            }
            InterfaceC10405 interfaceC10405M52568 = C23852.m52568(c13680M26796.m32917(0));
            bitmap.compress(Bitmap.CompressFormat.PNG, 80, interfaceC10405M52568.mo26250());
            interfaceC10405M52568.close();
            c13680M26796.m32919();
        } catch (IOException unused) {
            if (c13680M26796 != null) {
                try {
                    c13680M26796.m32918();
                } catch (IOException unused2) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m31774(String str, InterfaceC4644 interfaceC4644, int i) throws TimeoutException {
        Bitmap bitmapM31773 = m31773(str);
        if (bitmapM31773 != null) {
            return bitmapM31773;
        }
        Future futureSubmit = C1802.f6209.submit(new CallableC22283(interfaceC4644));
        try {
            bitmapM31773 = (Bitmap) futureSubmit.get(i, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            futureSubmit.cancel(true);
            throw e;
        } catch (Exception unused) {
        }
        if (bitmapM31773 != null) {
            m31775(str, bitmapM31773);
        }
        return bitmapM31773;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Bitmap m31776(String str) {
        return (Bitmap) f39246.m4553(str);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m31777(String str) {
        str.getClass();
        try {
            return (f39246.m4553(str) == null && C3233.f10168.m26800(str) == null) ? false : true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Bitmap m31773(String str) {
        str.getClass();
        C1315 c1315 = f39246;
        Bitmap bitmapDecodeStream = (Bitmap) c1315.m4553(str);
        if (bitmapDecodeStream == null) {
            try {
                C1505 c1505M26800 = C3233.f10168.m26800(str);
                if (c1505M26800 != null) {
                    bitmapDecodeStream = BitmapFactory.decodeStream(C23852.m52567(c1505M26800.m5185(0)).mo12307());
                    c1505M26800.close();
                    if (bitmapDecodeStream != null) {
                        c1315.m4554(str, bitmapDecodeStream);
                    }
                }
            } catch (IOException unused) {
            }
        }
        return bitmapDecodeStream;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m31772(Bitmap bitmap) {
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
