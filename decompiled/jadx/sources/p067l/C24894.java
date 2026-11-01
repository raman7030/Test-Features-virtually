package p067l;

import android.graphics.Canvas;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: l.᩻۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X1VI */
/* JADX INFO: loaded from: classes.dex */
public final class C24894 {

    /* JADX INFO: renamed from: ۘ */
    public static List f79502 = Arrays.asList("{}", "[]", "()");

    /* JADX INFO: renamed from: ֫ */
    public int f79503;

    /* JADX INFO: renamed from: ۖ */
    public C13523 f79504;

    /* JADX INFO: renamed from: ۜ */
    public int f79505;

    /* JADX INFO: renamed from: ۡ */
    public int f79506;

    /* JADX INFO: renamed from: ۢ */
    public int f79507;

    /* JADX INFO: renamed from: ۧ */
    public InterfaceC9768 f79508;

    /* JADX INFO: renamed from: ܳ */
    public int f79509;

    /* JADX INFO: renamed from: ܺ */
    public boolean f79510;

    /* JADX INFO: renamed from: ܽ */
    public final C14146 f79511;

    /* JADX INFO: renamed from: ܿ */
    public int f79512;

    /* JADX INFO: renamed from: ᩳ */
    public C13523 f79513;

    /* JADX INFO: renamed from: ᩷ */
    public int f79514;

    /* JADX INFO: renamed from: ᩻ */
    public boolean f79515;

