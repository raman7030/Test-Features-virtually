package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۙ۬ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: W3U9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4668 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f14843 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13728(C13758 c13758) {
        C4025.m12107(c13758, "range must not be empty, but was %s", !c13758.m33072());
        this.f14843.add(c13758);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m13727(C4668 c4668) {
        Iterator it = c4668.f14843.iterator();
        while (it.hasNext()) {
            m13728((C13758) it.next());
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C13134 m13726() {
        ArrayList arrayList = this.f14843;
        C1846 c1846 = new C1846(arrayList.size());
        int i = C13758.f41051;
        Collections.sort(arrayList, C22931.f73892);
        InterfaceC5998 interfaceC5998M13612 = C4648.m13612(arrayList.iterator());
        while (true) {
            C22287 c22287 = (C22287) interfaceC5998M13612;
            if (!c22287.hasNext()) {
                break;
            }
            C13758 c13758M33079 = (C13758) c22287.next();
            while (c22287.hasNext()) {
                C13758 c13758 = (C13758) c22287.peek();
                if (!c13758M33079.m33078(c13758)) {
                    break;
                }
                C4025.m12111(c13758M33079.m33076(c13758).m33072(), "Overlapping ranges not permitted but found %s overlapping %s", c13758M33079, c13758);
                c13758M33079 = c13758M33079.m33079((C13758) c22287.next());
            }
            c1846.m16262((Object) c13758M33079);
        }
        AbstractC14545 abstractC14545M6131 = c1846.m6131();
        if (abstractC14545M6131.isEmpty()) {
            return C13134.m31853();
        }
        if (abstractC14545M6131.size() == 1 && ((C13758) C8882.m22950((Collection) abstractC14545M6131)).equals(C13758.m33070())) {
            return C13134.m31852();
        }
        return new C13134(abstractC14545M6131);
    }
}
