package l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C14321 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long[] f43194;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public ArrayList f43196;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f43197;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f43199;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList f43202 = new ArrayList();

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f43203 = new ArrayList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f43198 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f43195 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f43200 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f43201 = false;

    public C14321(int i) {
        this.f43199 = i;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34191(int i, int i2) {
        this.f43195++;
        int iMax = Math.max(i, 0);
        int iMin = Math.min(i2, 65535);
        if (iMax <= iMin) {
            int i3 = iMin < 128 ? 2 : 1024;
            long[] jArr = this.f43194;
            if (jArr == null) {
                this.f43194 = new long[i3];
            } else if (jArr.length < i3 || this.f43197) {
                this.f43194 = Arrays.copyOf(jArr, Math.max(jArr.length, i3));
                this.f43197 = false;
            }
            int i4 = iMax >>> 6;
            int i5 = iMin >>> 6;
            long j = (-1) << iMax;
            long j2 = (-1) >>> (63 - (iMin & 63));
            if (i4 == i5) {
                long[] jArr2 = this.f43194;
                jArr2[i4] = jArr2[i4] | (j & j2);
            } else {
                long[] jArr3 = this.f43194;
                jArr3[i4] = j | jArr3[i4];
                Arrays.fill(jArr3, i4 + 1, i5, -1L);
                long[] jArr4 = this.f43194;
                jArr4[i5] = jArr4[i5] | j2;
            }
            this.f43200 = Math.max(this.f43200, iMin);
            if (iMax <= 57343 && iMin >= 55296) {
                this.f43201 = true;
            }
        }
        if (i2 >= 65536) {
            this.f43202.add(new int[]{Math.max(i, 65536), i2});
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34190(int i) {
        int i2 = this.f43199;
        if ((i2 & 2) == 0) {
            m34191(i, i);
            return;
        }
        if ((i2 & 64) != 0) {
            int iM10356 = C3395.m10356(i);
            m34191(iM10356, iM10356);
        } else {
            if (C22165.m49800(i)) {
                i = C22165.m49804(i);
            }
            m34191(i, i);
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34194(int i, int i2) {
        int i3 = this.f43199;
        if ((i3 & 2) == 0) {
            m34191(i, i2);
            return;
        }
        if ((i3 & 64) != 0) {
            if (this.f43196 == null) {
                this.f43196 = new ArrayList();
            }
            this.f43196.add(new int[]{i, i2});
            if (this.f43201 || i > 57343 || i2 < 55296) {
                return;
            }
            this.f43201 = true;
            return;
        }
        int iMax = Math.max(i, 65);
        int iMin = Math.min(i2, 90);
        if (iMax > iMin) {
            if (i <= i2) {
                m34191(i, i2);
            }
        } else {
            if (i < iMax) {
                m34191(i, iMax - 1);
            }
            m34191(C22165.m49804(iMax), C22165.m49804(iMin));
            if (iMin < i2) {
                m34191(iMin + 1, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34192(InterfaceC10795 interfaceC10795) {
        this.f43203.add(interfaceC10795);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34193(boolean z) {
        this.f43198 = z;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m34195() {
        if (this.f43195 != 0 || !this.f43203.isEmpty()) {
            return false;
        }
        ArrayList arrayList = this.f43196;
        return arrayList == null || arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC10795 m34189() {
        long[] jArrCopyOf;
        InterfaceC10795 c18556;
        InterfaceC10795 c14881;
        InterfaceC10795 interfaceC10795Mo2466;
        long[] jArrCopyOf2;
        int[] iArrM34188;
        ArrayList arrayList = this.f43196;
        ArrayList<InterfaceC10795> arrayList2 = this.f43203;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2.add(C13491.m32523(this.f43196, this.f43201));
        }
        if (this.f43195 == 0 && arrayList2.isEmpty()) {
            if (this.f43198) {
                return new C16438();
            }
            return new C17850();
        }
        if (this.f43195 == 0) {
            InterfaceC10795 interfaceC10795Negate = this.f43198 ? ((InterfaceC10795) arrayList2.get(0)).negate() : (InterfaceC10795) arrayList2.get(0);
            for (int i = 1; i < arrayList2.size(); i++) {
                interfaceC10795Negate = this.f43198 ? interfaceC10795Negate.mo2464(((InterfaceC10795) arrayList2.get(i)).negate()) : interfaceC10795Negate.mo2466((InterfaceC10795) arrayList2.get(i));
            }
            return interfaceC10795Negate;
        }
        if (this.f43194 == null) {
            this.f43194 = new long[1024];
        }
        if (!this.f43202.isEmpty()) {
            if (this.f43198) {
                long[] jArr = this.f43194;
                jArrCopyOf2 = new long[jArr.length];
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jArrCopyOf2[i2] = ~jArr[i2];
                }
                iArrM34188 = m34188();
            } else {
                jArrCopyOf2 = Arrays.copyOf(this.f43194, 1024);
                iArrM34188 = m34188();
            }
            c14881 = new C18556(jArrCopyOf2, iArrM34188, this.f43198);
        } else {
            boolean z = this.f43201;
            int i3 = this.f43199;
            if (z || this.f43198) {
                if (!this.f43198) {
                    jArrCopyOf = Arrays.copyOf(this.f43194, 1024);
                } else {
                    long[] jArr2 = this.f43194;
                    jArrCopyOf = new long[jArr2.length];
                    for (int i4 = 0; i4 < jArr2.length; i4++) {
                        jArrCopyOf[i4] = ~jArr2[i4];
                    }
                }
                if ((i3 & 2) == 0) {
                    c18556 = new C18556(jArrCopyOf, new int[0], this.f43198);
                } else if ((i3 & 64) != 0) {
                    c18556 = new C11376(jArrCopyOf, this.f43198);
                } else {
                    c18556 = new C19116(jArrCopyOf, this.f43198);
                }
                c14881 = c18556;
            } else {
                long[] jArr3 = this.f43194;
                this.f43197 = true;
                if ((i3 & 2) == 0) {
                    c14881 = new C14881(jArr3);
                } else if ((i3 & 64) != 0) {
                    c14881 = new C9965(jArr3);
                } else {
                    c14881 = new C18410(jArr3);
                }
            }
        }
        for (InterfaceC10795 interfaceC10795 : arrayList2) {
            if (this.f43198) {
                interfaceC10795Mo2466 = c14881.mo2464(interfaceC10795.negate());
            } else {
                interfaceC10795Mo2466 = c14881.mo2466(interfaceC10795);
            }
            c14881 = interfaceC10795Mo2466;
        }
        return c14881;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private int[] m34188() {
        ArrayList arrayList = this.f43202;
        if (arrayList.isEmpty()) {
            return new int[0];
        }
        C6083.sort(arrayList, new C17144());
        ArrayList arrayList2 = new ArrayList();
        int[] iArr = (int[]) ((int[]) arrayList.get(0)).clone();
        for (int i = 1; i < arrayList.size(); i++) {
            int[] iArr2 = (int[]) arrayList.get(i);
            int i2 = iArr2[0];
            int i3 = iArr[1];
            if (i2 <= i3 + 1) {
                iArr[1] = Math.max(i3, iArr2[1]);
            } else {
                arrayList2.add(iArr);
                iArr = (int[]) iArr2.clone();
            }
        }
        arrayList2.add(iArr);
        int[] iArr3 = new int[arrayList2.size() * 2];
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            int i5 = i4 * 2;
            iArr3[i5] = ((int[]) arrayList2.get(i4))[0];
            iArr3[i5 + 1] = ((int[]) arrayList2.get(i4))[1];
        }
        return iArr3;
    }
}
