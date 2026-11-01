package p067l;

import android.media.Rating;

/* JADX INFO: renamed from: l.ᩳ֫ */
/* JADX INFO: compiled from: 757I */
/* JADX INFO: loaded from: classes4.dex */
public final class C1722 {
    /* JADX INFO: renamed from: ۧ */
    public static int m43781(Rating rating) {
        return rating.getRatingStyle();
    }

    /* JADX INFO: renamed from: ܿ */
    public static boolean m43785(Rating rating) {
        return rating.isRated();
    }

    /* JADX INFO: renamed from: ᩳ */
    public static boolean m43786(Rating rating) {
        return rating.hasHeart();
    }

    /* JADX INFO: renamed from: ܳ */
    public static boolean m43783(Rating rating) {
        return rating.isThumbUp();
    }

    /* JADX INFO: renamed from: ܽ */
    public static float m43784(Rating rating) {
        return rating.getStarRating();
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m43776(Rating rating) {
        return rating.getPercentRating();
    }

    /* JADX INFO: renamed from: ֫ */
    public static Rating m43780(boolean z) {
        return Rating.newHeartRating(z);
    }

    /* JADX INFO: renamed from: ۧ */
    public static Rating m43782(boolean z) {
        return Rating.newThumbRating(z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Rating m43779(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Rating m43777(float f) {
        return Rating.newPercentageRating(f);
    }

    /* JADX INFO: renamed from: ֫ */
    public static Rating m43778(int i) {
        return Rating.newUnratedRating(i);
    }
}
