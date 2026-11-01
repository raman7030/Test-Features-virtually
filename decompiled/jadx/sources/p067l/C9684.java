package p067l;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class C9684 extends AbstractC13509 {

    /* JADX INFO: renamed from: ֨ */
    public static TimeInterpolator f26680;

    /* JADX INFO: renamed from: ֡ */
    public ArrayList f26681;

    /* JADX INFO: renamed from: ۖ */
    public ArrayList f26682;

    /* JADX INFO: renamed from: ۘ */
    public ArrayList f26683;

    /* JADX INFO: renamed from: ۚ */
    public ArrayList f26684;

    /* JADX INFO: renamed from: ۜ */
    public ArrayList f26685;

    /* JADX INFO: renamed from: ۡ */
    public ArrayList f26686;

    /* JADX INFO: renamed from: ۢ */
    public ArrayList f26687;

    /* JADX INFO: renamed from: ܺ */
    public ArrayList f26688;

    /* JADX INFO: renamed from: ᩴ */
    public ArrayList f26689;

    /* JADX INFO: renamed from: ᩵ */
    public ArrayList f26690;

    /* JADX INFO: renamed from: ᩷ */
    public ArrayList f26691;

    public C9684() {
        this.f37979 = true;
        this.f26681 = new ArrayList();
        this.f26683 = new ArrayList();
        this.f26690 = new ArrayList();
        this.f26689 = new ArrayList();
        this.f26691 = new ArrayList();
        this.f26682 = new ArrayList();
        this.f26686 = new ArrayList();
        this.f26685 = new ArrayList();
        this.f26688 = new ArrayList();
        this.f26684 = new ArrayList();
        this.f26687 = new ArrayList();
    }

    @Override // p067l.AbstractC23964
    /* JADX INFO: renamed from: ۜ */
    public final void mo22573() {
        ArrayList<AbstractC5462> arrayList = this.f26681;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f26690;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f26689;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f26683;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (AbstractC5462 abstractC5462 : arrayList) {
            View view = abstractC5462.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f26684.add(abstractC5462);
            viewPropertyAnimatorAnimate.setDuration(m53113()).alpha(0.0f).setListener(new C15048(view, viewPropertyAnimatorAnimate, this, abstractC5462)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.f26682.add(arrayList5);
            arrayList2.clear();
            RunnableC21755 runnableC21755 = new RunnableC21755(this, arrayList5);
            if (!zIsEmpty) {
                View view2 = ((C15718) arrayList5.get(0)).f45538.itemView;
                long jM53113 = m53113();
                int i = C1717.f57146;
                view2.postOnAnimationDelayed(runnableC21755, jM53113);
            } else {
                runnableC21755.run();
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.f26686.add(arrayList6);
            arrayList3.clear();
            RunnableC7002 runnableC7002 = new RunnableC7002(this, arrayList6);
            if (!zIsEmpty) {
                View view3 = ((C24436) arrayList6.get(0)).f77370.itemView;
                long jM53114 = m53113();
                int i2 = C1717.f57146;
                view3.postOnAnimationDelayed(runnableC7002, jM53114);
            } else {
                runnableC7002.run();
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.f26691.add(arrayList7);
        arrayList4.clear();
        RunnableC5661 runnableC5661 = new RunnableC5661(this, arrayList7);
        if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
            long jMax = Math.max(!zIsEmpty2 ? m53116() : 0L, zIsEmpty3 ? 0L : m53117()) + (!zIsEmpty ? m53113() : 0L);
            View view4 = ((AbstractC5462) arrayList7.get(0)).itemView;
            int i3 = C1717.f57146;
            view4.postOnAnimationDelayed(runnableC5661, jMax);
            return;
        }
        runnableC5661.run();
    }

    @Override // p067l.AbstractC13509
    /* JADX INFO: renamed from: ܿ */
    public final void mo22577(AbstractC5462 abstractC5462) {
        m22569(abstractC5462);
        this.f26681.add(abstractC5462);
    }

    @Override // p067l.AbstractC13509
    /* JADX INFO: renamed from: ᩳ */
    public final void mo22578(AbstractC5462 abstractC5462) {
        m22569(abstractC5462);
        abstractC5462.itemView.setAlpha(0.0f);
        this.f26683.add(abstractC5462);
    }

    @Override // p067l.AbstractC13509
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22570(AbstractC5462 abstractC5462, int i, int i2, int i3, int i4) {
        View view = abstractC5462.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC5462.itemView.getTranslationY());
        m22569(abstractC5462);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                view.setTranslationX(-i5);
            }
            if (i6 != 0) {
                view.setTranslationY(-i6);
            }
            C15718 c15718 = new C15718();
            c15718.f45538 = abstractC5462;
            c15718.f45536 = translationX;
            c15718.f45537 = translationY;
            c15718.f45540 = i3;
            c15718.f45539 = i4;
            this.f26690.add(c15718);
            return true;
        }
        m53109(abstractC5462);
        return false;
    }

    @Override // p067l.AbstractC13509
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22572(AbstractC5462 abstractC5462, AbstractC5462 abstractC5463, int i, int i2, int i3, int i4) {
        if (abstractC5462 == abstractC5463) {
            return mo22570(abstractC5462, i, i2, i3, i4);
        }
        float translationX = abstractC5462.itemView.getTranslationX();
        float translationY = abstractC5462.itemView.getTranslationY();
        float alpha = abstractC5462.itemView.getAlpha();
        m22569(abstractC5462);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC5462.itemView.setTranslationX(translationX);
        abstractC5462.itemView.setTranslationY(translationY);
        abstractC5462.itemView.setAlpha(alpha);
        if (abstractC5463 != null) {
            m22569(abstractC5463);
            abstractC5463.itemView.setTranslationX(-i5);
            abstractC5463.itemView.setTranslationY(-i6);
            abstractC5463.itemView.setAlpha(0.0f);
        }
        C24436 c24436 = new C24436();
        c24436.f77370 = abstractC5462;
        c24436.f77368 = abstractC5463;
        c24436.f77365 = i;
        c24436.f77366 = i2;
        c24436.f77369 = i3;
        c24436.f77367 = i4;
        this.f26689.add(c24436);
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m22567(ArrayList arrayList, AbstractC5462 abstractC5462) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C24436 c24436 = (C24436) arrayList.get(size);
            if (m22568(c24436, abstractC5462) && c24436.f77370 == null && c24436.f77368 == null) {
                arrayList.remove(c24436);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m22568(C24436 c24436, AbstractC5462 abstractC5462) {
        if (c24436.f77368 == abstractC5462) {
            c24436.f77368 = null;
        } else {
            if (c24436.f77370 != abstractC5462) {
                return false;
            }
            c24436.f77370 = null;
        }
        abstractC5462.itemView.setAlpha(1.0f);
        abstractC5462.itemView.setTranslationX(0.0f);
        abstractC5462.itemView.setTranslationY(0.0f);
        m53109(abstractC5462);
        return true;
    }

    @Override // p067l.AbstractC23964
    /* JADX INFO: renamed from: ۧ */
    public final void mo22576(AbstractC5462 abstractC5462) {
        View view = abstractC5462.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f26690;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C15718) arrayList.get(size)).f45538 == abstractC5462) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m53109(abstractC5462);
                arrayList.remove(size);
            }
        }
        m22567(this.f26689, abstractC5462);
        if (this.f26681.remove(abstractC5462)) {
            view.setAlpha(1.0f);
            m53109(abstractC5462);
        }
        if (this.f26683.remove(abstractC5462)) {
            view.setAlpha(1.0f);
            m53109(abstractC5462);
        }
        ArrayList arrayList2 = this.f26686;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m22567(arrayList3, abstractC5462);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f26682;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                }
                if (((C15718) arrayList5.get(size4)).f45538 == abstractC5462) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m53109(abstractC5462);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f26691;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(abstractC5462)) {
                    view.setAlpha(1.0f);
                    m53109(abstractC5462);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f26684.remove(abstractC5462);
                this.f26685.remove(abstractC5462);
                this.f26687.remove(abstractC5462);
                this.f26688.remove(abstractC5462);
                m22574();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    private void m22569(AbstractC5462 abstractC5462) {
        if (f26680 == null) {
            f26680 = new ValueAnimator().getInterpolator();
        }
        abstractC5462.itemView.animate().setInterpolator(f26680);
        mo22576(abstractC5462);
    }

    @Override // p067l.AbstractC23964
    /* JADX INFO: renamed from: ᩻ */
    public final boolean mo22579() {
        return (this.f26683.isEmpty() && this.f26689.isEmpty() && this.f26690.isEmpty() && this.f26681.isEmpty() && this.f26688.isEmpty() && this.f26684.isEmpty() && this.f26685.isEmpty() && this.f26687.isEmpty() && this.f26682.isEmpty() && this.f26691.isEmpty() && this.f26686.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۢ */
    public final void m22574() {
        if (mo22579()) {
            return;
        }
        m53107();
    }

    @Override // p067l.AbstractC23964
    /* JADX INFO: renamed from: ۧ */
    public final void mo22575() {
        ArrayList arrayList = this.f26690;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C15718 c15718 = (C15718) arrayList.get(size);
            View view = c15718.f45538.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m53109(c15718.f45538);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f26681;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m53109((AbstractC5462) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f26683;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC5462 abstractC5462 = (AbstractC5462) arrayList3.get(size3);
            abstractC5462.itemView.setAlpha(1.0f);
            m53109(abstractC5462);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f26689;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C24436 c24436 = (C24436) arrayList4.get(size4);
            AbstractC5462 abstractC5463 = c24436.f77370;
            if (abstractC5463 != null) {
                m22568(c24436, abstractC5463);
            }
            AbstractC5462 abstractC5464 = c24436.f77368;
            if (abstractC5464 != null) {
                m22568(c24436, abstractC5464);
            }
        }
        arrayList4.clear();
        if (!mo22579()) {
            return;
        }
        ArrayList arrayList5 = this.f26682;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
            int size6 = arrayList6.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    C15718 c15719 = (C15718) arrayList6.get(size6);
                    View view2 = c15719.f45538.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m53109(c15719.f45538);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.f26691;
        int size7 = arrayList7.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
            int size8 = arrayList8.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    AbstractC5462 abstractC5465 = (AbstractC5462) arrayList8.get(size8);
                    abstractC5465.itemView.setAlpha(1.0f);
                    m53109(abstractC5465);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.f26686;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        C24436 c24437 = (C24436) arrayList10.get(size10);
                        AbstractC5462 abstractC5466 = c24437.f77370;
                        if (abstractC5466 != null) {
                            m22568(c24437, abstractC5466);
                        }
                        AbstractC5462 abstractC5467 = c24437.f77368;
                        if (abstractC5467 != null) {
                            m22568(c24437, abstractC5467);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            } else {
                m22566(this.f26684);
                m22566(this.f26688);
                m22566(this.f26685);
                m22566(this.f26687);
                m53107();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m22566(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC5462) arrayList.get(size)).itemView.animate().cancel();
            }
        }
    }

    @Override // p067l.AbstractC23964
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo22571(AbstractC5462 abstractC5462, List list) {
        return !list.isEmpty() || super.mo22571(abstractC5462, list);
    }
}
