package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܺᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6PB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16124 {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f49671;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f49672;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f49673;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int[] f49674;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f49675;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean[] f49677;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final ArrayList f49678 = new ArrayList();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f49670 = new ArrayList();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f49669 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int[] f49676 = new int[128];

    public C16124(int i, boolean z) {
        this.f49671 = i;
        this.f49672 = z;
        this.f49677 = new boolean[i];
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m38037(C5855 c5855) {
        if (c5855 == null) {
            throw new UnsupportedOperationException("Regex program encountered a missing node");
        }
        IdentityHashMap identityHashMap = this.f49669;
        Integer num = (Integer) identityHashMap.get(c5855);
        if (num != null) {
            return num.intValue();
        }
        ArrayList arrayList = this.f49678;
        if (arrayList.size() >= 268435454) {
            throw new UnsupportedOperationException("Regex program is too large");
        }
        int size = arrayList.size() * 8;
        arrayList.add(c5855);
        identityHashMap.put(c5855, Integer.valueOf(size));
        int i = size + 8;
        int[] iArr = this.f49676;
        if (i > iArr.length) {
            this.f49676 = Arrays.copyOf(this.f49676, (int) Math.min(2147483639L, Math.max(i, ((long) iArr.length) * 2)));
        }
        this.f49676[size + 1] = -1;
        return size;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m38038(C5855 c5855, int i) {
        Class<?> cls = c5855.getClass();
        if (cls == C15026.class) {
            this.f49676[i] = 0;
            return;
        }
        if (c5855 == C14403.f44164) {
            this.f49676[i] = 23;
            return;
        }
        if (cls == C19967.class) {
            this.f49676[i] = 24;
            return;
        }
        if (cls == C13615.class) {
            m38035(i, c5855, ((C13615) c5855).f40614, 0, 0, 0, false);
            return;
        }
        if (cls == C10089.class) {
            m38035(i, c5855, ((C10089) c5855).f30379, 1, 0, 0, false);
            return;
        }
        if (cls == C0770.class || cls == C7826.class || cls == C11500.class || cls == C22788.class) {
            C0770 c0770 = (C0770) c5855;
            m38035(i, c5855, c0770.f2856, cls == C0770.class || cls == C7826.class ? 2 : 3, c0770.f2858, c0770.f2857, cls == C7826.class || cls == C22788.class);
            return;
        }
        if (cls == C10670.class) {
            C10670 c10670 = (C10670) c5855;
            if (c10670.f32086 == EnumC1497.INDEPENDENT) {
                m38035(i, c5855, c10670.f32085, 4, 0, 0, false);
                return;
            }
        }
        if (cls == C10670.class) {
            C10670 c10671 = (C10670) c5855;
            m38036(i, c5855, c10671.f32085, new C8760(c10671.f32086, 0, 1, -1, 0, true, false));
            return;
        }
        if (cls == C20673.class) {
            C20673 c20673 = (C20673) c5855;
            m38036(i, c5855, c20673.f66615, new C8760(c20673.f66617, c20673.f66618, c20673.f66616, -1, 0, false, false));
            return;
        }
        if (cls == C0210.class) {
            C0210 c0210 = (C0210) c5855;
            int i2 = c0210.f1464;
            m38029(i2);
            this.f49677[i2] = true;
            m38036(i, c5855, c0210.f1459, new C8760(c0210.f1458, c0210.f1462, c0210.f1463, c0210.f1464, c0210.f1460, false, c0210.f1461));
            return;
        }
        if (cls == C0064.class) {
            m38031(i, 34, c5855.f17958);
            int[] iArr = this.f49676;
            iArr[i + 2] = ((C0064) c5855).f974;
            iArr[i + 3] = 0;
            return;
        }
        if (cls == C13470.class) {
            C13470 c13470 = (C13470) c5855;
            m38031(i, 34, c5855.f17958);
            int[] iArr2 = this.f49676;
            iArr2[i + 2] = c13470.f40211;
            iArr2[i + 3] = c13470.f40210 ? 2 : 1;
            return;
        }
        if (cls == C22083.class) {
            m38031(i, 35, c5855.f17958);
            return;
        }
        if (cls == C17226.class) {
            m38031(i, 36, c5855.f17958);
            return;
        }
        if (cls == C19262.class) {
            m38031(i, 37, c5855.f17958);
            return;
        }
        if (cls == C17932.class) {
            m38031(i, 39, c5855.f17958);
            return;
        }
        boolean z = this.f49672;
        if (cls == C5710.class) {
            C5710 c5710 = (C5710) c5855;
            Object objM32304 = z ? null : C13323.m32304(c5710);
            if (objM32304 != null) {
                int[] iArr3 = this.f49676;
                iArr3[i] = 17;
                iArr3[i + 2] = m38028(objM32304);
                return;
            } else {
                m38031(i, 15, c5855.f17958);
                this.f49676[i + 2] = m38028(new C3446(c5710.f17592, c5710.f17593));
                return;
            }
        }
        if (cls == C5004.class) {
            m38034(i, c5855, 0, false);
            this.f49675 = true;
            return;
        }
        if (cls == C2328.class) {
            m38034(i, c5855, 1, false);
            return;
        }
        if (cls == C7121.class) {
            m38034(i, c5855, 2, false);
            return;
        }
        if (cls == C7142.class) {
            m38034(i, c5855, 3, false);
            return;
        }
        if (cls == C9384.class) {
            m38034(i, c5855, 4, ((C9384) c5855).f28502);
            return;
        }
        if (cls == C1704.class) {
            m38034(i, c5855, 5, ((C1704) c5855).f5893);
            return;
        }
        if (cls == C7972.class) {
            m38034(i, c5855, 6, false);
            return;
        }
        if (cls == C3033.class) {
            m38031(i, 42, c5855.f17958);
            this.f49676[i + 2] = m38028(C14403.m34424(c5855));
            return;
        }
        if (cls == C19822.class) {
            C23494 c23494 = (C23494) c5855;
            m38031(i, 1, c23494.f17958);
            this.f49676[i + 2] = m38028(c23494.f75432);
            return;
        }
        if (cls == C12205.class) {
            m38031(i, 38, c5855.f17958);
            this.f49676[i + 2] = m38028(C14403.m34427(c5855));
            return;
        }
        if (cls == C23494.class || cls == C8678.class || cls == C10877.class || cls == C2182.class) {
            C23494 c23495 = (C23494) c5855;
            m38031(i, 2, c23495.f17958);
            this.f49676[i + 2] = m38028(c23495.f75432);
            return;
        }
        if (cls == C9259.class) {
            m38031(i, 3, c5855.f17958);
            this.f49676[i + 2] = m38028(((C9259) c5855).f7231.clone());
            return;
        }
        if (cls == C8553.class) {
            m38030(i, 28, (C2203) c5855, 1);
            return;
        }
        if (cls == C18431.class) {
            m38030(i, 29, (C2203) c5855, 2);
            return;
        }
        if (cls == C3614.class) {
            m38030(i, 30, (C2203) c5855, 3);
            return;
        }
        if (cls == C15607.class) {
            m38030(i, 31, (C2203) c5855, 4);
            return;
        }
        if (cls == C19137.class) {
            m38030(i, 32, (C2203) c5855, 5);
            return;
        }
        if (cls == C4299.class) {
            m38032(i, 4, (C6561) c5855);
            return;
        }
        if (cls == C6561.class || cls == C15732.class || cls == C16520.class) {
            m38032(i, 5, (C6561) c5855);
            return;
        }
        if (cls == C3593.class) {
            m38032(i, 33, (C6561) c5855);
            return;
        }
        if (cls == C11355.class) {
            C11355 c11355 = (C11355) c5855;
            int i3 = c11355.f33990;
            int[] iArr4 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                C5855 c5856 = c11355.f33989[i4];
                if (c5856 == null) {
                    c5856 = c11355.f33991.f17958;
                }
                iArr4[i4] = m38037(c5856);
            }
            int[] iArr5 = this.f49676;
            iArr5[i] = 6;
            iArr5[i + 2] = m38028(iArr4);
            return;
        }
        if (cls == C22643.class) {
            m38031(i, 11, c5855.f17958);
            return;
        }
        if (cls == C5150.class || cls == C12765.class) {
            C5150 c5150 = (C5150) c5855;
            m38031(i, c5150.f16093 ? 7 : 11, c5855.f17958);
            if (c5150.f16093) {
                int i5 = c5150.f16092;
                m38029(i5);
                this.f49676[i + 2] = i5;
                return;
            }
            return;
        }
        if (cls == C0916.class) {
            C0916 c0916 = (C0916) c5855;
            m38031(i, c0916.f3504 ? 8 : 11, c5855.f17958);
            if (c0916.f3504) {
                int i6 = c0916.f3503;
                m38029(i6);
                this.f49676[i + 2] = i6;
                this.f49676[i + 3] = c0916.f3502;
                return;
            }
            return;
        }
        if (cls != C7266.class) {
            if (cls == C21378.class) {
                m38033(i, 27, (C12910) c5855);
                return;
            } else {
                if (cls == C12910.class) {
                    m38033(i, 10, (C12910) c5855);
                    return;
                }
                throw new UnsupportedOperationException("Regex program does not support node: ".concat(cls.getName()));
            }
        }
        C12910 c12910 = ((C7266) c5855).f22335;
        if (c12910.getClass() == C21378.class) {
            m38033(i, 26, c12910);
            return;
        }
        if (z) {
            m38033(i, 9, c12910);
            return;
        }
        Object objM26403 = C10502.m26403(c12910);
        if (objM26403 != null) {
            int[] iArr6 = this.f49676;
            iArr6[i] = 21;
            iArr6[i + 2] = m38028(objM26403);
            return;
        }
        Object objM41434 = C17704.m41434(c12910);
        if (objM41434 == null) {
            Object objM11563 = C3821.m11563(c12910);
            if (objM11563 == null) {
                m38033(i, 9, c12910);
                return;
            }
            int[] iArr7 = this.f49676;
            iArr7[i] = 20;
            iArr7[i + 2] = m38028(objM11563);
            return;
        }
        m38031(i, 14, c12910.f17958);
        this.f49676[i + 2] = m38028(objM41434);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38036(int i, C5855 c5855, C5855 c5856, C8760 c8760) {
        m38031(i, 25, c5855.f17958);
        int iM38037 = m38037(c5856);
        this.f49676[i + 2] = m38028(c8760);
        this.f49676[i + 3] = iM38037;
        this.f49673 = true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38034(int i, C5855 c5855, int i2, boolean z) {
        m38031(i, 16, c5855.f17958);
        int[] iArr = this.f49676;
        iArr[i + 2] = i2;
        iArr[i + 3] = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38035(int i, C5855 c5855, C5855 c5856, int i2, int i3, int i4, boolean z) {
        m38031(i, 22, c5855.f17958);
        this.f49676[i + 2] = i2;
        int iM38037 = m38037(c5856);
        int[] iArr = this.f49676;
        iArr[i + 3] = iM38037;
        iArr[i + 4] = i3;
        iArr[i + 5] = i4;
        iArr[i + 6] = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38030(int i, int i2, C2203 c2203, int i3) {
        m38031(i, i2, c2203.f17958);
        this.f49676[i + 2] = m38028(c2203.f7231.clone());
        this.f49676[i + 3] = i3;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38032(int i, int i2, C6561 c6561) {
        m38031(i, i2, c6561.f17958);
        this.f49676[i + 2] = m38028(c6561.f20243);
        this.f49676[i + 3] = c6561.f20242;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38033(int i, int i2, C12910 c12910) {
        if ((c12910.getClass() != C12910.class && c12910.getClass() != C21378.class) || c12910.f38740 < -1) {
            throw new UnsupportedOperationException("Regex program does not support this loop kind");
        }
        if (c12910.getClass() == C12910.class && c12910.f38740 >= 0) {
            i2 = i2 == 9 ? 18 : 19;
        }
        m38031(i, i2, c12910.f17958);
        int i3 = c12910.f38736;
        m38029(i3);
        this.f49676[i + 2] = i3;
        int i4 = c12910.f38735;
        m38029(i4);
        this.f49676[i + 3] = i4;
        int[] iArr = this.f49676;
        iArr[i + 4] = c12910.f38738;
        iArr[i + 5] = c12910.f38739;
        int iM38037 = m38037(c12910.f38737);
        int[] iArr2 = this.f49676;
        iArr2[i + 6] = iM38037;
        int i5 = c12910.f38740;
        if (i5 >= 0) {
            iArr2[i + 7] = i5;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38029(int i) {
        if (i < 0 || i >= this.f49671) {
            throw new UnsupportedOperationException("Regex program encountered an invalid local register");
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private int m38028(Object obj) {
        ArrayList arrayList = this.f49670;
        int size = arrayList.size();
        arrayList.add(obj);
        return size;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m38031(int i, int i2, C5855 c5855) {
        int iM38037 = m38037(c5855);
        int[] iArr = this.f49676;
        iArr[i] = i2;
        iArr[i + 1] = iM38037;
    }
}
