package p067l;

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
public final class C11709 extends AbstractC17742 {
    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo34(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ۧ */
    public final Object mo35(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ܽ */
    public final Object mo39(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ۧ */
    public final void mo37(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC17742.m40326((View) arrayList.get(i), (List) targets);
        }
        targets.add(view);
        arrayList.add(view);
        mo31((Object) transitionSet, arrayList);
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ۧ */
    public final void mo36(View view, Object obj) {
        if (view != null) {
            Rect rect = new Rect();
            AbstractC17742.m40325(rect, view);
            ((Transition) obj).setEpicenterCallback(new C19084(rect));
        }
    }

    @Override // p067l.AbstractC17742
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
        if (m26914(transition) || !AbstractC17742.m40327((List) transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget((View) arrayList.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m26914(Transition transition) {
        return (AbstractC17742.m40327((List) transition.getTargetIds()) && AbstractC17742.m40327((List) transition.getTargetNames()) && AbstractC17742.m40327((List) transition.getTargetTypes())) ? false : true;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final Object mo24(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo29(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C16401(view, arrayList));
    }

    @Override // p067l.AbstractC17742
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

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo27(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo30(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2) {
        ((Transition) obj).addListener(new C25119(this, obj2, arrayList, obj3, arrayList2));
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo33(Object obj, C2017 c2017, Runnable runnable) {
        ((Transition) obj).addListener(new C9026(runnable));
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo32(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m26915(transitionSet, arrayList, arrayList2);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m26915(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m26915(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m26914(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
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

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo26(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // p067l.AbstractC17742
    /* JADX INFO: renamed from: ֫ */
    public final void mo28(Object obj, Rect rect) {
        ((Transition) obj).setEpicenterCallback(new C22438(rect));
    }
}
