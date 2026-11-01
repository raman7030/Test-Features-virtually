package p067l;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: l.ܰۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: PANW */
/* JADX INFO: loaded from: classes3.dex */
public final class C15465 {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ C15465 f44167 = new C15465();

    /* JADX INFO: renamed from: ۧ */
    public static InterfaceC4223 f44168;

    static {
        C9021.m20892(InterfaceC9431.class).m19594();
        f44168 = C23928.f75949;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C19646 m35207(Context context) {
        InterfaceC13455 c12785;
        C8917 c8917 = C8917.f24162;
        C14795 c14795 = null;
        try {
            C6079.f15287.getClass();
            WindowLayoutComponent windowLayoutComponentM13838 = C6079.m13838();
            c12785 = windowLayoutComponentM13838 == null ? null : new C12785(windowLayoutComponentM13838);
        } catch (Throwable unused) {
        }
        if (c12785 == null) {
            if (C8090.f21335 == null) {
                ReentrantLock reentrantLock = C8090.f21336;
                reentrantLock.lock();
                try {
                    if (C8090.f21335 == null) {
                        try {
                            C14540 c14540M38084 = C16806.m38084();
                            if (c14540M38084 != null && c14540M38084.compareTo(C14540.f41486) >= 0) {
                                C14795 c14796 = new C14795(context);
                                if (c14796.m33779()) {
                                    c14795 = c14796;
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                        C8090.f21335 = new C8090(c14795);
                    }
                    C10027 c10027 = C10027.f27775;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            c12785 = C8090.f21335;
            C13045.m29861(c12785);
        }
        C19646 c19646 = new C19646(c8917, c12785);
        ((C23928) f44168).getClass();
        return c19646;
    }
}
