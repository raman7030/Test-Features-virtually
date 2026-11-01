package p067l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6805 {

    /* JADX INFO: renamed from: ֫ */
    public final ArrayList f17673 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final void m15603(C15444 c15444) {
        C6194.m14027(c15444, "range must not be empty, but was %s", !c15444.m35187());
        this.f17673.add(c15444);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15602(C6805 c6805) {
        Iterator it = c6805.f17673.iterator();
        while (it.hasNext()) {
            m15603((C15444) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C14851 m15601() {
        ArrayList arrayList = this.f17673;
        C4123 c4123 = new C4123(arrayList.size());
        int i = C15444.f44129;
        Collections.sort(arrayList, C24162.f76622);
        InterfaceC8069 interfaceC8069M15487 = C6786.m15487(arrayList.iterator());
        while (true) {
            C23550 c23550 = (C23550) interfaceC8069M15487;
            if (!c23550.hasNext()) {
                break;
            }
            C15444 c15444M35194 = (C15444) c23550.next();
            while (c23550.hasNext()) {
                C15444 c15444 = (C15444) c23550.peek();
                if (!c15444M35194.m35193(c15444)) {
                    break;
                }
                C6194.m14031(c15444M35194.m35191(c15444).m35187(), "Overlapping ranges not permitted but found %s overlapping %s", c15444M35194, c15444);
                c15444M35194 = c15444M35194.m35194((C15444) c23550.next());
            }
            c4123.m18182((Object) c15444M35194);
        }
        AbstractC16192 abstractC16192M8329 = c4123.m8329();
        if (abstractC16192M8329.isEmpty()) {
            return C14851.m33945();
        }
        if (abstractC16192M8329.size() == 1 && ((C15444) C10810.m24921((Collection) abstractC16192M8329)).equals(C15444.m35185())) {
            return C14851.m33944();
        }
        return new C14851(abstractC16192M8329);
    }
}
