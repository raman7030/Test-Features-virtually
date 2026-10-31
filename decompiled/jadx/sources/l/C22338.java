package l;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.᩹ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes.dex */
public final class C22338 extends AbstractC3477 {
    /* JADX WARN: Code duplicated, block: B:211:0x0651  */
    /* JADX WARN: Code duplicated, block: B:224:0x068e  */
    /* JADX WARN: Code duplicated, block: B:228:0x069d  */
    /* JADX WARN: Code duplicated, block: B:229:0x06a0  */
    /* JADX WARN: Code duplicated, block: B:231:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:234:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:239:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:243:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:249:0x070f  */
    /* JADX WARN: Code duplicated, block: B:253:0x072c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0733  */
    /* JADX WARN: Code duplicated, block: B:256:0x074d  */
    /* JADX WARN: Code duplicated, block: B:261:0x0767 A[LOOP:7: B:259:0x0761->B:261:0x0767, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:264:0x0785  */
    /* JADX WARN: Code duplicated, block: B:299:0x0661 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x065d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x066b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0667 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0673 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x066f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0695 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:306:0x0687 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:313:0x0706 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x06f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:316:0x0716 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:317:0x0709 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:? A[RETURN, SYNTHETIC] */
    @Override // l.AbstractC3477
    /* JADX INFO: renamed from: ֫ */
    public final void mo10641(ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        HashMap map;
        ArrayList<C4888> arrayList3;
        C4888 c4888;
        C4888 c4889;
        C4888 c48810;
        C4888 c48811;
        Object obj;
        View view;
        Object objMo24;
        C2727 c2727;
        Object objMo25;
        HashMap map2;
        ArrayList arrayList4;
        ArrayList arrayList5;
        Object obj2;
        ArrayList arrayList6;
        View view2;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        HashMap map3;
        int i;
        Object obj3;
        View view3;
        boolean zContainsValue;
        ViewGroup viewGroupM10646;
        Context context;
        ArrayList<C8227> arrayList11;
        Iterator it;
        boolean z2;
        C4888 c4888M36288;
        ComponentCallbacksC9205 componentCallbacksC9205M14248;
        View view4;
        Animation animation;
        C8227 c8227;
        C5677 c5677M21778;
        Animator animator;
        C4888 c4888M36289;
        ComponentCallbacksC9205 componentCallbacksC9205M14249;
        boolean z3;
        Iterator it2 = arrayList.iterator();
        C4888 c48812 = null;
        C4888 c48813 = null;
        while (it2.hasNext()) {
            C4888 c48814 = (C4888) it2.next();
            EnumC20411 enumC20411M46732 = EnumC20411.m46732(c48814.m14248().mView);
            int i2 = C20928.f67687[c48814.m14246().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (enumC20411M46732 == EnumC20411.VISIBLE && c48812 == null) {
                    c48812 = c48814;
                }
            } else if (i2 == 4 && enumC20411M46732 != EnumC20411.VISIBLE) {
                c48813 = c48814;
            }
        }
        if (AbstractC5180.m14853(2)) {
            C11003.toString(c48812);
            C11003.toString(c48813);
        }
        ArrayList arrayList12 = new ArrayList();
        ArrayList<C21633> arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList(arrayList);
        ComponentCallbacksC9205 componentCallbacksC9205M142410 = ((C4888) C18566.m43105(arrayList, 1)).m14248();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C4888 c48815 = (C4888) it3.next();
            c48815.m14248().mAnimationInfo.f45281 = componentCallbacksC9205M142410.mAnimationInfo.f45281;
            c48815.m14248().mAnimationInfo.f45279 = componentCallbacksC9205M142410.mAnimationInfo.f45279;
            c48815.m14248().mAnimationInfo.f45276 = componentCallbacksC9205M142410.mAnimationInfo.f45276;
            c48815.m14248().mAnimationInfo.f45280 = componentCallbacksC9205M142410.mAnimationInfo.f45280;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C4888 c48816 = (C4888) it4.next();
            C23686 c23686 = new C23686();
            c48816.m14244(c23686);
            arrayList12.add(new C8227(c48816, c23686, z));
            C23686 c23687 = new C23686();
            c48816.m14244(c23687);
            arrayList13.add(new C21633(c48816, c23687, z, !z ? c48816 != c48813 : c48816 != c48812));
            c48816.m14239(new RunnableC9639(this, arrayList14, c48816));
        }
        HashMap map4 = new HashMap();
        AbstractC16176 abstractC16176 = null;
        for (C21633 c21633 : arrayList13) {
            if (!c21633.m36290()) {
                AbstractC16176 abstractC16176M48899 = c21633.m48899();
                if (abstractC16176 == null) {
                    abstractC16176 = abstractC16176M48899;
                } else if (abstractC16176M48899 != null && abstractC16176 != abstractC16176M48899) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c21633.m36288().m14248() + " returned Transition " + c21633.m48901() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC16176 != null) {
            View view5 = new View(m10646().getContext());
            Rect rect = new Rect();
            ArrayList arrayList15 = new ArrayList();
            ArrayList arrayList16 = new ArrayList();
            C2727 c2728 = new C2727();
            Object obj4 = null;
            View view6 = null;
            boolean z4 = false;
            for (C21633 c21634 : arrayList13) {
                if (!c21634.m48897() || c48812 == null || c48813 == null) {
                    arrayList7 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList9 = arrayList14;
                    arrayList10 = arrayList16;
                    map3 = map4;
                } else {
                    Object objMo39 = abstractC16176.mo39(abstractC16176.mo35(c21634.m48898()));
                    ArrayList<String> sharedElementSourceNames = c48813.m14248().getSharedElementSourceNames();
                    ArrayList sharedElementSourceNames2 = c48812.m14248().getSharedElementSourceNames();
                    arrayList7 = arrayList12;
                    ArrayList sharedElementTargetNames = c48812.m14248().getSharedElementTargetNames();
                    arrayList8 = arrayList13;
                    arrayList9 = arrayList14;
                    int i3 = 0;
                    while (i3 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i3));
                        ArrayList arrayList17 = sharedElementTargetNames;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, (String) sharedElementSourceNames2.get(i3));
                        }
                        i3++;
                        sharedElementTargetNames = arrayList17;
                    }
                    ArrayList<String> sharedElementTargetNames2 = c48813.m14248().getSharedElementTargetNames();
                    if (z) {
                        c48812.m14248().getEnterTransitionCallback();
                        c48813.m14248().getExitTransitionCallback();
                    } else {
                        c48812.m14248().getExitTransitionCallback();
                        c48813.m14248().getEnterTransitionCallback();
                    }
                    int i4 = 0;
                    for (int size = sharedElementSourceNames.size(); i4 < size; size = size) {
                        c2728.put((String) sharedElementSourceNames.get(i4), (String) sharedElementTargetNames2.get(i4));
                        i4++;
                    }
                    if (AbstractC5180.m14853(2)) {
                        for (String str : sharedElementTargetNames2) {
                        }
                        for (String str2 : sharedElementSourceNames) {
                        }
                    }
                    C2727 c2729 = new C2727();
                    m50070(c2729, c48812.m14248().mView);
                    c2729.m8463((Collection) sharedElementSourceNames);
                    c2728.m8463((Collection) c2729.keySet());
                    C2727 c27210 = new C2727();
                    m50070(c27210, c48813.m14248().mView);
                    c27210.m8463((Collection) sharedElementTargetNames2);
                    c27210.m8463(c2728.values());
                    AbstractC16176 abstractC16177 = C18294.f56886;
                    int size2 = c2728.size() - 1;
                    while (size2 >= 0) {
                        HashMap map5 = map4;
                        if (!c27210.containsKey((String) c2728.m10498(size2))) {
                            c2728.m10500(size2);
                        }
                        size2--;
                        map4 = map5;
                    }
                    HashMap map6 = map4;
                    m50071(c2729, c2728.keySet());
                    m50071(c27210, c2728.values());
                    if (c2728.isEmpty()) {
                        arrayList15.clear();
                        arrayList16.clear();
                        obj4 = null;
                        arrayList10 = arrayList16;
                        map3 = map6;
                    } else {
                        ComponentCallbacksC9205 componentCallbacksC9205M142411 = c48813.m14248();
                        ComponentCallbacksC9205 componentCallbacksC9205M142412 = c48812.m14248();
                        if (z) {
                            componentCallbacksC9205M142412.getEnterTransitionCallback();
                        } else {
                            componentCallbacksC9205M142411.getEnterTransitionCallback();
                        }
                        ViewTreeObserverOnPreDrawListenerC14493.m34591(m10646(), new RunnableC19517(c48813, c48812, z, c27210));
                        arrayList15.addAll(c2729.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i = 0;
                            obj3 = null;
                        } else {
                            i = 0;
                            obj3 = null;
                            View view7 = (View) c2729.getOrDefault((String) sharedElementSourceNames.get(0), null);
                            abstractC16176.mo36(view7, objMo39);
                            view6 = view7;
                        }
                        arrayList16.addAll(c27210.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view3 = (View) c27210.getOrDefault((String) sharedElementTargetNames2.get(i), obj3)) != null) {
                            ViewTreeObserverOnPreDrawListenerC14493.m34591(m10646(), new RunnableC0465(abstractC16176, view3, rect));
                            z4 = true;
                        }
                        abstractC16176.mo37(objMo39, view5, arrayList15);
                        arrayList10 = arrayList16;
                        abstractC16176.mo30(objMo39, null, null, objMo39, arrayList10);
                        Boolean bool = Boolean.TRUE;
                        map3 = map6;
                        map3.put(c48812, bool);
                        map3.put(c48813, bool);
                        obj4 = objMo39;
                    }
                }
                arrayList15 = arrayList15;
                rect = rect;
                c2728 = c2728;
                arrayList16 = arrayList10;
                map4 = map3;
                arrayList13 = arrayList8;
                arrayList12 = arrayList7;
                arrayList14 = arrayList9;
                view5 = view5;
            }
            arrayList2 = arrayList12;
            ArrayList<C21633> arrayList18 = arrayList13;
            ArrayList arrayList19 = arrayList14;
            C2727 c27211 = c2728;
            ArrayList<View> arrayList20 = arrayList16;
            Rect rect2 = rect;
            View view8 = view5;
            HashMap map7 = map4;
            ArrayList arrayList21 = arrayList15;
            ArrayList arrayList22 = new ArrayList();
            Iterator it5 = arrayList18.iterator();
            Object obj5 = null;
            Object obj6 = null;
            while (it5.hasNext()) {
                C21633 c21635 = (C21633) it5.next();
                if (c21635.m36290()) {
                    map7.put(c21635.m36288(), Boolean.FALSE);
                    c21635.m36287();
                } else {
                    Object objMo35 = abstractC16176.mo35(c21635.m48901());
                    C4888 c4888M362810 = c21635.m36288();
                    boolean z5 = obj4 != null && (c4888M362810 == c48812 || c4888M362810 == c48813);
                    if (objMo35 == null) {
                        if (!z5) {
                            map7.put(c4888M362810, Boolean.FALSE);
                            c21635.m36287();
                        }
                        arrayList4 = arrayList21;
                        c2727 = c27211;
                        view = view8;
                        obj = obj4;
                        map2 = map7;
                        view2 = view6;
                        arrayList6 = arrayList19;
                    } else {
                        HashMap map8 = map7;
                        ArrayList arrayList23 = new ArrayList();
                        m50069(c4888M362810.m14248().mView, arrayList23);
                        if (z5) {
                            if (c4888M362810 == c48812) {
                                arrayList23.removeAll(arrayList21);
                            } else {
                                arrayList23.removeAll(arrayList20);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            abstractC16176.mo26(view8, objMo35);
                            c2727 = c27211;
                            view = view8;
                            obj = obj4;
                            objMo24 = obj6;
                            objMo25 = obj5;
                            arrayList6 = arrayList19;
                            map2 = map8;
                            arrayList4 = arrayList21;
                            obj2 = objMo35;
                            arrayList5 = arrayList23;
                        } else {
                            abstractC16176.mo31(objMo35, arrayList23);
                            obj = obj4;
                            view = view8;
                            objMo24 = obj6;
                            c2727 = c27211;
                            objMo25 = obj5;
                            map2 = map8;
                            arrayList4 = arrayList21;
                            arrayList5 = arrayList23;
                            abstractC16176.mo30(objMo35, objMo35, arrayList23, null, null);
                            if (c4888M362810.m14246() == EnumC20411.GONE) {
                                c4888M362810 = c4888M362810;
                                arrayList6 = arrayList19;
                                arrayList6.remove(c4888M362810);
                                ArrayList arrayList24 = new ArrayList(arrayList5);
                                arrayList24.remove(c4888M362810.m14248().mView);
                                obj2 = objMo35;
                                abstractC16176.mo29(obj2, c4888M362810.m14248().mView, arrayList24);
                                ViewTreeObserverOnPreDrawListenerC14493.m34591(m10646(), new RunnableC5405(arrayList5));
                            } else {
                                c4888M362810 = c4888M362810;
                                obj2 = objMo35;
                                arrayList6 = arrayList19;
                            }
                        }
                        if (c4888M362810.m14246() == EnumC20411.VISIBLE) {
                            arrayList22.addAll(arrayList5);
                            if (z4) {
                                abstractC16176.mo28(obj2, rect2);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            abstractC16176.mo36(view2, obj2);
                        }
                        map2.put(c4888M362810, Boolean.TRUE);
                        if (c21635.m48900()) {
                            objMo25 = abstractC16176.mo24(objMo25, obj2);
                        } else {
                            objMo24 = abstractC16176.mo24(objMo24, obj2);
                        }
                        obj5 = objMo25;
                        obj6 = objMo24;
                    }
                    view6 = view2;
                    map7 = map2;
                    arrayList19 = arrayList6;
                    arrayList21 = arrayList4;
                    obj4 = obj;
                    view8 = view;
                    c27211 = c2727;
                    it5 = it5;
                }
            }
            ArrayList<View> arrayList25 = arrayList21;
            C3432 c3432 = c27211;
            Object obj7 = obj4;
            map = map7;
            arrayList3 = arrayList19;
            Object objMo26 = abstractC16176.mo25(obj5, obj6, obj7);
            if (objMo26 != null) {
                for (C21633 c21636 : arrayList18) {
                    if (!c21636.m36290()) {
                        Object objM48901 = c21636.m48901();
                        C4888 c4888M362811 = c21636.m36288();
                        boolean z6 = obj7 != null && (c4888M362811 == c48812 || c4888M362811 == c48813);
                        if (objM48901 != null || z6) {
                            ViewGroup viewGroupM10647 = m10646();
                            int i5 = C17648.f53953;
                            if (viewGroupM10647.isLaidOut()) {
                                c21636.m36288().getClass();
                                abstractC16176.mo33(objMo26, c21636.m36289(), (Runnable) new RunnableC1171(c21636, c4888M362811));
                            } else {
                                if (AbstractC5180.m14853(2)) {
                                    C11003.toString(m10646());
                                    C11003.toString(c4888M362811);
                                }
                                c21636.m36287();
                            }
                        }
                    }
                }
                ViewGroup viewGroupM10648 = m10646();
                int i6 = C17648.f53953;
                if (viewGroupM10648.isLaidOut()) {
                    C18294.m42642(arrayList22, 4);
                    ArrayList arrayList26 = new ArrayList();
                    int size3 = arrayList20.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        View view9 = (View) arrayList20.get(i7);
                        arrayList26.add(C17648.m41322(view9));
                        C17648.m41306(view9, (String) null);
                    }
                    if (AbstractC5180.m14853(2)) {
                        for (View view10 : arrayList25) {
                            C11003.toString(view10);
                            C17648.m41322(view10);
                        }
                        for (View view11 : arrayList20) {
                            C11003.toString(view11);
                            C17648.m41322(view11);
                        }
                    }
                    abstractC16176.mo27(m10646(), objMo26);
                    ViewGroup viewGroupM10649 = m10646();
                    int size4 = arrayList20.size();
                    ArrayList arrayList27 = new ArrayList();
                    int i8 = 0;
                    while (i8 < size4) {
                        ArrayList arrayList28 = arrayList25;
                        View view12 = (View) arrayList28.get(i8);
                        String strM41322 = C17648.m41322(view12);
                        arrayList27.add(strM41322);
                        if (strM41322 == null) {
                            c48811 = c48812;
                            c48810 = c48813;
                        } else {
                            c48810 = c48813;
                            C17648.m41306(view12, (String) null);
                            String str3 = (String) c3432.getOrDefault(strM41322, null);
                            int i9 = 0;
                            while (true) {
                                c48811 = c48812;
                                if (i9 >= size4) {
                                    break;
                                }
                                if (str3.equals(arrayList26.get(i9))) {
                                    C17648.m41306((View) arrayList20.get(i9), strM41322);
                                    break;
                                } else {
                                    i9++;
                                    c48812 = c48811;
                                }
                            }
                        }
                        i8++;
                        arrayList25 = arrayList28;
                        c48813 = c48810;
                        c48812 = c48811;
                    }
                    c4888 = c48812;
                    c4889 = c48813;
                    ArrayList arrayList29 = arrayList25;
                    ViewTreeObserverOnPreDrawListenerC14493.m34591(viewGroupM10649, new RunnableC9122(size4, arrayList20, arrayList26, arrayList29, arrayList27));
                    C18294.m42642(arrayList22, 0);
                    abstractC16176.mo32(obj7, arrayList29, arrayList20);
                }
            }
            zContainsValue = map.containsValue(Boolean.TRUE);
            viewGroupM10646 = m10646();
            context = viewGroupM10646.getContext();
            arrayList11 = new ArrayList();
            it = arrayList2.iterator();
            z2 = false;
            while (it.hasNext()) {
                c8227 = (C8227) it.next();
                if (c8227.m36290()) {
                    c8227.m36287();
                } else {
                    c5677M21778 = c8227.m21778(context);
                    if (c5677M21778 == null) {
                        c8227.m36287();
                    } else {
                        animator = c5677M21778.f17532;
                        if (animator == null) {
                            arrayList11.add(c8227);
                        } else {
                            c4888M36289 = c8227.m36288();
                            componentCallbacksC9205M14249 = c4888M36289.m14248();
                            if (Boolean.TRUE.equals(map.get(c4888M36289))) {
                                if (AbstractC5180.m14853(2)) {
                                    C11003.toString(componentCallbacksC9205M14249);
                                }
                                c8227.m36287();
                            } else {
                                if (c4888M36289.m14246() == EnumC20411.GONE) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    arrayList3.remove(c4888M36289);
                                }
                                View view13 = componentCallbacksC9205M14249.mView;
                                viewGroupM10646.startViewTransition(view13);
                                Iterator it6 = it;
                                animator.addListener(new C8933(viewGroupM10646, view13, z3, c4888M36289, c8227));
                                animator.setTarget(view13);
                                animator.start();
                                if (AbstractC5180.m14853(2)) {
                                    c4888M36289.toString();
                                }
                                c8227.m36289().m52226(new C15987(animator, c4888M36289));
                                z2 = true;
                                it = it6;
                            }
                        }
                    }
                }
            }
            for (C8227 c8228 : arrayList11) {
                c4888M36288 = c8228.m36288();
                componentCallbacksC9205M14248 = c4888M36288.m14248();
                if (zContainsValue) {
                    if (AbstractC5180.m14853(2)) {
                        C11003.toString(componentCallbacksC9205M14248);
                    }
                    c8228.m36287();
                } else if (z2) {
                    if (AbstractC5180.m14853(2)) {
                        C11003.toString(componentCallbacksC9205M14248);
                    }
                    c8228.m36287();
                } else {
                    view4 = componentCallbacksC9205M14248.mView;
                    C5677 c5677M21779 = c8228.m21778(context);
                    c5677M21779.getClass();
                    animation = c5677M21779.f17531;
                    animation.getClass();
                    if (c4888M36288.m14246() != EnumC20411.REMOVED) {
                        view4.startAnimation(animation);
                        c8228.m36287();
                    } else {
                        viewGroupM10646.startViewTransition(view4);
                        RunnableC1443 runnableC1443 = new RunnableC1443(animation, viewGroupM10646, view4);
                        runnableC1443.setAnimationListener(new AnimationAnimationListenerC3994(view4, viewGroupM10646, c8228, c4888M36288));
                        view4.startAnimation(runnableC1443);
                        if (AbstractC5180.m14853(2)) {
                            c4888M36288.toString();
                        }
                    }
                    c8228.m36289().m52226(new C18811(view4, viewGroupM10646, c8228, c4888M36288));
                }
            }
            for (C4888 c48817 : arrayList3) {
                c48817.m14246().m46733(c48817.m14248().mView);
            }
            arrayList3.clear();
            if (AbstractC5180.m14853(2)) {
                C11003.toString(c4888);
                C11003.toString(c4889);
            }
        }
        for (C21633 c21637 : arrayList13) {
            map4.put(c21637.m36288(), Boolean.FALSE);
            c21637.m36287();
        }
        map = map4;
        arrayList2 = arrayList12;
        arrayList3 = arrayList14;
        c4888 = c48812;
        c4889 = c48813;
        zContainsValue = map.containsValue(Boolean.TRUE);
        viewGroupM10646 = m10646();
        context = viewGroupM10646.getContext();
        arrayList11 = new ArrayList();
        it = arrayList2.iterator();
        z2 = false;
        while (it.hasNext()) {
            c8227 = (C8227) it.next();
            if (c8227.m36290()) {
                c8227.m36287();
            } else {
                c5677M21778 = c8227.m21778(context);
                if (c5677M21778 == null) {
                    c8227.m36287();
                } else {
                    animator = c5677M21778.f17532;
                    if (animator == null) {
                        arrayList11.add(c8227);
                    } else {
                        c4888M36289 = c8227.m36288();
                        componentCallbacksC9205M14249 = c4888M36289.m14248();
                        if (Boolean.TRUE.equals(map.get(c4888M36289))) {
                            if (AbstractC5180.m14853(2)) {
                                C11003.toString(componentCallbacksC9205M14249);
                            }
                            c8227.m36287();
                        } else {
                            if (c4888M36289.m14246() == EnumC20411.GONE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                arrayList3.remove(c4888M36289);
                            }
                            View view14 = componentCallbacksC9205M14249.mView;
                            viewGroupM10646.startViewTransition(view14);
                            Iterator it7 = it;
                            animator.addListener(new C8933(viewGroupM10646, view14, z3, c4888M36289, c8227));
                            animator.setTarget(view14);
                            animator.start();
                            if (AbstractC5180.m14853(2)) {
                                c4888M36289.toString();
                            }
                            c8227.m36289().m52226(new C15987(animator, c4888M36289));
                            z2 = true;
                            it = it7;
                        }
                    }
                }
            }
        }
        while (r3.hasNext()) {
            c4888M36288 = c8228.m36288();
            componentCallbacksC9205M14248 = c4888M36288.m14248();
            if (zContainsValue) {
                if (AbstractC5180.m14853(2)) {
                    C11003.toString(componentCallbacksC9205M14248);
                }
                c8228.m36287();
            } else if (z2) {
                if (AbstractC5180.m14853(2)) {
                    C11003.toString(componentCallbacksC9205M14248);
                }
                c8228.m36287();
            } else {
                view4 = componentCallbacksC9205M14248.mView;
                C5677 c5677M217710 = c8228.m21778(context);
                c5677M217710.getClass();
                animation = c5677M217710.f17531;
                animation.getClass();
                if (c4888M36288.m14246() != EnumC20411.REMOVED) {
                    view4.startAnimation(animation);
                    c8228.m36287();
                } else {
                    viewGroupM10646.startViewTransition(view4);
                    RunnableC1443 runnableC1444 = new RunnableC1443(animation, viewGroupM10646, view4);
                    runnableC1444.setAnimationListener(new AnimationAnimationListenerC3994(view4, viewGroupM10646, c8228, c4888M36288));
                    view4.startAnimation(runnableC1444);
                    if (AbstractC5180.m14853(2)) {
                        c4888M36288.toString();
                    }
                }
                c8228.m36289().m52226(new C18811(view4, viewGroupM10646, c8228, c4888M36288));
            }
        }
        while (r0.hasNext()) {
            c48817.m14246().m46733(c48817.m14248().mView);
        }
        arrayList3.clear();
        if (AbstractC5180.m14853(2)) {
            C11003.toString(c4888);
            C11003.toString(c4889);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50071(C2727 c2727, Collection collection) {
        Iterator it = c2727.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C17648.m41322((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50069(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C9182.m23585(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m50069(childAt, arrayList);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m50070(C2727 c2727, View view) {
        String strM41322 = C17648.m41322(view);
        if (strM41322 != null) {
            c2727.put(strM41322, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m50070(c2727, childAt);
                }
            }
        }
    }
}
