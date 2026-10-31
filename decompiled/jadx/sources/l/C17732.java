package l;

import android.media.Rating;

/* JADX INFO: renamed from: l.ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 757I */
/* JADX INFO: loaded from: classes4.dex */
public final class C17732 {
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static int m41536(Rating rating) {
        return rating.getRatingStyle();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static boolean m41540(Rating rating) {
        return rating.isRated();
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static boolean m41541(Rating rating) {
        return rating.hasHeart();
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m41538(Rating rating) {
        return rating.isThumbUp();
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static float m41539(Rating rating) {
        return rating.getStarRating();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m41531(Rating rating) {
        return rating.getPercentRating();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rating m41535(boolean z) {
        return Rating.newHeartRating(z);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static Rating m41537(boolean z) {
        return Rating.newThumbRating(z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rating m41534(int i, float f) {
        return Rating.newStarRating(i, f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rating m41532(float f) {
        return Rating.newPercentageRating(f);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static Rating m41533(int i) {
        return Rating.newUnratedRating(i);
    }
}