    public C24894(C14146 c14146) {
        List list = f79502;
        this.f79513 = new C13523(list.size());
        this.f79504 = new C13523(list.size());
        this.f79511 = c14146;
        m54661(list);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54661(List list) {
        m54669();
        if (list == null) {
            list = f79502;
        }
        C13523 c13523 = this.f79513;
        c13523.clear();
        C13523 c13524 = this.f79504;
        c13524.clear();
        for (String str : list) {
            if (str.length() != 2) {
                throw new IllegalArgumentException(str);
            }
            c13523.mo29435(str.charAt(0), str.charAt(1));
            c13524.mo29435(str.charAt(1), str.charAt(0));
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m54655(int i) {
        if (!this.f79515 || this.f79510) {
            return -1;
        }
        int i2 = this.f79507;
        if (i == i2) {
            return this.f79506 + 1;
        }
        int i3 = this.f79506;
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

    /* JADX INFO: renamed from: ۧ */
    public final int[] m54664(int i) {
        if (!this.f79515 || this.f79510) {
            return null;
        }
        int i2 = this.f79507;
        if (i != i2) {
            int i3 = this.f79506;
            if (i != i3 + 1 && i != i2 + 1 && i != i3) {
                return null;
            }
        }
        return new int[]{i2, this.f79506};
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m54663(int i, int i2) {
        m54652(i, i2, 0, this.f79511.m32590());
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54658(int i, int i2, int i3, int i4) {
        int iM32590 = this.f79511.m32590();
        if (i3 >= 0 && i3 <= i4 && i4 <= iM32590) {
            m54652(i, i2, i3, i4);
        } else {
            StringBuilder sbM49005 = C21720.m49005("Invalid syntax coverage [", i3, ", ", ") for length ", i4);
            sbM49005.append(iM32590);
            throw new IndexOutOfBoundsException(sbM49005.toString());
        }
    }

    /* JADX INFO: renamed from: ۧ */
    private void m54652(int i, int i2, int i3, int i4) {
        C14146 c14146 = this.f79511;
        if (!c14146.f40262.f75961) {
            if (this.f79515) {
                this.f79515 = false;
                return;
            }
            return;
        }
        InterfaceC9768 interfaceC9768M32500 = c14146.m32500();
        C8723 c8723M20532 = c14146.f40262.f75992 ? c14146.f40252.m20532() : null;
        try {
            C9729 c9729Mo28589 = interfaceC9768M32500.mo28589();
            try {
                int length = c9729Mo28589.length();
                if (i == i2 && i >= 0 && i <= length) {
                    boolean zM54651 = i < length ? m54651(c9729Mo28589, i, i3, i4, c8723M20532) : false;
                    if (!zM54651 && i > 0) {
                        zM54651 = m54653(c9729Mo28589, i - 1, i3, i4, c8723M20532);
                    }
                    if (!zM54651 && i > 0) {
                        zM54651 = m54651(c9729Mo28589, i - 1, i3, i4, c8723M20532);
                    }
                    if (!zM54651 && i < length) {
                        zM54651 = m54653(c9729Mo28589, i, i3, i4, c8723M20532);
                    }
                    if (zM54651) {
                        boolean z = (this.f79515 && this.f79507 == this.f79505 && this.f79506 == this.f79514) ? false : true;
                        this.f79515 = true;
                        this.f79510 = false;
                        this.f79508 = interfaceC9768M32500;
                        this.f79503 = c9729Mo28589.m22747();
                        int i5 = this.f79505;
                        int i6 = this.f79514;
                        if (i5 <= i6) {
                            this.f79507 = i5;
                            this.f79506 = i6;
                        } else {
                            this.f79507 = i6;
                            this.f79506 = i5;
                        }
                        this.f79512 = c9729Mo28589.m22745(this.f79507);
                        this.f79509 = c9729Mo28589.m22745(this.f79506);
                        if (z) {
                            if (Looper.myLooper() != Looper.getMainLooper()) {
                                c14146.postInvalidate();
                            } else {
                                c14146.invalidate();
                            }
                        }
                        c9729Mo28589.close();
                        return;
                    }
                }
                c9729Mo28589.close();
            } catch (Throwable th) {
                try {
                    c9729Mo28589.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Exception unused) {
        }
        if (this.f79515) {
            this.f79515 = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                c14146.postInvalidate();
            } else {
                c14146.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m54651(C9729 c9729, int i, int i2, int i3, C8723 c8723) {
        char cMo22106;
        int iM20174;
        int iM32368;
        int iMin;
        C16689 c16689M20182;
        if (i >= i2 && i < i3) {
            char cCharAt = c9729.charAt(i);
            if (c8723 != null) {
                if (c8723.m20180(i, i + 1) && (c16689M20182 = c8723.m20182((iM20174 = c8723.m20174(i)))) != null) {
                    cMo22106 = m54649(c16689M20182, cCharAt, true);
                    Math.max(i2, c8723.m20184(iM20174));
                    iMin = Math.min(i3, c8723.m20185(iM20174));
                    iM32368 = c8723.m20181(i);
                }
            } else {
                cMo22106 = this.f79513.mo22106(cCharAt);
                iM20174 = -1;
                iM32368 = this.f79511.m32368(i);
                iMin = i3;
            }
            if (cMo22106 != 0) {
                int i4 = i + 1;
                int iIndexOf = c9729.indexOf(cMo22106, i4, iMin);
                int i5 = 0;
                while (iIndexOf != -1) {
                    if (m54650(c8723, iM20174, iIndexOf, iM32368)) {
                        int iIndexOf2 = c9729.indexOf(cCharAt, i4, iIndexOf);
                        int i6 = 0;
                        while (iIndexOf2 != -1) {
                            if (m54650(c8723, iM20174, iIndexOf2, iM32368)) {
                                i6++;
                            }
                            iIndexOf2 = c9729.indexOf(cCharAt, iIndexOf2 + 1, iIndexOf);
                        }
                        int i7 = i5 + i6;
                        if (i7 == 0) {
                            this.f79505 = i;
                            this.f79514 = iIndexOf;
                            return true;
                        }
                        i4 = iIndexOf + 1;
                        i5 = i7 - 1;
                    }
                    iIndexOf = c9729.indexOf(cMo22106, iIndexOf + 1, iMin);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۧ */
    private boolean m54653(C9729 c9729, int i, int i2, int i3, C8723 c8723) {
        char cMo22106;
        int iM32368;
        int iM20174;
        C16689 c16689M20182;
        int iMax = i2;
        if (i >= iMax && i < i3) {
            char cCharAt = c9729.charAt(i);
            if (c8723 != null) {
                if (c8723.m20180(i, i + 1) && (c16689M20182 = c8723.m20182((iM20174 = c8723.m20174(i)))) != null) {
                    cMo22106 = m54649(c16689M20182, cCharAt, false);
                    iMax = Math.max(iMax, c8723.m20184(iM20174));
                    Math.min(i3, c8723.m20185(iM20174));
                    iM32368 = c8723.m20181(i);
                }
            } else {
                cMo22106 = this.f79504.mo22106(cCharAt);
                iM32368 = this.f79511.m32368(i);
                iM20174 = -1;
            }
            if (cMo22106 != 0) {
                int iLastIndexOf = c9729.lastIndexOf(cMo22106, iMax, i);
                int i4 = i - 1;
                int i5 = 0;
                while (iLastIndexOf != -1) {
                    if (m54650(c8723, iM20174, iLastIndexOf, iM32368)) {
                        int i6 = i4 + 1;
                        int iIndexOf = c9729.indexOf(cCharAt, iLastIndexOf + 1, i6);
                        int i7 = 0;
                        while (iIndexOf != -1) {
                            if (m54650(c8723, iM20174, iIndexOf, iM32368)) {
                                i7++;
                            }
                            iIndexOf = c9729.indexOf(cCharAt, iIndexOf + 1, i6);
                        }
                        int i8 = i5 + i7;
                        if (i8 == 0) {
                            this.f79505 = iLastIndexOf;
                            this.f79514 = i;
                            return true;
                        }
                        i4 = iLastIndexOf - 1;
                        i5 = i8 - 1;
                    }
                    iLastIndexOf = c9729.lastIndexOf(cMo22106, iMax, iLastIndexOf);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    private boolean m54650(C8723 c8723, int i, int i2, int i3) {
        if (c8723 == null) {
            return this.f79511.m32368(i2) == i3;
        }
        return c8723.m20174(i2) == i && c8723.m20181(i2) == i3;
    }

    /* JADX INFO: renamed from: ֫ */
    public static char m54649(C16689 c16689, char c, boolean z) {
        String str;
        List listM37821 = c16689.m37821();
        if (listM37821 == null) {
            listM37821 = f79502;
        }
        int i = !z ? 1 : 0;
        int size = listM37821.size();
        do {
            size--;
            if (size < 0) {
                return (char) 0;
            }
            str = (String) listM37821.get(size);
        } while (str.charAt(i) != c);
        return str.charAt(z ? 1 : 0);
    }

    /* JADX INFO: renamed from: ֫ */
    public final long m54656(int i, int i2, int i3) {
        InterfaceC9768 interfaceC9768M32500 = this.f79511.m32500();
        if (!this.f79515 || this.f79508 != interfaceC9768M32500 || this.f79503 + 1 != interfaceC9768M32500.mo28581()) {
            return -1L;
        }
        if (i2 == 0 && i3 == 0) {
            return -1L;
        }
        int i4 = i + i2;
        int i5 = this.f79507;
        if (i <= i5 && i5 < i4) {
            return -1L;
        }
        int i6 = this.f79506;
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

    /* JADX INFO: renamed from: ֫ */
    public final void m54659(long j) {
        if (j < 0) {
            return;
        }
        this.f79507 = (int) (j >>> 32);
        this.f79506 = (int) j;
        C14146 c14146 = this.f79511;
        this.f79503 = c14146.m32500().mo28581();
        this.f79510 = true;
        this.f79515 = true;
        m54657(c14146.m32508(), c14146.m32512());
        if (this.f79515) {
            this.f79512 = c14146.m32484(this.f79507);
            this.f79509 = c14146.m32484(this.f79506);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54657(int i, int i2) {
        int i3;
        int i4;
        if (this.f79510) {
            InterfaceC9768 interfaceC9768 = this.f79508;
            C14146 c14146 = this.f79511;
            if (interfaceC9768 == c14146.m32500() && this.f79503 == c14146.m32500().mo28581() && c14146.f40262.f75961 && c14146.isAttachedToWindow() && c14146.m32547() && !c14146.f40228 && i == i2 && (i == (i3 = this.f79507) || i == i3 + 1 || i == (i4 = this.f79506) || i == i4 + 1)) {
                return;
            }
        }
        m54669();
    }

    /* JADX INFO: renamed from: ܿ */
    public final boolean m54667() {
        return this.f79515;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m54665() {
        this.f79510 = false;
        this.f79515 = false;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final void m54669() {
        this.f79510 = false;
        InterfaceC9768 interfaceC9768 = this.f79508;
        C14146 c14146 = this.f79511;
        if (interfaceC9768 != c14146.m32500()) {
            this.f79508 = null;
        }
        if (this.f79515) {
            this.f79515 = false;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                c14146.postInvalidate();
            } else {
                c14146.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m54654() {
        return this.f79512;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m54662() {
        return this.f79509;
    }

    /* JADX INFO: renamed from: ܽ */
    public final int m54666() {
        return this.f79507;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m54668() {
        return this.f79506;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m54660(Canvas canvas, int i, int i2, float f, float f2, C3831 c3831, C23929 c23929, InterfaceC12786 interfaceC12786) {
        if (this.f79515 && this.f79511.isFocused()) {
            int i3 = this.f79507;
            if (i <= i3 && i3 < i2) {
                C21484 c21484 = (C21484) interfaceC12786;
                float fM48686 = c21484.m48686(i, 0.0f, i3);
                int i4 = this.f79507;
                float fM48687 = c21484.m48686(i4, 0.0f, i4 + 1);
                c3831.setColor(c23929.f75964);
                canvas.drawRect(fM48686 + 0.0f, f, fM48686 + fM48687, f2, c3831);
            }
            int i5 = this.f79506;
            if (i > i5 || i5 >= i2) {
                return;
            }
            C21484 c21485 = (C21484) interfaceC12786;
            float fM48688 = c21485.m48686(i, 0.0f, i5);
            int i6 = this.f79506;
            float fM48689 = c21485.m48686(i6, 0.0f, i6 + 1);
            c3831.setColor(c23929.f75964);
            canvas.drawRect(fM48688 + 0.0f, f, fM48688 + fM48689, f2, c3831);
        }
    }
}
