package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6621 extends AbstractC3799 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC8032 f20381;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ArrayList f20384 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f20382 = false;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f20383 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public ArrayList f20385 = new ArrayList();

    public C6621(AbstractC8032 abstractC8032) {
        this.f20381 = abstractC8032;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C6621 m18151(AbstractC8032 abstractC8032) {
        return new C6621(abstractC8032);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m18153(AbstractC3799 abstractC3799) {
        this.f20384.add(abstractC3799);
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫ */
    public final String mo7730() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f20384.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC3799) it.next()).m11470());
        }
        return sb.toString();
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ۧ */
    public final C13758 mo7736() {
        C13758 c13758M33071 = AbstractC3799.f11983;
        Iterator it = this.f20384.iterator();
        while (it.hasNext()) {
            C13758 c13758M11468 = ((AbstractC3799) it.next()).m11468();
            if (c13758M33071.m33072()) {
                c13758M33071 = c13758M11468;
            } else if (!c13758M11468.m33072()) {
                c13758M33071 = c13758M33071.m33079(c13758M11468).m33071(AbstractC3799.f11982);
            }
        }
        return c13758M33071;
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫ */
    public final C9444 mo7731(InterfaceC10855 interfaceC10855, C9444 c9444) {
        int iM11469 = c9444.f28632 + m11469();
        if (iM11469 <= 100) {
            this.f20382 = true;
            return c9444.m24272(iM11469);
        }
        int iMo3442 = c9444.f28633 + this.f20381.mo3442();
        int i = 0;
        C9444 c9445 = new C9444(iMo3442, iMo3442, c9444.f28632, false);
        ArrayList arrayList = this.f20383;
        arrayList.clear();
        ArrayList arrayList2 = this.f20385;
        arrayList2.clear();
        arrayList.add(new ArrayList());
        for (AbstractC3799 abstractC3799 : this.f20384) {
            if (abstractC3799 instanceof C14381) {
                arrayList2.add((C14381) abstractC3799);
                arrayList.add(new ArrayList());
            } else {
                ((List) C8882.m22955(arrayList)).add(abstractC3799);
            }
        }
        C9444 c9444M18152 = m18152(interfaceC10855, c9445, C16646.empty(), (List) arrayList.get(0));
        while (i < arrayList2.size()) {
            C16646 c16646Of = C16646.of((C14381) arrayList2.get(i));
            i++;
            c9444M18152 = m18152(interfaceC10855, c9444M18152, c16646Of, (List) arrayList.get(i));
        }
        return c9444.m24272(c9444M18152.f28632);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C9444 m18152(InterfaceC10855 interfaceC10855, C9444 c9444, C16646 c16646, List list) {
        int iM11469 = c16646.isPresent() ? ((C14381) c16646.get()).m11469() : 0;
        Iterator it = list.iterator();
        int iM114610 = 0;
        while (it.hasNext()) {
            iM114610 += ((AbstractC3799) it.next()).m11469();
            if (iM114610 >= 1000) {
                iM114610 = 1000;
                break;
            }
        }
        boolean z = (c16646.isPresent() && ((C14381) c16646.get()).f43330 == EnumC23554.UNIFIED) || c9444.f28635 || (c9444.f28632 + iM11469) + iM114610 > 100;
        if (c16646.isPresent()) {
            c9444 = ((C14381) c16646.get()).m34348(c9444, c9444.f28634, z);
        }
        int i = c9444.f28632;
        boolean z2 = iM114610 + i <= 100;
        C9444 c9445 = new C9444(c9444.f28634, c9444.f28633, i, false);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c9445 = ((AbstractC3799) it2.next()).mo7731(interfaceC10855, c9445);
        }
        return !z2 ? new C9444(c9445.f28634, c9445.f28633, c9445.f28632, true) : c9445;
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ֫ */
    public final void mo7733(C18711 c18711) {
        if (this.f20382) {
            c18711.m43328(m11468(), m11470());
            return;
        }
        ArrayList arrayList = this.f20383;
        int i = 0;
        Iterator it = ((List) arrayList.get(0)).iterator();
        while (it.hasNext()) {
            ((AbstractC3799) it.next()).mo7733(c18711);
        }
        while (true) {
            ArrayList arrayList2 = this.f20385;
            if (i >= arrayList2.size()) {
                return;
            }
            ((C14381) arrayList2.get(i)).mo7733(c18711);
            i++;
            Iterator it2 = ((List) arrayList.get(i)).iterator();
            while (it2.hasNext()) {
                ((AbstractC3799) it2.next()).mo7733(c18711);
            }
        }
    }

    @Override // l.AbstractC3799
    /* JADX INFO: renamed from: ܽ */
    public final int mo7738() {
        Iterator it = this.f20384.iterator();
        int iM11469 = 0;
        while (it.hasNext()) {
            iM11469 += ((AbstractC3799) it.next()).m11469();
            if (iM11469 >= 1000) {
                return 1000;
            }
        }
        return iM11469;
    }

    public final String toString() {
        C8964 c8964M37871 = C16018.m37871(this);
        c8964M37871.m23110(this.f20381, "plusIndent");
        c8964M37871.m23110(this.f20384, "docs");
        return c8964M37871.toString();
    }
}
