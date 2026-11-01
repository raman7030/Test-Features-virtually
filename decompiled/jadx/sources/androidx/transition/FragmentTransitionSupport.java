package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p067l.AbstractC17742;
import p067l.AbstractC18164;
import p067l.C10632;
import p067l.C17336;
import p067l.C20020;
import p067l.C2017;
import p067l.C24870;
import p067l.C4597;
import p067l.C4754;
import p067l.C5938;
import p067l.InterfaceC1562;

/* JADX INFO: loaded from: classes.dex */
public class FragmentTransitionSupport extends AbstractC17742 {
    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo34(Object obj) {
        return obj instanceof AbstractC18164;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ۧ */
    public final Object mo35(Object obj) {
        if (obj != null) {
            return ((AbstractC18164) obj).clone();
        }
        return null;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ܽ */
    public final Object mo39(Object obj) {
        if (obj == null) {
            return null;
        }
        C4754 c4754 = new C4754();
        c4754.m10054((AbstractC18164) obj);
        return c4754;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ۧ */
    public final void mo37(Object obj, View view, ArrayList arrayList) {
        C4754 c4754 = (C4754) obj;
        List targets = c4754.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC17742.m40326((View) arrayList.get(i), targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo31((Object) c4754, arrayList);
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ۧ */
    public final void mo36(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC17742.m40325(rect, view);
            ((AbstractC18164) obj).setEpicenterCallback(new C10632(rect));
        }
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo31(Object obj, ArrayList arrayList) {
        AbstractC18164 abstractC18164 = (AbstractC18164) obj;
        if (abstractC18164 == null) {
            return;
        }
        int i = 0;
        if (abstractC18164 instanceof C4754) {
            C4754 c4754 = (C4754) abstractC18164;
            int size = c4754.f10763.size();
            while (i < size) {
                mo31((Object) ((i < 0 || i >= c4754.f10763.size()) ? null : (AbstractC18164) c4754.f10763.get(i)), arrayList);
                i++;
            }
            return;
        }
        if (m23(abstractC18164) || !AbstractC17742.m40327(abstractC18164.getTargets())) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            abstractC18164.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m23(AbstractC18164 abstractC18164) {
        return (AbstractC17742.m40327(abstractC18164.getTargetIds()) && AbstractC17742.m40327(abstractC18164.getTargetNames()) && AbstractC17742.m40327(abstractC18164.getTargetTypes())) ? false : true;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final Object mo24(Object obj, Object obj2) {
        C4754 c4754 = new C4754();
        if (obj != null) {
            c4754.m10054((AbstractC18164) obj);
        }
        c4754.m10054((AbstractC18164) obj2);
        return c4754;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo29(Object obj, View view, ArrayList arrayList) {
        ((AbstractC18164) obj).addListener(new C17336(view, arrayList));
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final Object mo25(Object obj, Object obj2, Object obj3) {
        AbstractC18164 abstractC18164 = (AbstractC18164) obj;
        AbstractC18164 abstractC18165 = (AbstractC18164) obj2;
        AbstractC18164 abstractC18166 = (AbstractC18164) obj3;
        if (abstractC18164 != null && abstractC18165 != null) {
            C4754 c4754 = new C4754();
            c4754.m10054(abstractC18164);
            c4754.m10054(abstractC18165);
            c4754.m10055(1);
            abstractC18164 = c4754;
        } else if (abstractC18164 == null) {
            abstractC18164 = abstractC18165 != null ? abstractC18165 : null;
        }
        if (abstractC18166 == null) {
            return abstractC18164;
        }
        C4754 c4755 = new C4754();
        if (abstractC18164 != null) {
            c4755.m10054(abstractC18164);
        }
        c4755.m10054(abstractC18166);
        return c4755;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo27(ViewGroup viewGroup, Object obj) {
        C24870.m54627(viewGroup, (AbstractC18164) obj);
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo30(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((AbstractC18164) obj).addListener(new C4597(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo33(Object obj, C2017 c2017, final Runnable runnable) {
        final AbstractC18164 abstractC18164 = (AbstractC18164) obj;
        c2017.m54629(new InterfaceC1562() { // from class: l.ۢۛۧ
            @Override // p067l.InterfaceC1562
            /* JADX INFO: renamed from: ֫ */
            public final void mo26244() {
                abstractC18164.cancel();
                runnable.run();
            }
        });
        abstractC18164.addListener(new C5938(runnable));
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo32(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C4754 c4754 = (C4754) obj;
        if (c4754 != null) {
            c4754.getTargets().clear();
            c4754.getTargets().addAll(arrayList2);
            m38(c4754, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m38(Object obj, @SuppressLint({"UnknownNullness"}) ArrayList arrayList, @SuppressLint({"UnknownNullness"}) ArrayList arrayList2) {
        AbstractC18164 abstractC18164 = (AbstractC18164) obj;
        int i = 0;
        if (abstractC18164 instanceof C4754) {
            C4754 c4754 = (C4754) abstractC18164;
            int size = c4754.f10763.size();
            while (i < size) {
                m38((i < 0 || i >= c4754.f10763.size()) ? null : (AbstractC18164) c4754.f10763.get(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m23(abstractC18164)) {
            return;
        }
        List targets = abstractC18164.getTargets();
        if (targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size2 = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size2) {
            abstractC18164.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size3 = arrayList.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                return;
            } else {
                abstractC18164.removeTarget((View) arrayList.get(size3));
            }
        }
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo26(View view, Object obj) {
        ((AbstractC18164) obj).addTarget(view);
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo28(Object obj, Rect rect) {
        ((AbstractC18164) obj).setEpicenterCallback(new C20020(rect));
    }
}
