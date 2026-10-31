package l;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۚ᩵֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R450 */
/* JADX INFO: loaded from: classes3.dex */
public class C5551 extends C17545 {
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void mo15705() {
        for (C2609 c2609M43517 = this.f53596.m43517(); c2609M43517.m8249(); c2609M43517 = c2609M43517.f8241) {
            c2609M43517.f8240 = m15704((AbstractC7667) c2609M43517.f8240);
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static AbstractC7667 m15704(AbstractC7667 abstractC7667) {
        if (abstractC7667 instanceof C18957) {
            AbstractC5698 abstractC5698 = abstractC7667.f23673;
            C18957 c18957 = (C18957) abstractC7667;
            if (abstractC5698.f17559 == EnumC1296.f4582 && c18957.m43761()) {
                C10490 c10490 = new C10490(abstractC5698);
                Iterator it = abstractC7667.mo20475((Predicate) null, EnumC1317.RECURSIVE).iterator();
                while (it.hasNext()) {
                    c10490.mo26382((AbstractC5698) it.next());
                }
                C11901 c11901 = c10490.f23672;
                c11901.f35544 = c11901.f35544.m8246(new WeakReference(new C0611()));
                return c10490;
            }
        }
        return abstractC7667;
    }
}
