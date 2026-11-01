package p067l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H16C */
/* JADX INFO: loaded from: classes4.dex */
public final class C17884 implements Comparable {

    /* JADX INFO: renamed from: ᩸ */
    public C1782 f53445 = new C1782();

    /* JADX INFO: renamed from: ᩹ */
    public C1782 f53446 = new C1782();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(((C17884) obj).f53446.size(), this.f53446.size());
    }

    public C17884(C9952 c9952, C18555 c18555) {
        m40689(c9952.getAnnotations(), c18555);
        for (InterfaceC5815 interfaceC5815 : c9952.getFields()) {
            m40689(interfaceC5815.getAnnotations(), c18555);
            this.f53445.add(c18555.m42239(interfaceC5815));
        }
        for (InterfaceC19897 interfaceC19897 : c9952.getMethods()) {
            this.f53446.add(c18555.m42240(interfaceC19897));
            m40689(interfaceC19897.getAnnotations(), c18555);
            Iterator it = interfaceC19897.getParameters().iterator();
            while (it.hasNext()) {
                m40689(((InterfaceC2461) it.next()).getAnnotations(), c18555);
            }
            InterfaceC20568 interfaceC20568Mo5857 = interfaceC19897.mo5857();
            if (interfaceC20568Mo5857 != null) {
                for (InterfaceC23920 interfaceC23920 : interfaceC20568Mo5857.mo6074()) {
                    if (interfaceC23920 instanceof InterfaceC12777) {
                        m40690(((InterfaceC12777) interfaceC23920).getReference(), c18555);
                        if (interfaceC23920 instanceof InterfaceC14532) {
                            m40690(((InterfaceC14532) interfaceC23920).mo11754(), c18555);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40690(InterfaceC10250 interfaceC10250, C18555 c18555) {
        if (interfaceC10250 instanceof InterfaceC7568) {
            this.f53446.add(c18555.m42240((InterfaceC7568) interfaceC10250));
            return;
        }
        if (interfaceC10250 instanceof InterfaceC20309) {
            this.f53445.add(c18555.m42239((InterfaceC20309) interfaceC10250));
            return;
        }
        if (interfaceC10250 instanceof InterfaceC20980) {
            m40690(((InterfaceC20980) interfaceC10250).mo5179(), c18555);
            return;
        }
        if (interfaceC10250 instanceof InterfaceC6227) {
            InterfaceC6227 interfaceC6227 = (InterfaceC6227) interfaceC10250;
            m40690(interfaceC6227.mo14105().mo5179(), c18555);
            Iterator it = interfaceC6227.mo14102().iterator();
            while (it.hasNext()) {
                m40691((InterfaceC12262) it.next(), c18555);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40689(Set set, C18555 c18555) {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC21909) it.next()).getElements().iterator();
            while (it2.hasNext()) {
                m40691(((InterfaceC11180) it2.next()).getValue(), c18555);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40691(InterfaceC12262 interfaceC12262, C18555 c18555) {
        int iMo4670 = interfaceC12262.mo4670();
        if (iMo4670 != 22) {
            switch (iMo4670) {
                case 25:
                    m40690(((InterfaceC13603) interfaceC12262).getValue(), c18555);
                    break;
                case 26:
                    m40690(((InterfaceC4255) interfaceC12262).getValue(), c18555);
                    break;
                case 27:
                    m40690(((InterfaceC8238) interfaceC12262).getValue(), c18555);
                    break;
                case 28:
                    Iterator it = ((InterfaceC21650) interfaceC12262).getValue().iterator();
                    while (it.hasNext()) {
                        m40691((InterfaceC12262) it.next(), c18555);
                    }
                    break;
                case 29:
                    Iterator it2 = ((InterfaceC23661) interfaceC12262).getElements().iterator();
                    while (it2.hasNext()) {
                        m40691(((InterfaceC11180) it2.next()).getValue(), c18555);
                    }
                    break;
            }
            return;
        }
        m40690(((InterfaceC12973) interfaceC12262).getValue(), c18555);
    }
}
