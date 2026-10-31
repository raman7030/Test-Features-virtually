package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import l.AbstractC16176;
import l.AbstractC16620;
import l.C15749;
import l.C18573;
import l.C2345;
import l.C23676;
import l.C23686;
import l.C2510;
import l.C3756;
import l.C8695;
import l.InterfaceC14513;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionSupport extends AbstractC16176 {
    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo34(Object obj) {
        return obj instanceof AbstractC16620;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Object mo35(Object obj) {
        if (obj != null) {
            return ((AbstractC16620) obj).clone();
        }
        return null;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object mo39(Object obj) {
        if (obj == null) {
            return null;
        }
        C2510 c2510 = new C2510();
        c2510.m8006((AbstractC16620) obj);
        return c2510;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo37(Object obj, View view, ArrayList arrayList) {
        C2510 c2510 = (C2510) obj;
        List targets = c2510.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC16176.m38114((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo31((Object) c2510, arrayList);
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo36(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC16176.m38113(rect, view);
            ((AbstractC16620) obj).setEpicenterCallback(new C8695(rect));
        }
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo31(Object obj, ArrayList arrayList) {
        AbstractC16620 abstractC16620 = (AbstractC16620) obj;
        if (abstractC16620 == null) {
            return;
        }
        int i = 0;
        if (abstractC16620 instanceof C2510) {
            C2510 c2510 = (C2510) abstractC16620;
            int size = c2510.f7972.size();
            while (i < size) {
                mo31((Object) ((i < 0 || i >= c2510.f7972.size()) ? null : (AbstractC16620) c2510.f7972.get(i)), arrayList);
                i++;
            }
            return;
        }
        if (m23(abstractC16620) || !AbstractC16176.m38115(abstractC16620.getTargets())) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            abstractC16620.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m23(AbstractC16620 abstractC16620) {
        return (AbstractC16176.m38115(abstractC16620.getTargetIds()) && AbstractC16176.m38115(abstractC16620.getTargetNames()) && AbstractC16176.m38115(abstractC16620.getTargetTypes())) ? false : true;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo24(Object obj, Object obj2) {
        C2510 c2510 = new C2510();
        if (obj != null) {
            c2510.m8006((AbstractC16620) obj);
        }
        c2510.m8006((AbstractC16620) obj2);
        return c2510;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo29(Object obj, View view, ArrayList arrayList) {
        ((AbstractC16620) obj).addListener(new C15749(view, arrayList));
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Object mo25(Object obj, Object obj2, Object obj3) {
        AbstractC16620 abstractC16620 = (AbstractC16620) obj;
        AbstractC16620 abstractC16621 = (AbstractC16620) obj2;
        AbstractC16620 abstractC16622 = (AbstractC16620) obj3;
        if (abstractC16620 != null && abstractC16621 != null) {
            C2510 c2510 = new C2510();
            c2510.m8006(abstractC16620);
            c2510.m8006(abstractC16621);
            c2510.m8007(1);
            abstractC16620 = c2510;
        } else if (abstractC16620 == null) {
            abstractC16620 = abstractC16621 != null ? abstractC16621 : null;
        }
        if (abstractC16622 == null) {
            return abstractC16620;
        }
        C2510 c2511 = new C2510();
        if (abstractC16620 != null) {
            c2511.m8006(abstractC16620);
        }
        c2511.m8006(abstractC16622);
        return c2511;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo27(ViewGroup viewGroup, Object obj) {
        C23676.m52224(viewGroup, (AbstractC16620) obj);
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo30(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC16620) obj).addListener(new C2345(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo33(Object obj, C23686 c23686, final Runnable runnable) {
        final AbstractC16620 abstractC16620 = (AbstractC16620) obj;
        c23686.m52226(new InterfaceC14513() { // from class: l.ۢۛۧ
            @Override // l.InterfaceC14513
            /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
            public final void mo24234() {
                abstractC16620.cancel();
                runnable.run();
            }
        });
        abstractC16620.addListener(new C3756(runnable));
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo32(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C2510 c2510 = (C2510) obj;
        if (c2510 != null) {
            c2510.getTargets().clear();
            c2510.getTargets().addAll(arrayList2);
            m38(c2510, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m38(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList arrayList, @SuppressLint({"UnknownNullness"}) ArrayList arrayList2) {
        AbstractC16620 abstractC16620 = (AbstractC16620) obj;
        int i = 0;
        if (abstractC16620 instanceof C2510) {
            C2510 c2510 = (C2510) abstractC16620;
            int size = c2510.f7972.size();
            while (i < size) {
                m38((i < 0 || i >= c2510.f7972.size()) ? null : (AbstractC16620) c2510.f7972.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m23(abstractC16620)) {
            return;
        }
        List targets = abstractC16620.getTargets();
        if (targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            abstractC16620.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                abstractC16620.removeTarget((View) arrayList.get(size3));
            }
        }
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo26(View view, Object obj) {
        ((AbstractC16620) obj).addTarget(view);
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo28(Object obj, Rect rect) {
        ((AbstractC16620) obj).setEpicenterCallback(new C18573(rect));
    }
}
