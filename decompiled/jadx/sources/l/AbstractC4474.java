package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۙۜ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 23U2 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractC4474 extends AbstractC12014 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f14241;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC5180 f14245;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public AbstractC16882 f14244 = null;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ComponentCallbacksC9205 f14243 = null;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f14242 = 1;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract ComponentCallbacksC9205 mo13217(int i);

    public AbstractC4474(AbstractC5180 abstractC5180) {
        this.f14245 = abstractC5180;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13216(C0452 c0452) {
        if (c0452.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final Object mo11913(C0452 c0452, int i) {
        AbstractC16882 abstractC16882 = this.f14244;
        AbstractC5180 abstractC5180 = this.f14245;
        if (abstractC16882 == null) {
            abstractC5180.getClass();
            this.f14244 = new C18105(abstractC5180);
        }
        long j = i;
        ComponentCallbacksC9205 componentCallbacksC9205M14899 = abstractC5180.m14899("android:switcher:" + c0452.getId() + ":" + j);
        if (componentCallbacksC9205M14899 != null) {
            this.f14244.m39681(componentCallbacksC9205M14899);
        } else {
            componentCallbacksC9205M14899 = mo13217(i);
            this.f14244.mo39680(c0452.getId(), componentCallbacksC9205M14899, "android:switcher:" + c0452.getId() + ":" + j, 1);
        }
        if (componentCallbacksC9205M14899 != this.f14243) {
            componentCallbacksC9205M14899.setMenuVisibility(false);
            if (this.f14242 == 1) {
                this.f14244.mo39675(componentCallbacksC9205M14899, EnumC13728.STARTED);
                return componentCallbacksC9205M14899;
            }
            componentCallbacksC9205M14899.setUserVisibleHint(false);
        }
        return componentCallbacksC9205M14899;
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final void mo11914(C0452 c0452, int i, Object obj) {
        ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) obj;
        if (this.f14244 == null) {
            AbstractC5180 abstractC5180 = this.f14245;
            abstractC5180.getClass();
            this.f14244 = new C18105(abstractC5180);
        }
        this.f14244.mo39686(componentCallbacksC9205);
        if (componentCallbacksC9205.equals(this.f14243)) {
            this.f14243 = null;
        }
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13215(Object obj) {
        ComponentCallbacksC9205 componentCallbacksC9205 = (ComponentCallbacksC9205) obj;
        ComponentCallbacksC9205 componentCallbacksC9206 = this.f14243;
        if (componentCallbacksC9205 != componentCallbacksC9206) {
            AbstractC5180 abstractC5180 = this.f14245;
            int i = this.f14242;
            if (componentCallbacksC9206 != null) {
                componentCallbacksC9206.setMenuVisibility(false);
                if (i == 1) {
                    if (this.f14244 == null) {
                        abstractC5180.getClass();
                        this.f14244 = new C18105(abstractC5180);
                    }
                    this.f14244.mo39675(this.f14243, EnumC13728.STARTED);
                } else {
                    this.f14243.setUserVisibleHint(false);
                }
            }
            componentCallbacksC9205.setMenuVisibility(true);
            if (i == 1) {
                if (this.f14244 == null) {
                    abstractC5180.getClass();
                    this.f14244 = new C18105(abstractC5180);
                }
                this.f14244.mo39675(componentCallbacksC9205, EnumC13728.RESUMED);
            } else {
                componentCallbacksC9205.setUserVisibleHint(true);
            }
            this.f14243 = componentCallbacksC9205;
        }
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo13214() {
        AbstractC16882 abstractC16882 = this.f14244;
        if (abstractC16882 != null) {
            if (!this.f14241) {
                try {
                    this.f14241 = true;
                    C18105 c18105 = (C18105) abstractC16882;
                    if (c18105.f51800) {
                        throw new IllegalStateException("This transaction is already being added to the back stack");
                    }
                    c18105.f51806 = false;
                    c18105.f56359.m14876(c18105, true);
                    this.f14241 = false;
                } catch (Throwable th) {
                    this.f14241 = false;
                    throw th;
                }
            }
            this.f14244 = null;
        }
    }

    @Override // l.AbstractC12014
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo11915(View view, Object obj) {
        return ((ComponentCallbacksC9205) obj).getView() == view;
    }
}
