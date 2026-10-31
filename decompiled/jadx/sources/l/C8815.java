package l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8815 extends C6759 {

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f26841;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f26842;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13813 f26843;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public HashMap f26844;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public C7279 f26845;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ArrayList f26846;

    /* JADX INFO: renamed from: ۡ֫, reason: not valid java name and contains not printable characters */
    public C8856 f26847;

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public C7279 f26848;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C7279 f26849;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public C7279 f26850;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C8856 f26851;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5868 f26852;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C3917 f26853;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C7279 f26854;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public C11678 f26855;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public C7279 f26856;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public C6739 f26857;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public C6739 f26858;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C5868 f26859;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public HashMap f26860;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public long f26861;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public ArrayList f26862;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8815(C11678 c11678, int i, C6739 c6739, C6739 c67310) {
        C3046 c3046 = c11678.f37150;
        super(c3046, EnumC4662.f14800);
        this.f26842 = 0;
        this.f26861 = 0L;
        this.f26862 = new ArrayList();
        this.f26848 = null;
        this.f26849 = null;
        this.f26855 = c11678;
        this.f26843 = c11678.f34799;
        C3917 c3917 = (C3917) c11678.m30112();
        this.f26853 = c3917;
        this.f26857 = c6739;
        this.f26858 = c67310;
        this.f26846 = new ArrayList(Collections.nCopies(c67310 != null ? c67310.f20943 : i, null));
        this.f26841 = new ArrayList(Collections.nCopies(c67310 != null ? c67310.f20943 : i, null));
        C8856 c8856 = new C8856(c11678, c3917);
        this.f26847 = c8856;
        this.f26851 = c8856;
        this.f26852 = new C5868(0);
        C5868 c5868 = new C5868();
        this.f26859 = c5868;
        if (c3917.m45766()) {
            C7279 c7279 = new C7279(c3046, EnumC4662.f14786);
            this.f26854 = c7279;
            c5868.m16430(c7279);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22779(ArrayList arrayList, boolean z) {
        C7279 c7279 = z ? this.f26856 : this.f26850;
        if (c7279 == null) {
            c7279 = new C7279(this.f26855.f37150, z ? EnumC4662.f14814 : EnumC4662.f14812);
            this.f26859.m16430(c7279);
        }
        c7279.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22778(ArrayList arrayList) {
        if (this.f26845 == null) {
            C17281 c17281 = new C17281();
            C5868 c5868 = this.f26859;
            C7279 c7279 = (C7279) c5868.m16428(c17281).orElse(null);
            if (c7279 == null) {
                C13813 c13813 = this.f26843;
                C7279 c72710 = new C7279(c13813.f37150, c13813.f41195.m50043() ? EnumC4662.f14817 : EnumC4662.f14820);
                this.f26845 = c72710;
                c5868.m16430(c72710);
            } else {
                this.f26845 = c7279;
            }
        }
        this.f26845.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9521 m22776(long j, String str) {
        C9521 c9521;
        HashMap map = this.f26860;
        if (map == null) {
            this.f26860 = new HashMap(10);
            c9521 = null;
        } else {
            c9521 = (C9521) map.get(str);
        }
        if (c9521 != null) {
            return c9521;
        }
        C9521 c9522 = new C9521(str);
        c9522.f28914 = -1;
        c9522.f28913 = -1;
        c9522.f28915 = j;
        this.f26860.put(str, c9522);
        return c9522;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m22782() {
        HashMap map = this.f26860;
        C3917 c3917 = this.f26853;
        if (map != null) {
            for (C9521 c9521 : map.values()) {
                if (!c9521.f67377) {
                    c3917.mo11949(c9521.f28915, "No <catch {0}> declared", c9521.f67376);
                }
            }
            for (C18028 c18028 : this.f26852.f18006) {
                C9521 c9522 = c18028.f56205;
                long j = c18028.f56206;
                int i = c9522.f28914;
                String str = c9522.f67376;
                if (i == -1) {
                    c3917.mo9065(j, "No <try {0}> found", str);
                }
                if (c9522.f28913 == -1) {
                    c3917.mo9065(j, "No <endtry {0}> found", str);
                }
            }
        }
        m22780(EnumC15536.f47800);
        m22780(EnumC15536.f47591);
        HashMap map2 = this.f26844;
        if (map2 != null) {
            for (C6698 c6698 : map2.values()) {
                if (!c6698.f67378) {
                    c3917.mo11946("Label {0} not declared", c6698.f67376);
                }
            }
        }
        C7279 c7279 = this.f26848;
        C5868 c5868 = this.f26859;
        if (c7279 != null) {
            c5868.m16430(c7279);
        }
        C7279 c72710 = this.f26849;
        if (c72710 != null) {
            c5868.m16430(c72710);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C6698 m22775(String str) {
        C6698 c6698;
        HashMap map = this.f26844;
        if (map == null) {
            this.f26844 = new HashMap(10);
            c6698 = null;
        } else {
            c6698 = (C6698) map.get(str);
        }
        if (c6698 != null) {
            return c6698;
        }
        C6698 c6699 = new C6698(str);
        this.f26844.put(str, c6699);
        return c6699;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22780(EnumC15536 enumC15536) {
        ArrayList arrayList = enumC15536 == EnumC15536.f47800 ? this.f26846 : this.f26841;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                ((C3211) arrayList.get(i)).m9854(this.f26842);
                C3917 c3917 = this.f26853;
                c3917.mo11949(c3917.m11948(), enumC15536 == EnumC15536.f47800 ? "endvar {0}; expected for the local variable" : "endtype {0}; expected for the local variable", Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C19316 m22781() {
        ArrayList arrayList = this.f26862;
        int size = arrayList.size();
        if (size != 0) {
            return (C19316) arrayList.get(size - 1);
        }
        C19316 c19316 = new C19316(this.f26853, this.f26843.f41195.m50043());
        arrayList.add(c19316);
        return c19316;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22777(long j, EnumC15536 enumC15536, C6739 c6739, Object obj) {
        int i;
        int i2;
        int i3;
        C19316 c19316;
        C8815 c8815;
        C15869 c15869;
        EnumC4457 enumC4457;
        C11678 c11678 = this.f26855;
        C3917 c3917 = this.f26853;
        C8856 c8856 = new C8856(c11678, c3917);
        c8856.m22883(this.f26842, c3917.m11948(), enumC15536, c6739, obj);
        this.f26851.f26972 = c8856;
        this.f26851 = c8856;
        int iM36619 = enumC15536.m36619();
        int i4 = C23631.f76568[enumC15536.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                C5204 c5204 = (C5204) obj;
                int i5 = this.f26842;
                c5204.f16297 = i5;
                int i6 = (3 - i5) & 3;
                c5204.f16304 = i6;
                int size = i6 + 1 + ((c5204.f16302.size() + 1) * 8);
                if (c5204.f16296 == null) {
                    c5204.f16296 = new C6739(i5 + size);
                }
                int i7 = C22593.f73024;
                if (size >= 16384) {
                    c3917.mo9065(j, "The length of the {0} instruction {1} exceeds the allowed limit of {2} bytes", EnumC15536.f47539.m36618(), Integer.valueOf(size), 16384);
                }
                iM36619 = size;
            } else if (i4 == 3) {
                C15869 c158610 = (C15869) c6739;
                EnumC4457 enumC4458 = EnumC4457.LDC;
                if (c158610.f49043.f14216 > enumC4458.f14216) {
                    c158610.f49043 = enumC4458;
                }
            } else if ((c6739 instanceof C15869) && (enumC4457 = (c15869 = (C15869) c6739).f49043) != EnumC4457.LDC) {
                EnumC4457 enumC4459 = EnumC4457.ANY;
                if (enumC4457.f14216 > enumC4459.f14216) {
                    c15869.f49043 = enumC4459;
                }
            }
            c19316 = null;
        } else {
            C5204 c5205 = (C5204) obj;
            int i8 = this.f26842;
            C3917 c3918 = c5205.f16298;
            int size2 = c5205.f16302.size();
            if (size2 > 0) {
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
                for (int i9 = 0; i9 < size2; i9++) {
                    int iIntValue = ((Integer) c5205.f16302.get(i9)).intValue();
                    if (iIntValue > i3) {
                        i3 = iIntValue;
                    }
                    if (iIntValue < i2) {
                        i2 = iIntValue;
                    }
                }
                i = (i3 - i2) + 1;
            } else {
                i = 0;
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
            }
            c3918.m45778(String.format("  recalcTableSwitch: low=%d high=%d", Integer.valueOf(i2), Integer.valueOf(i3)), new Object[0]);
            c5205.f16297 = i8;
            int i10 = (3 - i8) & 3;
            c5205.f16304 = i10;
            int iM46314 = C20094.m46314(i, 3, 4, i10 + 1);
            if (c5205.f16296 == null) {
                c5205.f16296 = new C6739(i8 + iM46314);
            }
            C6739[] c6739Arr = new C6739[i];
            for (int i11 = 0; i11 < i; i11++) {
                c6739Arr[i11] = c5205.f16296;
            }
            int i12 = 0;
            while (i12 < size2) {
                c3918.m45778(String.format("   keys.data[%d]=%s", Integer.valueOf(i12), c5205.f16302.get(i12)), new Object[0]);
                c6739Arr[((Integer) c5205.f16302.get(i12)).intValue() - i2] = (C6739) c5205.f16301.get(i12);
                i12++;
                size2 = size2;
            }
            c5205.f16303 = c6739Arr;
            c19316 = null;
            c5205.f16301 = null;
            c5205.f16302 = null;
            c5205.f16300 = i3;
            c5205.f16299 = i2;
            int i13 = C22593.f73024;
            if (iM46314 >= 16384) {
                c3917.mo9065(j, "The length of the {0} instruction {1} exceeds the allowed limit of {2} bytes", EnumC15536.f47547.m36618(), Integer.valueOf(iM46314), 16384);
            }
            iM36619 = iM46314;
        }
        if (c3917.m45766()) {
            long jM11945 = c3917.m11945(j);
            c8815 = this;
            if (jM11945 != c8815.f26861) {
                c8815.f26854.m19535(new C20145(c8815.f26842, jM11945));
                c8815.f26861 = jM11945;
            }
        } else {
            c8815 = this;
        }
        ArrayList<C19316> arrayList = c8815.f26862;
        if (!arrayList.isEmpty()) {
            C7279 c7279 = c8815.f26845;
            if (c7279 == null) {
                C13813 c13813 = c8815.f26843;
                C7279 c72710 = new C7279(c13813.f37150, c13813.f41195.m50043() ? EnumC4662.f14817 : EnumC4662.f14820);
                c8815.f26845 = c72710;
                c8815.f26859.m16430(c72710);
            } else {
                int size3 = c7279.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    C19316 c19317 = (C19316) c8815.f26845.get(size3);
                    if (!c19317.m44513()) {
                        c19316 = c19317;
                        break;
                    }
                }
            }
            for (C19316 c19318 : arrayList) {
                if (!c19318.m44513()) {
                    c19318.m44510(c8815.f26842);
                    c19318.m44509(c19316);
                }
            }
            c8815.f26845.addAll(arrayList);
            arrayList.clear();
        }
        c8815.f26842 += iM36619;
    }

    @Override // l.C6759
    /* JADX INFO: renamed from: ܽ */
    public final int mo5678() {
        return this.f26859.m16431() + this.f26852.m16431() + this.f26842 + 8;
    }

    @Override // l.C6759, l.InterfaceC1800
    /* JADX INFO: renamed from: ֫ */
    public final void mo2828(InterfaceC0408 interfaceC0408) throws IOException {
        C6739 c6739 = this.f26857;
        int i = c6739 != null ? c6739.f20943 : 0;
        C6739 c67310 = this.f26858;
        int iMax = c67310 != null ? c67310.f20943 : Math.max(this.f26846.size(), this.f26841.size());
        super.mo2828(interfaceC0408);
        C6053 c6053 = (C6053) interfaceC0408;
        c6053.m16889(i);
        c6053.m16889(iMax);
        c6053.m16887(this.f26842);
        C8856 c8856 = this.f26847;
        while (true) {
            c8856 = c8856.f26972;
            if (c8856 != null) {
                c8856.m22884(c6053);
            } else {
                this.f26852.m16429(c6053);
                this.f26859.m16429(c6053);
                return;
            }
        }
    }
}
