package p067l;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.Iterator;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۟ۢܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6ZC */
/* JADX INFO: loaded from: classes3.dex */
public final class C9393 {

    /* JADX INFO: renamed from: ֫ */
    public C14757 f25654;

    /* JADX INFO: renamed from: ۜ */
    public int f25655;

    /* JADX INFO: renamed from: ۧ */
    public boolean f25658;

    /* JADX INFO: renamed from: ܳ */
    public int f25659;

    /* JADX INFO: renamed from: ᩷ */
    public float f25664 = 1.0f;

    /* JADX INFO: renamed from: ۡ */
    public int f25656 = -1;

    /* JADX INFO: renamed from: ۢ */
    public int f25657 = -1;

    /* JADX INFO: renamed from: ܿ */
    public final C19255 f25662 = new C19255();

    /* JADX INFO: renamed from: ᩻ */
    public final C15427 f25665 = new InterfaceC24887() { // from class: l.ܰۢܿ
        @Override // p067l.InterfaceC24887
        /* JADX INFO: renamed from: ֫ */
        public final boolean mo29367(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, Runnable runnable) {
            return C9393.m21865(this.f44096, canvas, f, f2, f3, f4, runnable);
        }
    };

    /* JADX INFO: renamed from: ܺ */
    public final C21268 f25660 = new C21268();

    /* JADX INFO: renamed from: ᩳ */
    public final C21268 f25663 = new C21268();

    /* JADX INFO: renamed from: ܽ */
    public final C24816 f25661 = new C24816();

