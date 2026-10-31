package l;

import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.᩷֡ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66S6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C20529 {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m47015(InterfaceC20758 interfaceC20758) {
        return C17229.exists(interfaceC20758, EnumC14406.NOFOLLOW_LINKS);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C11915 m47013(InterfaceC20758 interfaceC20758, String str, C6417 c6417, InterfaceC17066 interfaceC17066) throws Throwable {
        InterfaceC20758 interfaceC20758M25230 = C10050.m25230(str, interfaceC20758);
        m47014(interfaceC17066);
        boolean z = true;
        boolean z2 = m47015(interfaceC20758.resolve(str.concat(".dat"))) || m47015(interfaceC20758.resolve(str.concat(".tat"))) || m47015(interfaceC20758.resolve(str.concat(".lit")));
        if (!m47015(interfaceC20758M25230.resolve("migration.id")) || (m47015(interfaceC20758M25230.resolve("app-adopted")) && !z2)) {
            z = false;
        }
        if (!m47015(interfaceC20758M25230) || z) {
            C10050 c10050M25221 = C10050.m25221(interfaceC20758, str, c6417.f19851);
            try {
                m47014(interfaceC17066);
                C9240.m23681(interfaceC20758M25230, c10050M25221.f30215.f57385.m44358());
                c10050M25221.m25232();
                c10050M25221.close();
            } catch (Throwable th) {
                try {
                    c10050M25221.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        m47014(interfaceC17066);
        C11915 c11915M29053 = C11915.m29053(interfaceC20758M25230, c6417.f19851, c6417.f19853, c6417.f19852, 8388608, interfaceC17066, str);
        try {
            C9240.m23681(interfaceC20758M25230, c11915M29053.f35623.f31452.f19337.m44358());
            m47014(interfaceC17066);
            return c11915M29053;
        } catch (IOException | Error | RuntimeException e) {
            try {
                c11915M29053.m29068().m10930();
            } catch (Throwable th3) {
                e.addSuppressed(th3);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m47014(InterfaceC17066 interfaceC17066) {
        if (interfaceC17066.mo1526()) {
            throw new CancellationException("Session startup is canceled");
        }
    }
}
