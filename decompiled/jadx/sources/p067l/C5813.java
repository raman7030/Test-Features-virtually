package p067l;

import java.io.IOError;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Collection;

/* JADX INFO: renamed from: l.ۘ֫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: OBBK */
/* JADX INFO: loaded from: classes2.dex */
public final class C5813 {

    /* JADX INFO: renamed from: ۧ */
    public static final C15444 f14278 = C15444.m35182((Integer) (-1), (Integer) (-1));

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC9836 f14279;

    public C5813(AbstractC9836 abstractC9836) {
        this.f14279 = abstractC9836;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m13080(C21237 c21237, C20151 c20151, AbstractC9836 abstractC9836) throws C19895 {
        C5127 c5127 = new C5127();
        C24493 c24493 = new C24493();
        c5127.m10906(InterfaceC15775.class, c24493);
        C13565.m30871(c5127).m30876("allowStringFolding", "false");
        C13565.m30871(c5127).m30876("--enable-preview", "true");
        try {
            new C13625(c5127, true, StandardCharsets.UTF_8).m30986(EnumC22423.PLATFORM_CLASS_PATH, AbstractC16192.m36872of());
            C4472 c4472 = new C4472(URI.create("source"), EnumC18398.SOURCE, c21237);
            C23623.m52439(c5127).m9363(c4472);
            C3626 c3626M36121 = C17274.m39125(c5127).m39126(c21237.m47974(), true, true, true, false).m36121();
            c3626M36121.f7516 = c4472;
            c21237.m47971(c3626M36121);
            Iterable iterableM24925 = C10810.m24925(c24493.m53990(), new C17211());
            if (!C10810.m24928(iterableM24925)) {
                throw new C19895(C10810.m24920(iterableM24925, new C17520(10)));
            }
            C15365 c15365 = new C15365(c21237, c20151);
            new C6069(c15365, abstractC9836.mo23024().m5339()).m13781(c3626M36121);
            c15365.m35028(c21237.m47974().length());
            c15365.m35015();
            C20061 c20061 = new C20061();
            AbstractC6767 abstractC6767ListIterator = c15365.m35026().listIterator(0);
            while (abstractC6767ListIterator.hasNext()) {
                ((InterfaceC14025) abstractC6767ListIterator.next()).mo9793(c20061);
            }
            AbstractC5979 abstractC5979M45422 = c20061.m45422();
            abstractC5979M45422.mo9792(c20151.m45598(), new C11344());
            abstractC5979M45422.mo9794(c20151);
            c20151.m45597();
        } catch (IOException e) {
            throw new IOError(e);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m13081(AbstractC22507 abstractC22507, AbstractC19153 abstractC19153) {
        String strMo50468 = abstractC22507.mo50468();
        AbstractC16192 abstractC16192M36873of = AbstractC16192.m36873of((Object) C15444.m35182((Integer) 0, Integer.valueOf(strMo50468.length())));
        C21237 c21237 = new C21237(strMo50468);
        AbstractC9836 abstractC9836 = this.f14279;
        if (abstractC9836.mo23023()) {
            c21237 = C21492.m48692(c21237, abstractC16192M36873of);
        }
        String strM33619 = C14695.m33619(strMo50468);
        C20151 c20151 = new C20151(strM33619, c21237, new C2459(strM33619, abstractC9836));
        try {
            m13080(c21237, c20151, abstractC9836);
            String strM45590 = C20151.m45590(strMo50468, c20151.m45593(c21237.m47970((Collection) abstractC16192M36873of)));
            strM45590.getClass();
            abstractC19153.mo26420().append((CharSequence) strM45590);
        } catch (C2625 e) {
            throw new C19895(e.m3981());
        }
    }
}
