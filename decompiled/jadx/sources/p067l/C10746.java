package p067l;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: l.ۡۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 77E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10746 extends C8792 {

    /* JADX INFO: renamed from: ֫֫ */
    public final ArrayList f29766;

    /* JADX INFO: renamed from: ۗ */
    public int f29767;

    /* JADX INFO: renamed from: ۙ */
    public C15496 f29768;

    /* JADX INFO: renamed from: ۛ */
    public HashMap f29769;

    /* JADX INFO: renamed from: ۜ֫ */
    public C9286 f29770;

    /* JADX INFO: renamed from: ۟ */
    public final ArrayList f29771;

    /* JADX INFO: renamed from: ۡ֫ */
    public C10785 f29772;

    /* JADX INFO: renamed from: ۢ֫ */
    public C9286 f29773;

    /* JADX INFO: renamed from: ۤ */
    public C9286 f29774;

    /* JADX INFO: renamed from: ۧ֫ */
    public C9286 f29775;

    /* JADX INFO: renamed from: ۨ */
    public C10785 f29776;

    /* JADX INFO: renamed from: ۫ */
    public C7945 f29777;

    /* JADX INFO: renamed from: ۬ */
    public C6091 f29778;

    /* JADX INFO: renamed from: ܰ */
    public C9286 f29779;

    /* JADX INFO: renamed from: ܳ֫ */
    public C13467 f29780;

    /* JADX INFO: renamed from: ܽ֫ */
    public C9286 f29781;

    /* JADX INFO: renamed from: ܿ֫ */
    public C8773 f29782;

    /* JADX INFO: renamed from: ᩳ֫ */
    public C8773 f29783;

    /* JADX INFO: renamed from: ᩶ */
    public C7945 f29784;

    /* JADX INFO: renamed from: ᩷֫ */
    public HashMap f29785;

    /* JADX INFO: renamed from: ᩺ */
    public long f29786;

    /* JADX INFO: renamed from: ᩻֫ */
    public ArrayList f29787;

    /* JADX WARN: Illegal instructions before constructor call */
    public C10746(C13467 c13467, int i, C8773 c8773, C8773 c8774) {
        C5263 c5263 = c13467.f40167;
        super(c5263, EnumC6799.f17630);
        this.f29767 = 0;
        this.f29786 = 0L;
        this.f29787 = new ArrayList();
        this.f29773 = null;
        this.f29774 = null;
        this.f29780 = c13467;
        this.f29768 = c13467.f37798;
        C6091 c6091 = (C6091) c13467.m32176();
        this.f29778 = c6091;
        this.f29782 = c8773;
        this.f29783 = c8774;
        this.f29771 = new ArrayList(Collections.nCopies(c8774 != null ? c8774.f23817 : i, null));
        this.f29766 = new ArrayList(Collections.nCopies(c8774 != null ? c8774.f23817 : i, null));
        C10785 c10785 = new C10785(c13467, c6091);
        this.f29772 = c10785;
        this.f29776 = c10785;
        this.f29777 = new C7945(0);
        C7945 c7945 = new C7945();
        this.f29784 = c7945;
        if (c6091.m48078()) {
            C9286 c9286 = new C9286(c5263, EnumC6799.f17616);
            this.f29779 = c9286;
            c7945.m18356(c9286);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24749(ArrayList arrayList, boolean z) {
        C9286 c9286 = z ? this.f29781 : this.f29775;
        if (c9286 == null) {
            c9286 = new C9286(this.f29780.f40167, z ? EnumC6799.f17644 : EnumC6799.f17642);
            this.f29784.m18356(c9286);
        }
        c9286.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24748(ArrayList arrayList) {
        if (this.f29770 == null) {
            C18792 c18792 = new C18792();
            C7945 c7945 = this.f29784;
            C9286 c9286 = (C9286) c7945.m18354(c18792).orElse(null);
            if (c9286 == null) {
                C15496 c15496 = this.f29768;
                C9286 c9287 = new C9286(c15496.f40167, c15496.f44273.m52373() ? EnumC6799.f17647 : EnumC6799.f17650);
                this.f29770 = c9287;
                c7945.m18356(c9287);
            } else {
                this.f29770 = c9286;
            }
        }
        this.f29770.addAll(arrayList);
    }

    /* JADX INFO: renamed from: ֫ */
    public final C11417 m24746(long j, String str) {
        C11417 c11417;
        HashMap map = this.f29785;
        if (map == null) {
            this.f29785 = new HashMap(10);
            c11417 = null;
        } else {
            c11417 = (C11417) map.get(str);
        }
        if (c11417 != null) {
            return c11417;
        }
        C11417 c11418 = new C11417(str);
        c11418.f31861 = -1;
        c11418.f31860 = -1;
        c11418.f31862 = j;
        this.f29785.put(str, c11418);
        return c11418;
    }

    /* JADX INFO: renamed from: ܿ */
    public final void m24752() {
        HashMap map = this.f29785;
        C6091 c6091 = this.f29778;
        if (map != null) {
            for (C11417 c11417 : map.values()) {
                if (!c11417.f70060) {
                    c6091.mo13869(c11417.f31862, "No <catch {0}> declared", c11417.f70059);
                }
            }
            for (C19502 c19502 : this.f29777.f20859) {
                C11417 c11418 = c19502.f59403;
                long j = c19502.f59404;
                int i = c11418.f31861;
                String str = c11418.f70059;
                if (i == -1) {
                    c6091.mo11117(j, "No <try {0}> found", str);
                }
                if (c11418.f31860 == -1) {
                    c6091.mo11117(j, "No <endtry {0}> found", str);
                }
            }
        }
        m24750(EnumC17134.f50932);
        m24750(EnumC17134.f50723);
        HashMap map2 = this.f29769;
        if (map2 != null) {
            for (C8734 c8734 : map2.values()) {
                if (!c8734.f70061) {
                    c6091.mo13866("Label {0} not declared", c8734.f70059);
                }
            }
        }
        C9286 c9286 = this.f29773;
        C7945 c7945 = this.f29784;
        if (c9286 != null) {
            c7945.m18356(c9286);
        }
        C9286 c9287 = this.f29774;
        if (c9287 != null) {
            c7945.m18356(c9287);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C8734 m24745(String str) {
        C8734 c8734;
        HashMap map = this.f29769;
        if (map == null) {
            this.f29769 = new HashMap(10);
            c8734 = null;
        } else {
            c8734 = (C8734) map.get(str);
        }
        if (c8734 != null) {
            return c8734;
        }
        C8734 c8735 = new C8734(str);
        this.f29769.put(str, c8735);
        return c8735;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24750(EnumC17134 enumC17134) {
        ArrayList arrayList = enumC17134 == EnumC17134.f50932 ? this.f29771 : this.f29766;
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) != null) {
                ((C5420) arrayList.get(i)).m11901(this.f29767);
                C6091 c6091 = this.f29778;
                c6091.mo13869(c6091.m13868(), enumC17134 == EnumC17134.f50932 ? "endvar {0}; expected for the local variable" : "endtype {0}; expected for the local variable", Integer.valueOf(i));
            }
        }
    }

    /* JADX INFO: renamed from: ܳ */
    public final C20726 m24751() {
        ArrayList arrayList = this.f29787;
        int size = arrayList.size();
        if (size != 0) {
            return (C20726) arrayList.get(size - 1);
        }
        C20726 c20726 = new C20726(this.f29778, this.f29768.f44273.m52373());
        arrayList.add(c20726);
        return c20726;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24747(long j, EnumC17134 enumC17134, C8773 c8773, Object obj) {
        int i;
        int i2;
        int i3;
        C20726 c20726;
        C10746 c10746;
        C17450 c17450;
        EnumC6604 enumC6604;
        C13467 c13467 = this.f29780;
        C6091 c6091 = this.f29778;
        C10785 c10785 = new C10785(c13467, c6091);
        c10785.m24854(this.f29767, c6091.m13868(), enumC17134, c8773, obj);
        this.f29776.f29895 = c10785;
        this.f29776 = c10785;
        int iM38780 = enumC17134.m38780();
        int i4 = C24827.f79312[enumC17134.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                C7314 c7314 = (C7314) obj;
                int i5 = this.f29767;
                c7314.f19138 = i5;
                int i6 = (3 - i5) & 3;
                c7314.f19145 = i6;
                int size = i6 + 1 + ((c7314.f19143.size() + 1) * 8);
                if (c7314.f19137 == null) {
                    c7314.f19137 = new C8773(i5 + size);
                }
                int i7 = C23841.f75751;
                if (size >= 16384) {
                    c6091.mo11117(j, "The length of the {0} instruction {1} exceeds the allowed limit of {2} bytes", EnumC17134.f50671.m38779(), Integer.valueOf(size), 16384);
                }
                iM38780 = size;
            } else if (i4 == 3) {
                C17450 c17451 = (C17450) c8773;
                EnumC6604 enumC6605 = EnumC6604.LDC;
                if (c17451.f52181.f17040 > enumC6605.f17040) {
                    c17451.f52181 = enumC6605;
                }
            } else if ((c8773 instanceof C17450) && (enumC6604 = (c17450 = (C17450) c8773).f52181) != EnumC6604.LDC) {
                EnumC6604 enumC6606 = EnumC6604.ANY;
                if (enumC6604.f17040 > enumC6606.f17040) {
                    c17450.f52181 = enumC6606;
                }
            }
            c20726 = null;
        } else {
            C7314 c7315 = (C7314) obj;
            int i8 = this.f29767;
            C6091 c6092 = c7315.f19139;
            int size2 = c7315.f19143.size();
            if (size2 > 0) {
                i2 = Integer.MAX_VALUE;
                i3 = Integer.MIN_VALUE;
                for (int i9 = 0; i9 < size2; i9++) {
                    int iIntValue = ((Integer) c7315.f19143.get(i9)).intValue();
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
            c6092.m48090(String.format("  recalcTableSwitch: low=%d high=%d", Integer.valueOf(i2), Integer.valueOf(i3)), new Object[0]);
            c7315.f19138 = i8;
            int i10 = (3 - i8) & 3;
            c7315.f19145 = i10;
            int iM48630 = C21466.m48630(i, 3, 4, i10 + 1);
            if (c7315.f19137 == null) {
                c7315.f19137 = new C8773(i8 + iM48630);
            }
            C8773[] c8773Arr = new C8773[i];
            for (int i11 = 0; i11 < i; i11++) {
                c8773Arr[i11] = c7315.f19137;
            }
            int i12 = 0;
            while (i12 < size2) {
                c6092.m48090(String.format("   keys.data[%d]=%s", Integer.valueOf(i12), c7315.f19143.get(i12)), new Object[0]);
                c8773Arr[((Integer) c7315.f19143.get(i12)).intValue() - i2] = (C8773) c7315.f19142.get(i12);
                i12++;
                size2 = size2;
            }
            c7315.f19144 = c8773Arr;
            c20726 = null;
            c7315.f19142 = null;
            c7315.f19143 = null;
            c7315.f19141 = i3;
            c7315.f19140 = i2;
            int i13 = C23841.f75751;
            if (iM48630 >= 16384) {
                c6091.mo11117(j, "The length of the {0} instruction {1} exceeds the allowed limit of {2} bytes", EnumC17134.f50679.m38779(), Integer.valueOf(iM48630), 16384);
            }
            iM38780 = iM48630;
        }
        if (c6091.m48078()) {
            long jM13865 = c6091.m13865(j);
            c10746 = this;
            if (jM13865 != c10746.f29786) {
                c10746.f29779.m21502(new C21514(c10746.f29767, jM13865));
                c10746.f29786 = jM13865;
            }
        } else {
            c10746 = this;
        }
        ArrayList<C20726> arrayList = c10746.f29787;
        if (!arrayList.isEmpty()) {
            C9286 c9286 = c10746.f29770;
            if (c9286 == null) {
                C15496 c15496 = c10746.f29768;
                C9286 c9287 = new C9286(c15496.f40167, c15496.f44273.m52373() ? EnumC6799.f17647 : EnumC6799.f17650);
                c10746.f29770 = c9287;
                c10746.f29784.m18356(c9287);
            } else {
                int size3 = c9286.size();
                while (true) {
                    size3--;
                    if (size3 < 0) {
                        break;
                    }
                    C20726 c20727 = (C20726) c10746.f29770.get(size3);
                    if (!c20727.m46807()) {
                        c20726 = c20727;
                        break;
                    }
                }
            }
            for (C20726 c20728 : arrayList) {
                if (!c20728.m46807()) {
                    c20728.m46804(c10746.f29767);
                    c20728.m46803(c20726);
                }
            }
            c10746.f29770.addAll(arrayList);
            arrayList.clear();
        }
        c10746.f29767 += iM38780;
    }

    @Override // p067l.C8792
    /* JADX INFO: renamed from: ܽ */
    public final int mo7908() {
        return this.f29784.m18357() + this.f29777.m18357() + this.f29767 + 8;
    }

    @Override // p067l.C8792, p067l.InterfaceC4079
    /* JADX INFO: renamed from: ֫ */
    public final void mo5157(InterfaceC2756 interfaceC2756) throws IOException {
        C8773 c8773 = this.f29782;
        int i = c8773 != null ? c8773.f23817 : 0;
        C8773 c8774 = this.f29783;
        int iMax = c8774 != null ? c8774.f23817 : Math.max(this.f29771.size(), this.f29766.size());
        super.mo5157(interfaceC2756);
        C8121 c8121 = (C8121) interfaceC2756;
        c8121.m18818(i);
        c8121.m18818(iMax);
        c8121.m18816(this.f29767);
        C10785 c10785 = this.f29772;
        while (true) {
            c10785 = c10785.f29895;
            if (c10785 != null) {
                c10785.m24855(c8121);
            } else {
                this.f29777.m18355(c8121);
                this.f29784.m18355(c8121);
                return;
            }
        }
    }
}
