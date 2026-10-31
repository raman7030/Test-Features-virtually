package l;

import android.graphics.Canvas;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VI */
/* JADX INFO: loaded from: classes.dex */
public final class C23701 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static List f76752 = Arrays.asList("{}", "[]", "()");

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f76753;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11737 f76754;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f76755;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f76756;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f76757;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public InterfaceC7785 f76758;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f76759;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f76760;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C12392 f76761;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f76762;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C11737 f76763;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f76764;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f76765;

    public C23701(C12392 c12392) {
        List list = f76752;
        this.f76763 = new C11737(list.size());
        this.f76754 = new C11737(list.size());
        this.f76761 = c12392;
        m52257(list);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52257(List list) {
        m52265();
        if (list == null) {
            list = f76752;
        }
        C11737 c11737 = this.f76763;
        c11737.clear();
        C11737 c11738 = this.f76754;
        c11738.clear();
        for (String str : list) {
            if (str.length() != 2) {
                throw new IllegalArgumentException(str);
            }
            c11737.mo27373(str.charAt(0), str.charAt(1));
            c11738.mo27373(str.charAt(1), str.charAt(0));
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52251(int i) {
        if (!this.f76765 || this.f76760) {
            return -1;
        }
        int i2 = this.f76757;
        if (i == i2) {
            return this.f76756 + 1;
        }
        int i3 = this.f76756;
        int i4 = i3 + 1;
        if (i != i4) {
            if (i == i2 + 1) {
                return i4;
            }
            if (i != i3) {
                return -1;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] m52260(int i) {
        if (!this.f76765 || this.f76760) {
            return null;
        }
        int i2 = this.f76757;
        if (i != i2) {
            int i3 = this.f76756;
            if (i != i3 + 1 && i != i2 + 1 && i != i3) {
                return null;
            }
        }
        return new int[]{i2, this.f76756};
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m52259(int i, int i2) {
        m52248(i, i2, 0, this.f76761.m30526());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52254(int i, int i2, int i3, int i4) {
        int iM30526 = this.f76761.m30526();
        if (i3 >= 0 && i3 <= i4 && i4 <= iM30526) {
            m52248(i, i2, i3, i4);
        } else {
            StringBuilder sbM46682 = C20361.m46682("Invalid syntax coverage [", i3, ", ", ") for length ", i4);
            sbM46682.append(iM30526);
            throw new IndexOutOfBoundsException(sbM46682.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m52248(int i, int i2, int i3, int i4) {
        C12392 c12392 = this.f76761;
        if (!c12392.f37245.f73236) {
            if (this.f76765) {
                this.f76765 = false;
                return;
            }
            return;
        }
        InterfaceC7785 interfaceC7785M30436 = c12392.m30436();
        C6686 c6686M18583 = c12392.f37245.f73267 ? c12392.f37235.m18583() : null;
        try {
            C7744 c7744Mo26556 = interfaceC7785M30436.mo26556();
            try {
                int length = c7744Mo26556.length();
                if (i == i2 && i >= 0 && i <= length) {
                    boolean zM52247 = i < length ? m52247(c7744Mo26556, i, i3, i4, c6686M18583) : false;
                    if (!zM52247 && i > 0) {
                        zM52247 = m52249(c7744Mo26556, i - 1, i3, i4, c6686M18583);
                    }
                    if (!zM52247 && i > 0) {
                        zM52247 = m52247(c7744Mo26556, i - 1, i3, i4, c6686M18583);
                    }
                    if (!zM52247 && i < length) {
                        zM52247 = m52249(c7744Mo26556, i, i3, i4, c6686M18583);
                    }
                    if (zM52247) {
                        boolean z = (this.f76765 && this.f76757 == this.f76755 && this.f76756 == this.f76764) ? false : true;
                        this.f76765 = true;
                        this.f76760 = false;
                        this.f76758 = interfaceC7785M30436;
                        this.f76753 = c7744Mo26556.m20767();
                        int i5 = this.f76755;
                        int i6 = this.f76764;
                        if (i5 <= i6) {
                            this.f76757 = i5;
                            this.f76756 = i6;
                        } else {
                            this.f76757 = i6;
                            this.f76756 = i5;
                        }
                        this.f76762 = c7744Mo26556.m20765(this.f76757);
                        this.f76759 = c7744Mo26556.m20765(this.f76756);
                        if (z) {
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                c12392.postInvalidate();
                            } else {
                                c12392.invalidate();
                            }
                        }
                        c7744Mo26556.close();
                        return;
                    }
                }
                c7744Mo26556.close();
            } catch (Throwable th) {
                try {
                    c7744Mo26556.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
        if (this.f76765) {
            this.f76765 = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                c12392.postInvalidate();
            } else {
                c12392.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52247(C7744 c7744, int i, int i2, int i3, C6686 c6686) {
        char cMo20130;
        int iM18226;
        int iM30304;
        int iMin;
        C15068 c15068M18234;
        if (i >= i2 && i < i3) {
            char cCharAt = c7744.charAt(i);
            if (c6686 != null) {
                if (c6686.m18232(i, i + 1) && (c15068M18234 = c6686.m18234((iM18226 = c6686.m18226(i)))) != null) {
                    cMo20130 = m52245(c15068M18234, cCharAt, true);
                    Math.max(i2, c6686.m18236(iM18226));
                    iMin = Math.min(i3, c6686.m18237(iM18226));
                    iM30304 = c6686.m18233(i);
                }
            } else {
                cMo20130 = this.f76763.mo20130(cCharAt);
                iM18226 = -1;
                iM30304 = this.f76761.m30304(i);
                iMin = i3;
            }
            if (cMo20130 != 0) {
                int i4 = i + 1;
                int iIndexOf = c7744.indexOf(cMo20130, i4, iMin);
                int i5 = 0;
                while (iIndexOf != -1) {
                    if (m52246(c6686, iM18226, iIndexOf, iM30304)) {
                        int iIndexOf2 = c7744.indexOf(cCharAt, i4, iIndexOf);
                        int i6 = 0;
                        while (iIndexOf2 != -1) {
                            if (m52246(c6686, iM18226, iIndexOf2, iM30304)) {
                                i6++;
                            }
                            iIndexOf2 = c7744.indexOf(cCharAt, iIndexOf2 + 1, iIndexOf);
                        }
                        int i7 = i5 + i6;
                        if (i7 == 0) {
                            this.f76755 = i;
                            this.f76764 = iIndexOf;
                            return true;
                        }
                        i4 = iIndexOf + 1;
                        i5 = i7 - 1;
                    }
                    iIndexOf = c7744.indexOf(cMo20130, iIndexOf + 1, iMin);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m52249(C7744 c7744, int i, int i2, int i3, C6686 c6686) {
        char cMo20130;
        int iM30304;
        int iM18226;
        C15068 c15068M18234;
        int iMax = i2;
        if (i >= iMax && i < i3) {
            char cCharAt = c7744.charAt(i);
            if (c6686 != null) {
                if (c6686.m18232(i, i + 1) && (c15068M18234 = c6686.m18234((iM18226 = c6686.m18226(i)))) != null) {
                    cMo20130 = m52245(c15068M18234, cCharAt, false);
                    iMax = Math.max(iMax, c6686.m18236(iM18226));
                    Math.min(i3, c6686.m18237(iM18226));
                    iM30304 = c6686.m18233(i);
                }
            } else {
                cMo20130 = this.f76754.mo20130(cCharAt);
                iM30304 = this.f76761.m30304(i);
                iM18226 = -1;
            }
            if (cMo20130 != 0) {
                int iLastIndexOf = c7744.lastIndexOf(cMo20130, iMax, i);
                int i4 = i - 1;
                int i5 = 0;
                while (iLastIndexOf != -1) {
                    if (m52246(c6686, iM18226, iLastIndexOf, iM30304)) {
                        int i6 = i4 + 1;
                        int iIndexOf = c7744.indexOf(cCharAt, iLastIndexOf + 1, i6);
                        int i7 = 0;
                        while (iIndexOf != -1) {
                            if (m52246(c6686, iM18226, iIndexOf, iM30304)) {
                                i7++;
                            }
                            iIndexOf = c7744.indexOf(cCharAt, iIndexOf + 1, i6);
                        }
                        int i8 = i5 + i7;
                        if (i8 == 0) {
                            this.f76755 = iLastIndexOf;
                            this.f76764 = i;
                            return true;
                        }
                        i4 = iLastIndexOf - 1;
                        i5 = i8 - 1;
                    }
                    iLastIndexOf = c7744.lastIndexOf(cMo20130, iMax, iLastIndexOf);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m52246(C6686 c6686, int i, int i2, int i3) {
        if (c6686 == null) {
            return this.f76761.m30304(i2) == i3;
        }
        return c6686.m18226(i2) == i && c6686.m18233(i2) == i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static char m52245(C15068 c15068, char c, boolean z) {
        String str;
        List listM35663 = c15068.m35663();
        if (listM35663 == null) {
            listM35663 = f76752;
        }
        int i = !z ? 1 : 0;
        int size = listM35663.size();
        do {
            size--;
            if (size < 0) {
                return (char) 0;
            }
            str = (String) listM35663.get(size);
        } while (str.charAt(i) != c);
        return str.charAt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long m52252(int i, int i2, int i3) {
        InterfaceC7785 interfaceC7785M30436 = this.f76761.m30436();
        if (!this.f76765 || this.f76758 != interfaceC7785M30436 || this.f76753 + 1 != interfaceC7785M30436.mo26548()) {
            return -1L;
        }
        if (i2 == 0 && i3 == 0) {
            return -1L;
        }
        int i4 = i + i2;
        int i5 = this.f76757;
        if (i <= i5 && i5 < i4) {
            return -1L;
        }
        int i6 = this.f76756;
        if (i <= i6 && i6 < i4) {
            return -1L;
        }
        int i7 = i3 - i2;
        if (i5 >= i4) {
            i5 += i7;
        }
        if (i6 >= i4) {
            i6 += i7;
        }
        return (((long) i5) << 32) | (((long) i6) & 4294967295L);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52255(long j) {
        if (j < 0) {
            return;
        }
        this.f76757 = (int) (j >>> 32);
        this.f76756 = (int) j;
        C12392 c12392 = this.f76761;
        this.f76753 = c12392.m30436().mo26548();
        this.f76760 = true;
        this.f76765 = true;
        m52253(c12392.m30444(), c12392.m30448());
        if (this.f76765) {
            this.f76762 = c12392.m30420(this.f76757);
            this.f76759 = c12392.m30420(this.f76756);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52253(int i, int i2) {
        int i3;
        int i4;
        if (this.f76760) {
            InterfaceC7785 interfaceC7785 = this.f76758;
            C12392 c12392 = this.f76761;
            if (interfaceC7785 == c12392.m30436() && this.f76753 == c12392.m30436().mo26548() && c12392.f37245.f73236 && c12392.isAttachedToWindow() && c12392.m30483() && !c12392.f37211 && i == i2 && (i == (i3 = this.f76757) || i == i3 + 1 || i == (i4 = this.f76756) || i == i4 + 1)) {
                return;
            }
        }
        m52265();
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final boolean m52263() {
        return this.f76765;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m52261() {
        this.f76760 = false;
        this.f76765 = false;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m52265() {
        this.f76760 = false;
        InterfaceC7785 interfaceC7785 = this.f76758;
        C12392 c12392 = this.f76761;
        if (interfaceC7785 != c12392.m30436()) {
            this.f76758 = null;
        }
        if (this.f76765) {
            this.f76765 = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                c12392.postInvalidate();
            } else {
                c12392.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m52250() {
        return this.f76762;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m52258() {
        return this.f76759;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int m52262() {
        return this.f76757;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m52264() {
        return this.f76756;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m52256(Canvas canvas, int i, int i2, float f, float f2, C1539 c1539, C22686 c22686, InterfaceC10961 interfaceC10961) {
        if (this.f76765 && this.f76761.isFocused()) {
            int i3 = this.f76757;
            if (i <= i3 && i3 < i2) {
                C20113 c20113 = (C20113) interfaceC10961;
                float fM46370 = c20113.m46370(i, 0.0f, i3);
                int i4 = this.f76757;
                float fM46371 = c20113.m46370(i4, 0.0f, i4 + 1);
                c1539.setColor(c22686.f73239);
                canvas.drawRect(fM46370 + 0.0f, f, fM46370 + fM46371, f2, c1539);
            }
            int i5 = this.f76756;
            if (i > i5 || i5 >= i2) {
                return;
            }
            C20113 c20114 = (C20113) interfaceC10961;
            float fM46372 = c20114.m46370(i, 0.0f, i5);
            int i6 = this.f76756;
            float fM46373 = c20114.m46370(i6, 0.0f, i6 + 1);
            c1539.setColor(c22686.f73239);
            canvas.drawRect(fM46372 + 0.0f, f, fM46372 + fM46373, f2, c1539);
        }
    }
}
