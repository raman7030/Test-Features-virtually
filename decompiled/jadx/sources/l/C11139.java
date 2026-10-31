package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11139 implements InterfaceC6403 {

    /* JADX INFO: renamed from: ۢ֫, reason: not valid java name and contains not printable characters */
    public static final C4314 f33424 = new C4314();

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    public final C17013 f33425;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final C15240 f33426;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9310 f33427;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AbstractC17926 f33428;

    /* JADX INFO: renamed from: ۜ֫, reason: not valid java name and contains not printable characters */
    public final C16782 f33429;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C22364 f33430;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18230 f33431;

    /* JADX INFO: renamed from: ۧ֫, reason: not valid java name and contains not printable characters */
    public final C16672 f33432;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5931 f33433;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f33434 = true;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C12570 f33435 = new C12570(this);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4824 f33436;

    /* JADX INFO: renamed from: ܳ֫, reason: not valid java name and contains not printable characters */
    public AbstractC13980 f33437;

    /* JADX INFO: renamed from: ܽ֫, reason: not valid java name and contains not printable characters */
    public final C6136 f33438;

    /* JADX INFO: renamed from: ܿ֫, reason: not valid java name and contains not printable characters */
    public final C4767 f33439;

    /* JADX INFO: renamed from: ᩳ֫, reason: not valid java name and contains not printable characters */
    public final C20661 f33440;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C13395 f33441;

    /* JADX INFO: renamed from: ᩷֫, reason: not valid java name and contains not printable characters */
    public final C6319 f33442;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f33443;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f33444;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C13809 f33445;

    /* JADX INFO: renamed from: ᩻֫, reason: not valid java name and contains not printable characters */
    public final C17214 f33446;

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo7078() {
        return false;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C3581 m27628(C11139 c11139, AbstractC19810 abstractC19810, AbstractC10370 abstractC10370, C2609 c2609) {
        c11139.getClass();
        AbstractC14016 abstractC14016Mo16064 = abstractC19810.mo16064();
        C16097 c16097 = new C16097();
        abstractC14016Mo16064.getClass();
        for (AbstractC5698 abstractC5698 : abstractC14016Mo16064.mo20477(abstractC10370, c16097, EnumC1317.RECURSIVE)) {
            if (c11139.f33442.m17549(abstractC5698.f17560.mo12933(), c2609)) {
                return (C3581) abstractC5698;
            }
        }
        return null;
    }

    public C11139(C2903 c2903) {
        c2903.m8841(f33424, this);
        this.f33438 = C6136.m17057(c2903);
        this.f33445 = C13809.m33121(c2903);
        this.f33432 = C16672.m39193(c2903);
        this.f33430 = C22364.m50099(c2903);
        this.f33426 = C15240.m36054(c2903);
        this.f33427 = C9310.m23901(c2903);
        this.f33440 = C20661.m47250(c2903);
        this.f33425 = C17013.m39896(c2903);
        this.f33439 = C4767.m13930(c2903);
        this.f33441 = C13395.m32391(c2903);
        this.f33446 = C17214.m40507(c2903);
        this.f33442 = C6319.m17456(c2903);
        this.f33433 = C5931.m16615(c2903);
        this.f33431 = C18230.m42469(c2903);
        this.f33436 = C4824.m14050(c2903);
        this.f33429 = C16782.m39518(c2903);
        this.f33428 = AbstractC17926.m41937(c2903);
        C23168.m51341(c2903);
        EnumC16280 enumC16280M38301 = EnumC16280.m38301(c2903);
        this.f33444 = EnumC10637.f31996.m26686(enumC16280M38301);
        this.f33443 = EnumC10637.f31984.m26686(enumC16280M38301);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27651(C2609 c2609) {
        Iterator it = c2609.iterator();
        while (it.hasNext()) {
            final C1323 c1323 = (C1323) it.next();
            if (!c1323.f4740.m51436()) {
                final C1755 c1755M33127 = this.f33445.m33127(c1323);
                m27650(c1323, new Runnable() { // from class: l.ܳᩳ۠
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f44863.f33435.m30811(c1323, c1755M33127);
                    }
                });
            }
        }
    }

    @Override // l.InterfaceC6403
    /* JADX INFO: renamed from: ֫ */
    public final void mo7076(AbstractC5698 abstractC5698) {
        AbstractC17926 abstractC17926 = this.f33428;
        C13395 c13395 = this.f33441;
        if (!this.f33434) {
            C12171.m29642((abstractC5698.mo16084() & 16777216) == 0);
            abstractC5698.f17564 = this;
            return;
        }
        try {
            c13395.m32410();
            abstractC5698.f17563 |= 268435456;
            abstractC17926.mo25113((C14163) abstractC5698, EnumC12075.MEMBER_ENTER);
            try {
                C2609<C1755> c2609M33462 = this.f33435.m33462(C2609.of((Object) this.f33429.m39519((C14163) abstractC5698)));
                abstractC17926.mo25112();
                if (!c2609M33462.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (C1755 c1755 : c2609M33462) {
                        if (c1755.f6075.f4738.contains(c1755.f6079) && hashSet.add(c1755.f6075)) {
                            m27650(c1755.f6075, new RunnableC23859());
                        }
                    }
                }
                c13395.m32414();
            } catch (Throwable th) {
                abstractC17926.mo25112();
                throw th;
            }
        } catch (Throwable th2) {
            c13395.m32414();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27650(C1323 c1323, Runnable runnable) {
        C15240 c15240 = this.f33426;
        InterfaceC18278 interfaceC18278 = c1323.f4745;
        C22364 c22364 = this.f33430;
        InterfaceC18278 interfaceC18278M7284 = c22364.m7284(interfaceC18278);
        try {
            runnable.run();
            c15240.m36189(c1323);
            c15240.m36176(c1323);
            c15240.m36117(c1323);
            c1323.f4742.mo15705();
            c1323.f4740.mo15705();
        } catch (C20515 e) {
            c15240.m36110(c1323, e);
        } finally {
            c22364.m7284(interfaceC18278M7284);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C8526 m27649(final C17013 c17013, C15391 c15391) {
        AbstractC12612 abstractC12612M39951;
        AbstractC4308 abstractC4308Mo20424 = c15391.mo20424();
        C3581 c3581Mo20426 = c15391.mo20426();
        C18837 c18837 = new C18837();
        if (c15391.f47128.f17560 != this.f33440.f66526) {
            boolean zM12913 = c15391.mo21938().m12913(EnumC9454.NONE);
            C6136 c6136 = this.f33438;
            if (!zM12913) {
                abstractC12612M39951 = c17013.m39912(c17013.m39914((AbstractC5698) c3581Mo20426.f11367.f8240), c6136.f18898);
            } else {
                abstractC12612M39951 = c17013.m39951(c6136.f18898);
            }
            c18837.m43511(c17013.m39953(c17013.m39929(abstractC12612M39951, abstractC4308Mo20424.mo12938().m8249() ? c17013.m39967(abstractC4308Mo20424.mo12938()) : null, c15391.mo21937().m8243(new Function() { // from class: l.ۡᩳ۠
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo22274andThen(Function function) {
                    return C20696.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c17013.m39951((AbstractC10370) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C20696.$default$compose(this, function);
                }
            }))));
        }
        return c15391.mo20425(c17013.m39918(c3581Mo20426, c3581Mo20426.f17560, c17013.m39902(0L, c18837.m43517())));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m27652(AbstractC5698 abstractC5698, C2609 c2609, C1755 c1755) {
        C9310 c9310 = this.f33427;
        c9310.getClass();
        for (C2609 c26010 = c2609; c26010.m8249(); c26010 = c26010.f8241) {
            c9310.m23954(((C17551) c26010.f8240).f53650, c1755, AbstractC4308.f13885);
        }
        while (!c2609.isEmpty()) {
            C17551 c17551 = (C17551) c2609.f8240;
            AbstractC4308 abstractC4308 = c17551.f53650.f16086;
            C20661 c20661 = this.f33440;
            AbstractC4308 abstractC4309 = c20661.f66448;
            C6136 c6136 = this.f33438;
            if (abstractC4308 == abstractC4309) {
                abstractC5698.f17563 |= 18014398509613056L;
                m27632(c17551, abstractC5698, c6136.f18832, 36028797018963968L);
            } else if (abstractC4308 == c20661.f66491) {
                abstractC5698.f17563 |= 72057594037927936L;
                m27632(c17551, abstractC5698, c6136.f18892, 288230376151711744L);
            }
            c2609 = c2609.f8241;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m27632(C17551 c17551, final AbstractC5698 abstractC5698, AbstractC10370 abstractC10370, final long j) {
        C5378.stream(c17551.f53653).filter(new C6926()).map(new C21038(0)).filter(new C5176(2, abstractC10370)).findFirst().ifPresent(new Consumer() { // from class: l.ۢᩳ۠
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C23517.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                AbstractC12612 abstractC12612M19458 = C7260.m19458(((C21080) obj).f67988);
                if (abstractC12612M19458.m14709(EnumC18550.f57580) && Boolean.TRUE.equals(((C23342) abstractC12612M19458).m51753())) {
                    abstractC5698.f17563 |= j;
                }
            }
        });
    }
}
