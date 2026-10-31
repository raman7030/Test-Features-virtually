package l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۡۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C8856 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C6739 f26966;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C3046 f26967;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C15869 f26968;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Object f26969;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public EnumC15536 f26970;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C3917 f26971;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C8856 f26972 = null;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C15869 f26973;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f26974;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f26975;

    public C8856(C11678 c11678, C3917 c3917) {
        this.f26971 = c3917;
        this.f26967 = c11678.f37150;
        this.f26973 = c11678.f34793;
        this.f26968 = c11678.f34798;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22883(int i, long j, EnumC15536 enumC15536, C6739 c6739, Object obj) {
        this.f26975 = i;
        this.f26974 = j;
        this.f26970 = enumC15536;
        this.f26966 = c6739;
        this.f26969 = obj;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m22884(InterfaceC0408 interfaceC0408) {
        EnumC21888 enumC21888M36615 = this.f26970.m36615();
        C6739 c6739 = this.f26966;
        int i = 0;
        C3917 c3917 = this.f26971;
        if (c6739 != null && (c6739 instanceof C15869)) {
            C15869 c15869 = (C15869) c6739;
            if (c15869.f49042 == null || c6739.f20943 == 0) {
                c3917.mo11949((this.f26974 - ((long) String.valueOf(c6739.f20943).length())) - 1, "{0} has the wrong index #{1} into the Constant Pool", this.f26970.m36618(), Integer.valueOf(c6739.f20943));
            } else if (!c6739.mo18355()) {
                C16646 c16646M9316 = this.f26967.m9316(c15869);
                if (c16646M9316.isPresent()) {
                    c6739 = (C6739) c16646M9316.get();
                } else {
                    c3917.m11951((this.f26974 - ((long) String.valueOf(c6739.f20943).length())) - 1, "{0} has the wrong index #{1} into the Constant Pool", this.f26970.m36618(), Integer.valueOf(c6739.f20943));
                    throw null;
                }
            }
        }
        this.f26966 = c6739;
        int i2 = C9562.f29018[enumC21888M36615.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    c3917.m11950("{0} has an unknown type", this.f26970.m36618());
                    throw null;
                }
                C6053 c6053 = (C6053) interfaceC0408;
                c6053.m16882(this.f26970.m36614().intValue() >> 8);
                c6053.m16882(this.f26970.m36614().intValue() & 255);
                return;
            }
            C6053 c6054 = (C6053) interfaceC0408;
            c6054.m16882(EnumC15536.f47811.m36614().intValue());
            c6054.m16882(this.f26970.m36614().intValue() & 255);
            c6054.m16889(this.f26966.f20943);
            if (this.f26970 == EnumC15536.f47564) {
                c6054.m16889(((C6739) this.f26969).f20943);
                return;
            }
            return;
        }
        EnumC15536 enumC15536 = this.f26970;
        if (enumC15536 == EnumC15536.f47470) {
            ((C6053) interfaceC0408).m16882(this.f26966.f20943);
            return;
        }
        C6053 c6055 = (C6053) interfaceC0408;
        c6055.m16882(enumC15536.m36614().intValue());
        int iM36619 = this.f26970.m36619();
        if (iM36619 == 1) {
            return;
        }
        int[] iArr = C9562.f29017;
        int i3 = iArr[this.f26970.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                final C5204 c5204 = (C5204) this.f26969;
                c5204.f16298.m45762(new Supplier() { // from class: l.֡۟ۚ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        StringBuilder sb = new StringBuilder("  writeLookupSwitch: pc=");
                        C5204 c5205 = c5204;
                        sb.append(c5205.f16297);
                        sb.append(" pad=");
                        sb.append(c5205.f16304);
                        sb.append(" deflabel=");
                        sb.append(c5205.f16296.f20943);
                        return sb.toString();
                    }
                });
                for (int i4 = 0; i4 < c5204.f16304; i4++) {
                    c6055.m16882(0);
                }
                c6055.m16887(c5204.f16296.f20943 - c5204.f16297);
                c6055.m16887(c5204.f16302.size());
                while (i < c5204.f16302.size()) {
                    c6055.m16887(((Integer) c5204.f16302.get(i)).intValue());
                    c6055.m16887(((C6739) c5204.f16301.get(i)).f20943 - c5204.f16297);
                    i++;
                }
                return;
            }
            try {
                int i5 = this.f26966.f20943;
                switch (iArr[this.f26970.ordinal()]) {
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        i5 -= this.f26975;
                        break;
                    case 23:
                        i5 = (((C6739) this.f26969).f20943 & 255) | (i5 << 8);
                        break;
                    case 24:
                        i5 = ((i5 << 8) | (((C6739) this.f26969).f20943 & 255)) << 8;
                        break;
                    case 25:
                        i5 <<= 16;
                        break;
                    case 26:
                        if ((i5 & (-256)) != 0) {
                            c3917.m11950("Too long argument of {0}: {1}", this.f26970.m36618(), Integer.valueOf(i5));
                            throw null;
                        }
                        break;
                }
                if (iM36619 != 1) {
                    if (iM36619 == 2) {
                        if (i5 > 255) {
                            c3917.mo2245("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m22882(), this.f26970.m36618(), C23424.m51889(i5), "unsigned 8-bit value 0xFF");
                        }
                        c6055.m16882(i5);
                        return;
                    }
                    if (iM36619 == 3) {
                        if (i5 > 32767) {
                            c3917.mo2245("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m22882(), this.f26970.m36618(), C23424.m51889(i5), "signed 16-bit value " + C23424.m51889(EnumC5983.f18409));
                        }
                        c6055.m16889(i5);
                        return;
                    }
                    if (iM36619 == 4) {
                        if (i5 > 32767) {
                            c3917.mo2245("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m22882(), this.f26970.m36618(), C23424.m51889(i5), "signed 16-bit value " + C23424.m51889(EnumC5983.f18409));
                        }
                        c6055.m16889(i5);
                        c6055.m16882(((C6739) this.f26969).f20943);
                        return;
                    }
                    if (iM36619 == 5) {
                        if (i5 > Integer.MAX_VALUE) {
                            c3917.mo2245("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m22882(), this.f26970.m36618(), C23424.m51889(i5), "signed 32-bit value " + C23424.m51889(Integer.MAX_VALUE));
                        }
                        c6055.m16887(i5);
                        return;
                    }
                    c3917.m11950("{0} has wrong length {1}", this.f26970.m36618(), Integer.valueOf(iM36619));
                    throw null;
                }
                return;
            } catch (NullPointerException unused) {
                c3917.m11950("Null arg for {0}", this.f26970.m36618());
                throw null;
            }
        }
        C5204 c5205 = (C5204) this.f26969;
        for (int i6 = 0; i6 < c5205.f16304; i6++) {
            c6055.m16882(0);
        }
        c6055.m16887(c5205.f16296.f20943 - c5205.f16297);
        c6055.m16887(c5205.f16299);
        c6055.m16887(c5205.f16300);
        while (true) {
            C6739[] c6739Arr = c5205.f16303;
            if (i >= c6739Arr.length) {
                return;
            }
            c6055.m16887(c6739Arr[i].f20943 - c5205.f16297);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private String m22882() {
        String string;
        String string2;
        C15869 c15869 = this.f26973;
        Object obj = c15869.f49042.f7866;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = "#" + c15869.f20943;
        }
        StringBuilder sbM15339 = C5368.m15339(string);
        C15869 c158610 = this.f26968;
        Object obj2 = c158610.f49042.f7866;
        if (obj2 != null) {
            string2 = obj2.toString();
        } else {
            string2 = ":#" + c158610.f20943;
        }
        sbM15339.append(string2);
        return sbM15339.toString();
    }
}
