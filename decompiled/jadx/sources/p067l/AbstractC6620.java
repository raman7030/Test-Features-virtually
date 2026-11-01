package p067l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 23U2 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractC6620 extends AbstractC13787 {

    /* JADX INFO: renamed from: ܳ */
    public boolean f17068;

    /* JADX INFO: renamed from: ᩻ */
    public final AbstractC7291 f17072;

    /* JADX INFO: renamed from: ᩳ */
    public AbstractC18413 f17071 = null;

    /* JADX INFO: renamed from: ܿ */
    public ComponentCallbacksC11117 f17070 = null;

    /* JADX INFO: renamed from: ܽ */
    public final int f17069 = 1;

    /* JADX INFO: renamed from: ۧ */
    public abstract ComponentCallbacksC11117 mo15099(int i);

    public AbstractC6620(AbstractC7291 abstractC7291) {
        this.f17072 = abstractC7291;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final void mo15098(C2798 c2798) {
        if (c2798.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final Object mo13849(C2798 c2798, int i) {
        AbstractC18413 abstractC18413 = this.f17071;
        AbstractC7291 abstractC7291 = this.f17072;
        if (abstractC18413 == null) {
            abstractC7291.getClass();
            this.f17071 = new C19575(abstractC7291);
        }
        long j = i;
        ComponentCallbacksC11117 componentCallbacksC11117M16809 = abstractC7291.m16809("android:switcher:" + c2798.getId() + ":" + j);
        if (componentCallbacksC11117M16809 != null) {
            this.f17071.m41922(componentCallbacksC11117M16809);
        } else {
            componentCallbacksC11117M16809 = mo15099(i);
            this.f17071.mo41921(c2798.getId(), componentCallbacksC11117M16809, "android:switcher:" + c2798.getId() + ":" + j, 1);
        }
        if (componentCallbacksC11117M16809 != this.f17070) {
            componentCallbacksC11117M16809.setMenuVisibility(false);
            if (this.f17069 == 1) {
                this.f17071.mo41916(componentCallbacksC11117M16809, EnumC15415.STARTED);
                return componentCallbacksC11117M16809;
            }
            componentCallbacksC11117M16809.setUserVisibleHint(false);
        }
        return componentCallbacksC11117M16809;
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final void mo13850(C2798 c2798, int i, Object obj) {
        ComponentCallbacksC11117 componentCallbacksC11117 = (ComponentCallbacksC11117) obj;
        if (this.f17071 == null) {
            AbstractC7291 abstractC7291 = this.f17072;
            abstractC7291.getClass();
            this.f17071 = new C19575(abstractC7291);
        }
        this.f17071.mo41927(componentCallbacksC11117);
        if (componentCallbacksC11117.equals(this.f17070)) {
            this.f17070 = null;
        }
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final void mo15097(Object obj) {
        ComponentCallbacksC11117 componentCallbacksC11117 = (ComponentCallbacksC11117) obj;
        ComponentCallbacksC11117 componentCallbacksC11118 = this.f17070;
        if (componentCallbacksC11117 != componentCallbacksC11118) {
            AbstractC7291 abstractC7291 = this.f17072;
            int i = this.f17069;
            if (componentCallbacksC11118 != null) {
                componentCallbacksC11118.setMenuVisibility(false);
                if (i == 1) {
                    if (this.f17071 == null) {
                        abstractC7291.getClass();
                        this.f17071 = new C19575(abstractC7291);
                    }
                    this.f17071.mo41916(this.f17070, EnumC15415.STARTED);
                } else {
                    this.f17070.setUserVisibleHint(false);
                }
            }
            componentCallbacksC11117.setMenuVisibility(true);
            if (i == 1) {
                if (this.f17071 == null) {
                    abstractC7291.getClass();
                    this.f17071 = new C19575(abstractC7291);
                }
                this.f17071.mo41916(componentCallbacksC11117, EnumC15415.RESUMED);
            } else {
                componentCallbacksC11117.setUserVisibleHint(true);
            }
            this.f17070 = componentCallbacksC11117;
        }
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final void mo15096() {
        AbstractC18413 abstractC18413 = this.f17071;
        if (abstractC18413 != null) {
            if (!this.f17068) {
                try {
                    this.f17068 = true;
                    C19575 c19575 = (C19575) abstractC18413;
                    if (c19575.f54981) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c19575.f54987 = false;
                    c19575.f59572.m16786(c19575, true);
                    this.f17068 = false;
                } catch (Throwable th) {
                    this.f17068 = false;
                    throw th;
                }
            }
            this.f17071 = null;
        }
    }

    @Override // p067l.AbstractC13787
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo13851(View view, Object obj) {
        return ((ComponentCallbacksC11117) obj).getView() == view;
    }
}
