package p067l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes4.dex */
public final class C12955 implements InterfaceC8453 {

    /* JADX INFO: renamed from: ۢ֫ */
    public static final C6468 f36424 = new C6468();

    /* JADX INFO: renamed from: ֫֫ */
    public final C18537 f36425;

    /* JADX INFO: renamed from: ۗ */
    public final C16852 f36426;

    /* JADX INFO: renamed from: ۙ */
    public final C11216 f36427;

    /* JADX INFO: renamed from: ۛ */
    public final AbstractC19405 f36428;

    /* JADX INFO: renamed from: ۜ֫ */
    public final C18318 f36429;

    /* JADX INFO: renamed from: ۟ */
    public final C23623 f36430;

    /* JADX INFO: renamed from: ۤ */
    public final C19694 f36431;

    /* JADX INFO: renamed from: ۧ֫ */
    public final C18213 f36432;

    /* JADX INFO: renamed from: ۨ */
    public final C8005 f36433;

    /* JADX INFO: renamed from: ۫ */
    public boolean f36434 = true;

    /* JADX INFO: renamed from: ۬ */
    public final C14315 f36435 = new C14315(this);

    /* JADX INFO: renamed from: ܰ */
    public final C6953 f36436;

    /* JADX INFO: renamed from: ܳ֫ */
    public AbstractC15655 f36437;

    /* JADX INFO: renamed from: ܽ֫ */
    public final C8200 f36438;

    /* JADX INFO: renamed from: ܿ֫ */
    public final C6899 f36439;

    /* JADX INFO: renamed from: ᩳ֫ */
    public final C22004 f36440;

    /* JADX INFO: renamed from: ᩶ */
    public final C15099 f36441;

    /* JADX INFO: renamed from: ᩷֫ */
    public final C8374 f36442;

    /* JADX INFO: renamed from: ᩸ */
    public boolean f36443;

    /* JADX INFO: renamed from: ᩹ */
    public boolean f36444;

    /* JADX INFO: renamed from: ᩺ */
    public final C15492 f36445;

