package p067l;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩷֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66S6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C21879 {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m49338(InterfaceC22097 interfaceC22097) {
        return C18743.exists(interfaceC22097, EnumC16060.NOFOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C13693 m49336(InterfaceC22097 interfaceC22097, String str, C8467 c8467, InterfaceC18588 interfaceC18588) throws Throwable {
        InterfaceC22097 interfaceC22097M27247 = C11920.m27247(str, interfaceC22097);
        m49337(interfaceC18588);
        boolean z = true;
        boolean z2 = m49338(interfaceC22097.resolve(str.concat(".dat"))) || m49338(interfaceC22097.resolve(str.concat(".tat"))) || m49338(interfaceC22097.resolve(str.concat(".lit")));
        if (!m49338(interfaceC22097M27247.resolve("migration.id")) || (m49338(interfaceC22097M27247.resolve("app-adopted")) && !z2)) {
            z = false;
        }
        if (!m49338(interfaceC22097M27247) || z) {
            C11920 c11920M27238 = C11920.m27238(interfaceC22097, str, c8467.f22723);
            try {
                m49337(interfaceC18588);
                C11150.m25681(interfaceC22097M27247, c11920M27238.f33173.f60606.m46652());
                c11920M27238.m27249();
                c11920M27238.close();
            } catch (Throwable th) {
                try {
                    c11920M27238.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m49337(interfaceC18588);
        C13693 c13693M31105 = C13693.m31105(interfaceC22097M27247, c8467.f22723, c8467.f22725, c8467.f22724, 8388608, interfaceC18588, str);
        try {
            C11150.m25681(interfaceC22097M27247, c13693M31105.f38632.f34416.f22201.m46652());
            m49337(interfaceC18588);
            return c13693M31105;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c13693M31105.m31120().m12907();
            } catch (Throwable th3) {
                e.addSuppressed(th3);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m49337(InterfaceC18588 interfaceC18588) {
        if (interfaceC18588.mo3924()) {
            throw new CancellationException("Session startup is canceled");
        }
    }
}
