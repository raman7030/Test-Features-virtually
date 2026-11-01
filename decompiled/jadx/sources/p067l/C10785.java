package p067l;

import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۡۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C7DS */
/* JADX INFO: loaded from: classes3.dex */
public final class C10785 {

    /* JADX INFO: renamed from: ֫ */
    public C8773 f29889;

    /* JADX INFO: renamed from: ۜ */
    public final C5263 f29890;

    /* JADX INFO: renamed from: ۢ */
    public final C17450 f29891;

    /* JADX INFO: renamed from: ۧ */
    public Object f29892;

    /* JADX INFO: renamed from: ܳ */
    public EnumC17134 f29893;

    /* JADX INFO: renamed from: ܽ */
    public final C6091 f29894;

    /* JADX INFO: renamed from: ܿ */
    public C10785 f29895 = null;

    /* JADX INFO: renamed from: ᩳ */
    public final C17450 f29896;

    /* JADX INFO: renamed from: ᩷ */
    public long f29897;

    /* JADX INFO: renamed from: ᩻ */
    public int f29898;

    public C10785(C13467 c13467, C6091 c6091) {
        this.f29894 = c6091;
        this.f29890 = c13467.f40167;
        this.f29896 = c13467.f37792;
        this.f29891 = c13467.f37797;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24854(int i, long j, EnumC17134 enumC17134, C8773 c8773, Object obj) {
        this.f29898 = i;
        this.f29897 = j;
        this.f29893 = enumC17134;
        this.f29889 = c8773;
        this.f29892 = obj;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m24855(InterfaceC2756 interfaceC2756) {
        EnumC23171 enumC23171M38776 = this.f29893.m38776();
        C8773 c8773 = this.f29889;
        int i = 0;
        C6091 c6091 = this.f29894;
        if (c8773 != null && (c8773 instanceof C17450)) {
            C17450 c17450 = (C17450) c8773;
            if (c17450.f52180 == null || c8773.f23817 == 0) {
                c6091.mo13869((this.f29897 - ((long) String.valueOf(c8773.f23817).length())) - 1, "{0} has the wrong index #{1} into the Constant Pool", this.f29893.m38779(), Integer.valueOf(c8773.f23817));
            } else if (!c8773.mo20303()) {
                C18189 c18189M11358 = this.f29890.m11358(c17450);
                if (c18189M11358.isPresent()) {
                    c8773 = (C8773) c18189M11358.get();
                } else {
                    c6091.m13871((this.f29897 - ((long) String.valueOf(c8773.f23817).length())) - 1, "{0} has the wrong index #{1} into the Constant Pool", this.f29893.m38779(), Integer.valueOf(c8773.f23817));
                    throw null;
                }
            }
        }
        this.f29889 = c8773;
        int i2 = C11456.f31965[enumC23171M38776.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    c6091.m13870("{0} has an unknown type", this.f29893.m38779());
                    throw null;
                }
                C8121 c8121 = (C8121) interfaceC2756;
                c8121.m18811(this.f29893.m38775().intValue() >> 8);
                c8121.m18811(this.f29893.m38775().intValue() & 255);
                return;
            }
            C8121 c8122 = (C8121) interfaceC2756;
            c8122.m18811(EnumC17134.f50943.m38775().intValue());
            c8122.m18811(this.f29893.m38775().intValue() & 255);
            c8122.m18818(this.f29889.f23817);
            if (this.f29893 == EnumC17134.f50696) {
                c8122.m18818(((C8773) this.f29892).f23817);
                return;
            }
            return;
        }
        EnumC17134 enumC17134 = this.f29893;
        if (enumC17134 == EnumC17134.f50602) {
            ((C8121) interfaceC2756).m18811(this.f29889.f23817);
            return;
        }
        C8121 c8123 = (C8121) interfaceC2756;
        c8123.m18811(enumC17134.m38775().intValue());
        int iM38780 = this.f29893.m38780();
        if (iM38780 == 1) {
            return;
        }
        int[] iArr = C11456.f31964;
        int i3 = iArr[this.f29893.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                final C7314 c7314 = (C7314) this.f29892;
                c7314.f19139.m48074(new Supplier() { // from class: l.֡۟ۚ
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        StringBuilder sb = new StringBuilder("  writeLookupSwitch: pc=");
                        C7314 c7315 = c7314;
                        sb.append(c7315.f19138);
                        sb.append(" pad=");
                        sb.append(c7315.f19145);
                        sb.append(" deflabel=");
                        sb.append(c7315.f19137.f23817);
                        return sb.toString();
                    }
                });
                for (int i4 = 0; i4 < c7314.f19145; i4++) {
                    c8123.m18811(0);
                }
                c8123.m18816(c7314.f19137.f23817 - c7314.f19138);
                c8123.m18816(c7314.f19143.size());
                while (i < c7314.f19143.size()) {
                    c8123.m18816(((Integer) c7314.f19143.get(i)).intValue());
                    c8123.m18816(((C8773) c7314.f19142.get(i)).f23817 - c7314.f19138);
                    i++;
                }
                return;
            }
            try {
                int i5 = this.f29889.f23817;
                switch (iArr[this.f29893.ordinal()]) {
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
                        i5 -= this.f29898;
                        break;
                    case 23:
                        i5 = (((C8773) this.f29892).f23817 & 255) | (i5 << 8);
                        break;
                    case 24:
                        i5 = ((i5 << 8) | (((C8773) this.f29892).f23817 & 255)) << 8;
                        break;
                    case 25:
                        i5 <<= 16;
                        break;
                    case 26:
                        if ((i5 & (-256)) != 0) {
                            c6091.m13870("Too long argument of {0}: {1}", this.f29893.m38779(), Integer.valueOf(i5));
                            throw null;
                        }
                        break;
                }
                if (iM38780 != 1) {
                    if (iM38780 == 2) {
                        if (i5 > 255) {
                            c6091.mo4612("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m24853(), this.f29893.m38779(), C24630.m54287(i5), "unsigned 8-bit value 0xFF");
                        }
                        c8123.m18811(i5);
                        return;
                    }
                    if (iM38780 == 3) {
                        if (i5 > 32767) {
                            c6091.mo4612("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m24853(), this.f29893.m38779(), C24630.m54287(i5), "signed 16-bit value " + C24630.m54287(EnumC8055.f21261));
                        }
                        c8123.m18818(i5);
                        return;
                    }
                    if (iM38780 == 4) {
                        if (i5 > 32767) {
                            c6091.mo4612("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m24853(), this.f29893.m38779(), C24630.m54287(i5), "signed 16-bit value " + C24630.m54287(EnumC8055.f21261));
                        }
                        c8123.m18818(i5);
                        c8123.m18811(((C8773) this.f29892).f23817);
                        return;
                    }
                    if (iM38780 == 5) {
                        if (i5 > Integer.MAX_VALUE) {
                            c6091.mo4612("{0} - The argument {2} of the ''{1}'' instruction is written. It is larger than allowed {3}", m24853(), this.f29893.m38779(), C24630.m54287(i5), "signed 32-bit value " + C24630.m54287(Integer.MAX_VALUE));
                        }
                        c8123.m18816(i5);
                        return;
                    }
                    c6091.m13870("{0} has wrong length {1}", this.f29893.m38779(), Integer.valueOf(iM38780));
                    throw null;
                }
                return;
            } catch (NullPointerException unused) {
                c6091.m13870("Null arg for {0}", this.f29893.m38779());
                throw null;
            }
        }
        C7314 c7315 = (C7314) this.f29892;
        for (int i6 = 0; i6 < c7315.f19145; i6++) {
            c8123.m18811(0);
        }
        c8123.m18816(c7315.f19137.f23817 - c7315.f19138);
        c8123.m18816(c7315.f19140);
        c8123.m18816(c7315.f19141);
        while (true) {
            C8773[] c8773Arr = c7315.f19144;
            if (i >= c8773Arr.length) {
                return;
            }
            c8123.m18816(c8773Arr[i].f23817 - c7315.f19138);
            i++;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private String m24853() {
        String string;
        String string2;
        C17450 c17450 = this.f29896;
        Object obj = c17450.f52180.f10654;
        if (obj != null) {
            string = obj.toString();
        } else {
            string = "#" + c17450.f23817;
        }
        StringBuilder sbM17248 = C7470.m17248(string);
        C17450 c17451 = this.f29891;
        Object obj2 = c17451.f52180.f10654;
        if (obj2 != null) {
            string2 = obj2.toString();
        } else {
            string2 = ":#" + c17451.f23817;
        }
        sbM17248.append(string2);
        return sbM17248.toString();
    }
}
