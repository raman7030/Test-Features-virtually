package l;

/* JADX INFO: renamed from: l.ᩴۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18689 extends C14190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C18837 f59097;

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public void mo1386(C7820 c7820) {
    }

    /* JADX INFO: renamed from: ᩳ */
    public abstract void mo15215();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43304(C3872 c3872) {
        this.f59097.m43511(c3872);
        mo15215();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private EnumC3166 m43302(AbstractC5144 abstractC5144, C18837 c18837, EnumC2461 enumC2461) {
        this.f59097 = c18837;
        boolean z = false;
        for (C2609 c2609M43517 = this.f59097.m43517(); c2609M43517.m8249(); c2609M43517 = c2609M43517.f8241) {
            C3872 c3872 = (C3872) c2609M43517.f8240;
            if (c3872.f12387.m14709(enumC2461.f7859) && enumC2461.mo7933(c3872.f12387) == abstractC5144) {
                c3872.mo11694();
                z = true;
            } else {
                this.f59097.m43511(c3872);
            }
        }
        return EnumC3166.m9714(z);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final EnumC3166 m43307(AbstractC5144 abstractC5144) {
        return m43302(abstractC5144, new C18837(), EnumC2461.f7856);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final EnumC3166 m43303(AbstractC5144 abstractC5144, C18837 c18837) {
        return m43302(abstractC5144, c18837, EnumC2461.f7857);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC3166 m43306(AbstractC5144 abstractC5144, C18837 c18837) {
        return m43302(abstractC5144, c18837, EnumC2461.f7855);
    }

    @Override // l.C14190
    /* JADX INFO: renamed from: ۧ */
    public void mo10758(AbstractC5144 abstractC5144) {
        if (abstractC5144 != null) {
            AbstractC4308 abstractC4308 = abstractC5144.f16086;
            if (abstractC4308 == null || abstractC4308 != AbstractC4308.f13886) {
                abstractC5144.mo988(this);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m43305(AbstractC5144 abstractC5144, C17013 c17013) {
        if (abstractC5144.m14709(EnumC18550.f57555)) {
            c17013.f52172 = -1;
            C2322 c2322M39959 = c17013.m39959(null);
            c2322M39959.f7455 = abstractC5144;
            mo10758(c2322M39959);
            return;
        }
        c17013.f52172 = -1;
        C4146 c4146M39906 = c17013.m39906((AbstractC10370) null);
        c4146M39906.f13546 = abstractC5144;
        mo10758(c4146M39906);
    }
}
