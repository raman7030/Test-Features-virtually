package p067l;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public class C7644 extends C19043 {
    /* JADX INFO: renamed from: ܽ */
    public void mo17619() {
        for (C4848 c4848M45783 = this.f56786.m45783(); c4848M45783.m10293(); c4848M45783 = c4848M45783.f11035) {
            c4848M45783.f11034 = m17618((AbstractC9655) c4848M45783.f11034);
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public static AbstractC9655 m17618(AbstractC9655 abstractC9655) {
        if (abstractC9655 instanceof C20385) {
            AbstractC7783 abstractC7783 = abstractC9655.f26587;
            C20385 c20385 = (C20385) abstractC9655;
            if (abstractC7783.f20405 == EnumC3600.f7354 && c20385.m46028()) {
                C12338 c12338 = new C12338(abstractC7783);
                Iterator it = abstractC9655.mo22455((Predicate) null, EnumC3620.RECURSIVE).iterator();
                while (it.hasNext()) {
                    c12338.mo28415((AbstractC7783) it.next());
                }
                C13679 c13679 = c12338.f26586;
                c13679.f38554 = c13679.f38554.m10290(new WeakReference(new C2949()));
                return c12338;
            }
        }
        return abstractC9655;
    }
}
