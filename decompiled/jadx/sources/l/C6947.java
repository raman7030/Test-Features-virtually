package l;

import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۜᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 640U */
/* JADX INFO: loaded from: classes3.dex */
public final class C6947 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1302 f21418;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C1323 f21419;

    @Override // l.C14190
    /* JADX INFO: renamed from: ۧ */
    public final void mo10758(AbstractC5144 abstractC5144) {
        super.mo10758(abstractC5144);
        if (abstractC5144 != null) {
            abstractC5144.f16086 = null;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1367(final C1323 c1323) {
        if (c1323.f4746 != null) {
            if (c1323.f4745.mo21322("package-info", EnumC16866.SOURCE)) {
                c1323.f4746.f24146.m33817();
            }
            c1323.f4746.m20879();
        }
        if (c1323.f4745.mo21322("module-info", EnumC16866.SOURCE)) {
            C0052 c0052 = c1323.f4739;
            c0052.f920 = null;
            c0052.f929 = null;
            c0052.f921 = null;
            c0052.f925 = null;
            c0052.f917 = null;
            c0052.f913 = null;
            c0052.f17564 = new InterfaceC6403() { // from class: l.ܳᩴ۠
                @Override // l.InterfaceC6403
                /* JADX INFO: renamed from: ܽ */
                public final /* synthetic */ boolean mo7078() {
                    return false;
                }

                @Override // l.InterfaceC6403
                /* JADX INFO: renamed from: ֫ */
                public final void mo7076(AbstractC5698 abstractC5698) {
                    C3267 c3267 = this.f44914.f21418.f4658;
                    C1323 c1324 = c1323;
                    c3267.m10060(c1324.f4739.f911, C2609.of((Object) c1324));
                }
            };
            c0052.f911.m33817();
            C14163 c14163 = c1323.f4739.f911;
            c14163.f42762 = AbstractC14016.m33607(c14163);
        }
        c1323.f4746 = null;
        this.f21419 = c1323;
        try {
            m33860(c1323.f4738);
        } finally {
            this.f21419 = null;
        }
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1215(C5557 c5557) {
        super.mo1215(c5557);
        C2609 c2609M8239 = C2609.m8239();
        C2609 c2609 = c5557.f17179;
        while (c2609.m8249() && !((AbstractC5144) c2609.f8240).m14709(EnumC18550.f57511)) {
            c2609M8239 = c2609M8239.m8246((AbstractC5144) c2609.f8240);
            c2609 = c2609.f8241;
        }
        if (c2609.m8249() && (((C8526) c2609.f8240).f26046.f7169 & 68719476736L) != 0) {
            C2609 c2609M8246 = c2609.f8241;
            while (c2609M8239.m8249()) {
                c2609M8246 = c2609M8246.m8246((AbstractC5144) c2609M8239.f8240);
                c2609M8239 = c2609M8239.f8241;
            }
            c5557.f17179 = c2609M8246;
        }
        C14163 c14163 = c5557.f17186;
        if (c14163 != null) {
            c14163.f17564 = new C2714(this.f21418, this.f21419);
            Iterator it = c14163.m33811().iterator();
            while (it.hasNext()) {
                C5378.stream(((C21221) it.next()).m48176()).forEach(new Consumer() { // from class: l.᩻ᩴ۠
                    public /* synthetic */ Consumer andThen(Consumer consumer) {
                        return C23517.$default$andThen(this, consumer);
                    }

                    @Override // java.util.function.Consumer
                    /* JADX INFO: renamed from: accept */
                    public final void n(Object obj) {
                        this.f77212.mo1413((C17551) obj);
                    }
                });
            }
            c5557.f17186.f42765 = C2609.m8239();
        }
        c5557.f17186 = null;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1388(C8526 c8526) {
        C3581 c3581;
        if (C7260.m19463(c8526) && (c3581 = c8526.f26045) != null && c3581.f17561.m16090() && c8526.f26043.f8521.m8249() && C7260.m19451((AbstractC5144) c8526.f26043.f8521.f8240)) {
            C2735 c2735 = c8526.f26043;
            C2609 c2609 = c2735.f8521;
            if (((AbstractC11349) c2609.f8240).f16085 == c2735.f16085) {
                c2735.f8521 = c2609.f8241;
            }
        }
        c8526.f26045 = null;
        super.mo1388(c8526);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1392(C9378 c9378) {
        c9378.f28489 = null;
        super.mo1392(c9378);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1419(C19110 c19110) {
        c19110.f60194 = null;
        super.mo1419(c19110);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1393(C9791 c9791) {
        c9791.f2830 = null;
        super.mo1393(c9791);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1382(C6555 c6555) {
        c6555.f2830 = null;
        mo10758(c6555.f20226);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1390(C9085 c9085) {
        c9085.f2830 = null;
        super.mo1390(c9085);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1381(C6262 c6262) {
        c6262.f19396 = null;
        mo10758(c6262.f19397);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1385(C7673 c7673) {
        c7673.f23697 = null;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1413(C17551 c17551) {
        c17551.f53652 = null;
        super.mo1413(c17551);
    }

    public C6947(C1302 c1302) {
        this.f21418 = c1302;
    }
}
