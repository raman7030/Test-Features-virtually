package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.۠ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7898 {

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final C4314 f24468 = new C4314();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C9310 f24469;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C12399 f24470;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C6319 f24471;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C17013 f24472;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C20661 f24473;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C18837 f24474 = new C18837();

    public C7898(C2903 c2903) {
        c2903.m8841(f24468, this);
        this.f24469 = C9310.m23901(c2903);
        this.f24470 = C12399.m30567(c2903);
        C6136.m17057(c2903);
        this.f24472 = C17013.m39896(c2903);
        this.f24473 = C20661.m47250(c2903);
        this.f24471 = C6319.m17456(c2903);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m21193() {
        AbstractC4308 abstractC4308M21191;
        C17013 c17013;
        while (true) {
            C18837 c18837 = this.f24474;
            if (!c18837.m43518()) {
                return;
            }
            C5076 c5076 = (C5076) c18837.remove();
            C18837 c18838 = new C18837();
            C1755 c1755 = c5076.f15955;
            C1755 c1756 = c5076.f15955;
            C23420 c23420 = c5076.f15959;
            AbstractC5698 abstractC5698 = c5076.f15954;
            boolean zM14709 = c1755.f6074.m14709(EnumC18550.f57534);
            boolean z = false;
            C20661 c20661 = this.f24473;
            if (zM14709) {
                C15580 c15580 = (C15580) c1755.f6074;
                boolean z2 = (abstractC5698.mo16084() & 17179869184L) != 0;
                if (z2 || c15580.f48012.m8245() <= abstractC5698.f17560.mo12933().m8245()) {
                    C2609 c2609 = c15580.f48012;
                    C2609 c2609Mo12933 = abstractC5698.f17560.mo12933();
                    while (true) {
                        boolean zM8249 = c2609.m8249();
                        c17013 = this.f24472;
                        if (!zM8249 || !c2609Mo12933.m8249()) {
                            break;
                        }
                        AbstractC12612 abstractC12612 = (AbstractC12612) c2609.f8240;
                        AbstractC4308 abstractC4308 = (c2609Mo12933.f8241.m8249() || !z2) ? (AbstractC4308) c2609Mo12933.f8240 : ((C5138) c2609Mo12933.f8240).f16077;
                        if (abstractC12612.m14709(EnumC18550.f57523)) {
                            C14169 c14169 = (C14169) abstractC12612;
                            if (c14169.f42773 == EnumC16992.IMPLICIT) {
                                for (Iterator it = c14169.f42775.iterator(); it.hasNext(); it = it) {
                                    ((C9378) it.next()).f28488 = null;
                                }
                            }
                            C6319 c6319 = this.f24471;
                            if (c6319.m17558(abstractC4308)) {
                                boolean zM12913 = c6319.m17538(abstractC4308).mo12923().m12913(EnumC9454.VOID);
                                c14169.f42776 = new C0136(this, zM12913, c18838, c14169).mo23617(c14169.f42776);
                                if (!zM12913) {
                                    C3440 c3440M39948 = c17013.m39948();
                                    c3440M39948.f16086 = c20661.f66457;
                                    C9938 c9938M39964 = c17013.m39964(c3440M39948);
                                    C2735 c2735 = (C2735) c14169.f42776;
                                    c2735.f8521 = c2735.f8521.m8242(c9938M39964);
                                    c18838.m43511(new RunnableC8757(1, c14169, c9938M39964));
                                }
                            }
                            z = true;
                        }
                        c2609 = c2609.f8241;
                        if (c2609Mo12933.f8241.m8249() || !z2) {
                            c2609Mo12933 = c2609Mo12933.f8241;
                        }
                    }
                    C2609 c26010 = c15580.f48012;
                    while (c2609Mo12933.m8249()) {
                        C2609 c26011 = c15580.f48012;
                        C3440 c3440M39949 = c17013.m39948();
                        c3440M39949.f16086 = c20661.f66457;
                        c15580.f48012 = c26011.m8242(c3440M39949);
                        c2609Mo12933 = c2609Mo12933.f8241;
                        z = true;
                    }
                    c18838.m43511(new RunnableC16460(3, c15580, c26010));
                }
            }
            if (z) {
                C2609 c2609M19435 = C7260.m19435(c1755.f6074);
                AbstractC4308 abstractC4309 = c23420.f75219;
                AbstractC4308 abstractC43010 = c23420.f75219;
                C2609 c2609Mo12934 = abstractC4309.mo12933();
                while (c2609Mo12934.m8245() < c2609M19435.m8245()) {
                    c2609Mo12934 = c2609Mo12934.m8242(c20661.f66457);
                }
                AbstractC4308 abstractC43011 = c5076.f15958;
                AbstractC5698 abstractC5699 = c5076.f15954;
                C9310 c9310 = this.f24469;
                C11003.requireNonNull(c9310);
                abstractC4308M21191 = c9310.m23927(abstractC43011, abstractC5699, new C23420(c9310, c23420.f75217, abstractC43010.mo12923(), c23420.f75215, c23420.f75216), c1756, c2609M19435, c2609Mo12934, abstractC43010.mo12938());
                C5378.stream(c18838).forEach(new C2254());
            } else {
                abstractC4308M21191 = m21191(c5076.f15956, c5076.f15958, c5076.f15957, c1756, c5076.f15959);
            }
            c5076.f15956.f16086 = abstractC4308M21191;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final AbstractC4308 m21192(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C1755 c1755, C23420 c23420) {
        if ((abstractC5698.f17563 & 1099511627776L) != 0 && ((C8604) c1755.f6073).f26283.m20102()) {
            AbstractC5698 abstractC5699 = ((C0842) abstractC5698.f17560).f3322;
            this.f24469.getClass();
            this.f24474.m43511(new C5076(abstractC5144, abstractC4308, abstractC5698, abstractC5699, C9310.m23919(c1755), c23420));
            return this.f24473.f66457;
        }
        return m21191(abstractC5144, abstractC4308, abstractC5698, c1755, c23420);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private AbstractC4308 m21191(AbstractC5144 abstractC5144, AbstractC4308 abstractC4308, AbstractC5698 abstractC5698, C1755 c1755, C23420 c23420) {
        AbstractC4308 abstractC4309 = c23420.f75219;
        C12399 c12399 = this.f24470;
        C11003.requireNonNull(c12399);
        C3227 c3227 = new C3227(c12399, EnumC13829.SPECULATIVE, abstractC5698, ((C8604) c1755.f6073).f26288);
        abstractC4309.getClass();
        AbstractC4308 abstractC4308M23933 = this.f24469.m23933(abstractC5144, abstractC4308, abstractC5698, (AbstractC4308) c3227.m21837(null, abstractC4309), c1755, c23420);
        AbstractC4308 abstractC43010 = c23420.f75219;
        C11003.requireNonNull(c12399);
        C3227 c3228 = new C3227(c12399, EnumC13829.CHECK, abstractC5698, ((C8604) c1755.f6073).f26288);
        abstractC43010.getClass();
        return abstractC4308M23933;
    }
}
