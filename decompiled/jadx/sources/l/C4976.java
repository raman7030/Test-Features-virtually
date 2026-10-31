package l;

import java.util.EnumSet;

/* JADX INFO: renamed from: l.ۙ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: Z5U8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4976 extends AbstractC20708 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20002 f15669;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4976(C20002 c20002, AbstractC10370 abstractC10370, EnumC16970 enumC16970, EnumSet enumSet) {
        super(c20002, abstractC10370, enumC16970, enumSet);
        this.f15669 = c20002;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo10868(EnumC6596 enumC6596) {
        return super.mo10868(enumC6596) && this.f15669.f64747;
    }

    @Override // l.AbstractC20708
    /* JADX INFO: renamed from: ֫ */
    public final void mo2858(int i, AbstractC5698 abstractC5698) {
        C2609 c2609M43517;
        C2609 c2609M43518;
        if (abstractC5698.f17559 == EnumC1296.f4582) {
            AbstractC5698 abstractC5699 = abstractC5698.f17561;
            if (abstractC5699.f17559 == EnumC1296.f4568) {
                C0052 c0052 = (C0052) abstractC5699;
                EnumSet enumSet = c0052.f916;
                C18837 c18837 = new C18837();
                C20002 c20002 = this.f15669;
                C20085 c20085 = c20002.f64767;
                char cM46124 = c20002.m46124();
                C6136 c6136 = c20002.f64785;
                C11003.requireNonNull(c6136);
                AbstractC10370 abstractC10370 = (AbstractC10370) c20085.m46282(cM46124, new C23674(c6136));
                AbstractC10370 abstractC10371 = c20002.f64782.f17562;
                if (abstractC10371 != abstractC10370) {
                    throw c20002.m46116("module.name.mismatch", abstractC10370, abstractC10371);
                }
                char cM46125 = c20002.m46124();
                EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC18398.class);
                for (EnumC18398 enumC18398 : EnumC18398.values()) {
                    if ((enumC18398.f57129 & cM46125) != 0) {
                        enumSetNoneOf.add(enumC18398);
                    }
                }
                enumSet.addAll(enumSetNoneOf);
                char cM46126 = c20002.m46124();
                C20085 c20086 = c20002.f64767;
                C11003.requireNonNull(c20086);
                c0052.f912 = (AbstractC10370) C20002.m46103(cM46126, new C14853(c20086), (Object) null);
                C18837 c18838 = new C18837();
                char cM46127 = c20002.m46124();
                for (int i2 = 0; i2 < cM46127; i2++) {
                    C0052 c0052M46285 = c20002.f64767.m46285(c20002.m46124());
                    char cM46128 = c20002.m46124();
                    EnumSet enumSetNoneOf2 = EnumSet.noneOf(EnumC9058.class);
                    for (EnumC9058 enumC9058 : EnumC9058.values()) {
                        if ((enumC9058.f27475 & cM46128) != 0) {
                            enumSetNoneOf2.add(enumC9058);
                        }
                    }
                    if (c0052M46285 == c20002.f64770.f66509 && c20002.f64758 >= EnumC16970.V54.f52075) {
                        EnumC9058 enumC9059 = EnumC9058.TRANSITIVE;
                        if (enumSetNoneOf2.contains(enumC9059)) {
                            throw c20002.m46116("bad.requires.flag", enumC9059);
                        }
                        EnumC9058 enumC90510 = EnumC9058.STATIC_PHASE;
                        if (enumSetNoneOf2.contains(enumC90510)) {
                            throw c20002.m46116("bad.requires.flag", enumC90510);
                        }
                    }
                    c20002.m46124();
                    c18838.m43511(new C9764(c0052M46285, enumSetNoneOf2));
                }
                C2609 c2609M43519 = c18838.m43517();
                c0052.f929 = c2609M43519;
                c18837.addAll(c2609M43519);
                C18837 c18839 = new C18837();
                char cM46129 = c20002.m46124();
                for (int i3 = 0; i3 < cM46129; i3++) {
                    C7814 c7814M46283 = c20002.f64767.m46283(c20002.m46124());
                    char cM461210 = c20002.m46124();
                    EnumSet enumSetNoneOf3 = EnumSet.noneOf(EnumC14701.class);
                    for (EnumC14701 enumC14701 : EnumC14701.values()) {
                        if ((enumC14701.f44903 & cM461210) != 0) {
                            enumSetNoneOf3.add(enumC14701);
                        }
                    }
                    char cM461211 = c20002.m46124();
                    if (cM461211 == 0) {
                        c2609M43518 = null;
                    } else {
                        C18837 c188310 = new C18837();
                        for (int i4 = 0; i4 < cM461211; i4++) {
                            c188310.m43511(c20002.f64767.m46285(c20002.m46124()));
                        }
                        c2609M43518 = c188310.m43517();
                    }
                    c18839.m43511(new C17524(c7814M46283, c2609M43518, enumSetNoneOf3));
                }
                C2609 c2609M435110 = c18839.m43517();
                c0052.f921 = c2609M435110;
                c18837.addAll(c2609M435110);
                C18837 c188311 = new C18837();
                char cM461212 = c20002.m46124();
                if (cM461212 != 0 && enumSet.contains(EnumC18398.OPEN)) {
                    throw c20002.m46116("module.non.zero.opens", c20002.f64782.f17562);
                }
                for (int i5 = 0; i5 < cM461212; i5++) {
                    C7814 c7814M46284 = c20002.f64767.m46283(c20002.m46124());
                    char cM461213 = c20002.m46124();
                    EnumSet enumSetNoneOf4 = EnumSet.noneOf(EnumC6941.class);
                    for (EnumC6941 enumC6941 : EnumC6941.values()) {
                        if ((enumC6941.f21405 & cM461213) != 0) {
                            enumSetNoneOf4.add(enumC6941);
                        }
                    }
                    char cM461214 = c20002.m46124();
                    if (cM461214 == 0) {
                        c2609M43517 = null;
                    } else {
                        C18837 c188312 = new C18837();
                        for (int i6 = 0; i6 < cM461214; i6++) {
                            c188312.m43511(c20002.f64767.m46285(c20002.m46124()));
                        }
                        c2609M43517 = c188312.m43517();
                    }
                    c188311.m43511(new C23874(c7814M46284, c2609M43517, enumSetNoneOf4));
                }
                C2609 c2609M435111 = c188311.m43517();
                c0052.f919 = c2609M435111;
                c18837.addAll(c2609M435111);
                c0052.f920 = c18837.m43517();
                C18837 c188313 = new C18837();
                char cM461215 = c20002.m46124();
                for (int i7 = 0; i7 < cM461215; i7++) {
                    c188313.m43511(new C19297((AbstractC10370) c20002.f64767.m46279(c20002.m46124(), new InterfaceC13191() { // from class: l.᩶᩻۠
                        @Override // l.InterfaceC13191
                        /* JADX INFO: renamed from: ֫ */
                        public final Object mo23247(int i8, int i9, byte[] bArr) {
                            return this.f66072.f15669.f64785.m17058(C18382.m42811(i8, i9, bArr));
                        }
                    })));
                }
                c20002.f64745 = c188313.m43517();
                C18837 c188314 = new C18837();
                char cM461216 = c20002.m46124();
                for (int i8 = 0; i8 < cM461216; i8++) {
                    AbstractC10370 abstractC10372 = (AbstractC10370) c20002.f64767.m46279(c20002.m46124(), new InterfaceC13191() { // from class: l.᩶᩻۠
                        @Override // l.InterfaceC13191
                        /* JADX INFO: renamed from: ֫ */
                        public final Object mo23247(int i9, int i10, byte[] bArr) {
                            return this.f66072.f15669.f64785.m17058(C18382.m42811(i9, i10, bArr));
                        }
                    });
                    char cM461217 = c20002.m46124();
                    C18837 c188315 = new C18837();
                    for (int i9 = 0; i9 < cM461217; i9++) {
                        c188315.m43511((AbstractC10370) c20002.f64767.m46279(c20002.m46124(), new InterfaceC13191() { // from class: l.᩶᩻۠
                            @Override // l.InterfaceC13191
                            /* JADX INFO: renamed from: ֫ */
                            public final Object mo23247(int i10, int i11, byte[] bArr) {
                                return this.f66072.f15669.f64785.m17058(C18382.m42811(i10, i11, bArr));
                            }
                        }));
                        c188314.m43511(new C18591(abstractC10372, c188315.m43517()));
                    }
                }
                c20002.f64780 = c188314.m43517();
            }
        }
    }
}
