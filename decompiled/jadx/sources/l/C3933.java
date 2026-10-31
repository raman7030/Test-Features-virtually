package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۘ۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes3.dex */
public final class C3933 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C1755 f12548;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C0384 f12549;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23420 f12550;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18750 f12551;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1407(C15580 c15580) {
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f0  */
    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        AbstractC4308 abstractC4308M17538;
        boolean z;
        C12399 c12399 = this.f12551.f59255;
        C23420 c23420 = this.f12550;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        AbstractC4308 abstractC4308 = c23420.f75219;
        if (this.f12549.f1817.contains(abstractC4308)) {
            return;
        }
        try {
            abstractC4308M17538 = c12399.f37343.m17538(abstractC4308);
        } catch (C6130 e) {
            interfaceC3953.mo1084(null, e.m17050());
            abstractC4308M17538 = null;
        }
        if (abstractC4308M17538.mo12933().m8245() != c14169.f42775.m8245()) {
            interfaceC3953.mo1084(c14169, c12399.f37356.m16617(C11886.f35463));
        }
        AbstractC4308 abstractC4308Mo12923 = abstractC4308M17538.mo12923();
        boolean zM12913 = abstractC4308Mo12923.m12913(EnumC9454.VOID);
        int i = 1;
        if (c14169.m33819() == EnumC13706.EXPRESSION) {
            if (!zM12913 || C7260.m19447((AbstractC12612) c14169.f42776)) {
                return;
            }
            this.f12550.f75215.mo1084(c14169, c12399.f37356.m16617(new C11576("compiler", "incompatible.ret.type.in.lambda", C11886.m29010(abstractC4308Mo12923))));
            return;
        }
        C2522 c2522 = new C2522();
        c2522.f8006 = true;
        c2522.f8005 = true;
        c14169.f42776.mo988(c2522);
        boolean z2 = c2522.f8006;
        if (zM12913) {
            if (z2) {
                return;
            }
            this.f12550.f75215.mo1084(c14169, c12399.f37356.m16617(C11886.f35457));
            return;
        }
        if (c2522.f8005) {
            C2609 c2609 = c14169.f42775;
            C5572 c5572 = c12399.f37347;
            c5572.getClass();
            HashMap map = c5572.f17260;
            c5572.f17260 = new HashMap();
            try {
                c14169.f42775 = (C2609) C5378.stream(c14169.f42775).map(new C23022(i, this)).collect(C2609.m8240());
                boolean z3 = c12399.m30569(c14169, this.f12548, c12399.f37350.f28228).f42774;
                c5572.f17260 = map;
                c14169.f42775 = c2609;
                if (z3) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                c5572.f17260 = map;
                c14169.f42775 = c2609;
                throw th;
            }
        } else {
            z = false;
        }
        if (!z && !z2) {
            C22364 c22364 = c12399.f37341;
            AbstractC5144 abstractC5144 = c14169.f42776;
            abstractC5144.getClass();
            c22364.m7273(abstractC5144, C6241.f19289);
        }
        if (z) {
            return;
        }
        this.f12550.f75215.mo1084(c14169, c12399.f37356.m16617(new C11576("compiler", "incompatible.ret.type.in.lambda", C11886.m29010(abstractC4308Mo12923))));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        mo10758(c8379.f25699);
        mo10758(c8379.f25700);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1401(C13464 c13464) {
        m33860(c13464.f40199);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        AbstractC4308 abstractC4308M17538;
        C12399 c12399 = this.f12551.f59255;
        C12171.m29637(c9232.mo23672());
        C23420 c23420 = this.f12550;
        InterfaceC3953 interfaceC3953 = c23420.f75215;
        AbstractC4308 abstractC4308 = c23420.f75219;
        if (this.f12549.f1817.contains(abstractC4308)) {
            return;
        }
        try {
            abstractC4308M17538 = c12399.f37343.m17538(abstractC4308);
        } catch (C6130 e) {
            interfaceC3953.mo1084(null, e.m17050());
            abstractC4308M17538 = null;
        }
        C1755 c1755 = this.f12548;
        C1755 c1755M5877 = c1755.m5877(c9232, c1755.f6073);
        AbstractC12612 abstractC12612 = c9232.f27945;
        C23420 c23420M23955 = c12399.f37350.m23955(c9232);
        C5572 c5572 = c12399.f37347;
        c5572.getClass();
        AbstractC12612 abstractC12613 = (AbstractC12612) c12399.m30568(abstractC12612, c1755M5877, c23420M23955, c12399.f37339, null, EnumC7480.SPECULATIVE, new C21095(c5572));
        C18837 c18837 = new C18837();
        for (AbstractC4308 abstractC4309 : abstractC4308M17538.mo12933()) {
            c18837.m43511(AbstractC4308.f13885);
        }
        C9232 c9233 = (C9232) new C19961(c12399.f37342).mo8690((AbstractC5144) c9232, (Object) null);
        c9233.f27945 = abstractC12613;
        C22406 c22406 = c12399.f37353;
        AbstractC4308 abstractC43010 = abstractC12613.f16086;
        AbstractC10370 abstractC10370 = c9232.f27944;
        C2609 c2609M43517 = c18837.m43517();
        C2609 c2609M8239 = C2609.m8239();
        C22406 c22407 = c12399.f37353;
        AbstractC5698 abstractC5698 = (AbstractC5698) c22406.m50325(c1755M5877, c9233, abstractC43010, abstractC10370, c2609M43517, c2609M8239, abstractC4308M17538, c22407.f72596, this.f12549, c22407.f72601).f74207;
        int i = C23002.f74052[abstractC5698.f17559.ordinal()];
        if (i == 1 || i == 2) {
            interfaceC3953.mo1084(c9232, c12399.f37356.m16617(C11886.f35487));
        } else if (i == 3 || i == 4) {
            EnumC12986 enumC12986 = EnumC12986.FRAGMENT;
            AbstractC4308 abstractC43011 = abstractC12613.f16086;
            interfaceC3953.mo1084(c9232, ((AbstractC5473) abstractC5698).mo4076(enumC12986, c9232, abstractC43011.f13890, abstractC43011, c9232.f27944, c18837.m43517(), C2609.m8239()));
        }
    }

    public C3933(C18750 c18750) {
        this.f12551 = c18750;
    }
}
