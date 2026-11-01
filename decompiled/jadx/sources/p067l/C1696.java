package p067l;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿ۠ */
/* JADX INFO: compiled from: P1JH */
/* JADX INFO: loaded from: classes4.dex */
public final class C1696 {

    /* JADX INFO: renamed from: ֡ */
    public static boolean f55974 = false;

    /* JADX INFO: renamed from: ᩵ */
    public static int f55975 = 1000;

    /* JADX INFO: renamed from: ۖ */
    public C1381 f55977;

    /* JADX INFO: renamed from: ܺ */
    public C1381[] f55984;

    /* JADX INFO: renamed from: ܿ */
    public C1311 f55986;

    /* JADX INFO: renamed from: ᩳ */
    public final C1661 f55987;

    /* JADX INFO: renamed from: ۧ */
    public boolean f55982 = false;

    /* JADX INFO: renamed from: ۘ */
    public int f55978 = 0;

    /* JADX INFO: renamed from: ֫ */
    public int f55976 = 32;

    /* JADX INFO: renamed from: ܳ */
    public int f55983 = 32;

    /* JADX INFO: renamed from: ᩴ */
    public boolean f55988 = false;

    /* JADX INFO: renamed from: ܽ */
    public boolean[] f55985 = new boolean[32];

    /* JADX INFO: renamed from: ۜ */
    public int f55979 = 1;

    /* JADX INFO: renamed from: ᩷ */
    public int f55989 = 0;

    /* JADX INFO: renamed from: ᩻ */
    public int f55990 = 32;

    /* JADX INFO: renamed from: ۢ */
    public C1626[] f55981 = new C1626[f55975];

    /* JADX INFO: renamed from: ۡ */
    public int f55980 = 0;

    public C1696() {
        this.f55984 = null;
        this.f55984 = new C1381[32];
        m42735();
        C1661 c1661 = new C1661();
        c1661.f53902 = new C2011();
        c1661.f53904 = new C2011();
        c1661.f53903 = new C1626[32];
        this.f55987 = c1661;
        this.f55986 = new C1311(c1661);
        this.f55977 = new C1381(c1661);
    }

    /* JADX INFO: renamed from: ᩻ */
    private void m42739() {
        int i = this.f55976 * 2;
        this.f55976 = i;
        this.f55984 = (C1381[]) Arrays.copyOf(this.f55984, i);
        C1661 c1661 = this.f55987;
        c1661.f53903 = (C1626[]) Arrays.copyOf(c1661.f53903, this.f55976);
        int i2 = this.f55976;
        this.f55985 = new boolean[i2];
        this.f55983 = i2;
        this.f55990 = i2;
    }

