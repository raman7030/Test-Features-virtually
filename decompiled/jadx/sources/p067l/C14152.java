package p067l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫۫֨, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14152 extends AbstractC2562 {

    /* JADX INFO: renamed from: ֨ */
    public static final C6468 f40353 = new C6468();

    /* JADX INFO: renamed from: ֡ */
    public final C21339 f40354;

    /* JADX INFO: renamed from: ֫ */
    public final C15099 f40355;

    /* JADX INFO: renamed from: ۖ */
    public final C23623 f40356;

    /* JADX INFO: renamed from: ۘ */
    public final C18537 f40357;

    /* JADX INFO: renamed from: ۚ */
    public final C8374 f40358;

    /* JADX INFO: renamed from: ۜ */
    public C13501 f40359 = new C13501();

    /* JADX INFO: renamed from: ۡ */
    public final C12083 f40360;

    /* JADX INFO: renamed from: ۢ */
    public final C15492 f40361;

    /* JADX INFO: renamed from: ۧ */
    public final C7664 f40362;

    /* JADX INFO: renamed from: ܳ */
    public final C3680 f40363;

    /* JADX INFO: renamed from: ܺ */
    public final C8769 f40364;

    /* JADX INFO: renamed from: ܽ */
    public final C11216 f40365;

    /* JADX INFO: renamed from: ܿ */
    public final C4271 f40366;

    /* JADX INFO: renamed from: ᩳ */
    public final C16852 f40367;

    /* JADX INFO: renamed from: ᩴ */
    public final C23663 f40368;

    /* JADX INFO: renamed from: ᩵ */
    public final C9661 f40369;

    /* JADX INFO: renamed from: ᩷ */
    public final C14841 f40370;

    /* JADX INFO: renamed from: ᩻ */
    public final C8005 f40371;

    /* JADX INFO: renamed from: ֫ */
    public final AbstractC7257 m32632(AbstractC7257 abstractC7257, C4036 c4036, C24626 c24626, C21339 c21339, C13739 c13739, EnumC9477 enumC9477, C22417 c22417) {
        final AbstractC7257 abstractC7257Mo10751 = c21339.mo10751(abstractC7257, (Object) null);
        C15492 c15492 = this.f40361;
        C10545 c10545 = (C10545) c4036.f8849;
        AbstractC15689 abstractC15689 = c10545.f29201;
        C4036 c4036M8087 = c4036.m8087(abstractC7257Mo10751, c10545.m24327(abstractC15689.mo28416(abstractC15689.f26587)));
        ((C10545) c4036M8087.f8849).f29199 = enumC9477;
        C23623 c23623 = this.f40356;
        AbstractC3506 c10800 = c13739 != null ? (AbstractC3506) c13739.get() : new C10800(c23623, new Predicate() { // from class: l.᩷۫֨
            @Override // java.util.function.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return C20697.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public /* synthetic */ Predicate mo55838negate() {
                return C20697.$default$negate(this);
            }

            /* JADX INFO: renamed from: or */
            public /* synthetic */ Predicate m50012or(Predicate predicate) {
                return C20697.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                InterfaceC5323 interfaceC5323M41592 = ((C18258) obj).m41592();
                C11471 c11471 = new C11471();
                c11471.f31986 = false;
                c11471.f31987 = interfaceC5323M41592;
                c11471.mo12739(abstractC7257Mo10751);
                return c11471.f31986;
            }
        });
        C4271 c4271 = this.f40366;
        InterfaceC9223 interfaceC9223M8675 = c4271.m8675(c4271.f9485);
        C7053 c7053 = new C7053(new C20271(), new C20271(), new C20271(), new C20271());
        C15099 c15099 = this.f40355;
        C7053 c7053M34504 = c15099.m34504(c7053);
        int i = c23623.f75177;
        c23623.f75177 = 0;
        try {
            this.f40365.m25939(abstractC7257Mo10751, c4036M8087, c24626);
            return abstractC7257Mo10751;
        } finally {
            c15099.m34504(c7053M34504);
            c4271.m8675(interfaceC9223M8675);
            c23623.f75177 += i;
            C3626 c3626 = c4036.f8851;
            c15492.getClass();
            new C24210(c15492, c3626.f7510).mo12739(abstractC7257Mo10751);
            c23623.m52452(c10800);
            if (c22417 != null) {
                c22417.f70719.f20100 = c22417.f70718;
            }
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static C14152 m32631(C5127 c5127) {
        C14152 c14152 = (C14152) c5127.m10905(f40353);
        return c14152 == null ? new C14152(c5127) : c14152;
    }

    /* JADX INFO: renamed from: ֫ */
    public final C15834 m32633(C15834 c15834, C4036 c4036, C24626 c24626) {
        Object objM42207;
        C20271 c20271 = new C20271();
        c20271.addAll(c15834.f45863);
        EnumC15394 enumC15394M35951 = c15834.m35951();
        EnumC15394 enumC15394 = EnumC15394.EXPRESSION;
        C18537 c18537 = this.f40357;
        if (enumC15394M35951 == enumC15394) {
            objM42207 = c18537.m42207((AbstractC14355) c15834.f45864);
        } else {
            objM42207 = (C4968) c15834.f45864;
        }
        c20271.m45777(objM42207);
        c18537.f55352 = c15834.f18924;
        C4968 c4968M42145 = c18537.m42145(0L, c20271.m45783());
        C11216 c11216 = this.f40365;
        C4036 c4036M25931 = c11216.m25931(c15834, c4036);
        Object obj = c4036M25931.f8849;
        try {
            ((C10545) obj).f29200 = c24626;
            C4968 c4968 = (C4968) m32632(c4968M42145, c4036M25931, c24626, this.f40354, null, EnumC9477.SPECULATIVE, null);
            C4848 c4848 = (C4848) C7480.stream(c4968.f11316).filter(new C5454()).map(new C4055(7)).collect(C4848.m10284());
            AbstractC7257 abstractC7257 = (AbstractC7257) c4968.f11316.last();
            if (abstractC7257.m16617(EnumC19998.f60754)) {
                abstractC7257 = ((C11813) abstractC7257).f32975;
            }
            C15834 c15834M42198 = c18537.m42198(abstractC7257, c4848);
            c11216.f31174.m23159();
            new C14607(c11216).mo12739(c15834M42198.f45864);
            this.f40360.m27686(c4036, c15834M42198, c18537, false);
            return c15834M42198;
        } finally {
            ((C10545) obj).f29201.mo28410();
        }
    }

    public C14152(C5127 c5127) {
        c5127.m10908(f40353, this);
        this.f40355 = C15099.m34493(c5127);
        this.f40365 = C11216.m25910(c5127);
        this.f40362 = C7664.m17734(c5127);
        this.f40367 = C16852.m38215(c5127);
        this.f40371 = C8005.m18541(c5127);
        this.f40361 = C15492.m35238(c5127);
        C8769 c8769M20284 = C8769.m20284(c5127);
        this.f40364 = c8769M20284;
        this.f40368 = C23663.m52629(c5127);
        this.f40356 = C23623.m52439(c5127);
        C22004.m49577(c5127);
        C18537 c18537M42139 = C18537.m42139(c5127);
        this.f40357 = c18537M42139;
        this.f40358 = C8374.m19396(c5127);
        this.f40360 = C12083.m27670(c5127);
        C9661 c9661M42194 = c18537M42139.m42194(C8200.m18988(c5127).f21725);
        c9661M42194.f18925 = AbstractC6462.f16701;
        this.f40369 = c9661M42194;
        C18318.m41754(c5127);
        this.f40366 = C4271.m8674(c5127);
        this.f40370 = new C14841(this, EnumC15511.CHECK, null, EnumC18298.f54635, c8769M20284.f23805, null, null);
        this.f40354 = new C12160(this, c18537M42139);
        this.f40363 = new C8136(this);
    }
}
