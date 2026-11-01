package p067l;

import android.graphics.Bitmap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۘۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D27M */
/* JADX INFO: loaded from: classes3.dex */
public class C5880 implements InterfaceC12665 {

    /* JADX INFO: renamed from: ֫ */
    public static final C0907 f14457 = new C0907(500);

    /* JADX INFO: renamed from: ܽ */
    public static final C0907 f14459 = new C0907(500);

    /* JADX INFO: renamed from: ۧ */
    public static final C5880 f14458 = new C5880();

    /* JADX INFO: renamed from: ֫ */
    public String mo11391(InterfaceC19370 interfaceC19370, int i) {
        return null;
    }

    @Override // p067l.InterfaceC12665
    /* JADX INFO: renamed from: ۧ */
    public int mo11393(InterfaceC19370 interfaceC19370) {
        return 0;
    }

    @Override // p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public C21265 mo13204(InterfaceC19370 interfaceC19370) {
        return C5463.m12008(interfaceC19370);
    }

    @Override // p067l.InterfaceC12665
    /* JADX INFO: renamed from: ֫ */
    public C13596 mo11392(AbstractC18422 abstractC18422, InterfaceC19370 interfaceC19370, int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫ */
    public final C13596 m13203(InterfaceC19370 interfaceC19370, int i, boolean z) {
        String strMo11391;
        if ((i == 1 || i == 2) && (strMo11391 = mo11391(interfaceC19370, i)) != null) {
            return C13596.m30924(z ? C14828.m33867(strMo11391) : C14828.m33864(strMo11391));
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m13198(String str) {
        if (m13199(str)) {
            return true;
        }
        return C14828.m33868(str);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13596 m13196(String str, C21265 c21265, boolean z, InterfaceC6782 interfaceC6782) {
        if (z && m13199(str)) {
            return c21265.f66886;
        }
        Bitmap bitmapM33864 = C14828.m33864(str);
        if (bitmapM33864 == null) {
            Future futureSubmit = C4081.f8986.submit(new CallableC23546(interfaceC6782));
            try {
                bitmapM33864 = (Bitmap) futureSubmit.get(5L, TimeUnit.SECONDS);
            } catch (TimeoutException unused) {
                futureSubmit.cancel(true);
            } catch (Exception unused2) {
            }
            if (bitmapM33864 != null) {
                C14828.m33866(str, bitmapM33864);
            }
        }
        C13596 c13596M30924 = C13596.m30924(bitmapM33864);
        if (c13596M30924 == null) {
            c13596M30924 = c21265.f66886;
            if (z) {
                f14457.m6786(str, Boolean.TRUE);
            }
        }
        return c13596M30924;
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m13202(String str) {
        f14457.m6786(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ۧ */
    public static boolean m13199(String str) {
        return f14457.m6785(str) != null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13197() {
        f14459.m6788(-1);
    }

    /* JADX INFO: renamed from: ܿ */
    public static void m13201(String str) {
        C0907 c0907 = f14459;
        C4539 c4539 = (C4539) c0907.m6785(str);
        if (c4539 == null) {
            c4539 = new C4539(0);
            c0907.m6786(str, c4539);
        }
        c4539.f10168++;
    }

    /* JADX INFO: renamed from: ܽ */
    public static boolean m13200(String str) {
        C4539 c4539 = (C4539) f14459.m6785(str);
        return c4539 != null && c4539.f10168 >= 2;
    }
}
