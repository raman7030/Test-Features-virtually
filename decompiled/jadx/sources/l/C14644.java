package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14644 extends C20161 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f44761 = true;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f44762;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23817 f44763;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 f44764;

    public C14644(C23817 c23817, AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        this.f44763 = c23817;
        this.f44764 = abstractC4308;
        this.f44762 = abstractC4309;
    }

    @Override // l.AbstractC15220
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void mo34934() {
        this.f44761 = false;
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1387(C8379 c8379) {
        mo10758(m34932(c8379.f25699));
        mo10758(m34932(c8379.f25700));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1391(C9232 c9232) {
        EnumC9454 enumC9454 = EnumC9454.VOID;
        AbstractC4308 abstractC4308 = this.f44762;
        if (abstractC4308.m12913(enumC9454)) {
            this.f44761 = this.f44761;
            return;
        }
        AbstractC4308 abstractC4309 = this.f44764;
        boolean z = false;
        if (abstractC4309.m12913(enumC9454)) {
            this.f44761 = false;
            return;
        }
        if (abstractC4309.mo12941() != abstractC4308.mo12941()) {
            boolean z2 = c9232.f27941 == EnumC19816.STANDALONE && c9232.f27943.f17560.mo12923().mo12941();
            boolean z3 = this.f44761;
            if (z2 == abstractC4309.mo12941() && z2 != abstractC4308.mo12941()) {
                z = true;
            }
            this.f44761 = z3 & z;
            return;
        }
        this.f44761 &= this.f44763.m52504(abstractC4309, abstractC4308);
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1405(C14875 c14875) {
        mo10758(m34932(c14875.f45392));
    }

    @Override // l.C14190, l.AbstractC0204
    /* JADX INFO: renamed from: ֫ */
    public final void mo1217(C14169 c14169) {
        C2609<AbstractC12612> c2609M43517;
        EnumC9454 enumC9454 = EnumC9454.VOID;
        AbstractC4308 abstractC4308 = this.f44762;
        if (abstractC4308.m12913(enumC9454)) {
            this.f44761 = this.f44761;
            return;
        }
        AbstractC4308 abstractC4309 = this.f44764;
        if (abstractC4309.m12913(enumC9454)) {
            this.f44761 = false;
            return;
        }
        if (c14169.m33819() == EnumC13706.EXPRESSION) {
            c2609M43517 = C2609.of((Object) m34932((AbstractC12612) c14169.f42776));
        } else {
            C18837 c18837 = new C18837();
            new C17467(this, c18837).mo10758(c14169.f42776);
            c2609M43517 = c18837.m43517();
        }
        boolean zIsEmpty = c2609M43517.isEmpty();
        C23817 c23817 = this.f44763;
        if (!zIsEmpty && c23817.m52508(abstractC4309, abstractC4308)) {
            Iterator it = c2609M43517.iterator();
            while (it.hasNext()) {
                this.f44761 = c23817.m52505(abstractC4309, abstractC4308, (AbstractC12612) it.next()) & this.f44761;
            }
            return;
        }
        if (!c2609M43517.isEmpty() && abstractC4309.mo12941() != abstractC4308.mo12941()) {
            for (AbstractC12612 abstractC12612 : c2609M43517) {
                boolean z = true;
                boolean z2 = abstractC12612.mo12874() && abstractC12612.f16086.mo12941();
                boolean z3 = this.f44761;
                if (z2 != abstractC4309.mo12941() || z2 == abstractC4308.mo12941()) {
                    z = false;
                }
                this.f44761 = z3 & z;
            }
            return;
        }
        this.f44761 &= c23817.m52504(abstractC4309, abstractC4308);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public AbstractC12612 m34932(AbstractC12612 abstractC12612) {
        if (abstractC12612.f16086.m12913(EnumC9454.DEFERRED)) {
            C1110 c1110 = (C1110) abstractC12612.f16086;
            C23817 c23817 = this.f44763;
            AbstractC5144 abstractC5144Mo3824 = c1110.mo3824(c23817.f46399);
            if (abstractC5144Mo3824 != c23817.f77068.f21273.f72606.f37354) {
                return (AbstractC12612) abstractC5144Mo3824;
            }
        }
        return abstractC12612;
    }
}
