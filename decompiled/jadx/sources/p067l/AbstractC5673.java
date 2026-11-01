package p067l;

import android.view.ViewGroup;
import bin.p000mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5673 {

    /* JADX INFO: renamed from: ֫ */
    public final ViewGroup f13800;

    /* JADX INFO: renamed from: ᩳ */
    public final ArrayList f13804 = new ArrayList();

    /* JADX INFO: renamed from: ܿ */
    public final ArrayList f13803 = new ArrayList();

    /* JADX INFO: renamed from: ܽ */
    public boolean f13802 = false;

    /* JADX INFO: renamed from: ۧ */
    public boolean f13801 = false;

    /* JADX INFO: renamed from: ֫ */
    public abstract void mo12636(ArrayList arrayList, boolean z);

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5673 m12630(ViewGroup viewGroup, AbstractC7291 abstractC7291) {
        return m12631(viewGroup, abstractC7291.m16836());
    }

    /* JADX INFO: renamed from: ֫ */
    public static AbstractC5673 m12631(ViewGroup viewGroup, InterfaceC15060 interfaceC15060) {
        Object tag = viewGroup.getTag(R.id.MT_Protector);
        if (tag instanceof AbstractC5673) {
            return (AbstractC5673) tag;
        }
        ((C18690) interfaceC15060).getClass();
        C23598 c23598 = new C23598(viewGroup);
        viewGroup.setTag(R.id.MT_Protector, c23598);
        return c23598;
    }

    public AbstractC5673(ViewGroup viewGroup) {
        this.f13800 = viewGroup;
    }

    /* JADX INFO: renamed from: ܽ */
    public final ViewGroup m12641() {
        return this.f13800;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final EnumC23778 m12643(C7961 c7961) {
        C7014 c7014M12632 = m12632(c7961.m18414());
        C7014 c7014 = null;
        EnumC23778 enumC23778M16144 = c7014M12632 != null ? c7014M12632.m16144() : null;
        ComponentCallbacksC11117 componentCallbacksC11117M18414 = c7961.m18414();
        for (C7014 c7015 : this.f13803) {
            if (c7015.m16145().equals(componentCallbacksC11117M18414) && !c7015.m16142()) {
                c7014 = c7015;
                break;
            }
        }
        return (c7014 == null || !(enumC23778M16144 == null || enumC23778M16144 == EnumC23778.NONE)) ? enumC23778M16144 : c7014.m16144();
    }

    /* JADX INFO: renamed from: ֫ */
    private C7014 m12632(ComponentCallbacksC11117 componentCallbacksC11117) {
        for (C7014 c7014 : this.f13804) {
            if (c7014.m16145().equals(componentCallbacksC11117) && !c7014.m16142()) {
                return c7014;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12638(EnumC21767 enumC21767, C7961 c7961) {
        if (AbstractC7291.m16763(2)) {
            C12826.toString(c7961.m18414());
        }
        m12633(enumC21767, EnumC23778.ADDING, c7961);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m12642(C7961 c7961) {
        if (AbstractC7291.m16763(2)) {
            C12826.toString(c7961.m18414());
        }
        m12633(EnumC21767.VISIBLE, EnumC23778.NONE, c7961);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12637(C7961 c7961) {
        if (AbstractC7291.m16763(2)) {
            C12826.toString(c7961.m18414());
        }
        m12633(EnumC21767.GONE, EnumC23778.NONE, c7961);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12640(C7961 c7961) {
        if (AbstractC7291.m16763(2)) {
            C12826.toString(c7961.m18414());
        }
        m12633(EnumC21767.REMOVED, EnumC23778.REMOVING, c7961);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m12633(EnumC21767 enumC21767, EnumC23778 enumC23778, C7961 c7961) {
        synchronized (this.f13804) {
            C2017 c2017 = new C2017();
            C7014 c7014M12632 = m12632(c7961.m18414());
            if (c7014M12632 != null) {
                c7014M12632.m16137(enumC21767, enumC23778);
                return;
            }
            C17071 c17071 = new C17071(enumC21767, enumC23778, c7961, c2017);
            this.f13804.add(c17071);
            c17071.m16136(new RunnableC7685(this, c17071));
            c17071.m16136(new RunnableC3661(this, c17071));
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m12644() {
        synchronized (this.f13804) {
            m12634();
            this.f13801 = false;
            int size = this.f13804.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C7014 c7014 = (C7014) this.f13804.get(size);
                EnumC21767 enumC21767M49055 = EnumC21767.m49055(c7014.m16145().mView);
                EnumC21767 enumC21767M16143 = c7014.m16143();
                EnumC21767 enumC21767 = EnumC21767.VISIBLE;
                if (enumC21767M16143 == enumC21767 && enumC21767M49055 != enumC21767) {
                    this.f13801 = c7014.m16145().isPostponed();
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m12635() {
        if (this.f13801) {
            return;
        }
        ViewGroup viewGroup = this.f13800;
        int i = C1717.f57146;
        if (!viewGroup.isAttachedToWindow()) {
            m12639();
            this.f13802 = false;
            return;
        }
        synchronized (this.f13804) {
            if (!this.f13804.isEmpty()) {
                ArrayList<C7014> arrayList = new ArrayList(this.f13803);
                this.f13803.clear();
                for (C7014 c7014 : arrayList) {
                    if (AbstractC7291.m16763(2)) {
                        C12826.toString(c7014);
                    }
                    c7014.m16135();
                    if (!c7014.m16146()) {
                        this.f13803.add(c7014);
                    }
                }
                m12634();
                ArrayList arrayList2 = new ArrayList(this.f13804);
                this.f13804.clear();
                this.f13803.addAll(arrayList2);
                AbstractC7291.m16763(2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C7014) it.next()).mo16139();
                }
                mo12636(arrayList2, this.f13802);
                this.f13802 = false;
                AbstractC7291.m16763(2);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m12639() {
        AbstractC7291.m16763(2);
        ViewGroup viewGroup = this.f13800;
        int i = C1717.f57146;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f13804) {
            m12634();
            Iterator it = this.f13804.iterator();
            while (it.hasNext()) {
                ((C7014) it.next()).mo16139();
            }
            for (C7014 c7014 : new ArrayList(this.f13803)) {
                if (AbstractC7291.m16763(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f13800);
                        sb.append(" is not attached to window. ");
                    }
                    C12826.toString(c7014);
                }
                c7014.m16135();
            }
            for (C7014 c7015 : new ArrayList(this.f13804)) {
                if (AbstractC7291.m16763(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f13800);
                        sb2.append(" is not attached to window. ");
                    }
                    C12826.toString(c7015);
                }
                c7015.m16135();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ */
    private void m12634() {
        for (C7014 c7014 : this.f13804) {
            if (c7014.m16144() == EnumC23778.ADDING) {
                c7014.m16137(EnumC21767.m49054(c7014.m16145().requireView().getVisibility()), EnumC23778.NONE);
            }
        }
    }
}
