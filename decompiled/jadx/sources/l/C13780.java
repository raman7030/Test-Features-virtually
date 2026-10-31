package l;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܰۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANW */
/* JADX INFO: loaded from: classes3.dex */
public final class C13780 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ C13780 f41090 = new C13780();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1951 f41091;

    static {
        C6999.m18935(InterfaceC7431.class).m17651();
        f41091 = C22685.f73224;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C18179 m33091(Context context) {
        InterfaceC11665 c10960;
        C6890 c6890 = C6890.f21285;
        C13075 c13075 = null;
        try {
            C3904.f12479.getClass();
            WindowLayoutComponent windowLayoutComponentM11902 = C3904.m11902();
            c10960 = windowLayoutComponentM11902 == null ? null : new C10960(windowLayoutComponentM11902);
        } catch (Throwable unused) {
        }
        if (c10960 == null) {
            if (C6020.f18480 == null) {
                ReentrantLock reentrantLock = C6020.f18481;
                reentrantLock.lock();
                try {
                    if (C6020.f18480 == null) {
                        try {
                            C12807 c12807M35924 = C15191.m35924();
                            if (c12807M35924 != null && c12807M35924.compareTo(C12807.f38444) >= 0) {
                                C13075 c13076 = new C13075(context);
                                if (c13076.m31691()) {
                                    c13075 = c13076;
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                        C6020.f18480 = new C6020(c13075);
                    }
                    C8058 c8058 = C8058.f24861;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            c10960 = C6020.f18480;
            C11233.m27799(c10960);
        }
        C18179 c18179 = new C18179(c6890, c10960);
        ((C22685) f41091).getClass();
        return c18179;
    }
}
