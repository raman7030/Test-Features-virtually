package p067l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۜ۟ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8661 extends AbstractC5979 {

    /* JADX INFO: renamed from: ۛ */
    public final AbstractC10002 f23258;

    /* JADX INFO: renamed from: ۫ */
    public final ArrayList f23261 = new ArrayList();

    /* JADX INFO: renamed from: ۤ */
    public boolean f23259 = false;

    /* JADX INFO: renamed from: ۨ */
    public ArrayList f23260 = new ArrayList();

    /* JADX INFO: renamed from: ۬ */
    public ArrayList f23262 = new ArrayList();

    public C8661(AbstractC10002 abstractC10002) {
        this.f23258 = abstractC10002;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C8661 m20103(AbstractC10002 abstractC10002) {
        return new C8661(abstractC10002);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m20105(AbstractC5979 abstractC5979) {
        this.f23261.add(abstractC5979);
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final String mo9791() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f23261.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC5979) it.next()).m13406());
        }
        return sb.toString();
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ۧ */
    public final C15444 mo9797() {
        C15444 c15444M35186 = AbstractC5979.f14789;
        Iterator it = this.f23261.iterator();
        while (it.hasNext()) {
            C15444 c15444M13404 = ((AbstractC5979) it.next()).m13404();
            if (c15444M35186.m35187()) {
                c15444M35186 = c15444M13404;
            } else if (!c15444M13404.m35187()) {
                c15444M35186 = c15444M35186.m35194(c15444M13404).m35186(AbstractC5979.f14788);
            }
        }
        return c15444M35186;
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final C11344 mo9792(InterfaceC12685 interfaceC12685, C11344 c11344) {
        int iM13405 = c11344.f31579 + m13405();
        if (iM13405 <= 100) {
            this.f23259 = true;
            return c11344.m26282(iM13405);
        }
        int iMo5745 = c11344.f31580 + this.f23258.mo5745();
        int i = 0;
        C11344 c11345 = new C11344(iMo5745, iMo5745, c11344.f31579, false);
        ArrayList arrayList = this.f23260;
        arrayList.clear();
        ArrayList arrayList2 = this.f23262;
        arrayList2.clear();
        arrayList.add(new ArrayList());
        for (AbstractC5979 abstractC5979 : this.f23261) {
            if (abstractC5979 instanceof C16036) {
                arrayList2.add((C16036) abstractC5979);
                arrayList.add(new ArrayList());
            } else {
                ((List) C10810.m24926(arrayList)).add(abstractC5979);
            }
        }
        C11344 c11344M20104 = m20104(interfaceC12685, c11345, C18189.empty(), (List) arrayList.get(0));
        while (i < arrayList2.size()) {
            C18189 c18189M41402of = C18189.m41402of((C16036) arrayList2.get(i));
            i++;
            c11344M20104 = m20104(interfaceC12685, c11344M20104, c18189M41402of, (List) arrayList.get(i));
        }
        return c11344.m26282(c11344M20104.f31579);
    }

    /* JADX INFO: renamed from: ֫ */
    public static C11344 m20104(InterfaceC12685 interfaceC12685, C11344 c11344, C18189 c18189, List list) {
        int iM13405 = c18189.isPresent() ? ((C16036) c18189.get()).m13405() : 0;
        Iterator it = list.iterator();
        int iM13406 = 0;
        while (it.hasNext()) {
            iM13406 += ((AbstractC5979) it.next()).m13405();
            if (iM13406 >= 1000) {
                iM13406 = 1000;
                break;
            }
        }
        boolean z = (c18189.isPresent() && ((C16036) c18189.get()).f46421 == EnumC24754.UNIFIED) || c11344.f31582 || (c11344.f31579 + iM13405) + iM13406 > 100;
        if (c18189.isPresent()) {
            c11344 = ((C16036) c18189.get()).m36482(c11344, c11344.f31581, z);
        }
        int i = c11344.f31579;
        boolean z2 = iM13406 + i <= 100;
        C11344 c11345 = new C11344(c11344.f31581, c11344.f31580, i, false);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c11345 = ((AbstractC5979) it2.next()).mo9792(interfaceC12685, c11345);
        }
        return !z2 ? new C11344(c11345.f31581, c11345.f31580, c11345.f31579, true) : c11345;
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ֫ */
    public final void mo9794(C20151 c20151) {
        if (this.f23259) {
            c20151.m45595(m13404(), m13406());
            return;
        }
        ArrayList arrayList = this.f23260;
        int i = 0;
        Iterator it = ((List) arrayList.get(0)).iterator();
        while (it.hasNext()) {
            ((AbstractC5979) it.next()).mo9794(c20151);
        }
        while (true) {
            ArrayList arrayList2 = this.f23262;
            if (i >= arrayList2.size()) {
                return;
            }
            ((C16036) arrayList2.get(i)).mo9794(c20151);
            i++;
            Iterator it2 = ((List) arrayList.get(i)).iterator();
            while (it2.hasNext()) {
                ((AbstractC5979) it2.next()).mo9794(c20151);
            }
        }
    }

    @Override // p067l.AbstractC5979
    /* JADX INFO: renamed from: ܽ */
    public final int mo9799() {
        Iterator it = this.f23261.iterator();
        int iM13405 = 0;
        while (it.hasNext()) {
            iM13405 += ((AbstractC5979) it.next()).m13405();
            if (iM13405 >= 1000) {
                return 1000;
            }
        }
        return iM13405;
    }

    public final String toString() {
        C10888 c10888M40057 = C17592.m40057(this);
        c10888M40057.m25084(this.f23258, "plusIndent");
        c10888M40057.m25084(this.f23261, "docs");
        return c10888M40057.toString();
    }
}