    /* JADX INFO: renamed from: ۜ */
    private void m42735() {
        for (int i = 0; i < this.f55989; i++) {
            C1381 c1381 = this.f55984[i];
            if (c1381 != null) {
                this.f55987.f53902.m54430(c1381);
            }
            this.f55984[i] = null;
        }
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m42752() {
        C1661 c1661;
        int i = 0;
        while (true) {
            c1661 = this.f55987;
            C1626[] c1626Arr = c1661.f53903;
            if (i >= c1626Arr.length) {
                break;
            }
            C1626 c1626 = c1626Arr[i];
            if (c1626 != null) {
                c1626.m39607();
            }
            i++;
        }
        c1661.f53904.m54429(this.f55980, this.f55981);
        this.f55980 = 0;
        Arrays.fill(c1661.f53903, (Object) null);
        this.f55978 = 0;
        this.f55986.m26299();
        this.f55979 = 1;
        for (int i2 = 0; i2 < this.f55989; i2++) {
            C1381 c1381 = this.f55984[i2];
        }
        m42735();
        this.f55989 = 0;
        this.f55977 = new C1381(c1661);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1626 m42742(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f55979 + 1 >= this.f55983) {
            m42739();
        }
        if (!(obj instanceof C1101)) {
            return null;
        }
        C1101 c1101 = (C1101) obj;
        C1626 c1626M16918 = c1101.m16918();
        if (c1626M16918 == null) {
            c1101.m16916();
            c1626M16918 = c1101.m16918();
        }
        int i = c1626M16918.f51881;
        C1661 c1661 = this.f55987;
        if (i != -1 && i <= this.f55978 && c1661.f53903[i] != null) {
            return c1626M16918;
        }
        if (i != -1) {
            c1626M16918.m39607();
        }
        int i2 = this.f55978 + 1;
        this.f55978 = i2;
        this.f55979++;
        c1626M16918.f51881 = i2;
        c1626M16918.f51882 = EnumC1276.UNRESTRICTED;
        c1661.f53903[i2] = c1626M16918;
        return c1626M16918;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1381 m42740() {
        C1661 c1661 = this.f55987;
        C1381 c1381 = (C1381) c1661.f53902.m54428();
        if (c1381 != null) {
            c1381.f35610 = null;
            c1381.f35612.clear();
            c1381.f35608 = 0.0f;
            c1381.f35609 = false;
            return c1381;
        }
        return new C1381(c1661);
    }

    /* JADX INFO: renamed from: ۧ */
    public final C1626 m42748() {
        if (this.f55979 + 1 >= this.f55983) {
            m42739();
        }
        C1626 c1626M42733 = m42733(EnumC1276.SLACK);
        int i = this.f55978 + 1;
        this.f55978 = i;
        this.f55979++;
        c1626M42733.f51881 = i;
        this.f55987.f53903[i] = c1626M42733;
        return c1626M42733;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C1626 m42741(int i) {
        if (this.f55979 + 1 >= this.f55983) {
            m42739();
        }
        C1626 c1626M42733 = m42733(EnumC1276.ERROR);
        int i2 = this.f55978 + 1;
        this.f55978 = i2;
        this.f55979++;
        c1626M42733.f51881 = i2;
        c1626M42733.f51875 = i;
        this.f55987.f53903[i2] = c1626M42733;
        this.f55986.m26300(c1626M42733);
        return c1626M42733;
    }

    /* JADX INFO: renamed from: ֫ */
    private C1626 m42733(EnumC1276 enumC1276) {
        C1626 c1626 = (C1626) this.f55987.f53904.m54428();
        if (c1626 == null) {
            c1626 = new C1626(enumC1276);
        } else {
            c1626.m39607();
        }
        c1626.f51882 = enumC1276;
        int i = this.f55980;
        int i2 = f55975;
        if (i >= i2) {
            int i3 = i2 * 2;
            f55975 = i3;
            this.f55981 = (C1626[]) Arrays.copyOf(this.f55981, i3);
        }
        C1626[] c1626Arr = this.f55981;
        int i4 = this.f55980;
        this.f55980 = i4 + 1;
        c1626Arr[i4] = c1626;
        return c1626;
    }

    /* JADX INFO: renamed from: ۧ */
    public static int m42736(Object obj) {
        C1626 c1626M16918 = ((C1101) obj).m16918();
        if (c1626M16918 != null) {
            return (int) (c1626M16918.f51872 + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m42753() {
        C1311 c1311 = this.f55986;
        if (c1311.mo26298()) {
            m42738();
            return;
        }
        if (this.f55988) {
            for (int i = 0; i < this.f55989; i++) {
                if (!this.f55984[i].f35609) {
                    m42743(c1311);
                    return;
                }
            }
            m42738();
            return;
        }
        m42743(c1311);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x019c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f1  */
    /* JADX INFO: renamed from: ֫ */
    public final void m42744(C1381 c1381) {
        boolean z;
        C1626 c1626M29202;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (this.f55989 + 1 >= this.f55990 || this.f55979 + 1 >= this.f55983) {
            m42739();
        }
        if (c1381.f35609) {
            z4 = false;
        } else {
            ArrayList arrayList = c1381.f35611;
            if (this.f55984.length != 0) {
                boolean z5 = false;
                while (!z5) {
                    int iMo7933 = c1381.f35612.mo7933();
                    for (int i = 0; i < iMo7933; i++) {
                        C1626 c1626Mo7927 = c1381.f35612.mo7927(i);
                        if (c1626Mo7927.f51876 != -1 || c1626Mo7927.f51877) {
                            arrayList.add(c1626Mo7927);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            C1626 c1626 = (C1626) arrayList.get(i2);
                            if (c1626.f51877) {
                                c1381.m29207(this, c1626, true);
                            } else {
                                c1381.mo26297(this, this.f55984[c1626.f51876], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z5 = true;
                    }
                }
                if (c1381.f35610 != null && c1381.f35612.mo7933() == 0) {
                    c1381.f35609 = true;
                    this.f55982 = true;
                }
            }
            if (c1381.mo26298()) {
                return;
            }
            float f = c1381.f35608;
            if (f < 0.0f) {
                c1381.f35608 = f * (-1.0f);
                c1381.f35612.mo7928();
            }
            int iMo7934 = c1381.f35612.mo7933();
            float f2 = 0.0f;
            boolean z6 = false;
            float f3 = 0.0f;
            boolean z7 = false;
            C1626 c1627 = null;
            C1626 c1628 = null;
            for (int i3 = 0; i3 < iMo7934; i3++) {
                float fMo7932 = c1381.f35612.mo7932(i3);
                C1626 c1626Mo7928 = c1381.f35612.mo7927(i3);
                if (c1626Mo7928.f51882 == EnumC1276.UNRESTRICTED) {
                    if (c1627 == null) {
                        if (c1626Mo7928.f51878 <= 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z6 = z3;
                        f2 = fMo7932;
                        c1627 = c1626Mo7928;
                    } else if (f2 > fMo7932) {
                        if (c1626Mo7928.f51878 <= 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        z6 = z3;
                        f2 = fMo7932;
                        c1627 = c1626Mo7928;
                    } else if (!z6 && c1626Mo7928.f51878 <= 1) {
                        f2 = fMo7932;
                        c1627 = c1626Mo7928;
                        z6 = true;
                    }
                } else if (c1627 == null && fMo7932 < 0.0f) {
                    if (c1628 == null) {
                        if (c1626Mo7928.f51878 <= 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z7 = z2;
                        f3 = fMo7932;
                        c1628 = c1626Mo7928;
                    } else if (f3 > fMo7932) {
                        if (c1626Mo7928.f51878 <= 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        z7 = z2;
                        f3 = fMo7932;
                        c1628 = c1626Mo7928;
                    } else if (!z7 && c1626Mo7928.f51878 <= 1) {
                        f3 = fMo7932;
                        c1628 = c1626Mo7928;
                        z7 = true;
                    }
                }
            }
            if (c1627 == null) {
                c1627 = c1628;
            }
            if (c1627 == null) {
                z = true;
            } else {
                c1381.m29208(c1627);
                z = false;
            }
            if (c1381.f35612.mo7933() == 0) {
                c1381.f35609 = true;
            }
            if (z) {
                if (this.f55979 + 1 >= this.f55983) {
                    m42739();
                }
                C1626 c1626M42733 = m42733(EnumC1276.SLACK);
                int i4 = this.f55978 + 1;
                this.f55978 = i4;
                this.f55979++;
                c1626M42733.f51881 = i4;
                C1661 c1661 = this.f55987;
                c1661.f53903[i4] = c1626M42733;
                c1381.f35610 = c1626M42733;
                int i5 = this.f55989;
                m42737(c1381);
                if (this.f55989 == i5 + 1) {
                    C1381 c1382 = this.f55977;
                    c1382.f35610 = null;
                    c1382.f35612.clear();
                    for (int i6 = 0; i6 < c1381.f35612.mo7933(); i6++) {
                        c1382.f35612.mo7931(c1381.f35612.mo7927(i6), c1381.f35612.mo7932(i6), true);
                    }
                    m42734((InterfaceC1731) this.f55977);
                    if (c1626M42733.f51876 == -1) {
                        if (c1381.f35610 == c1626M42733 && (c1626M29202 = c1381.m29202(c1626M42733)) != null) {
                            c1381.m29208(c1626M29202);
                        }
                        if (!c1381.f35609) {
                            c1381.f35610.m39610(this, c1381);
                        }
                        c1661.f53902.m54430(c1381);
                        this.f55989--;
                    }
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            C1626 c1629 = c1381.f35610;
            if (c1629 == null) {
                return;
            }
            if (c1629.f51882 != EnumC1276.UNRESTRICTED && c1381.f35608 < 0.0f) {
                return;
            }
        }
        if (z4) {
            return;
        }
        m42737(c1381);
    }

    /* JADX INFO: renamed from: ۧ */
    private final void m42737(C1381 c1381) {
        int i;
        if (c1381.f35609) {
            c1381.f35610.m39609(this, c1381.f35608);
        } else {
            C1381[] c1381Arr = this.f55984;
            int i2 = this.f55989;
            c1381Arr[i2] = c1381;
            C1626 c1626 = c1381.f35610;
            c1626.f51876 = i2;
            this.f55989 = i2 + 1;
            c1626.m39610(this, c1381);
        }
        if (this.f55982) {
            int i3 = 0;
            while (i3 < this.f55989) {
                if (this.f55984[i3] == null) {
                    System.out.println("WTF");
                }
                C1381 c1382 = this.f55984[i3];
                if (c1382 != null && c1382.f35609) {
                    c1382.f35610.m39609(this, c1382.f35608);
                    this.f55987.f53902.m54430(c1382);
                    this.f55984[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f55989;
                        if (i4 >= i) {
                            break;
                        }
                        C1381[] c1381Arr2 = this.f55984;
                        int i6 = i4 - 1;
                        C1381 c1383 = c1381Arr2[i4];
                        c1381Arr2[i6] = c1383;
                        C1626 c1627 = c1383.f35610;
                        if (c1627.f51876 == i4) {
                            c1627.f51876 = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f55984[i5] = null;
                    }
                    this.f55989 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f55982 = false;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private final void m42734(InterfaceC1731 interfaceC1731) {
        for (int i = 0; i < this.f55979; i++) {
            this.f55985[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f55979 * 2) {
                return;
            }
            C1626 c1626 = ((C1381) interfaceC1731).f35610;
            if (c1626 != null) {
                this.f55985[c1626.f51881] = true;
            }
            C1626 c1626Mo26296 = interfaceC1731.mo26296(this.f55985);
            if (c1626Mo26296 != null) {
                boolean[] zArr = this.f55985;
                int i3 = c1626Mo26296.f51881;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (c1626Mo26296 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f55989; i5++) {
                    C1381 c1381 = this.f55984[i5];
                    if (c1381.f35610.f51882 != EnumC1276.UNRESTRICTED && !c1381.f35609 && c1381.f35612.mo7934(c1626Mo26296)) {
                        float fMo7925 = c1381.f35612.mo7925(c1626Mo26296);
                        if (fMo7925 < 0.0f) {
                            float f2 = (-c1381.f35608) / fMo7925;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C1381 c1382 = this.f55984[i4];
                    c1382.f35610.f51876 = -1;
                    c1382.m29208(c1626Mo26296);
                    C1626 c1627 = c1382.f35610;
                    c1627.f51876 = i4;
                    c1627.m39610(this, c1382);
                }
            } else {
                z = true;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42743(C1311 c1311) {
        for (int i = 0; i < this.f55989; i++) {
            C1381 c1381 = this.f55984[i];
            if (c1381.f35610.f51882 != EnumC1276.UNRESTRICTED) {
                float f = 0.0f;
                if (c1381.f35608 < 0.0f) {
                    boolean z = false;
                    int i2 = 0;
                    while (!z) {
                        i2++;
                        float f2 = Float.MAX_VALUE;
                        int i3 = 0;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        while (i3 < this.f55989) {
                            C1381 c1382 = this.f55984[i3];
                            if (c1382.f35610.f51882 != EnumC1276.UNRESTRICTED && !c1382.f35609 && c1382.f35608 < f) {
                                int iMo7933 = c1382.f35612.mo7933();
                                int i7 = 0;
                                while (i7 < iMo7933) {
                                    C1626 c1626Mo7927 = c1382.f35612.mo7927(i7);
                                    float fMo7925 = c1382.f35612.mo7925(c1626Mo7927);
                                    if (fMo7925 > f) {
                                        for (int i8 = 0; i8 < 9; i8++) {
                                            float f3 = c1626Mo7927.f51874[i8] / fMo7925;
                                            if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                                i6 = i8;
                                                i5 = c1626Mo7927.f51881;
                                                i4 = i3;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i7++;
                                    f = 0.0f;
                                }
                            }
                            i3++;
                            f = 0.0f;
                        }
                        if (i4 != -1) {
                            C1381 c1383 = this.f55984[i4];
                            c1383.f35610.f51876 = -1;
                            c1383.m29208(this.f55987.f53903[i5]);
                            C1626 c1626 = c1383.f35610;
                            c1626.f51876 = i4;
                            c1626.m39610(this, c1383);
                        } else {
                            z = true;
                        }
                        if (i2 > this.f55979 / 2) {
                            z = true;
                        }
                        f = 0.0f;
                    }
                    break;
                }
            }
        }
        m42734((InterfaceC1731) c1311);
        m42738();
    }

    /* JADX INFO: renamed from: ܳ */
    private void m42738() {
        for (int i = 0; i < this.f55989; i++) {
            C1381 c1381 = this.f55984[i];
            c1381.f35610.f51872 = c1381.f35608;
        }
    }

    /* JADX INFO: renamed from: ܽ */
    public final C1661 m42750() {
        return this.f55987;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m42749(C1626 c1626, C1626 c1627, int i, int i2) {
        C1381 c1381M42740 = m42740();
        C1626 c1626M42748 = m42748();
        c1626M42748.f51875 = 0;
        c1381M42740.m29204(c1626, c1627, c1626M42748, i);
        if (i2 != 8) {
            c1381M42740.f35612.mo7930(m42741(i2), (int) (c1381M42740.f35612.mo7925(c1626M42748) * (-1.0f)));
        }
        m42744(c1381M42740);
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m42751(C1626 c1626, C1626 c1627, int i, int i2) {
        C1381 c1381M42740 = m42740();
        C1626 c1626M42748 = m42748();
        c1626M42748.f51875 = 0;
        c1381M42740.m29209(c1626, c1627, c1626M42748, i);
        if (i2 != 8) {
            c1381M42740.f35612.mo7930(m42741(i2), (int) (c1381M42740.f35612.mo7925(c1626M42748) * (-1.0f)));
        }
        m42744(c1381M42740);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42746(C1626 c1626, C1626 c1627, int i, float f, C1626 c1628, C1626 c1629, int i2, int i3) {
        C1381 c1381M42740 = m42740();
        if (c1627 == c1628) {
            c1381M42740.f35612.mo7930(c1626, 1.0f);
            c1381M42740.f35612.mo7930(c1629, 1.0f);
            c1381M42740.f35612.mo7930(c1627, -2.0f);
        } else if (f == 0.5f) {
            c1381M42740.f35612.mo7930(c1626, 1.0f);
            c1381M42740.f35612.mo7930(c1627, -1.0f);
            c1381M42740.f35612.mo7930(c1628, -1.0f);
            c1381M42740.f35612.mo7930(c1629, 1.0f);
            if (i > 0 || i2 > 0) {
                c1381M42740.f35608 = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c1381M42740.f35612.mo7930(c1626, -1.0f);
            c1381M42740.f35612.mo7930(c1627, 1.0f);
            c1381M42740.f35608 = i;
        } else if (f >= 1.0f) {
            c1381M42740.f35612.mo7930(c1629, -1.0f);
            c1381M42740.f35612.mo7930(c1628, 1.0f);
            c1381M42740.f35608 = -i2;
        } else {
            float f2 = 1.0f - f;
            c1381M42740.f35612.mo7930(c1626, f2 * 1.0f);
            c1381M42740.f35612.mo7930(c1627, f2 * (-1.0f));
            c1381M42740.f35612.mo7930(c1628, (-1.0f) * f);
            c1381M42740.f35612.mo7930(c1629, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c1381M42740.f35608 = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c1381M42740.m29206(this, i3);
        }
        m42744(c1381M42740);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42747(C1626 c1626, C1626 c1627, int i, int i2) {
        if (i2 == 8 && c1627.f51877 && c1626.f51876 == -1) {
            c1626.m39609(this, c1627.f51872 + i);
            return;
        }
        C1381 c1381M42740 = m42740();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c1381M42740.f35608 = i;
        }
        if (!z) {
            c1381M42740.f35612.mo7930(c1626, -1.0f);
            c1381M42740.f35612.mo7930(c1627, 1.0f);
        } else {
            c1381M42740.f35612.mo7930(c1626, 1.0f);
            c1381M42740.f35612.mo7930(c1627, -1.0f);
        }
        if (i2 != 8) {
            c1381M42740.m29206(this, i2);
        }
        m42744(c1381M42740);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m42745(C1626 c1626, int i) {
        int i2 = c1626.f51876;
        if (i2 == -1) {
            c1626.m39609(this, i);
            for (int i3 = 0; i3 < this.f55978 + 1; i3++) {
                C1626 c1627 = this.f55987.f53903[i3];
            }
            return;
        }
        if (i2 != -1) {
            C1381 c1381 = this.f55984[i2];
            if (c1381.f35609) {
                c1381.f35608 = i;
                return;
            }
            if (c1381.f35612.mo7933() == 0) {
                c1381.f35609 = true;
                c1381.f35608 = i;
                return;
            }
            C1381 c1381M42740 = m42740();
            if (i < 0) {
                c1381M42740.f35608 = i * (-1);
                c1381M42740.f35612.mo7930(c1626, 1.0f);
            } else {
                c1381M42740.f35608 = i;
                c1381M42740.f35612.mo7930(c1626, -1.0f);
            }
            m42744(c1381M42740);
            return;
        }
        C1381 c1381M42741 = m42740();
        c1381M42741.f35610 = c1626;
        float f = i;
        c1626.f51872 = f;
        c1381M42741.f35608 = f;
        c1381M42741.f35609 = true;
        m42744(c1381M42741);
    }
}