    /* JADX INFO: renamed from: ֫ */
    public final void m21874(C14757 c14757, int i, int i2, int i3) {
        this.f25654 = c14757;
        this.f25656 = i;
        this.f25657 = i2;
        this.f25659 = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m21875() {
        return this.f25658;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21871(float f, int i) {
        this.f25655 = i;
        this.f25664 = f;
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m21876(C11209 c11209, int i, int i2, int i3) {
        boolean z = false;
        if (c11209 == null || i2 < 0 || i2 >= i3 || i3 > c11209.m25889()) {
            return false;
        }
        synchronized (this.f25663) {
            C21268 c21268 = this.f25663;
            c21268.m48037(c11209);
            try {
                if (c21268.m48038(i2) && c21268.m48036() >= i3 && c21268.m48041().m51556() == i) {
                    z = true;
                }
                c21268.m48044();
            } catch (Throwable th) {
                c21268.m48044();
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m21879(int i, int i2, C11209 c11209) {
        C21268 c21268 = this.f25663;
        synchronized (c21268) {
            m21864(c21268, c11209);
            try {
                if (m21866(c21268, i, i)) {
                    int iM51556 = c21268.m48041().m51556();
                    c21268.m48044();
                    return iM51556;
                }
                c21268.m48044();
                return i2;
            } catch (Throwable th) {
                c21268.m48044();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21873(C11209 c11209, Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, Paint paint, C23929 c23929) throws Throwable {
        C21268 c21268;
        this.f25658 = false;
        C21268 c21269 = this.f25660;
        m21864(c21269, c11209);
        try {
            if (!c21269.m48038(i)) {
                c21269.m48044();
                return;
            }
            int i5 = i;
            float f2 = 0.0f;
            float f3 = 0.0f;
            while (true) {
                C23120 c23120M48041 = c21269.m48041();
                int iMin = Math.min(i2, c21269.m48036());
                boolean z = iMin < i2;
                int iM51556 = c23120M48041.m51556();
                float f4 = this.f25664;
                if (f4 < 1.0f) {
                    iM51556 = C1199.m21214(this.f25655, iM51556, f4);
                }
                paint.setColor(iM51556);
                c21268 = c21269;
                try {
                    float fM21862 = m21862(c23929, canvas, charSequence, i5, iMin, f2, f, i3, i4, f3, paint, c23120M48041.m51564(), z);
                    if (z) {
                        f2 += fM21862;
                        f3 += fM21862;
                        if (f2 > i4 || !c21268.m48042()) {
                            c21268.m48044();
                            return;
                        } else {
                            c21269 = c21268;
                            i5 = iMin;
                        }
                    } else {
                        c21268.m48044();
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c21268 = c21269;
        }
        c21268.m48044();
        throw th;
    }

    /* JADX INFO: renamed from: ֫ */
    private float m21862(C23929 c23929, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, int i4, float f3, Paint paint, int i5, boolean z) throws Throwable {
        C19255 c19255;
        int i6;
        Paint paint2;
        int iM51556;
        int iMin;
        boolean z2;
        int i7;
        int i8;
        int i9;
        float fM26484;
        C9393 c9393 = this;
        Paint paint3 = paint;
        C14757 c14757 = c9393.f25654;
        if (c14757 != null) {
            int i10 = c14757.f42081;
            int i11 = c14757.f42082;
            if (i11 < i2 && i10 > i && (c9393.f25656 > i || i2 > c9393.f25657)) {
                int color = paint.getColor();
                C11209 c11209 = c14757.f42080;
                C19255 c19256 = c9393.f25662;
                c19256.m43866(c11209);
                int i12 = i;
                float f4 = 0.0f;
                while (i12 < i2) {
                    float f5 = f + f4;
                    if (f5 > i4) {
                        break;
                    }
                    if (i12 < i11) {
                        z2 = false;
                        iM51556 = color;
                        iMin = i11;
                    } else if (i12 < i10) {
                        try {
                            if (c9393.f25656 <= i12 && i12 < (i7 = c9393.f25657)) {
                                iMin = Math.min(i2, i7);
                                iM51556 = color;
                                z2 = false;
                            } else {
                                c19256.m43867(i12 - i11);
                                int iMin2 = Math.min(i2, c19256.m43865() + i11);
                                int i13 = c9393.f25656;
                                if (i12 < i13) {
                                    iMin2 = Math.min(iMin2, i13);
                                }
                                iM51556 = c19256.m43870().m51556();
                                iMin = iMin2;
                                z2 = (iM51556 == color || iM51556 == c9393.f25659) ? false : true;
                            }
                        } catch (Throwable th) {
                            th = th;
                            c19255 = c19256;
                            i6 = color;
                            paint2 = paint3;
                            paint2.setColor(i6);
                            c19255.m43866(C11209.m25887());
                            throw th;
                        }
                    } else {
                        z2 = false;
                        iMin = i2;
                        iM51556 = color;
                    }
                    try {
                        paint3.setColor(iM51556);
                        if (z2 && !c9393.f25658) {
                            float f6 = f3 + f4;
                            boolean z3 = z || iMin < i2;
                            C15427 c15427 = c9393.f25665;
                            i9 = iMin;
                            c19255 = c19256;
                            i8 = color;
                            try {
                                fM26484 = c23929.m26485(canvas, charSequence, i12, iMin, f5, f2, i3, i4, f6, paint, i5, z3, c15427);
                            } catch (Throwable th2) {
                                th = th2;
                                paint2 = paint;
                                i6 = i8;
                                paint2.setColor(i6);
                                c19255.m43866(C11209.m25887());
                                throw th;
                            }
                        } else {
                            i9 = iMin;
                            c19255 = c19256;
                            i8 = color;
                            fM26484 = c23929.m26484(canvas, charSequence, i12, i9, f5, f2, i3, i4, f3 + f4, paint, i5, z || i9 < i2);
                        }
                        f4 += fM26484;
                        paint3 = paint;
                        i12 = i9;
                        c19256 = c19255;
                        color = i8;
                        i11 = i11;
                        i10 = i10;
                        c9393 = this;
                    } catch (Throwable th3) {
                        th = th3;
                        c19255 = c19256;
                        i8 = color;
                    }
                }
                paint3.setColor(color);
                c19256.m43866(C11209.m25887());
                return f4;
            }
        }
        return c23929.m26484(canvas, charSequence, i, i2, f, f2, i3, i4, f3, paint, i5, z);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m21865(C9393 c9393, Canvas canvas, float f, float f2, float f3, float f4, Runnable runnable) {
        runnable.run();
        int iSave = canvas.save();
        try {
            if (canvas.clipRect((float) Math.floor(f), (float) Math.floor(f2), (float) Math.ceil(f3), (float) Math.ceil(f4))) {
                c9393.f25658 = true;
            }
            return c9393.f25658;
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m21869(C8723 c8723, CharSequence charSequence, int i, int i2) {
        C23120 c23120Mo20507;
        C23120 c23120M21863;
        int iM20179;
        C12826.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C23120 c23120 = null;
        if (charSequence.length() != c8723.m20178() || i < 0 || i > i2 || i2 > charSequence.length() || !c8723.m20180(i, i2)) {
            return null;
        }
        if (i != i2) {
            C24816 c24816 = this.f25661;
            c24816.m54508(c8723, i, i2);
            C11209 c11209M20176 = c8723.m20176();
            C21268 c21268 = this.f25660;
            m21864(c21268, c11209M20176);
            int i3 = -1;
            int i4 = Integer.MAX_VALUE;
            C23120 c23121 = null;
            do {
                try {
                    int iM54510 = c24816.m54510();
                    int iM54507 = c24816.m54507();
                    int iM54509 = c24816.m54509();
                    int iM201710 = c8723.m20179(iM54509);
                    C16689 c16689M20182 = c8723.m20182(iM54509);
                    if (c16689M20182 != null) {
                        Iterator it = c16689M20182.m37813().iterator();
                        do {
                            if (it.hasNext()) {
                                c23120Mo20507 = ((InterfaceC22450) it.next()).mo20507(iM54510, iM54507, charSequence);
                            }
                        } while (c23120Mo20507 == null);
                        if (c23120Mo20507 == null && c11209M20176.m25893(iM54510, iM54507) && c21268.m48038(iM54510)) {
                            do {
                                c23120Mo20507 = m21863(c21268.m48041());
                                if (c23120Mo20507 == null || c21268.m48036() >= iM54507) {
                                    break;
                                    break;
                                }
                            } while (c21268.m48042());
                        }
                        if (c23120Mo20507 != null && (iM201710 > i3 || (iM201710 == i3 && iM54510 < i4))) {
                            i4 = iM54510;
                            i3 = iM201710;
                            c23121 = c23120Mo20507;
                        }
                    }
                    c23120Mo20507 = null;
                    if (c23120Mo20507 == null) {
                        do {
                            c23120Mo20507 = m21863(c21268.m48041());
                            if (c23120Mo20507 == null) {
                                break;
                            }
                        } while (c21268.m48042());
                    }
                    if (c23120Mo20507 != null) {
                        i4 = iM54510;
                        i3 = iM201710;
                        c23121 = c23120Mo20507;
                    }
                } finally {
                    c24816.m54511();
                    c21268.m48044();
                }
            } while (c24816.m54512());
            if (i2 < charSequence.length()) {
                int i5 = i2 + 1;
                if (c8723.m20180(i2, i5) && c11209M20176.m25893(i2, i5) && c21268.m48038(i2) && c21268.m48039() == i2 && (c23120M21863 = m21863(c21268.m48041())) != null && ((iM20179 = c8723.m20179(c8723.m20174(i2))) > i3 || (iM20179 == i3 && i2 < i4))) {
                    c23121 = c23120M21863;
                }
            }
            return c23121;
        }
        C16689 c16689M20183 = c8723.m20182(c8723.m20175(i, i));
        if (c16689M20183 != null) {
            Iterator it2 = c16689M20183.m37813().iterator();
            while (it2.hasNext()) {
                C23120 c23120Mo20508 = ((InterfaceC22450) it2.next()).mo20507(i, i, charSequence);
                if (c23120Mo20508 != null) {
                    c23120 = c23120Mo20508;
                    break;
                }
            }
        }
        if (c23120 != null || charSequence.length() == 0) {
            return c23120;
        }
        if (i >= charSequence.length()) {
            i--;
        }
        return m21863(c8723.m20176().m25892(i));
    }

    /* JADX INFO: renamed from: ֫ */
    public final C23120 m21870(C11209 c11209, CharSequence charSequence, int i, int i2) {
        C12826.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        if (c11209 != null && c11209.m25889() == charSequence.length() && i >= 0 && i <= i2 && i2 <= charSequence.length()) {
            if (i != i2) {
                if (c11209.m25893(i, i2 < charSequence.length() ? i2 + 1 : i2)) {
                    C21268 c21268 = this.f25660;
                    c21268.m48037(c11209);
                    try {
                        if (!c21268.m48038(i)) {
                            return null;
                        }
                        while (c21268.m48039() <= i2) {
                            C23120 c23120M21863 = m21863(c21268.m48041());
                            if (c23120M21863 != null) {
                                return c23120M21863;
                            }
                            if (!c21268.m48042()) {
                                break;
                            }
                        }
                        return null;
                    } finally {
                        c21268.m48044();
                    }
                }
            } else if (charSequence.length() != 0) {
                if (i >= charSequence.length()) {
                    i--;
                }
                return m21863(c11209.m25892(i));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C23120 m21863(C23120 c23120) {
        if ((c23120.m51558() & (-16777216)) != 100663296) {
            return null;
        }
        return C23120.m51549(null, c23120.m51560() | (-16777216), 1447446, c23120.m51562() | (-16777216), 1447446, 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final float m21867(C11209 c11209, CharSequence charSequence, int i, int i2, float f, C11477 c11477) {
        C21268 c21268 = this.f25660;
        m21864(c21268, c11209);
        try {
            if (c21268.m48038(i) && c21268.m48036() < i2) {
                float fM26499 = c11477.m26499(charSequence, i, c21268.m48036(), f);
                while (c21268.m48042()) {
                    if (c21268.m48036() < i2) {
                        fM26499 += c11477.m26499(charSequence, c21268.m48039(), c21268.m48036(), f + fM26499);
                    } else {
                        return fM26499 + c11477.m26499(charSequence, c21268.m48039(), i2, f + fM26499);
                    }
                }
                return fM26499;
            }
            return c11477.m26499(charSequence, i, i2, f);
        } finally {
            c21268.m48044();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m21868(int i, int i2, C11209 c11209) {
        long j;
        long j2;
        long j3;
        C21268 c21268 = this.f25660;
        m21864(c21268, c11209);
        try {
            if (m21866(c21268, i, i)) {
                int iM48039 = c21268.m48039();
                int iM48036 = c21268.m48036();
                int iM21980 = C9464.m21980(c21268.m48041().m51558(), i2);
                if (i == iM48039) {
                    if (c21268.m48040()) {
                        int iM21981 = C9464.m21980(c21268.m48041().m51558(), i2);
                        if (iM21981 == iM21980) {
                            j2 = iM21980;
                        } else {
                            j3 = iM21981;
                            j = (j3 & 4294967295L) | ((4294967295L & ((long) iM21980)) << 32);
                        }
                    } else {
                        if (iM21980 != i2) {
                            j3 = i2;
                            j = (j3 & 4294967295L) | ((4294967295L & ((long) iM21980)) << 32);
                        }
                        j2 = iM21980;
                    }
                } else if (iM21980 == i2 || i != iM48036 || c21268.m48042()) {
                    j2 = iM21980;
                } else {
                    j = ((((long) i2) & 4294967295L) << 32) | (((long) iM21980) & 4294967295L);
                }
                return j;
            }
            j2 = i2;
            j = j2 & 4294967295L;
            return j;
        } finally {
            c21268.m48044();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m21872(C11209 c11209, Canvas canvas, CharSequence charSequence, int i, int i2, float f, float f2, int i3, Paint paint, C23929 c23929, int[] iArr) {
        float f3;
        float fM26487;
        C21268 c21268 = this.f25660;
        m21864(c21268, c11209);
        int i4 = i;
        try {
            if (c21268.m48038(i4)) {
                if (c21268.m48036() < i2 || (c21268.m48041().m51558() >>> 24) != 0) {
                    float f4 = 0.0f;
                    float f5 = 0.0f;
                    while (i4 < i2) {
                        float f6 = i3;
                        if (f5 > f6) {
                            break;
                        }
                        int iMin = Math.min(i2, c21268.m48036());
                        int iM51558 = c21268.m48041().m51558();
                        if ((iM51558 >>> 24) != 0) {
                            f3 = f6;
                            fM26487 = m21861(iM51558, canvas, charSequence, i4, iMin, f5, f, f2, f4, i3, paint, c23929, iArr);
                            iMin = iMin;
                        } else {
                            f3 = f6;
                            fM26487 = c23929.m26487(charSequence, i4, iMin, f4, Math.max(0.0f, f3 - f5));
                        }
                        f5 += fM26487;
                        f4 += fM26487;
                        if (f5 >= f3 || iMin == i2 || !c21268.m48042()) {
                            return;
                        } else {
                            i4 = iMin;
                        }
                    }
                }
            }
        } finally {
            c21268.m48044();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int[] m21877(int i, C11209 c11209) {
        C21268 c21268 = this.f25660;
        m21864(c21268, c11209);
        try {
            if (c21268.m48038(i) && c21268.m48041().m51557()) {
                int iM48039 = c21268.m48039();
                int iM48036 = c21268.m48036();
                while (c21268.m48040() && c21268.m48041().m51557()) {
                    iM48039 = c21268.m48039();
                }
                if (!c21268.m48038(i)) {
                    return null;
                }
                while (c21268.m48042() && c21268.m48041().m51557()) {
                    iM48036 = c21268.m48036();
                }
                return new int[]{iM48039, iM48036};
            }
            return null;
        } catch (Exception unused) {
            return null;
        } finally {
            c21268.m48044();
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final C16273 m21878(int i, int i2, C11209 c11209) {
        C21268 c21268 = this.f25660;
        m21864(c21268, c11209);
        try {
            if (m21866(c21268, i, i2)) {
                int iM48039 = c21268.m48039();
                int iM48036 = c21268.m48036();
                C23120 c23120M48041 = c21268.m48041();
                c21268.m48043();
                return new C16273(iM48039, iM48036, c23120M48041);
            }
            return null;
        } finally {
            c21268.m48044();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m21864(C21268 c21268, C11209 c11209) {
        if (c11209 == null) {
            c11209 = C11209.m25887();
        }
        c21268.m48037(c11209);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m21866(C21268 c21268, int i, int i2) {
        try {
            if (!c21268.m48038(i)) {
                return false;
            }
            if (i < c21268.m48036() || c21268.m48042()) {
                return i == i2 || c21268.m48036() >= i2;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static float m21861(int i, Canvas canvas, CharSequence charSequence, int i2, int i3, float f, float f2, float f3, float f4, int i4, Paint paint, C23929 c23929, int[] iArr) {
        paint.setColor(i);
        float fMax = Math.max(0.0f, i4 - f);
        float fM26487 = c23929.m26487(charSequence, i2, i3, f4, fMax);
        float f5 = (int) f2;
        float f6 = (int) f3;
        canvas.drawRect(f, f5, f + fM26487, f6, paint);
        C8794 c8794M26488 = null;
        int i5 = 1;
        while (i5 < iArr.length) {
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            if (i6 == i7 || i7 <= i2 || i6 >= i3) {
                f6 = f6;
                i5 = i5;
            } else {
                if (c8794M26488 == null) {
                    c8794M26488 = c23929.m26488(charSequence, i2, i3, f4, (C19627) null);
                }
                C8794 c8794 = c8794M26488;
                float fM20358 = c8794.m20358(fMax, Math.max(i2, i6));
                if (fM20358 < fM26487) {
                    float fM20359 = c8794.m20358(fMax, Math.min(i3, i7));
                    paint.setColor(C1199.m21214(i, iArr[0], 0.7f));
                    canvas.drawRect(f + fM20358, f5, f + fM20359, f6, paint);
                }
                c8794M26488 = c8794;
            }
            i5 += 2;
            f6 = f6;
        }
        return fM26487;
    }
}
