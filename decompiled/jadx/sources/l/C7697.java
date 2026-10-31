package l;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.۟᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5OI */
/* JADX INFO: loaded from: classes4.dex */
public final class C7697 extends AbstractC11722 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static TimeInterpolator f23767;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ArrayList f23768;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public ArrayList f23769;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public ArrayList f23770;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public ArrayList f23771;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f23772;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public ArrayList f23773;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f23774;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public ArrayList f23775;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public ArrayList f23776;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public ArrayList f23777;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public ArrayList f23778;

    public C7697() {
        this.f34979 = true;
        this.f23768 = new ArrayList();
        this.f23770 = new ArrayList();
        this.f23777 = new ArrayList();
        this.f23776 = new ArrayList();
        this.f23778 = new ArrayList();
        this.f23769 = new ArrayList();
        this.f23773 = new ArrayList();
        this.f23772 = new ArrayList();
        this.f23775 = new ArrayList();
        this.f23771 = new ArrayList();
        this.f23774 = new ArrayList();
    }

    @Override // l.AbstractC22723
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void mo20593() {
        ArrayList<AbstractC3255> arrayList = this.f23768;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.f23777;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.f23776;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.f23770;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        for (AbstractC3255 abstractC3255 : arrayList) {
            View view = abstractC3255.itemView;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.f23771.add(abstractC3255);
            viewPropertyAnimatorAnimate.setDuration(m50787()).alpha(0.0f).setListener(new C13341(view, viewPropertyAnimatorAnimate, this, abstractC3255)).start();
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.f23769.add(arrayList5);
            arrayList2.clear();
            RunnableC20398 runnableC20398 = new RunnableC20398(this, arrayList5);
            if (!zIsEmpty) {
                View view2 = ((C14046) arrayList5.get(0)).f42455.itemView;
                long jM50787 = m50787();
                int i = C17648.f53953;
                view2.postOnAnimationDelayed(runnableC20398, jM50787);
            } else {
                runnableC20398.run();
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.f23773.add(arrayList6);
            arrayList3.clear();
            RunnableC4875 runnableC4875 = new RunnableC4875(this, arrayList6);
            if (!zIsEmpty) {
                View view3 = ((C23219) arrayList6.get(0)).f74627.itemView;
                long jM50788 = m50787();
                int i2 = C17648.f53953;
                view3.postOnAnimationDelayed(runnableC4875, jM50788);
            } else {
                runnableC4875.run();
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.f23778.add(arrayList7);
        arrayList4.clear();
        RunnableC3464 runnableC3464 = new RunnableC3464(this, arrayList7);
        if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty3) {
            long jMax = Math.max(!zIsEmpty2 ? m50790() : 0L, zIsEmpty3 ? 0L : m50791()) + (!zIsEmpty ? m50787() : 0L);
            View view4 = ((AbstractC3255) arrayList7.get(0)).itemView;
            int i3 = C17648.f53953;
            view4.postOnAnimationDelayed(runnableC3464, jMax);
            return;
        }
        runnableC3464.run();
    }

    @Override // l.AbstractC11722
    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void mo20597(AbstractC3255 abstractC3255) {
        m20589(abstractC3255);
        this.f23768.add(abstractC3255);
    }

    @Override // l.AbstractC11722
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo20598(AbstractC3255 abstractC3255) {
        m20589(abstractC3255);
        abstractC3255.itemView.setAlpha(0.0f);
        this.f23770.add(abstractC3255);
    }

    @Override // l.AbstractC11722
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20590(AbstractC3255 abstractC3255, int i, int i2, int i3, int i4) {
        View view = abstractC3255.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC3255.itemView.getTranslationY());
        m20589(abstractC3255);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 != 0 || i6 != 0) {
            if (i5 != 0) {
                view.setTranslationX(-i5);
            }
            if (i6 != 0) {
                view.setTranslationY(-i6);
            }
            C14046 c14046 = new C14046();
            c14046.f42455 = abstractC3255;
            c14046.f42453 = translationX;
            c14046.f42454 = translationY;
            c14046.f42457 = i3;
            c14046.f42456 = i4;
            this.f23777.add(c14046);
            return true;
        }
        m50783(abstractC3255);
        return false;
    }

    @Override // l.AbstractC11722
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20592(AbstractC3255 abstractC3255, AbstractC3255 abstractC3256, int i, int i2, int i3, int i4) {
        if (abstractC3255 == abstractC3256) {
            return mo20590(abstractC3255, i, i2, i3, i4);
        }
        float translationX = abstractC3255.itemView.getTranslationX();
        float translationY = abstractC3255.itemView.getTranslationY();
        float alpha = abstractC3255.itemView.getAlpha();
        m20589(abstractC3255);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC3255.itemView.setTranslationX(translationX);
        abstractC3255.itemView.setTranslationY(translationY);
        abstractC3255.itemView.setAlpha(alpha);
        if (abstractC3256 != null) {
            m20589(abstractC3256);
            abstractC3256.itemView.setTranslationX(-i5);
            abstractC3256.itemView.setTranslationY(-i6);
            abstractC3256.itemView.setAlpha(0.0f);
        }
        C23219 c23219 = new C23219();
        c23219.f74627 = abstractC3255;
        c23219.f74625 = abstractC3256;
        c23219.f74622 = i;
        c23219.f74623 = i2;
        c23219.f74626 = i3;
        c23219.f74624 = i4;
        this.f23776.add(c23219);
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20587(ArrayList arrayList, AbstractC3255 abstractC3255) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            C23219 c23219 = (C23219) arrayList.get(size);
            if (m20588(c23219, abstractC3255) && c23219.f74627 == null && c23219.f74625 == null) {
                arrayList.remove(c23219);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m20588(C23219 c23219, AbstractC3255 abstractC3255) {
        if (c23219.f74625 == abstractC3255) {
            c23219.f74625 = null;
        } else {
            if (c23219.f74627 != abstractC3255) {
                return false;
            }
            c23219.f74627 = null;
        }
        abstractC3255.itemView.setAlpha(1.0f);
        abstractC3255.itemView.setTranslationX(0.0f);
        abstractC3255.itemView.setTranslationY(0.0f);
        m50783(abstractC3255);
        return true;
    }

    @Override // l.AbstractC22723
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo20596(AbstractC3255 abstractC3255) {
        View view = abstractC3255.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.f23777;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C14046) arrayList.get(size)).f42455 == abstractC3255) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m50783(abstractC3255);
                arrayList.remove(size);
            }
        }
        m20587(this.f23776, abstractC3255);
        if (this.f23768.remove(abstractC3255)) {
            view.setAlpha(1.0f);
            m50783(abstractC3255);
        }
        if (this.f23770.remove(abstractC3255)) {
            view.setAlpha(1.0f);
            m50783(abstractC3255);
        }
        ArrayList arrayList2 = this.f23773;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            m20587(arrayList3, abstractC3255);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f23769;
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
                if (((C14046) arrayList5.get(size4)).f42455 == abstractC3255) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m50783(abstractC3255);
                    arrayList5.remove(size4);
                    if (!arrayList5.isEmpty()) {
                        break;
                    }
                    arrayList4.remove(size3);
                    break;
                }
            }
        }
        ArrayList arrayList6 = this.f23778;
        int size5 = arrayList6.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
                if (arrayList7.remove(abstractC3255)) {
                    view.setAlpha(1.0f);
                    m50783(abstractC3255);
                    if (arrayList7.isEmpty()) {
                        arrayList6.remove(size5);
                    }
                }
            } else {
                this.f23771.remove(abstractC3255);
                this.f23772.remove(abstractC3255);
                this.f23774.remove(abstractC3255);
                this.f23775.remove(abstractC3255);
                m20594();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m20589(AbstractC3255 abstractC3255) {
        if (f23767 == null) {
            f23767 = new ValueAnimator().getInterpolator();
        }
        abstractC3255.itemView.animate().setInterpolator(f23767);
        mo20596(abstractC3255);
    }

    @Override // l.AbstractC22723
    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean mo20599() {
        return (this.f23770.isEmpty() && this.f23776.isEmpty() && this.f23777.isEmpty() && this.f23768.isEmpty() && this.f23775.isEmpty() && this.f23771.isEmpty() && this.f23772.isEmpty() && this.f23774.isEmpty() && this.f23769.isEmpty() && this.f23778.isEmpty() && this.f23773.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final void m20594() {
        if (mo20599()) {
            return;
        }
        m50781();
    }

    @Override // l.AbstractC22723
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo20595() {
        ArrayList arrayList = this.f23777;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C14046 c14046 = (C14046) arrayList.get(size);
            View view = c14046.f42455.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m50783(c14046.f42455);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.f23768;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            m50783((AbstractC3255) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.f23770;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC3255 abstractC3255 = (AbstractC3255) arrayList3.get(size3);
            abstractC3255.itemView.setAlpha(1.0f);
            m50783(abstractC3255);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f23776;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            C23219 c23219 = (C23219) arrayList4.get(size4);
            AbstractC3255 abstractC3256 = c23219.f74627;
            if (abstractC3256 != null) {
                m20588(c23219, abstractC3256);
            }
            AbstractC3255 abstractC3257 = c23219.f74625;
            if (abstractC3257 != null) {
                m20588(c23219, abstractC3257);
            }
        }
        arrayList4.clear();
        if (!mo20599()) {
            return;
        }
        ArrayList arrayList5 = this.f23769;
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
                    C14046 c14047 = (C14046) arrayList6.get(size6);
                    View view2 = c14047.f42455.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m50783(c14047.f42455);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
        }
        ArrayList arrayList7 = this.f23778;
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
                    AbstractC3255 abstractC3258 = (AbstractC3255) arrayList8.get(size8);
                    abstractC3258.itemView.setAlpha(1.0f);
                    m50783(abstractC3258);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
        }
        ArrayList arrayList9 = this.f23773;
        int size9 = arrayList9.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                int size10 = arrayList10.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        C23219 c232110 = (C23219) arrayList10.get(size10);
                        AbstractC3255 abstractC3259 = c232110.f74627;
                        if (abstractC3259 != null) {
                            m20588(c232110, abstractC3259);
                        }
                        AbstractC3255 abstractC32510 = c232110.f74625;
                        if (abstractC32510 != null) {
                            m20588(c232110, abstractC32510);
                        }
                        if (arrayList10.isEmpty()) {
                            arrayList9.remove(arrayList10);
                        }
                    }
                }
            } else {
                m20586(this.f23771);
                m20586(this.f23775);
                m20586(this.f23772);
                m20586(this.f23774);
                m50781();
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m20586(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((AbstractC3255) arrayList.get(size)).itemView.animate().cancel();
            }
        }
    }

    @Override // l.AbstractC22723
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean mo20591(AbstractC3255 abstractC3255, List list) {
        return !list.isEmpty() || super.mo20591(abstractC3255, list);
    }
}
