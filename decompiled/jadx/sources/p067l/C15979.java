package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܳۚܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C15979 {

    /* JADX INFO: renamed from: ֫ */
    public long[] f46286;

    /* JADX INFO: renamed from: ۢ */
    public ArrayList f46288;

    /* JADX INFO: renamed from: ۧ */
    public boolean f46289;

    /* JADX INFO: renamed from: ܽ */
    public final int f46291;

    /* JADX INFO: renamed from: ᩷ */
    public final ArrayList f46294 = new ArrayList();

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f46295 = new ArrayList();

    /* JADX INFO: renamed from: ܳ */
    public boolean f46290 = false;

    /* JADX INFO: renamed from: ۜ */
    public int f46287 = 0;

    /* JADX INFO: renamed from: ܿ */
    public int f46292 = -1;

    /* JADX INFO: renamed from: ᩳ */
    public boolean f46293 = false;

    public C15979(int i) {
        this.f46291 = i;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36324(int i, int i2) {
        this.f46287++;
        int iMax = Math.max(i, 0);
        int iMin = Math.min(i2, 65535);
        if (iMax <= iMin) {
            int i3 = iMin < 128 ? 2 : 1024;
            long[] jArr = this.f46286;
            if (jArr == null) {
                this.f46286 = new long[i3];
            } else if (jArr.length < i3 || this.f46289) {
                this.f46286 = Arrays.copyOf(jArr, Math.max(jArr.length, i3));
                this.f46289 = false;
            }
            int i4 = iMax >>> 6;
            int i5 = iMin >>> 6;
            long j = (-1) << iMax;
            long j2 = (-1) >>> (63 - (iMin & 63));
            if (i4 == i5) {
                long[] jArr2 = this.f46286;
                jArr2[i4] = jArr2[i4] | (j & j2);
            } else {
                long[] jArr3 = this.f46286;
                jArr3[i4] = j | jArr3[i4];
                Arrays.fill(jArr3, i4 + 1, i5, -1L);
                long[] jArr4 = this.f46286;
                jArr4[i5] = jArr4[i5] | j2;
            }
            this.f46292 = Math.max(this.f46292, iMin);
            if (iMax <= 57343 && iMin >= 55296) {
                this.f46293 = true;
            }
        }
        if (i2 >= 65536) {
            this.f46294.add(new int[]{Math.max(i, 65536), i2});
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36323(int i) {
        int i2 = this.f46291;
        if ((i2 & 2) == 0) {
            m36324(i, i);
            return;
        }
        if ((i2 & 64) != 0) {
            int iM12395 = C5595.m12395(i);
            m36324(iM12395, iM12395);
        } else {
            if (C23434.m52138(i)) {
                i = C23434.m52142(i);
            }
            m36324(i, i);
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m36327(int i, int i2) {
        int i3 = this.f46291;
        if ((i3 & 2) == 0) {
            m36324(i, i2);
            return;
        }
        if ((i3 & 64) != 0) {
            if (this.f46288 == null) {
                this.f46288 = new ArrayList();
            }
            this.f46288.add(new int[]{i, i2});
            if (this.f46293 || i > 57343 || i2 < 55296) {
                return;
            }
            this.f46293 = true;
            return;
        }
        int iMax = Math.max(i, 65);
        int iMin = Math.min(i2, 90);
        if (iMax > iMin) {
            if (i <= i2) {
                m36324(i, i2);
            }
        } else {
            if (i < iMax) {
                m36324(i, iMax - 1);
            }
            m36324(C23434.m52142(iMax), C23434.m52142(iMin));
            if (iMin < i2) {
                m36324(iMin + 1, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36325(InterfaceC12628 interfaceC12628) {
        this.f46295.add(interfaceC12628);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m36326(boolean z) {
        this.f46290 = z;
    }

    /* JADX INFO: renamed from: ۧ */
    public final boolean m36328() {
        if (this.f46287 != 0 || !this.f46295.isEmpty()) {
            return false;
        }
        ArrayList arrayList = this.f46288;
        return arrayList == null || arrayList.isEmpty();
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC12628 m36322() {
        long[] jArrCopyOf;
        InterfaceC12628 c20004;
        InterfaceC12628 c16511;
        InterfaceC12628 interfaceC12628Mo4822;
        long[] jArrCopyOf2;
        int[] iArrM36321;
        ArrayList arrayList = this.f46288;
        ArrayList<InterfaceC12628> arrayList2 = this.f46295;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList2.add(C15190.m34625(this.f46288, this.f46293));
        }
        if (this.f46287 == 0 && arrayList2.isEmpty()) {
            if (this.f46290) {
                return new C17991();
            }
            return new C19333();
        }
        if (this.f46287 == 0) {
            InterfaceC12628 interfaceC12628Negate = this.f46290 ? ((InterfaceC12628) arrayList2.get(0)).negate() : (InterfaceC12628) arrayList2.get(0);
            for (int i = 1; i < arrayList2.size(); i++) {
                interfaceC12628Negate = this.f46290 ? interfaceC12628Negate.mo4820(((InterfaceC12628) arrayList2.get(i)).negate()) : interfaceC12628Negate.mo4822((InterfaceC12628) arrayList2.get(i));
            }
            return interfaceC12628Negate;
        }
        if (this.f46286 == null) {
            this.f46286 = new long[1024];
        }
        if (!this.f46294.isEmpty()) {
            if (this.f46290) {
                long[] jArr = this.f46286;
                jArrCopyOf2 = new long[jArr.length];
                for (int i2 = 0; i2 < jArr.length; i2++) {
                    jArrCopyOf2[i2] = ~jArr[i2];
                }
                iArrM36321 = m36321();
            } else {
                jArrCopyOf2 = Arrays.copyOf(this.f46286, 1024);
                iArrM36321 = m36321();
            }
            c16511 = new C20004(jArrCopyOf2, iArrM36321, this.f46290);
        } else {
            boolean z = this.f46293;
            int i3 = this.f46291;
            if (z || this.f46290) {
                if (!this.f46290) {
                    jArrCopyOf = Arrays.copyOf(this.f46286, 1024);
                } else {
                    long[] jArr2 = this.f46286;
                    jArrCopyOf = new long[jArr2.length];
                    for (int i4 = 0; i4 < jArr2.length; i4++) {
                        jArrCopyOf[i4] = ~jArr2[i4];
                    }
                }
                if ((i3 & 2) == 0) {
                    c20004 = new C20004(jArrCopyOf, new int[0], this.f46290);
                } else if ((i3 & 64) != 0) {
                    c20004 = new C13180(jArrCopyOf, this.f46290);
                } else {
                    c20004 = new C20536(jArrCopyOf, this.f46290);
                }
                c16511 = c20004;
            } else {
                long[] jArr3 = this.f46286;
                this.f46289 = true;
                if ((i3 & 2) == 0) {
                    c16511 = new C16511(jArr3);
                } else if ((i3 & 64) != 0) {
                    c16511 = new C11839(jArr3);
                } else {
                    c16511 = new C19865(jArr3);
                }
            }
        }
        for (InterfaceC12628 interfaceC12628 : arrayList2) {
            if (this.f46290) {
                interfaceC12628Mo4822 = c16511.mo4820(interfaceC12628.negate());
            } else {
                interfaceC12628Mo4822 = c16511.mo4822(interfaceC12628);
            }
            c16511 = interfaceC12628Mo4822;
        }
        return c16511;
    }

    /* JADX INFO: renamed from: ܽ */
    private int[] m36321() {
        ArrayList arrayList = this.f46294;
        if (arrayList.isEmpty()) {
            return new int[0];
        }
        C8150.sort(arrayList, new C18662());
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
