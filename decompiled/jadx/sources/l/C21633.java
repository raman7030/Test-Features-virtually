package l;

import android.transition.Transition;

/* JADX INFO: renamed from: l.᩸ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21633 extends C15281 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean f69454;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Object f69455;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Object f69456;

    public C21633(C4888 c4888, C23686 c23686, boolean z, boolean z2) {
        Object exitTransition;
        Object enterTransition;
        boolean allowEnterTransitionOverlap;
        super(c4888, c23686);
        if (c4888.m14246() == EnumC20411.VISIBLE) {
            if (z) {
                enterTransition = c4888.m14248().getReenterTransition();
            } else {
                enterTransition = c4888.m14248().getEnterTransition();
            }
            this.f69455 = enterTransition;
            if (z) {
                allowEnterTransitionOverlap = c4888.m14248().getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = c4888.m14248().getAllowEnterTransitionOverlap();
            }
            this.f69454 = allowEnterTransitionOverlap;
        } else {
            if (z) {
                exitTransition = c4888.m14248().getReturnTransition();
            } else {
                exitTransition = c4888.m14248().getExitTransition();
            }
            this.f69455 = exitTransition;
            this.f69454 = true;
        }
        if (!z2) {
            this.f69456 = null;
        } else if (z) {
            this.f69456 = c4888.m14248().getSharedElementReturnTransition();
        } else {
            this.f69456 = c4888.m14248().getSharedElementEnterTransition();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Object m48901() {
        return this.f69455;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m48900() {
        return this.f69454;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m48897() {
        return this.f69456 != null;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Object m48898() {
        return this.f69456;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final AbstractC16176 m48899() {
        Object obj = this.f69455;
        AbstractC16176 abstractC16176M48896 = m48896(obj);
        Object obj2 = this.f69456;
        AbstractC16176 abstractC16176M48897 = m48896(obj2);
        if (abstractC16176M48896 == null || abstractC16176M48897 == null || abstractC16176M48896 == abstractC16176M48897) {
            return abstractC16176M48896 != null ? abstractC16176M48896 : abstractC16176M48897;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m36288().m14248() + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private AbstractC16176 m48896(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC16176 abstractC16176 = C18294.f56886;
        if (abstractC16176 != null && (obj instanceof Transition)) {
            return abstractC16176;
        }
        AbstractC16176 abstractC16177 = C18294.f56887;
        if (abstractC16177 != null && abstractC16177.mo34(obj)) {
            return abstractC16177;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + m36288().m14248() + " is not a valid framework Transition or AndroidX Transition");
    }
}
