package l;

import android.graphics.Bitmap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: l.ۘۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D27M */
/* JADX INFO: loaded from: classes3.dex */
public class C3695 implements InterfaceC10834 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C1315 f11655 = new C1315(500);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final C1315 f11657 = new C1315(500);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C3695 f11656 = new C3695();

    /* JADX INFO: renamed from: ֫ */
    public String mo9349(InterfaceC17889 interfaceC17889, int i) {
        return null;
    }

    @Override // l.InterfaceC10834
    /* JADX INFO: renamed from: ۧ */
    public int mo9351(InterfaceC17889 interfaceC17889) {
        return 0;
    }

    @Override // l.InterfaceC10834
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C19883 mo11258(InterfaceC17889 interfaceC17889) {
        return C3256.m9975(interfaceC17889);
    }

    @Override // l.InterfaceC10834
    /* JADX INFO: renamed from: ֫ */
    public C11813 mo9350(AbstractC16891 abstractC16891, InterfaceC17889 interfaceC17889, int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C11813 m11257(InterfaceC17889 interfaceC17889, int i, boolean z) {
        String strMo9349;
        if ((i == 1 || i == 2) && (strMo9349 = mo9349(interfaceC17889, i)) != null) {
            return C11813.m28875(z ? C13110.m31776(strMo9349) : C13110.m31773(strMo9349));
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m11252(String str) {
        if (m11253(str)) {
            return true;
        }
        return C13110.m31777(str);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11813 m11250(String str, C19883 c19883, boolean z, InterfaceC4644 interfaceC4644) {
        if (z && m11253(str)) {
            return c19883.f64250;
        }
        Bitmap bitmapM31773 = C13110.m31773(str);
        if (bitmapM31773 == null) {
            Future futureSubmit = C1802.f6207.submit(new CallableC22283(interfaceC4644));
            try {
                bitmapM31773 = (Bitmap) futureSubmit.get(5L, TimeUnit.SECONDS);
            } catch (TimeoutException unused) {
                futureSubmit.cancel(true);
            } catch (Exception unused2) {
            }
            if (bitmapM31773 != null) {
                C13110.m31775(str, bitmapM31773);
            }
        }
        C11813 c11813M28875 = C11813.m28875(bitmapM31773);
        if (c11813M28875 == null) {
            c11813M28875 = c19883.f64250;
            if (z) {
                f11655.m4554(str, Boolean.TRUE);
            }
        }
        return c11813M28875;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m11256(String str) {
        f11655.m4554(str, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m11253(String str) {
        return f11655.m4553(str) != null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m11251() {
        f11657.m4556(-1);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static void m11255(String str) {
        C1315 c1315 = f11657;
        C2284 c2284 = (C2284) c1315.m4553(str);
        if (c2284 == null) {
            c2284 = new C2284(0);
            c1315.m4554(str, c2284);
        }
        c2284.f7382++;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean m11254(String str) {
        C2284 c2284 = (C2284) f11657.m4553(str);
        return c2284 != null && c2284.f7382 >= 2;
    }
}
