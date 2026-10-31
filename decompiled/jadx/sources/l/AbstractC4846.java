package l;

import android.util.Pair;
import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ۙ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4846 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final AbstractC4846 f15313 = new C21780();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo14095();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract int mo14098(Object obj);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract Object mo14102(int i);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C20369 mo14103(int i, C20369 c20369, long j);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public abstract C22485 mo14104(int i, C22485 c22485, boolean z);

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public abstract int mo14107();

    static {
        C3603.m11056(0);
        C3603.m11056(1);
        C3603.m11056(2);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m14110() {
        return mo14107() == 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo14096(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo14109(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo14109(z) ? mo14099(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo14108(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo14099(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo14099(z) ? mo14109(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int mo14109(boolean z) {
        if (m14110()) {
            return -1;
        }
        return mo14107() - 1;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int mo14099(boolean z) {
        return m14110() ? -1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m14106(int i, C20369 c20369) {
        mo14103(i, c20369, 0L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Pair m14100(C20369 c20369, C22485 c22485, int i, long j) {
        Pair pairM14101 = m14101(c20369, c22485, i, j, 0L);
        pairM14101.getClass();
        return pairM14101;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Pair m14101(C20369 c20369, C22485 c22485, int i, long j, long j2) {
        C22632.m50627(i, mo14107());
        mo14103(i, c20369, j2);
        if (j == -9223372036854775807L) {
            j = c20369.f65749;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c20369.f65760;
        mo14104(i2, c22485, false);
        while (i2 < c20369.f65752 && c22485.f72804 != j) {
            int i3 = i2 + 1;
            if (mo14104(i3, c22485, false).f72804 > j) {
                break;
            }
            i2 = i3;
        }
        mo14104(i2, c22485, true);
        long jMin = j - c22485.f72804;
        long j3 = c22485.f72801;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c22485.f72802;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C22485 mo14105(Object obj, C22485 c22485) {
        return mo14104(mo14098(obj), c22485, true);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m14097(int i, C22485 c22485, C20369 c20369, int i2, boolean z) {
        int i3 = mo14104(i, c22485, false).f72806;
        if (mo14103(i3, c20369, 0L).f65752 != i) {
            return i + 1;
        }
        int iMo14096 = mo14096(i3, i2, z);
        if (iMo14096 == -1) {
            return -1;
        }
        return mo14103(iMo14096, c20369, 0L).f65760;
    }

    public boolean equals(Object obj) {
        int iMo14109;
        if (this != obj) {
            if (obj instanceof AbstractC4846) {
                AbstractC4846 abstractC4846 = (AbstractC4846) obj;
                if (abstractC4846.mo14107() == mo14107() && abstractC4846.mo14095() == mo14095()) {
                    C20369 c20369 = new C20369();
                    C22485 c22485 = new C22485();
                    C20369 c203610 = new C20369();
                    C22485 c22486 = new C22485();
                    for (int i = 0; i < mo14107(); i++) {
                        if (mo14103(i, c20369, 0L).equals(abstractC4846.mo14103(i, c203610, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < mo14095(); i2++) {
                        if (mo14104(i2, c22485, true).equals(abstractC4846.mo14104(i2, c22486, true))) {
                        }
                    }
                    int iMo14099 = mo14099(true);
                    if (iMo14099 == abstractC4846.mo14099(true) && (iMo14109 = mo14109(true)) == abstractC4846.mo14109(true)) {
                        while (iMo14099 != iMo14109) {
                            int iMo14096 = mo14096(iMo14099, 0, true);
                            if (iMo14096 == abstractC4846.mo14096(iMo14099, 0, true)) {
                                iMo14099 = iMo14096;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C20369 c20369 = new C20369();
        C22485 c22485 = new C22485();
        int iMo14107 = mo14107() + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION;
        for (int i = 0; i < mo14107(); i++) {
            iMo14107 = (iMo14107 * 31) + mo14103(i, c20369, 0L).hashCode();
        }
        int iMo14095 = mo14095() + (iMo14107 * 31);
        for (int i2 = 0; i2 < mo14095(); i2++) {
            iMo14095 = (iMo14095 * 31) + mo14104(i2, c22485, true).hashCode();
        }
        int iMo14099 = mo14099(true);
        while (iMo14099 != -1) {
            iMo14095 = (iMo14095 * 31) + iMo14099;
            iMo14099 = mo14096(iMo14099, 0, true);
        }
        return iMo14095;
    }
}