    /* JADX INFO: renamed from: ᩻֫ */
    public final C18728 f36446;

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ܽ */
    public final /* synthetic */ boolean mo9173() {
        return false;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C5771 m29690(C12955 c12955, AbstractC21195 abstractC21195, AbstractC12224 abstractC12224, C4848 c4848) {
        c12955.getClass();
        AbstractC15689 abstractC15689Mo17983 = abstractC21195.mo17983();
        C17667 c17667 = new C17667();
        abstractC15689Mo17983.getClass();
        for (AbstractC7783 abstractC7783 : abstractC15689Mo17983.mo22457(abstractC12224, c17667, EnumC3620.RECURSIVE)) {
            if (c12955.f36442.m19489(abstractC7783.f20406.mo14797(), c4848)) {
                return (C5771) abstractC7783;
            }
        }
        return null;
    }

    public C12955(C5127 c5127) {
        c5127.m10908(f36424, this);
        this.f36438 = C8200.m18988(c5127);
        this.f36445 = C15492.m35238(c5127);
        this.f36432 = C18213.m41428(c5127);
        this.f36430 = C23623.m52439(c5127);
        this.f36426 = C16852.m38215(c5127);
        this.f36427 = C11216.m25910(c5127);
        this.f36440 = C22004.m49577(c5127);
        this.f36425 = C18537.m42139(c5127);
        this.f36439 = C6899.m15810(c5127);
        this.f36441 = C15099.m34493(c5127);
        this.f36446 = C18728.m42754(c5127);
        this.f36442 = C8374.m19396(c5127);
        this.f36433 = C8005.m18541(c5127);
        this.f36431 = C19694.m44728(c5127);
        this.f36436 = C6953.m15930(c5127);
        this.f36429 = C18318.m41754(c5127);
        this.f36428 = AbstractC19405.m44186(c5127);
        C24387.m53737(c5127);
        EnumC17840 enumC17840M40515 = EnumC17840.m40515(c5127);
        this.f36444 = EnumC12477.f34967.m28726(enumC17840M40515);
        this.f36443 = EnumC12477.f34955.m28726(enumC17840M40515);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29713(C4848 c4848) {
        Iterator it = c4848.iterator();
        while (it.hasNext()) {
            final C3626 c3626 = (C3626) it.next();
            if (!c3626.f7511.m53832()) {
                final C4036 c4036M35244 = this.f36445.m35244(c3626);
                m29712(c3626, new Runnable() { // from class: l.ܳᩳ۠
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47978.f36435.m32886(c3626, c4036M35244);
                    }
                });
            }
        }
    }

    @Override // p067l.InterfaceC8453
    /* JADX INFO: renamed from: ֫ */
    public final void mo9171(AbstractC7783 abstractC7783) {
        AbstractC19405 abstractC19405 = this.f36428;
        C15099 c15099 = this.f36441;
        if (!this.f36434) {
            C1446.m31704((abstractC7783.mo18003() & 16777216) == 0);
            abstractC7783.f20410 = this;
            return;
        }
        try {
            c15099.m34512();
            abstractC7783.f20409 |= 268435456;
            abstractC19405.mo27130((C15828) abstractC7783, EnumC13844.MEMBER_ENTER);
            try {
                C4848<C4036> c4848M35582 = this.f36435.m35582(C4848.m10276of((Object) this.f36429.m41755((C15828) abstractC7783)));
                abstractC19405.mo27129();
                if (!c4848M35582.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (C4036 c4036 : c4848M35582) {
                        if (c4036.f8851.f7509.contains(c4036.f8855) && hashSet.add(c4036.f8851)) {
                            m29712(c4036.f8851, new RunnableC25044());
                        }
                    }
                }
                c15099.m34516();
            } catch (Throwable th) {
                abstractC19405.mo27129();
                throw th;
            }
        } catch (Throwable th2) {
            c15099.m34516();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29712(C3626 c3626, Runnable runnable) {
        C16852 c16852 = this.f36426;
        InterfaceC19740 interfaceC19740 = c3626.f7516;
        C23623 c23623 = this.f36430;
        InterfaceC19740 interfaceC19740M9363 = c23623.m9363(interfaceC19740);
        try {
            runnable.run();
            c16852.m38350(c3626);
            c16852.m38337(c3626);
            c16852.m38278(c3626);
            c3626.f7513.mo17619();
            c3626.f7511.mo17619();
        } catch (C21865 e) {
            c16852.m38271(c3626, e);
        } finally {
            c23623.m9363(interfaceC19740M9363);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final C10471 m29711(final C18537 c18537, C16996 c16996) {
        AbstractC14355 abstractC14355M42194;
        AbstractC6462 abstractC6462Mo22403 = c16996.mo22403();
        C5771 c5771Mo22405 = c16996.mo22405();
        C20271 c20271 = new C20271();
        if (c16996.f50258.f20406 != this.f36440.f69208) {
            boolean zM14777 = c16996.mo23908().m14777(EnumC11353.NONE);
            C8200 c8200 = this.f36438;
            if (!zM14777) {
                abstractC14355M42194 = c18537.m42155(c18537.m42157((AbstractC7783) c5771Mo22405.f14172.f11034), c8200.f21756);
            } else {
                abstractC14355M42194 = c18537.m42194(c8200.f21756);
            }
            c20271.m45777(c18537.m42196(c18537.m42172(abstractC14355M42194, abstractC6462Mo22403.mo14802().m10293() ? c18537.m42210(abstractC6462Mo22403.mo14802()) : null, c16996.mo23907().m10287(new Function() { // from class: l.ۡᩳ۠
                @Override // java.util.function.Function
                /* JADX INFO: renamed from: andThen */
                public /* synthetic */ Function mo56417andThen(Function function) {
                    return C22038.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return c18537.m42194((AbstractC12224) obj);
                }

                @Override // java.util.function.Function
                public /* synthetic */ Function compose(Function function) {
                    return C22038.$default$compose(this, function);
                }
            }))));
        }
        return c16996.mo22404(c18537.m42161(c5771Mo22405, c5771Mo22405.f20406, c18537.m42145(0L, c20271.m45783())));
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m29714(AbstractC7783 abstractC7783, C4848 c4848, C4036 c4036) {
        C11216 c11216 = this.f36427;
        c11216.getClass();
        for (C4848 c4849 = c4848; c4849.m10293(); c4849 = c4849.f11035) {
            c11216.m25963(((C19049) c4849.f11034).f56840, c4036, AbstractC6462.f16700);
        }
        while (!c4848.isEmpty()) {
            C19049 c19049 = (C19049) c4848.f11034;
            AbstractC6462 abstractC6462 = c19049.f56840.f18925;
            C22004 c22004 = this.f36440;
            AbstractC6462 abstractC6463 = c22004.f69130;
            C8200 c8200 = this.f36438;
            if (abstractC6462 == abstractC6463) {
                abstractC7783.f20409 |= 18014398509613056L;
                m29694(c19049, abstractC7783, c8200.f21690, 36028797018963968L);
            } else if (abstractC6462 == c22004.f69173) {
                abstractC7783.f20409 |= 72057594037927936L;
                m29694(c19049, abstractC7783, c8200.f21750, 288230376151711744L);
            }
            c4848 = c4848.f11035;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m29694(C19049 c19049, final AbstractC7783 abstractC7783, AbstractC12224 abstractC12224, final long j) {
        C7480.stream(c19049.f56843).filter(new C8951()).map(new C22363(0)).filter(new C7288(2, abstractC12224)).findFirst().ifPresent(new Consumer() { // from class: l.ۢᩳ۠
            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C24719.$default$andThen(this, consumer);
            }

            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void m45213n(Object obj) {
                AbstractC14355 abstractC14355M21424 = C9268.m21424(((C22403) obj).f70671);
                if (abstractC14355M21424.m16617(EnumC19998.f60804) && Boolean.TRUE.equals(((C24552) abstractC14355M21424).m54150())) {
                    abstractC7783.f20409 |= j;
                }
            }
        });
    }
}
