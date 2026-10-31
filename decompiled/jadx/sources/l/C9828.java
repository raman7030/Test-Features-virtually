package l;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۢ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 451G */
/* JADX INFO: loaded from: classes3.dex */
public final class C9828 extends AbstractC16176 {
    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo34(Object obj) {
        return obj instanceof Transition;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ۧ */
    public final Object mo35(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ܽ */
    public final Object mo39(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ۧ */
    public final void mo37(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC16176.m38114((View) arrayList.get(i), (List) targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo31((Object) transitionSet, arrayList);
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ۧ */
    public final void mo36(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC16176.m38113(rect, view);
            ((Transition) obj).setEpicenterCallback(new C17588(rect));
        }
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final void mo31(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo31((Object) transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m24899(transition) || !AbstractC16176.m38115((List) transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m24899(Transition transition) {
        return (AbstractC16176.m38115((List) transition.getTargetIds()) && AbstractC16176.m38115((List) transition.getTargetNames()) && AbstractC16176.m38115((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final Object mo24(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final void mo29(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C14765(view, arrayList));
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final Object mo25(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final void mo27(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final void mo30(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C23938(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final void mo33(Object obj, C23686 c23686, Runnable runnable) {
        ((Transition) obj).addListener(new C7005(runnable));
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final void mo32(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m24900(transitionSet, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m24900(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m24900(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m24899(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget((View) arrayList2.get(i));
            i++;
        }
        int size2 = arrayList.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                return;
            } else {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final void mo26(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // l.AbstractC16176
    /* JADX INFO: renamed from: ֫ */
    public final void mo28(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C21117(rect));
    }
}
