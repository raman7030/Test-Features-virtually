package l;

import android.view.ViewGroup;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۗ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: VB94 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3477 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ViewGroup f10995;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10999 = new ArrayList();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ArrayList f10998 = new ArrayList();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f10997 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f10996 = false;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract void mo10641(ArrayList arrayList, boolean z);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3477 m10635(ViewGroup viewGroup, AbstractC5180 abstractC5180) {
        return m10636(viewGroup, abstractC5180.m14926());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AbstractC3477 m10636(ViewGroup viewGroup, InterfaceC13354 interfaceC13354) {
        Object tag = viewGroup.getTag(R.id.MT_Protector);
        if (tag instanceof AbstractC3477) {
            return (AbstractC3477) tag;
        }
        ((C17174) interfaceC13354).getClass();
        C22338 c22338 = new C22338(viewGroup);
        viewGroup.setTag(R.id.MT_Protector, c22338);
        return c22338;
    }

    public AbstractC3477(ViewGroup viewGroup) {
        this.f10995 = viewGroup;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ViewGroup m10646() {
        return this.f10995;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final EnumC22527 m10648(C5885 c5885) {
        C4888 c4888M10637 = m10637(c5885.m16488());
        C4888 c4888 = null;
        EnumC22527 enumC22527M14247 = c4888M10637 != null ? c4888M10637.m14247() : null;
        ComponentCallbacksC9205 componentCallbacksC9205M16488 = c5885.m16488();
        for (C4888 c4889 : this.f10998) {
            if (c4889.m14248().equals(componentCallbacksC9205M16488) && !c4889.m14245()) {
                c4888 = c4889;
                break;
            }
        }
        return (c4888 == null || !(enumC22527M14247 == null || enumC22527M14247 == EnumC22527.NONE)) ? enumC22527M14247 : c4888.m14247();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private C4888 m10637(ComponentCallbacksC9205 componentCallbacksC9205) {
        for (C4888 c4888 : this.f10999) {
            if (c4888.m14248().equals(componentCallbacksC9205) && !c4888.m14245()) {
                return c4888;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10643(EnumC20411 enumC20411, C5885 c5885) {
        if (AbstractC5180.m14853(2)) {
            C11003.toString(c5885.m16488());
        }
        m10638(enumC20411, EnumC22527.ADDING, c5885);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m10647(C5885 c5885) {
        if (AbstractC5180.m14853(2)) {
            C11003.toString(c5885.m16488());
        }
        m10638(EnumC20411.VISIBLE, EnumC22527.NONE, c5885);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10642(C5885 c5885) {
        if (AbstractC5180.m14853(2)) {
            C11003.toString(c5885.m16488());
        }
        m10638(EnumC20411.GONE, EnumC22527.NONE, c5885);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10645(C5885 c5885) {
        if (AbstractC5180.m14853(2)) {
            C11003.toString(c5885.m16488());
        }
        m10638(EnumC20411.REMOVED, EnumC22527.REMOVING, c5885);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m10638(EnumC20411 enumC20411, EnumC22527 enumC22527, C5885 c5885) {
        synchronized (this.f10999) {
            C23686 c23686 = new C23686();
            C4888 c4888M10637 = m10637(c5885.m16488());
            if (c4888M10637 != null) {
                c4888M10637.m14240(enumC20411, enumC22527);
                return;
            }
            C15470 c15470 = new C15470(enumC20411, enumC22527, c5885, c23686);
            this.f10999.add(c15470);
            c15470.m14239(new RunnableC5594(this, c15470));
            c15470.m14239(new RunnableC1360(this, c15470));
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m10649() {
        synchronized (this.f10999) {
            m10639();
            this.f10996 = false;
            int size = this.f10999.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C4888 c4888 = (C4888) this.f10999.get(size);
                EnumC20411 enumC20411M46732 = EnumC20411.m46732(c4888.m14248().mView);
                EnumC20411 enumC20411M14246 = c4888.m14246();
                EnumC20411 enumC20411 = EnumC20411.VISIBLE;
                if (enumC20411M14246 == enumC20411 && enumC20411M46732 != enumC20411) {
                    this.f10996 = c4888.m14248().isPostponed();
                    break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m10640() {
        if (this.f10996) {
            return;
        }
        ViewGroup viewGroup = this.f10995;
        int i = C17648.f53953;
        if (!viewGroup.isAttachedToWindow()) {
            m10644();
            this.f10997 = false;
            return;
        }
        synchronized (this.f10999) {
            if (!this.f10999.isEmpty()) {
                ArrayList<C4888> arrayList = new ArrayList(this.f10998);
                this.f10998.clear();
                for (C4888 c4888 : arrayList) {
                    if (AbstractC5180.m14853(2)) {
                        C11003.toString(c4888);
                    }
                    c4888.m14238();
                    if (!c4888.m14249()) {
                        this.f10998.add(c4888);
                    }
                }
                m10639();
                ArrayList arrayList2 = new ArrayList(this.f10999);
                this.f10999.clear();
                this.f10998.addAll(arrayList2);
                AbstractC5180.m14853(2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C4888) it.next()).mo14242();
                }
                mo10641(arrayList2, this.f10997);
                this.f10997 = false;
                AbstractC5180.m14853(2);
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m10644() {
        AbstractC5180.m14853(2);
        ViewGroup viewGroup = this.f10995;
        int i = C17648.f53953;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f10999) {
            m10639();
            Iterator it = this.f10999.iterator();
            while (it.hasNext()) {
                ((C4888) it.next()).mo14242();
            }
            for (C4888 c4888 : new ArrayList(this.f10998)) {
                if (AbstractC5180.m14853(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Container ");
                        sb.append(this.f10995);
                        sb.append(" is not attached to window. ");
                    }
                    C11003.toString(c4888);
                }
                c4888.m14238();
            }
            for (C4888 c4889 : new ArrayList(this.f10999)) {
                if (AbstractC5180.m14853(2)) {
                    if (!zIsAttachedToWindow) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Container ");
                        sb2.append(this.f10995);
                        sb2.append(" is not attached to window. ");
                    }
                    C11003.toString(c4889);
                }
                c4889.m14238();
            }
        }
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m10639() {
        for (C4888 c4888 : this.f10999) {
            if (c4888.m14247() == EnumC22527.ADDING) {
                c4888.m14240(EnumC20411.m46731(c4888.m14248().requireView().getVisibility()), EnumC22527.NONE);
            }
        }
    }
}
