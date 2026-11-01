package p067l;

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
public final class C23598 extends AbstractC5673 {
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
    @Override // p067l.AbstractC5673
    /* JADX INFO: renamed from: ֫ */
    public final void mo12636(ArrayList arrayList, boolean z) {
        ArrayList arrayList2;
        HashMap map;
        ArrayList<C7014> arrayList3;
        C7014 c7014;
        C7014 c7015;
        C7014 c7016;
        C7014 c7017;
        Object obj;
        View view;
        Object objMo24;
        C0977 c0977;
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
        ViewGroup viewGroupM12641;
        Context context;
        ArrayList<C10187> arrayList11;
        Iterator it;
        boolean z2;
        C7014 c7014M38449;
        ComponentCallbacksC11117 componentCallbacksC11117M16145;
        View view4;
        Animation animation;
        C10187 c10187;
        C7764 c7764M23747;
        Animator animator;
        C7014 c7014M384410;
        ComponentCallbacksC11117 componentCallbacksC11117M16146;
        boolean z3;
        Iterator it2 = arrayList.iterator();
        C7014 c7018 = null;
        C7014 c7019 = null;
        while (it2.hasNext()) {
            C7014 c70110 = (C7014) it2.next();
            EnumC21767 enumC21767M49055 = EnumC21767.m49055(c70110.m16145().mView);
            int i2 = C22258.f70372[c70110.m16143().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (enumC21767M49055 == EnumC21767.VISIBLE && c7018 == null) {
                    c7018 = c70110;
                }
            } else if (i2 == 4 && enumC21767M49055 != EnumC21767.VISIBLE) {
                c7019 = c70110;
            }
        }
        if (AbstractC7291.m16763(2)) {
            C12826.toString(c7018);
            C12826.toString(c7019);
        }
        ArrayList arrayList12 = new ArrayList();
        ArrayList<C22928> arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList(arrayList);
        ComponentCallbacksC11117 componentCallbacksC11117M16147 = ((C7014) C20013.m45383(arrayList, 1)).m16145();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C7014 c70111 = (C7014) it3.next();
            c70111.m16145().mAnimationInfo.f48397 = componentCallbacksC11117M16147.mAnimationInfo.f48397;
            c70111.m16145().mAnimationInfo.f48395 = componentCallbacksC11117M16147.mAnimationInfo.f48395;
            c70111.m16145().mAnimationInfo.f48392 = componentCallbacksC11117M16147.mAnimationInfo.f48392;
            c70111.m16145().mAnimationInfo.f48396 = componentCallbacksC11117M16147.mAnimationInfo.f48396;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C7014 c70112 = (C7014) it4.next();
            C2017 c2017 = new C2017();
            c70112.m16141(c2017);
            arrayList12.add(new C10187(c70112, c2017, z));
            C2017 c2018 = new C2017();
            c70112.m16141(c2018);
            arrayList13.add(new C22928(c70112, c2018, z, !z ? c70112 != c7019 : c70112 != c7018));
            c70112.m16136(new RunnableC11529(this, arrayList14, c70112));
        }
        HashMap map4 = new HashMap();
        AbstractC17742 abstractC17742 = null;
        for (C22928 c22928 : arrayList13) {
            if (!c22928.m38451()) {
                AbstractC17742 abstractC17742M51247 = c22928.m51247();
                if (abstractC17742 == null) {
                    abstractC17742 = abstractC17742M51247;
                } else if (abstractC17742M51247 != null && abstractC17742 != abstractC17742M51247) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c22928.m38449().m16145() + " returned Transition " + c22928.m51249() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC17742 != null) {
            View view5 = new View(m12641().getContext());
            Rect rect = new Rect();
            ArrayList arrayList15 = new ArrayList();
            ArrayList arrayList16 = new ArrayList();
            C0977 c0978 = new C0977();
            Object obj4 = null;
            View view6 = null;
            boolean z4 = false;
            for (C22928 c22929 : arrayList13) {
                if (!c22929.m51245() || c7018 == null || c7019 == null) {
                    arrayList7 = arrayList12;
                    arrayList8 = arrayList13;
                    arrayList9 = arrayList14;
                    arrayList10 = arrayList16;
                    map3 = map4;
                } else {
                    Object objMo39 = abstractC17742.mo39(abstractC17742.mo35(c22929.m51246()));
                    ArrayList<String> sharedElementSourceNames = c7019.m16145().getSharedElementSourceNames();
                    ArrayList sharedElementSourceNames2 = c7018.m16145().getSharedElementSourceNames();
                    arrayList7 = arrayList12;
                    ArrayList sharedElementTargetNames = c7018.m16145().getSharedElementTargetNames();
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
                    ArrayList<String> sharedElementTargetNames2 = c7019.m16145().getSharedElementTargetNames();
                    if (z) {
                        c7018.m16145().getEnterTransitionCallback();
                        c7019.m16145().getExitTransitionCallback();
                    } else {
                        c7018.m16145().getExitTransitionCallback();
                        c7019.m16145().getEnterTransitionCallback();
                    }
                    int i4 = 0;
                    for (int size = sharedElementSourceNames.size(); i4 < size; size = size) {
                        c0978.put((String) sharedElementSourceNames.get(i4), (String) sharedElementTargetNames2.get(i4));
                        i4++;
                    }
                    if (AbstractC7291.m16763(2)) {
                        for (String str : sharedElementTargetNames2) {
                        }
                        for (String str2 : sharedElementSourceNames) {
                        }
                    }
                    C0977 c0979 = new C0977();
                    m52409(c0979, c7018.m16145().mView);
                    c0979.m10510((Collection) sharedElementSourceNames);
                    c0978.m10510((Collection) c0979.keySet());
                    C0977 c09710 = new C0977();
                    m52409(c09710, c7019.m16145().mView);
                    c09710.m10510((Collection) sharedElementTargetNames2);
                    c09710.m10510(c0978.values());
                    AbstractC17742 abstractC17743 = C19755.f60104;
                    int size2 = c0978.size() - 1;
                    while (size2 >= 0) {
                        HashMap map5 = map4;
                        if (!c09710.containsKey((String) c0978.m12521(size2))) {
                            c0978.m12523(size2);
                        }
                        size2--;
                        map4 = map5;
                    }
                    HashMap map6 = map4;
                    m52410(c0979, c0978.keySet());
                    m52410(c09710, c0978.values());
                    if (c0978.isEmpty()) {
                        arrayList15.clear();
                        arrayList16.clear();
                        obj4 = null;
                        arrayList10 = arrayList16;
                        map3 = map6;
                    } else {
                        ComponentCallbacksC11117 componentCallbacksC11117M16148 = c7019.m16145();
                        ComponentCallbacksC11117 componentCallbacksC11117M16149 = c7018.m16145();
                        if (z) {
                            componentCallbacksC11117M16149.getEnterTransitionCallback();
                        } else {
                            componentCallbacksC11117M16148.getEnterTransitionCallback();
                        }
                        ViewTreeObserverOnPreDrawListenerC1561.m36732(m12641(), new RunnableC20917(c7019, c7018, z, c09710));
                        arrayList15.addAll(c0979.values());
                        if (sharedElementSourceNames.isEmpty()) {
                            i = 0;
                            obj3 = null;
                        } else {
                            i = 0;
                            obj3 = null;
                            View view7 = (View) c0979.getOrDefault((String) sharedElementSourceNames.get(0), null);
                            abstractC17742.mo36(view7, objMo39);
                            view6 = view7;
                        }
                        arrayList16.addAll(c09710.values());
                        if (!sharedElementTargetNames2.isEmpty() && (view3 = (View) c09710.getOrDefault((String) sharedElementTargetNames2.get(i), obj3)) != null) {
                            ViewTreeObserverOnPreDrawListenerC1561.m36732(m12641(), new RunnableC2810(abstractC17742, view3, rect));
                            z4 = true;
                        }
                        abstractC17742.mo37(objMo39, view5, arrayList15);
                        arrayList10 = arrayList16;
                        abstractC17742.mo30(objMo39, null, null, objMo39, arrayList10);
                        Boolean bool = Boolean.TRUE;
                        map3 = map6;
                        map3.put(c7018, bool);
                        map3.put(c7019, bool);
                        obj4 = objMo39;
                    }
                }
                arrayList15 = arrayList15;
                rect = rect;
                c0978 = c0978;
                arrayList16 = arrayList10;
                map4 = map3;
                arrayList13 = arrayList8;
                arrayList12 = arrayList7;
                arrayList14 = arrayList9;
                view5 = view5;
            }
            arrayList2 = arrayList12;
            ArrayList<C22928> arrayList18 = arrayList13;
            ArrayList arrayList19 = arrayList14;
            C0977 c09711 = c0978;
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
                C22928 c229210 = (C22928) it5.next();
                if (c229210.m38451()) {
                    map7.put(c229210.m38449(), Boolean.FALSE);
                    c229210.m38448();
                } else {
                    Object objMo35 = abstractC17742.mo35(c229210.m51249());
                    C7014 c7014M384411 = c229210.m38449();
                    boolean z5 = obj4 != null && (c7014M384411 == c7018 || c7014M384411 == c7019);
                    if (objMo35 == null) {
                        if (!z5) {
                            map7.put(c7014M384411, Boolean.FALSE);
                            c229210.m38448();
                        }
                        arrayList4 = arrayList21;
                        c0977 = c09711;
                        view = view8;
                        obj = obj4;
                        map2 = map7;
                        view2 = view6;
                        arrayList6 = arrayList19;
                    } else {
                        HashMap map8 = map7;
                        ArrayList arrayList23 = new ArrayList();
                        m52408(c7014M384411.m16145().mView, arrayList23);
                        if (z5) {
                            if (c7014M384411 == c7018) {
                                arrayList23.removeAll(arrayList21);
                            } else {
                                arrayList23.removeAll(arrayList20);
                            }
                        }
                        if (arrayList23.isEmpty()) {
                            abstractC17742.mo26(view8, objMo35);
                            c0977 = c09711;
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
                            abstractC17742.mo31(objMo35, arrayList23);
                            obj = obj4;
                            view = view8;
                            objMo24 = obj6;
                            c0977 = c09711;
                            objMo25 = obj5;
                            map2 = map8;
                            arrayList4 = arrayList21;
                            arrayList5 = arrayList23;
                            abstractC17742.mo30(objMo35, objMo35, arrayList23, null, null);
                            if (c7014M384411.m16143() == EnumC21767.GONE) {
                                c7014M384411 = c7014M384411;
                                arrayList6 = arrayList19;
                                arrayList6.remove(c7014M384411);
                                ArrayList arrayList24 = new ArrayList(arrayList5);
                                arrayList24.remove(c7014M384411.m16145().mView);
                                obj2 = objMo35;
                                abstractC17742.mo29(obj2, c7014M384411.m16145().mView, arrayList24);
                                ViewTreeObserverOnPreDrawListenerC1561.m36732(m12641(), new RunnableC7505(arrayList5));
                            } else {
                                c7014M384411 = c7014M384411;
                                obj2 = objMo35;
                                arrayList6 = arrayList19;
                            }
                        }
                        if (c7014M384411.m16143() == EnumC21767.VISIBLE) {
                            arrayList22.addAll(arrayList5);
                            if (z4) {
                                abstractC17742.mo28(obj2, rect2);
                            }
                            view2 = view6;
                        } else {
                            view2 = view6;
                            abstractC17742.mo36(view2, obj2);
                        }
                        map2.put(c7014M384411, Boolean.TRUE);
                        if (c229210.m51248()) {
                            objMo25 = abstractC17742.mo24(objMo25, obj2);
                        } else {
                            objMo24 = abstractC17742.mo24(objMo24, obj2);
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
                    c09711 = c0977;
                    it5 = it5;
                }
            }
            ArrayList<View> arrayList25 = arrayList21;
            C1012 c1012 = c09711;
            Object obj7 = obj4;
            map = map7;
            arrayList3 = arrayList19;
            Object objMo26 = abstractC17742.mo25(obj5, obj6, obj7);
            if (objMo26 != null) {
                for (C22928 c229211 : arrayList18) {
                    if (!c229211.m38451()) {
                        Object objM51249 = c229211.m51249();
                        C7014 c7014M384412 = c229211.m38449();
                        boolean z6 = obj7 != null && (c7014M384412 == c7018 || c7014M384412 == c7019);
                        if (objM51249 != null || z6) {
                            ViewGroup viewGroupM12642 = m12641();
                            int i5 = C1717.f57146;
                            if (viewGroupM12642.isLaidOut()) {
                                c229211.m38449().getClass();
                                abstractC17742.mo33(objMo26, c229211.m38450(), (Runnable) new RunnableC3481(c229211, c7014M384412));
                            } else {
                                if (AbstractC7291.m16763(2)) {
                                    C12826.toString(m12641());
                                    C12826.toString(c7014M384412);
                                }
                                c229211.m38448();
                            }
                        }
                    }
                }
                ViewGroup viewGroupM12643 = m12641();
                int i6 = C1717.f57146;
                if (viewGroupM12643.isLaidOut()) {
                    C19755.m44902(arrayList22, 4);
                    ArrayList arrayList26 = new ArrayList();
                    int size3 = arrayList20.size();
                    for (int i7 = 0; i7 < size3; i7++) {
                        View view9 = (View) arrayList20.get(i7);
                        arrayList26.add(C1717.m43568(view9));
                        C1717.m43552(view9, (String) null);
                    }
                    if (AbstractC7291.m16763(2)) {
                        for (View view10 : arrayList25) {
                            C12826.toString(view10);
                            C1717.m43568(view10);
                        }
                        for (View view11 : arrayList20) {
                            C12826.toString(view11);
                            C1717.m43568(view11);
                        }
                    }
                    abstractC17742.mo27(m12641(), objMo26);
                    ViewGroup viewGroupM12644 = m12641();
                    int size4 = arrayList20.size();
                    ArrayList arrayList27 = new ArrayList();
                    int i8 = 0;
                    while (i8 < size4) {
                        ArrayList arrayList28 = arrayList25;
                        View view12 = (View) arrayList28.get(i8);
                        String strM43568 = C1717.m43568(view12);
                        arrayList27.add(strM43568);
                        if (strM43568 == null) {
                            c7017 = c7018;
                            c7016 = c7019;
                        } else {
                            c7016 = c7019;
                            C1717.m43552(view12, (String) null);
                            String str3 = (String) c1012.getOrDefault(strM43568, null);
                            int i9 = 0;
                            while (true) {
                                c7017 = c7018;
                                if (i9 >= size4) {
                                    break;
                                }
                                if (str3.equals(arrayList26.get(i9))) {
                                    C1717.m43552((View) arrayList20.get(i9), strM43568);
                                    break;
                                } else {
                                    i9++;
                                    c7018 = c7017;
                                }
                            }
                        }
                        i8++;
                        arrayList25 = arrayList28;
                        c7019 = c7016;
                        c7018 = c7017;
                    }
                    c7014 = c7018;
                    c7015 = c7019;
                    ArrayList arrayList29 = arrayList25;
                    ViewTreeObserverOnPreDrawListenerC1561.m36732(viewGroupM12644, new RunnableC11038(size4, arrayList20, arrayList26, arrayList29, arrayList27));
                    C19755.m44902(arrayList22, 0);
                    abstractC17742.mo32(obj7, arrayList29, arrayList20);
                }
            }
            zContainsValue = map.containsValue(Boolean.TRUE);
            viewGroupM12641 = m12641();
            context = viewGroupM12641.getContext();
            arrayList11 = new ArrayList();
            it = arrayList2.iterator();
            z2 = false;
            while (it.hasNext()) {
                c10187 = (C10187) it.next();
                if (c10187.m38451()) {
                    c10187.m38448();
                } else {
                    c7764M23747 = c10187.m23747(context);
                    if (c7764M23747 == null) {
                        c10187.m38448();
                    } else {
                        animator = c7764M23747.f20379;
                        if (animator == null) {
                            arrayList11.add(c10187);
                        } else {
                            c7014M384410 = c10187.m38449();
                            componentCallbacksC11117M16146 = c7014M384410.m16145();
                            if (Boolean.TRUE.equals(map.get(c7014M384410))) {
                                if (AbstractC7291.m16763(2)) {
                                    C12826.toString(componentCallbacksC11117M16146);
                                }
                                c10187.m38448();
                            } else {
                                if (c7014M384410.m16143() == EnumC21767.GONE) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    arrayList3.remove(c7014M384410);
                                }
                                View view13 = componentCallbacksC11117M16146.mView;
                                viewGroupM12641.startViewTransition(view13);
                                Iterator it6 = it;
                                animator.addListener(new C10858(viewGroupM12641, view13, z3, c7014M384410, c10187));
                                animator.setTarget(view13);
                                animator.start();
                                if (AbstractC7291.m16763(2)) {
                                    c7014M384410.toString();
                                }
                                c10187.m38450().m54629(new C17562(animator, c7014M384410));
                                z2 = true;
                                it = it6;
                            }
                        }
                    }
                }
            }
            for (C10187 c10188 : arrayList11) {
                c7014M38449 = c10188.m38449();
                componentCallbacksC11117M16145 = c7014M38449.m16145();
                if (zContainsValue) {
                    if (AbstractC7291.m16763(2)) {
                        C12826.toString(componentCallbacksC11117M16145);
                    }
                    c10188.m38448();
                } else if (z2) {
                    if (AbstractC7291.m16763(2)) {
                        C12826.toString(componentCallbacksC11117M16145);
                    }
                    c10188.m38448();
                } else {
                    view4 = componentCallbacksC11117M16145.mView;
                    C7764 c7764M23748 = c10188.m23747(context);
                    c7764M23748.getClass();
                    animation = c7764M23748.f20378;
                    animation.getClass();
                    if (c7014M38449.m16143() != EnumC21767.REMOVED) {
                        view4.startAnimation(animation);
                        c10188.m38448();
                    } else {
                        viewGroupM12641.startViewTransition(view4);
                        RunnableC3740 runnableC3740 = new RunnableC3740(animation, viewGroupM12641, view4);
                        runnableC3740.setAnimationListener(new AnimationAnimationListenerC6164(view4, viewGroupM12641, c10188, c7014M38449));
                        view4.startAnimation(runnableC3740);
                        if (AbstractC7291.m16763(2)) {
                            c7014M38449.toString();
                        }
                    }
                    c10188.m38450().m54629(new C20246(view4, viewGroupM12641, c10188, c7014M38449));
                }
            }
            for (C7014 c70113 : arrayList3) {
                c70113.m16143().m49056(c70113.m16145().mView);
            }
            arrayList3.clear();
            if (AbstractC7291.m16763(2)) {
                C12826.toString(c7014);
                C12826.toString(c7015);
            }
        }
        for (C22928 c229212 : arrayList13) {
            map4.put(c229212.m38449(), Boolean.FALSE);
            c229212.m38448();
        }
        map = map4;
        arrayList2 = arrayList12;
        arrayList3 = arrayList14;
        c7014 = c7018;
        c7015 = c7019;
        zContainsValue = map.containsValue(Boolean.TRUE);
        viewGroupM12641 = m12641();
        context = viewGroupM12641.getContext();
        arrayList11 = new ArrayList();
        it = arrayList2.iterator();
        z2 = false;
        while (it.hasNext()) {
            c10187 = (C10187) it.next();
            if (c10187.m38451()) {
                c10187.m38448();
            } else {
                c7764M23747 = c10187.m23747(context);
                if (c7764M23747 == null) {
                    c10187.m38448();
                } else {
                    animator = c7764M23747.f20379;
                    if (animator == null) {
                        arrayList11.add(c10187);
                    } else {
                        c7014M384410 = c10187.m38449();
                        componentCallbacksC11117M16146 = c7014M384410.m16145();
                        if (Boolean.TRUE.equals(map.get(c7014M384410))) {
                            if (AbstractC7291.m16763(2)) {
                                C12826.toString(componentCallbacksC11117M16146);
                            }
                            c10187.m38448();
                        } else {
                            if (c7014M384410.m16143() == EnumC21767.GONE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                arrayList3.remove(c7014M384410);
                            }
                            View view14 = componentCallbacksC11117M16146.mView;
                            viewGroupM12641.startViewTransition(view14);
                            Iterator it7 = it;
                            animator.addListener(new C10858(viewGroupM12641, view14, z3, c7014M384410, c10187));
                            animator.setTarget(view14);
                            animator.start();
                            if (AbstractC7291.m16763(2)) {
                                c7014M384410.toString();
                            }
                            c10187.m38450().m54629(new C17562(animator, c7014M384410));
                            z2 = true;
                            it = it7;
                        }
                    }
                }
            }
        }
        while (r3.hasNext()) {
            c7014M38449 = c10188.m38449();
            componentCallbacksC11117M16145 = c7014M38449.m16145();
            if (zContainsValue) {
                if (AbstractC7291.m16763(2)) {
                    C12826.toString(componentCallbacksC11117M16145);
                }
                c10188.m38448();
            } else if (z2) {
                if (AbstractC7291.m16763(2)) {
                    C12826.toString(componentCallbacksC11117M16145);
                }
                c10188.m38448();
            } else {
                view4 = componentCallbacksC11117M16145.mView;
                C7764 c7764M23749 = c10188.m23747(context);
                c7764M23749.getClass();
                animation = c7764M23749.f20378;
                animation.getClass();
                if (c7014M38449.m16143() != EnumC21767.REMOVED) {
                    view4.startAnimation(animation);
                    c10188.m38448();
                } else {
                    viewGroupM12641.startViewTransition(view4);
                    RunnableC3740 runnableC3741 = new RunnableC3740(animation, viewGroupM12641, view4);
                    runnableC3741.setAnimationListener(new AnimationAnimationListenerC6164(view4, viewGroupM12641, c10188, c7014M38449));
                    view4.startAnimation(runnableC3741);
                    if (AbstractC7291.m16763(2)) {
                        c7014M38449.toString();
                    }
                }
                c10188.m38450().m54629(new C20246(view4, viewGroupM12641, c10188, c7014M38449));
            }
        }
        while (r0.hasNext()) {
            c70113.m16143().m49056(c70113.m16145().mView);
        }
        arrayList3.clear();
        if (AbstractC7291.m16763(2)) {
            C12826.toString(c7014);
            C12826.toString(c7015);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52410(C0977 c0977, Collection collection) {
        Iterator it = c0977.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C1717.m43568((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52408(View view, ArrayList arrayList) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C1297.m25537(viewGroup)) {
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
                    m52408(childAt, arrayList);
                }
            }
            return;
        }
        if (arrayList.contains(view)) {
            return;
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m52409(C0977 c0977, View view) {
        String strM43568 = C1717.m43568(view);
        if (strM43568 != null) {
            c0977.put(strM43568, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m52409(c0977, childAt);
                }
            }
        }
    }
}
