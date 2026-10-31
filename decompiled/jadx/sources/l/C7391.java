package l;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۟ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6ZC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7391 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13035 f22742;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f22743;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f22746;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f22747;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f22752 = 1.0f;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f22744 = -1;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f22745 = -1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17768 f22750 = new C17768();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C13740 f22753 = new InterfaceC23694() { // from class: l.ܰۢܿ
        @Override // l.InterfaceC23694
        /* JADX INFO: renamed from: ֫ */
        public final boolean mo27305(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, Runnable runnable) {
            return C7391.m19892(this.f41018, canvas, f, f2, f3, f4, runnable);
        }
    };

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C19886 f22748 = new C19886();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C19886 f22751 = new C19886();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C23619 f22749 = new C23619();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19901(C13035 c13035, int i, int i2, int i3) {
        this.f22742 = c13035;
        this.f22744 = i;
        this.f22745 = i2;
        this.f22747 = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19902() {
        return this.f22746;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19898(float f, int i) {
        this.f22743 = i;
        this.f22752 = f;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m19903(C9302 c9302, int i, int i2, int i3) {
        boolean z = false;
        if (c9302 == null || i2 < 0 || i2 >= i3 || i3 > c9302.m23880()) {
            return false;
        }
        synchronized (this.f22751) {
            C19886 c19886 = this.f22751;
            c19886.m45726(c9302);
            try {
                if (c19886.m45727(i2) && c19886.m45725() >= i3 && c19886.m45730().m49205() == i) {
                    z = true;
                }
                c19886.m45733();
            } catch (Throwable th) {
                c19886.m45733();
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m19906(int i, int i2, C9302 c9302) {
        C19886 c19886 = this.f22751;
        synchronized (c19886) {
            m19891(c19886, c9302);
            try {
                if (m19893(c19886, i, i)) {
                    int iM49205 = c19886.m45730().m49205();
                    c19886.m45733();
                    return iM49205;
                }
                c19886.m45733();
                return i2;
            } catch (Throwable th) {
                c19886.m45733();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19900(C9302 c9302, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, Paint paint, C22686 c22686) throws Throwable {
        C19886 c19886;
        this.f22746 = false;
        C19886 c19887 = this.f22748;
        m19891(c19887, c9302);
        try {
            if (!c19887.m45727(i)) {
                c19887.m45733();
                return;
            }
            int i5 = i;
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (true) {
                C21834 c21834M45730 = c19887.m45730();
                int iMin = Math.min(i2, c19887.m45725());
                boolean z = iMin < i2;
                int iM49205 = c21834M45730.m49205();
                float f4 = this.f22752;
                if (f4 < 1.0f) {
                    iM49205 = C7191.m19267(this.f22743, iM49205, f4);
                }
                paint.setColor(iM49205);
                c19886 = c19887;
                try {
                    float fM19889 = m19889(c22686, canvas, charSequence, i5, iMin, f2, f, i3, i4, f3, paint, c21834M45730.m49213(), z);
                    if (z) {
                        f2 += fM19889;
                        f3 += fM19889;
                        if (f2 > i4 || !c19886.m45731()) {
                            c19886.m45733();
                            return;
                        } else {
                            c19887 = c19886;
                            i5 = iMin;
                        }
                    } else {
                        c19886.m45733();
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c19886 = c19887;
        }
        c19886.m45733();
        throw th;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private float m19889(C22686 c22686, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) throws Throwable {
        C17768 c17768;
        int i6;
        Paint paint2;
        int iM49205;
        int iMin;
        boolean z2;
        int i7;
        int i8;
        int i9;
        float fM24472;
        C7391 c7391 = this;
        Paint paint3 = paint;
        C13035 c13035 = c7391.f22742;
        if (c13035 != null) {
            int i10 = c13035.f39035;
            int i11 = c13035.f39036;
            if (i11 < i2 && i10 > i && (c7391.f22744 > i || i2 > c7391.f22745)) {
                int color = paint.getColor();
                C9302 c9302 = c13035.f39034;
                C17768 c17769 = c7391.f22750;
                c17769.m41620(c9302);
                int i12 = i;
                float f4 = 0.0f;
                while (i12 < i2) {
                    float f5 = f + f4;
                    if (f5 > i4) {
                        break;
                    }
                    if (i12 < i11) {
                        z2 = false;
                        iM49205 = color;
                        iMin = i11;
                    } else if (i12 < i10) {
                        try {
                            if (c7391.f22744 <= i12 && i12 < (i7 = c7391.f22745)) {
                                iMin = Math.min(i2, i7);
                                iM49205 = color;
                                z2 = false;
                            } else {
                                c17769.m41621(i12 - i11);
                                int iMin2 = Math.min(i2, c17769.m41619() + i11);
                                int i13 = c7391.f22744;
                                if (i12 < i13) {
                                    iMin2 = Math.min(iMin2, i13);
                                }
                                iM49205 = c17769.m41624().m49205();
                                iMin = iMin2;
                                z2 = (iM49205 == color || iM49205 == c7391.f22747) ? false : true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c17768 = c17769;
                            i6 = color;
                            paint2 = paint3;
                            paint2.setColor(i6);
                            c17768.m41620(C9302.m23878());
                            throw th;
                        }
                    } else {
                        z2 = false;
                        iMin = i2;
                        iM49205 = color;
                    }
                    try {
                        paint3.setColor(iM49205);
                        if (z2 && !c7391.f22746) {
                            float f6 = f3 + f4;
                            boolean z3 = z || iMin < i2;
                            C13740 c13740 = c7391.f22753;
                            i9 = iMin;
                            c17768 = c17769;
                            i8 = color;
                            try {
                                fM24472 = c22686.m24473(canvas, charSequence, i12, iMin, f5, f2, i3, i4, f6, paint, i5, z3, c13740);
                            } catch (Throwable th2) {
                                th = th2;
                                paint2 = paint;
                                i6 = i8;
                                paint2.setColor(i6);
                                c17768.m41620(C9302.m23878());
                                throw th;
                            }
                        } else {
                            i9 = iMin;
                            c17768 = c17769;
                            i8 = color;
                            fM24472 = c22686.m24472(canvas, charSequence, i12, i9, f5, f2, i3, i4, f3 + f4, paint, i5, z || i9 < i2);
                        }
                        f4 += fM24472;
                        paint3 = paint;
                        i12 = i9;
                        c17769 = c17768;
                        color = i8;
                        i11 = i11;
                        i10 = i10;
                        c7391 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c17768 = c17769;
                        i8 = color;
                    }
                }
                paint3.setColor(color);
                c17769.m41620(C9302.m23878());
                return f4;
            }
        }
        return c22686.m24472(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19892(C7391 c7391, Canvas canvas, float f, float f2, float f3, float f4, Runnable runnable) {
        runnable.run();
        int iSave = canvas.save();
        try {
            if (canvas.clipRect((float) Math.floor(f), (float) Math.floor(f2), (float) Math.ceil(f3), (float) Math.ceil(f4))) {
                c7391.f22746 = true;
            }
            return c7391.f22746;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m19896(C6686 c6686, CharSequence charSequence, int i, int i2) {
        C21834 c21834Mo18558;
        C21834 c21834M19890;
        int iM18231;
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C21834 c21834 = null;
        if (charSequence.length() != c6686.m18230() || i < 0 || i > i2 || i2 > charSequence.length() || !c6686.m18232(i, i2)) {
            return null;
        }
        if (i != i2) {
            C23619 c23619 = this.f22749;
            c23619.m52105(c6686, i, i2);
            C9302 c9302M18228 = c6686.m18228();
            C19886 c19886 = this.f22748;
            m19891(c19886, c9302M18228);
            int i3 = -1;
            int i4 = Integer.MAX_VALUE;
            C21834 c21835 = null;
            do {
                try {
                    int iM52107 = c23619.m52107();
                    int iM52104 = c23619.m52104();
                    int iM52106 = c23619.m52106();
                    int iM18232 = c6686.m18231(iM52106);
                    C15068 c15068M18234 = c6686.m18234(iM52106);
                    if (c15068M18234 != null) {
                        Iterator it = c15068M18234.m35655().iterator();
                        do {
                            if (it.hasNext()) {
                                c21834Mo18558 = ((InterfaceC21129) it.next()).mo18558(iM52107, iM52104, charSequence);
                            }
                        } while (c21834Mo18558 == null);
                        if (c21834Mo18558 == null && c9302M18228.m23884(iM52107, iM52104) && c19886.m45727(iM52107)) {
                            do {
                                c21834Mo18558 = m19890(c19886.m45730());
                                if (c21834Mo18558 == null || c19886.m45725() >= iM52104) {
                                    break;
                                    break;
                                }
                            } while (c19886.m45731());
                        }
                        if (c21834Mo18558 != null && (iM18232 > i3 || (iM18232 == i3 && iM52107 < i4))) {
                            i4 = iM52107;
                            i3 = iM18232;
                            c21835 = c21834Mo18558;
                        }
                    }
                    c21834Mo18558 = null;
                    if (c21834Mo18558 == null) {
                        do {
                            c21834Mo18558 = m19890(c19886.m45730());
                            if (c21834Mo18558 == null) {
                                break;
                            }
                        } while (c19886.m45731());
                    }
                    if (c21834Mo18558 != null) {
                        i4 = iM52107;
                        i3 = iM18232;
                        c21835 = c21834Mo18558;
                    }
                } finally {
                    c23619.m52108();
                    c19886.m45733();
                }
            } while (c23619.m52109());
            if (i2 < charSequence.length()) {
                int i5 = i2 + 1;
                if (c6686.m18232(i2, i5) && c9302M18228.m23884(i2, i5) && c19886.m45727(i2) && c19886.m45728() == i2 && (c21834M19890 = m19890(c19886.m45730())) != null && ((iM18231 = c6686.m18231(c6686.m18226(i2))) > i3 || (iM18231 == i3 && i2 < i4))) {
                    c21835 = c21834M19890;
                }
            }
            return c21835;
        }
        C15068 c15068M18235 = c6686.m18234(c6686.m18227(i, i));
        if (c15068M18235 != null) {
            Iterator it2 = c15068M18235.m35655().iterator();
            while (it2.hasNext()) {
                C21834 c21834Mo18559 = ((InterfaceC21129) it2.next()).mo18558(i, i, charSequence);
                if (c21834Mo18559 != null) {
                    c21834 = c21834Mo18559;
                    break;
                }
            }
        }
        if (c21834 != null || charSequence.length() == 0) {
            return c21834;
        }
        if (i >= charSequence.length()) {
            i--;
        }
        return m19890(c6686.m18228().m23883(i));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C21834 m19897(C9302 c9302, CharSequence charSequence, int i, int i2) {
        C11003.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        if (c9302 != null && c9302.m23880() == charSequence.length() && i >= 0 && i <= i2 && i2 <= charSequence.length()) {
            if (i != i2) {
                if (c9302.m23884(i, i2 < charSequence.length() ? i2 + 1 : i2)) {
                    C19886 c19886 = this.f22748;
                    c19886.m45726(c9302);
                    try {
                        if (!c19886.m45727(i)) {
                            return null;
                        }
                        while (c19886.m45728() <= i2) {
                            C21834 c21834M19890 = m19890(c19886.m45730());
                            if (c21834M19890 != null) {
                                return c21834M19890;
                            }
                            if (!c19886.m45731()) {
                                break;
                            }
                        }
                        return null;
                    } finally {
                        c19886.m45733();
                    }
                }
            } else if (charSequence.length() != 0) {
                if (i >= charSequence.length()) {
                    i--;
                }
                return m19890(c9302.m23883(i));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C21834 m19890(C21834 c21834) {
        if ((c21834.m49207() & (-16777216)) != 100663296) {
            return null;
        }
        return C21834.m49198(null, c21834.m49209() | (-16777216), 1447446, c21834.m49211() | (-16777216), 1447446, 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final float m19894(C9302 c9302, CharSequence charSequence, int i, int i2, float f, C9584 c9584) {
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        try {
            if (c19886.m45727(i) && c19886.m45725() < i2) {
                float fM24487 = c9584.m24487(charSequence, i, c19886.m45725(), f);
                while (c19886.m45731()) {
                    if (c19886.m45725() < i2) {
                        fM24487 += c9584.m24487(charSequence, c19886.m45728(), c19886.m45725(), f + fM24487);
                    } else {
                        return fM24487 + c9584.m24487(charSequence, c19886.m45728(), i2, f + fM24487);
                    }
                }
                return fM24487;
            }
            return c9584.m24487(charSequence, i, i2, f);
        } finally {
            c19886.m45733();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m19895(int i, int i2, C9302 c9302) {
        long j;
        long j2;
        long j3;
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        try {
            if (m19893(c19886, i, i)) {
                int iM45728 = c19886.m45728();
                int iM45725 = c19886.m45725();
                int iM20005 = C7466.m20005(c19886.m45730().m49207(), i2);
                if (i == iM45728) {
                    if (c19886.m45729()) {
                        int iM20006 = C7466.m20005(c19886.m45730().m49207(), i2);
                        if (iM20006 == iM20005) {
                            j2 = iM20005;
                        } else {
                            j3 = iM20006;
                            j = (j3 & 4294967295L) | ((4294967295L & ((long) iM20005)) << 32);
                        }
                    } else {
                        if (iM20005 != i2) {
                            j3 = i2;
                            j = (j3 & 4294967295L) | ((4294967295L & ((long) iM20005)) << 32);
                        }
                        j2 = iM20005;
                    }
                } else if (iM20005 == i2 || i != iM45725 || c19886.m45731()) {
                    j2 = iM20005;
                } else {
                    j = ((((long) i2) & 4294967295L) << 32) | (((long) iM20005) & 4294967295L);
                }
                return j;
            }
            j2 = i2;
            j = j2 & 4294967295L;
            return j;
        } finally {
            c19886.m45733();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m19899(C9302 c9302, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, Paint paint, C22686 c22686, int[] iArr) {
        float f3;
        float fM24475;
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        int i4 = i;
        try {
            if (c19886.m45727(i4)) {
                if (c19886.m45725() < i2 || (c19886.m45730().m49207() >>> 24) != 0) {
                    float f4 = 0.0f;
                    float f5 = 0.0f;
                    while (i4 < i2) {
                        float f6 = i3;
                        if (f5 > f6) {
                            break;
                        }
                        int iMin = Math.min(i2, c19886.m45725());
                        int iM49207 = c19886.m45730().m49207();
                        if ((iM49207 >>> 24) != 0) {
                            f3 = f6;
                            fM24475 = m19888(iM49207, canvas, charSequence, i4, iMin, f5, f, f2, f4, i3, paint, c22686, iArr);
                            iMin = iMin;
                        } else {
                            f3 = f6;
                            fM24475 = c22686.m24475(charSequence, i4, iMin, f4, Math.max(0.0f, f3 - f5));
                        }
                        f5 += fM24475;
                        f4 += fM24475;
                        if (f5 >= f3 || iMin == i2 || !c19886.m45731()) {
                            return;
                        } else {
                            i4 = iMin;
                        }
                    }
                }
            }
        } finally {
            c19886.m45733();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int[] m19904(int i, C9302 c9302) {
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        try {
            if (c19886.m45727(i) && c19886.m45730().m49206()) {
                int iM45728 = c19886.m45728();
                int iM45725 = c19886.m45725();
                while (c19886.m45729() && c19886.m45730().m49206()) {
                    iM45728 = c19886.m45728();
                }
                if (!c19886.m45727(i)) {
                    return null;
                }
                while (c19886.m45731() && c19886.m45730().m49206()) {
                    iM45725 = c19886.m45725();
                }
                return new int[]{iM45728, iM45725};
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            c19886.m45733();
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C14630 m19905(int i, int i2, C9302 c9302) {
        C19886 c19886 = this.f22748;
        m19891(c19886, c9302);
        try {
            if (m19893(c19886, i, i2)) {
                int iM45728 = c19886.m45728();
                int iM45725 = c19886.m45725();
                C21834 c21834M45730 = c19886.m45730();
                c19886.m45732();
                return new C14630(iM45728, iM45725, c21834M45730);
            }
            return null;
        } finally {
            c19886.m45733();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m19891(C19886 c19886, C9302 c9302) {
        if (c9302 == null) {
            c9302 = C9302.m23878();
        }
        c19886.m45726(c9302);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m19893(C19886 c19886, int i, int i2) {
        try {
            if (!c19886.m45727(i)) {
                return false;
            }
            if (i < c19886.m45725() || c19886.m45731()) {
                return i == i2 || c19886.m45725() >= i2;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static float m19888(int i, Canvas canvas, CharSequence charSequence, int i2, int i3, float f, float f2, float f3, float f4, int i4, Paint paint, C22686 c22686, int[] iArr) {
        paint.setColor(i);
        float fMax = Math.max(0.0f, i4 - f);
        float fM24475 = c22686.m24475(charSequence, i2, i3, f4, fMax);
        float f5 = (int) f2;
        float f6 = (int) f3;
        canvas.drawRect(f, f5, f + fM24475, f6, paint);
        C6761 c6761M24476 = null;
        int i5 = 1;
        while (i5 < iArr.length) {
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            if (i6 == i7 || i7 <= i2 || i6 >= i3) {
                f6 = f6;
                i5 = i5;
            } else {
                if (c6761M24476 == null) {
                    c6761M24476 = c22686.m24476(charSequence, i2, i3, f4, (C18159) null);
                }
                C6761 c6761 = c6761M24476;
                float fM18410 = c6761.m18410(fMax, Math.max(i2, i6));
                if (fM18410 < fM24475) {
                    float fM18411 = c6761.m18410(fMax, Math.min(i3, i7));
                    paint.setColor(C7191.m19267(i, iArr[0], 0.7f));
                    canvas.drawRect(f + fM18410, f5, f + fM18411, f6, paint);
                }
                c6761M24476 = c6761;
            }
            i5 += 2;
            f6 = f6;
        }
        return fM24475;
    }
}
