package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩻ܽ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes.dex */
public final class C23817 extends AbstractC15185 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6884 f77068;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC4308 f77069;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23817(C6884 c6884, C6755 c6755, C1386 c1386, AbstractC4308 abstractC4308) {
        super(c6884.f21273, true, c6755, c1386);
        this.f77068 = c6884;
        this.f77069 = abstractC4308;
    }

    @Override // l.AbstractC15185, l.InterfaceC3953
    /* JADX INFO: renamed from: ֫ */
    public final boolean mo3859(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, C1386 c1386) {
        AbstractC4308 abstractC43010;
        AbstractC5144 abstractC5144Mo3824;
        C22406 c22406 = this.f77068.f21273;
        if (c22406.f72590 && m52508(abstractC4308, abstractC4309) && (abstractC43010 = this.f77069) != null && abstractC43010.mo3258() == EnumC9454.DEFERRED && (abstractC5144Mo3824 = ((C1110) abstractC43010).mo3824(this.f46399)) != c22406.f72606.f37354) {
            return m52505(abstractC4308, abstractC4309, abstractC5144Mo3824);
        }
        return m52504(abstractC4308, abstractC4309);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m52504(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        C22406 c22406 = this.f77068.f21273;
        if (!this.f46401 && abstractC4308.mo12941() != abstractC4309.mo12941()) {
            abstractC4308 = abstractC4308.mo12941() ? c22406.f72597.m17496(abstractC4308).f17560 : c22406.f72597.m17563(abstractC4308);
        }
        return c22406.f72597.m17546(abstractC4308, this.f46399.f20968.m1868(abstractC4309), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean m52508(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        C22406 c22406 = this.f77068.f21273;
        C6319 c6319 = c22406.f72597;
        AbstractC19810 abstractC19810 = abstractC4308.f13890;
        c6319.getClass();
        try {
            c6319.m17493(abstractC19810);
            C6319 c63110 = c22406.f72597;
            AbstractC19810 abstractC19811 = abstractC4309.f13890;
            c63110.getClass();
            c63110.m17493(abstractC19811);
            return m52510(abstractC4308, abstractC4309);
        } catch (C6130 unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    private boolean m52510(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309) {
        boolean zMo5146 = abstractC4308.mo5146();
        C6884 c6884 = this.f77068;
        if (zMo5146) {
            Iterator it = c6884.f21273.f72597.m17510(abstractC4308).iterator();
            while (it.hasNext()) {
                if (!m52510((AbstractC4308) it.next(), abstractC4309)) {
                    return false;
                }
            }
            return true;
        }
        if (!abstractC4309.mo5146()) {
            return c6884.f21273.f72597.m17527(abstractC4309.f13890, abstractC4308) == null && c6884.f21273.f72597.m17527(abstractC4308.f13890, abstractC4309) == null;
        }
        Iterator it2 = c6884.f21273.f72597.m17510(abstractC4309).iterator();
        while (it2.hasNext()) {
            if (!m52510(abstractC4308, (AbstractC4308) it2.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean m52505(AbstractC4308 abstractC4308, AbstractC4308 abstractC4309, AbstractC5144 abstractC5144) {
        C0384 c0384 = this.f46399.f20968;
        C22406 c22406 = this.f77068.f21273;
        C6319 c6319 = c22406.f72597;
        AbstractC4308 abstractC4308M17538 = c6319.m17538(c6319.m17523(abstractC4308));
        AbstractC4308 abstractC4308M17539 = c22406.f72597.m17538(abstractC4308);
        AbstractC4308 abstractC4308M175310 = c22406.f72597.m17538(abstractC4309);
        C2609 c2609Mo12938 = abstractC4308M17538.mo12938();
        C2609 c2609Mo12939 = abstractC4308M17539.mo12938();
        C2609 c2609Mo129310 = abstractC4308M175310.mo12938();
        if (abstractC4308M17538.m12913(EnumC9454.FORALL) && !c22406.f72597.m17507((C10077) abstractC4308M17538, (C10077) abstractC4308M17539)) {
            return false;
        }
        C2609 c2609 = c2609Mo12938;
        C2609 c26010 = c2609Mo129310;
        while (c2609.m8249() && c26010.m8249()) {
            AbstractC4308 abstractC4308Mo12939 = ((AbstractC4308) c2609.f8240).mo12939();
            AbstractC4308 abstractC4308M17488 = c22406.f72597.m17488(((AbstractC4308) c26010.f8240).mo12939(), c2609Mo129310, c2609Mo12938);
            if ((abstractC4308Mo12939.m12928(c2609Mo12938) && abstractC4308M17488.m12928(c0384.f1817)) || !c22406.f72597.m17550(abstractC4308Mo12939, c0384.m1868(abstractC4308M17488))) {
                return false;
            }
            c2609 = c2609.f8241;
            c26010 = c26010.f8241;
        }
        if (!c2609.isEmpty() || !c26010.isEmpty()) {
            return false;
        }
        C2609 c2609Mo12933 = abstractC4308M17538.mo12933();
        C2609 c2609Mo12934 = abstractC4308M17539.mo12933();
        C2609 c2609Mo12935 = abstractC4308M175310.mo12933();
        while (c2609Mo12933.m8249() && c2609Mo12934.m8249() && c2609Mo12935.m8249()) {
            AbstractC4308 abstractC43010 = (AbstractC4308) c2609Mo12933.f8240;
            AbstractC4308 abstractC4308M17489 = c22406.f72597.m17488((AbstractC4308) c2609Mo12934.f8240, c2609Mo12939, c2609Mo12938);
            AbstractC4308 abstractC4308M174810 = c22406.f72597.m17488((AbstractC4308) c2609Mo12935.f8240, c2609Mo129310, c2609Mo12938);
            if (abstractC43010.m12928(c2609Mo12938) && abstractC4308M174810.m12928(c0384.f1817)) {
                return false;
            }
            C2609 c26011 = c2609Mo12939;
            if (!c22406.f72597.m17546(c0384.m1868(abstractC4308M174810), abstractC43010, true) || !c22406.f72597.m17550(abstractC4308M17489, c0384.m1868(abstractC4308M174810))) {
                return false;
            }
            c2609Mo12933 = c2609Mo12933.f8241;
            c2609Mo12934 = c2609Mo12934.f8241;
            c2609Mo12935 = c2609Mo12935.f8241;
            c2609Mo12939 = c26011;
        }
        if (!c2609Mo12933.isEmpty() || !c2609Mo12934.isEmpty() || !c2609Mo12935.isEmpty()) {
            return false;
        }
        AbstractC4308 abstractC4308Mo12923 = abstractC4308M17538.mo12923();
        AbstractC4308 abstractC4308M174811 = c22406.f72597.m17488(abstractC4308M175310.mo12923(), c2609Mo129310, c2609Mo12938);
        if (abstractC4308Mo12923.m12928(c2609Mo12938) && abstractC4308M174811.m12928(c0384.f1817)) {
            return false;
        }
        C14644 c14644 = new C14644(this, abstractC4308Mo12923, abstractC4308M174811);
        c14644.mo10758(abstractC5144);
        return c14644.f44761;
    }
}
