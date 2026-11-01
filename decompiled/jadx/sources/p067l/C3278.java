package p067l;

/* JADX INFO: renamed from: l.֨ۜܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E998 */
/* JADX INFO: loaded from: classes.dex */
public class C3278 extends AbstractC22349 {

    /* JADX INFO: renamed from: ۬ۗۢ, reason: not valid java name and contains not printable characters */
    private static final short[] f81848;

    /* JADX INFO: renamed from: ۖ */
    public int f6377;

    /* JADX INFO: renamed from: ۘ */
    public int f6378;

    /* JADX INFO: renamed from: ۜ */
    public boolean f6379;

    /* JADX INFO: renamed from: ۡ */
    public int f6380;

    /* JADX INFO: renamed from: ۢ */
    public C22055[] f6381;

    /* JADX INFO: renamed from: ܳ */
    public final int f6382;

    /* JADX INFO: renamed from: ܺ */
    public int[] f6383;

    /* JADX INFO: renamed from: ܽ */
    public int f6384;

    /* JADX INFO: renamed from: ܿ */
    public final int f6385;

    /* JADX INFO: renamed from: ᩳ */
    public final C5290 f6386;

    /* JADX INFO: renamed from: ᩴ */
    public int[] f6387;

    /* JADX INFO: renamed from: ᩷ */
    public int f6388;

    /* JADX INFO: renamed from: ᩻ */
    public int f6389;

    static {
        ApplicationC14266.m56479(13);
        f81848 = new short[]{7414, -26708, -26729, -26729, -26664, -26731, -26727, -26730, -26751, -26664, -26741, -26740, -26742, -26735, -26730, -26721, -26741};
    }

    public native C3278(C7972 c7972, C11233 c11233);

    /* JADX INFO: renamed from: ֫ */
    public native void m5709(C21962 c21962);

    @Override // p067l.InterfaceC14480
    public final int size() {
        return this.f6388;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m5711() {
        this.f6381 = null;
    }

    @Override // p067l.InterfaceC14480
    public final C22055 getItem(int i) {
        C22055[] c22055Arr = this.f6381;
        if (c22055Arr != null && i >= 0 && i < this.f6388) {
            C22055 c22055 = c22055Arr[i];
            if (c22055 != null) {
                return c22055;
            }
            String strM5707 = m5707(i);
            int[] iArrM5706 = m5706(i);
            C22055[] c22055Arr2 = this.f6381;
            C22055 c22056 = new C22055(this, strM5707, iArrM5706);
            c22055Arr2[i] = c22056;
            return c22056;
        }
        return new C22055(this, m5707(i), m5706(i));
    }

    @Override // p067l.InterfaceC14480
    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC5763 mo5708(int i) {
        if (i < 0 || i >= this.f6388) {
            throw C23669.m52683(i, this.f6388);
        }
        return getItem(i);
    }

    @Override // p067l.InterfaceC14480
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo5710() {
        return this.f6379;
    }

    /* JADX INFO: renamed from: ᩳ */
    private String m5707(int i) {
        int i2;
        if (i < 0 || i >= this.f6388) {
            return C23669.m52683(i, this.f6388).toString();
        }
        int i3 = this.f6380;
        int i4 = this.f6384;
        int i5 = i3 + i4 + this.f6383[i];
        if (i5 < this.f6382 || i5 >= (i2 = this.f6385)) {
            return "";
        }
        C5290 c5290 = this.f6386;
        boolean z = this.f6379;
        String strM50185 = m50185(c5290, i5, z, i2);
        if (strM50185 == null) {
            int iM5705 = m5705(i);
            if (iM5705 != -1 && (strM50185 = m50185(c5290, iM5705, z, i2)) != null) {
                this.f6383[i] = (iM5705 - i4) - this.f6380;
            }
            if (strM50185 == null) {
                return "";
            }
        }
        return strM50185;
    }

    /* JADX INFO: renamed from: ܽ */
    private int m5705(int i) {
        C23669.m52681("getPreviousStringEndOffset " + i);
        int i2 = this.f6384;
        if (i == 0) {
            return i2 + this.f6380;
        }
        int i3 = i - 1;
        int i4 = i2 + this.f6380 + this.f6383[i3];
        C5290 c5290 = this.f6386;
        boolean z = this.f6379;
        int i5 = this.f6385;
        int iM50179 = AbstractC22349.m50179(c5290, i4, z, i5);
        C23669.m52681("new offset " + iM50179);
        if (iM50179 != -1) {
            return iM50179;
        }
        int iM5705 = m5705(i3);
        if (iM5705 == -1) {
            return -1;
        }
        return AbstractC22349.m50179(c5290, iM5705, z, i5);
    }

    /* JADX INFO: renamed from: ܿ */
    private int[] m5706(int i) {
        if (i >= 0 && i < this.f6377) {
            C7972 c7972M11445 = this.f6386.m11445(this.f6384 + this.f6378 + this.f6387[i]);
            C17441 c17441 = new C17441();
            while (true) {
                try {
                    int iM18461 = c7972M11445.m18461();
                    if (iM18461 != -1) {
                        c17441.add(iM18461);
                    } else {
                        return c17441.mo5873();
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return null;
    }
}
