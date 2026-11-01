package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۧۧ֡, reason: contains not printable characters */
/* JADX INFO: compiled from: 04FP */
/* JADX INFO: loaded from: classes3.dex */
public final class C12772 {

    /* JADX INFO: renamed from: ܽ */
    public boolean f35969;

    /* JADX INFO: renamed from: ᩻ */
    public final C14268 f35972;

    /* JADX INFO: renamed from: ۜ */
    public int f35966 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ֫ */
    public C9163[] f35965 = new C9163[8];

    /* JADX INFO: renamed from: ܳ */
    public int f35968 = 7;

    /* JADX INFO: renamed from: ᩳ */
    public int f35971 = 0;

    /* JADX INFO: renamed from: ۧ */
    public int f35967 = 0;

    /* JADX INFO: renamed from: ܿ */
    public int f35970 = 4096;

    public C12772(C14268 c14268) {
        this.f35972 = c14268;
    }

    /* JADX INFO: renamed from: ۧ */
    private void m29326(int i) {
        int i2;
        if (i > 0) {
            int length = this.f35965.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f35968;
                if (length < i2 || i <= 0) {
                    break;
                }
                int i4 = this.f35965[length].f24826;
                i -= i4;
                this.f35967 -= i4;
                this.f35971--;
                i3++;
                length--;
            }
            C9163[] c9163Arr = this.f35965;
            int i5 = i2 + 1;
            System.arraycopy(c9163Arr, i5, c9163Arr, i5 + i3, this.f35971);
            C9163[] c9163Arr2 = this.f35965;
            int i6 = this.f35968 + 1;
            Arrays.fill(c9163Arr2, i6, i6 + i3, (Object) null);
            this.f35968 += i3;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m29325(C9163 c9163) {
        int i = c9163.f24826;
        int i2 = this.f35970;
        if (i > i2) {
            Arrays.fill(this.f35965, (Object) null);
            this.f35968 = this.f35965.length - 1;
            this.f35971 = 0;
            this.f35967 = 0;
            return;
        }
        m29326((this.f35967 + i) - i2);
        int i3 = this.f35971 + 1;
        C9163[] c9163Arr = this.f35965;
        if (i3 > c9163Arr.length) {
            C9163[] c9163Arr2 = new C9163[c9163Arr.length * 2];
            System.arraycopy(c9163Arr, 0, c9163Arr2, c9163Arr.length, c9163Arr.length);
            this.f35968 = this.f35965.length - 1;
            this.f35965 = c9163Arr2;
        }
        int i4 = this.f35968;
        this.f35968 = i4 - 1;
        this.f35965[i4] = c9163;
        this.f35971++;
        this.f35967 += i;
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
    /* JADX INFO: renamed from: ֫ */
    public final void m29329(ArrayList arrayList) {
        int length;
        int length2;
        C13598 c13598;
        int i;
        int length3;
        if (this.f35969) {
            int i2 = this.f35966;
            if (i2 < this.f35970) {
                m29328(i2, 31, 32);
            }
            this.f35969 = false;
            this.f35966 = Integer.MAX_VALUE;
            m29328(this.f35970, 31, 32);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C9163 c9163 = (C9163) arrayList.get(i3);
            C13598 c13598Mo4701 = c9163.f24827.mo4701();
            C13598 c13599 = c9163.f24828;
            Integer num = (Integer) C18135.f54163.get(c13598Mo4701);
            if (num != null) {
                int iIntValue = num.intValue();
                length = iIntValue + 1;
                if (length > 1 && length < 8) {
                    C9163[] c9163Arr = C18135.f54164;
                    if (C21407.m48499(c9163Arr[iIntValue].f24828, c13599)) {
                        length2 = length;
                    } else if (C21407.m48499(c9163Arr[length].f24828, c13599)) {
                        length = iIntValue + 2;
                        length2 = length;
                    }
                }
                if (length == -1) {
                    length3 = this.f35965.length;
                    for (i = this.f35968 + 1; i < length3; i++) {
                        if (!C21407.m48499(this.f35965[i].f24827, c13598Mo4701)) {
                            if (C21407.m48499(this.f35965[i].f24828, c13599)) {
                                length = (i - this.f35968) + C18135.f54164.length;
                                break;
                            } else if (length2 == -1) {
                                length2 = (i - this.f35968) + C18135.f54164.length;
                            }
                        }
                    }
                }
                if (length != -1) {
                    m29328(length, 127, 128);
                } else if (length2 == -1) {
                    this.f35972.m56480writeByte(64);
                    m29330(c13598Mo4701);
                    m29330(c13599);
                    m29325(c9163);
                } else {
                    c13598 = C9163.f24823;
                    c13598Mo4701.getClass();
                    if (!c13598Mo4701.mo4700(c13598, c13598.mo4707()) && !C9163.f24821.equals(c13598Mo4701)) {
                        m29328(length2, 15, 0);
                        m29330(c13599);
                    } else {
                        m29328(length2, 63, 64);
                        m29330(c13599);
                        m29325(c9163);
                    }
                }
            } else {
                length = -1;
            }
            length2 = length;
            length = -1;
            if (length == -1) {
                length3 = this.f35965.length;
                while (i < length3) {
                    if (!C21407.m48499(this.f35965[i].f24827, c13598Mo4701)) {
                        if (C21407.m48499(this.f35965[i].f24828, c13599)) {
                            length = (i - this.f35968) + C18135.f54164.length;
                            break;
                        } else if (length2 == -1) {
                            length2 = (i - this.f35968) + C18135.f54164.length;
                        }
                    }
                }
            }
            if (length != -1) {
                m29328(length, 127, 128);
            } else if (length2 == -1) {
                this.f35972.m56480writeByte(64);
                m29330(c13598Mo4701);
                m29330(c13599);
                m29325(c9163);
            } else {
                c13598 = C9163.f24823;
                c13598Mo4701.getClass();
                if (!c13598Mo4701.mo4700(c13598, c13598.mo4707())) {
                    m29328(length2, 63, 64);
                    m29330(c13599);
                    m29325(c9163);
                } else {
                    m29328(length2, 63, 64);
                    m29330(c13599);
                    m29325(c9163);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29328(int i, int i2, int i3) {
        C14268 c14268 = this.f35972;
        if (i < i2) {
            c14268.m56480writeByte(i | i3);
            return;
        }
        c14268.m56480writeByte(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            c14268.m56480writeByte(128 | (i4 & 127));
            i4 >>>= 7;
        }
        c14268.m56480writeByte(i4);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29330(C13598 c13598) {
        C24170.m53450().getClass();
        int iM53449 = C24170.m53449(c13598);
        int iMo4707 = c13598.mo4707();
        C14268 c14268 = this.f35972;
        if (iM53449 < iMo4707) {
            C14268 c14269 = new C14268();
            C24170.m53450().getClass();
            C24170.m53451(c13598, c14269);
            C13598 c13598M32793 = c14269.m32793();
            m29328(c13598M32793.mo4707(), 127, 128);
            c14268.m32784(c13598M32793);
            return;
        }
        m29328(c13598.mo4707(), 127, 0);
        c14268.m32784(c13598);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29327(int i) {
        int iMin = Math.min(i, 16384);
        int i2 = this.f35970;
        if (i2 == iMin) {
            return;
        }
        if (iMin < i2) {
            this.f35966 = Math.min(this.f35966, iMin);
        }
        this.f35969 = true;
        this.f35970 = iMin;
        int i3 = this.f35967;
        if (iMin < i3) {
            if (iMin == 0) {
                Arrays.fill(this.f35965, (Object) null);
                this.f35968 = this.f35965.length - 1;
                this.f35971 = 0;
                this.f35967 = 0;
                return;
            }
            m29326(i3 - iMin);
        }
    }
}
