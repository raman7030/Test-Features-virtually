package p067l;

import android.util.Pair;
import com.google.android.material.textfield.IndicatorViewController;

/* JADX INFO: renamed from: l.ۙ᩵֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B8N9 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6974 {

    /* JADX INFO: renamed from: ֫ */
    public static final AbstractC6974 f18145 = new C23068();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo15975();

    /* JADX INFO: renamed from: ֫ */
    public abstract int mo15978(Object obj);

    /* JADX INFO: renamed from: ֫ */
    public abstract Object mo15982(int i);

    /* JADX INFO: renamed from: ֫ */
    public abstract C21727 mo15983(int i, C21727 c21727, long j);

    /* JADX INFO: renamed from: ֫ */
    public abstract C23738 mo15984(int i, C23738 c23738, boolean z);

    /* JADX INFO: renamed from: ۧ */
    public abstract int mo15987();

    static {
        C5792.m13032(0);
        C5792.m13032(1);
        C5792.m13032(2);
    }

    /* JADX INFO: renamed from: ܽ */
    public final boolean m15990() {
        return mo15987() == 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo15976(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo15989(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo15989(z) ? mo15979(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo15988(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == mo15979(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == mo15979(z) ? mo15989(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: ۧ */
    public int mo15989(boolean z) {
        if (m15990()) {
            return -1;
        }
        return mo15987() - 1;
    }

    /* JADX INFO: renamed from: ֫ */
    public int mo15979(boolean z) {
        return m15990() ? -1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m15986(int i, C21727 c21727) {
        mo15983(i, c21727, 0L);
    }

    /* JADX INFO: renamed from: ֫ */
    public final Pair m15980(C21727 c21727, C23738 c23738, int i, long j) {
        Pair pairM15981 = m15981(c21727, c23738, i, j, 0L);
        pairM15981.getClass();
        return pairM15981;
    }

    /* JADX INFO: renamed from: ֫ */
    public final Pair m15981(C21727 c21727, C23738 c23738, int i, long j, long j2) {
        C23877.m52953(i, mo15987());
        mo15983(i, c21727, j2);
        if (j == -9223372036854775807L) {
            j = c21727.f68425;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c21727.f68436;
        mo15984(i2, c23738, false);
        while (i2 < c21727.f68428 && c23738.f75530 != j) {
            int i3 = i2 + 1;
            if (mo15984(i3, c23738, false).f75530 > j) {
                break;
            }
            i2 = i3;
        }
        mo15984(i2, c23738, true);
        long jMin = j - c23738.f75530;
        long j3 = c23738.f75527;
        if (j3 != -9223372036854775807L) {
            jMin = Math.min(jMin, j3 - 1);
        }
        long jMax = Math.max(0L, jMin);
        Object obj = c23738.f75528;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    /* JADX INFO: renamed from: ֫ */
    public C23738 mo15985(Object obj, C23738 c23738) {
        return mo15984(mo15978(obj), c23738, true);
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m15977(int i, C23738 c23738, C21727 c21727, int i2, boolean z) {
        int i3 = mo15984(i, c23738, false).f75532;
        if (mo15983(i3, c21727, 0L).f68428 != i) {
            return i + 1;
        }
        int iMo15976 = mo15976(i3, i2, z);
        if (iMo15976 == -1) {
            return -1;
        }
        return mo15983(iMo15976, c21727, 0L).f68436;
    }

    public boolean equals(Object obj) {
        int iMo15989;
        if (this != obj) {
            if (obj instanceof AbstractC6974) {
                AbstractC6974 abstractC6974 = (AbstractC6974) obj;
                if (abstractC6974.mo15987() == mo15987() && abstractC6974.mo15975() == mo15975()) {
                    C21727 c21727 = new C21727();
                    C23738 c23738 = new C23738();
                    C21727 c21728 = new C21727();
                    C23738 c23739 = new C23738();
                    for (int i = 0; i < mo15987(); i++) {
                        if (mo15983(i, c21727, 0L).equals(abstractC6974.mo15983(i, c21728, 0L))) {
                        }
                    }
                    for (int i2 = 0; i2 < mo15975(); i2++) {
                        if (mo15984(i2, c23738, true).equals(abstractC6974.mo15984(i2, c23739, true))) {
                        }
                    }
                    int iMo15979 = mo15979(true);
                    if (iMo15979 == abstractC6974.mo15979(true) && (iMo15989 = mo15989(true)) == abstractC6974.mo15989(true)) {
                        while (iMo15979 != iMo15989) {
                            int iMo15976 = mo15976(iMo15979, 0, true);
                            if (iMo15976 == abstractC6974.mo15976(iMo15979, 0, true)) {
                                iMo15979 = iMo15976;
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
        C21727 c21727 = new C21727();
        C23738 c23738 = new C23738();
        int iMo15987 = mo15987() + IndicatorViewController.DEFAULT_CAPTION_TRANSLATION_Y_ANIMATION_DURATION;
        for (int i = 0; i < mo15987(); i++) {
            iMo15987 = (iMo15987 * 31) + mo15983(i, c21727, 0L).hashCode();
        }
        int iMo15975 = mo15975() + (iMo15987 * 31);
        for (int i2 = 0; i2 < mo15975(); i2++) {
            iMo15975 = (iMo15975 * 31) + mo15984(i2, c23738, true).hashCode();
        }
        int iMo15979 = mo15979(true);
        while (iMo15979 != -1) {
            iMo15975 = (iMo15975 * 31) + iMo15979;
            iMo15979 = mo15976(iMo15979, 0, true);
        }
        return iMo15975;
    }
}
