package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes3.dex */
public final class C10947 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f32977;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C12521 f32980;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f32974 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C7150[] f32973 = new C7150[8];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f32976 = 7;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f32979 = 0;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f32975 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f32978 = 4096;

    public C10947(C12521 c12521) {
        this.f32980 = c12521;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private void m27266(int i) {
        int i2;
        if (i > 0) {
            int length = this.f32973.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f32976;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f32973[length].f21947;
                i -= i4;
                this.f32975 -= i4;
                this.f32979--;
                i3++;
                length--;
            }
            C7150[] c7150Arr = this.f32973;
            int i5 = i2 + 1;
            System.arraycopy(c7150Arr, i5, c7150Arr, i5 + i3, this.f32979);
            C7150[] c7150Arr2 = this.f32973;
            int i6 = this.f32976 + 1;
            Arrays.fill(c7150Arr2, i6, i6 + i3, (Object) null);
            this.f32976 += i3;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m27265(C7150 c7150) {
        int i = c7150.f21947;
        int i2 = this.f32978;
        if (i > i2) {
            Arrays.fill(this.f32973, (Object) null);
            this.f32976 = this.f32973.length - 1;
            this.f32979 = 0;
            this.f32975 = 0;
            return;
        }
        m27266((this.f32975 + i) - i2);
        int i3 = this.f32979 + 1;
        C7150[] c7150Arr = this.f32973;
        if (i3 > c7150Arr.length) {
            C7150[] c7150Arr2 = new C7150[c7150Arr.length * 2];
            System.arraycopy(c7150Arr, 0, c7150Arr2, c7150Arr.length, c7150Arr.length);
            this.f32976 = this.f32973.length - 1;
            this.f32973 = c7150Arr2;
        }
        int i4 = this.f32976;
        this.f32976 = i4 - 1;
        this.f32973[i4] = c7150;
        this.f32979++;
        this.f32975 += i;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x009a  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27269(ArrayList arrayList) {
        int length;
        int length2;
        C11816 c11816;
        int i;
        int length3;
        if (this.f32977) {
            int i2 = this.f32974;
            if (i2 < this.f32978) {
                m27268(i2, 31, 32);
            }
            this.f32977 = false;
            this.f32974 = Integer.MAX_VALUE;
            m27268(this.f32978, 31, 32);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C7150 c7150 = (C7150) arrayList.get(i3);
            C11816 c11816Mo2330 = c7150.f21948.mo2330();
            C11816 c11817 = c7150.f21949;
            Integer num = (Integer) C16590.f50986.get(c11816Mo2330);
            if (num != null) {
                int iIntValue = num.intValue();
                length = iIntValue + 1;
                if (length > 1 && length < 8) {
                    C7150[] c7150Arr = C16590.f50987;
                    if (C20032.m46183(c7150Arr[iIntValue].f21949, c11817)) {
                        length2 = length;
                    } else if (C20032.m46183(c7150Arr[length].f21949, c11817)) {
                        length = iIntValue + 2;
                        length2 = length;
                    }
                }
                if (length == -1) {
                    length3 = this.f32973.length;
                    for (i = this.f32976 + 1; i < length3; i++) {
                        if (!C20032.m46183(this.f32973[i].f21948, c11816Mo2330)) {
                            if (C20032.m46183(this.f32973[i].f21949, c11817)) {
                                length = (i - this.f32976) + C16590.f50987.length;
                                break;
                            } else if (length2 == -1) {
                                length2 = (i - this.f32976) + C16590.f50987.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    m27268(length, 127, 128);
                } else if (length2 == -1) {
                    this.f32980.m30720writeByte(64);
                    m27270(c11816Mo2330);
                    m27270(c11817);
                    m27265(c7150);
                } else {
                    c11816 = C7150.f21944;
                    c11816Mo2330.getClass();
                    if (!c11816Mo2330.mo2329(c11816, c11816.mo2336()) && !C7150.f21942.equals(c11816Mo2330)) {
                        m27268(length2, 15, 0);
                        m27270(c11817);
                    } else {
                        m27268(length2, 63, 64);
                        m27270(c11817);
                        m27265(c7150);
                    }
                }
            } else {
                length = -1;
            }
            length2 = length;
            length = -1;
            if (length == -1) {
                length3 = this.f32973.length;
                while (i < length3) {
                    if (!C20032.m46183(this.f32973[i].f21948, c11816Mo2330)) {
                        if (C20032.m46183(this.f32973[i].f21949, c11817)) {
                            length = (i - this.f32976) + C16590.f50987.length;
                            break;
                        } else if (length2 == -1) {
                            length2 = (i - this.f32976) + C16590.f50987.length;
                        }
                    }
                }
            }
            if (length != -1) {
                m27268(length, 127, 128);
            } else if (length2 == -1) {
                this.f32980.m30720writeByte(64);
                m27270(c11816Mo2330);
                m27270(c11817);
                m27265(c7150);
            } else {
                c11816 = C7150.f21944;
                c11816Mo2330.getClass();
                if (!c11816Mo2330.mo2329(c11816, c11816.mo2336())) {
                    m27268(length2, 63, 64);
                    m27270(c11817);
                    m27265(c7150);
                } else {
                    m27268(length2, 63, 64);
                    m27270(c11817);
                    m27265(c7150);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27268(int i, int i2, int i3) {
        C12521 c12521 = this.f32980;
        if (i < i2) {
            c12521.m30720writeByte(i | i3);
            return;
        }
        c12521.m30720writeByte(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c12521.m30720writeByte(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c12521.m30720writeByte(i4);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27270(C11816 c11816) {
        C22940.m51059().getClass();
        int iM51058 = C22940.m51058(c11816);
        int iMo2336 = c11816.mo2336();
        C12521 c12521 = this.f32980;
        if (iM51058 < iMo2336) {
            C12521 c12522 = new C12521();
            C22940.m51059().getClass();
            C22940.m51060(c11816, c12522);
            C11816 c11816M30719 = c12522.m30719();
            m27268(c11816M30719.mo2336(), 127, 128);
            c12521.m30710(c11816M30719);
            return;
        }
        m27268(c11816.mo2336(), 127, 0);
        c12521.m30710(c11816);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27267(int i) {
        int iMin = Math.min(i, 16384);
        int i2 = this.f32978;
        if (i2 == iMin) {
            return;
        }
        if (iMin < i2) {
            this.f32974 = Math.min(this.f32974, iMin);
        }
        this.f32977 = true;
        this.f32978 = iMin;
        int i3 = this.f32975;
        if (iMin < i3) {
            if (iMin == 0) {
                Arrays.fill(this.f32973, (Object) null);
                this.f32976 = this.f32973.length - 1;
                this.f32979 = 0;
                this.f32975 = 0;
                return;
            }
            m27266(i3 - iMin);
        }
    }
}
