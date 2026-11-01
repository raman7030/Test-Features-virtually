package p067l;

import android.transition.Transition;

/* JADX INFO: renamed from: l.᩸ܳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes5.dex */
public final class C22928 extends C16891 {

    /* JADX INFO: renamed from: ܽ */
    public final boolean f72157;

    /* JADX INFO: renamed from: ܿ */
    public final Object f72158;

    /* JADX INFO: renamed from: ᩳ */
    public final Object f72159;

    public C22928(C7014 c7014, C2017 c2017, boolean z, boolean z2) {
        Object exitTransition;
        Object enterTransition;
        boolean allowEnterTransitionOverlap;
        super(c7014, c2017);
        if (c7014.m16143() == EnumC21767.VISIBLE) {
            if (z) {
                enterTransition = c7014.m16145().getReenterTransition();
            } else {
                enterTransition = c7014.m16145().getEnterTransition();
            }
            this.f72158 = enterTransition;
            if (z) {
                allowEnterTransitionOverlap = c7014.m16145().getAllowReturnTransitionOverlap();
            } else {
                allowEnterTransitionOverlap = c7014.m16145().getAllowEnterTransitionOverlap();
            }
            this.f72157 = allowEnterTransitionOverlap;
        } else {
            if (z) {
                exitTransition = c7014.m16145().getReturnTransition();
            } else {
                exitTransition = c7014.m16145().getExitTransition();
            }
            this.f72158 = exitTransition;
            this.f72157 = true;
        }
        if (!z2) {
            this.f72159 = null;
        } else if (z) {
            this.f72159 = c7014.m16145().getSharedElementReturnTransition();
        } else {
            this.f72159 = c7014.m16145().getSharedElementEnterTransition();
        }
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Object m51249() {
        return this.f72158;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m51248() {
        return this.f72157;
    }

    /* JADX INFO: renamed from: ۜ */
    public final boolean m51245() {
        return this.f72159 != null;
    }

    /* JADX INFO: renamed from: ܳ */
    public final Object m51246() {
        return this.f72159;
    }

    /* JADX INFO: renamed from: ܿ */
    public final AbstractC17742 m51247() {
        Object obj = this.f72158;
        AbstractC17742 abstractC17742M51244 = m51244(obj);
        Object obj2 = this.f72159;
        AbstractC17742 abstractC17742M51245 = m51244(obj2);
        if (abstractC17742M51244 == null || abstractC17742M51245 == null || abstractC17742M51244 == abstractC17742M51245) {
            return abstractC17742M51244 != null ? abstractC17742M51244 : abstractC17742M51245;
        }
        throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m38449().m16145() + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition " + obj2);
    }

    /* JADX INFO: renamed from: ֫ */
    private AbstractC17742 m51244(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC17742 abstractC17742 = C19755.f60104;
        if (abstractC17742 != null && (obj instanceof Transition)) {
            return abstractC17742;
        }
        AbstractC17742 abstractC17743 = C19755.f60105;
        if (abstractC17743 != null && abstractC17743.mo34(obj)) {
            return abstractC17743;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + m38449().m16145() + " is not a valid framework Transition or AndroidX Transition");
    }
}
