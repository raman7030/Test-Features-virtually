package p067l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: l.ܺᩴܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6PB */
/* JADX INFO: loaded from: classes4.dex */
public final class C17693 {

    /* JADX INFO: renamed from: ۢ */
    public final int f52837;

    /* JADX INFO: renamed from: ۧ */
    public final boolean f52838;

    /* JADX INFO: renamed from: ܳ */
    public boolean f52839;

    /* JADX INFO: renamed from: ܽ */
    public int[] f52840;

    /* JADX INFO: renamed from: ܿ */
    public boolean f52841;

    /* JADX INFO: renamed from: ᩷ */
    public final boolean[] f52843;

    /* JADX INFO: renamed from: ᩻ */
    public final ArrayList f52844 = new ArrayList();

    /* JADX INFO: renamed from: ۜ */
    public final ArrayList f52836 = new ArrayList();

    /* JADX INFO: renamed from: ֫ */
    public final IdentityHashMap f52835 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩳ */
    public int[] f52842 = new int[128];

    public C17693(int i, boolean z) {
        this.f52837 = i;
        this.f52838 = z;
        this.f52843 = new boolean[i];
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m40229(C7933 c7933) {
        if (c7933 == null) {
            throw new UnsupportedOperationException("Regex program encountered a missing node");
        }
        IdentityHashMap identityHashMap = this.f52835;
        Integer num = (Integer) identityHashMap.get(c7933);
        if (num != null) {
            return num.intValue();
        }
        ArrayList arrayList = this.f52844;
        if (arrayList.size() >= 268435454) {
            throw new UnsupportedOperationException("Regex program is too large");
        }
        int size = arrayList.size() * 8;
        arrayList.add(c7933);
        identityHashMap.put(c7933, Integer.valueOf(size));
        int i = size + 8;
        int[] iArr = this.f52842;
        if (i > iArr.length) {
            this.f52842 = Arrays.copyOf(this.f52842, (int) Math.min(2147483639L, Math.max(i, ((long) iArr.length) * 2)));
        }
        this.f52842[size + 1] = -1;
        return size;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m40230(C7933 c7933, int i) {
        Class<?> cls = c7933.getClass();
        if (cls == C16649.class) {
            this.f52842[i] = 0;
            return;
        }
        if (c7933 == C16057.f47257) {
            this.f52842[i] = 23;
            return;
        }
        if (cls == C21345.class) {
            this.f52842[i] = 24;
            return;
        }
        if (cls == C15308.class) {
            m40227(i, c7933, ((C15308) c7933).f43691, 0, 0, 0, false);
            return;
        }
        if (cls == C11957.class) {
            m40227(i, c7933, ((C11957) c7933).f33339, 1, 0, 0, false);
            return;
        }
        if (cls == C3100.class || cls == C9806.class || cls == C13298.class || cls == C24026.class) {
            C3100 c3100 = (C3100) c7933;
            m40227(i, c7933, c3100.f5628, cls == C3100.class || cls == C9806.class ? 2 : 3, c3100.f5630, c3100.f5629, cls == C9806.class || cls == C24026.class);
            return;
        }
        if (cls == C12509.class) {
            C12509 c12509 = (C12509) c7933;
            if (c12509.f35057 == EnumC3791.INDEPENDENT) {
                m40227(i, c7933, c12509.f35056, 4, 0, 0, false);
                return;
            }
        }
        if (cls == C12509.class) {
            C12509 c125010 = (C12509) c7933;
            m40228(i, c7933, c125010.f35056, new C10694(c125010.f35057, 0, 1, -1, 0, true, false));
            return;
        }
        if (cls == C22016.class) {
            C22016 c22016 = (C22016) c7933;
            m40228(i, c7933, c22016.f69297, new C10694(c22016.f69299, c22016.f69300, c22016.f69298, -1, 0, false, false));
            return;
        }
        if (cls == C2568.class) {
            C2568 c2568 = (C2568) c7933;
            int i2 = c2568.f4243;
            m40221(i2);
            this.f52843[i2] = true;
            m40228(i, c7933, c2568.f4238, new C10694(c2568.f4237, c2568.f4241, c2568.f4242, c2568.f4243, c2568.f4239, false, c2568.f4240));
            return;
        }
        if (cls == C2429.class) {
            m40223(i, 34, c7933.f20809);
            int[] iArr = this.f52842;
            iArr[i + 2] = ((C2429) c7933).f3749;
            iArr[i + 3] = 0;
            return;
        }
        if (cls == C15170.class) {
            C15170 c15170 = (C15170) c7933;
            m40223(i, 34, c7933.f20809);
            int[] iArr2 = this.f52842;
            iArr2[i + 2] = c15170.f43281;
            iArr2[i + 3] = c15170.f43280 ? 2 : 1;
            return;
        }
        if (cls == C23356.class) {
            m40223(i, 35, c7933.f20809);
            return;
        }
        if (cls == C18740.class) {
            m40223(i, 36, c7933.f20809);
            return;
        }
        if (cls == C20675.class) {
            m40223(i, 37, c7933.f20809);
            return;
        }
        if (cls == C19411.class) {
            m40223(i, 39, c7933.f20809);
            return;
        }
        boolean z = this.f52838;
        if (cls == C7795.class) {
            C7795 c7795 = (C7795) c7933;
            Object objM34404 = z ? null : C15031.m34404(c7795);
            if (objM34404 != null) {
                int[] iArr3 = this.f52842;
                iArr3[i] = 17;
                iArr3[i + 2] = m40220(objM34404);
                return;
            } else {
                m40223(i, 15, c7933.f20809);
                this.f52842[i + 2] = m40220(new C5644(c7795.f20438, c7795.f20439));
                return;
            }
        }
        if (cls == C7124.class) {
            m40226(i, c7933, 0, false);
            this.f52841 = true;
            return;
        }
        if (cls == C4581.class) {
            m40226(i, c7933, 1, false);
            return;
        }
        if (cls == C9136.class) {
            m40226(i, c7933, 2, false);
            return;
        }
        if (cls == C9156.class) {
            m40226(i, c7933, 3, false);
            return;
        }
        if (cls == C11287.class) {
            m40226(i, c7933, 4, ((C11287) c7933).f31451);
            return;
        }
        if (cls == C3988.class) {
            m40226(i, c7933, 5, ((C3988) c7933).f8672);
            return;
        }
        if (cls == C9945.class) {
            m40226(i, c7933, 6, false);
            return;
        }
        if (cls == C5251.class) {
            m40223(i, 42, c7933.f20809);
            this.f52842[i + 2] = m40220(C16057.m36558(c7933));
            return;
        }
        if (cls == C21207.class) {
            C24697 c24697 = (C24697) c7933;
            m40223(i, 1, c24697.f20809);
            this.f52842[i + 2] = m40220(c24697.f78179);
            return;
        }
        if (cls == C13968.class) {
            m40223(i, 38, c7933.f20809);
            this.f52842[i + 2] = m40220(C16057.m36561(c7933));
            return;
        }
        if (cls == C24697.class || cls == C10616.class || cls == C12706.class || cls == C4442.class) {
            C24697 c24698 = (C24697) c7933;
            m40223(i, 2, c24698.f20809);
            this.f52842[i + 2] = m40220(c24698.f78179);
            return;
        }
        if (cls == C11168.class) {
            m40223(i, 3, c7933.f20809);
            this.f52842[i + 2] = m40220(((C11168) c7933).f10016.clone());
            return;
        }
        if (cls == C10497.class) {
            m40222(i, 28, (C4462) c7933, 1);
            return;
        }
        if (cls == C19885.class) {
            m40222(i, 29, (C4462) c7933, 2);
            return;
        }
        if (cls == C5803.class) {
            m40222(i, 30, (C4462) c7933, 3);
            return;
        }
        if (cls == C17201.class) {
            m40222(i, 31, (C4462) c7933, 4);
            return;
        }
        if (cls == C20556.class) {
            m40222(i, 32, (C4462) c7933, 5);
            return;
        }
        if (cls == C6454.class) {
            m40224(i, 4, (C8604) c7933);
            return;
        }
        if (cls == C8604.class || cls == C17320.class || cls == C18069.class) {
            m40224(i, 5, (C8604) c7933);
            return;
        }
        if (cls == C5783.class) {
            m40224(i, 33, (C8604) c7933);
            return;
        }
        if (cls == C13160.class) {
            C13160 c13160 = (C13160) c7933;
            int i3 = c13160.f36987;
            int[] iArr4 = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                C7933 c7934 = c13160.f36986[i4];
                if (c7934 == null) {
                    c7934 = c13160.f36988.f20809;
                }
                iArr4[i4] = m40229(c7934);
            }
            int[] iArr5 = this.f52842;
            iArr5[i] = 6;
            iArr5[i + 2] = m40220(iArr4);
            return;
        }
        if (cls == C23888.class) {
            m40223(i, 11, c7933.f20809);
            return;
        }
        if (cls == C7263.class || cls == C14500.class) {
            C7263 c7263 = (C7263) c7933;
            m40223(i, c7263.f18932 ? 7 : 11, c7933.f20809);
            if (c7263.f18932) {
                int i5 = c7263.f18931;
                m40221(i5);
                this.f52842[i + 2] = i5;
                return;
            }
            return;
        }
        if (cls == C3239.class) {
            C3239 c3239 = (C3239) c7933;
            m40223(i, c3239.f6279 ? 8 : 11, c7933.f20809);
            if (c3239.f6279) {
                int i6 = c3239.f6278;
                m40221(i6);
                this.f52842[i + 2] = i6;
                this.f52842[i + 3] = c3239.f6277;
                return;
            }
            return;
        }
        if (cls != C9274.class) {
            if (cls == C22686.class) {
                m40225(i, 27, (C14638) c7933);
                return;
            } else {
                if (cls == C14638.class) {
                    m40225(i, 10, (C14638) c7933);
                    return;
                }
                throw new UnsupportedOperationException("Regex program does not support node: ".concat(cls.getName()));
            }
        }
        C14638 c14638 = ((C9274) c7933).f25224;
        if (c14638.getClass() == C22686.class) {
            m40225(i, 26, c14638);
            return;
        }
        if (z) {
            m40225(i, 9, c14638);
            return;
        }
        Object objM28436 = C12350.m28436(c14638);
        if (objM28436 != null) {
            int[] iArr6 = this.f52842;
            iArr6[i] = 21;
            iArr6[i + 2] = m40220(objM28436);
            return;
        }
        Object objM43680 = C19194.m43680(c14638);
        if (objM43680 == null) {
            Object objM13499 = C6000.m13499(c14638);
            if (objM13499 == null) {
                m40225(i, 9, c14638);
                return;
            }
            int[] iArr7 = this.f52842;
            iArr7[i] = 20;
            iArr7[i + 2] = m40220(objM13499);
            return;
        }
        m40223(i, 14, c14638.f20809);
        this.f52842[i + 2] = m40220(objM43680);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40228(int i, C7933 c7933, C7933 c7934, C10694 c10694) {
        m40223(i, 25, c7933.f20809);
        int iM40229 = m40229(c7934);
        this.f52842[i + 2] = m40220(c10694);
        this.f52842[i + 3] = iM40229;
        this.f52839 = true;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40226(int i, C7933 c7933, int i2, boolean z) {
        m40223(i, 16, c7933.f20809);
        int[] iArr = this.f52842;
        iArr[i + 2] = i2;
        iArr[i + 3] = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40227(int i, C7933 c7933, C7933 c7934, int i2, int i3, int i4, boolean z) {
        m40223(i, 22, c7933.f20809);
        this.f52842[i + 2] = i2;
        int iM40229 = m40229(c7934);
        int[] iArr = this.f52842;
        iArr[i + 3] = iM40229;
        iArr[i + 4] = i3;
        iArr[i + 5] = i4;
        iArr[i + 6] = z ? 1 : 0;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40222(int i, int i2, C4462 c4462, int i3) {
        m40223(i, i2, c4462.f20809);
        this.f52842[i + 2] = m40220(c4462.f10016.clone());
        this.f52842[i + 3] = i3;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40224(int i, int i2, C8604 c8604) {
        m40223(i, i2, c8604.f20809);
        this.f52842[i + 2] = m40220(c8604.f23121);
        this.f52842[i + 3] = c8604.f23120;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40225(int i, int i2, C14638 c14638) {
        if ((c14638.getClass() != C14638.class && c14638.getClass() != C22686.class) || c14638.f41782 < -1) {
            throw new UnsupportedOperationException("Regex program does not support this loop kind");
        }
        if (c14638.getClass() == C14638.class && c14638.f41782 >= 0) {
            i2 = i2 == 9 ? 18 : 19;
        }
        m40223(i, i2, c14638.f20809);
        int i3 = c14638.f41778;
        m40221(i3);
        this.f52842[i + 2] = i3;
        int i4 = c14638.f41777;
        m40221(i4);
        this.f52842[i + 3] = i4;
        int[] iArr = this.f52842;
        iArr[i + 4] = c14638.f41780;
        iArr[i + 5] = c14638.f41781;
        int iM40229 = m40229(c14638.f41779);
        int[] iArr2 = this.f52842;
        iArr2[i + 6] = iM40229;
        int i5 = c14638.f41782;
        if (i5 >= 0) {
            iArr2[i + 7] = i5;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40221(int i) {
        if (i < 0 || i >= this.f52837) {
            throw new UnsupportedOperationException("Regex program encountered an invalid local register");
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private int m40220(Object obj) {
        ArrayList arrayList = this.f52836;
        int size = arrayList.size();
        arrayList.add(obj);
        return size;
    }

    /* JADX INFO: renamed from: ֫ */
    private void m40223(int i, int i2, C7933 c7933) {
        int iM40229 = m40229(c7933);
        int[] iArr = this.f52842;
        iArr[i] = i2;
        iArr[i + 1] = iM40229;
    }
}
