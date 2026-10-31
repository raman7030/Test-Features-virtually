package l;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H16C */
/* JADX INFO: loaded from: classes4.dex */
public final class C16326 implements Comparable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C18955 f50273 = new C18955();

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18955 f50274 = new C18955();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(((C16326) obj).f50274.size(), this.f50274.size());
    }

    public C16326(C7980 c7980, C17032 c17032) {
        m38474(c7980.getAnnotations(), c17032);
        for (InterfaceC3627 interfaceC3627 : c7980.getFields()) {
            m38474(interfaceC3627.getAnnotations(), c17032);
            this.f50273.add(c17032.m39994(interfaceC3627));
        }
        for (InterfaceC18444 interfaceC18444 : c7980.getMethods()) {
            this.f50274.add(c17032.m39995(interfaceC18444));
            m38474(interfaceC18444.getAnnotations(), c17032);
            Iterator it = interfaceC18444.getParameters().iterator();
            while (it.hasNext()) {
                m38474(((InterfaceC0098) it.next()).getAnnotations(), c17032);
            }
            InterfaceC19150 interfaceC19150Mo3570 = interfaceC18444.mo3570();
            if (interfaceC19150Mo3570 != null) {
                for (InterfaceC22677 interfaceC22677 : interfaceC19150Mo3570.mo3817()) {
                    if (interfaceC22677 instanceof InterfaceC10952) {
                        m38475(((InterfaceC10952) interfaceC22677).getReference(), c17032);
                        if (interfaceC22677 instanceof InterfaceC12799) {
                            m38475(((InterfaceC12799) interfaceC22677).mo9710(), c17032);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38475(InterfaceC8293 interfaceC8293, C17032 c17032) {
        if (interfaceC8293 instanceof InterfaceC5471) {
            this.f50274.add(c17032.m39995((InterfaceC5471) interfaceC8293));
            return;
        }
        if (interfaceC8293 instanceof InterfaceC18877) {
            this.f50273.add(c17032.m39994((InterfaceC18877) interfaceC8293));
            return;
        }
        if (interfaceC8293 instanceof InterfaceC19583) {
            m38475(((InterfaceC19583) interfaceC8293).mo2850(), c17032);
            return;
        }
        if (interfaceC8293 instanceof InterfaceC4060) {
            InterfaceC4060 interfaceC4060 = (InterfaceC4060) interfaceC8293;
            m38475(interfaceC4060.mo12184().mo2850(), c17032);
            Iterator it = interfaceC4060.mo12181().iterator();
            while (it.hasNext()) {
                m38476((InterfaceC10410) it.next(), c17032);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38474(Set set, C17032 c17032) {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((InterfaceC20561) it.next()).getElements().iterator();
            while (it2.hasNext()) {
                m38476(((InterfaceC9272) it2.next()).getValue(), c17032);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38476(InterfaceC10410 interfaceC10410, C17032 c17032) {
        int iMo2302 = interfaceC10410.mo2302();
        if (iMo2302 != 22) {
            switch (iMo2302) {
                case 25:
                    m38475(((InterfaceC11821) interfaceC10410).getValue(), c17032);
                    break;
                case 26:
                    m38475(((InterfaceC1985) interfaceC10410).getValue(), c17032);
                    break;
                case 27:
                    m38475(((InterfaceC6176) interfaceC10410).getValue(), c17032);
                    break;
                case 28:
                    Iterator it = ((InterfaceC20288) interfaceC10410).getValue().iterator();
                    while (it.hasNext()) {
                        m38476((InterfaceC10410) it.next(), c17032);
                    }
                    break;
                case 29:
                    Iterator it2 = ((InterfaceC22404) interfaceC10410).getElements().iterator();
                    while (it2.hasNext()) {
                        m38476(((InterfaceC9272) it2.next()).getValue(), c17032);
                    }
                    break;
            }
            return;
        }
        m38475(((InterfaceC11158) interfaceC10410).getValue(), c17032);
    }
}
